public class Elemento<T> {
    //Atributos
    public T attrG;
    public Elemento siguiente;
    //Hacemos un constructor de Elemento
    public Elemento(T objeto){
        this.attrG = objeto;
        this.siguiente = null;
    }

}
