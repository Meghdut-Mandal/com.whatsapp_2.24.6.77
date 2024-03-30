package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment;

/* renamed from: X.3HA  reason: invalid class name */
public final class AnonymousClass3HA {
    public final C220412q A00;
    public final AnonymousClass17Y A01;
    public final C21100yf A02;
    public final C19600wD A03;
    public final AnonymousClass16D A04;
    public final AnonymousClass171 A05;
    public final C18820ts A06;
    public final C24381Cf A07;
    public final AnonymousClass17X A08;
    public final C20810yC A09;
    public final C20350xQ A0A;
    public final C20510xg A0B;
    public final AnonymousClass190 A0C;
    public final AnonymousClass1C4 A0D;

    public final void A00(C225314u r6, AnonymousClass11F r7, AnonymousClass147 r8) {
        String A082;
        AnonymousClass3G4 r0;
        boolean A1a = C36341k9.A1a(r7, r6);
        C220412q r2 = this.A00;
        C65073Qp A092 = r2.A09(r7, false);
        if (A092 == null || (r0 = A092.A0e) == null || r0.A00 != A1a) {
            C65073Qp A093 = r2.A09(r7, false);
            if (A093 != null && (A082 = A093.A08()) != null && A082.length() == 0) {
                C54482t1.A00(r6, 2, R.string.f12nameremoved);
            } else if (r8 == null || !this.A09.A0E(7608)) {
                r6.startActivity(AnonymousClass190.A0W(r6, r7));
            } else {
                String A0D2 = r2.A0D(r8);
                if (A0D2 != null) {
                    C39001qm A002 = AnonymousClass3LW.A00(r6);
                    A002.A0m(r6, new AnonymousClass3UW(r7, r6, 21), R.string.f12nameremoved);
                    A002.A0l(r6, C67913b2.A00, R.string.f12nameremoved);
                    A002.A0d(R.string.f12nameremoved);
                    A002.A0p(C36351kA.A0w(r6, A0D2, 1, R.string.f12nameremoved));
                    A002.A0b();
                }
            }
        } else {
            r6.Btm(InviteLinkUnavailableDialogFragment.A03(false, A1a));
        }
    }

    public final void A01(C225314u r32, AnonymousClass11F r33, String str) {
        AnonymousClass11F r13 = r33;
        AnonymousClass00C.A0D(r13, 0);
        C20810yC r12 = this.A09;
        AnonymousClass17Y r10 = this.A01;
        AnonymousClass1C4 r9 = this.A0D;
        C21100yf r8 = this.A02;
        C18820ts r7 = this.A06;
        AnonymousClass171 r6 = this.A05;
        AnonymousClass16D r5 = this.A04;
        C20350xQ r4 = this.A0A;
        C20510xg r3 = this.A0B;
        C19600wD r2 = this.A03;
        C24381Cf r1 = this.A07;
        C225314u r14 = r32;
        C20510xg r28 = r3;
        C20350xQ r27 = r4;
        C20810yC r26 = r12;
        AnonymousClass17X r25 = this.A08;
        C24381Cf r24 = r1;
        C18820ts r23 = r7;
        AnonymousClass171 r22 = r6;
        AnonymousClass16D r21 = r5;
        C19600wD r20 = r2;
        C21100yf r19 = r8;
        AnonymousClass17Y r18 = r10;
        C225314u r17 = r14;
        C63433Ka r15 = new C63433Ka((View) null, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, (AnonymousClass147) r13, r9);
        r15.A00 = new C75123mi(r14, r13);
        r15.A00(str);
    }

    public AnonymousClass3HA(AnonymousClass17Y r2, C21100yf r3, C19600wD r4, AnonymousClass16D r5, AnonymousClass171 r6, C18820ts r7, C220412q r8, C24381Cf r9, AnonymousClass17X r10, C20810yC r11, C20350xQ r12, C20510xg r13, AnonymousClass190 r14, AnonymousClass1C4 r15) {
        C36321k7.A1B(r11, r2, r8, r14, r15);
        C36321k7.A1C(r3, r5, r6, r7, r12);
        C36321k7.A15(r13, r9, r10);
        AnonymousClass00C.A0D(r4, 14);
        this.A09 = r11;
        this.A01 = r2;
        this.A00 = r8;
        this.A0C = r14;
        this.A0D = r15;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A0A = r12;
        this.A0B = r13;
        this.A07 = r9;
        this.A08 = r10;
        this.A03 = r4;
    }
}
