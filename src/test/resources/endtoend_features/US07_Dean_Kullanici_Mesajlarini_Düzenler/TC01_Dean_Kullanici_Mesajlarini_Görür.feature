Feature: Dean Kullanici MesajlariniOkur/Siler


  Scenario: Dean Kullanici Mesajlarini Görür

    Given Kullanici anasayfaya gider.
    Then Kullanici Dean hesabi ile Sing in yapar.
    And Kullanici Menu botonuna  tiklar.
    Then Kullanici  acilan sol pencereden Contact Get All yazisina  tiklar.
    And Kullanici Name basligi altinda gönderici isimlerini gordugunu dogrular.
    And Kullanici Email basligi altinda gönderici Email adreslerini gordugunu dogrular.
    And Kullanici Date basligi altinda mesaj tarihlerini gordugunu dogrular.
    And Kullanici Subject basligi altindaki bilgileri gordugunu dogrular.
    And Kullanici Message basligi altindaki mesajlari gordugunu dogrular.
    And Kullanici sayfayi kapatir.
