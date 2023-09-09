Feature:US15_Vice_Dean_öğrenci_oluştura_Testi

  @US15_TC01
  Scenario: TC01 Student Danisman Ogretmeni Secilmeli..
    Given Kullanici_okul_sayfasina_gider..
    Then Kullanici_Login_butonuna_tiklar..
    When Kullanici ViceDeanhesabi ile Sing in yapar..
    When Kullanici_Menua_tiklar..
    And Kullanici_Student_Management_tiklar..
    And Kullanici tum alanlarin bos oldugunu test eder..
    And Kullanici_Choose_Teacher_yapar..


  @US15_TC02
  Scenario Outline: TC02 Name girilmelidir bos birakilamaz
    Given Kullanici_okul_sayfasina_gider..
    Then Kullanici_Login_butonuna_tiklar..
    When Kullanici ViceDeanhesabi ile Sing in yapar..
    When Kullanici_Menua_tiklar..
    And Kullanici_Student_Management_tiklar..
    And Kullanici tum alanlarin bos oldugunu test eder..
    And Kullanici_Choose_Teacher_yapar..
    Then Kullanici "<surname>" alanina gecerli bir surname girer..
    And  Kullanici surName alaninin bos olmadigini test eder..
    Then Kullanici "<Birth Place>" alanina gecerli bir birthplace girer..
    And Kullanici Birth Place alaninin bos olmadigini test eder..
    Then Kullanici "<Email>" alanina gecerli bir email girer..
    And Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer..
    Then Kullanici Gender_e_datayi_girer..
    And Kullanici Gender seçeneginin bos olmadigini test eder..
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer..
    And Kullanici Date Of Birth kutusunun bos olmadigini test eder..
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer..
    And Kullanici Ssn kutusunun bos olmadigini test eder..
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer..
    And Kullanici User Name kutusunun bos olmadigini test eder..
    Then Kullanici "<father name>" kutusuna gecerli bir fathername girer..
    And Kullanici father name kutusunun bos olmadigini test eder..
    Then Kullanici"<mother name>"kutusuna gecerli bir mothername girer..
    And Kullanici mother name kutusunun bos olmadigini test eder..
    Then Kullanici "<Password>" kutusuna buyuk harf kucuk harf ve rakam iceren en az 8 karakterli bir sifreyi girer..
    And Kullanici Password kutusunun bos olmadigini test eder..
    Then Kullanici submit e tiklar..
    And Kullanici Name in altinda Required yazisini gorur..
    Then Kullanici "<Name>" alanina gecerli bir ad girer..
    And Kullanici Name alaninin bos olmadigini test eder..

    Examples:
      | surname | Birth Place | Email            | Phone        | Date Of Birth | Ssn         | User Name      | father name | mother name | Password        | Name      |
      | Team02  | Turkey      | Arife3@gmail.com | 963-852-9411 | 01-01-1997    | 369-87-4102 | ViceDeanTeam02 | father nam  | mother_nam  | ViceDeanTeam02. | Project10 |


  @US15_TC03
  Scenario Outline: TC03 Surname girilmelidir Bos birakilamaz
    Given Kullanici_okul_sayfasina_gider..
    Then Kullanici_Login_butonuna_tiklar..
    When Kullanici ViceDeanhesabi ile Sing in yapar..
    When Kullanici_Menua_tiklar..
    And Kullanici_Student_Management_tiklar..
    And Kullanici tum alanlarin bos oldugunu test eder..
    And Kullanici_Choose_Teacher_yapar..
    Then Kullanici "<Name>" alanina gecerli bir ad girer..
    And Kullanici Name alaninin bos olmadigini test eder..
    Then Kullanici "<Birth Place>" alanina gecerli bir birthplace girer..
    And Kullanici Birth Place alaninin bos olmadigini test eder..
    Then Kullanici "<Email>" alanina gecerli bir email girer..
    And Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer..
    Then Kullanici Gender_e_datayi_girer..
    And Kullanici Gender seçeneginin bos olmadigini test eder..
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer..
    And Kullanici Date Of Birth kutusunun bos olmadigini test eder..
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer..
    And Kullanici Ssn kutusunun bos olmadigini test eder..
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer..
    And Kullanici User Name kutusunun bos olmadigini test eder..
    Then Kullanici "<father name>" kutusuna gecerli bir fathername girer..
    And Kullanici father name kutusunun bos olmadigini test eder..
    Then Kullanici"<mother name>"kutusuna gecerli bir mothername girer..
    And Kullanici mother name kutusunun bos olmadigini test eder..
    Then Kullanici "<Password>" kutusuna buyuk harf kucuk harf ve rakam iceren en az 8 karakterli bir sifreyi girer..
    And Kullanici Password kutusunun bos olmadigini test eder..
    Then Kullanici submit e tiklar..
    And Kullanici surname in altinda Required yazisini gorur..
    Then Kullanici "<surname>" alanina gecerli bir surname girer..
    And Kullanici surName alaninin bos olmadigini test eder..

    Examples:
      | Name      | surname | Birth Place | Email            | Phone        | Date Of Birth | Ssn         | User Name      | father name | mother name | Password        |
      | Project10 | Team02  | Turkey      | Arife4@gmail.com | 963-952-7418 | 01-01-1992    | 369-99-4102 | ViceDeanTeam02 | father na   | mother na   | ViceDeanTeam02. |


  @US15_TC04
  Scenario Outline: TC04 "Birth Place" girilmelidir Bos birakilamaz
    Given Kullanici_okul_sayfasina_gider..
    Then Kullanici_Login_butonuna_tiklar..
    When Kullanici ViceDeanhesabi ile Sing in yapar..
    When Kullanici_Menua_tiklar..
    And Kullanici_Student_Management_tiklar..
    And Kullanici tum alanlarin bos oldugunu test eder..
    And Kullanici_Choose_Teacher_yapar..
    Then Kullanici "<Name>" alanina gecerli bir ad girer..
    And Kullanici Name alaninin bos olmadigini test eder..
    Then Kullanici "<surname>" alanina gecerli bir surname girer..
    And Kullanici surName alaninin bos olmadigini test eder..
    Then Kullanici "<Email>" alanina gecerli bir email girer..
    And Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer..
    Then Kullanici Gender_e_datayi_girer..
    And Kullanici Gender seçeneginin bos olmadigini test eder..
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer..
    And Kullanici Date Of Birth kutusunun bos olmadigini test eder..
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer..
    And Kullanici Ssn kutusunun bos olmadigini test eder..
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer..
    And Kullanici User Name kutusunun bos olmadigini test eder..
    Then Kullanici "<father name>" kutusuna gecerli bir fathername girer..
    And Kullanici father name kutusunun bos olmadigini test eder..
    Then Kullanici"<mother name>"kutusuna gecerli bir mothername girer..
    And Kullanici mother name kutusunun bos olmadigini test eder..
    Then Kullanici "<Password>" kutusuna buyuk harf kucuk harf ve rakam iceren en az 8 karakterli bir sifreyi girer..
    And Kullanici Password kutusunun bos olmadigini test eder..
    Then Kullanici submit e tiklar..
    And Kullanici birthplace in altinda Required yazisini gorur..
    Then Kullanici "<Birth Place>" alanina gecerli bir birthplace girer..
    And Kullanici Birth Place alaninin bos olmadigini test eder..

    Examples:
      | Name      | surname | Birth Place | Email            | Phone        | Date Of Birth | Ssn         | User Name      | father name | mother name | Password        |
      | Project10 | Team02  | Turkey      | Arife5@gmail.com | 963-958-7410 | 01-01-1992    | 369-97-4902 | ViceDeanTeam02 | father n    | mother n    | ViceDeanTeam02. |


  @US15_TC05
  Scenario Outline: TC05 E-mail girilmelidir Bos birakilamaz
    Given Kullanici_okul_sayfasina_gider..
    Then Kullanici_Login_butonuna_tiklar..
    When Kullanici ViceDeanhesabi ile Sing in yapar..
    When Kullanici_Menua_tiklar..
    And Kullanici_Student_Management_tiklar..
    And Kullanici tum alanlarin bos oldugunu test eder..
    And Kullanici_Choose_Teacher_yapar..
    Then Kullanici "<Name>" alanina gecerli bir ad girer..
    And  Kullanici Name alaninin bos olmadigini test eder..
    Then Kullanici "<surname>" alanina gecerli bir surname girer..
    Then Kullanici "<Birth Place>" alanina gecerli bir birthplace girer..
    And Kullanici Birth Place alaninin bos olmadigini test eder..
    And Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer..
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer..
    And Kullanici Date Of Birth kutusunun bos olmadigini test eder..
    Then Kullanici Gender_e_datayi_girer..
    And Kullanici Gender seçeneginin bos olmadigini test eder..
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer..
    And Kullanici Ssn kutusunun bos olmadigini test eder..
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer..
    And Kullanici User Name kutusunun bos olmadigini test eder..
    Then Kullanici "<father name>" kutusuna gecerli bir fathername girer..
    And Kullanici father name kutusunun bos olmadigini test eder..
    Then Kullanici"<mother name>"kutusuna gecerli bir mothername girer..
    And Kullanici mother name kutusunun bos olmadigini test eder..
    Then Kullanici "<Password>" kutusuna buyuk harf kucuk harf ve rakam iceren en az 8 karakterli bir sifreyi girer..
    And Kullanici Password kutusunun bos olmadigini test eder..
    Then Kullanici submit e tiklar..
    And Kullanici Email in altinda Required yazisini gorur..
    Then Kullanici "<Email>" alanina gecerli bir email girer..
    And Kullanici Email alaninin bos olmadigini test eder..

    Examples:
      | Name      | surname | Birth Place | Email            | Phone        | Date Of Birth | Ssn         | User Name      | father name | mother name | Password        |
      | Project10 | Team02  | Turkey      | Arife6@gmail.com | 963-952-7416 | 01-01-1992    | 369-97-4182 | ViceDeanTeam02 | father name | mother name | ViceDeanTeam02. |



  @US15_TC06
  Scenario Outline: TC06 Telefon numarası girilmelidir Bos birakilamaz
    Given Kullanici_okul_sayfasina_gider..
    Then Kullanici_Login_butonuna_tiklar..
    When Kullanici ViceDeanhesabi ile Sing in yapar..
    When Kullanici_Menua_tiklar..
    And Kullanici_Student_Management_tiklar..
    And Kullanici tum alanlarin bos oldugunu test eder..
    And Kullanici_Choose_Teacher_yapar..
    Then Kullanici "<Name>" alanina gecerli bir ad girer..
    And Kullanici Name alaninin bos olmadigini test eder..
    Then Kullanici "<surname>" alanina gecerli bir surname girer..
    Then Kullanici "<Birth Place>" alanina gecerli bir birthplace girer..
    And Kullanici Birth Place alaninin bos olmadigini test eder..
    Then Kullanici "<Email>" alanina gecerli bir email girer..
    And Kullanici Email alaninin bos olmadigini test eder..
    Then Kullanici Gender_e_datayi_girer..
    And Kullanici Gender seçeneginin bos olmadigini test eder..
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer..
    And Kullanici Date Of Birth kutusunun bos olmadigini test eder..
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer..
    And Kullanici Ssn kutusunun bos olmadigini test eder..
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer..
    And Kullanici User Name kutusunun bos olmadigini test eder..
    Then Kullanici "<father name>" kutusuna gecerli bir fathername girer..
    And Kullanici father name kutusunun bos olmadigini test eder..
    Then Kullanici"<mother name>"kutusuna gecerli bir mothername girer..
    And Kullanici mother name kutusunun bos olmadigini test eder..
    Then Kullanici "<Password>" kutusuna buyuk harf kucuk harf ve rakam iceren en az 8 karakterli bir sifreyi girer..
    And Kullanici Password kutusunun bos olmadigini test eder..
    Then Kullanici submit e tiklar..
    And Kullanici Telefon numarası in altinda Required yazisini gorur..
    And Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer..
    And Kullanici Phone kutusunun bos olmadigini test eder..
    Then Kullanici Phone kutusuna 12 karekterden az sayi girince Minimum 12 character uyarisini gorur..

    Examples:
      | Name      | surname | Birth Place | Email            | Phone        | Date Of Birth | Ssn         | User Name      | father name | mother name | Password        |
      | Project10 | Team02  | Turkey      | Arife7@gmail.com | 963-952-7410 | 01-01-1992    | 369-97-4102 | ViceDeanTeam02 | father name | mother name | ViceDeanTeam02. |


  @US15_TC07
  Scenario Outline: TC07 Cinsiyet secilmelidir Bos birakilamaz
    Given Kullanici_okul_sayfasina_gider..
    Then Kullanici_Login_butonuna_tiklar..
    When Kullanici ViceDeanhesabi ile Sing in yapar..
    When Kullanici_Menua_tiklar..
    And Kullanici_Student_Management_tiklar..
    And Kullanici tum alanlarin bos oldugunu test eder..
    And Kullanici_Choose_Teacher_yapar..
    Then Kullanici "<Name>" alanina gecerli bir ad girer..
    And  Kullanici Name alaninin bos olmadigini test eder..
    Then Kullanici "<surname>" alanina gecerli bir surname girer..
    Then Kullanici "<Birth Place>" alanina gecerli bir birthplace girer..
    And Kullanici Birth Place alaninin bos olmadigini test eder..
    Then Kullanici "<Email>" alanina gecerli bir email girer..
    And Kullanici Email alaninin bos olmadigini test eder..
    And Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer..
    And Kullanici Phone kutusunun bos olmadigini test eder..
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer..
    And Kullanici Date Of Birth kutusunun bos olmadigini test eder..
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer..
    And Kullanici Ssn kutusunun bos olmadigini test eder..
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer..
    And Kullanici User Name kutusunun bos olmadigini test eder..
    Then Kullanici "<father name>" kutusuna gecerli bir fathername girer..
    And Kullanici father name kutusunun bos olmadigini test eder..
    Then Kullanici"<mother name>"kutusuna gecerli bir mothername girer..
    And Kullanici mother name kutusunun bos olmadigini test eder..
    Then Kullanici "<Password>" kutusuna buyuk harf kucuk harf ve rakam iceren en az 8 karakterli bir sifreyi girer..
    And Kullanici Password kutusunun bos olmadigini test eder..
    Then Kullanici submit e tiklar..
    Then Kullanıci You have entered an invalid value Valid values are MALE FEMALE uyarısını gorur..
    Then Kullanici Gender_e_datayi_girer..
    And Kullanici Gender seçeneginin bos olmadigini test eder..

    Examples:
      | Name      | surname | Birth Place | Email            | Phone        | Date Of Birth | Ssn         | User Name      | father name | mother name | Password        |
      | Project10 | Team02  | Turkey      | Arife8@gmail.com | 963-952-7410 | 01-01-1992    | 369-97-4102 | ViceDeanTeam02 | father name | mother name | ViceDeanTeam02. |

  @US15_TC08
  Scenario Outline: TC08 Dogum tarihi girilmelidir Bos birakilamaz
    Given Kullanici_okul_sayfasina_gider..
    Then Kullanici_Login_butonuna_tiklar..
    When Kullanici ViceDeanhesabi ile Sing in yapar..
    When Kullanici_Menua_tiklar..
    And Kullanici_Student_Management_tiklar..
    And Kullanici tum alanlarin bos oldugunu test eder..
    And Kullanici_Choose_Teacher_yapar..
    Then Kullanici "<Name>" alanina gecerli bir ad girer..
    And  Kullanici Name alaninin bos olmadigini test eder..
    Then Kullanici "<surname>" alanina gecerli bir surname girer..
    Then Kullanici "<Birth Place>" alanina gecerli bir birthplace girer..
    And Kullanici Birth Place alaninin bos olmadigini test eder..
    Then Kullanici "<Email>" alanina gecerli bir email girer..
    And Kullanici Email alaninin bos olmadigini test eder..
    And Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer..
    And Kullanici Phone kutusunun bos olmadigini test eder..
    Then Kullanici Gender_e_datayi_girer..
    And Kullanici Gender seçeneginin bos olmadigini test eder..
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer..
    And Kullanici Ssn kutusunun bos olmadigini test eder..
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer..
    And Kullanici User Name kutusunun bos olmadigini test eder..
    Then Kullanici "<father name>" kutusuna gecerli bir fathername girer..
    And Kullanici father name kutusunun bos olmadigini test eder..
    Then Kullanici"<mother name>"kutusuna gecerli bir mothername girer..
    And Kullanici mother name kutusunun bos olmadigini test eder..
    Then Kullanici "<Password>" kutusuna buyuk harf kucuk harf ve rakam iceren en az 8 karakterli bir sifreyi girer..
    And Kullanici Password kutusunun bos olmadigini test eder..
    Then Kullanici submit e tiklar..
    And  Kullanici Dogum Tarihi in altinda Required yazisini gorur..
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer..
    And Kullanici Date Of Birth kutusunun bos olmadigini test eder..

    Examples:
      | Name      | surname | Birth Place | Email            | Phone        | Date Of Birth | Ssn         | User Name      | father name | mother name | Password        |
      | Project10 | Team02  | Turkey      | Arife9@gmail.com | 963-952-7410 | 01-01-1992    | 369-97-4102 | ViceDeanTeam02 | father name | mother name | ViceDeanTeam02. |


  @US15_TC09
  Scenario Outline: TC09 Negativ Test SSN
    Given Kullanici_okul_sayfasina_gider..
    Then Kullanici_Login_butonuna_tiklar..
    When Kullanici ViceDeanhesabi ile Sing in yapar..
    When Kullanici_Menua_tiklar..
    And Kullanici_Student_Management_tiklar..
    And Kullanici tum alanlarin bos oldugunu test eder..
    And Kullanici_Choose_Teacher_yapar..
    Then Kullanici "<Name>" alanina gecerli bir ad girer..
    And  Kullanici Name alaninin bos olmadigini test eder..
    Then Kullanici "<surname>" alanina gecerli bir surname girer..
    Then Kullanici "<Birth Place>" alanina gecerli bir birthplace girer..
    And Kullanici Birth Place alaninin bos olmadigini test eder..
    Then Kullanici "<Email>" alanina gecerli bir email girer..
    And Kullanici Email alaninin bos olmadigini test eder..
    And Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer..
    And Kullanici Phone kutusunun bos olmadigini test eder..
    Then Kullanici Gender_e_datayi_girer..
    And Kullanici Gender seçeneginin bos olmadigini test eder..
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer..
    And Kullanici Date Of Birth kutusunun bos olmadigini test eder..
    And Kullanici SSN bolunume 3 ve 5 rakamdan sonra - icermeyen ve 9 rakamdan olusan numarayi girir..
    And Kullanici Ssn kutusunun bos olmadigini test eder..
    Then Kullanici Please enter Minimum 11 character yazisini goruldugunu dogrular..
    And Kullanici Ssn kutusunu siler..
    Then Kullanici Ssn kutusuna 9 karakterden az bir SSN girer..
    Then Kullanici Please enter Minimum 11 character yazisini goruldugunu dogrular..
    And Kullanici Ssn kutusunu siler..
    Then Kullanici Ssn kutusuna 9 karakterden fazla  bir SSN girer..
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer..
    And Kullanici User Name kutusunun bos olmadigini test eder..
    Then Kullanici "<father name>" kutusuna gecerli bir fathername girer..
    And Kullanici father name kutusunun bos olmadigini test eder..
    Then Kullanici"<mother name>"kutusuna gecerli bir mothername girer..
    And Kullanici mother name kutusunun bos olmadigini test eder..
    Then Kullanici "<Password>" kutusuna buyuk harf kucuk harf ve rakam iceren en az 8 karakterli bir sifreyi girer..
    Then Kullanici submit e tiklar..
    And Kullanici Please enter valid SSN number alert uyarisi goruldugunu dogrular..
    And Kullanici Ssn kutusunu siler..
    And Kullanici Ssn kutusuna gecerli bir SSN girer..
    Then Kullanici submit e tiklar..
    And Kullanici Student save succesfully uyarisini gorur..

    Examples:
      | Name      | surname | Birth Place | Email           | Phone        | Date Of Birth | Ssn         | User Name    | father name | mother name | Password        |
      | Project10 | Team02  | Turkey      | Arif9@gmail.com | 963-972-7118 | 01-01-1992    | 123-97-4152 | ViceDeanTeam | fathername  | mothername  | ViceDeanTeam02. |


  @US15_TC10
  Scenario Outline: TC10 User Name girilmelidir Bos birakilamaz
    Given Kullanici_okul_sayfasina_gider..
    Then Kullanici_Login_butonuna_tiklar..
    When Kullanici ViceDeanhesabi ile Sing in yapar..
    When Kullanici_Menua_tiklar..
    And Kullanici_Student_Management_tiklar..
    And Kullanici tum alanlarin bos oldugunu test eder..
    And Kullanici_Choose_Teacher_yapar..
    Then Kullanici "<Name>" alanina gecerli bir ad girer..
    And  Kullanici Name alaninin bos olmadigini test eder..
    Then Kullanici "<surname>" alanina gecerli bir surname girer..
    Then Kullanici "<Birth Place>" alanina gecerli bir birthplace girer..
    And Kullanici Birth Place alaninin bos olmadigini test eder..
    Then Kullanici "<Email>" alanina gecerli bir email girer..
    And Kullanici Email alaninin bos olmadigini test eder..
    And Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer..
    And Kullanici Phone kutusunun bos olmadigini test eder..
    Then Kullanici Gender_e_datayi_girer..
    And Kullanici Gender seçeneginin bos olmadigini test eder..
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer..
    And Kullanici Date Of Birth kutusunun bos olmadigini test eder..
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer..
    And Kullanici Ssn kutusunun bos olmadigini test eder..
    Then Kullanici "<father name>" kutusuna gecerli bir fathername girer..
    And Kullanici father name kutusunun bos olmadigini test eder..
    Then Kullanici"<mother name>"kutusuna gecerli bir mothername girer..
    And Kullanici mother name kutusunun bos olmadigini test eder..
    Then Kullanici "<Password>" kutusuna buyuk harf kucuk harf ve rakam iceren en az 8 karakterli bir sifreyi girer..
    And Kullanici Password kutusunun bos olmadigini test eder..
    Then Kullanici submit e tiklar..
    Then Kullanici User Name in altında Required yazisini gorur..
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer..
    And Kullanici User Name kutusunun bos olmadigini test eder..

    Examples:
      | Name      | surname | Birth Place | Email            | Phone        | Date Of Birth | Ssn         | User Name      | father name | mother name | Password        |
      | Project10 | Team02  | Turkey      | Arife2@gmail.com | 963-952-7410 | 01-01-1992    | 369-97-4102 | ViceDeanTeam02 | father name | mother name | ViceDeanTeam02. |

  @US15_TC11
  Scenario Outline: TC11 Father Name girilmelidir Bos birakilamaz
    Given Kullanici_okul_sayfasina_gider..
    Then Kullanici_Login_butonuna_tiklar..
    When Kullanici ViceDeanhesabi ile Sing in yapar..
    When Kullanici_Menua_tiklar..
    And Kullanici_Student_Management_tiklar..
    And Kullanici tum alanlarin bos oldugunu test eder..
    And Kullanici_Choose_Teacher_yapar..
    Then Kullanici "<Name>" alanina gecerli bir ad girer..
    And  Kullanici Name alaninin bos olmadigini test eder..
    Then Kullanici "<surname>" alanina gecerli bir surname girer..
    Then Kullanici "<Birth Place>" alanina gecerli bir birthplace girer..
    And Kullanici Birth Place alaninin bos olmadigini test eder..
    Then Kullanici "<Email>" alanina gecerli bir email girer..
    And Kullanici Email alaninin bos olmadigini test eder..
    And Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer..
    And Kullanici Phone kutusunun bos olmadigini test eder..
    Then Kullanici Gender_e_datayi_girer..
    And Kullanici Gender seçeneginin bos olmadigini test eder..
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer..
    And Kullanici Date Of Birth kutusunun bos olmadigini test eder..
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer..
    And Kullanici Ssn kutusunun bos olmadigini test eder..
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer..
    And Kullanici User Name kutusunun bos olmadigini test eder..
    Then Kullanici"<mother name>"kutusuna gecerli bir mothername girer..
    And Kullanici mother name kutusunun bos olmadigini test eder..
    Then Kullanici "<Password>" kutusuna buyuk harf kucuk harf ve rakam iceren en az 8 karakterli bir sifreyi girer..
    And Kullanici Password kutusunun bos olmadigini test eder..
    Then Kullanici submit e tiklar..
    Then Kullanici Father Name in altında Required yazisini gorur..
    Then Kullanici "<father name>" kutusuna gecerli bir fathername girer..
    And Kullanici father name kutusunun bos olmadigini test eder..

    Examples:
      | Name      | surname | Birth Place | Email            | Phone        | Date Of Birth | Ssn         | User Name      | father name | mother name | Password        |
      | Project10 | Team02  | Turkey      | Arife3@gmail.com | 963-952-7410 | 01-01-1992    | 369-97-4102 | ViceDeanTeam02 | father name | mother name | ViceDeanTeam02. |

  @US15_TC12
  Scenario Outline: TC12 Mother Name girilmelidir Bos birakilamaz
    Given Kullanici_okul_sayfasina_gider..
    Then Kullanici_Login_butonuna_tiklar..
    When Kullanici ViceDeanhesabi ile Sing in yapar..
    When Kullanici_Menua_tiklar..
    And Kullanici_Student_Management_tiklar..
    And Kullanici tum alanlarin bos oldugunu test eder..
    And Kullanici_Choose_Teacher_yapar..
    Then Kullanici "<Name>" alanina gecerli bir ad girer..
    And  Kullanici Name alaninin bos olmadigini test eder..
    Then Kullanici "<surname>" alanina gecerli bir surname girer..
    Then Kullanici "<Birth Place>" alanina gecerli bir birthplace girer..
    And Kullanici Birth Place alaninin bos olmadigini test eder..
    Then Kullanici "<Email>" alanina gecerli bir email girer..
    And Kullanici Email alaninin bos olmadigini test eder..
    And Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer..
    And Kullanici Phone kutusunun bos olmadigini test eder..
    Then Kullanici Gender_e_datayi_girer..
    And Kullanici Gender seçeneginin bos olmadigini test eder..
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer..
    And Kullanici Date Of Birth kutusunun bos olmadigini test eder..
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer..
    And Kullanici Ssn kutusunun bos olmadigini test eder..
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer..
    And Kullanici User Name kutusunun bos olmadigini test eder..
    Then Kullanici "<father name>" kutusuna gecerli bir fathername girer..
    And Kullanici father name kutusunun bos olmadigini test eder..
    Then Kullanici "<Password>" kutusuna buyuk harf kucuk harf ve rakam iceren en az 8 karakterli bir sifreyi girer..
    And Kullanici Password kutusunun bos olmadigini test eder..
    Then Kullanici submit e tiklar..
    Then Kullanici Mother Name in altında Required yazisini gorur..
    Then Kullanici"<mother_name>"kutusuna gecerli bir mothername girer..
    And Kullanici mother name kutusunun bos olmadigini test eder..

    Examples:
      | Name      | surname | Birth Place | Email            | Phone        | Date Of Birth | Ssn         | User Name      | father name | mother_name | Password        |
      | Project10 | Team02  | Turkey      | Arife0@gmail.com | 963-952-7410 | 01-01-1992    | 369-97-4102 | ViceDeanTeam02 | father name | mother_name | ViceDeanTeam02. |

  @US15_TC13
  Scenario Outline: TC13 Student number otomatik olarak gelmelidir
    Given Kullanici_okul_sayfasina_gider..
    Then Kullanici_Login_butonuna_tiklar..
    When Kullanici ViceDeanhesabi ile Sing in yapar..
    When Kullanici_Menua_tiklar..
    And Kullanici_Student_Management_tiklar..
    And Kullanici tum alanlarin bos oldugunu test eder..
    And Kullanici_Choose_Teacher_yapar..
    Then Kullanici "<Name>" alanina gecerli bir ad girer..
    And Kullanici Name alaninin bos olmadigini test eder..
    Then Kullanici "<surname>" alanina gecerli bir surname girer..
    Then Kullanici "<Birth Place>" alanina gecerli bir birthplace girer..
    And Kullanici Birth Place alaninin bos olmadigini test eder..
    Then Kullanici "<Email>" alanina gecerli bir email girer..
    And Kullanici Email alaninin bos olmadigini test eder..
    And Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer..
    And Kullanici Phone kutusunun bos olmadigini test eder..
    Then Kullanici Gender_e_datayi_girer..
    And Kullanici Gender seçeneginin bos olmadigini test eder..
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer..
    And Kullanici Date Of Birth kutusunun bos olmadigini test eder..
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer..
    And Kullanici Ssn kutusunun bos olmadigini test eder..
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer..
    And Kullanici User Name kutusunun bos olmadigini test eder..
    Then Kullanici "<father name>" kutusuna gecerli bir fathername girer..
    And Kullanici father name kutusunun bos olmadigini test eder..
    Then Kullanici"<mother name>"kutusuna gecerli bir mothername girer..
    And Kullanici mother name kutusunun bos olmadigini test eder..
    Then Kullanici "<Password>" kutusuna buyuk harf kucuk harf ve rakam iceren en az 8 karakterli bir sifreyi girer..
    Then Kullanici submit e tiklar..
    And Kullanici Student save succesfully uyarisini gorur..
    Then kullanici son sayfaya gider..
    Then Kullanici STUDENT LIST bolumunde student number i goror..

    Examples:
      | Name      | surname | Birth Place | Email          | Phone       | Date Of Birth | Ssn         | User Name      | father name | mother name | Password        |
      | Project10 | Team02  | Turkey      | Ari7@gmail.com | 993-95-7210 | 01-01-1992    | 399-97-4122 | ViceDeanTeam02 | fathername  | mothername  | ViceDeanTeam02. |

  @US15_TC14
  Scenario Outline: TC14 Password girilebilmelidir Password en az 8 karakterden olusmalidir(Positive Test)
    Given Kullanici_okul_sayfasina_gider..
    Then Kullanici_Login_butonuna_tiklar..
    When Kullanici ViceDeanhesabi ile Sing in yapar..
    When Kullanici_Menua_tiklar..
    And Kullanici_Student_Management_tiklar..
    And Kullanici tum alanlarin bos oldugunu test eder..
    And Kullanici_Choose_Teacher_yapar..
    Then Kullanici "<Name>" alanina gecerli bir ad girer..
    And  Kullanici Name alaninin bos olmadigini test eder..
    Then Kullanici "<surname>" alanina gecerli bir surname girer..
    Then Kullanici "<Birth Place>" alanina gecerli bir birthplace girer..
    And Kullanici Birth Place alaninin bos olmadigini test eder..
    Then Kullanici "<Email>" alanina gecerli bir email girer..
    And Kullanici Email alaninin bos olmadigini test eder..
    And Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer..
    And Kullanici Phone kutusunun bos olmadigini test eder..
    Then Kullanici Gender_e_datayi_girer..
    And Kullanici Gender seçeneginin bos olmadigini test eder..
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer..
    And Kullanici Date Of Birth kutusunun bos olmadigini test eder..
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer..
    And Kullanici Ssn kutusunun bos olmadigini test eder..
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer..
    And Kullanici User Name kutusunun bos olmadigini test eder..
    Then Kullanici "<father name>" kutusuna gecerli bir fathername girer..
    And Kullanici father name kutusunun bos olmadigini test eder..
    Then Kullanici"<mother name>"kutusuna gecerli bir mothername girer..
    And Kullanici mother name kutusunun bos olmadigini test eder..
    Then Kullanici password kutusuna EN AZ 8 KARAKTERDEN AZ password girer..
    And Kullanici Password kutusunun bos olmadigini test eder..
    Then Kullanici submit e tiklar..
    Then Kullanici passwordun altında Minimum 8 character uyarisini gorur..

    Examples:
      | Name      | surname | Birth Place | Email            | Phone        | Date Of Birth | Ssn         | User Name      | father name | mother name | Password        |
      | Project10 | Team02  | Turkey      | Arife99@gmail.com | 963-952-7410 | 01-01-1992    | 369-97-4102 | ViceDeanTeam02 | father name | mother name | ViceDeanTeam02. |

  @US15_TC15
  Scenario Outline: TC15 Password buyuk harf kucuk harf ve bir rakam icermelidir
    Given Kullanici_okul_sayfasina_gider..
    Then Kullanici_Login_butonuna_tiklar..
    When Kullanici ViceDeanhesabi ile Sing in yapar..
    When Kullanici_Menua_tiklar..
    And Kullanici_Student_Management_tiklar..
    And Kullanici tum alanlarin bos oldugunu test eder..
    And Kullanici_Choose_Teacher_yapar..
    Then Kullanici "<Name>" alanina gecerli bir ad girer..
    And  Kullanici Name alaninin bos olmadigini test eder..
    Then Kullanici "<surname>" alanina gecerli bir surname girer..
    Then Kullanici "<Birth Place>" alanina gecerli bir birthplace girer..
    And Kullanici Birth Place alaninin bos olmadigini test eder..
    Then Kullanici "<Email>" alanina gecerli bir email girer..
    And Kullanici Email alaninin bos olmadigini test eder..
    And Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer..
    And Kullanici Phone kutusunun bos olmadigini test eder..
    Then Kullanici Gender_e_datayi_girer..
    And Kullanici Gender seçeneginin bos olmadigini test eder..
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer..
    And Kullanici Date Of Birth kutusunun bos olmadigini test eder..
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer..
    And Kullanici Ssn kutusunun bos olmadigini test eder..
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer..
    And Kullanici User Name kutusunun bos olmadigini test eder..
    Then Kullanici "<father name>" kutusuna gecerli bir fathername girer..
    And Kullanici father name kutusunun bos olmadigini test eder..
    Then Kullanici"<mother name>"kutusuna gecerli bir mothername girer..
    And Kullanici mother name kutusunun bos olmadigini test eder..
    Then Kullanici password kutusuna SADECE RAKAMDAN OLUsAN EN AZ 8 KARAKTERDEN AZ password girir..
    And Kullanici Password kutusunun bos olmadigini test eder..
    Then Kullanici submit e tiklar..
    Then Kullanici passwordun altında Minimum 8 character uyarisini gorur..

    Examples:
      | Name      | surname | Birth Place | Email             | Phone        | Date Of Birth | Ssn         | User Name      | father name | mother name | Password        |
      | Project10 | Team02  | Turkey      | Arife22@gmail.com | 963-952-7410 | 01-01-1992    | 369-97-4102 | ViceDeanTeam02 | father name | mother name | ViceDeanTeam02. |