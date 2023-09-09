Feature:

  Scenario:TC01 Kullanici ders programi olusturur (US10)


  Scenario: TC02 Choose lesso bolumune olusturulan dersin geldigi gorurur
    Given  kullanici managementonschools.com sayfasina gider
    When Kullanici Login Butonuna tıklar
    Then kullanici User Name boxa tıklar
    And kullanici Password boxa tıklar
    And kullanici 3 saniye bekler
    And kullanıcı Login butonuna tıklar
    And kullanici 3 saniye bekler
    And kullanıcı Lesson Program sekmesini bulur
    And kullanici 3 saniye bekler
    And kullanıcı Lesson Program sekmesini bulur
    And kullanici 3 saniye bekler
    And Kullanici Lesson Program List te dersin eklendigini dogrulamalidir

  @tc03
  Scenario:TC03 Kullanici ders icin ogretmen atar
    Given  kullanici managementonschools.com sayfasina gider
    When Kullanici Login Butonuna tıklar
    Then kullanici User Name boxa tıklar
    And kullanici Password boxa tıklar
    And kullanici 1 saniye bekler
    And kullanıcı Login butonuna tıklar
    And kullanici 1 saniye bekler
    And kullanıcı Lesson Program sekmesini bulur
    And kullanici 1 saniye bekler
    And kullanıcı Lesson Program sekmesini bulur
    And kullanici 1 saniye bekler
    And kullanci sayfayi Choose Lesson gorunene kadar kaydirir
    And Kullanici Lesson Program sayfasinda olusturulan dersi Choose Lesson sekmesindeki klik boxunu isaretler
    And kullanici sayfayi Choose Teacher menusune kadar kaydirir
   # And kullanici Teacher menusunu tiklar
    And Kullanici Lesson Program List sayfasinin altindaki Choose Teacher menusunden 2 siradaki ismi tiklar

