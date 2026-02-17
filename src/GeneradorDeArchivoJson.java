import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GeneradorDeArchivoJson {

    // Guardamos los archivos en la RAÍZ del proyecto (visible en IntelliJ), se define la constante
    private static final String DIRECTORIO_HISTORIAL = ".";

    public void guardarJson(RegistroConversion registro) {
        try {
            // Crear la carpeta 'historial' si no existe (opcional, pero útil para organizar)
            new File(DIRECTORIO_HISTORIAL + "/historial").mkdirs();

            // Generar nombre del archivo con la fecha de hoy
            String fechaHoy = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
            String rutaArchivo = DIRECTORIO_HISTORIAL + "/conversiones_" + fechaHoy + ".json";

            // Lista para almacenar todas las conversiones del día
            List<RegistroConversion> conversionesDelDia = new ArrayList<>();

            // Si el archivo ya existe, cargar su contenido
            if (Files.exists(Paths.get(rutaArchivo))) {
                try (FileReader reader = new FileReader(rutaArchivo)) {
                    Gson gson = new Gson();
                    conversionesDelDia = gson.fromJson(reader, new TypeToken<List<RegistroConversion>>(){}.getType());
                    if (conversionesDelDia == null) {
                        conversionesDelDia = new ArrayList<>();
                    }

                // se crea esta excepcion por si el archivo esta corrupto o  es invalido
                } catch (Exception e) {
                    System.err.println(" Advertencia: No se pudo leer el archivo existente. Se iniciará uno nuevo.");
                    conversionesDelDia = new ArrayList<>();
                }
            }

            // Agregar la nueva conversión a la lista
            conversionesDelDia.add(registro);

            // Guardar toda la lista actualizada en el archivo
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            try (FileWriter writer = new FileWriter(rutaArchivo)) {
                gson.toJson(conversionesDelDia, writer); //serializa la lista completa y la escribe en el archivo
            }

            System.out.println(" Conversión registrada en: " + rutaArchivo);

        //manejo de errores
        } catch (Exception e) {
            System.err.println("Error al guardar la conversión en el archivo diario: " + e.getMessage());
        }
    }
}