# 📘 Ejercicio 2 – Procesamiento de Texto en Java

Este proyecto consiste en el desarrollo de **tres aplicaciones Java** que trabajan con **entrada y salida estándar**.  
El objetivo es demostrar cómo pequeños programas independientes pueden **encadenarse con tuberías (`|`)** para procesar texto de manera similar a los comandos de consola en Linux.

---

## 📂 Estructura del proyecto

- `lectorTexto.java` → Lee un archivo de texto y lo envía a la salida estándar.  
- `filtraLineas.java` → Filtra las líneas con más de **20 caracteres**.  
- `contadorPalabras.java` → Cuenta el número total de palabras en el texto recibido.  

Cada aplicación se puede ejecutar de forma independiente o encadenada.

---

## ⚙️ Requisitos previos

1. Tener instalado **Java JDK 17 o superior**.  
   - Verificar instalación con:
     ```bash
     java -version
     ```

2. Compilar el proyecto con **Maven**:
   ```bash
   mvn clean package
El archivo resultante se encuentra en:

bash
Copiar código
target/miapp.jar
Disponer de un archivo de prueba llamado entrada.txt.

🚀 Ejecución de cada aplicación
1️⃣ lectorTexto
Lee el archivo entrada.txt y muestra su contenido.

bash
Copiar código
java -cp target/miapp.jar lectorTexto entrada.txt
📌 Notas:

Si el archivo no existe, se mostrará un error y el programa terminará.

La salida se envía a STDOUT (pantalla o siguiente programa en la tubería).

2️⃣ filtraLineas
Filtra solo las líneas que tengan más de 20 caracteres.

bash
Copiar código
java -cp target/miapp.jar filtraLineas
📌 Notas:

Puede recibir texto manualmente (terminar con Ctrl+Z en Windows o Ctrl+D en Linux/Mac).

También puede usarse en tuberías para procesar la salida de lectorTexto.

3️⃣ contadorPalabras
Cuenta todas las palabras recibidas como entrada estándar.

bash
Copiar código
java -cp target/miapp.jar contadorPalabras
📌 Notas:

Una palabra se considera cualquier secuencia de caracteres separada por espacios.

Muestra el total acumulado al finalizar.

🔗 Ejecución combinada con tuberías
Los tres programas pueden conectarse mediante | para formar un pipeline completo:

bash
Copiar código
java -cp target/miapp.jar lectorTexto entrada.txt \
| java -cp target/miapp.jar filtraLineas \
| java -cp target/miapp.jar contadorPalabras
🔄 Flujo del proceso
lectorTexto → Lee el archivo y lo envía a la salida estándar.

filtraLineas → Filtra las líneas cortas, dejando solo las largas.

contadorPalabras → Cuenta cuántas palabras contienen las líneas filtradas.

👉 De este modo, se simula el funcionamiento de comandos como:

bash
Copiar código
cat entrada.txt | grep ... | wc -w
