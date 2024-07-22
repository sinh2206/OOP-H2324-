import java.util.List;

/**
 * Wildcard trong Java là một ký hiệu đại diện cho các loại dữ liệu không xác định trong một generic type. Wildcards được sử dụng để chỉ định rằng một loại có thể là bất kỳ loại nào, nhưng với một số hạn chế hoặc quy tắc nhất định. Java cung cấp ba loại wildcard:
 *
 * Unbounded Wildcard: ? - Đại diện cho bất kỳ loại nào.
 * Bounded Wildcard:
 * Upper Bounded Wildcard: ? extends T - Đại diện cho một loại là con của T (bao gồm cả T).
 * Lower Bounded Wildcard: ? super T - Đại diện cho một loại là cha của T (bao gồm cả T).
 * Unbounded Wildcard
 * Unbounded wildcard (?) được sử dụng khi bạn không biết trước loại cụ thể và không cần thực hiện bất kỳ thao tác nào mà yêu cầu loại cụ thể.
 */
public class WildcardExample {
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void addIntegers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("Hello", "World");
        List<Integer> intList = List.of(1, 2, 3);

        printList(stringList);
        printList(intList);
    }
}