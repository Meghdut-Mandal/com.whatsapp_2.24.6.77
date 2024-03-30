package X;

/* renamed from: X.5EN  reason: invalid class name */
public class AnonymousClass5EN extends AnonymousClass5EQ {
    public final C159387jH A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            AnonymousClass5EN r5 = (AnonymousClass5EN) obj;
            if (!this.A02.equals(r5.A02) || this.A04 != r5.A04) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass5EN(C159387jH r2, String str, boolean z) {
        super(33);
        this.A04 = z;
        this.A02 = str;
        this.A01 = null;
        this.A03 = false;
        this.A00 = r2;
    }

    public int hashCode() {
        return this.A02.hashCode();
    }

    public AnonymousClass5EN(C159387jH r2, String str, String str2, boolean z) {
        super(33);
        this.A04 = z;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = true;
        this.A00 = r2;
    }
}
