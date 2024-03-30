package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.6rg  reason: invalid class name and case insensitive filesystem */
public final class C144136rg implements C159997kI {
    public final /* synthetic */ AnonymousClass6LI A00;

    public boolean BNA(C119425pn r2) {
        return false;
    }

    public boolean BNk(C119425pn r2) {
        return true;
    }

    public C144136rg(AnonymousClass6LI r1) {
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
}
