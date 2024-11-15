``` mermaid 

classDiagram

class Runnable {
    <<Interface>>
}

class Alfarero {
    - Obra
    + Alfarero(Obra)
}

class Vendedor {
    - TIEMPO_ESPERA $
    - Obra
    + Vendedor(Obra)
}

class Galeria {
    +static int TOTAL_OBRAS
    +main(String[] args)
  }

class Obra {
    + String MSG_VENDER
    + exponer(String id) void
    + vender() void
}

Runnable <|.. Alfarero
Runnable <|.. Vendedor
Alfarero ..> Obra
Vendedor ..> Obra

```