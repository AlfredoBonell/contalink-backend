# contalink-backend
Desarrolla una aplicación web de consulta de facturas.

Pasos para poder levantar los servicios.

1.- Clonar el repositorio.
2.- Abrir el proyecto, se limpia y se compila la solución.

![image](https://user-images.githubusercontent.com/99234057/186708265-97688d55-77c5-4040-b337-3931d2cf59a7.png)

3.- Corres el servicio en spring boot.

![image](https://user-images.githubusercontent.com/99234057/186708450-1042f7ad-4ad3-45af-88a9-81895172e29b.png)

![image](https://user-images.githubusercontent.com/99234057/186708709-b28d2c2c-2e81-4aeb-aaee-7bd544699893.png)

4.- Consumir el servicio desde Swager o Postman.

POST: http://localhost:8080/controller/getInfoReporte
REQUEST: 
{
  "fechaInicio": "2022-01-01",
  "fechaFin": "2022-01-07"
}

API siendo consumida.

![image](https://user-images.githubusercontent.com/99234057/186706850-68acb527-654a-4035-9f3b-c609c4052826.png)

Consumiendo la API desde Swagger.

![image](https://user-images.githubusercontent.com/99234057/186707116-3a6e5b4c-2a78-4d22-b150-f8c7dcacd2b4.png)

![image](https://user-images.githubusercontent.com/99234057/186707435-50867aa7-8a6f-4f8b-8617-fc097a7e341f.png)

![image](https://user-images.githubusercontent.com/99234057/186707494-72cd54da-8b32-413d-8439-2725de2f62a9.png)

Desde Postman.

![image](https://user-images.githubusercontent.com/99234057/186707568-e2b1fedd-50b2-4854-81ba-6aae37413951.png)

