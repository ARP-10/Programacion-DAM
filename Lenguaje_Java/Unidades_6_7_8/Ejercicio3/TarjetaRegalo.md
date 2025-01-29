- Implementar la clase Tarjeta Regalo
        - Cuando se crea una una nueva tarjeta, se le da un saldo y se asigna de forma automática un número de 5 dígitos. 
            Si se intenta gastar más dinero del que tiene la tarjeta, se debe mostrar un mensaje de error.
        - Dos tarjetas regalo se pueden fusionar creando una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo número aleatorio de 5 cifras. 
            Al fusionar dos tarjetas en una, las dos tarjetas originales se quedarían con 0 € de saldo.
        
        Programa principal:

            TarjetaRegalo t1 = new TarjetaRegalo(100); 

            TarjetaRegalo t2 = new TarjetaRegalo(120); 

            t1.gasta(45.90);
            t2.gasta(5);
            t2.gasta(200);
            t1.gasta(3.55);
            System.out.println(t1.comprobarSaldo());
            System.out.println(t2.comprobarSaldo());
            TarjetaRegalo t3 = t1.fusionaCon(t2);
            System.out.println(t1.comprobarSaldo());
            System.out.println(t2.comprobarSaldo());
            System.out.println(t3.comprobarSaldo());
            Salida:

            No tiene suficiente saldo para gastar 200,00€
            50.550000000000004
            115.0
            0.0
            0.0
            165.55