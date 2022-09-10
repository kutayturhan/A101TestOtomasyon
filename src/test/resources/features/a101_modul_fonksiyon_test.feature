#Projemde kullanmis oldugum Cucumber framework'unun kullanmis oldugu Gherkin dili,
#gelistiricilerin Cucumber'da testleri tanimlamak icin kullandigi bir dildir.
#Bu dil sade Ingilizce kullandigindan, hemen hemen herkes tarafindan anlasilabilen bir dildir.
#Gherkin dilinde kullanilan ve projemde yer vermis oldugum anahtar kelimelerin aciklamalarini,
#proje adimlarini, ozellikle non-technical kisilerin de anlayabilmesi acisindan aciklayarak ilerlemek istedim.

#"Feature" anahtar kelimesinin amaci, bir yazilim ozelliginin ust duzey bir tanimini saglamaktir.
#"Scenario" anahtar kelimesi, bir is kuralini gosteren somut ornektir. Belirli adimlar listesinden olusur.
#"Background" anahtar kelimesi, kendisini takip eden senaryolara bir ortam hazirlamaniza olanak tanır.
#"Given" anahtar kelimesi, senaryonun sahnesini tanimlamak icin kullanilan anahtar kelimedir.
#"When" anahtar kelimesi, bir olayi ve eylemi tanimlamak icin kullanilir. Sistemle etkilesime girilen ilk adimdir.
#"And" anahtar kelimesi, daha sonrasinda yapilan ara islemleri aciklamak icin kullanilan anahtar kelimedir.
#"Then" anahtar kelimesi, beklenen bir sonucu ve neticeyi tanimlanmak icin kullanilir.

Feature: A101 Web Sitesi | Modullerin Islevselligi ve Fonksiyonelligi

  Urun seciminden odeme adimina kadar kullanilan ve etkilesim icinde bulunulan,
  Fonksiyonlarin ve Modullerin
  Islevselligi, fonksiyonelligi ve calisilabilirliligi,
  Uctan Uca Testi

  Background: Kullanici A101 web sitesinin anasayfasina gider

  Scenario: Kullanici cerez kullanimini kabul eder ve anasayfaya ulasir
    Given Kullanici "https://www.a101.com.tr" alan adindaki web sitesine giris yapar
    When Kullanici cerez kullanimini kabul eder
    Then Kullanici basarili bir sekilde anasayfaya ulasir

  Scenario: Kullanici Dizalti Corap kategorisine ait urun modellerini goruntuler
    When Kullanici mouse imlecini Giyim ve Aksesuar modulu uzerinde bekletir
    And Kullanici Kadin Ic Giyim kategorisine tiklar
    And Kullanici Dizalti Corap kategorisine tiklar
    Then Kullanici Dizalti Corap modellerini goruntuler

  Scenario: Kullanici siyah renk isaret kutucuguna tiklar ve acilan urunun siyah oldugu dogrulanir
    When Kullanici siyah renk isaret kutucuguna tiklar
    Then Acilan urunun siyah renk oldugu dogrulanir
    #########################################################################################################################

  Scenario: Kullanici siyah dizalti corabini sepete ekler, sepeti goruntuler ve sepeti onaylar
    When Kullanici Dizalti Corap sayfasinda Siyah Dizalti Corabini sepete eklemek icin sepete ekle butonuna tiklar
 #   And Kullanici Siyah Dizalti Corabi urun sayfasina ulasir ve sepete eklemek icin sepete ekle butonuna tiklar
 #   And Kullanici eklemis oldugu urun bilgisini acilir menude kontrol eder ve sepeti goruntule baglantisina tiklar
 #   And Kullanici Sepetim sayfasinda sepete eklenen urun bilgisine ulasir ve sepeti onaylamak icin Sepeti Onayla butonuna tiklar
 #   Then Kullanici odeme adimina gecmek icin gerekli olan uye giris bilgisi sayfasina ulasir
 #
