package X;

import com.whatsapp.R;

/* renamed from: X.1tz  reason: invalid class name and case insensitive filesystem */
public class C39861tz extends AnonymousClass04R {
    public boolean A00;
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02;
    public final C61713Dd A03;
    public final C28201Rs A04 = C36441kJ.A0t();
    public final C28201Rs A05 = C36441kJ.A0t();
    public final AnonymousClass17Y A06;
    public final C19600wD A07;
    public final C19770wU A08;

    public C39861tz(AnonymousClass17Y r4, C61713Dd r5, C19600wD r6, C19420v0 r7, C19770wU r8) {
        C001700s A0S = C36431kI.A0S();
        this.A02 = A0S;
        this.A06 = r4;
        this.A08 = r8;
        this.A00 = true;
        this.A03 = r5;
        this.A07 = r6;
        C36341k9.A18(A0S, r7.A2H());
    }

    public static void A01(C39861tz r4) {
        if (!r4.A07.A09()) {
            r4.A05.A0D(new C53662rg());
            return;
        }
        C36341k9.A16(r4.A01, R.string.f12nameremoved);
        C80213v2.A01(r4.A08, r4, 1);
        r4.A00 = false;
        r4.A06.A0I(C80213v2.A00(r4, 2), 1000);
    }
}
