package X;

import java.util.HashMap;

/* renamed from: X.6Lr  reason: invalid class name and case insensitive filesystem */
public final class C130596Lr {
    public int A00 = -1;
    public int A01;
    public AnonymousClass0G9 A02;
    public Object A03;
    public final AnonymousClass0GA A04 = new AnonymousClass0GA(6);
    public final AnonymousClass0GB A05 = new AnonymousClass0GB(6);
    public final C158787iE A06 = new AnonymousClass6Y9(this, 1);
    public final C1506776e A07 = C1506776e.A02(new C161537n4[16]);
    public final AnonymousClass68K A08 = new AnonymousClass68K();
    public final AnonymousClass68K A09 = new AnonymousClass68K();
    public final HashMap A0A = AnonymousClass001.A0J();
    public final C006302t A0B;

    public static final void A00(AnonymousClass0G9 r16, C130596Lr r17, Object obj, Object obj2, int i) {
        C130596Lr r7 = r17;
        if (r7.A01 <= 0) {
            int i2 = -1;
            AnonymousClass0G9 r2 = r16;
            Object obj3 = obj;
            int A012 = AnonymousClass0G9.A01(r2, obj3);
            if (A012 < 0) {
                A012 = ~A012;
            } else {
                i2 = r2.A02[A012];
            }
            r2.A04[A012] = obj;
            int[] iArr = r2.A02;
            int i3 = i;
            iArr[A012] = i;
            if ((obj3 instanceof C161537n4) && i2 != i3) {
                C94074hb BAf = ((C161537n4) obj3).BAf();
                r7.A0A.put(obj3, BAf.A04);
                C06700Us r0 = BAf.A03;
                AnonymousClass68K r11 = r7.A08;
                r11.A00(obj3);
                Object[] objArr = r0.A04;
                long[] jArr = r0.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                            int A062 = C90484aE.A06(i4, length);
                            for (int i5 = 0; i5 < A062; i5++) {
                                if ((j & 255) < 128) {
                                    C159857k2 r1 = (C159857k2) objArr[(i4 << 3) + i5];
                                    if (r1 instanceof C137226fn) {
                                        ((C137226fn) r1).A02(2);
                                    }
                                    r11.A01(r1, obj3);
                                }
                                j >>= 8;
                            }
                            if (A062 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
            }
            if (i2 == -1) {
                if (obj3 instanceof C137226fn) {
                    ((C137226fn) obj3).A02(2);
                }
                r7.A09.A01(obj3, obj2);
            }
        }
    }

    public C130596Lr(C006302t r3) {
        this.A0B = r3;
    }
}
