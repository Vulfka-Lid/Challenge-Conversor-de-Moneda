# 💰 Challenge: Conversor de Moneda - Alura Latam

Este es un proyecto de consola desarrollado en Java para el Challenge del programa **Oracle Next Education (ONE)**. El objetivo es realizar conversiones de divisas en tiempo real consumiendo una API externa.

## 📋 Características

* **Tasas Reales:** Utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener datos actualizados.
* **Interfaz Dinámica:** Menú interactivo por consola.
* **Conversión Flexible:** Permite convertir entre Dólares, Pesos Chilenos y cualquier otra moneda del mundo (mediante códigos ISO 4217).
* **Manejo de JSON:** Implementación de la librería **Gson** de Google para el parseo de datos.

## 🚀 Tecnologías Utilizadas

* **Java JDK 17** (o superior)
* **Java HTTP Client** (Para peticiones de red)
* **Gson 2.10.1** (Para manejo de JSON)
* **ExchangeRate-API**

## 🛠️ Estructura del Proyecto

El proyecto se divide en tres clases principales:
1. **`Principal.java`**: Contiene el menú y la lógica de interacción con el usuario.
2. **`Conversion.java`**: Se encarga de realizar las solicitudes HTTP a la API.
3. **`Moneda.java`**: Un `record` de Java que mapea la respuesta de la API.



## ⚙️ Cómo Ejecutar el Proyecto

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/Vulfka-Lid/Challenge-Conversor-de-Moneda.git](https://github.com/Vulfka-Lid/Challenge-Conversor-de-Moneda.git)

   Configurar la API Key:

2. **Regístrate en ExchangeRate-API.**

Coloca tu API Key en la clase Conversion.java dentro de la URL de conexión.

3. **Importar la librería Gson:**

Asegúrate de añadir el JAR de Gson a las librerías de tu proyecto o usar la dependencia en tu archivo Maven/Gradle.

4. **Ejecutar:**

Inicia la clase Principal.java.


👤 Autor
Nicolas (Vulfka-Lid) - GitHub Profile
