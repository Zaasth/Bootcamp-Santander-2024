package Generics;

/**
 Versão genérica da classe Box.
 @param <T> o tipo do valor sendo armazenado
 */
public class Box<T> {
    // T representa "Type" (tipo)
    private T t;

    public T getT() { return this.t;}
    public void setT(T t){ this.t = t;}
}
