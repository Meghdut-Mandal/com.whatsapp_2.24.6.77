package X;

/* renamed from: X.5E5  reason: invalid class name */
public class AnonymousClass5E5 extends AnonymousClass5EQ {
    public final C33541fX A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public AnonymousClass5E5(C33541fX r2, String str, String str2, String str3, boolean z) {
        super(31);
        this.A04 = z;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A01.equals(((AnonymousClass5E5) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}
