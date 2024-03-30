package X;

import java.io.Serializable;

/* renamed from: X.00U  reason: invalid class name */
public final class AnonymousClass00U implements AnonymousClass00T, Serializable {
    public volatile Object _value = AnonymousClass00V.A00;
    public AnonymousClass00S initializer;
    public final Object lock = this;

    public boolean BM2() {
        if (this._value != AnonymousClass00V.A00) {
            return true;
        }
        return false;
    }

    public Object getValue() {
        Object obj;
        Object obj2 = this._value;
        AnonymousClass00V r0 = AnonymousClass00V.A00;
        if (obj2 != r0) {
            return obj2;
        }
        synchronized (this.lock) {
            obj = this._value;
            if (obj == r0) {
                AnonymousClass00S r02 = this.initializer;
                AnonymousClass00C.A0B(r02);
                obj = r02.invoke();
                this._value = obj;
                this.initializer = null;
            }
        }
        return obj;
    }

    public AnonymousClass00U(AnonymousClass00S r2) {
        this.initializer = r2;
    }

    private final Object writeReplace() {
        return new C12570iJ(getValue());
    }

    public String toString() {
        if (BM2()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
