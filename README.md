# 📚 Librería Movimiento (Java)

## 🎯 Descripción

Esta librería en Java permite simular el **movimiento rectilíneo** con aceleración constante, cubriendo tanto **MRU (Movimiento Rectilíneo Uniforme)** como **MRUA (Movimiento Rectilíneamente Acelerado)**.  
Está diseñada con fines educativos o como base para simuladores físicos en aplicaciones Java.

Incluye una clase principal (`Movimiento`) que encapsula la lógica del comportamiento físico de un cuerpo en movimiento.

---

## 🔍 Explicación del código

### 📦 Paquete
```java
package Fisica;
```

### 🧩 Clase principal: `Movimiento`

La clase representa un cuerpo que se mueve en una dimensión, con los siguientes atributos:

| Atributo | Descripción |
|----------|-------------|
| `x0`     | Posición inicial |
| `v0`     | Velocidad inicial |
| `a`      | Aceleración constante |

---

### 🛠️ Métodos

| Método | Descripción |
|--------|-------------|
| `posicion(double t)` | Calcula la posición final en el tiempo `t`. |
| `velocidad(double t)` | Calcula la velocidad en el tiempo `t`. |
| `energiaCinetica(double masa, double t)` | Retorna la energía cinética en un instante dado. |
| `distanciaRecorrida(double tInicio, double tFin)` | Devuelve la distancia total recorrida entre dos instantes. |
| `esMRU()` | Verifica si el movimiento es uniforme (aceleración cero). |
| `esMRUA()` | Verifica si el movimiento es uniformemente acelerado. |
| `esMovimientoValido()` | Evalúa si hay movimiento (no está completamente en reposo). |
| `generarVelocidades(tInicio, tFin, intervalo)` | Genera un arreglo con velocidades desde `tInicio` hasta `tFin` cada `intervalo` segundos. |

### 🧪 Métodos de acceso (getters)

- `getX0()`, `getV0()`, `getA()`: permiten obtener los valores originales del objeto `Movimiento`.

---

## 📦 Instrucciones para importar la librería (`Movimiento.jar`)

### En NetBeans:

1. Exporta tu proyecto como `.jar`:
   - Clic derecho en el proyecto > **Clean and Build**.
   - Encuentra el `.jar` en la carpeta `/dist`.
2. En tu nuevo proyecto:
   - Clic derecho > **Properties** > **Libraries**.
   - Pestaña **Compile** > clic en **Add JAR/Folder**.
   - Selecciona `Movimiento.jar`.

### En otros IDEs (Eclipse, manual):

1. Coloca el archivo `Movimiento.jar` en una carpeta `lib/` del proyecto.
2. Agrega el `.jar` al classpath o al archivo de configuración del IDE.

---

## ✅ Requisitos

- JDK 8 o superior
- IDE como NetBeans, Eclipse o IntelliJ (opcional)

---

## 👨‍💻 Autores

- **Jonathan Eleazar Díaz Reyes**
- **Gael Martínez Cruz**

---

## 📄 Licencia

Esta librería puede utilizarse con fines educativos y personales.  
Modificaciones y distribuciones están permitidas **siempre que se dé crédito a los autores**.

## Enlace a Youtube (Explicacion de importacion y uso )

## Enlace del JavaDoc (Github Pages)

https://gaelito-dev.github.io/Libreria-Fisica-MRU/


