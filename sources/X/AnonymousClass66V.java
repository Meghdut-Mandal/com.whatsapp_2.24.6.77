package X;

/* renamed from: X.66V  reason: invalid class name */
public class AnonymousClass66V {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass66V r5 = (AnonymousClass66V) obj;
            String str = r5.A00;
            String str2 = this.A00;
            return (str == str2 || (str != null && str.equals(str2))) && r5.A01 == this.A01;
        }
    }

    public final int hashCode() {
        return ((589 + C36341k9.A09(this.A00)) * 31) + (this.A01 ? 1 : 0);
    }

    public AnonymousClass66V(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
