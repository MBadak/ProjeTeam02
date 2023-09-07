Feature: Dean Kullanici MesajlariniOkur/Siler

  Scenario: Dean Kullanici Mesajlarini Siler

    Given Kullanici anasayfaya gider.
    Then Kullanici Dean hesabi ile Sing in yapar.
    And Kullanici Menu botonuna  tiklar.
    Then Kullanici  acilan sol pencereden Contact Get All yazisina  tiklar.
    And Kullanici silme butonunu gordugunu dogrular.
    And Kullanici silme butonuna tiklar
    And Kullanici sayfayi kapatir.