package X;

/* renamed from: X.00I  reason: invalid class name */
public class AnonymousClass00I {
    public final Object A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass00I)) {
            return false;
        }
        AnonymousClass00I r4 = (AnonymousClass00I) obj;
        if (!C014106d.A01(r4.A00, this.A00) || !C014106d.A01(r4.A01, this.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.A00;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.A01;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(this.A00);
        sb.append(" ");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }

    public AnonymousClass00I(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }
}
