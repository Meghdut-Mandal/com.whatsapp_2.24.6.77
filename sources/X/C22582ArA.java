package X;

/* renamed from: X.ArA  reason: case insensitive filesystem */
public final class C22582ArA extends C203629oQ {
    public void A0D(C202499m2 r8, C203329nn r9, int i, int i2) {
        int i3;
        int i4;
        super.A0D(r8, r9, i, i2);
        C203629oQ r3 = new C203629oQ((C201489jh) null);
        int length = this.A05.length;
        int length2 = this.A06.length;
        if (r3.A05 == null) {
            r3.A05 = new int[length];
        }
        for (int i5 = 0; i5 < length; i5++) {
            int[] iArr = this.A07;
            if (iArr == null || i5 >= iArr.length || (i4 = iArr[i5]) == 0) {
                i3 = this.A05[i5];
            } else {
                i3 = C203629oQ.A03(this, i4, length2);
            }
            if (this.A04 != null) {
                i3 = C203629oQ.A04(this, r9, i3);
            }
            C203629oQ.A0A(r9, r3.A05, i3, i5);
        }
        int length3 = this.A06.length + this.A02;
        if (r3.A06 == null) {
            r3.A06 = new int[(this.A03 + length3)];
        }
        for (int i6 = 0; i6 < length3; i6++) {
            int i7 = this.A06[i6];
            if (this.A04 != null) {
                i7 = C203629oQ.A04(this, r9, i7);
            }
            C203629oQ.A0A(r9, r3.A06, i7, i6);
        }
        for (int i8 = 0; i8 < this.A03; i8++) {
            int A03 = C203629oQ.A03(this, this.A08[i8], length2);
            if (this.A04 != null) {
                A03 = C203629oQ.A04(this, r9, A03);
            }
            C203629oQ.A0A(r9, r3.A06, A03, length3 + i8);
        }
        this.A05 = r3.A05;
        this.A06 = r3.A06;
        this.A02 = 0;
        this.A07 = r3.A07;
        this.A08 = r3.A08;
        this.A03 = r3.A03;
        this.A01 = r3.A01;
        this.A04 = r3.A04;
    }

    public C22582ArA(C201489jh r1) {
        super(r1);
    }
}
