package X;

import java.util.Map;

public abstract class A6R implements B2P {
    public abstract Map asMap();

    public boolean equals(Object obj) {
        return C1897695m.equalsImpl(this, obj);
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1Q(size());
    }

    public String toString() {
        return asMap().toString();
    }
}
