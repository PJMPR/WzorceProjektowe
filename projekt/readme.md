# Projekt Wzorce Projektowe
##### Zadanie realizowane w ramach przedmiotu Wzorce Projektowe na Uniwerystecie Gdańskim. Informatyka II stopień 2 semestr.

## 1. Temat Projektu
#### Aplikacja symulujaca mobilną formę zamawiania posiłku w restauracji

## 2. Użyte wzorce projektowe
#### 2.1 Podstawowe informacje
1. Konstrukcyjne
- Singleton
- Factory
2. Strukturalne
- Facade
- XXX
3. Operacyjne
- Observer
- Template method

#### 2.2 Miejsce użycia wzorców

1.  Singleton
- [enum](src/main/java/orderApp/enums/OrderStatus.java)
- [ClassicMealFactory](src/main/java/orderApp/methodFactory/ClassicMealFactory.java)
- [VeganMealFactor](src/main/java/orderApp/methodFactory/VeganMealFactory.java)
2. Factory - rodzaj fabryki to method factory. Wzorzec w projekcie odpowiada za tworzenie odpowiednich posiłków w zależności od rodzaju tj. wegańskie lub klasyczne
- [Method factory](src/main/java/orderApp/methodFactory)
3. Facade - wzorzec fasady odpowiadający za oddzielenie logiki realizowania transakcji płatności za posiłek od klienta
- [Payment system](src/main/java/orderApp/fasada)
4. Observer - obiektem obserwowanym jest klasa Order. Przy zmianie statusu zamówienia (order) dzięki obserwatorowi wysyłane są powiadomienia Email oraz na aplikacji mobilnej
- [Klasa obserwowana - Order](src/main/java/orderApp/model/Order.java)
- [Obserwatorzy - email/mobileApp](src/main/java/orderApp/observer)
5. Template method - wzorzec ułatwiający tworzenie poszczególnych kroków przy realizacji zamówienia. Dzięki niemu, posiłek przygotowywany jest dopiero po zamówieniu. Gwarantuje realizacje kroków w odpowiedniej kolejności i umożliwia ich różną implementację. W moim projekcie jest to różnica przygotowywania dań w zależności od klienta wegańskiego/klasycznego
- [Szablon kroków](src/main/java/orderApp/templateMethod/OrderMealSequence.java)
- [Implementacja dla klienta klasycznego](src/main/java/orderApp/templateMethod/ClassicOrderMealSequence.java) 
- [Implementacja dla klienta wegańskiego](src/main/java/orderApp/templateMethod/VeganOrderMealSequence.java) 

