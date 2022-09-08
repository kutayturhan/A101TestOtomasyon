################################################### TURKCE ACIKLAMA ####################################################

#Projemde kullanmis oldugum Cucumber frameworkunun kullanmis oldugu Gherkin dili,
#gelistiricilerin Cucumber'da testleri tanimlamak icin kullandigi bir dildir.
#Bu dil sade ingilizce kullandigindan, hemen hemen herkes tarafindan anlasilabilen bir dildir.
#Gherkin dilinde kullanilan ve projemde yer vermis oldugum anahtar kelimelerin aciklamalarini,
#proje adimlarini ozellikle non-technical kisilerin de anlayabilmesi acisindan aciklayarak ilerlemek istedim.

#"Feature" anahtar kelimesinin amaci, bir yazilim ozelliginin ust duzey bir tanimini saglamaktir.
#"Scenario" anahtar kelimesi, bir is kuralini gosteren somut ornektir. Belirli adimlar listesinden olusur.
#"Given" anahtar kelimesi, senaryonun sahnesini tanimlamak icin kullanilan anahtar kelimedir.
#"When" anahtar kelimesi, bir olayi ve eylemi tanimlamak icin kullanilir. Sistemle etkilesime girilen ilk adimdir.
#"And" anahtar kelimesi, daha sonrasinda yapilan islemi aciklamak icin kullanilan anahtar kelimedir.
#"Then" anahtar kelimesi, beklenen bir sonucu ve neticeyi tanimlanmak icin kullanilir.

################################################ EXPLANATION IN ENGLISH ################################################

#Gherkin language used by the Cucumber framework that I used in my project,
#is a language that developers use to describe tests in Cucumber.
#Since this language uses plain English, it is a language that can be understood by almost everyone.
#I wanted to proceed by explaining the explanations of the keywords used in the Gherkin language
#and that I included in my project and the project steps so that non-technical people in particular could understand it.

#The purpose of the "Feature" keyword is to provide a high-level description of a software feature, and to group related scenarios.
#"Example" keyword is a concrete example that illustrates a business rule. It consists of a list of steps.
#"Given" steps are used to describe the initial context of the system - the scene of the scenario.
#"And" is the keyword used to describe what is done next.
#"Then" steps are used to describe an expected outcome, or result.

########################################################################################################################

Feature:
  Urun seciminden odeme adimina kadar kullanilan,
  Fonksiyonlarin ve Modullerin,
  Calisilabilirliligi,
  Uctan uca testi

  Scenario: Kullanici A101 web sayfasinin anasayfasina basarili bir sekilde ulasir
    Given Kullanici www.a101.com.tr adresindeki web sayfasina giris yapar
    When Kullanici cerez kullanimini kabul eder
    Then Kullanici basarili bir sekilde anasayfaya ulasir
