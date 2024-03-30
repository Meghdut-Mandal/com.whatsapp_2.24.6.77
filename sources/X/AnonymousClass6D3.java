package X;

import java.util.Map;

/* renamed from: X.6D3  reason: invalid class name */
public final class AnonymousClass6D3 {
    public final AnonymousClass6MZ A00;
    public final C131616Pt A01;
    public final AnonymousClass62E A02;
    public final C130996Nh A03;
    public final C118025nD A04;

    public final void A00(AnonymousClass64K r14, Boolean bool, String str, String str2, String str3, String str4) {
        C134906bn A002 = this.A02.A00(str3);
        String str5 = str;
        String str6 = str4;
        this.A04.A00.A03(A002, new C163867qt(new C123505wc(r14, this, A002, str5, str6), 1), bool, str5, str6, str2);
    }

    public final void A01(AnonymousClass64K r13, String str, String str2, Map map, int i) {
        String str3 = str;
        AnonymousClass00C.A0D(str, 0);
        String A0k = C90474aD.A0k(map);
        String str4 = str2;
        AnonymousClass00C.A0D(str2, 1);
        C134906bn A002 = this.A02.A00(str2);
        AnonymousClass64K r6 = r13;
        if (A002 != null) {
            C122855vX r0 = (C122855vX) this.A01.A01(new AnonymousClass5OH(this.A00, str, A0k), A002.A01);
            if (r0 != null && r0.A00 == 5) {
                r13.A00();
                return;
            }
        }
        String A003 = C130996Nh.A00(Integer.valueOf(i));
        if (A003 == null) {
            A003 = "";
        }
        A00(r6, false, str3, A003, str4, A0k);
    }

    public AnonymousClass6D3(AnonymousClass6MZ r2, C130996Nh r3, C131616Pt r4, AnonymousClass62E r5, C118025nD r6) {
        C36321k7.A11(r4, r2, r3);
        AnonymousClass00C.A0D(r5, 5);
        this.A01 = r4;
        this.A00 = r2;
        this.A03 = r3;
        this.A04 = r6;
        this.A02 = r5;
        r2.A00 = AnonymousClass5S9.BLOKS_LAYOUT_OBJECT;
    }
}
