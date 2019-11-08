import java.util.Objects;

public class Point {

    int x;
    int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override // выбрали equals и хеш код. чтоб сравнить все свойва нашего объекта
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }


   /* public class Point implements Cloneable{
        int x;
        int y;
    } */

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override // чтоб реализация бралась из нашего класс, а не выше по иерарархии
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
