Feature:
@htm
  Scenario: TC01 Kullanici Ders seçer
    Given  kullanici managementonschools.com sayfasina gider
    When Kullanici Login Butonuna tıklar
    Then kullanici User Name boxa tıklar
    And kullanici Password boxa tıklar
    And kullanici 2 saniye bekler
    And kullanıcı Login butonuna tıklar
    And kullanici 2 saniye bekler
    And kullanıcı Lesson Program sekmesini bulur
    And kullanici 2 saniye bekler
    And kullanıcı Choose Lessons menusunu tıklar
    And kullanici 2 saniye bekler
    And kullanıcı Choose Lessons menusunden ilk siradaki dersi secer
    And kullanici 2 saniye bekler
    And kullanici Choose Education Term sekmesini tiklar
    And kullanici 2 saniye bekler
    And kullanici Choose Education Term sekmesinden ikinci secenegi secer
    And kullanici 2 saniye bekler
    And kullanici Choose Day menusunden 2. secenegi secer
    And kullanici 2 saniye bekler
    And kullanici Start Time menusune saat girer
    And kullanici 2 saniye bekler
    And kullanici Stop Time menusune saat girer
   # And kullanici bilgileri submit yapar