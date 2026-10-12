1. Kontots uppgifter är skyddade genom att jag använt private på name och balance i Account.

2. Kontot är skapat genom metoden createAccount i Account.Register istället för i main. Detta gör att main
   hanterar användarens val medans AccountRegister skapar och sparar konton i listan, samtidigt blir koden enklare
   att förstå och underhålla.

3. Menyval 3 
   Användaren väljer alternativ 3 i menyn för att göra en insättning, main frågar efter kontots namn.
   AccountRegister söker efter kontot med metoden findAccount. Om kontot finns får användaren ange ett belopp, metoden
   deposit körs och kontrollerar att beloppet är större än 0 och isåfall läggs pengarna till på kontots saldo och ett 
   meddelande talar om att insättningen är godkänd samt visar nytt saldo, annars visas ett felmeddelande.

 4.  När jag körde fast försökte jag först lösa problemen själv genom att testa olika lösningar. 
     Jag använde även AI och stöd från klasskamrater för att förstå hur klasserna och metoderna skulle samarbeta.
     Eftersom jag var sjuk när vi gick igenom GitHub fick jag börja med att lära mig hur det fungerade och få igång 
     ett fungerande konto.