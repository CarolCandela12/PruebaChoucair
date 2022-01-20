#Author: carol.garces@cun.edu.co
@Empleos
Feature: Automatizacion portal empleos Choucair

  @tag1
  Scenario Outline: Validar registro de usuario en opcion de empleos, de forma manual
    Given Ingreso a la pagina de Choucair
    And Ingreso al portal de empleos
    When Registro un usuario con los datos <paisRegistro><paisNacimiento><fechaNacimiento><nivelEstudios><lugarResidencia>
		Then Valido el registro exitoso del usuario
		
    Examples: 
      | paisRegistro | paisNacimiento| fechaNacimiento |nivelEstudios|lugarResidencia|
      ##@externaldata@./src/test/resources/dataDriven/DataEmpleo.xlsx@tag1
|"Colombia"|"Colombia"|"09/08/1997"|"Profesional"|"Bogotá"|
|"Colombia"|"Colombia"|"09/08/1996"|"Profesional"|"Bogotá"|
