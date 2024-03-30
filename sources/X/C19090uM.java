package X;

/* renamed from: X.0uM  reason: invalid class name and case insensitive filesystem */
public final class C19090uM {
    public final int A00;
    public final Class A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof C19090uM)) {
            return false;
        }
        C19090uM r4 = (C19090uM) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.A01.hashCode() ^ 1000003) * 1000003) ^ this.A00) * 1000003) ^ 0;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.A01);
        sb.append(", type=");
        if (this.A00 == 1) {
            str = "required";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", direct=");
        sb.append(true);
        sb.append("}");
        return sb.toString();
    }

    public C19090uM(Class cls, int i) {
        this.A01 = cls;
        this.A00 = i;
    }
}
