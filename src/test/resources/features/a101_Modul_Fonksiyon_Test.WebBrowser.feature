Feature: A101 Web Sitesi | Modullerin Islevselligi ve Fonksiyonelligi

  Urun seciminden odeme adimina kadar kullanilan ve etkilesim icinde bulunulan,
  Fonksiyonlarin ve Modullerin
  Islevselligi, fonksiyonelligi ve calisabilirliligi,
  Uctan Uca Testi

  Background: Kullanici A101 web sitesine giris yapar

  Scenario: Kullanici cerez kullanimini kabul eder ve anasayfaya ulasir
    Given Kullanici "https://www.a101.com.tr" alan adindaki web sitesine giris yapar
    When Kullanici cerez kullanimini kabul eder
    Then Kullanici basarili bir sekilde anasayfaya ulasir

  Scenario: Kullanici Giyim ve Aksesuar acilir menu listesinden Kadin Ic Giyim kategorisine tiklar ve Dizalti Corap alt kategorisine tiklayarak Dizalti Corap urun modellerini goruntuler
    When Kullanici mouse imlecini Giyim ve Aksesuar modulu uzerine goturur
    And Kullanici Kadin Ic Giyim kategorisine tiklar
    And Kullanici Dizalti Corap kategorisine tiklar
    Then Kullanici Dizalti Corap modellerini goruntuler

  Scenario: Kullanici siyah renk isaret kutucuguna tiklar ve acilan urunun siyah oldugu dogrulanir
    When Kullanici siyah renk isaret kutucuguna tiklar
    Then Acilan urunun siyah renk oldugu dogrulanir

  Scenario: Kullanici siyah dizalti corabini sepete ekler, sepeti goruntuler ve sepeti onaylar
    When Kullanici Siyah Dizalti Corabi sepete eklemek icin sepete ekle butonuna tiklar
    And Kullanici Siyah Dizalti Corabi urun sayfasina ulasir ve sepete eklemek icin sepete ekle butonuna tiklar
    And Kullanici eklemis oldugu urun bilgisini acilir menude kontrol eder ve sepeti goruntule baglantisina tiklar
    And Kullanici Sepetim sayfasinda sepete eklenen urun bilgisine ulasir ve sepeti onaylamak icin Sepeti Onayla butonuna tiklar
    Then Kullanici odeme adimina gecmek icin gerekli olan uye giris bilgisi sayfasina ulasir

  Scenario: Kullanici odeme adimina uye olmadan devam eder ve e mail adresini girdikten sonra gonderi teslimat adresini belirtip kargo firmasi tercihi yaparak odeme sayfasina ulasir
    When Kullanici UYE OLMADAN DEVAM ET butonuna tiklar
    And Kullanici E mail adresini girer
    And Kullanici DEVAM ET butonuna tiklar
    And Kullanici yeni adres olustur butonuna tiklar
    And Kullanici kisi ve teslimat adres bilgilerini adres guncelleme formuna girer
    And Kullanici teslimat adresi bilgi formundaki kaydet butonuna tiklar
    And Kullanici kargo firmasi secimi yapar
    And Kullanici Kaydet ve Devam Et butonuna tiklar
    And Kullanici kredi karti bilgilerini girer
    And Kullanici On Bilgilendirme Kosullari'ni ve Uzaktan Satis Sozlemesi'ni okudum ve kabul ediyorum kutucugunu isaretler
    And Kullanici Siparisi Tamamla butonuna tiklar
    Then Kullanici guvenli odeme yapmak icin dogrulama kodunu girecegi ekrana ulasir