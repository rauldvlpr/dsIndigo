# dsIndigo

### PRE REQUISITOS
1.- IDE Eclipse

2.- JDK 1.8

3.- MYSQL

4.- MAVEN

5.- NODE JS

6.- ANGULAR CLI

### APP LIBRARY

1.- Desde la consulta llegar a la ruta principal de AppLibrary.

2.- Ejecutar el siguiente comando en la consola para instalar los modulos de Angular.
```
npm install
```
  
3.- Una vez terminado el proceso de instalacion de modulos, ejecutar el siguiente comando
```
  ng serve
```
  el cual inicia el servidor y montara la aplicacion en la siguiente url.
  
```
http://localhost:4200/books
```

### LIBRARY SERVICE
1.- Proyecto de Servicios abrir con eclipse.

2.- Abrir el archivo de propiedades (application.resource) y editar los siguientes atributos:
    
    //Actualizar url y puerto si son necesarios.
    spring.datasource.url = jdbc:mysql://localhost:3306/library?useSSL=false
    
    spring.datasource.username = (usuario mysql)
    
    spring.datasource.password = (pass de usuario mysql)
    

3.- Desde la consola llegar a la ruta principal de LbraryService.

4.- Ejecutar el siguiente comando en la consola para la instalacion de dependencias.

```
  mvn compile
```

5.- En caso de que la aplicacion de Angular se monte en una direccion o puerto distinto, actualizar el valor de  origins
```
@CrossOrigin(origins = "http://localhost:4200")

```

en el archivo (BookController).


6.- Una vez terminada la compilacion , procede a ejecutar el aplicacion desde el IDE como (Run As) :

```
Spring Boot App
```

7.- Los servicios se montaran en la siguiente url 

```
  http://localhost:8200/books
```

8.- Metodos disponibles

```
GET : http://localhost:8200/books
POST: http://localhost:8200/books/addBook
PUT : http://localhost:8200/books/updateBook/id
DELETE: http://localhost:8200/books/id
```

### BASE DE DATOS

1.- Ejecutar el archivo "library.sql" en su ambiente de base de datos, el cual creara la base de datos y la tabla necesaria para el funcionamiento.
