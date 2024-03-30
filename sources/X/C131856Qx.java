package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.6Qx  reason: invalid class name and case insensitive filesystem */
public abstract class C131856Qx {
    public static final boolean A00(CallState callState) {
        AnonymousClass00C.A0D(callState, 0);
        if (callState == CallState.PRE_ACCEPT_RECEIVED || callState == CallState.CALLING || callState == CallState.RECEIVED_CALL || callState == CallState.REJOINING || callState == CallState.ACCEPT_SENT || callState == CallState.PRECALLING) {
            return true;
        }
        return false;
    }

    public static final boolean A01(CallState callState) {
        if (callState == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED || callState == CallState.ACCEPT_RECEIVED || callState == CallState.ACCEPT_SENT || callState == CallState.REJOINING) {
            return true;
        }
        return false;
    }
}
