import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
// creamos un metodo para buscar
public class ConversorMoneda {
     public TasaDeCambio opcionSeleccionada(int opcion, double monto) {
         //mapea a la opcion de moneda base
         String monedaBase = MenuMaperMoneda.obterMonedaBase(opcion);

         //costruimos una condicion
         if (monedaBase == null) {
             System.out.println("La opcion no es valida");
             return null;
         }


        //construimos la url y el request
         URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c887ef8c9853ba704ccf582b/latest/" + monedaBase);
         HttpClient client = HttpClient.newHttpClient();
         HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        //creamos nuestro response enviamos la solicitud para tener respuesta
         try {
             HttpResponse<String> response =  client.send(request, HttpResponse.BodyHandlers.ofString());
             //verificar si la respuesta es valida
             if (response.statusCode() != 200) {
                 System.out.println("Error al consultar la API: Codigo " + response.statusCode());
                 return null;
             }

             //Convierte el JSON en un objeto TasaDeCambio
              TasaDeCambio tasa = new  Gson().fromJson(response.body(), TasaDeCambio.class);

             // verificar que el objeto y sus cambios no sean nulos
             if (tasa == null || !"success".equals(tasa.result()) || tasa.conversion_rates() == null) {
                 System.out.println("La API no devolvio datos validos" + response.body());
                 return null;
             }
             return tasa;

             //IOException si hay problemas de red (sin internet, timeout, etc.).
             //InterruptedException: si es interrumpido mientras espera la respuesta.
         } catch (IOException  | InterruptedException e ) {
             System.out.println("Error al consultar la API de tipos de cambios: " + e.getMessage());
             e.printStackTrace();
             return null;
         }

    }
}
