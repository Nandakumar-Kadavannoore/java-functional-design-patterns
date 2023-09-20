public class Visitor<R> {

public <T> Visitor<R> when(Class<T> type, Function<T,R> fun) { 
// Logic 
}
public R accept(Object receiver) {
// Logic
}
}

public static void main(String args[]) {

Visitor<String> visitor = new Visitor<>();
visitor.when(Car.class, car -> "car")
       .when(Moto.class, moto -> "Moto");

String text = visitor.accept(vehicle);

}
