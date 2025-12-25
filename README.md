# W4DSKI-103 - Grundlagen Programmierung - Probe-Programmentwurf

Kurs: WDS225

## Teilbereich 1 (20 Punkte)

### Aufgabe 1 - Leave a Light On (9 Punkte)

Implementieren Sie ein Programm zur Verwaltung von _Philips Hue_ Lampen gemäß der folgenden Anforderungen.
Nutzen Sie das vorgegebene `HueLight`-Record mit den dazugehörigen Attributen und Methoden.

<u>Akzeptanzkriterien:</u>

- Legen Sie drei `HueLight`-Objekte mit selbst gewählten Werten für die Eigenschaften an.
- Erstellen Sie eine `ArrayList` vom Typ `HueLight` und fügen Sie die drei Lampen hinzu.
- Geben Sie die Überschrift `Turned on lights :` auf der Konsole aus.
- Geben Sie anschließend alle Lichter auf der Konsole aus, welche **eingeschaltet** sind.

<u>Beispiel-Konsolenausgabe:</u>
```
Turned on lights :
HueLight[id=1, name=Living Room Light, isOn=true, brightness=75, color=Warm White]
HueLight[id=3, name=Kitchen Light, isOn=true, brightness=100, color=Daylight]
```

### Aufgabe 2 - Clockmaker (11 Punkte)

Implementieren Sie ein Programm zur Verwaltung von Uhren gemäß den folgenden Anforderungen.

<u>Akzeptanzkriterien:</u>

- Erstellen Sie eine Klasse `Watch` (Datei `Watch.java` bereits angelegt) mit den privaten Attributen: `brand`, `model`, `price`
    - Verwenden Sie für die Attribute passende Datentypen
    - Implementieren Sie zwei Konstruktoren:
        - Einen mit allen drei Parametern
        - Einen mit nur `brand` und `model` (Preis = 0.0)
    - Überschreiben Sie die `toString()`-Methode, um eine lesbare Darstellung der Uhr zu liefern.
- Erstellen Sie eine Klasse `SmartWatch` (Datei `SmartWatch.java` bereits angelegt), die von `Watch` erbt.
    - Fügen Sie das private Attribut `hasHeartRateMonitor` mit einem passenden Datentyp hinzu.
    - Implementieren Sie einen Konstruktor für `SmartWatch` mit allen vier Parametern
    - Überschreiben Sie hier ebenso die `toString()`-Methode, um eine lesbare Darstellung der Uhr zu liefern.
- Implementieren Sie in `WatchApp` die `main`-Methode wie folgt:
    - Erstellen Sie ein `Watch`-Objekt mit beliebigen Eigenschaften
    - Erstellen Sie ein `SmartWatch`-Objekt mit beliebigen Eigenschaften
    - Geben Sie beide Objekte mit ihren Eigenschaften auf der Konsole aus

<u>Konsolenausgabe:</u>

```
Watch 1: Watch{brand='Rolex', model='Submariner', price=7500.0}
Watch 2: SmartWatch{Watch{brand='Apple', model='Watch Series 6', price=399.0}, hasHeartRateMonitor=true}
```


## Teilbereich 2 (40 Punkte)

### Aufgabe 3 - SmartHome (12,5 Punkte)

Sie sind für die Programmierung der Steuereinheit eines Überwachungssystems verantwortlich.
Das System erhält Sensordaten über Temperatur, Luftfeuchtigkeit, Tageszeit und einen Energiesparmodus.

Vervollständigen Sie die Klasse `SentinelSystem`.
Implementieren Sie die Anforderungen in der `main`-Methode so, dass sie die unten stehenden Anforderungen erfüllt.

Die Ausgangsvariablen dürfen nicht verändert werden.

<u>Akzeptanzkriterien:</u>

- Energiesparmodus ist aktiv
    - Ist die Temperatur über 35 °C, wird ein Notfall-Lüfter aktiviert: `"Ventilation: ON (Emergency)"`.
    - In allen anderen Fällen bleibt das System im `"System: Standby"`.
- Normalbetrieb (Energiesparmodus ist inaktiv)
    - Nachts
        - Bei Temperaturen unter 15 °C wird die Heizung aktiviert (`"Heater: ON"`).
        - Sollte dabei die Luftfeuchtigkeit zusätzlich über 60 % liegen, muss auch der Luftentfeuchter laufen: `"Heater: ON, Dehumidifier: ON"`.
        - Ab 15 °C ist das System lediglich gesichert: `"Security: ARMED, Temperature: STABLE"`.
    - Tagsüber
        - Bei über 30 °C wird die Klimaanlage benötigt. Ist die Luftfeuchtigkeit dabei über 80 %, wird auf Maximalleistung geschaltet: `"AC: MAX, Vent: OPEN"`, ansonsten `"AC: NORMAL"`.
        - Bei Temperaturen unter 10 °C erfolgt eine Warnung: `"Warning: Low Temp"`.
        - Zwischen 10 °C und 30 °C arbeitet das System im Idealbereich: `"System: OPTIMAL"`.

<u>Konsolenausgabe:</u>

```
--- System Status Report ---
AC: MAX, Vent: OPEN
```

### Aufgabe 4 - FleetManager Copy (6,5 Punkte)

Sie entwickeln ein Flottenmanagementsystem für Logistikunternehmen.

Gegeben ist ein System bestehend aus dem Interface `Maintainable`, der abstrakten Klasse `Vehicle` und der Implementierung `Truck`.
Zur Übersichtlichkeit sind alle Klassen in einer Datei dargestellt.

Ihre Aufgabe ist es, die `main`-Methode in der Klasse `FleetManager` so zu vervollständigen, dass ein echtes Backup (_"Deep Copy"_) der Fahrzeugflotte erstellt wird.
Aktuell führt der Code-Ausschnitt `modifyVehicle(shadowFleet[0])` dazu, dass Änderungen am `shadowFleet`-Array auch das Original-Array `fleet` beeinflussen.
Die fertige Implementierung soll dies verhindern und unabhängige Änderungen ermöglichen.

Die folgende Ausgabe in der Konsole soll mit der Implementierung erreicht werden.

```
Engine Health of fleet[0]: 0.2

--- Testing Deep Copy ---
Deep Backup[0] Health: 1.0
Original Fleet[0] Health: 0.2
```

### Aufgabe 5 - Monopoly-Board (21 Punkte)

Sie sollen die Datenstruktur für ein $11x11$ Spielfeld (ähnlich wie Monopoly) entwerfen.
Um Erweiterungen, wie **mehrere** Informationsebenen pro Feld, zu ermöglichen, soll eine passende Datenstruktur ausgewählt werden.

Implementieren Sie die Klasse `MonopolyBoard`.
Ziel ist es, die äußeren Felder des Spielfelds spiralförmig mit aufsteigenden ungeraden Zahlen zu füllen (beginnend bei `1`) und das gesamte Spielfeld anschließend tabellarisch auszugeben.

Implementieren Sie hierzu die Methoden `initializeBoard()` und `printBoard()`.
Anschließend können Sie in der `main`-Methode beide Methoden aufrufen, um das Spielfeld zu initialisieren und auszugeben.

_Hinweise:_ Für die Konsolenausgabe können Sie folgende Formatierung verwenden: `System.out.printf("%4d", cell);` => `cell` ist der Wert der aktuellen Zelle.
Fügen Sie bestenfalls nach jeder Zeile einen Zeilenumbruch ein.

<u>Zu erwartende Ausgabe:</u>

```
   61    63    65    67    69    71    73    75    77    79     1 
   59     0     0     0     0     0     0     0     0     0     3 
   57     0     0     0     0     0     0     0     0     0     5 
   55     0     0     0     0     0     0     0     0     0     7 
   53     0     0     0     0     0     0     0     0     0     9 
   51     0     0     0     0     0     0     0     0     0    11 
   49     0     0     0     0     0     0     0     0     0    13 
   47     0     0     0     0     0     0     0     0     0    15 
   45     0     0     0     0     0     0     0     0     0    17 
   43     0     0     0     0     0     0     0     0     0    19 
   41    39    37    35    33    31    29    27    25    23    21 
```


## Teilbereich 3 (20 Punkte)

### Aufgabe 6 - Trading Algorithmus (15 Punkte)

Sie entwickeln ein Modul für eine Handelsplattform.
Das System erhält eine Sequenz von Aktienkursen als Array.
Ihre Aufgabe ist es, markante Muster zu erkennen und den theoretisch maximalen Profit für diesen Zeitraum zu berechnen.
Vervollständigen Sie die Methoden in der Klasse `FlashTrader` gemäß der folgenden Spezifikation.

<u>Akzeptanzkriterien:</u>

- Identifizieren Sie alle _Spitzen_ und _Täler_ im Datensatz mit der Methode `analyzePatterns(double[] p)`.
    - Eine _Spitze_ ist ein Wert, der größer ist als sein direkter Vorgänger UND sein direkter Nachfolger.
    - Ein _Tal_ ist ein Wert, der kleiner ist als sein direkter Vorgänger UND sein direkter Nachfolger.
- Berechnen Sie den maximalen Gewinn, den man mit einem einzigen Kauf und einem späteren Verkauf hätte erzielen können mit der Methode `calculateMaxProfit(double[] p)`.
    - Bedingung: Sie müssen kaufen, bevor Sie verkaufen können.

<u>Konsolenausgabe:</u>

```
--- Market Analysis Report ---
Local Peaks at indices: 1 ($165.0) 5 ($190.0) 7 ($210.0) 
Local Valleys at indices: 3 ($130.0) 6 ($150.0) 
Maximum Possible Profit: $80.0
```

### Aufgabe 7 - TimeOverflow (5 Punkte)

Sie sollen für ein wissenschaftliches Modul einen Zeitrechner schreiben, der die Anzahl der Mikrosekunden für einen Zeitraum von 30 Tagen berechnet.
Eine Mikrosekunde entspricht $10^{-6}$ Sekunden.

Bei der Ausführung des Codes in `TimeCalculator` tritt ein logischer Fehler auf, obwohl die mathematische Formel korrekt erscheint.
Das falsche Ergebnis lautet:

```
Microseconds in 30 days: 15019622400
```

Korrigieren Sie den Code in der `main`-Methode, sodass das Ergebnis korrekt berechnet und in der Konsole ausgegeben wird.

<u>Korrekte Ausgabe:</u>

```
Microseconds in 30 days: 2592000000000
```
