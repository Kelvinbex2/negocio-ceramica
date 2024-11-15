``` mermaid 

classDiagram

class Runnable {
    <<Interface>>
}

class Alfarero {
    <<es.etg.dam>>
}

class Vendedor {
    <<es.etg.dam>>
}

class Galeria {
    <<es.etg.dam>>

}

class Obra {
    <<es.etg.dam>>
    + vender()
}

Runnable <|-- Alfarero
Runnable <|-- Vendedor

```