package X;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.00q  reason: invalid class name and case insensitive filesystem */
public final class C001500q implements AnonymousClass00T, Serializable {
    public static final AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(C001500q.class, Object.class, "_value");
    public volatile Object _value;

    /* renamed from: final  reason: not valid java name */
    public final Object f0final;
    public volatile AnonymousClass00S initializer;

    public boolean BM2() {
        if (this._value != AnonymousClass00V.A00) {
            return true;
        }
        return false;
    }

    public Object getValue() {
        Object obj = this._value;
        AnonymousClass00V r1 = AnonymousClass00V.A00;
        if (obj == r1) {
            AnonymousClass00S r0 = this.initializer;
            if (r0 != null) {
                obj = r0.invoke();
                if (AnonymousClass0A8.A00(this, r1, obj, A00)) {
                    this.initializer = null;
                }
            }
            return this._value;
        }
        return obj;
    }

    public C001500q(AnonymousClass00S r2) {
        this.initializer = r2;
        AnonymousClass00V r0 = AnonymousClass00V.A00;
        this._value = r0;
        this.f0final = r0;
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
