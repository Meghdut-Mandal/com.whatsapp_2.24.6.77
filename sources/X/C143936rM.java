package X;

/* renamed from: X.6rM  reason: invalid class name and case insensitive filesystem */
public class C143936rM implements C34841hj {
    public final long A00;
    public final long A01;
    public final AnonymousClass72P A02;
    public final AnonymousClass681 A03;
    public final AnonymousClass11F A04;

    public int BD8() {
        return 7;
    }

    public AnonymousClass11F BDC() {
        return null;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        C90474aD.A1S(objArr, this.A00);
        objArr[1] = this.A04;
        objArr[2] = this.A03;
        objArr[3] = Long.valueOf(this.A01);
        return AnonymousClass000.A0M(this.A02, objArr, 4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C143936rM)) {
            return false;
        }
        C143936rM r7 = (C143936rM) obj;
        if (this.A00 != r7.A00 || !this.A04.equals(r7.A04) || !this.A03.equals(r7.A03) || this.A01 != r7.A01 || !C1901797e.A00(this.A02, r7.A02)) {
            return false;
        }
        return true;
    }

    public C143936rM(AnonymousClass72P r1, AnonymousClass681 r2, AnonymousClass11F r3, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = r1;
    }

    public AnonymousClass72P B9E() {
        return this.A02;
    }

    public /* synthetic */ int BH3() {
        return -1;
    }
}
