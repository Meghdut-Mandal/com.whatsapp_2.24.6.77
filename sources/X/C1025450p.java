package X;

/* renamed from: X.50p  reason: invalid class name and case insensitive filesystem */
public class C1025450p extends C105205Dt {
    public final String A00;

    public C1025450p(C158137fr r2, String str, int i) {
        super(r2, 59, i);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C1025450p) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
