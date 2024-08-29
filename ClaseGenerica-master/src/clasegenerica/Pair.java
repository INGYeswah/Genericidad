package clasegenerica;

import java.util.HashMap;
import java.util.Objects;

public class Pair<T, U> {

    private T dato1;
    private U dato2;

    public Pair(T dato1, U dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }
    
    public void setDato1(T dato1) {
        this.dato1 = dato1;
    }

    public void setDato2(U dato2) {
        this.dato2 = dato2;
    }

    public T getFirst() {
        return dato1;
    }

    public U getSecond() {
        return dato2;
    }
    
    @Override
    public String toString(){
        return "Clave " + dato1 + ", Valor: " + dato2;
    }
}

//public class caja<y> {
//
//
//    @Override
//    public int hashCode() {
//        int hash = 3;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final caja<?> other = (caja<?>) obj;
//        return Objects.equals(this.dato, other.dato);
//    }
//
//}
