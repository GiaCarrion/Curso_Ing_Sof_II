# **PRINCIPIOS DE PROGRAMACIÓN ORIENTADA A OBJETOS**

## **Bajo acoplamiento:**
Reducción de las interdependencias entre los distintos componentes de un sistema. Cuanto menor sea la dependencia entre los módulos, mayor será el bajo acoplamiento.Solo debe pasar la información necesaria.

## **Alta cohesión:**
La medida en que los elementos dentro de un módulo están relacionados funcionalmente entre sí. Un módulo con alta cohesión tiene componentes que trabajan juntos para cumplir un propósito específico o realizar una tarea concreta.

## **Principio de Mínimo Conocimiento(Ley de Demeter):**
Establece que un objeto debe interactuar solo con sus objetos cercanos inmediatos y evitar acceder a los métodos de objetos asociados indirectamente.

## **Principio Dry:** 

Sostiene que cada pieza de conocimiento en un sistema debe tener una única representación en el código, evitando la duplicación y promoviendo la reutilización del código.

## **Duck Typing**
Enfoque de programación donde el tipo de un objeto se determina por sus métodos y propiedades en lugar de su tipo explícito, lo que permite que diferentes tipos de objetos sean tratados de manera similar si pueden realizar las mismas acciones.

## **Principio KISS (Keep It Simple, Stupid)**
Sugiere que las soluciones deben mantenerse lo más simples posible, evitando la complejidad innecesaria.

## **Principio YAGNI (You Aren't Gonna Need It)**
Advierte contra la implementación de funcionalidades o características que no se necesitan actualmente.

# **PRINCIPIOS SOLID**

## **(S) Single Responsability Principle - Principio de Responsabilidad Única**
Una clase debe tener una sola responsabilidad y debe estar encapsulada para cumplir esa responsabilidad. Esto promueve la cohesión y evita la sobrecarga de funcionalidades en una sola clase.

## **(O) Open Close Principle - Principio de Abierto/Cerrado**
Establece que las entidades de software (clases, módulos, funciones, etc.) deben estar abiertas para su extensión pero cerradas para su modificación.

## **(L) Liskov Substitution Principle - Principio de Sustitución de Liskov**
Establece que los objetos de un programa deben ser reemplazables por instancias de sus subtipos sin afectar a la corrección del programa. En otras palabras, si S es un subtipo de T, entonces los objetos de tipo T pueden ser reemplazados por
objetos de tipo S sin alterar el comportamiento del programa.

## **(I) Interface Segregation Principle - Principio de Segregación de Interfaz**
Establece que una clase no debe ser obligada a depender de métodos que no utiliza. En lugar de tener una interfaz única que contenga todos los métodos posibles, es mejor dividir las interfaces en conjuntos más pequeños y específicos que sean relevantes para las clases que los implementan.

## **(D) Dependency Inversion Principle - Principio de Inversión de Dependencia**
Establece que los módulos de alto nivel no deben depender de módulos de bajo nivel, sino que ambos deben depender de abstracciones. Además, las abstracciones no deben depender de los detalles, sino que los detalles deben depender de las
abstracciones.