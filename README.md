# Clases de equivalencia

## Integrantes:

* María Angélica Alfaro Fandiño

* César Fernando Ortiz Rocha

## Casos de equivalencia (Registraduría)

***1.DEAD:*** La persona esté muerta (alive=false).
 
***2.UNDERAGE:*** La persona tenga menos de 18 años, más de 0 años.
 
***3.INVALID_AGE:*** La persona sea menor a 0 años y mayor 130 años.
 
***4.DUPLICATED:*** La cedula de la persona este mas de una vez.
 
***5.VALID:*** NOT DEAD, NOT UNDERAGE, NOT INVALID_AGE, NOT DUPLICATED.

## Descuento de tarifas

### Diseño de pruebas

1.La excepción ``` ExcepcionParametrosInvalidos ``` debería arrojarse cuando:

	* ``` edad <= 0 || edad > 130 ```

	* ``` diasAntelacion < 0 ```

	* ``` tarifaBase < 0 ``` 

2. 
![](https://github.com/Angelica-Alfaro/Lab3-CVDS/blob/master/Anexo/Tabla2.PNG)

3. 
![](https://github.com/Angelica-Alfaro/Lab3-CVDS/blob/master/Anexo/Tabla3.PNG)

4. 
![](https://github.com/Angelica-Alfaro/Lab3-CVDS/blob/master/Anexo/Tabla4.PNG)

5.   * ***Edad inválida:*** Se toma un valor por debajo del límite inferior ``` edad = -5 ```

     * ***Antelación inválida:*** Se toma un valor intermedio entre la frontera ``` diasAntelacion = -10 ```

     * ***Tarifa inválida:*** Se toma un valor por encima del límite superior ``` tarifaBase= 1500000 ```

     * ***Descuento 15%:*** Se toma un valor por debajo del límite inferior ``` diasAntelacion = 20 ```

     * ***Descuento 5%:*** Se toma un valor por encima del límite superior ``` edad = 18 ```

     * ***Descuento 8%:*** Se toma el valor del límite superior ``` edad = 129 ```

     * ***Sin descuento:*** Se toma el valor del límite inferior ``` edad = 18 ```

### Reporte de pruebas

Para las pruebas:

``` public void validateEdadInvalida() ```\
``` public void validateAntelacionInvalida() ```\
``` public void validateTarifaInvalida() ```\
``` public void validateDescuento15() ```\
``` public void validateDescuento5() ```\
``` public void validateDescuento8() ```\
``` public void validateSinDescuento() ```

Se generaron tres errores pues dentro del código no se está contemplando los casos que no deberián ser válidos al ingresar los parámetros.
Por lo tanto se concluye que el código debería ser corregido.

	
	


