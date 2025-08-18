# 🧠 Módulo de Gestión de Perfil y Portafolio  
### 📁 Célula 5 · Equipo 2 - Proyecto *Base Mente Conectada*

Este repositorio contiene la implementación del **Módulo de Gestión de Perfil y Portafolio**, como parte del desarrollo del sistema **Base Mente Conectada**. Fue elaborado por el **Equipo 2 de la Célula 5** con enfoque en prácticas de programación orientada a objetos usando **Java**.

🔍 El objetivo principal de este módulo es brindar al usuario herramientas para **gestionar su perfil personal y profesional**, incluyendo información básica, proyectos, y control de datos.

---

## ✅ Historias de Usuario Desarrolladas

A continuación se describen las 5 historias de usuario implementadas:

---

### 🧾 HU021C5 - Registro de Información Básica del Usuario

🧩 **Objetivo:**  
Permitir al usuario registrar información básica como nombre, especialidad y biografía.

🔧 **Flujo funcional:**
1. 🧑 Ingreso de nombre  
2. 🎓 Ingreso de especialidad  
3. 📝 Ingreso de biografía  
4. 📋 Visualización del resumen del usuario

📦 **Clases involucradas:**
- `HU021C5`: Clase principal
- `Persona1`: Contiene atributos y método para mostrar resumen

---

### 🧾 HU022C5 - Registro y Edición de Múltiples Perfiles

🧩 **Objetivo:**  
Registrar múltiples usuarios con sus datos personales y permitir edición posterior.

🔧 **Flujo funcional:**
1. 🧾 Ingreso del número de personas a registrar  
2. 👤 Captura de: nombre, teléfono, dirección y correo  
3. 📊 Visualización tipo tabla  
4. 🛠️ Edición por campo o completa (opcional)

🛡️ **Validaciones:**
- El campo `nombre` no puede quedar vacío  
- Solo se permiten ediciones dentro del rango válido

📦 **Clases involucradas:**
- `HU022C5`: Clase principal  
- `Persona`: Clase que almacena los atributos de usuario

---

### 🧾 HU023C5 - Gestión de Proyectos del Usuario

🧩 **Objetivo:**  
Permitir al usuario agregar y visualizar proyectos personales o académicos.

🔧 **Flujo funcional:**
1. 📈 Visualización de la cantidad de proyectos registrados  
2. ➕ Opción para agregar nuevo proyecto  
3. 📋 Opción para visualizar los proyectos guardados  
4. ❌ Salida del sistema

🗂️ **Atributos del proyecto:**
- Nombre  
- Descripción  
- Fecha (formato libre: día - mes - año)

📦 **Clases involucradas:**
- `HU023C5`: Clase de flujo
- `Proyecto1`: Clase contenedora de atributos del proyecto

---

### 🧾 HU024C5 - Registro de Proyectos con Identificador

🧩 **Objetivo:**  
Registrar proyectos con identificador único y visualizarlos en formato organizado.

🔧 **Flujo funcional:**
1. 🆔 Ingreso de ID del proyecto  
2. ➕ Registro de nombre, descripción y año  
3. 📋 Visualización en lista con numeración

🛡️ **Validaciones:**
- Se impide mostrar lista si no hay proyectos agregados

📦 **Clases involucradas:**
- `HU024C5`: Clase principal
- `Proyecto`: Clase que encapsula los atributos del proyecto

---

### 🧾 HU025C5 - Eliminación de Proyectos del Portafolio

🧩 **Objetivo:**  
Permitir al usuario eliminar proyectos existentes del portafolio con confirmación.

🔧 **Flujo funcional:**
1. 📋 Mostrar lista de proyectos  
2. ❌ Solicitar número de proyecto a eliminar  
3. ✅ Confirmar acción antes de borrado  
4. 🔄 Mostrar lista actualizada

🛡️ **Validaciones:**
- Verificación de clave existente en `HashMap`
- Confirmación del usuario antes de borrar
- Mensaje si el portafolio queda vacío

📦 **Clases involucradas:**
- `HU025C5`: Controlador del proceso
- `HashMap<Integer, String>` como estructura de almacenamiento

  🧾 HU027C5 - Almacenamiento de Múltiples Perfiles

🧩 Objetivo:
Implementar un mecanismo que permita almacenar múltiples perfiles en un arreglo, facilitando la organización de la información.

🔧 Flujo funcional:

📋 Usa una lista de objetos

➕ Permite agregar múltiples registros

📊 Muestra todos al final

🛡️ Validaciones:

Campos obligatorios: nombre, apellido, correo, activo

Fecha con LocalDate

📦 Clases involucradas:

HU027C5

Registros

🧾 HU029C5 - Exportación de Datos del Usuario

🧩 Objetivo:
Desarrollar una funcionalidad que permita exportar y mostrar los datos del usuario en formato estructurado a través de la consola.

🔧 Flujo funcional:

🗂️ Muestra datos en formato CSV

🖥️ Imprime como texto plano en consola

🏷️ Incluye encabezados para mayor claridad

📦 Clases involucradas:

HU029C5

Proyecto29C5

🧾 HU030C5 - Conteo de Proyectos

🧩 Objetivo:
Determinar y mostrar la cantidad total de proyectos registrados.

🔧 Flujo funcional:

🔢 Cuenta elementos en la lista

📊 Imprime el total

📭 Muestra mensaje si está vacío

📦 Clases involucradas:

Incluida dentro de HU032C5

🧾 HU032C5 - Filtrado de Proyectos por Año

🧩 Objetivo:
Permitir al usuario filtrar sus proyectos por año para facilitar la gestión y análisis del historial.

🔧 Flujo funcional:

📅 Solicita un año

🔍 Filtra los proyectos que coincidan

📋 Muestra solo los filtrados

📦 Clases involucradas:

HU032C5
🧾 HU033C5 - Verificación de Proyectos Duplicados

🧩 Objetivo:
Facilitar al usuario la verificación de proyectos duplicados, para evitar redundancias, mantener la base de datos limpia y mejorar la organización y eficiencia en la gestión de proyectos.

🔧 Flujo funcional:

📂 Solicita el nombre del archivo

💾 Guarda la información en el objeto

📋 Muestra el resultado al imprimir

📦 Clases involucradas:

HU033 (principal)

ProyectoHU33C5
Proyectos

🧾 HU034C5 - Identificación de Proyectos Duplicados

🧩 Objetivo:
Permitir al usuario identificar proyectos repetidos en su lista para eliminar duplicados.

🔧 Flujo funcional:

🔎 Compara nombres en la lista

⚠️ Marca duplicados

📋 Muestra advertencia al usuario

🛡️ Validaciones:

Solo se aceptan respuestas sí o no

Muestra los proyectos duplicados

📦 Clases involucradas:

Incluida dentro de HU032C5

---

## 🛠️ Herramientas y Configuración

| Requisito         | Versión o Herramienta         |
|-------------------|-------------------------------|
| ☕ **JDK**         | Java 17 o superior             |
| 🧪 **IDE**         | IntelliJ IDEA / Eclipse        |
| 📦 **Gestión**     | Java puro (sin frameworks externos) |
| 💾 **Almacenamiento** | Uso de colecciones (`ArrayList`, `HashMap`) en memoria |

---

## 👥 Autores

Este módulo fue desarrollado por el **Equipo 2 de la Célula 5** como parte del proyecto académico **Base Mente Conectada**.

👤 **Kevin Stiward Balvin García**  
📚 Participante en el desarrollo de todas las historias de usuario del módulo  
💻 Lenguaje: Java

👤 **Maria Alejandra Carmona Serna**  
📚 Participante en el desarrollo de todas las historias de usuario del módulo  
💻 Lenguaje: Java

👤 **Sebastian Garzon Villada**  
📚 Participante en el desarrollo de todas las historias de usuario del módulo  
💻 Lenguaje: Java

👤 **Maria Fernanda Montezuma Gonzalez**  
📚 Participante en el desarrollo de todas las historias de usuario del módulo  
💻 Lenguaje: Java

👤 **Tatiana Poddubnyak**  
📚 Participante en el desarrollo de todas las historias de usuario del módulo  
💻 Lenguaje: Java
---

📌 *Todos los códigos han sido probados en consola con entrada interactiva.*




