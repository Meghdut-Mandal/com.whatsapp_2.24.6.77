package X;

/* renamed from: X.8T5  reason: invalid class name */
public class AnonymousClass8T5 extends C200269h0 {
    public final Class A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass8T5)) {
                return false;
            }
            Class cls = this.A00;
            Class cls2 = ((AnonymousClass8T5) obj).A00;
            if (cls == null) {
                return cls2 == null;
            }
            if (!cls.equals(cls2)) {
                return false;
            }
        }
    }

    public String toString() {
        return this.A00.getName();
    }

    public AnonymousClass8T5(Class cls) {
        this.A00 = cls;
    }
}
