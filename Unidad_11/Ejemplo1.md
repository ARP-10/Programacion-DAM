Supongamos que tenemos un archivo llamado "datos.txt" que contiene lo siguiente:

'''
Juan 25
Maria 30
Pedro 28
'''

Como podemos leer y procesar en Java los datos? Tenemos dos formas.

-> Forma 1: leer un archivo utilizando BufferedReader

    1. Crear una instancia de la clase FileReader o InputStreamReader para abrir el archivo de entrada y crear un flujo de entrada. Ambas clases permiten leer caracteres de un archivo, pero FileReader esta optimizado para leer caracteres de archivos de recto, mientras que InputStreamReader puede leer caracteres de cualquier flujo de entrada. De momento nosotros utilizaremos FileReader ya que leeremos archivos de texto.

    ''' Java
    FileReader fr = new fileReader("datos.txt");
    '''

    2. Crear una instancia de la clase BufferedReader, que proporciona una forma eficiente de leer lineas de texto de una rchivo. Esta clase es capaz de leer varias lineas de texto a la vez y almacenarlas en un bufer, lo que puede mejorar el rendimiento de la lectura de archivos. 

    ''' Java
    BufferedReader br = new BufferedReader(fr);
    '''

    3. Utilizar el metodo readLine() de la clase BufferedReader para leer lineas de texto del archivo. Este metodo devuelve una cadena que contiene la linea de texto actual,  o null si se ha alcanzado al final del archivo.

    ''' Java
    String linea;
    while((linea = br.readLine()) != null) {
        //Hacer algo con la linea leida. En este caso Juan 25, Maria 30 y Pedro 28
    }
    '''

    4. Procesar los datos leidos. Se puede utilizar el metodo split() de la clase String para dividir las lineas de texto en campos o utilizar otros metodos de procesamiento de texto segun sea necesario.

    5. Cerrar el archivo utilizando los metodos close() del objeto BufferedReader y close() del objeto FileReader o InputStramReader.


-> Forma 2: leer un archivo utilizando Scanner

    1. Crear un objeto Scanner que apunte el archivo que se desea leer:

    ''' Java
    Scanner scanner = new Scanner(new File("ruta/al/archivo.txt));
    '''

    En este ejemplo, "ruta/al/archivo.txt" es la ruta relativa o absoluta del archivo que se desea leer. 

    Leer los datos del archivo utilizando los metodos de la clase Scanner. Por ejemplo, si el archivo contiene una lista de numeros enteros separados por comas, se puede leer de la siguiente manera:

    ''' Java
    while(scanner.hasNextint()) {
        int numero = scanner.nextInt();
        //Hacer algo con el numero leido
    }
    '''

    En este ejemplo, la funcion hasNextInt() verifica si hay un numero entero siguiente en el archivo y devuelve true si lo hay. El metodo nextInt() lee el numero entero y lo asigna a la variable numero.

    Podemos leero linea a linea y luego procesar los datos leidos con los tipos requeridos en nuestro programa:

    '''Java
    //leer linea por linea y procesar los datos
    while (scanner.,hasNextLine()) {
        String linea = scanner.nextLine();
        //Hacer algo con la linea leida
    }
    '''

    Cerrar el objeto Scanner una vez que se ha terminado de leer el archivo:

