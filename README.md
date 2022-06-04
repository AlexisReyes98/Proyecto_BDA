# Proyecto_BDA

UEA: Bases de Datos Avanzadas.

El objetivo de este proyecto de Base de Datos Avanzadas será realizar una carga masiva de datos a
una tabla en la BD en la cual se está trabajando, por lo que es importante seguir el tipo de negocio
que se viene trabajando en el curso.

Negocio Asignado: Clínica de Salubridad.

1- Generar el archivo con un grupo de datos de los siguientes tamaños: 20 mil, 50 mil, 100 mil, 250 mil.

2.- El archivo generado en el punto anterior deberá ser cargado en su BD en la tabla correspondiente.

Se utilizo la tecnología de Oracle con los archivos de configuración tipo CTL.

3.- Generar una interfaz gráfica para visualizar los datos, y realizar una búsqueda por un campo.

Pantallazos de la interfaz gráfica con los datos y realizando una búsqueda

![imagen](https://user-images.githubusercontent.com/72325257/171971405-eb53d512-a63a-4fa9-b4b1-a05558496097.png)

![imagen](https://user-images.githubusercontent.com/72325257/171971416-d6ea2854-7a1d-4292-a776-f5c5423d4dd6.png)

![imagen](https://user-images.githubusercontent.com/72325257/171971422-12b85054-631f-419b-b250-01751f603f92.png)

![imagen](https://user-images.githubusercontent.com/72325257/171971435-b275f711-f70e-45ec-8ffc-27c37dbf4866.png)

![imagen](https://user-images.githubusercontent.com/72325257/171971439-10dc0b5f-d306-4aa7-b256-418bc86477b2.png)

![imagen](https://user-images.githubusercontent.com/72325257/171971447-e85bc233-7d9a-4746-ba0d-42edd1702475.png)

![imagen](https://user-images.githubusercontent.com/72325257/171971452-1246b7fe-daba-4d91-bb5f-52a829a201ae.png)

![imagen](https://user-images.githubusercontent.com/72325257/171971463-092c5170-7db5-468b-98da-866436063e85.png)

Contenido del archivo de configuración CTL para subir la información del archivo inicial.

OPTIONS (SKIP=1)

LOAD DATA

INFILE '/home/alexis/Documentos/UAM/Bases de Datos

Avanzadas/Proyecto/pacientes_20mil.csv'

TRUNCATE

INTO TABLE PACIENTES20K

FIELDS TERMINATED BY ','

(

ID_REGISTRO,

SEXO,

ENTIDAD_RES,

TIPO_PACIENTE,

FECHA_INGRESO,

FECHA_SINTOMAS,

EDAD,

RESULTADO_LAB,

RESULTADO_ANTIGENO,

CLASIFICACION_FINAL

)
