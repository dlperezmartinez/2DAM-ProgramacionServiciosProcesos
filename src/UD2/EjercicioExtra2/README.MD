Has de programar en Java utilitzant semàfors un sistema en el que
tindrem  dos  tipus  de  processos  que  accediran  a  un  mateix  recurs
compartit.  Aquest  recurs serà  un  array  de  Strings.  Els dos tipus  de
processos, s’anomenaran Escriptor i Lector.

 Els escriptors el que faran serà escriure a la primera posició lliure
del Array el següent text: “Sóc l’escriptor X i són les yy:zz”. X serà
el número de l’escriptor i yy i zz seran l’hora i els minuts. Si hi ha
un lector llegint dades o un escriptor escrivint-les, esperaran fins
que acaben.

 Els lectors, trauran el primer element del array i el mostraran per
pantalla. Cal tindre en compte que  un lector només podrà entrar
en  cas  de  que  hi  hagen  dades  disponibles  i  de  que  no  hi  haja
ningun  altre  procés  utilitzant  el  recurs.  Si  no  hi  hagueren  dades
disponibles, els lectors es quedaran esperant fins que estiguen.

Per tant, haurem de tindre dos semàfors, un per a controlar que un
procés no puga accedir si el recurs està en ús i un altre per a controlar
que un Lector no puga accedir si no hi ha dades disponibles.

Per comprovar que funciona correctament, farem un programa
principal que crearà 10 Lectors i 10 Escriptors. Cada un d’ells farà un
Sleep  aleatori  (entre  1  i  5  segons)  per  tal  de  simular  accessos  en
distints moments.

El recurs compartit (l’array) estarà definit en una classe anomenada
AccesRW, que tindrà els mètodes per escriure i per llegir dades de
l’Array.

Els lectors i escriptors seran dos classes independents que heretaran
de  Thread  i  que  treballaran  tindran  una  instància  de  la  classe
AccesRW per accedir al recurs compartit. 