@U22 @ALL
Feature: US22 Admin Ekleme

  @US22/TC01
  Scenario: TC01 - Kullanici Admin olmali Positive Test
    Given Kullanici ana sayfaya gider.
    When kullanici login butonuna tiklar
    And kullanici "User Name" alanina "AdminTeam02" girer
    And kullanici Menu butonuna tiklar
    And kullanici Admin Management sekmesine tiklar
    Then kullanici "<Name>" alanina isim girer
    And kullanici "<Surname>" alanina soyisim girer
    Then kullanici "<Birth Place>" alanina doğum yeri girer
    And kullanici Gender alaninda cinsiyet secer
    And kullanici "<DateOf Birth>" alanina doğum tarihi girer
    And kullanici "<Phone>" alanina (xxx-xxx-xxxx) formatinda telefon numarasi girer
    Then kullanici "<Ssn>" alanina (xxx-xx-xxxx) formatina kimlik bilgisi girer
    And kullanici "<User Name>" alanina kullanici adi girer
    And kullanici "<Password>" alanina pasword girer
    And kullanici Submit alanini tiklar.
    And kullanici admin eklendiğini doğrular


    @US22/TC02
  Scenario: TC02 - Kullanici Admin olmali Negative Test
    Given Kullanici ana sayfaya gider.
    When kullanici login butonuna tiklar
    And kullanici "User Name" alanina "AdminTeam02" girer
    And kullanici Menu butonuna tiklar
    And kullanici Admin Management sekmesine tiklar
    And kullanici "<Name>" alanina isim girmez
    And kullanici "<Surname>" alanina soyisim girer
    And kullanici "<Birth Place>" alanina doğum yeri girer
    And kullanici Gender alaninda cinsiyet seçmez
    And kullanici "<DateOf Birth>" alanina doğum tarihi girer
    And kullanici "<Phone>" alanina telefon numarasi girer
    And kullanici "<Ssn>" alanina kimlik bilgisi girer
    And kullanici "<User Name>" alanina kullanici adi girer
    And kullanici "<Password>" alanina 7 karakterli password girer
    And kullanici Submit alanini tiklar.
    And kullanici admin eklenmediğini doğrular
