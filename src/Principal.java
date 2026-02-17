import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println(Colores.MAGENTA + "                                %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%" + Colores.RESET);
        System.out.println(Colores.MAGENTA + "                                %%%%%%%%    " + Colores.AZUL + "BIENVENIDO/A  A SU CONVERTIDOR DE MONEDA CFPLACI" + Colores.MAGENTA + "     %%%%%%%%%%" + Colores.RESET);
        System.out.println(Colores.MAGENTA + "                                %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%" + Colores.RESET);

        String menu = """
                -------------------------------------------------------------------------
                --Nº	Moneda origen	            →   Moneda destino                 --
                -------------------------------------------------------------------------
                  1  	USD Dólar estadounidense	→	ARS Peso argentino             \s
                  2  	ARS Peso argentino	        →	USD Dólar estadounidense       \s
                  3  	USD Dólar estadounidense	→	CAD Dólar canadiense           \s
                  4  	CAD Dólar canadiense	    →	USD Dólar estadounidense       \s
                  5  	USD Dólar estadounidense	→	CHF Franco suizo               \s
                  6  	CHF Franco suizo	        →	USD Dólar estadounidense       \s
                  7  	USD Dólar estadounidense	→	CLP Peso chileno               \s
                  8  	CLP Peso chileno	        →	USD Dólar estadounidense       \s
                  9  	USD Dólar estadounidense	→	CNY Yuan renminbi chino        \s
                  10  	CNY Yuan renminbi chino	    →	USD Dólar estadounidense       \s
                  11  	USD Dólar estadounidense	→	COP Peso colombiano            \s
                  12  	COP Peso colombiano	        →	USD Dólar estadounidense       \s
                  13  	USD Dólar estadounidense	→	DOP Peso                       \s
                  14  	DOP Peso  	                →	USD Dólar estadounidense       \s
                  15  	USD Dólar estadounidense	→	EUR Euro                       \s
                  16  	EUR Euro	                →	USD Dólar estadounidense       \s
                  17  	USD Dólar estadounidense	→	JPY Yen japonés                \s
                  18  	JPY Yen japonés         	→	USD Dólar estadounidense       \s
                  19  	ARS Peso argentino	        →	CAD Dólar canadiense           \s
                  20  	CAD Dólar canadiense	    →	ARS Peso argentino             \s
                  21  	ARS Peso argentino	        →	CHF Franco suizo               \s
                  22  	CHF Franco suizo	        →	ARS Peso argentino             \s
                  23  	ARS Peso argentino	        →	CLP Peso chileno               \s
                  24  	CLP Peso chileno	        →	ARS Peso argentino             \s
                  25  	ARS Peso argentino	        →	CNY Yuan renminbi chino        \s
                  26  	CNY Yuan renminbi chino	    →	ARS Peso argentino             \s
                  27  	ARS Peso argentino	        →	COP Peso colombiano            \s
                  28  	COP Peso colombiano	        →	ARS Peso argentino             \s
                  29  	ARS Peso argentino	        →	DOP Peso                       \s
                  30  	DOP Peso  	                →	ARS Peso argentino             \s
                  31  	ARS Peso argentino	        →	EUR Euro                       \s
                  32  	EUR Euro	                →	ARS Peso argentino             \s
                  33  	ARS Peso argentino	        →	JPY Yen japonés                \s
                  34  	JPY Yen japonés          	→	ARS Peso argentino             \s
                  35  	CAD Dólar canadiense	    →	CHF Franco suizo               \s
                  36  	CHF Franco suizo	        →	CAD Dólar canadiense           \s
                  37  	CAD Dólar canadiense	    →	CLP Peso chileno               \s
                  38  	CLP Peso chileno	        →	CAD Dólar canadiense           \s
                  39  	CAD Dólar canadiense	    →	CNY Yuan renminbi chino        \s
                  40  	CNY Yuan renminbi chino	    →	CAD Dólar canadiense           \s
                  41  	CAD Dólar canadiense	    →	COP Peso colombiano            \s
                  42  	COP Peso colombiano      	→	CAD Dólar canadiense           \s
                  43  	CAD Dólar canadiense	    →	DOP Peso                       \s
                  44  	DOP Peso  	                →	CAD Dólar canadiense           \s
                  45  	CAD Dólar canadiense	    →	EUR Euro                       \s
                  46  	EUR Euro	                →	CAD Dólar canadiense           \s
                  47  	CAD Dólar canadiense	    →	JPY Yen japonés                \s
                  48  	JPY Yen japonés	            →	CAD Dólar canadiense           \s
                  49  	CHF Franco suizo	        →	CLP Peso chileno               \s
                  50  	CLP Peso chileno	        →	CHF Franco suizo               \s
                  51  	CHF Franco suizo	        →	CNY Yuan renminbi chino        \s
                  52  	CNY Yuan renminbi chino	    →	CHF Franco suizo               \s
                  53  	CHF Franco suizo	        →	COP Peso colombiano            \s
                  54  	COP Peso colombiano	        →	CHF Franco suizo               \s
                  55  	CHF Franco suizo	        →	DOP Peso                       \s
                  56  	DOP Peso  	                →	CHF Franco suizo               \s
                  57  	CHF Franco suizo	        →	EUR Euro                       \s
                  58  	EUR Euro	                →	CHF Franco suizo               \s
                  59  	CHF Franco suizo	        →	JPY Yen japonés                \s
                  60  	JPY Yen japonés	            →	CHF Franco suizo               \s
                  61  	CLP Peso chileno	        →	CNY Yuan renminbi chino        \s
                  62  	CNY Yuan renminbi chino	    →	CLP Peso chileno               \s
                  63  	CLP Peso chileno	        →	COP Peso colombiano            \s
                  64  	COP Peso colombiano	        →	CLP Peso chileno               \s
                  65  	CLP Peso chileno	        →	DOP Peso                       \s
                  66  	DOP Peso  	                →	CLP Peso chileno               \s
                  67  	CLP Peso chileno	        →	EUR Euro                       \s
                  68  	EUR Euro	                →	CLP Peso chileno               \s
                  69  	CLP Peso chileno	        →	JPY Yen japonés                \s
                  70  	JPY Yen japonés	            →	CLP Peso chileno               \s
                  71  	CNY Yuan renminbi chino	    →	COP Peso colombiano            \s
                  72  	COP Peso colombiano	        →	CNY Yuan renminbi chino        \s
                  73  	CNY Yuan renminbi chino	    →	DOP Peso                       \s
                  74  	DOP Peso  	                →	CNY Yuan renminbi chino        \s
                  75  	CNY Yuan renminbi chino	    →	EUR Euro                       \s
                  76  	EUR Euro	                →	CNY Yuan renminbi chino        \s
                  77  	CNY Yuan renminbi chino	    →	JPY Yen japonés                \s
                  78  	JPY Yen japonés	            →	CNY Yuan renminbi chino        \s
                  79  	COP Peso colombiano     	→	DOP Peso                       \s
                  80  	DOP Peso                	→	COP Peso colombiano            \s
                  81  	COP Peso colombiano	        →	EUR Euro                       \s
                  82  	EUR Euro	                →	COP Peso colombiano            \s
                  83  	COP Peso colombiano      	→	JPY Yen japonés                \s
                  84  	JPY Yen japonés	            →	COP Peso colombiano            \s
                  85  	DOP Peso  	                →	EUR Euro                       \s
                  86  	EUR Euro	                →	DOP Peso                       \s
                  87  	DOP Peso  	                →	JPY Yen japonés                \s
                  88  	JPY Yen japonés	            →	DOP Peso                       \s
                  89  	EUR Euro	                →	JPY Yen japonés                \s
                  90  	JPY Yen japonés	            →	EUR Euro                       \s
                  100- SALIR                                                           \s
        
                """;
        //Se crea un opjeto de la clase Scanner se usa para que el ususrio ingrese datos desde el teclado
        Scanner lectura = new Scanner(System.in);
        int opcion;
        // es buncle do - while qie se va a repetir por lo menos una vez mientras la condicion while sea verdadera
        do {
            //muestra el menu principal
            System.out.println(menu);

            // Se usa para que el usuario ingrese una opcion logica
            boolean entradaValida = false;
            opcion = -1;

            // El bucle se repite mientras la etrada no sea valida
            while (!entradaValida) {
                System.out.print(Colores.NEGRITA + Colores.VERDE +
                        "Ingrese el número del menú que desea hacer la conversión" + Colores.RESET +
                        ("// ➡\uFE0F 100 PARA SALIR //: "));

                //Lee toda la linea que ingresa el usuario trim elimina espacios al comienzo y al final
                String input = lectura.nextLine().trim();

                // Si solo presionó Enter, volver a pedir sin mensaje
                if (input.isEmpty()) {
                    continue;
                }

                try {
                    opcion = Integer.parseInt(input);
                    entradaValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("⚠\uFE0F Información no válida. Por favor, \n\uD83D\uDD22 INGRESE UN NÚMERO, NO LETRAS NI SÍMBOLOS.");
                }
            }

            // Procesar la opción seleccionada
            if (opcion >= 1 && opcion <= 90) {
                String monedaBase = MenuMaperMoneda.obterMonedaBase(opcion);
                String monedaDestino = MenuMaperMoneda.obtenerMonedaDestino(opcion);
                String nombreMonedaBase = MenuMaperMoneda.obtenerNombreMoneda(monedaBase);
                String nombreMonedaDestino = MenuMaperMoneda.obtenerNombreMoneda(monedaDestino);

                //muestra al usuario la moneda base que quiere convertir a la moneda destino
                System.out.println(Colores.AMARILLO + "****************************************************************************************************" + Colores.RESET);
                System.out.println("          Va a realizar la conversión de: " + monedaBase + " " + nombreMonedaBase +
                        " → " + monedaDestino + " " + nombreMonedaDestino + "         ");
                System.out.println(Colores.AMARILLO + "****************************************************************************************************" + Colores.RESET);

                //le solicita al usuario que ingrese el valor que quiere convertir
                System.out.println(Colores.VERDE + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°" + Colores.RESET);
                System.out.print("Ingrese el valor que desea convertir en " + monedaBase + " " + nombreMonedaBase + " ");

                // Validación del monto que no este vacio, que sea un numero valido y que no sea negativo
                double monto;
                //bucle While  se para cuando el usuario ingrese un valor valido
                while (true) {
                    String montoInput = lectura.nextLine().trim();
                    if (montoInput.isEmpty()) {
                        System.out.print("El campo no puede estar vacío. Ingrese un valor: ");
                        continue;
                    }
                    try {
                        monto = Double.parseDouble(montoInput);
                        if (monto >= 0) {
                            break;
                        } else {
                            System.out.print("El monto no puede ser negativo. Ingrese un valor válido: ");
                        }
                    } catch (NumberFormatException e) {
                        System.out.print("⚠\uFE0F Monto inválido. Ingrese un número: ");
                    }
                }

                // Se crea la instancia para realizar la conversión
                ConversorMoneda conversion = new ConversorMoneda();
                TasaDeCambio tasa = conversion.opcionSeleccionada(opcion, monto);

                //Se verifica que la llamada sea exitosa e ingresa al switch
                if (tasa != null) {
                    double TasaCambio = switch (monedaDestino) {
                        case "USD" -> tasa.conversion_rates().USD();
                        case "ARS" -> tasa.conversion_rates().ARS();
                        case "CAD" -> tasa.conversion_rates().CAD();
                        case "CHF" -> tasa.conversion_rates().CHF();
                        case "CLP" -> tasa.conversion_rates().CLP();
                        case "CNY" -> tasa.conversion_rates().CNY();
                        case "COP" -> tasa.conversion_rates().COP();
                        case "DOP" -> tasa.conversion_rates().DOP();
                        case "EUR" -> tasa.conversion_rates().EUR();
                        case "JPY" -> tasa.conversion_rates().JPY();
                        default -> 0.0;
                    };

                    double resultado = monto * TasaCambio;

                    //Imprime el resultado
                    System.out.println(Colores.CYAN + "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&" + Colores.RESET);
                    System.out.printf("La conversión es:         %s%.6f %s = %.6f %s%s%n",
                            Colores.MAGENTA + Colores.NEGRITA,
                            monto,
                            monedaBase + " " + nombreMonedaBase,
                            resultado,
                            monedaDestino + " " + nombreMonedaDestino + "               ",
                            Colores.RESET);
                    System.out.println(Colores.CYAN + "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&" + Colores.RESET);

                    // Crea un objeto y guarda la conversion realizada
                    RegistroConversion registro = new RegistroConversion(
                            opcion,
                            monedaBase,
                            monedaDestino,
                            monto,
                            resultado,
                            tasa
                    );

                    try {
                        GeneradorDeArchivoJson generador = new GeneradorDeArchivoJson();
                        generador.guardarJson(registro);
                        System.out.println(" Conversión registrada en archivo diario.");

                    //evita si hay un error que el programa se caiga
                    } catch (Exception e) {
                        System.err.println(" Error al guardar el archivo JSON: " + e.getMessage());
                    }

                    // Pausa
                    System.out.println("\nPresiona Enter para continuar...");
                    lectura.nextLine(); // Espera explícita de Enter

                } else {
                    System.out.println("No se pudo obtener la tasa de cambio.");
                }

            } else if (opcion != 100) {
                System.out.println("Opción no válida. Por favor ingrese una opción entre 1 y 90, o 100 para salir.");
            }

        //para cuando se de la opcion de 100 muestre la informacion de despedida de la aplicacion
        } while (opcion != 100);

        System.out.println(Colores.MAGENTA + "                                                       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + Colores.RESET);
        System.out.println(Colores.AZUL + "                                                            !!!Gracias por usar el convertidor de moneda CFPALACI ¡¡¡" + Colores.RESET);
        System.out.println(Colores.MAGENTA + "                                                       $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + Colores.RESET);
        lectura.close();
    }
}