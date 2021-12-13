**Exercici 3**  
Fer un programa que gestione una agència de viatges.
Crearem 3 fils, cadascun d’ells serà un client que tractarà de reservar
seients en un vol. Per exemple, al principi hi haurà 5 seients llibres i
cada un dels clients tractarà de reservar-ne 3 per a la seua família. El
mètode run del client cridarà al mètode seientsLliures(x) amb el
número de seients que vulga reservar i ho mostrarà per pantalla en
cas que hi haja disponibilitat. Una vegada comprovat si hi ha prou
seients, cada client cridarà al mètode pagar( ), que el simularem fent
un sleep de 3 segons. Després es cridarà a reservaSeients(x) que
s’encarregarà d’actualitzar els seients lliures a l’avió i mostrarà els
seients comprats i els que queden disponibles