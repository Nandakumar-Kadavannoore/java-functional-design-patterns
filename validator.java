public class Validator<T> {

private final T t;
private final IllegalStateException error;

private Validator() {

}

public static <T> Validator<T> of(T t) {
  return new Validator<>(Objects.requireNonNull(t), null);
}

public Validator<T> validate(Predicate<T> validation, String message) {
 if (error == null && !validation.test(t))
   return new Validator<>(t, new IllegalStateException(message));
 return this;
}

public T get() throws IllegalStateException {
 if (error == null) {
  return t;
 }
 throw error;
}

}
