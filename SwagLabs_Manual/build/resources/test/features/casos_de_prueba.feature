#language:es
Característica: casos de prueba para ejecucion manual


  @AgregarProductoDesdeHome
  Esquema del escenario: Agregar productos al carrito desde la pantalla del home de productos
    Dado que el usuario ingresa el usuario <nombreDeUsuario> y la clave <clavedeUsuario> para iniciar sesion en Swag Labs
    Cuando cuando visualiza el producto <producto>
    Y hace click en el boton "Agregar al carrito"
    Entonces puede ver el producto agregado dentro del carrito de compras

    Ejemplos:
      | nombreDeUsuario         | clavedeUsuario | producto                 |
      | standard_user           | secret_sauce   | Sauce Labs Backpack      |
      | performance_glitch_user | secret_sauce   | Sauce Labs Bolt T-Shirt  |
      | locked_out_user         | secret_sauce   | Sauce Labs Onesie        |
      | problem_user            | secret_sauce   | SSauce Labs Bolt T-Shirt |


  @AgregarProductoDesdeElDetalle
  Esquema del escenario: Agregar productos al carrito desde la pantalla de detalle del producto
    Dado que el usuario ingresa el usuario <nombreDeUsuario> y la clave <clavedeUsuario> para iniciar sesion en Swag Labs
    Cuando hace click sobre el nombre del <producto>
    Entonces puede visualizar el detalle y descripcion del producto <producto> seleccionado
    Y luego hace click en el boton "Agregar al carrito"
    Entonces puede ver el producto agregado dentro del carrito de compras

    Ejemplos:
      | nombreDeUsuario         | clavedeUsuario | producto                 |
      | standard_user           | secret_sauce   | Sauce Labs Backpack      |
      | performance_glitch_user | secret_sauce   | Sauce Labs Bolt T-Shirt  |
      | locked_out_user         | secret_sauce   | Sauce Labs Onesie        |
      | problem_user            | secret_sauce   | SSauce Labs Bolt T-Shirt |


  @CompletarCompra
  Esquema del escenario: finalizar exitosamente una compra desde el carrito
    Dado que el usuario ingresa el usuario <nombreDeUsuario> y la clave <clavedeUsuario> para iniciar sesion en Swag Labs
    Cuando agrega los productos <producto1> y <producto2> al carrito de compras
    Y completa el formulario de envio con los siguientes datos <primerNombre>, <apellido>,<codigoPostal>
    Entonces puede visualizar el mensaje de confirmación "Your order has been dispatched"

    Ejemplos:
      | nombreDeUsuario         | clavedeUsuario | producto1                | producto2                | primerNombre | apellido | codigoPostal |
      | standard_user           | secret_sauce   | Sauce Labs Backpack      | Sauce Labs Bike Light    | Andres       | Gallego  | 001          |
      | performance_glitch_user | secret_sauce   | Sauce Labs Bolt T-Shirt  | Sauce Labs Fleece Jacket | Juan         | Becerra  | 992          |
      | locked_out_user         | secret_sauce   | Sauce Labs Onesie        | T-Shirt (Red)            | Felipe       | Rojas    | 245          |
      | problem_user            | secret_sauce   | SSauce Labs Bolt T-Shirt | Sauce Labs Backpack      | Diego        | Murillo  | 548          |
