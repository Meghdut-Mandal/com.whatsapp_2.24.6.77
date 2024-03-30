package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.6rh  reason: invalid class name and case insensitive filesystem */
public final class C144146rh implements C159997kI {
    public final /* synthetic */ AnonymousClass6LI A00;

    public boolean BNk(C119425pn r2) {
        return true;
    }

    public C144146rh(AnonymousClass6LI r1) {
        this.A00 = r1;
    }

    public boolean BLg(C119425pn r3) {
        CallState callState = r3.A00.A09;
        AnonymousClass00C.A07(callState);
        return !C36361kB.A1a(callState, CallState.LINK);
    }

    public boolean BNA(C119425pn r2) {
        AnonymousClass6EE r0 = r2.A00.A05;
        if (r0 != null) {
            return r0.A0F;
        }
        return false;
    }
}
