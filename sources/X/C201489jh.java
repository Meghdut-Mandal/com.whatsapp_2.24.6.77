package X;

/* renamed from: X.9jh  reason: invalid class name and case insensitive filesystem */
public class C201489jh {
    public static final C201489jh A0D = new C201489jh();
    public int A00;
    public C193269Ku A01;
    public C203629oQ A02;
    public C201489jh A03;
    public C201489jh A04;
    public short A05;
    public short A06;
    public short A07;
    public short A08;
    public short A09;
    public short A0A;
    public int[] A0B;
    public int[] A0C;

    public static void A00(C201489jh r5, int i, int i2, int i3) {
        int[] iArr = r5.A0B;
        if (iArr == null) {
            iArr = new int[6];
            r5.A0B = iArr;
        }
        int i4 = iArr[0];
        int i5 = i4 + 2;
        int length = iArr.length;
        if (i5 >= length) {
            int[] iArr2 = new int[(length + 6)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            r5.A0B = iArr2;
            iArr = iArr2;
        }
        int i6 = i4 + 1;
        iArr[i6] = i;
        int i7 = i6 + 1;
        iArr[i7] = i2 | i3;
        iArr[0] = i7;
    }

    public final void A01(C201639k2 r4, int i, boolean z) {
        if ((this.A05 & 4) != 0) {
            int i2 = this.A00 - i;
            if (z) {
                r4.A06(i2);
            } else {
                r4.A07(i2);
            }
        } else if (z) {
            A00(this, i, 536870912, r4.A00);
            r4.A06(-1);
        } else {
            A00(this, i, 268435456, r4.A00);
            r4.A07(-1);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A02(short r7) {
        /*
            r6 = this;
            X.9jh r5 = A0D
            r6.A04 = r5
            r4 = r6
        L_0x0005:
            if (r4 == r5) goto L_0x0032
            X.9jh r3 = r4.A04
            r0 = 0
            r4.A04 = r0
            short r0 = r4.A0A
            if (r0 != 0) goto L_0x0030
            r4.A0A = r7
            X.9Ku r2 = r4.A01
            r1 = r2
        L_0x0015:
            if (r2 == 0) goto L_0x0030
            short r0 = r4.A05
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0024
            X.9Ku r0 = r1.A00
            if (r2 != r0) goto L_0x0024
        L_0x0021:
            X.9Ku r2 = r2.A00
            goto L_0x0015
        L_0x0024:
            X.9jh r0 = r2.A02
            X.9jh r0 = r0.A04
            if (r0 != 0) goto L_0x0021
            X.9jh r0 = r2.A02
            r0.A04 = r3
            r3 = r0
            goto L_0x0021
        L_0x0030:
            r4 = r3
            goto L_0x0005
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201489jh.A02(short):void");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("L");
        return C36381kD.A10(A0u, System.identityHashCode(this));
    }
}
