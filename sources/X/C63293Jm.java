package X;

/* renamed from: X.3Jm  reason: invalid class name and case insensitive filesystem */
public final class C63293Jm {
    public final C19420v0 A00;
    public final C21520zN A01;
    public final C20810yC A02;
    public final AnonymousClass3L9 A03;

    public final C52012ok A00() {
        C52012ok r3;
        AnonymousClass3L9 r1 = this.A03;
        if (!C19550w8.A05()) {
            r3 = C52012ok.DISABLED_ANDROID_TOO_OLD;
        } else if (!r1.A04()) {
            r3 = C52012ok.DISABLED_PLAY_SERVICES_DISABLED;
        } else if (!r1.A02()) {
            r3 = C52012ok.DISABLED_GMS_TOO_OLD;
        } else if (!r1.A01()) {
            r3 = C52012ok.DISABLED_DEVICE_NOT_SECURED;
        } else {
            r3 = C52012ok.ENABLED;
        }
        boolean z = C36341k9.A0E(this.A00).getBoolean("reg_abprop_passkey_create", false);
        if (r3.ordinal() != 0) {
            return r3;
        }
        if (z) {
            return C52012ok.ENABLED;
        }
        return C52012ok.DISABLED_NOT_ROLLED_OUT;
    }

    public final C52012ok A01() {
        C52012ok r3;
        AnonymousClass3L9 r2 = this.A03;
        if (!C19550w8.A05()) {
            r3 = C52012ok.DISABLED_ANDROID_TOO_OLD;
        } else {
            if (!C19550w8.A0A() || (this.A01.A0E(7644) && !r2.A00())) {
                if (!r2.A04()) {
                    r3 = C52012ok.DISABLED_PLAY_SERVICES_DISABLED;
                } else if (!r2.A03()) {
                    r3 = C52012ok.DISABLED_GMS_TOO_OLD;
                }
            }
            r3 = C52012ok.ENABLED;
        }
        boolean A0E = this.A01.A0E(4733);
        if (r3.ordinal() != 0) {
            return r3;
        }
        if (A0E) {
            return C52012ok.ENABLED;
        }
        return C52012ok.DISABLED_NOT_ROLLED_OUT;
    }

    public final boolean A02() {
        C52012ok r5 = C52012ok.ENABLED;
        C52012ok A002 = A00();
        AnonymousClass005 r3 = this.A00.A00;
        boolean z = !C36391kE.A0H(r3).getBoolean("reg_abprop_passkey_create_education_screen", false);
        if (A002.ordinal() == 0) {
            if (z) {
                A002 = r5;
            } else {
                A002 = C52012ok.DISABLED_NOT_ROLLED_OUT;
            }
        }
        boolean z2 = C36391kE.A0H(r3).getBoolean("reg_abprop_passkey_create_delay_keyboard", false);
        if (A002.ordinal() == 0) {
            if (z2) {
                return true;
            }
            return false;
        } else if (r5 == A002) {
            return true;
        } else {
            return false;
        }
    }

    public C63293Jm(C19420v0 r2, C21520zN r3, C20810yC r4, AnonymousClass3L9 r5) {
        C36321k7.A0x(r4, r3);
        AnonymousClass00C.A0D(r2, 4);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
    }
}
