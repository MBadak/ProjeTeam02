@US23 @ALL
Feature: US23 Admin, Vice Dean Olusturma

  @US23/TC01
  Scenario Outline: TC01 Vice Dean Hesabı Oluşturma Pozitif Testi
    Given Kullanici anasayfaya gider.
    Then Kullanici Admin hesabi ile Sing in yapar
    Then Kullanici Menu botonuna tiklar
    And Kullanici Vice Dean Management tiklar
    And Kullanici tüm alanlarin bos oldugunu test eder
    Then Kullanici "<Name>" alanina gecerli bir ad girer
    And  Kullanici Name alaninin bos olmadisini test eder
    Then Kullanici "<Surname>" alanina gecerli bir surname girer
    And Kullanici Surname  alaninin bos olmadisini test eder
    Then Kullanici "<Birth Place>" alanina gecerli bir değer girer
    And Kullanici Birth Place alaninin bos olmadisini test eder
    Then Kullanici Gender seçeneginden birini seçer
    And Kullanici Gender seçeneginin bos olmasdigini test eder
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer
    And Kullanici Date Of Birth kutusunun bos olamdigini test eder
    Then Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer
    And Kullanici Phone kutusunun bos olmadigini test eder
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer
    And Kullanici Ssn kutusunun bos olmadigini test eder
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer
    And Kullanici User Name kutusunun bos olmadigini test eder
    Then Kullanici "<Password>" kutusuna büyük harf, kücük harf ve rakam iceren  en az -8- karakterli bir sifreyi girer
    And Kullanici Password kutusunun bos olmadigini test eder
    Then Kullanici Submit butonunu tiklar
    And Kullanici basarili bir sekilde Vice Dean ekledigini dogrular
    And Kullanici sayfayi kapatir

    Examples:
      | Name           | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name      | Password        |
      | ViceDeanTeam02 | Team02  | Deutschland | 01-01-1991    | 963-852-7410 | 369-87-4102 | ViceDeanTeam02 | ViceDeanTeam02. |

  @US23/TC02
  Scenario Outline: TC02 Negatif test: SSN
    Given Kullanici anasayfaya gider.
    Then Kullanici Admin hesabi ile Sing in yapar
    Then Kullanici Menu botonuna tiklar
    And Kullanici Vice Dean Management tiklar
    Then Kullanici "<Name>" alanina gecerli bir ad girer
    Then Kullanici "<Surname>" alanina gecerli bir surname girer
    Then Kullanici "<Birth Place>" alanina gecerli bir değer girer
    Then Kullanici Gender seçeneginden birini seçer
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer
    And Kullanici Date Of Birth kutusunun bos olamdigini test eder
    Then Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer
    Then Kullanici "<Password>" kutusuna büyük harf, kücük harf ve rakam iceren  en az -8- karakterli bir sifreyi girer
    Then Kullanici "<Ssn>" kutusuna - olmadan  bir SSN girer
    And Kullanici Submit butonunu tiklar
    And Kullanici Please enter valid SSN number alert uyarisi goruldugunu dogrular
    And Kullanici Ssn kutusunu siler
    Then Kullanici "<Ssn1>" kutusuna -9- karakterden fazla  bir SSN girer
    And Kullanici Submit butonunu tiklar
    And Kullanici Please enter valid SSN number alert uyarisi goruldugunu dogrular
    And Kullanici Ssn kutusunu siler
    Then Kullanici "<Ssn2>" kutusuna -9- karakterden az bir SSN girer
    And Kullanici Submit butonunu tiklar
    And Kullanici eksik karakter girdigini dorular
    And Kullanici sayfayi kapatir

    Examples:
      | Name            | Surname | Birth Place | Date Of Birth | Phone        | User Name            | Password         | Ssn         | Ssn1         | Ssn2       |
      | ViceDeanTeam02m | Team02  | Deutschland | 01-01-1991    | 963-852-0147 | ViceDeanTeam02m Name | ViceDeanTeam02m. | 369 87 7410 | 369-87-74101 | 369-87-741 |

  @US23/TC03
  Scenario Outline: TC03 Negatif TEST:Password en az 8 karakterden oluşmalıdır.
    Given Kullanici anasayfaya gider.
    Then Kullanici Admin hesabi ile Sing in yapar
    Then Kullanici Menu botonuna tiklar
    And Kullanici Vice Dean Management tiklar
    Then Kullanici "<Name>" alanina gecerli bir ad girer
    Then Kullanici "<Surname>" alanina gecerli bir surname girer
    Then Kullanici "<Birth Place>" alanina gecerli bir değer girer
    Then Kullanici Gender seçeneginden birini seçer
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer
    And Kullanici Date Of Birth kutusunun bos olamdigini test eder
    Then Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer
    Then Kullanici "<Password>" kutusuna sekiz karakterden kucuk bir sifre girer
    And Kullanici Submit butonunu tiklar
    And Kullanici password icin eksik karakter girdigini dogrular
    And Kullanici sayfayi kapatir

    Examples:
      | Name            | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name       | Password |
      | ViceDeanTeam02m | Team02  | Deutschland | 01-01-1991    | 963-852-0147 | 369-87-7410 | ViceDeanTeam02m | VD.tem2  |


  @US23/TC04
  Scenario Outline: TC04 Negatif TEST; Password büyük harf, küçük harf ve bir rakam içermelidir.
    Given Kullanici anasayfaya gider.
    Then Kullanici Admin hesabi ile Sing in yapar
    Then Kullanici Menu botonuna tiklar
    And Kullanici Vice Dean Management tiklar
    Then Kullanici "<Name>" alanina gecerli bir ad girer
    Then Kullanici "<Surname>" alanina gecerli bir surname girer
    Then Kullanici "<Birth Place>" alanina gecerli bir değer girer
    Then Kullanici Gender seçeneginden birini seçer
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer
    And Kullanici Date Of Birth kutusunun bos olamdigini test eder
    Then Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer
    Then Kullanici "<Password>" kutusuna Büyük harf kullanmadan sifre girer
    And Kullanici One uppercase character yazisini gordugunu dogrular
    And Kullanici Password kutusun siler
    Then Kullanici "<Password1>" kutusuna Kücük harf kullanmadan sifre girer
    And Kullanici One lowercase character yazisini gordugunu dogrular
    And Kullanici Password kutusun siler
    Then Kullanici "<Password2>" kutusuna rakam kullanmadan sifre girer
    And Kullanici One number yazisini gordugunu dogrular
    And Kullanici sayfayi kapatir

    Examples:
      | Name            | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name       | Password | Password1 | Password2 |
      | ViceDeanTeam02m | Team02e | Deutschland | 01-01-1991    | 963-852-0147 | 369-87-7410 | ViceDeanTeam02m | abc123., | ABC123., | abcABC., |
