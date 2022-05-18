# language:es
# Autor: Camilo Ortiz
  @stories
  Característica:
    Como paciente
    Quiero realizar la solicitud de una cita médica
    A través del sistema de Administración de Hospitales

    @scenario1
    Esquema del escenario: Realizar el Registro de un Doctor
      Dado que Carlos necesita registrar un nuevo doctor
      Cuando el realiza el registro del mismo en el aplicativo de Administracion de Hospitales
        | nombre | apellidos | telefono | tipoDocumento | numeroDocumento | tipo |
        |<nombre>|<apellidos>|<telefono>|<tipoDocumento>|<numeroDocumento>|<tipo>|
      Entonces el verifica que se presente en pantalla el mensaje Guardado:
      Ejemplos:
        |nombre|  apellidos  | telefono |   tipoDocumento    |numeroDocumento| tipo |
        |Camilo|Ortiz Fajardo|3057346154|Cédula de ciudadanía|   1001049313  |Doctor|

    @scenario2
    Esquema del escenario: Realizar el Registro de un Paciente
      Dado que Carlos necesita registrar un nuevo paciente
      Cuando el realiza el registro del mismo en el aplicativo de Administracion de Hospitales
        | nombre | apellidos | telefono | tipoDocumento | numeroDocumento | tipo |
        |<nombre>|<apellidos>|<telefono>|<tipoDocumento>|<numeroDocumento>|<tipo>|
      Entonces el verifica que se presente en pantalla el mensaje Guardado:
      Ejemplos:
        |nombre|   apellidos    | telefono |   tipoDocumento    |numeroDocumento|  tipo  |
        | Nicol|Mateus Rodriguez|3008149777|Cédula de ciudadanía|   1001049306  |Paciente|

    @scenario
    Esquema del escenario: Realizar el Agendamiento de una Cita
      Dado que Carlos necesita asistir al medico
      Cuando el realiza el agendamiento de una Cita
        | diaCita | documentoPaciente | documentoDoctor | observaciones |
        |<diaCita>|<documentoPaciente>|<documentoDoctor>|<observaciones>|
      Entonces el verifica que se presente en pantalla el mensaje Guardado:
      Ejemplos:
        | diaCita  |documentoPaciente|documentoDoctor|      observaciones     |
        |05/18/2022|   1001049308    |   1001049309  |Cita de Medicina General|
