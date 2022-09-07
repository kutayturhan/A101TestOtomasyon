#Projemde kullanmis oldugum Cucumber frameworkunun kullanmis oldugu Gherkin dili,
#gelistiricilerin Cucumber'da testleri tanimlamak icin kullandigi bir dildir.
#Bu dil sade ingilizce kullandigindan, hemen hemen herkes tarafindan anlasilabilen bir dildir.
#Gherkin dilinde kullanilan ve projemde yer vermis oldugum anahtar kelimelerin aciklamalarini,
#proje adimlarini ozellikle non-technical kisilerin de anlayabilmesi acisindan aciklayarak ilerlemek istedim.

#Feature anahtar kelimesinin amaci, bir yazilim ozelliginin ust duzey bir tanimini saglamaktir.
#Scenario anahtar kelimesi, bir is kuralini gosteren somut ornektir. Belirli adimlar listesinden olusur.
#Given anahtar kelimesi, senaryonun sahnesini tanimlamak icin kullanilan anahtar kelimedir.
#When anahtar kelimesi, bir olayi ve eylemi tanimlamak icin kullanilir. Sistemle etkilesime girilen ilk adimdir.
#And anahtar kelimesi, daha sonrasinda yapilan islemi aciklamak icin kullanilan anahtar kelimedir.
#Then anahtar kelimesi, beklenen bir sonucu ve neticeyi tanimlanmak icin kullanilir.

Feature:
  Urun seciminden odeme adimina kadar kullanilan,
  Fonksiyonlarin ve Modullerin,
  Calisilabilirliligi,
  Uctan uca testi

  Scenario: Kullanici A101 web sayfasinin anasayfasina basarili bir sekilde ulasir
    Given Kullanici www.a101.com.tr adresindeki web sayfasina giris yapar
    When Kullanici cerez kullanimini kabul eder
    And Kullanici chrome tarayici bildirimini kabul eder
    Then Kullanici basarili bir sekilde anasayfaya ulasir