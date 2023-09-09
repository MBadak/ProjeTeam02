Feature: US23 Admin, Vice Dean Olusturma

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
