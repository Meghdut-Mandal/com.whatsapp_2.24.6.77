package X;

import android.telecom.CallAudioState;
import android.text.TextUtils;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.53N  reason: invalid class name */
public class AnonymousClass53N extends AnonymousClass1Pk {
    public final /* synthetic */ AnonymousClass13J A00;
    public final /* synthetic */ C148816zT A01;

    public AnonymousClass53N(C148816zT r1, AnonymousClass13J r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void A00(CallAudioState callAudioState, String str) {
        C18740tg.A01();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("voip/audio_route/selfManagedConnectionListener/onCallAudioStateChanged ");
        C90474aD.A1L(A0u, str);
        C148816zT r3 = this.A01;
        A0u.append(Voip.A05(r3.A00));
        C36321k7.A1K(callAudioState, " -> ", A0u);
        CallInfo callInfo = Voip.getCallInfo();
        if (C34681hT.A0T(callInfo) && TextUtils.equals(str, callInfo.callId)) {
            C18740tg.A06(callInfo);
            C148816zT.A01(new C1501874h(this, callInfo, 36), r3);
        }
    }
}
