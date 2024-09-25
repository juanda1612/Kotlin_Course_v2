
Peter quiere saber cuánto cuesta su coche en el mercado de segunda mano. Por suerte, existe un sitio web especial que puede indicar el precio. Cuando abrió el sitio, todos los parámetros de su coche estaban llenos de valores predeterminados y resultó que todos los parámetros, excepto uno, coincidían con los parámetros del coche de Peter. Así que cambió solo un parámetro y presionó Aceptar. ¿No fue genial?

Imagina que eres el desarrollador que necesita crear la misma lógica utilizando una función 
- La función debe tomar parámetros: qué antigüedad tiene el coche, cuántos kilómetros ha recorrido, la velocidad máxima y si el coche tiene transmisión automática .

- Los argumentos por defecto para este modelo son: 5 años de antigüedad, 100.000 km recorridos, velocidad máxima 120 kilómetros por hora (km/h), sin transmisión automática. El precio inicial de un coche nuevo con el equipamiento por defecto es de 20.000 $.

La función debería funcionar así:

- Cada año el precio del coche baja en 2000 $.
- El precio baja 100 $ por cada kilómetro por hora inferior a 120 km/h y aumenta 100 $ por cada kilómetro por hora superior a 120 km/h.
- El precio baja 200 dólares por cada 10.000 kilómetros recorridos. Por ejemplo, por 19.999 kilómetros el precio baja 200 dólares, pero por 20.000 kilómetros baja 400 dólares.
- Si el coche tiene transmisión automática, el precio del coche aumenta en 1500 $, de lo contrario, permanece igual.
La función debe imprimir el precio del coche en el mercado de segunda mano.