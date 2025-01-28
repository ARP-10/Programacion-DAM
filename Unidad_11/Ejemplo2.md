1. Crear un objeto FileWriter que apunte al archivo donde se desea escribir:

''' Java
FileWriter writer = new FileWriter("ruta/al/archivo.txt");
'''

Escribir los datos en el archivo utilizando el metodo write() del objeto FileWriter:

'''Java
writer.write("Hola, Mundo!\n");
writer.write("Esto es una linea de texto.\n");
'''

En este ejemplo, se escriben dos lineas de texto en el archivo. Es importante incluir el caracter de salto de linea \n al final de cada linea para separarlas.

Cerrar el objeto FileWriter una vez que se ha terminado de escribir en el archivo:

'''Java
writer.close():
'''