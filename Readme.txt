***********************************************************
***********************************************************
1. Caso de Uso: Ordenar Pizzas
Para el ejemplo se tiene una Fábrica de pizzas, donde el producto serían las pizzas con diferentes tipos, ingredientes. Las fábricas serán las pizzerías que fabrican las diferentes pizzas. Para este ejemplo se realizará una familia de pizzerías a nivel Bolivia donde cada departamento tiene su propia variedad de pizzas.
Pizzería en Cochabamba, que tendrá una pizza vegetariana, de pepperoni e italiana
Pizzería en Sucre, que tendrá una pizza vegetariana, de pepperoni y queso
***********************************************************
***********************************************************
2. Tecnologías usadas.

 * IDE: Intellij Idea Community version
 * JDK: openjdk-22
 * Programming Languaje: Java

***********************************************************
***********************************************************
3. Detalle de los Patrones
 * Creacional: AbstractFactory. Permite crear diferentes objetos que están relacionados con un parentesco, familia de objetos ya sea mediante la herencia.
 * Comportamiento: Template Method. Permite definir un esqueleto o pasos que se puedan utilizar, tiene una estructura u orden. Una clase base de un algoritmo
 * Estructurales: No implementado
¿Dónde se puede observar los patrones?
 * Creacional: AbstractFactory. Este patrón nos ayuda en el ejemplo a crear familias de pizzería relacionadas, además que nos permitirá agregar fácilmente nuevas familias de ser necesario
Las siguientes clases representan la estructura de Abstract Factory:
	Abstract Factory: PizzeriaZonaAbstractFactory
	Factorias concretas: PizzeriaCochabambaFactory, PizzeriaSucreFactory
	Producto Abstracto: PizzaProducto
	Producto Concreto: PizzaCochabambaItaliana, PizzaCochabambaPepperoni, y demás similares
	Cliente: Main
 * Comportamiento: Template Method. Este patrón nos ayuda a reutilizar en este ejemplo el método de ‘ordenarPizza’. El cual nos permite reutilizar este método en las distintas fabricas ya que se tiene asociado un proceso para realizar la orden de una pizza.

***********************************************************
***********************************************************
4. Principios SOLID

Single Responsibility:  La clase ‘Pedido’ es la que muestra este principio ya que este solo esta manejando una sola responsabilidad que es manejar el Pedido

***********************************************************
***********************************************************

***********************************************************
***********************************************************