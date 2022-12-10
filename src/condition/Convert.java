package condition;
@FunctionalInterface
public interface Convert<T>{
    String write(T current);
}
