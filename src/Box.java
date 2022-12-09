public class Box <T,E>{

    public Box(T element1, E element2) {
    }

    public static <T,E> String generic(T element1, E element2) {

        return element1+" "+element2;
    }
}
