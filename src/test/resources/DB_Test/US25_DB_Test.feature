Feature:US25 Admin ogrenci olusturama DataBase Testi

  @DB
Scenario: Admin ogrenci olusturuldugunu DataBase ile test edebilir
Feature: Admin ogrenci olusturabilmek DB Testi
  Given Kayitli ogrencinin UserId bilgisi ile sorgu yapilir
  Then Ogrenci bilgilerinin database dogrulamasi yapilir