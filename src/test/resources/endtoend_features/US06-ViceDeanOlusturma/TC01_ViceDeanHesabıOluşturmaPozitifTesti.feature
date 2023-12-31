@US06E2E
Feature: US06 Dean, Vice Dean Olusturma


  Scenario Outline: TC01 Vice Dean Hesabı Oluşturma Pozitif Testi
    Given Kullanici anasayfaya gider.
    Then Kullanici Dean hesabi ile Sing in yapar.
    And Kullanici tüm alanlarin bos oldugunu test eder.
    Then Kullanici "<Name>" alanina gecerli bir ad girer.
    And  Kullanici Name alaninin bos olmadisini test eder.
    Then Kullanici "<Surname>" alanina gecerli bir surname girer.
    And Kullanici Surname  alaninin bos olmadisini test eder.
    Then Kullanici "<Birth Place>" alanina gecerli bir değer girer.
    And Kullanici Birth Place alaninin bos olmadisini test eder.
    Then Kullanici Gender seçeneginden birini seçer.
    And Kullanici Gender seçeneginin bos olmasdigini test eder.
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer.
    And Kullanici Date Of Birth kutusunun bos olamdigini test eder.
    Then Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer.
    And Kullanici Phone kutusunun bos olmadigini test eder.
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer.
    And Kullanici Ssn kutusunun bos olmadigini test eder.
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer.
    And Kullanici User Name kutusunun bos olmadigini test eder.
    Then Kullanici "<Password>" kutusuna büyük harf, kücük harf ve rakam iceren  en az -8- karakterli bir sifreyi girer.
    And Kullanici Password kutusunun bos olmadigini test eder.
    Then Kullanici Submit butonunu tiklar.

    And Kullanici sayfayi kapatir.


    Examples:
      | Name           | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name      | Password        |
      | ViceDeanTeam02 | Team02  | Deutschland | 01-01-1991    | 963-852-7410 | 369-87-4102 | ViceDeanTeam02 | ViceDeanTeam02. |

  @US06API
  Scenario: US06/TC01_API_Kayit_sirasinda_gonderilen_veriler_dogrulanir
    Given Kayitli Vece Deanin userId bilgisi alinir
    And Kayitli Vice Dean userId ile cagrilir
    Then Vice Dean bilgileri dogrulanir
    And Kayitli dean silinir

