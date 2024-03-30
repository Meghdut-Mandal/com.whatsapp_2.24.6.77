package X;

/* renamed from: X.5E0  reason: invalid class name */
public class AnonymousClass5E0 extends AnonymousClass5EQ {
    public final C144416s9 A00;
    public final AnonymousClass4RB A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((AnonymousClass5E0) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass5E0(C144416s9 r1, AnonymousClass4RB r2, int i) {
        super(i);
        this.A00 = r1;
        this.A01 = r2;
    }
}
