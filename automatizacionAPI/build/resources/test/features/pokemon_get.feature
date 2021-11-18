Feature: Yo como analista de calidad
  necesito certificar el correcto funcionamiento
  de la api pokemon
  para visualizar los datos de los pokemones
    Background:
      Given El usuario utiliza el microservicio

      Scenario:
        When El usuario trae la informacion del pokemon
        Then El usuario vera el codigo de respuesta <200>