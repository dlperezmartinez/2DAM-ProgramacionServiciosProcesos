**Exercici 1**  
Fes un programa en Java que gestione les comandes en una empresa de menjar ràpid.\
 La tenda podrà tindre un número qualsevol de clients i ha de poder tindre diversos treballadors.\
 La  llista  de  comandes  serà un array al que s’accedirà amb exclusió mútua  mitjançant  un
semàfor per part dels clients i dels treballadors\
 Els clients faran la comanda en el moment que arriben si no hi ha ningú modificant la llista
de comandes. Si està ocupada, esperaran a que estiga disponible i s’apuntaran\
 Els  treballadors  estaran  contínuament  fent  comandes.  En  cas  que  no  hi  hagen  comandes
disponibles es quedaran a l’espera fins que un client haja fet una comanda\
 Cada comanda del client, el treballador tardarà entre 10 i 15 segons en preparar-la i quan acabe
amb una comanda, tornarà a revisar si hi ha més comandes de forma indefinida
 Els clients aniran arribant de forma aleatòria durant 120 segons

Crea les classes que consideres necessàries per a que l’eixida siga similar a la mostrada a continuació