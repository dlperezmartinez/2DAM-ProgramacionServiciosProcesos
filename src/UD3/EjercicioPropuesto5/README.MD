**Exercici 5.**  
Implementar el model de Productor-Consumidor (similar al
Lector-Escriptor que vam veure amb semàfors) però sincronitzant els
fils amb wait i notify. S’han de complir les següents característiques:

 Els elements produïts s’emmagatzemaran en un array de 5
elements i es llegiran pel consumidor en ordre de producció

 Si l’array està ple, el productor es bloquejarà

 Si l’array està buit, el consumidor es bloquejarà

 S’han de generar 50 números aleatoris per escriure a l’array