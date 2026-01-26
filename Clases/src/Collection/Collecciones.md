# **Colecciones**

## **List**
### ArrayList
#### Código
```JAVA
        List<String> elemento = new ArrayList<>();
        elemento.add("Elemento 1");
        elemento.add("Elemento 2");
        elemento.add("Elemento 3");
##### Descripción
`Es una estructura de datos que representa una lista de elementos redimensionable, su tamaño puede cambiar dinámicamente durante la ejecución del programa.`

### LinkedList
#### Código
        List<String> elemento2 = new LinkedList<>();
        elemento2.add("Elemento 1");
        elemento2.add("Elemento 2");
        elemento2.add("Elemento 3");
##### Descripción
`Es una estructura de datos lineal donde los elementos no se guardan en espacios de memoria contiguos, sino que cada elemento es un "nodo" independiente que apunta al siguiente.`


## **Set**
### HashSet
#### Código
        Set<String> elemento3 = new HashSet<>();
        elemento3.add("Elemento 1");
        elemento3.add("Elemento 2");
        elemento3.add("Elemento 3");
##### Descripción
`Es una colección que almacena elementos únicos y no garantiza ningún orden específico.`

### TreeSet
#### Código
        Set<String> elemento4 = new TreeSet<>();
        elemento4.add("Elemento 1");
        elemento4.add("Elemento 2");
        elemento4.add("Elemento 3");
##### Descripción
`Es una colección que implementa la interfaz Set, lo que significa que no permite duplicados, pero con una característica fundamental que lo diferencia del HashSet, mantiene sus elementos ordenados.`


## **Queue**
### LinkedList
#### Código
        Queue<String> elemento5 = new LinkedList<>();
        elemento5.add("Elemento 1");
        elemento5.add("Elemento 2");
        elemento5.add("Elemento 3");
##### Descripción
`Es una estructura de datos lineal donde los elementos no se guardan en espacios de memoria contiguos, sino que cada elemento es un "nodo" independiente que apunta al siguiente.`

### PriorityQueue
#### Código
        Queue<String> elemento6 = new PriorityQueue<>();
        elemento6.add("Elemento 1");
        elemento6.add("Elemento 2");
        elemento6.add("Elemento 3");
##### Descripción
`Es una estructura de datos que, a diferencia de una cola normal (FIFO), no procesa los elementos por orden de llegada, sino por su prioridad.`


## **Map**
### HashMap
#### Código
        Map<String, Integer> elemento7 = new HashMap<>();
        elemento7.put("Elemento 1", 1);
        elemento7.put("Elemento 2", 2);
        elemento7.put("Elemento 3", 3);
##### Descripción
`Es una estructura de datos que funciona como un diccionario o mapa de búsqueda rápida. Su función principal es almacenar información en pares de Clave-Valor.`

### TreeMap
#### Código
        Map<String, Integer> elemento8 = new TreeMap<>();
        elemento8.put("Elemento 1", 1);
        elemento8.put("Elemento 2", 2);
        elemento8.put("Elemento 3", 3);
##### Descripción

`Almacena sus pares de clave-valor siguiendo un orden específico.`
