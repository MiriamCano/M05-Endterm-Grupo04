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