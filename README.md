##Description

Small library to get ordinal suffix for int value base on `Locale`.

##Usage

```java
final Ordinal englishOrdinal = Ordinal.forLocale(Locale.ENGLISH);
System.out.prinln("You arrived 1" + englishOrdinal.getSuffix(1));
System.out.prinln("The second is arrived 2" + englishOrdinal.getSuffix(2));
```
