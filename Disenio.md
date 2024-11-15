## Diagrama de clases 
``` plantuml
package es/etg/psp/ceramica{
    class Alfarero implements Runnable{
        - obra : Obra
    }

    class Galeria{
      - obra : Obra
      + main():void
    }

    class Vendedor implements Runnable{
        - nombre : String
        - obra : Obra
       
    }

    interface Runnable{
        + run():void
    }

    class Obra{
        - numObra : int
        - ocupado : boolean
        + vender() : void
        +  agregar(): void
    }
}


Vendedor ..> Obra : vende
Alfarero ..> Obra: crea
Galeria ..> Obra : expone

```
>Hecho por noma Obamedo