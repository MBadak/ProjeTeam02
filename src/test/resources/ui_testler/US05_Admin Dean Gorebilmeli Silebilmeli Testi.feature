@us05
Feature: US05_Admin Dean Gorebilmeli Silebilmeli Testi
  Background:
    Given kullanici "managementonschools" sayfasına gider.
    When Kullanici Login olur.
    And kullanıcı Menu butonuna tıklar.
    And kullanıcı  Dean Management butonunu tiklar.

 Scenario Outline: TC01 Admin Dean Gorebilmeli

   And kullanici name kutusuna "<name>" girer.
   And kullanici surname kutusuna "<surname>" girer.
   And kullanici birtplace kutusuna "<birth place>" girer.
   And kullanici gender bolumunden "<gender>" secer.
   And kullanici dogum tarihi kutusuna "<dogum tarihi>" girer.
   And kullanici phone number kutusuna "<phone number>" girer.
   And kullanici ssn kutusuna istenen formatta "<ssn>" girer.
   And kullanici username kutusuna "<username>" girer.
   And kullanici "<password>" kutusuna büyük harf, kücük harf, rakam ve en az sekiz karekterden olusan password girer.
   And kullanici submit butonuna tiklar.
   And kullanici Dean List gorundugunu dogrular.

   Examples:
     | name | surname | birth place | gender | dogum tarihi | phone number |     ssn   | username | password |
     |Vera  | Hank    |Amsterdam   |  female  | 04.04.1994  | 532-000-1111 |324-24-2424| VeraHank  |Vera1hank |

   Scenario: TC02 Admin Deanleri silebillmeli
     #Silme butonu yok

   Scenario:TC03 Admin Dean Guncelleyebilmeli

     And kullanici deanList teki bir sonraki sayfaya gider.
     And kullanici onbirinci satirdaki deani dogrular.
     And kullanici onbirinci satirdaki edit butonuna tiklar.
     And kullanici Edit Dean sayfasindan verileri gunceller
     And kullanici Edit Dean Submit butonuna tiklar.
     And kullanici DeanUpdateSuccessfully uyarisini gordugunu dogrular
     And kullanici sayfayi kapatir.
