package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.6rf  reason: invalid class name and case insensitive filesystem */
public final class C144126rf implements C159997kI {
    public final /* synthetic */ AnonymousClass6LI A00;

    public C144126rf(AnonymousClass6LI r1) {
        this.A00 = r1;
    }

    public boolean BLg(C119425pn r4) {
        CallState callState = r4.A00.A09;
        AnonymousClass00C.A07(callState);
        if ((callState == CallState.ACTIVE || callState == CallState.CONNECTED_LONELY) && callState != CallState.LINK) {
            return true;
        }
        return false;
    }

    public boolean BNA(C119425pn r4) {
        AnonymousClass6EE r0;
        AnonymousClass6OZ r1 = r4.A00;
        if (!r1.A0N || (r0 = r1.A05) == null || AnonymousClass000.A1S(r0.A06, 6)) {
            return false;
        }
        return true;
    }

    public boolean BNk(C119425pn r3) {
        AnonymousClass6OZ r1 = r3.A00;
        if ((r1.A0N || !r1.A0J) && this.A00.A01.BJo()) {
            return true;
        }
        return false;
    }
}
