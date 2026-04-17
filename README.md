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

## Tecnologías

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