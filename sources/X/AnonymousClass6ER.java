package X;

import android.content.IntentFilter;
import android.media.AudioManager;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.6ER  reason: invalid class name */
public abstract class AnonymousClass6ER {
    public C116865lK A00;
    public boolean A01;

    public void A00() {
        AnonymousClass524 r0 = (AnonymousClass524) this;
        C26981Mg.A01(r0.A00, r0.A01, new IntentFilter("android.intent.action.HEADSET_PLUG"), true);
    }

    public void A01() {
        AnonymousClass524 r0 = (AnonymousClass524) this;
        r0.A01.unregisterReceiver(r0.A00);
    }

    public boolean A03() {
        AudioManager A0D = ((AnonymousClass524) this).A02.A0D();
        if (A0D == null) {
            return false;
        }
        return A0D.isWiredHeadsetOn();
    }

    public final void A02() {
        boolean A03 = A03();
        if (this.A01 != A03) {
            this.A01 = A03;
            C148816zT r3 = this.A00.A00;
            C36321k7.A1K(r3, "voip/audio_route/HeadsetMonitor ", AnonymousClass000.A0u());
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo == null || callInfo.callState == CallState.NONE) {
                Log.e("voip/audio_route/headsetPlugReceiver ignored, not in any call");
                return;
            }
            r3.A0A(callInfo, (Boolean) null);
            if (A03) {
                r3.A04 = true;
                Log.i("voip/audio_route/headset Plugged");
                if (r3.A00 == 1) {
                    r3.A07(callInfo);
                    r3.A0D(callInfo, false);
                    return;
                }
                return;
            }
            Log.i("voip/audio_route/headset Unplugged");
            r3.A09(callInfo, (Boolean) null);
        }
    }
}
