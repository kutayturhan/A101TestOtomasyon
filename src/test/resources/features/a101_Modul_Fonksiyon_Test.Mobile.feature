Feature: A101 Mobil Uygulama | Modullerin Islevselligi ve Fonksiyonelligi

  Urun seciminden odeme adimina kadar kullanilan ve etkilesim icinde bulunulan,
  Fonksiyonlarin ve Modullerin
  Islevselligi, fonksiyonelligi ve calisabilirliligi,
  Uctan Uca Testi

  Background: Kullanici A101 mobil uygulamasına giris yapar

  Scenario: Kullanici A101 Mobil uygulamasinda Kategoriler acilir menusunden Giyim ve Aksesuar kategorisini secer ve ardindan Kadin Ic Giyim kategorisinden Dizalti Corap alt kategorisini secer
    When Kullanici A101 Mobil uygulamasina giris yapar
    And Kullanici islemine yeni guncelleme mevcut uyarisini iptal ederek devam eder
    And Kullanici kategoriler acilir menusune dokunur
    And Kullanici Giyim ve Aksesuar kategorisine dokunur
    And Kullanici Kadin Ic Giyim kategorisine dokunur
    And Kullanici Dizalti Corap kategorisine dokunur
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

  Scenario: Kullanici mobil odeme adimina uye olmadan devam eder ve e mail adresini girdikten sonra gonderi teslimat adresini belirtip kargo firmasi tercihi yaparak odeme sayfasina ulasir
    When Kullanici UYE OLMADAN DEVAM ET butonuna dokunur
    And Kullanici E mail adresi verisini girer
    And Kullanici aydinlatma metnini onaylar
    And Kullanici GONDER butonuna dokunur
    And Kullanici cerez kullanimini kabul et butonuna dokunur
    And Kullanici yeni adres olustur butonuna dokunur
    And Kullanici kisi ve teslimat adresi bilgilerini adres guncelleme formuna girer
    And Kullanici teslimat adresi bilgi formundaki kaydet butonuna dokunur
    And Kullanici kargo firmasi secimini yapar
    And Kullanici Kaydet ve Devam Et butonuna dokunur
    And Kullanici kredi karti verilerini girer
    And Kullanici On Bilgilendirme Kosullari'ni ve Uzaktan Satis Sozlemesi'ni okudum ve kabul ediyorum kutucuguna dokunur
    And Kullanici Siparisi Tamamla butonuna dokunur
    Then Kullanici guvenli odeme yapmak icin dogrulama kodunu girecegi ekrana basariyla ulasir