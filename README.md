# [SANTA CLAUS TOYS FACTORY](https://github.com/ofiucoder/My_PJSCTF)
Java-Project


# My_PJSCTF

## Descripción



Santa Claus top Factory es una aplicación desarrollada en Java que utiliza la consola como interfaz de usuario desde donde se van a integrar los datos utilizando la metodologia (MVC) Modelo, Vista, Controlador.

Los usuarios contaran con dos perfiles Santa o Elfo para realizar las tareas requeridas. la administración y el ingreso de los juguetes; con distintas funcionalidades para crear, leer, filtrar y eliminar registros de acuerdo a los requerimientos del Usuario.

Si la aplicación es utilizada por Santa entonces podrá obtener la lista de juguetes para niños buenos o la lista de juguetes para niños malos. También tendrá la posibilidad de guardar la lista completa de todos los juguetes en formato .csv.


![Santa Claus Toys Factory](images/toys.jpg)


##Objetivo
Acercarnos poco a poco la arquitectura clásica de Spring Boot. Aplicar el patrón de arquitectura MVC (Model-View-Controller) para estructurar la aplicación. Entender y aplicar el patrón repositorio y la inversión de dependencias.



## Descripción con SIPNOSIS del proyecto 

### Planificación del proyecto

>    1. Se realizo la planificacion utilizando [Jira](https://albertocasasofiuco-1730202167115.atlassian.net/jira/software/projects/PJSCTF/boards/5/backlog)
>    2. El projecto fue bajo el nombre  [My_PJSCTF](https://github.com/ofiucoder/My_PJSCTF)
>    3. Los diagramas se encuentran en un el archivo [projectoInsideOut.drawio](https://drive.google.com/file/d/1NVHUrTjYrLSpKclKpEaub4_o8r0NiPPG/view?usp=drive_link)

### Realización de Diagramas

>    - Clases
>    - Historia de Usuario
>    - Modelo Vista Controlador (MVC)



## Pre Requisitos (Que se necesita instalar para poder ejecutar el proyecto) 

>- Java 21
>- Maven
>    · Hamcrest (Dependencia)
>- Extensiones (VSC) - Visual Studio Code

>    · **Extension Pack for Java** del editor Microsoft <sup>este instalará los que aparecen a continuación</sup>

![ExtPk4Java](images/ExtPk4Java.png)

>        1. Language Support for Java(TM) by Red Hat
>        2. Debugger for Java
>        3. Test Runner for Java
>        4. Maven for Java
>        5. Gradle for Java
>        6. Project Manager for Java 
>        7. IntelliCode

>  - JUnit5 JAR Downloader extensión by Raj Kundu
>
>      
![Junit5](images/JUnit5.png)
>

## Pasos para la instalación 

De las URL que aparecen a continuación realizar las descargas de los paquetes correspondientes a los programas (Java 21, Apache Maven, VSC - Visual Studio Code) en este caso Java en la versión 21

### Java 21


- Windows

    https://www.oracle.com/es/java/technologies/downloads/#java21 (jdk 21)
    https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.exe (sha256)

- Mac

    https://download.oracle.com/java/21/latest/jdk-21_macos-x64_bin.dmg (sha256) (ojo procesador)
+
    https://formulae.brew.sh/formula/maven#default

#### Configuración variables de entorno windows


## Ejecución del test (Capturas de cobertura) 

## Diagramas Realizados 

  - DIAGRAMA DE CLASES

    ![Diagrama de Clases](images/projectoInsideOut-CLASES.webp)

```mermaid
---
title: ABSTRACTIONS DIAGRAM
---
classDiagram
    class Toy {
        <<Abstract>>
        #Sting id
        #Sting custom_id
        #String title
        #String childType
        +Toy (String id, Sting custom_id, String title, String childType)
        +String getId()
        +String getCustomId()
        +String getTitle()
        +Int getChildType()
        +String toString()
    }

    class BadToy {
        <<Abstract>>
        -String content
        +BadToy (String id, Sting custom_id, String title, String content)
        +String getContent()
        +String toString()
    }
    class GoodToy {
        <<Abstract>>
        -String brand
        -String recommendedAge
        -String category
        +GoodToy (String id, Sting custom_id, String title, String brand, Int recommendedAge, String category)
        +String getBrand()
        +Int getRecommendedAge()
        +String getCategory()
        +String toString()
    }

    class ToyDTO {
        -String tittle
        -String brand
        -Int recommendedAge
        -String category
        -String content
        -Int childType
        +ToyDTO (String tittle, String brand, Int recommendedAge, String category, String content, Int childType) 
        +String getTittle()
        +String getBrand()
        +Int getRecommendedAge()
        +String getCategory()
        +String toString()
    }
    
    class Santa {
        +getBadToysList()
        +getGoodToysList()
        +exitSesion()
    }

    class Elfo {
        +createBadToys()
        +createGoodToys()
        +deleteToys()
        +listToys()
        +exitSesion()
    }




    Toy "1" <|-- BadToy : extends
    Toy "1" <|-- GoodToy : extends
    User <|-- Santa
    User <|-- Elfo
    
    style Toy fill:#bfb,stroke:#6f6,stroke-width:2px,color:#000,stroke-dasharray: 5 5
    style BadToy fill:#bfb,stroke:#6f6,stroke-width:2px,color:#000,stroke-dasharray: 5 5
    style GoodToy fill:#bfb,stroke:#6f6,stroke-width:2px,color:#000,stroke-dasharray: 5 5
    style ToyDTO fill:#ffb,stroke:#663,stroke-width:2px,color:#000,stroke-dasharray: 5 5

```
## DIAGRAMA DE CLASES

```mermaid
---
tittle: CLASS DIAGRAM
---
classDiagram

    %% Example showing the use of cardinalities

    %% Defining the classes
    class App {
        #String scanner
        +static void main()
        +HomeController()
    }
    class HomeController {
        -int Scanner: Index Arg
        -homeController(index)
        -homeView(index)
    }
    class HomeView {
        -Int Scanner: Index Arg
        -ElfView(index)
        -SantaView(index)
        -quit()
    }
    class ToyController {
        +String projectName
        +Toy(index)
        +BadToy(index)
        +GoodToy(index)
    }

    class Toys {
        ~addMember
        ~listMember
        ~deleteMember
        ~childType
        ~getChildType()
        ~Toy(set,get,delete)
        ~BadToy(set,get,delete)
        ~GoodToy(set,get,delete)
    }


    %% Defining the relationships with cardinalities
    App "1" <--> "1..*" HomeController : Controls views and Models
    HomeController "1" <--> "0..1" HomeView : display in console for UI
    HomeController "1..*" <--> "1" ToyController : is involved in/out
    ToyController "1" <--> "0..*" Toys : has member

    %% Adding a note to explain the diagram
    note for HomeController "A Controller employs views and models in back instance."
    note for HomeView "An View display models structure in console for UI."
    note for ToyController "A Model conects Controller with repository and DB."

    %% Applying CSS classes using shorthand notation
    class HomeController:::controllerStyle
    class HomeView:::viewStyle
    class ToyController:::modelStyle

    %% Apply CSS classes using cssClass statement
    %% cssClass "Company, Employee, Project" generalClass

     style HomeController fill:#f9f,stroke:#333,stroke-width:4px
     style Homeview fill:#f9f,stroke:#333,stroke-width:4px
     style ToyController fill:#263,stroke:#66f,stroke-width:2px,color:#fff,stroke-dasharray: 5 5

```
  - HISTORIAS DE USUARIOS

    ![Historia de Usuario](images/projectoInsideOut-ACTIONS.webp)


    ![Toy Controller Use](images/SCTF_diagramaUso.png)

>    ```mermaid
>zenuml
>title Santa Claus Toys Factory
>@Actor Elf #FFEBE6
>@Boundary Console #0747A6
>@Control <<View>> Controller #E3FCEF
>group Model {
>  @database <<ToyControler>> Setter
>  @entity <<DTO>>Getter
>}
>
>@Starter(Elf)
>// `App/mainMenu`
>HomeControler.post(scanner) {
>  Controller.run(getInput) {
>    Toy = new Toy(childType)
>    if(User = Elf) {
>        Setter.create(Toy)
>        Setter.delete(Toy)      
>      par {
>        Getter.list(Toy)
>      }      
>    }
>  }
>  quit
>}
>    
>    ```

    
  - 

## Autor:  

- Alberto Casas [@ofiucoder](https://github.com/ofiucoder)
