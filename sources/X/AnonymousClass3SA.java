package X;

/* renamed from: X.3SA  reason: invalid class name */
public class AnonymousClass3SA {
    public long A00;
    public long A01;
    public String A02;
    public String A03;
    public String A04;
    public final AnonymousClass3T1 A05;

    public AnonymousClass3SA(AnonymousClass3T1 r6) {
        this.A05 = r6;
        this.A04 = null;
        this.A00 = 0;
        this.A01 = Long.MAX_VALUE;
        this.A03 = null;
        this.A02 = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass3SA)) {
            return false;
        }
        AnonymousClass3SA r7 = (AnonymousClass3SA) obj;
        return C1901797e.A00(this.A05, r7.A05) && C1901797e.A00(this.A04, r7.A04) && this.A00 == r7.A00 && this.A01 == r7.A01 && C1901797e.A00(this.A03, r7.A03) && C1901797e.A00(this.A02, r7.A02);
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A05;
        objArr[1] = this.A04;
        C36361kB.A1W(objArr, this.A00);
        objArr[3] = Long.valueOf(this.A01);
        objArr[4] = this.A03;
        return AnonymousClass000.A0M(this.A02, objArr, 5);
    }

    public boolean A00() {
        String str;
        AnonymousClass3T1 r1 = this.A05;
        if (r1 instanceof AnonymousClass2bU) {
            str = ((AnonymousClass2bU) r1).A07;
        } else {
            str = null;
        }
        if (AnonymousClass2bU.A03(str) || this.A04 != null) {
            return false;
        }
        return true;
    }

    public boolean A01(long j) {
        long j2 = this.A01;
        if (j2 == Long.MAX_VALUE) {
            if (j > this.A00) {
                return true;
            }
            return false;
        } else if (j2 + 86400000 < j) {
            return true;
        } else {
            return false;
        }
    }

    public AnonymousClass3SA(AnonymousClass3T1 r3, String str, String str2, String str3, long j) {
        this.A05 = r3;
        this.A04 = str;
        this.A00 = j;
        this.A01 = Long.MAX_VALUE;
        this.A03 = str2;
        this.A02 = str3;
    }

    public AnonymousClass3SA(AnonymousClass3T1 r4, String str, long j) {
        this.A05 = r4;
        this.A04 = str;
        this.A00 = j;
        this.A01 = Long.MAX_VALUE;
        this.A03 = null;
        this.A02 = null;
    }
}
