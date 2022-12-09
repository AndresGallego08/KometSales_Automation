#language:es
Característica: realizar compras


  Como como usuario registrado en swag labs
  Quiero agregar productos al carrito
  Para completar las compras


  @CompletarCompra
  Esquema del escenario: : finalizar exitosamente una compra desde el carrito
    Dado que el usuario inicia sesion en swag labs
      | userName   | password   |
      | <userName> | <password> |
    Cuando realiza la compra de productos
      | producto1   | producto2   | firstName   | lastName   | codigoPostal   |
      | <producto1> | <producto2> | <firstName> | <lastName> | <codigoPostal> |
    Entonces puede ver el mensaje Your order has been dispatched

    Ejemplos:
      | userName                | password     | producto1               | producto2                | firstName | lastName | codigoPostal |
      | standard_user           | secret_sauce | Sauce Labs Backpack     | Sauce Labs Bike Light    | Andres    | Gallego  | 001          |
      | performance_glitch_user | secret_sauce | Sauce Labs Bolt T-Shirt | Sauce Labs Fleece Jacket | Juan      | Becerra  | 992          |
      | locked_out_user         | secret_sauce | Sauce Labs Onesie       | T-Shirt (Red)            | Felipe    | Rojas    | 245          |
