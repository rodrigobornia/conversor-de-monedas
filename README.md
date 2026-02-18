# CONVERTIDOR_DE_MONEDAS_CFPALACI
# 💱 Convertidor de Monedas – Tasa de Cambio  
**Desarrollado por Carlos Fernando Palacios Gracia (CFPALACI)**

[![Estado del Proyecto](https://img.shields.io/badge/Estado-Completado-brightgreen)]()
[![Lenguaje](https://img.shields.io/badge/Lenguaje-Java%2017-blue)]()
[![API](https://img.shields.io/badge/API-ExchangeRate--API-orange)]()
[![Sistema Operativo](https://img.shields.io/badge/SO-Windows%2011-lightgrey)]()

> **Aplicación de consola en Java** que permite convertir entre más de 90 monedas internacionales utilizando tasas de cambio en tiempo real. Ideal para usuarios que necesitan hacer conversiones rápidas, con historial persistente y una experiencia intuitiva.

---

## 📌 Descripción

Este convertidor de monedas es una herramienta interactiva desarrollada en **Java 17**, que permite al usuario realizar conversiones entre distintas divisas mediante una interfaz de menú sencilla. Al iniciar, el programa da la bienvenida al usuario y muestra un **menú con 90 opciones de monedas** para elegir tanto la moneda de origen como la de destino.

Tras seleccionar las monedas, el usuario ingresa un monto y recibe inmediatamente el resultado de la conversión. El programa es cíclico: tras cada operación, vuelve al menú principal al presionar **Enter**, permitiendo múltiples conversiones sin reiniciar. Para salir, basta con ingresar la opción **100**, momento en el que el sistema muestra un mensaje de despedida personalizado.

Además, **cada conversión se registra automáticamente** en un archivo `historial_conversiones.json`, organizado por fecha y hora, para llevar un control detallado del historial del usuario.

---

## 🔑 Características Principales

- **Bienvenida personalizada**: Mensaje inicial claro y amigable al iniciar la aplicación.
- **Menú interactivo con 90+ monedas**: Selección numerada de monedas de origen y destino.
- **Conversión dinámica en tiempo real**:
  - Ingreso de monto a convertir.
  - Resultado detallado: `Moneda Origen → Moneda Destino | Monto → Valor Convertido`.
- **Flujo continuo**: Permite realizar múltiples conversiones sin reiniciar la aplicación.
- **Finalización controlada**: Al ingresar la opción **100**, el programa termina mostrando:  
  `!!!Gracias por usar el convertidor de moneda CFPALACI !!!`
- **Validación robusta de entradas**:
  - Si se ingresa un valor no numérico:  
    `⚠️ Información no válida. Por favor...`
- **Manejo de excepciones**:
  - Control de errores en la conexión a la API (timeout, servicio no disponible, etc.).
  - Mensajes amigables que informan claramente el tipo de error.
- **Registro persistente en JSON**:
  - Cada conversión se guarda en `historial_conversiones.json`.
  - Estructura por fecha con: moneda origen, moneda destino, monto, resultado y hora exacta.

---

## 🛠️ Tecnologías Utilizadas

| Componente         | Detalle |
|--------------------|---------|
| **Lenguaje**        | Java 17 (`jdk-17.0.16`) |
| **API de Tasas**    | [ExchangeRate-API](https://www.exchangerate-api.com/) |
| **IDE**             | IntelliJ IDEA Community (`ideaIC-2025.2.3.exe`) |
| **Editores**        | Notepad++ |
| **Control de versiones** | Git y GitHub |
| **Sistema Operativo** | Windows 11 |
| **Librerías Java**  | `Scanner`, `FileWriter`, `FileReader`, `Gson`/`Jackson` (para JSON), manejo de excepciones personalizadas |
| **Conceptos aplicados** | Clases, encapsulamiento, herencia, bucles (`do-while`), manejo de arrays, getters/setters, validaciones, colores en consola |

---

## 📂 Estructura del Proyecto

- Código fuente en Java con arquitectura orientada a objetos.
- Archivo `historial_conversiones.json` generado automáticamente en la raíz del proyecto.
- Manejo modular del consumo de API y lógica de conversión.
- Interfaz de consola con mensajes claros y uso de colores para mejor experiencia.

---

## 🚀 Cómo Usarlo

1. Clona el repositorio:
   ```bash
   git clone https://github.com/rodrigobornia/conversor-de-monedas.git

2. Abre el proyecto en tu IDE de Java (recomendado: IntelliJ IDEA).
3. Asegúrate de tener conexión a internet para acceder a la API de tasas de cambio.
4. Ejecuta la clase principal y sigue las instrucciones en pantalla.

📈 Conclusión
Este proyecto fue desarrollado aplicando conocimientos adquiridos en clase como:

Programación orientada a objetos (POO)
Encapsulamiento, herencia y polimorfismo
Manejo de excepciones y validaciones
Consumo de APIs REST
Persistencia de datos en formato JSON
Además, se complementó con investigación personal para implementar mejoras como el uso de colores en consola, historial persistente y una experiencia de usuario más fluida. Cada etapa del desarrollo fue una oportunidad para reforzar y ampliar las habilidades en programación con Java.

