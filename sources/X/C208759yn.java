package X;

/* renamed from: X.9yn  reason: invalid class name and case insensitive filesystem */
public class C208759yn implements C22856Ax7 {
    public String A00;
    public boolean A01;

    public boolean BPR(C1890892a r7, AnonymousClass825 r8) {
        String str;
        if (!this.A01 || this.A00 != null) {
            str = this.A00;
        } else {
            str = r8.A00();
        }
        B0V b0v = r8.A00;
        if (b0v != null) {
            int i = 0;
            for (AnonymousClass9QD r0 : b0v.B9f()) {
                if (str == null || r0.A00().equals(str)) {
                    i++;
                }
            }
            if (i == 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public String toString() {
        Object[] objArr;
        String str;
        if (this.A01) {
            objArr = AnonymousClass001.A0L();
            objArr[0] = this.A00;
            str = "only-of-type <%s>";
        } else {
            objArr = new Object[0];
            str = "only-child";
        }
        return String.format(str, objArr);
    }

    public C208759yn(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }
}
