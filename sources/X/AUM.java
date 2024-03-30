package X;

import java.io.Serializable;

public abstract class AUM implements Serializable {
    public static final long serialVersionUID = 0;

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    public Object A00() {
        if (this instanceof C22733Aux) {
            return ((C22733Aux) this).reference;
        }
        throw AnonymousClass001.A09("value is absent");
    }
}
