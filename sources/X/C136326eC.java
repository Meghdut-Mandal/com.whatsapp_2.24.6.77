package X;

import java.util.LinkedHashMap;

/* renamed from: X.6eC  reason: invalid class name and case insensitive filesystem */
public final class C136326eC implements C161407mr {
    public final AnonymousClass61Q A00;

    public C136326eC(AnonymousClass61Q r1) {
        this.A00 = r1;
    }

    /* renamed from: A00 */
    public C136436eO BxI(C156857b4 r18) {
        LinkedHashMap A1G = C36431kI.A1G();
        AnonymousClass61Q r12 = this.A00;
        AnonymousClass0G6 r0 = r12.A01;
        int[] iArr = r0.A02;
        Object[] objArr = r0.A04;
        long[] jArr = r0.A03;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            C118205nV r13 = (C118205nV) objArr[i4];
                            A1G.put(Integer.valueOf(i5), C36441kJ.A19(((C136386eJ) r18).A01.invoke(r13.A01), r13.A00));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return new C136436eO(A1G, r12.A00);
    }
}
