Crea una excepcion nueva llamada ErrorValidacionDNI que represente un error en la validacion de un DNI. Crea tambien un metodo que, dado un String valide este y lance la excepcion que hemos definido cuando no se cumpla alguna de las restricciones. 
Para la validacion, simplemente tendremos en cuenta estas tres normas:
- La longitud exacta de la cadena sera de 9 caracteres
- El ultimo caracter sera una letra
- Los 8 primeros caracteres deberan ser digitos
Puedes utilizar los metodos isDigit() e isLetter() de la clase Character para efectuar las comprobaciones