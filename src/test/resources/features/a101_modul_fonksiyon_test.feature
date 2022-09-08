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
  Fonksiyonlarin ve Modullerin,
  Islevselligi, fonksiyonelligi ve calisilabilirliligi,
  Uctan Uca Testi

  Background: Kullanici A101 web sitesinin anasayfasina gider
    Given Kullanici "https://www.a101.com.tr" alan adindaki web sitesine giris yapar

  Scenario: Kullanici cerez kullanimini kabul eder ve anasayfaya ulasir
    When Kullanici cerez kullanimini kabul eder
    Then Kullanici basarili bir sekilde anasayfaya ulasir

    @wip
  Scenario: Kullanici Giyim & Aksesuar modulunun uzerine mouse imlecini goturdukten sonra
            Kadin Ic Giyim kategorisine tiklar ve alt kategorilerden
            Dizalti Corap alt kategorisine tiklayarak Dizalti Corap modellerini goruntuler
    When Kullanici mouse imlecini Giyim ve Aksesuar modulu uzerinde bekletir
    And Kadin Ic Giyim kategorisine tiklar
    And Dizalti Corap kategorisine tiklar
    Then Kullanici Dizalti Corap modellerini goruntuler
