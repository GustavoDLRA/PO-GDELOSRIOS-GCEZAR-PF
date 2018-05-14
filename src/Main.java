import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       //Comenzamos por crear los objetos de tipo Artículo.
        Articulo c1 = new Articulo("Manzana","Fruto rojo, amarillo o verde con semillas","$25 k","18/05/2018");
        Articulo c2 = new Articulo("Leche","Bebida pasteurizada que viene de las vacas","$20 el litro","23/05/2018");
        Articulo c3 = new Articulo("Pasta","Especial para hacer Lasagna","$10 el paquete","20/01/2019");
        //Ahora Adaptamos estos objetos, para ingresarlos dentro de un objeto generico de tipo Elemento<T>
        Elemento<Articulo> primero = new Elemento<>(c1);
        Elemento<Articulo> segundo = new Elemento<>(c2);
        Elemento<Articulo> tercero = new Elemento<>(c3);
        //Una vez que ya están adaptados dentro de sus respectivos objetos, implementamos la lista.
        Lista<Articulo> ListaArticulos = new Lista<>(primero);
        ListaArticulos.insertar(segundo);
        ListaArticulos.insertar(tercero);
        System.out.println(ListaArticulos.nelementos); //Muestra el número de elementos en la lista.
        System.out.println(ListaArticulos.recorrer()); //Muestra los elementos presentes hasta el momento en la lista.
        ListaArticulos.eliminar(); //La función eliminar, elimina el primer elemento de la lista.
        System.out.println(ListaArticulos.nelementos+"\n"+ListaArticulos.recorrer()); //Muestra la lista tras la función eliminar.

        //Implementación de la función buscar.
        System.out.println("Introduzca la clave del producto: ");
        Scanner leeCodigo = new Scanner(System.in);
        String claves= leeCodigo.next();
        ListaArticulos.buscar(claves);


    }
}
