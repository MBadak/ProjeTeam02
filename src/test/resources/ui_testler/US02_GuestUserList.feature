Feature: US_02_Guest_User_List_Görüntüleme
  Scenario: TC_01_Guest_UserList_Görüntüleme
    Given kullanici_siteye_gider
    Then  kullanici_login_butonuna_tiklar
    And kullanici_UserName_alanini-doldurur
    And kullanici_Password_alanini_doldurur
    And kullanici_logine_tiklar
    And kullanici_menu_butonuna_tiklar
    And kullanici_guest_user_list_butonuna_tiklar
    And name_bölümü_dogrulanir
    And phoneNumber_bölümü_dogrulanir
    And ssn_bölümü_dogrulanir
    And userName_bölümü_dogrulanir

  Scenario: TC_02_GuestBilgisi_Silme
    Given silme_butonuna_tiklar
    And  GetUserListDeletedSuccesfull_yazısı_dogrulanir

