package X;

import java.io.Serializable;

/* renamed from: X.053  reason: invalid class name */
public final class AnonymousClass053 implements AnonymousClass00T, Serializable {
    public Object _value = AnonymousClass00V.A00;
    public AnonymousClass00S initializer;

    public boolean BM2() {
        if (this._value != AnonymousClass00V.A00) {
            return true;
        }
        return false;
    }

    public Object getValue() {
        Object obj = this._value;
        if (obj != AnonymousClass00V.A00) {
            return obj;
        }
        AnonymousClass00S r0 = this.initializer;
        AnonymousClass00C.A0B(r0);
        Object invoke = r0.invoke();
        this._value = invoke;
        this.initializer = null;
        return invoke;
    }

    public AnonymousClass053(AnonymousClass00S r2) {
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
