public class MenuMaperMoneda {

    private static class OpcionMenu {
        final int numero;
        final String origen;
        final String destino;

        OpcionMenu(int numero, String origen, String destino) {
            this.numero = numero;
            this.origen = origen;
            this.destino = destino;
        }
    }

    // Fuente única de verdad: el menú real
    private static final OpcionMenu[] MENU = {
            new OpcionMenu(1, "USD", "ARS"),
            new OpcionMenu(2, "ARS", "USD"),
            new OpcionMenu(3, "USD", "CAD"),
            new OpcionMenu(4, "CAD", "USD"),
            new OpcionMenu(5, "USD", "CHF"),
            new OpcionMenu(6, "CHF", "USD"),
            new OpcionMenu(7, "USD", "CLP"),
            new OpcionMenu(8, "CLP", "USD"),
            new OpcionMenu(9, "USD", "CNY"),
            new OpcionMenu(10, "CNY", "USD"),
            new OpcionMenu(11, "USD", "COP"),
            new OpcionMenu(12, "COP", "USD"),
            new OpcionMenu(13, "USD", "DOP"),
            new OpcionMenu(14, "DOP", "USD"),
            new OpcionMenu(15, "USD", "EUR"),
            new OpcionMenu(16, "EUR", "USD"),
            new OpcionMenu(17, "USD", "JPY"),
            new OpcionMenu(18, "JPY", "USD"),
            new OpcionMenu(19, "ARS", "CAD"),
            new OpcionMenu(20, "CAD", "ARS"),
            new OpcionMenu(21, "ARS", "CHF"),
            new OpcionMenu(22, "CHF", "ARS"),
            new OpcionMenu(23, "ARS", "CLP"),
            new OpcionMenu(24, "CLP", "ARS"),
            new OpcionMenu(25, "ARS", "CNY"),
            new OpcionMenu(26, "CNY", "ARS"),
            new OpcionMenu(27, "ARS", "COP"),
            new OpcionMenu(28, "COP", "ARS"),
            new OpcionMenu(29, "ARS", "DOP"),
            new OpcionMenu(30, "DOP", "ARS"),
            new OpcionMenu(31, "ARS", "EUR"),
            new OpcionMenu(32, "EUR", "ARS"),
            new OpcionMenu(33, "ARS", "JPY"),
            new OpcionMenu(34, "JPY", "ARS"),
            new OpcionMenu(35, "CAD", "CHF"),
            new OpcionMenu(36, "CHF", "CAD"),
            new OpcionMenu(37, "CAD", "CLP"),
            new OpcionMenu(38, "CLP", "CAD"),
            new OpcionMenu(39, "CAD", "CNY"),
            new OpcionMenu(40, "CNY", "CAD"),
            new OpcionMenu(41, "CAD", "COP"),
            new OpcionMenu(42, "COP", "CAD"),
            new OpcionMenu(43, "CAD", "DOP"),
            new OpcionMenu(44, "DOP", "CAD"),
            new OpcionMenu(45, "CAD", "EUR"),
            new OpcionMenu(46, "EUR", "CAD"),
            new OpcionMenu(47, "CAD", "JPY"),
            new OpcionMenu(48, "JPY", "CAD"),
            new OpcionMenu(49, "CHF", "CLP"),
            new OpcionMenu(50, "CLP", "CHF"),
            new OpcionMenu(51, "CHF", "CNY"),
            new OpcionMenu(52, "CNY", "CHF"),
            new OpcionMenu(53, "CHF", "COP"),
            new OpcionMenu(54, "COP", "CHF"),
            new OpcionMenu(55, "CHF", "DOP"),
            new OpcionMenu(56, "DOP", "CHF"),
            new OpcionMenu(57, "CHF", "EUR"),
            new OpcionMenu(58, "EUR", "CHF"),
            new OpcionMenu(59, "CHF", "JPY"),
            new OpcionMenu(60, "JPY", "CHF"),
            new OpcionMenu(61, "CLP", "CNY"),
            new OpcionMenu(62, "CNY", "CLP"),
            new OpcionMenu(63, "CLP", "COP"),
            new OpcionMenu(64, "COP", "CLP"),
            new OpcionMenu(65, "CLP", "DOP"),
            new OpcionMenu(66, "DOP", "CLP"),
            new OpcionMenu(67, "CLP", "EUR"),
            new OpcionMenu(68, "EUR", "CLP"),
            new OpcionMenu(69, "CLP", "JPY"),
            new OpcionMenu(70, "JPY", "CLP"),
            new OpcionMenu(71, "CNY", "COP"),
            new OpcionMenu(72, "COP", "CNY"),
            new OpcionMenu(73, "CNY", "DOP"),
            new OpcionMenu(74, "DOP", "CNY"),
            new OpcionMenu(75, "CNY", "EUR"),
            new OpcionMenu(76, "EUR", "CNY"),
            new OpcionMenu(77, "CNY", "JPY"),
            new OpcionMenu(78, "JPY", "CNY"),
            new OpcionMenu(79, "COP", "DOP"),
            new OpcionMenu(80, "DOP", "COP"),
            new OpcionMenu(81, "COP", "EUR"),
            new OpcionMenu(82, "EUR", "COP"),
            new OpcionMenu(83, "COP", "JPY"),
            new OpcionMenu(84, "JPY", "COP"),
            new OpcionMenu(85, "DOP", "EUR"),
            new OpcionMenu(86, "EUR", "DOP"),
            new OpcionMenu(87, "DOP", "JPY"),
            new OpcionMenu(88, "JPY", "DOP"),
            new OpcionMenu(89, "EUR", "JPY"),
            new OpcionMenu(90, "JPY", "EUR")
    };

    // Mapas para acceso rápido, Estas dos líneas declaran e inicializan dos mapas vacíos que probablemente se llenarán después
    private static final java.util.Map<Integer, String> BASE_MAP = new java.util.HashMap<>();
    private static final java.util.Map<Integer, String> DESTINO_MAP = new java.util.HashMap<>();

    static {
        for (OpcionMenu op : MENU) {
            BASE_MAP.put(op.numero, op.origen);
            DESTINO_MAP.put(op.numero, op.destino);
        }
    }
    // se puede llamar desde cualquier otra clase y el meodo pertenece a una clase en si, se puede llamar sin tener una clase
    public static String obterMonedaBase(int opcion) {
        return BASE_MAP.get(opcion);
    }

    public static String obtenerMonedaDestino(int opcion) {
        return DESTINO_MAP.get(opcion);
    }

    public static boolean esOpcionValida(int opcion) {
        return BASE_MAP.containsKey(opcion);
    }
    //metodo para que se crea para que muestre lo que va a convertir despues de que el usuario elige la moneda
    public static String obtenerNombreMoneda(String codigo) {
        return switch (codigo) {
            case "USD" -> "Dólar estadounidense";
            case "ARS" -> "Peso argentino";
            case "CAD" -> "Dólar canadiense";
            case "CHF" -> "Franco suizo";
            case "CLP" -> "Peso chileno";
            case "CNY" -> "Yuan renminbi chino";
            case "COP" -> "Peso colombiano";
            case "DOP" -> "Peso dominicano";
            case "EUR" -> "Euro";
            case "JPY" -> "Yen japonés";
            default -> "Moneda desconocida";
        };

    }
}