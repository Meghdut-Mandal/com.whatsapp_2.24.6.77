package X;

/* renamed from: X.5Dz  reason: invalid class name and case insensitive filesystem */
public class C105265Dz extends AnonymousClass5EQ {
    public AnonymousClass6QG A00;
    public C33541fX A01;

    public C105265Dz(AnonymousClass6QG r2, C33541fX r3) {
        super(4);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C105265Dz) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
