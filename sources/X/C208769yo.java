package X;

/* renamed from: X.9yo  reason: invalid class name and case insensitive filesystem */
public class C208769yo implements C22856Ax7 {
    public int A00;
    public int A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    public boolean BPR(C1890892a r7, AnonymousClass825 r8) {
        String str;
        int i;
        int i2;
        if (!this.A04 || this.A02 != null) {
            str = this.A02;
        } else {
            str = r8.A00();
        }
        B0V b0v = r8.A00;
        if (b0v != null) {
            i2 = 0;
            i = 0;
            for (AnonymousClass9QD r0 : b0v.B9f()) {
                if (r0 == r8) {
                    i2 = i;
                }
                if (str == null || r0.A00().equals(str)) {
                    i++;
                }
            }
        } else {
            i2 = 0;
            i = 1;
        }
        int i3 = i - i2;
        if (this.A03) {
            i3 = i2 + 1;
        }
        int i4 = this.A00;
        int i5 = this.A01;
        if (i4 != 0) {
            int i6 = i3 - i5;
            if (i6 % i4 != 0) {
                return false;
            }
            i3 = Integer.signum(i6);
            if (i3 != 0) {
                i5 = Integer.signum(i4);
            }
            return true;
        }
        if (i3 == i5) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        Object[] objArr;
        String str2;
        if (this.A03) {
            str = "";
        } else {
            str = "last-";
        }
        if (this.A04) {
            objArr = new Object[4];
            objArr[0] = str;
            AnonymousClass000.A1L(objArr, this.A00, 1);
            AnonymousClass000.A1L(objArr, this.A01, 2);
            objArr[3] = this.A02;
            str2 = "nth-%schild(%dn%+d of type <%s>)";
        } else {
            objArr = new Object[3];
            objArr[0] = str;
            AnonymousClass000.A1L(objArr, this.A00, 1);
            AnonymousClass000.A1L(objArr, this.A01, 2);
            str2 = "nth-%schild(%dn%+d)";
        }
        return String.format(str2, objArr);
    }

    public C208769yo(String str, int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = str;
    }
}
