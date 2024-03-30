package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6WV  reason: invalid class name */
public final class AnonymousClass6WV {
    public AnonymousClass6WV A00;
    public boolean A01;
    public final int A02;
    public final C137856gq A03;
    public final C137846gp A04;
    public final C1496172a A05;
    public final boolean A06;

    private final void A03(List list) {
        List A0I;
        if (this.A01) {
            A0I = C023409w.A00;
        } else {
            A0I = AnonymousClass001.A0I();
            A01(this.A04, A0I);
        }
        int size = A0I.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass6WV r1 = (AnonymousClass6WV) A0I.get(i);
            if (r1.A06 && r1.A05.A01) {
                list.add(r1);
            } else if (!r1.A05.A00) {
                r1.A03(list);
            }
        }
    }

    public static final List A00(AnonymousClass6WV r9, boolean z, boolean z2) {
        List list;
        String str;
        if (z || !r9.A05.A00) {
            if (r9.A06 && r9.A05.A01) {
                ArrayList A0I = AnonymousClass001.A0I();
                r9.A03(A0I);
                return A0I;
            } else if (!r9.A01) {
                ArrayList A0I2 = AnonymousClass001.A0I();
                r9.A01(r9.A04, A0I2);
                if (!z2) {
                    return A0I2;
                }
                C1496172a r8 = r9.A05;
                AnonymousClass68P r1 = (AnonymousClass68P) AnonymousClass5XP.A02(r8, C114205gq.A0H);
                if (r1 != null && r8.A01 && C36411kG.A1a(A0I2)) {
                    C154187Rf r0 = new C154187Rf(r1);
                    C1496172a r6 = new C1496172a();
                    r6.A01 = false;
                    r6.A00 = false;
                    r0.invoke(r6);
                    AnonymousClass6WV r02 = new AnonymousClass6WV(new C94404iA(r0), new C137846gp(true, r9.A02 + 1000000000), r6, false);
                    r02.A01 = true;
                    r02.A00 = r9;
                    A0I2.add(r02);
                }
                AnonymousClass62Q r12 = C114205gq.A02;
                if (!C1496172a.A00(r8, r12) || !C36411kG.A1a(A0I2) || !r8.A01 || (list = (List) AnonymousClass5XP.A02(r8, r12)) == null || (str = (String) C007103b.A0M(list)) == null) {
                    return A0I2;
                }
                C154197Rg r03 = new C154197Rg(str);
                C1496172a r62 = new C1496172a();
                r62.A01 = false;
                r62.A00 = false;
                r03.invoke(r62);
                AnonymousClass6WV r04 = new AnonymousClass6WV(new C94404iA(r03), new C137846gp(true, r9.A02 + 2000000000), r62, false);
                r04.A01 = true;
                r04.A00 = r9;
                A0I2.add(0, r04);
                return A0I2;
            }
        }
        return C023409w.A00;
    }

    private final void A02(C1496172a r11) {
        List A0I;
        if (!this.A05.A00) {
            if (this.A01) {
                A0I = C023409w.A00;
            } else {
                A0I = AnonymousClass001.A0I();
                A01(this.A04, A0I);
            }
            int size = A0I.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass6WV r6 = (AnonymousClass6WV) A0I.get(i);
                if (!r6.A06 || !r6.A05.A01) {
                    Iterator A0y = AnonymousClass000.A0y(r6.A05.A02);
                    while (A0y.hasNext()) {
                        Map.Entry A11 = AnonymousClass000.A11(A0y);
                        AnonymousClass62Q r4 = (AnonymousClass62Q) A11.getKey();
                        Object value = A11.getValue();
                        Map map = r11.A02;
                        Object obj = map.get(r4);
                        AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object invoke = r4.A02.invoke(obj, value);
                        if (invoke != null) {
                            map.put(r4, invoke);
                        }
                    }
                    r6.A02(r11);
                }
            }
        }
    }

    public final C94894iy A06() {
        if (this.A01) {
            AnonymousClass6WV A08 = A08();
            if (A08 != null) {
                return A08.A06();
            }
            return null;
        }
        AnonymousClass7bY A002 = AnonymousClass6GA.A00(this.A04);
        if (A002 == null) {
            A002 = this.A03;
        }
        return C137856gq.A06((C137856gq) A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r4.A05.A01 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C1496172a A07() {
        /*
            r4 = this;
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x000b
            X.72a r0 = r4.A05
            boolean r1 = r0.A01
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            X.72a r3 = r4.A05
            if (r0 == 0) goto L_0x0028
            X.72a r2 = new X.72a
            r2.<init>()
            boolean r0 = r3.A01
            r2.A01 = r0
            boolean r0 = r3.A00
            r2.A00 = r0
            java.util.Map r1 = r2.A02
            java.util.Map r0 = r3.A02
            r1.putAll(r0)
            r3 = r2
            r4.A02(r2)
        L_0x0028:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WV.A07():X.72a");
    }

    public final AnonymousClass6WV A08() {
        C137846gp r2;
        AnonymousClass6WV r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        boolean z = this.A06;
        if (z) {
            r2 = this.A04;
            C155657Wx r1 = C155657Wx.A00;
            while (true) {
                r2 = r2.A0A();
                if (r2 != null) {
                    if (AnonymousClass000.A1X(r1.invoke(r2))) {
                        break;
                    }
                } else {
                    break;
                }
            }
            return AnonymousClass6GA.A01(r2, z);
        }
        r2 = this.A04;
        C155667Wy r12 = C155667Wy.A00;
        do {
            r2 = r2.A0A();
            if (r2 == null) {
                return null;
            }
        } while (!AnonymousClass000.A1X(r12.invoke(r2)));
        return AnonymousClass6GA.A01(r2, z);
    }

    public final boolean A09() {
        if (this.A01 || !A00(this, false, true).isEmpty()) {
            return false;
        }
        C137846gp r2 = this.A04;
        C155647Ww r1 = C155647Ww.A00;
        do {
            r2 = r2.A0A();
            if (r2 == null) {
                return true;
            }
        } while (!AnonymousClass000.A1X(r1.invoke(r2)));
        return false;
    }

    public AnonymousClass6WV(C137856gq r2, C137846gp r3, C1496172a r4, boolean z) {
        this.A03 = r2;
        this.A06 = z;
        this.A04 = r3;
        this.A05 = r4;
        this.A02 = r3.A01;
    }

    private final void A01(C137846gp r7, List list) {
        C1506776e A08 = r7.A08();
        int i = A08.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A08.A01;
            do {
                C137846gp r2 = (C137846gp) objArr[i2];
                if (r2.A09 != null) {
                    if (AnonymousClass000.A1P(8 & r2.A0R.A02.A00)) {
                        list.add(AnonymousClass6GA.A01(r2, this.A06));
                    } else {
                        A01(r2, list);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final AnonymousClass6QC A04() {
        C94894iy A062 = A06();
        if (A062 == null || !A062.A0M().A08) {
            return AnonymousClass6QC.A04;
        }
        return C109155Wm.A00(A062).BOQ(A062, true);
    }

    public final AnonymousClass6QC A05() {
        C94894iy A062 = A06();
        if (A062 != null && A062.A0M().A08) {
            C160787la A002 = C109155Wm.A00(A062);
            AnonymousClass6QC BOQ = C109155Wm.A00(A062).BOQ(A062, true);
            long BHd = A002.BHd();
            float A08 = (float) C90494aF.A08(BHd);
            float A032 = (float) C90474aD.A03(BHd);
            float A012 = C15040mb.A01(BOQ.A01, 0.0f, A08);
            float A013 = C15040mb.A01(BOQ.A03, 0.0f, A032);
            float A014 = C15040mb.A01(BOQ.A02, 0.0f, A08);
            float A015 = C15040mb.A01(BOQ.A00, 0.0f, A032);
            if (!(A012 == A014 || A013 == A015)) {
                long A0B = C90464aC.A0B(A012, A013);
                long j = C133206Xf.A03;
                long BOU = A002.BOU(A0B);
                long BOU2 = A002.BOU(C90464aC.A0B(A014, A013));
                long BOU3 = A002.BOU(C90464aC.A0B(A014, A015));
                long BOU4 = A002.BOU(C90464aC.A0B(A012, A015));
                float A003 = C133206Xf.A00(BOU);
                float[] fArr = {C133206Xf.A00(BOU2), C133206Xf.A00(BOU4), C133206Xf.A00(BOU3)};
                int i = 0;
                do {
                    A003 = Math.min(A003, fArr[i]);
                    i++;
                } while (i < 3);
                float A016 = C133206Xf.A01(BOU);
                float[] fArr2 = {C133206Xf.A01(BOU2), C133206Xf.A01(BOU4), C133206Xf.A01(BOU3)};
                int i2 = 0;
                do {
                    A016 = Math.min(A016, fArr2[i2]);
                    i2++;
                } while (i2 < 3);
                float A004 = C133206Xf.A00(BOU);
                float[] fArr3 = {C133206Xf.A00(BOU2), C133206Xf.A00(BOU4), C133206Xf.A00(BOU3)};
                int i3 = 0;
                do {
                    A004 = Math.max(A004, fArr3[i3]);
                    i3++;
                } while (i3 < 3);
                float A017 = C133206Xf.A01(BOU);
                float[] fArr4 = {C133206Xf.A01(BOU2), C133206Xf.A01(BOU4), C133206Xf.A01(BOU3)};
                int i4 = 0;
                do {
                    A017 = Math.max(A017, fArr4[i4]);
                    i4++;
                } while (i4 < 3);
                return new AnonymousClass6QC(A003, A016, A004, A017);
            }
        }
        return AnonymousClass6QC.A04;
    }
}
