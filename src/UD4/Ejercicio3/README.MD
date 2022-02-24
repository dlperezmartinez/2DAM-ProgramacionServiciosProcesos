EXERCICI 3. Tenint en compte el servidor creat al vídeo que està
penjat a Aules i a la forma en que es gestionen els clients:
1. Crea un Client en Java que cree un Socket amb eixe client i
   funcione de la mateixa forma que vam veure amb telnet
2. Modifica el servidor per fer que abans de començar a acceptar
   peticions de clients, demane per consola el mode de
   funcionament: 1-funcionament actual i 2-mode suma
    El servidor informarà als clients que es connecten del mode en que
   està funcionant
    En el mode suma, mentre els clients envien números, anirà fent la
   suma fins que un dels clients envie “=“. En eixe moment s’enviarà a tots
   els clients el resultat. En cas que els clients envien alguna cosa no
   acceptada, s’enviarà un missatge d’error i es descartarà el contingut