
Feature: US01_Aday öğrenciler sisteme kayıt olabilmelidir

  Background:Sayfaya gidip Register sayfasina ulasma

    Given Kullanici url' e gider
    And Kullanici register bölümüne tiklar

  Scenario Outline: TC_01 Guest User Register Isim UI Pozitif Testi

    Then Kullanici name kutucuguna herhangi bir karakter iceren ve bos birakilmayan bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumlu Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name              | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | a                 | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | *                 | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | A                 | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | 0                 | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | 123               | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | A?9               | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | Abdurrahman Eren  | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | Abdurrahman Ersin | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |

        # isimlerden biri 16 digeri 17 karakterli


  Scenario Outline: TC_02 Guest User Register isim UI Negatif Test (Bosluk testi)

    Then Kullanici name kutucuguna "<name>" degeri atamaz
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      |      | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |



  Scenario Outline: TC_03 Guest User Register Soyisim Pozitif Testi

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna herhangi bir karakter iceren ve bos birakilmayan bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumlu Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname           | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | a                 | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | *                 | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | A                 | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | 0                 | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | 123               | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | A?9               | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | Abdurrahman Eren  | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | Abdurrahman Ersin | birthPlace | phone | gender | dateOfBirth | ssn | username | password |


  Scenario Outline: TC_04 Guest User Register Soyisim UI Negatif Test (Bosluk testi)

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna "<surname>" degeri atamaz
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name |         | birthPlace | phone | gender | dateOfBirth | ssn | username | password |


  Scenario Outline: TC_05 Guest User Register Birth Place Pozitif Testi

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna herhangi bir karakter iceren ve bos birakilmayan bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumlu Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace        | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | a                 | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | *                 | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | A                 | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | 0                 | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | 123               | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | A?9               | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | Abdurrahman Eren  | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | Abdurrahman Ersin | phone | gender | dateOfBirth | ssn | username | password |

  Scenario Outline: TC_06 Guest User Register Birth Place UI Negatif Test (Bosluk testi)

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna "<birthPlace>" degeri atamaz
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname |            | phone | gender | dateOfBirth | ssn | username | password |

  Scenario Outline: TC_07 Guest User Register Phone UI Sinir Deger Pozitif  Test

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna xxx-xxx-xxxx formatina uygun bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumlu Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone        | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | 123-123-4444 | gender | dateOfBirth | ssn | username | password |

  Scenario Outline: TC_08 Guest User Register Phone UI Sinir Deger Negatif Test

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna xxx-xxx-xxxx formatina uygun ama bir eksik ya da bir fazla "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir
    Examples:
      | name | surname | birthPlace | phone         | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | 22-333-4444   | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | 222-33-4444   | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | 222-333-444   | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | 1000-000-0000 | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | 499-9999-7777 | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | 987-876-87654 | gender | dateOfBirth | ssn | username | password |

  Scenario Outline: TC_09 Guest User Register Phone Format Negatif Test

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna xxx-xxx-xxxx formatina uymayan bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone        | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | 345*456*6789 | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | 365#659#3765 | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | 675\675\3655 | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | 755.366.978  | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | 345²787²373  | gender | dateOfBirth | ssn | username | password |

  Scenario Outline: TC_10 Guest User Register Phone UI Negatif Test (Bosluk testi)

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna bir "<phone>" degeri girmez
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace |       | gender | dateOfBirth | ssn | username | password |

  Scenario: TC_11 Guest User Register Gender Secilebilme  Testi

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumlu Mesaj görür
    And Sayfayi kapatir


  Scenario: TC_12 Guest User Register Gender Secilebilme Negatif Testi

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

  Scenario Outline: TC_13 Guest User Register Date of Birth UI Negatif Test (Bosluk testi)

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna "<dateOfBirth>" degeri girmez
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | phone | gender |             | ssn | username | password |



  Scenario Outline: TC_14 Guest User Register Date of Birth UI Pozitif Sinir Test (belli bir aralik)

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna 1923 - 2015 yil araliginda bir "<dateOfBirth>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumlu Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 10-25-1935  | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 03-30-1964  | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 03-05-1985  | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 01-01-1923  | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 12-12-2015  | ssn | username | password |


  Scenario Outline: TC_15 Guest User Register Date of Birth UI Negatif Sinir Test(100 yil öncesi tarih)

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna 1923'ten önce bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 09-06-1600  | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 09-06-0060  | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 09-06-0001  | ssn | username | password |

  Scenario Outline: TC_16 Guest User Register Date of Birth UI Negatif Sinir Test(Yedi yasindan kücük ve gelecek tarih)

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna 2015 yili sonrasi bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 09-06-2019  | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 09-06-2023  | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 09-07-2023  | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 09-06-2024  | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 09-06-2030   | ssn | username | password |

  Scenario Outline: TC_17 Guest User Register Date of Birth UI Pozitif Artik Yil Test

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna  1923 - 2015 yil araliginda artik yil olan bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumlu Mesaj görür
    And Sayfayi kapatir
    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 02-29-2000  | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 02-29-2004  | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 02-29-1980  | ssn | username | password |


  Scenario Outline: TC_18 Guest User Register Date of Birth UI Negatif Artik Yil Test

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna  1923 - 2015 yil araliginda artik yil olmayan bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 02-29-1970  | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 02-29-2001  | ssn | username | password |
      | name | surname | birthPlace | phone | gender | 02-29-1958  | ssn | username | password |


  Scenario Outline: TC_19 Guest User Register Ssn UI Negatif Test (Bosluk testi)

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna "<ssn>" degeri girmez
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth |     | username | password |

  Scenario Outline: TC_20 Guest User Register Ssn UI Sinir Deger Pozitif  Test

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna xxx-xx-xxxx formatina uygun bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumlu Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn         | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | 725-33-4444 | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | 825-33-4444 | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | 922-32-4444 | username | password |


  Scenario Outline: TC_20 Guest User Register Ssn UI Sinir Deger Negatif  Test

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna xxx-xx-xxxx formatina uygun ama bir eksik ya da bir fazla "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn          | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | 22-33-4444   | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | 222-3-4444   | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | 222-33-444   | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | 1000-00-0000 | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | 499-999-7777 | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | 587-87-87654 | username | password |


  Scenario Outline: TC_21 Guest User Register Ssn UI Format Negatif  Test

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna xxx-xx-xxxx formatina uymayan bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn         | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | 345/45/6789 | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | 365_59_3765 | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | 675a75a3655 | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | 755.66.9782 | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | 34528723734 | username | password |


  Scenario Outline: TC_22 Guest User Register User name UI Negatif Test (Bosluk testi)

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna "<username>" degeri girmez
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn |          | password |

  Scenario Outline: TC_23 Guest User Register User name UI Pozitif  Test

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna dört karakterli bir "<username>" girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username         | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | aaaa             | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | 1234             | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | ****             | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | mehmet hasanoglu | password |

  Scenario Outline: TC_24 Guest User Register User name UI Negatif  Test

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna dört karakterden az ya da onalti'dan fazla bir "<username>" girer
    And Kullanici password kutucuguna gecerli bir "<password>" degeri girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username          | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | a                 | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | aa                | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | aaa               | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | mehmet huseynoglu | password |


  Scenario Outline: TC_25 Guest User Register Password UI Negatif Test (Bosluk testi)

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna "<password>" degeri girmez
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username |          |


  Scenario Outline: TC_26 Guest User Register Password UI Negatif Test (Sekizden az karakter)

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna sekiz karakterden az karakterde "<password>" girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | Aa?      |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | A1?      |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | Aa1      |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | Aa12     |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | Aa123    |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | Aa1234   |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | Aa12345  |


  Scenario Outline: TC_27 Guest User Register Password UI Negatif Test (Sekiz karakter ve fazlasi)

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna en az sekiz karakterde "<password>" girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password   |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | ua?1234    |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | UA?1234    |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | ua?ABCD    |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | ua?ABCDEFG |


  Scenario Outline: TC_28 Guest User Register Password UI Pozitif Test (Sekiz karakter ve fazlasi)

    Then Kullanici name kutucuguna gecerli bir "<name>" degeri girer
    And Kullanici surname kutucuguna gecerli bir "<surname>" degeri girer
    And Kullanici birthPlace kutucuguna gecerli bir "<birthPlace>" degeri girer
    And Kullanici phone kutucuguna gecerli bir "<phone>" degeri girer
    And Kullanici "<gender>" secer
    And Kullanici dateOfBirth kutucuguna gecerli bir "<dateOfBirth>" degeri girer
    And Kullanici ssn kutucuguna gecerli bir "<ssn>" degeri girer
    And Kullanici username kutucuguna gecerli bir "<username>" degeri girer
    And Kullanici password kutucuguna en az sekiz karakterde kosullara uygun "<password>" girer
    And Kullanici Register butonuna tiklar
    And Olumsuz Mesaj görür
    And Sayfayi kapatir

    Examples:
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | password   |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | uA?1234    |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | uAa1234    |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | uAa1234    |
      | name | surname | birthPlace | phone | gender | dateOfBirth | ssn | username | uAa1234567 |