package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7yf  reason: invalid class name and case insensitive filesystem */
public final class C167707yf extends AnonymousClass04R {
    public final C001700s A00 = C36431kI.A0S();
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36431kI.A0S();
    public final C001700s A03 = C36431kI.A0S();
    public final C001700s A04 = C36431kI.A0S();
    public final C19970wo A05;
    public final C220412q A06;
    public final AnonymousClass1GQ A07;
    public final C123915xI A08;
    public final AnonymousClass1SV A09;
    public final List A0A;
    public final AnonymousClass05H A0B;
    public final boolean A0C;
    public final AnonymousClass1X4 A0D;
    public final C18010sR A0E;

    public C167707yf(C191629Ds r8, AnonymousClass1X4 r9, C19970wo r10, C220412q r11, AnonymousClass1GQ r12, AnonymousClass1SV r13, List list, boolean z) {
        C36321k7.A17(r8, r10, r9, 1);
        C36321k7.A13(r13, r12, r11);
        this.A0A = list;
        this.A0C = z;
        this.A05 = r10;
        this.A0D = r9;
        this.A09 = r13;
        this.A07 = r12;
        this.A06 = r11;
        AnonymousClass040 A002 = C109325Xd.A00(this);
        C18800tq r0 = r8.A00.A02;
        this.A08 = new C123915xI(C36341k9.A0R(r0), C36351kA.A0a(r0), C36431kI.A0m(r0), C36341k9.A0Z(r0), C25141Fd.A00(), A002);
        C12960iw A003 = C05750Qx.A00(C023109s.A00, -2);
        this.A0E = A003;
        this.A0B = C06810Ve.A01(A003);
    }

    private final long A01(AnonymousClass9X9 r10, AnonymousClass9X9 r11, List list) {
        if (!this.A0C || !r11.A05) {
            int i = r11.A00;
            if (i > 1) {
                long j = ((long) i) - 1;
                String A022 = C65753Ti.A02(r11.A03);
                String str = r11.A02;
                list.add(new AnonymousClass9X9(r11.A01, str, A022, r11.A04, (int) j, false));
                return j;
            }
        } else if (!AnonymousClass00C.A0J(r10.A01.A1J.toString(), r11.A01.A1J.toString())) {
            list.add(r11);
        }
        return 0;
    }

    public final void A0S(int i) {
        C001700s r2 = this.A04;
        C195659Vl r0 = (C195659Vl) r2.A04();
        if (r0 == null || i != r0.A00) {
            C195659Vl r02 = (C195659Vl) r2.A04();
            C195659Vl r1 = null;
            if (r02 != null) {
                r1 = new C195659Vl(r02.A01, i);
            }
            r2.A0D(r1);
        }
    }

    public final void A0T(AnonymousClass9X9 r25, boolean z) {
        long A012;
        AnonymousClass9X9 r13 = r25;
        AnonymousClass3T1 r12 = r13.A01;
        if (C19970wo.A00(this.A05) - r12.A0I < 2592000000L) {
            ArrayList A0I = AnonymousClass001.A0I();
            long j = 0;
            String str = r13.A03;
            String A022 = C65753Ti.A02(str);
            C001700s r7 = this.A00;
            C195639Vj r0 = (C195639Vj) r7.A04();
            if (r0 != null) {
                for (AnonymousClass9X9 r02 : r0.A01) {
                    String str2 = r02.A03;
                    if (!AnonymousClass00C.A0J(C65753Ti.A02(str2), A022)) {
                        boolean z2 = r02.A05;
                        if (!z2 || this.A0C || !z) {
                            A0I.add(r02);
                            if (!this.A0C || !z2) {
                                A012 = (long) r02.A00;
                            }
                        } else {
                            A012 = A01(r02, r02, A0I);
                        }
                    } else {
                        int i = r02.A00;
                        if (i >= 1) {
                            if (!z) {
                                A012 = A01(r13, r02, A0I);
                            } else if (!this.A0C) {
                                A012 = ((long) i) + 1;
                                String str3 = r02.A02;
                                AnonymousClass3T1 r14 = r02.A01;
                                A0I.add(new AnonymousClass9X9(r14, str3, str2, r02.A04, (int) A012, true));
                            } else {
                                A012 = 0;
                            }
                        }
                    }
                    j += A012;
                }
            }
            if (A0I.isEmpty()) {
                C36341k9.A19(this.A01, true);
            } else {
                r7.A0C(new C195639Vj(A0I, j));
            }
            if (!z) {
                str = "";
            }
            this.A0D.A0e(r12, str, true);
            return;
        }
        C36331k8.A13(this.A03);
    }
}
