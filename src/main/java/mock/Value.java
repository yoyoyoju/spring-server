package mock;

import java.util.Objects;
import java.util.Random;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Value {
    private @Id @GeneratedValue Long id;
    private long x; // unixTime
    private double y;

    Value() {}

    Value(long x, Random rd) {
        this.x = x;
        this.y = rd.nextDouble();
    }

    Value(long x, double y) {
        this.x = x;
        this.y = y;
    }

    public Long getId() {
        return this.id;
    }

    public long getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Value))
            return false;
        Value value = (Value) o;
        return Objects.equals(this.id, value.id)
            && (this.x == value.x)
            && (this.y == value.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.x, this.y);
    }

    @Override
    public String toString() {
        return "Value{" + "id=" + this.id + ", x=" +
            this.x + ",y=" + this.y +'}';
    }
}
