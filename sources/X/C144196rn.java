package X;

import com.whatsapp.calling.calldatasource.CallRepository$getCallStateModel$1;
import com.whatsapp.calling.controls.viewmodel.CallControlStateHolder$uiState$2;
import com.whatsapp.calling.controls.viewmodel.CallControlStateHolder$uiState$3;

/* renamed from: X.6rn  reason: invalid class name and case insensitive filesystem */
public final class C144196rn implements AnonymousClass7gG {
    public AnonymousClass6OZ A00;
    public AnonymousClass6YM A01;
    public final C001600r A02;
    public final AnonymousClass6LI A03;
    public final AnonymousClass1PW A04;
    public final AnonymousClass711 A05;
    public final C19420v0 A06;
    public final C28201Rs A07;
    public final AnonymousClass05H A08;
    public final C20830yE A09;
    public final AnonymousClass13J A0A;
    public final C005502l A0B;

    public static final void A00(C144196rn r3) {
        AnonymousClass6EE r0;
        AnonymousClass6YM r02;
        if (AnonymousClass3UD.A08(r3.A09, r3.A0A, true)) {
            r3.A07.A0D(C107985Rs.CALL_UPGRADE_NO_PERMISSION);
            return;
        }
        AnonymousClass6OZ r1 = r3.A00;
        if (r1 != null && !r1.A0J && (r0 = r1.A05) != null && r0.A06 == 0 && (r02 = r3.A01) != null) {
            r02.A0P();
        }
    }

    public C144196rn(C116915lP r7, AnonymousClass6LI r8, AnonymousClass1PW r9, C122415uo r10, AnonymousClass711 r11, C20830yE r12, C19420v0 r13, AnonymousClass13J r14, C005502l r15) {
        C36321k7.A19(r10, r14, r11, r9);
        C36321k7.A10(r12, r13);
        AnonymousClass00C.A0D(r15, 9);
        this.A0A = r14;
        this.A05 = r11;
        this.A04 = r9;
        this.A09 = r12;
        this.A06 = r13;
        this.A03 = r8;
        this.A0B = r15;
        C28201Rs A0t = C36441kJ.A0t();
        this.A07 = A0t;
        this.A02 = A0t;
        this.A08 = AnonymousClass0R1.A00(r15, new C18510tH((Object) new CallControlStateHolder$uiState$3(this, (C023509x) null), (Object) new C18510tH((C009003v) new CallControlStateHolder$uiState$2(this, (C023509x) null), (AnonymousClass05H) new C12990iz(new AnonymousClass5YS(this, 2), AnonymousClass0R0.A00(new CallRepository$getCallStateModel$1(r7, (C023509x) null, false)), (AnonymousClass05H) r10.A02.getValue()), 1), 0));
    }

    public void BgL(AnonymousClass6YM r1) {
        this.A01 = r1;
    }
}
