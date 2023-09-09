@US06/E2E
Feature: US06 Dean, Vice Dean Olusturma

  @US06/UI
  Scenario Outline: TC03 Negatif TEST:Password en az 8 karakterden oluşmalıdır.
    Given Kullanici anasayfaya gider.
    Then Kullanici Dean hesabi ile Sing in yapar.
    Then Kullanici "<Name>" alanina gecerli bir ad girer.
    Then Kullanici "<Surname>" alanina gecerli bir surname girer.
    Then Kullanici "<Birth Place>" alanina gecerli bir değer girer.
    Then Kullanici Gender seçeneginden birini seçer.
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer.
    And Kullanici Date Of Birth kutusunun bos olamdigini test eder.
    Then Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer.
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer.
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer.
    Then Kullanici "<Password>" kutusuna sekiz karakterden kucuk bir sifre girer.
    And Kullanici Submit butonunu tiklar.
    And Kullanici password icin eksik karakter girdigini dogrular.
    And Kullanici sayfayi kapatir.

    Examples:
      | Name            | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name       | Password |
      | ViceDeanTeam02m | Team02  | Deutschland | 01-01-1991    | 963-852-0147 | 369-87-7410 | ViceDeanTeam02m | VD.tem2  |

