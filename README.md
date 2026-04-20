# Yr - caseoppgave

Hei, og velkommen til den tekniske oppgaven!

Oppgaven er delt i to deler:
- **Del 1** løser du hjemme i ditt eget tempo — estimert til et par timer, men ta den tiden du trenger.

- **Del 2** løser du sammen med oss i intervjuet — du får vite hva den går ut på når vi møtes. Vi er mer interessert i hvordan du tenker enn at alt er ferdig til siste linje.

Alle hjelpemidler er tillatt i begge deler — dokumentasjon, Google, det du
er vant til å bruke til vanlig. Det viktigste er at du viser fram det du kan og hvordan du jobber. 

Lykke til, og ikke nøl med å ta kontakt hvis noe er uklart!

---

## Prosjektstruktur

Du får et Compose-prosjekt der avhengigheter allerede er konfigurert (Retrofit,
Navigation Compose, ViewModel Compose, Material Icons), og Yr-værikonene ligger
klare i `res/`. Tre hjelpefunksjoner følger med som du kan bruke som de er:

- `WeatherIcon(wmoCode, modifier)` — composable som viser riktig Yr-ikon for en WMO-værkode (`ui/components/WeatherIcon.kt`)
- `weatherDescription(code)` — returnerer en norsk tekstbeskrivelse for en WMO-værkode (`utils/WeatherDescription.kt`)
- `formatDate(dateStr)` — formaterer en dato på formen `"2026-04-09"` til `"09 apr"` (`utils/FormatDate.kt`)

```
app/src/main/java/com/example/myapp/
├── data/
│   └── FakeWeatherData.kt      ← falske testdata (se nedenfor)
├── ui/
│   ├── components/
│   │   └── WeatherIcon.kt      ← ferdig: WeatherIcon
│   └── theme/                  ← ferdig, trenger ikke endres
├── utils/
│   ├── WeatherDescription.kt   ← ferdig: weatherDescription
│   └── FormatDate.kt           ← ferdig: formatDate
└── MainActivity.kt             ← startpunkt
```

`FakeWeatherData.kt` inneholder ferdigdefinerte testverdier du kan bruke direkte i stedet for et API-kall, hvis du ikke får Retrofit til å fungere. Se kommentarene i filen for eksempel på bruk.

---

## Del 1 — Hjemmeoppgave

### API

Vi bruker [Open-Meteo](https://open-meteo.com), et gratis og åpent vær-API som
ikke krever API-nøkkel. Endepunktet returnerer værvarsler basert på koordinater.
Du kan lime inn denne URL-en i nettleseren for å se hvordan svaret ser ut:

```
https://api.open-meteo.com/v1/forecast?latitude=67.28&longitude=14.38&daily=temperature_2m_max,temperature_2m_min,weathercode,precipitation_sum&current_weather=true&timezone=Europe%2FOslo&models=metno_seamless
```

Koordinatene er satt til Bodø — du kan bytte dem ut med en annen lokasjon hvis du vil. Parameteren `models=metno_seamless` angir at API-et skal bruke værmodellen fra Meteorologisk institutt, som er den samme datakilden Yr bruker.

Feltet `current_weather` inneholder gjeldende temperatur, vindhastighet og
værkode. Feltet `daily` inneholder lister med daglige verdier.


---

### Oppgave
Oppgaven din er å presentere data fra api-et. Lag en skjerm som gjør følgende:
- viser en spinner ved datalasting
- viser en feilmelding med en prøv-igjen-knapp hvis det skjer en feil
- viser en skrollerbar liste med gjeldende vær øverst (ikon, temperatur,
  værbeskrivelse, vind) etterfulgt av en 7-dagers prognose hvis dataen ble hentet

Hver dagsrad skal vise dato, værikon, nedbør (hvis aktuelt) og laveste/høyeste
temperatur.

Et eksempel på hvordan skjermen kan se ut ligger i `screenshots/forecast_screen.png`. Det viktige er den generelle strukturen — nøyaktig design og farger er ikke avgjørende.

