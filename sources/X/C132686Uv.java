package X;

import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.6Uv  reason: invalid class name and case insensitive filesystem */
public final class C132686Uv {
    public static final AnonymousClass1US A0A = AnonymousClass1US.CROSSPOST_SNACKBAR_MANAGER;
    public final C24801Dv A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass1N3 A02;
    public final AnonymousClass1Q1 A03;
    public final C19770wU A04;
    public final C35021i1 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass005 A07;
    public final AnonymousClass005 A08;
    public final AnonymousClass005 A09;

    public static final AnonymousClass3ZU A00(C33541fX r5, C132686Uv r6, String str, int i, int i2) {
        AnonymousClass15K r2;
        WeakReference A002 = r6.A03.A00(str);
        AnonymousClass3ZU r3 = null;
        if (!(A002 == null || (r2 = (AnonymousClass15K) A002.get()) == null || r2.BAc().compareTo(AnonymousClass01P.STARTED) < 0)) {
            r3 = r2.BHi(i, 3500, false);
            AnonymousClass00C.A08(r3);
            if (!(r5 == null || i2 == 0)) {
                r3.A04(r5, i2);
                AnonymousClass0Eq r0 = r3.A01.A0J;
                AnonymousClass00C.A08(r0);
                r3.A03(C224514j.A00(r0.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
            }
        }
        return r3;
    }

    public static final void A01(C33541fX r2, C132686Uv r3, String str, int i, int i2, boolean z) {
        r3.A01.Bp3(new C1499373i(r2, r3, str, i, i2, z));
    }

    public static void A02(C132686Uv r3) {
        AnonymousClass1UZ r2 = (AnonymousClass1UZ) r3.A09.get();
        r2.A02(Boolean.valueOf(((AnonymousClass1UM) r3.A07.get()).A06(A0A)), "is_account_linked");
        r2.A03("TAP_UNDO");
    }

    public C132686Uv(C24801Dv r1, AnonymousClass17Y r2, AnonymousClass1N3 r3, AnonymousClass1Q1 r4, C19770wU r5, C35021i1 r6, AnonymousClass005 r7, AnonymousClass005 r8, AnonymousClass005 r9, AnonymousClass005 r10) {
        C36321k7.A1B(r2, r5, r4, r3, r1);
        C36321k7.A1C(r6, r7, r8, r9, r10);
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = r6;
        this.A08 = r7;
        this.A06 = r8;
        this.A09 = r9;
        this.A07 = r10;
    }
}
