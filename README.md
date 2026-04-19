# M05-Endterm-Grupo04
M05-0485 Endterm Grupo 04

Proyecto en Java para practicar desarrollo dirigido por tests (TDD), uso de Git/GitHub y trabajo colaborativo en equipo.

## 👥 Autores

| Alumno | Usuario GitHub |
|---|---|
| Miriam | [@MiriamCano](https://github.com/) |
| Deme | [@edeme-byte](https://github.com/) |
| Luis Alberto Dávalos Castán | [@kstor10](https://github.com/Kstor10) |

## Objetivo

Desarrollar una clase Vehículo utilizando metodología TDD, con pruebas unitarias en JUnit y trabajo colaborativo mediante Git y GitHub.

## 👥 Gestión y Roles del Equipo

Para este proyecto, hemos adoptado una estructura de roles profesionales para garantizar la calidad del software y la agilidad en las entregas:

| Rol | Responsable | Aportaciones Clave |
| :--- | :--- | :--- |
| **Arquitecto & DevOps** | **Miriam** | Configuración del entorno, reglas de protección de rama y despliegue del pipeline de **Integración Continua (CI)** con GitHub Actions. |
| **QA & Analista** | **Alberto** | Diseño de la estrategia **TDD**, redacción de requisitos técnicos, documentación del proyecto y control de calidad del código. |
| **Lead Developer** | **Deme** | Diseño de la arquitectura de clases (**UML**) y liderazgo en la implementación técnica de la lógica de negocio. |

### 🛠️ Flujo de Trabajo (Agile)
Hemos implementado un flujo basado en **Feature Branches** y **Pull Requests**:
1. Ningún cambio llega a `main` sin pasar por una revisión cruzada.
2. El código es validado automáticamente por nuestro "robot" (CI) para asegurar que los cambios no rompen funcionalidades previas.
3. Mantenemos una trazabilidad total entre los diagramas de diseño y la implementación final en Java.


## 🛠️ Tecnologías Utilizadas

El proyecto se ha desarrollado bajo un stack profesional de Java para garantizar la portabilidad y la automatización:

* **Lenguaje:** Java.
* **Gestor de Dependencias:** Maven.
* **Testing:** JUnit 5.10.0.
* **CI/CD:** GitHub Actions (Pipeline de validación automática en cada Pull Request).
* **Modelado:** UML (Diagramas de Clases, Casos de Uso y Actividad).

# Proyecto Vehículo - TDD

## Requisitos de Negocio (MVP)

El objetivo de este proyecto es implementar una clase `Vehiculo` robusta utilizando Test Driven Development (TDD).

### Atributos del Vehículo
* **marca** (String): Marca del fabricante.
* **modelo** (String): Modelo específico.
* **velocidadMaxima** (int): Límite físico de velocidad del vehículo.
* **velocidadActual** (int): Estado de la velocidad en tiempo real (inicia en 0).

### Comportamiento (Métodos)
1. **acelerar(int incremento):** * Aumenta la velocidad actual.
    * **Restricción:** No puede superar la `velocidadMaxima`.
    * **Restricción:** El incremento no puede ser negativo.
2. **frenar(int decremento):**
    * Disminuye la velocidad actual.
    * **Restricción:** La velocidad actual nunca puede ser inferior a 0.
    * **Restricción:** El decremento no puede ser negativo.

## 📚 Ejercicio 2: Sistema Multimedia (Kiosko)

En este módulo se aplica la **Programación Orientada a Objetos (POO)** avanzada para gestionar un sistema de préstamos multimedia.

### Arquitectura de Clases
* **Clase Abstracta `Documento`:** Funciona como base para todos los productos, gestionando la disponibilidad y generando una referencia única mediante `System.nanoTime()`.
* **Jerarquía de Herencia:** Implementación de clases especializadas: `Libro`, `RevistaCientifica`, `Audio` y `Video`.
* **Interfaz `Consultable`:** Define el contrato para la consulta digital mediante el método `getAbstract(int inicio, int fin)`.
* **Polimorfismo:** La clase `Ebook` extiende de `Libro` e implementa `Consultable`, permitiendo que un libro digital sea tratado como documento y como recurso consultable simultáneamente.

## 📊 Documentación Visual

Los diagramas técnicos se encuentran en la carpeta `/diagramas` y garantizan la trazabilidad entre el diseño y el código final:

| Diagrama | Archivo | Descripción |
| :--- | :--- | :--- |
| **Casos de Uso** | `Diagrama de caso de uso.png` | Interacciones de Alumnos y Profesores con el Kiosko. |
| **Actividad** | `Diagrama de actividad.png` | Flujo lógico del proceso de "Renovación de Préstamo". |
| **Clases (UML)** | `Diagrama de clases.jpeg` | Estructura técnica, herencia y visibilidad `#protected` de las clases Java. |


## ⚙️ Instalación y Ejecución

Para replicar el entorno de desarrollo y verificar los tests:

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/MiriamCano/M05-Endterm-Grupo04.git](https://github.com/MiriamCano/M05-Endterm-Grupo04.git)
    ```
2.  **Compilar y descargar dependencias:**
    ```bash
    mvn clean compile
    ```
3.  **Ejecutar la suite de tests unitarios (TDD):**
    ```bash
    mvn test
    ```
    *Actualmente el proyecto cuenta con un **BUILD SUCCESS** que valida 5 tests críticos del Vehículo.*