package X;

import com.whatsapp.R;
import com.whatsapp.bonsai.waitlist.BonsaiWaitlistUnavailableBottomSheet;

/* renamed from: X.1K6  reason: invalid class name */
public final class AnonymousClass1K6 {
    public final AnonymousClass17Y A00;
    public final AnonymousClass1K7 A01;
    public final C25621Ha A02;
    public final C25661He A03;
    public final AnonymousClass1KA A04;
    public final C18820ts A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass005 A07;
    public final C21010yW A08;

    public AnonymousClass1K6(AnonymousClass17Y r2, AnonymousClass1K7 r3, C25621Ha r4, C25661He r5, AnonymousClass1KA r6, C18820ts r7, C21010yW r8, AnonymousClass005 r9, AnonymousClass005 r10) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r8, 2);
        AnonymousClass00C.A0D(r9, 3);
        AnonymousClass00C.A0D(r7, 4);
        AnonymousClass00C.A0D(r4, 5);
        AnonymousClass00C.A0D(r5, 6);
        AnonymousClass00C.A0D(r3, 7);
        AnonymousClass00C.A0D(r10, 8);
        AnonymousClass00C.A0D(r6, 9);
        this.A00 = r2;
        this.A08 = r8;
        this.A07 = r9;
        this.A05 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        this.A06 = r10;
        this.A04 = r6;
    }

    public static final void A00(C225314u r5, AnonymousClass4PL r6, AnonymousClass1K6 r7, C51412nm r8, Integer num) {
        C21010yW r2 = r7.A08;
        C45162Qh r1 = new C45162Qh();
        r1.A00 = 52;
        r1.A01 = num;
        r2.Bly(r1);
        AnonymousClass005 r22 = r7.A07;
        boolean A012 = ((C25681Hg) r22.get()).A01();
        C25681Hg r0 = (C25681Hg) r22.get();
        if (!A012) {
            if (!C20800yB.A01(C21000yV.A02, r0.A01, 5459)) {
                return;
            }
        } else if (r0.A00()) {
            A01(r5, r6, r7, r8, num);
            return;
        } else {
            if (C20800yB.A01(C21000yV.A02, ((C25681Hg) r22.get()).A01, 5459)) {
                C85614Ht r4 = new C85614Ht(r5, r6, r7, r8, num);
                AnonymousClass1KA r3 = r7.A04;
                if (r3.A02.A02() == C52232p6.IN_WAITLIST) {
                    r7.A00.A05(0, R.string.f12nameremoved);
                    r3.A01(new C69603dn(r5, new C69623dp(r7, r4)));
                    return;
                }
                r4.invoke();
                return;
            }
        }
        r5.Btm(new BonsaiWaitlistUnavailableBottomSheet());
    }

    public static final void A01(C225314u r5, AnonymousClass4PL r6, AnonymousClass1K6 r7, C51412nm r8, Integer num) {
        C85624Hu r4 = new C85624Hu(r5, r6, r7, r8, num);
        C25621Ha r3 = r7.A02;
        if (r3.A04(r8)) {
            r4.invoke();
            return;
        }
        r7.A00.A05(0, R.string.f12nameremoved);
        r3.A01.A00(new C21120A9f(r3, new AnonymousClass4HS(r7, r8, r4)), 20230902, 20230901, 20240216);
    }
}
