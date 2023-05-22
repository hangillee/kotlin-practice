// 클래스 선언 시, Java와 다르게 가시성 변경자(Visibility modifier)가 사라졌다.
// Kotlin의 기본 가시성(접근제어자)는 public이다.
// 또한, Getter와 Setter 같은 접근자 메소드(Accessor method) 대신 프로퍼티를 통해 필드 접근 메소드를 제공한다.
class Person (val name: String, var isMarried: Boolean)

// 아래 Java 코드와 완벽하게 호환된다.
// 그러나 코드의 간결성은 말도 안되게 좋다.
// public class Person {
//     private final String name;
//     private boolean isMarried;
//
//     public Person(String name, boolean isMarried) {
//         this.name = name;
//         this.isMarried = isMarried;
//     }
//
//     public String getName() {
//         return this.name;
//     }
//     public final boolean isMarried() {
//         return this.isMarried;
//     }
//
//     public final void setMarried(boolean var1) {
//         this.isMarried = var1;
//     }
// }