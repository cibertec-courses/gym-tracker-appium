package edu.pe.gymtracker.stepdefinitions;

import edu.pe.gymtracker.utils.DriverManager;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExerciseStepDefinitions {

    static{
        System.out.println("STEPS CARGADOs");
    }

    @Given("que el usuario abre la app GymTracker")
    public void que_el_usuario_abre_la_app_GymTracker() {}

    @When("presiona el boton de agregar ejercicio")
    public void presiona_el_boton_de_agregar_ejercicio() {

        DriverManager.getDriver()
                .findElement(AppiumBy.xpath("//android.widget.Button"))
                .click();

    }

    @And("ingresa el nombre {string}")
    public void ingresa_el_nombre(String nombre) {}

    @And("selecciona el grupo muscular {string}")
    public void selecciona_el_grupo_muscular(String grupo) {}

    @And("selecciona el tipo {string}")
    public void selecciona_el_tipo(String tipo) {}

    @And("guarda el ejercicio")
    public void guarda_el_ejercicio() {}

    @Then("deberia ver el ejercicio {string} en la lista")
    public void deberia_ver_el_ejercicio_en_la_lista(String nombre) {}
}
