Feature: Crud ejercicios

  Scenario: Crear un nuevo ejercicio correctamente
    Given que el usuario abre la app GymTracker
    When presiona el boton de agregar ejercicio
    And ingresa el nombre "Press Banca"
    And selecciona el grupo muscular "Pecho"
    And selecciona el tipo "Fuerza"
    And guarda el ejercicio
    Then deberia ver el ejercicio "Press Banca" en la lista