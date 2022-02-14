# Datenbanken

## Fachwörter

|Fachwörter|Definition|
|:---|:---|
|Primärschlüssel|eine minimale Menge von Attributen, die jeden möglichen Datensatz eindeutig identifiziert|
|Redundanz|wenn Daten mehrmals gespeichert werden. Sie können weggelassen werden, ohne dass Informationen verloren gehen|
|Anomalien|Probleme und Fehler, die bei Operationen auf den Datensätzen einer Datenbank entstehen können. Es werden **Änderungs-, Einfüge-** und **Löschanomalien** unterschieden|
|Inkonsistenzen|Widersprüche im Datenbestand einer Datenbank. Sie können durch Anomalien hervorgerufen werden|

## SQL-Befehle
|Befehl|Nutzen|
|:---|:---|
|SELECT(DISTINCT)...FROM||
|WHERE|Bedingung|
|GROUP BY|Gruppiert nach dem angegebenen Attribut|
|ORDER BY|Ordnet nach einem bestimmten Spalte (wird als Zahl angegeben)|
|ASC|Ordnet die Ausgabe vom kleinsten zum größten Element|
|DESC|Ordnet die Ausgabe von größtem zum kleinsten Element|
|LEFT JOIN...ON|Verbindet **zwei** Tabellen, wobei die **linke** Tabelle die Primärtabelle ist, wobei ON den Primärschlüssel definiert|
|RIGHT JOIN...ON|Verbindet **zwei** Tabellen, wobei die **rechte** Tabelle die Primärtabelle ist, wobei ON den Primärschlüssel definiert|
|INNER JOIN...ON|Verbindet **alle** Zeilen, die in beiden Tabellen vorhanden sind|
|JOIN...ON|Ist eine andere Schreibweise zum INNER JOIN|
|UNION|Vereinigt die Zeilen aus zwei Tabellen mit den gleichen Attributen in einer Tabelle|
|AS|bennent eine Spalte in der Ergebnistabelle|
|NULL||

## Vergleichsoperatoren

|Symbol|Operation|
|:---|:---|
|=|gleich|
|<>|ungleich|
|>|größer|
|<|kleiner|
|>=|größer gleich|
|<=|kleiner gleich|
|LIKE|gibt Inhalte die eine bestimmte Zeichenfolge beinhaltet zurück ('%...%')|
|BETWEEN|gibt nur die Inhalte zwischen zwei Werten zurück|
|IN|gitb die spezifizierten Werte zurück|
|IS NULL|Überprüft, ob das Element vorhanden ist|

## Arithmetische Operatoren

|Symbol|Operation|
|:---|:---|
|+|addition|
|-|subtration|
|*|multiplikation|
|/|division|

## Logische Operatoren

- AND
- OR
- NOT

## Funktionen

|Funktion|Nutzen|
|:---|:---|
|COUNT|Zählt die Anzahl der Zeilen|
|SUM|Zählt die Werte der Spalte|
|MAX|gibt den höchsten Wert zurück|
|MIN|gibt den kleinsten Wert zurück|
|AVG|gibt den Mittlewert (von int) zurück|

## Normalformen

|Normalform|Bedingung|
|:---|:---|
|Erste Normalform (1NF)|ist erreicht, wenn alle Attribute einen atomaren Wertebereich haben|
|Zweite Normalform (2NF)|ist erreicht, wenn die Datenbank in der 1NF ist und zusätzlich jedes Nichtschlüsselattribut vom Primärschlüssel voll funktional abhängig ist und nicht von einem Teil der Schlüsselattribute|
|Dritte Normalform (3NF)|ist erreicht, wenn die Datenbank in der 2NF ist und es zusätzlich kein Nichtschlüsselattribut gibt, das transitiv abhängig von einem Schlüsselattribut ist. Es darf also keine funktionalen Abhängigkeiten zwischen Nichtschlüsselattributen geben|

## Abhängigkeiten

|Abhängigkeiten|Bedeutung|Beispiel|
|:---|:---|:---|
|funktional abhängig|Ein Attribut B ist von einem Attribut A funktional abhängig, wenn jeder Wert von Attribut A einem eindeutigen Wert von Attribut B zugeordnet werden kann|A &rarr; B|
|voll funktional abhängig|Ein Attribut B ist von einer Attributkombination (A<sub>1</sub>, A<sub>2</sub>) voll funktional abhängig, wenn ein Attribut B funktional abhängig von der Kombination (A<sub>1</sub>, A<sub>2</sub>) ist, aber nicht schon von A<sub>1</sub> oder A<sub>2</sub>|B &rarr; (A<sub>1</sub>, A<sub>2</sub>) und B nicht &rarr; A<sub>1</sub> oder &rarr; A<sub>2</sub>|
|transitiv abhängig|Ein Attribut C ist von Attribut A transitiv abhängig, wenn es ein Attribut B gitb welches von A abhängig ist. Dabei darf A nicht funktional abhängig von B sein.|A &rarr; B &rarr; C|

## ER-Modell (Entity-Relationship-Modell)

### Modellierung

|Begriff|Bedeutung|
|:---|:---|
|Entität|Objekt aus der Realsituation, über das Informationen gespeichert werden|
|Entitätsmenge| Zusammenfassung mehrerer gleichartiger Entitäten|
|Attribut|Eigenschaft aller Entitäten einer Entitätsmenge|
|Beziehungen|Zusammenhang von Entitäten untereinander|
|Beziehungsmengen|Zusammenfassung von gleichartigen Beziehungen|
|Kardinalitäten|beschreiben, wie viele Entitäten einer Entitätsmenge an einer bestimmten Beziehung beteiligt sein können oder müssen. Es wird zwischen den Kardinalitäten -1 (kein oder ein) und -m bzw. n (kein, ein oder mehrere) unterschieden. Somit sind drei Beziehungsarten möglich (1:1, 1:n und m:n)|

### Umsetzung

|Begriff|Bedeutung|Beispiel|
|:---|:---|:---|
|Relationsschema|Jede Entitätsmenge wird im relationalen Modell einer eigenständigen Relation überführt|Verlag(**VID**, Name, Sitz, Ansprechpartner)|
|Fremdschlüssel|Primärschlüssel der in einer Relation vorkommt und mit einem senkreckten Pfeil gekennzeichnet wird|
|m:n-Beziehung|Wird im relationalem Modell (Relationsschema) in eine eigene Relation überführt. Attribute sind die Primärschlüssel der beiden an der Beziehung beteiligten Entitätsmengen (als Fremdschlüssel), die gemeinsam den Primärschlüssel der Beziehungstabelle bilden, sowie ggf. Attribute der Beziehungsmenge||
|1:n-Beziehung|Die Relation mit der Kardinalität n wird der Primärschlüssel der Relation mit der Kardinalität 1 als Fremdschlüssel angefügt. Attribute der Beziehungsmenge werden ggf. auch dieser Relation hinzugefügt| Jedes Buch kann nur von einem Verlag herausgebracht werden aber ein Verlag kann mehrere Bücher herausbringen: Buch n – 1 Verlag: Buch (**ISBN**, Titel, Autor, Preis, Kategorie, ↑VID)|
|1:1-Beziehung|Einer an der Beziehung beteiligten Relation wird der Primärschlüssel der anderen Relation als Fremdschlüssel angefügt. Attribute der Beziehungsmenge werden ggf. auch dieser Relation angefügt.||


### Überführungen in höhere Normalformen 

#### Überführung in die Erste Normalform:

Alle Werte müsen atomar sein, das heißt, dass sie nicht weiter zerlegbar sind. Beispiel:

|Name|Telefon Nummer|
|:---|:---|
|Kevin|0217817563, 021738498|

|Name|Telefon Nummer|
|:---|:---|
|Kevin|0217817563|
|Kevin|021738498|

Die Tabelle befindet sich nun in der ersten Normalform, da die Attribute nicht weiter aufgebrochen werden können.

#### Überführung in die zweite Normalform:

Befindet sich eine Beziehung in der ersten Normalform und ist jedes Nicht-Primärschlüssel-Attribut funktional vollständig vom Primärschlüssel abhängig, dann befindet sich die Beziehung in der zweiten Normalform (2NF).

|Student Nr.|Kurs Nummer|Kurs Preis|
|:---|:---|:---|
|1|43|50|
|2|21|60|
|3|21|60|
|4|13|60|


&rarr; Kurs Preis kann nicht allein den Wert von Kurs Nummer oder Student Nr. bestimmen

&rarr; Kurs Preis kann zusammen mit Student Nr. nicht über den Wert von Kurs Nummer entscheiden

&rarr; Kurs Preis kann zusammen mit Kurs Nummer nicht über den Wert von Student Nr. entscheiden

Lösung: Wir teilen das Schema in 2 Tabellen auf. 

|Student Nr.|Kurs Nummer| 	
|:---|:---|
|1|43|
|2|21|
|3|21|
|4|13|

|Kurs Nummer|Kurs Preis|
|:---|:---|
|43|50|
|21|60|
|21|60|
|13|60|

Da alle nicht Schlüssel Attribute von der Kombination (Kurs Nummer,Student Nr.) voll funktional abhängig sind, befindet sich die Tabelle in der zweiten Normalform.

#### Überführung in die dritte Normalform:

Eine Relation befindet sich in der dritten Normalform, wenn keine transitiven Abhängigkeiten bei nicht schlüssel attributen bestehen.

Unser vorheriges Beispiel erfüllt dieses Kriterium bereits, deswegen nutzen wir ein anderes Beispiel.

|Student Nr.|Name|Bundesland|Land|Alter|
|:---|:---|:---|:---|:---|
|1|Lukas|Bayern|DE|20| 
|2|Tim|Berlin|DE|18|
|3|Kevin|Berlin|DE|21|

Das Attribut "Student Nr." ist in dieser tabelle transitiv abhängig von "Bundesland".

Lösung: Wir teilen das Schema in zwei Tabellen.

|Student Nr.|Name|Alter|Bundesland|
|:---|:---|:---|:---|
|1|Lukas|20|Bayern|
|2|Tim|18|Berlin|
|3|Kevin|21|Berlin|

|Bundesland|Land|
|:---|:---|
|Bayern|Deutschland|
|Berlin|Deutschland|

Da sich die Tabelle in der 2.NF befand, und jetzt alle transitiven abhängigkeiten aufgelöst wurden, befindet sie sich in der dritten Normalform.

## Beispiel ER-Modell und relationale Datenbanken

Hier werden die oben genannten Konzepte im Zusammenhang einer Datenbank für eine Schülerfirma nochmal dargestellt.

### 1. ER-Modell erstellen
![ER-Modell Schülerfirma](er-modell-schuelerfirma.jpg)Die Striche stehen für 1 und die Dreiecke für n. D.h. die Kundenart und Kunden haben eine 1-n Beziehung während Auftrag und Auftragsart eine n-m Beziehung haben.

### 2. ER-Modell in eine Relation übertragen
Nun wird jede Entität in eine eigene Relation übertragen. Dabei sind die Attribute die Spalten der Relation.

>Kundenart(**KID**, Art)   
>Kunden(**KID**, Name, Art)  
>Auftrag(**KID**, AID, PID)  
>Auftragsart(**AID**, Art)  
>Positionsarten(**PaID**, Position)  
>Personal_Info(**PID**, PaID, FID, Email, TelefonNr, Straße, Hausnummer, Stadt, PLZ, Geburtsdatum, KontoNr)  
>Fachgebiete(**FID**, Gebiete)  
>Personal(**PID**, Name, Vorname)
>
>Hinweis: Die Primärschlüssel sind eigentlich unterstrichen (wir im ER-Modell, hier aber **Fett** da man in Markdown schlecht unterstreichen kann.)

### 3. Relation in die Erste Normalform bringen

Dies kann kann schlecht an unserem Beispiel gezeigt werden, da wir schon in der Planungsphase versucht haben darauf zu achten, dass die Attribute atomar sind. Hätten wir dies nicht getan könnte ein Beispiel so aussehen:

|Vorher|Nachher|
|:--|:--|
|Personal_Info(**PID**, PaID, FID, Email, TelefonNr, Anschrift, Geburtsdatum, KontoNr)|Personal_Info(**PID**, PaID, FID, Email, TelefonNr, Straße, Hausnummer, Stadt, PLZ, Geburtsdatum, KontoNr)|

Wie man in der Tabelle oben sieht wurde das Attribut *Anschrift* in seine kleinsten Bestandteile aufgeteilt.

>Anschrift &rarr; Straße, Hausnummer, Stadt, PLZ

### Implementation in SQL
```SQL
CREATE TABLE Kundenart(
    KID STRING(255),
    Art varchar(255)
);
CREATE TABLE Kunden(
    KID STRING(255),
    Name varchar(255),
    Art varchar(255)
);
CREATE TABLE Auftrag(
    KID STRING(255),
    AID STRING(255),
    PID STRING(255)
);
CREATE TABLE Auftragsart(
    AID STRING(255),
    Art varchar(255)
);
CREATE TABLE Positionsarten(
    PaID STRING(255),
    Position varchar(255)
);
CREATE TABLE Personal_Info(
    PID STRING(255),
    PaID STRING(255),
    FID STRING(255),
    Email varchar(255),
    TelefonNr int(20),
    Straße varchar(255),
    Hausnummer varchar(255),
    Stadt varchar(255),
    PLZ int(10),
    Geburtsdatum date,
    KontoNr int(30)
);
CREATE TABLE Fachgebiete(
    FID STRING(255),
    Gebiete varchar(255)
);
CREATE TABLE Personal(
    PID STRING(255),
    Name varchar(255),
    Vorname varchar(255)
);
```