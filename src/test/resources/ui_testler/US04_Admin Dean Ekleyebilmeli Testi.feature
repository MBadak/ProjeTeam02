@us04
Feature: US04_Admin Dean Ekleyebilmeli Testi
  Background:
    Given kullanici "https://managementonschools.com" sayfasına gider
    When Kullanici Login olur
    And kullanıcı Menu butonuna tıklar
    And kullanıcı  Dean Management butonunu tiklar

  Scenario Outline:TC01 Dean Hesabi Olusturma Pozitif Testi
  And kullanici hicbir giris yapmadan submit butonuna tiklar
  And kullanici tum alanlarin bos oldugunu dogrular
  And kullanici name kutusuna "<name>" girer
  And kullanici name kutusunun bos olmadigini test eder
  And kullanici surname kutusuna "<surname>" girer
  And kullanici surname kutusunun bos olmadigini test eder
  And kullanici birtplace kutusuna "<birth place>" girer
  And kullanici birthplace kutusunun bos olmadigini test eder
  And kullanici gender bolumunden "<gender>" secer
  And kullanici gender sectigini test eder
  And kullanici dogum tarihi kutusuna "<dogum tarihi>" girer
  And kullanici dogum tarihi kutusunun bos olmadigini test eder
  And kullanici phone number kutusuna "<phone number>" girer
  And kullanici phone number kutusunun bos olmadigini test eder
  And kullanici ssn kutusuna istenen formatta "<ssn>" girer
  And kullanici ssn kutusunun bos olmadigini test eder
  And kullanici username kutusuna "<username>" girer
  And kullanici username kutusunun bos olmadigini test eder
  And kullanici "<password>" kutusuna büyük harf, kücük harf, rakam ve en az sekiz karekterden olusan password girer
  And kullanici password kutusunun bos olmadigini test eder
  And kullanici submit butonuna tiklar
  And kullanici basarili bir sekilde Dean ekledigini dogrular.

    Examples:
      | name | surname | birth place | gender | dogum tarihi | phone number |     ssn   | username | password |
      |Vera  | Hank    |Amsterdam   |  female  | 04.04.1994  | 532-000-1111 |324-24-2424| VeraHank  |Vera1hank |

  Scenario Outline:TC02 Dean Hesabi Format Disi ssn girme testi
    And kullanici name kutusuna "<name>" girer
    And kullanici surname kutusuna "<surname>" girer
    And kullanici birtplace kutusuna "<birth place>" girer
    And kullanici gender bolumunden "<gender>" secer
    And kullanici dogum tarihi kutusuna "<dogum tarihi>" girer
    And kullanici phone number kutusuna "<phone number>" girer
    And kullanici ssn kutusuna yanlis formatta "<ssn>" girer
    And kullanici username kutusuna "<username>" girer
    And kullanici "<password>" kutusuna büyük harf, kücük harf, rakam ve en az sekiz karekterden olusan password girer
    And kullanici submit butonuna tiklar
    And kullanici dogru formatta ssn gir ikazini gorur

    Examples:
      | name | surname | birth place | gender | dogum tarihi | phone number |     ssn   | username | password |
      |Vera  | Hank    |Amsterdam   |  female  | 04.04.1994  | 532-000-1111 |324 24 2424| VeraHank  |Vera1hank |

  Scenario Outline:TC03 Dean Hesabi Buyuk harf kullanmadan password girme testi
    And kullanici name kutusuna "<name>" girer
    And kullanici surname kutusuna "<surname>" girer
    And kullanici birtplace kutusuna "<birth place>" girer
    And kullanici gender bolumunden "<gender>" secer
    And kullanici dogum tarihi kutusuna "<dogum tarihi>" girer
    And kullanici phone number kutusuna "<phone number>" girer
    And kullanici ssn kutusuna istenen formatta "<ssn>" girer
    And kullanici username kutusuna "<username>" girer
    And kullanici "<password1>" kutusuna BUYUK HARF kullanmadan bir sifre girer
    And kullanici submit butonuna tiklar
    And kullanici One uppercase character ikazini gorur

    Examples:
      | name | surname | birth place | gender | dogum tarihi | phone number |     ssn   | username | password1|
      |Vera  | Hank    |Amsterdam   |  female  | 04.04.1994  | 532-000-1111 |324-24-2424| VeraHank  |vera1hank |

  Scenario Outline:TC04 Dean Hesabi Kucuk harf kullanmadan password girme testi
    And kullanici name kutusuna "<name>" girer
    And kullanici surname kutusuna "<surname>" girer
    And kullanici birtplace kutusuna "<birth place>" girer
    And kullanici gender bolumunden "<gender>" secer
    And kullanici dogum tarihi kutusuna "<dogum tarihi>" girer
    And kullanici phone number kutusuna "<phone number>" girer
    And kullanici ssn kutusuna istenen formatta "<ssn>" girer
    And kullanici username kutusuna "<username>" girer
    And kullanici "<password2>" kutusuna KUCUK HARF kullanmadan bir sifre girer
    And kullanici submit butonuna tiklar
    And kullanici One lowercase character ikazini gorur

    Examples:
      | name | surname | birth place | gender | dogum tarihi | phone number |     ssn   | username | password2 |
      |Vera  | Hank    |Amsterdam   |  female  | 04.04.1994  | 532-000-1111 |324-24-2424| VeraHank  |VERA1HANK |

  Scenario Outline:TC05 Dean Hesabi Rakam kullanmadan password girme testi
    And kullanici name kutusuna "<name>" girer
    And kullanici surname kutusuna "<surname>" girer
    And kullanici birtplace kutusuna "<birth place>" girer
    And kullanici gender bolumunden "<gender>" secer
    And kullanici dogum tarihi kutusuna "<dogum tarihi>" girer
    And kullanici phone number kutusuna "<phone number>" girer
    And kullanici ssn kutusuna istenen formatta "<ssn>" girer
    And kullanici username kutusuna "<username>" girer
    And kullanici "<password3>" kutusuna RAKAM kullanmadan bir sifre girer
    And kullanici submit butonuna tiklar
    And kullanici One number ikazini gorur
    And kullanici sayfayi kapatir
    Examples:
      | name | surname | birth place | gender | dogum tarihi | phone number |     ssn   | username | password3 |
      |Vera  | Hank    |Amsterdam   |  female  | 04.04.1994  | 532-000-1111 |324-24-2424| VeraHank  |VERAhank |

