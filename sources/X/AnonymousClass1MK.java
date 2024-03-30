package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.1MK  reason: invalid class name */
public class AnonymousClass1MK {
    public boolean A00() {
        try {
            CallState currentCallState = Voip.getCurrentCallState();
            return (currentCallState == null || currentCallState == CallState.NONE || currentCallState == CallState.LINK || currentCallState == CallState.PRECALLING) ? false : true;
        } catch (UnsatisfiedLinkError e) {
            Log.e("unable to query for current call state", e);
            return false;
        }
    }

    public boolean A01() {
        try {
            return Voip.getCurrentCallState() == CallState.LINK;
        } catch (UnsatisfiedLinkError e) {
            Log.e("unable to query for current call state", e);
            return false;
        }
    }

    public boolean A02() {
        try {
            return Voip.getCurrentCallState() == CallState.NONE;
        } catch (UnsatisfiedLinkError e) {
            Log.e("unable to query for current call state", e);
            return true;
        }
    }

    public boolean A03() {
        CallInfo callInfo;
        if (!A00() || (callInfo = Voip.getCallInfo()) == null || !callInfo.videoEnabled) {
            return false;
        }
        return true;
    }
}
