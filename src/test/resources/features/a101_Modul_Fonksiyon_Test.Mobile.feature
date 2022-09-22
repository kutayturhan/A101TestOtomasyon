Feature: A101 Mobil Uygulama | Modullerin Islevselligi ve Fonksiyonelligi

  Urun seciminden odeme adimina kadar kullanilan ve etkilesim icinde bulunulan,
  Fonksiyonlarin ve Modullerin
  Islevselligi, fonksiyonelligi ve calisabilirliligi,
  Uctan Uca Testi

  Background: Kullanici A101 mobil uygulamasına giris yapar

  Scenario: Kullanici Kategoriler acilir menusunden Giyim ve Aksesuar kategorisini secer ve ardindan Kadin Ic Giyim kategorisinden Dizalti Corap alt kategorisini secer
    When Kullanici kategoriler acilir menusunu secer
    And Kullanici Giyim ve Aksesuar kategorisini secer
    And Kullanici Kadin Ic Giyim kategorisini secer
    And Kullanici Dizalti Corap kategorisini secer
    Then Kullanici mobil uygulamada Dizalti Corap modellerini goruntuler

  Scenario: Kullanici filtreleme bolumunden siyah renk isaret kutucugunu secer ve acilan urunun siyah oldugu dogrulanir
    When Kullanici filtreleme bolumune dokunur
    And Kullanici siyah renk isaret kutucugunu secer ve siyah Dizalti Corabi urunlerine ulasir

  Scenario: Kullanici siyah dizalti corabini sepete ekledikten sonra sepeti goruntuler ve sepeti onaylar
    When Kullanici Siyah Dizalti Corabi sepete eklemek icin sepete ekle butonuna dokunur
    And Kullanici Siyah Dizalti Corabi urun sayfasina ulasir ve sepete eklemek icin sepete ekle butonuna dokunur
    And Kullanici eklemis oldugu urun bilgisini acilir menude kontrol eder ve sepete git butonuna dokunur
    And Kullanici Sepetim sayfasinda sepete eklenen urun bilgisine ulasir ve sepeti onaylamak icin Sepeti Onayla butonuna dokunur
    Then Kullanici odeme adimina gecmek icin gerekli olan uye giris bilgisi sayfasina basariyla ulasir

#
#  Scenario: Kullanici odeme adimina uye olmadan devam eder ve e mail adresini girdikten sonra gonderi teslimat adresini belirtip kargo firmasi tercihi yaparak odeme sayfasina ulasir
#    When Kullanici UYE OLMADAN DEVAM ET butonuna tiklar
#    And Kullanici E mail adresini girer
#    And Kullanici DEVAM ET butonuna tiklar
#    And Kullanici yeni adres olustur butonuna tiklar
#    And Kullanici kisi ve teslimat adres bilgilerini adres guncelleme formuna girer
#    And Kullanici teslimat adresi bilgi formundaki kaydet butonuna tiklar
#    And Kullanici kargo firmasi secimi yapar
#    And Kullanici Kaydet ve Devam Et butonuna tiklar
#    And Kullanici kredi karti bilgilerini girer
#    And Kullanici On Bilgilendirme Kosullari'ni ve Uzaktan Satis Sozlemesi'ni okudum ve kabul ediyorum kutucugunu isaretler
#    And Kullanici Siparisi Tamamla butonuna tiklar
#    Then Kullanici guvenli odeme yapmak icin dogrulama kodunu girecegi ekrana ulasir