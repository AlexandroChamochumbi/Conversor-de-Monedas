# 💱 Conversor de Monedas - Challenge ONE

## 📌 Descripción

Aplicación de consola en Java que realiza conversiones de moneda con tasas de cambio en tiempo real desde **ExchangeRate-API**.

Desarrollado como parte del Challenge de Java del programa **Oracle Next Education (ONE)**.

La aplicación ofrece un menú intuitivo con opciones predefinidas, manejo robusto de errores e historial de conversiones.

---

## ✨ Características

- ✅ Menú interactivo por consola
- ✅ Conversión entre pares de monedas predefinidos
    - USD ↔ ARS
    - USD ↔ BRL
    - USD → PEN
- ✅ Consumo de API ExchangeRate-API con HttpClient
- ✅ Parseo de respuestas JSON
- ✅ Manejo avanzado de errores (opciones inválidas, entradas no numéricas, montos negativos)
- ✅ Historial de conversiones con timestamp

---

## 🚀 Guía de uso

1. Clona el repositorio
2. Abre el proyecto en tu IDE favorito (IntelliJ IDEA, Eclipse, VS Code)
3. Configura tu API Key en la clase `CurrencyService`
4. Ejecuta `Main.java`
5. Selecciona una opción del menú
6. Ingresa el monto a convertir
7. Visualiza el resultado
8. Consulta el historial (opción 6) o sal de la aplicación (opción 7)

---

## ⚙️ Requisitos

- Java 17+
- Conexión a Internet
- API Key de ExchangeRate-API

---

## 🛠️ Tecnologías

| Tecnología | Uso |
|---|---|
| **Java** | Lenguaje principal |
| **HttpClient** | Solicitudes HTTP |
| **Gson** | Parseo JSON |
| **java.time** | Manejo de fechas |
| **Scanner** | Entrada de consola |

---

## 🎓 Contexto académico

Este proyecto fue desarrollado como parte del Challenge Back End Java de **Oracle Next Education (ONE)**, practicando:

- Consumo de APIs
- Manejo de JSON
- Programación orientada a objetos
- Manejo robusto de errores
- Buenas prácticas en Java