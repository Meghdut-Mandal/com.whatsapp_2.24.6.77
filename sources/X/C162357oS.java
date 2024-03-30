package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.7oS  reason: invalid class name and case insensitive filesystem */
public class C162357oS extends BroadcastReceiver {
    public Object A00;
    public final int A01;

    public C162357oS(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onReceive(Context context, Intent intent) {
        CallInfo callInfo;
        switch (this.A01) {
            case 0:
                if (intent == null || !intent.getBooleanExtra("noConnectivity", false)) {
                    ((View) this.A00).invalidate();
                    return;
                }
                return;
            case 1:
                ((AnonymousClass6ER) this.A00).A02();
                return;
            case 2:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((AnonymousClass6YM) this.A00).A2P.A06();
                    Log.i("Screen is being turned off");
                    return;
                }
                return;
            case 3:
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && (callInfo = Voip.getCallInfo()) != null && callInfo.callState == CallState.RECEIVED_CALL) {
                    AnonymousClass6YM r2 = (AnonymousClass6YM) this.A00;
                    C160737lV r0 = r2.A0t;
                    if (r0 == null || !((VoipActivityV2) r0).A1u) {
                        Log.i("voip/unlockReceiver generate headsup notification when user unlock the screen in RECEIVED_CALL state");
                        AnonymousClass6YM.A08(r2, callInfo, 1, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (intent.getAction() != null && intent.getAction().matches("android.location.PROVIDERS_CHANGED")) {
                    C142466ov r4 = (C142466ov) this.A00;
                    boolean A07 = r4.A0w.A07();
                    if (r4.A0S != A07) {
                        r4.A0S = A07;
                        C63593Kq r02 = r4.A0P;
                        if (r02 != null) {
                            if (A07) {
                                r4.A0R = true;
                            } else {
                                r02.A05 = 0;
                                C142466ov.A06(r4);
                            }
                        }
                        r4.A04 = 0;
                        C142466ov.A07(r4);
                        return;
                    }
                    return;
                }
                return;
            default:
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    C146846wG.A00((C146846wG) this.A00, false);
                    return;
                } else {
                    C36321k7.A1L(intent, "unknown intent received in connectivity receiver ", AnonymousClass000.A0u());
                    return;
                }
        }
    }
}
