package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.ReplyWithMessageDialogFragment;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallAnswerCallView;

/* renamed from: X.7fX  reason: invalid class name */
public class AnonymousClass7fX implements AnonymousClass7gJ {
    public Object A00;
    public final int A01;

    public AnonymousClass7fX(VoipCallAnswerCallView voipCallAnswerCallView, int i) {
        this.A01 = i;
        this.A00 = voipCallAnswerCallView;
    }

    public final void BSk() {
        switch (this.A01) {
            case 0:
                C107275Ni r0 = (C107275Ni) this.A00;
                AnonymousClass7dF r1 = r0.A01;
                if (r1 != null) {
                    CallInfo callInfo = r0.A02;
                    C18740tg.A06(callInfo);
                    UserJid A0M = C90494aF.A0M(callInfo);
                    C18740tg.A06(callInfo);
                    String str = callInfo.callId;
                    VoipActivityV2 voipActivityV2 = ((C1493170r) r1).A00;
                    if (voipActivityV2.A1s) {
                        voipActivityV2.A3o(new ReplyWithMessageDialogFragment(A0M, str), "ReplyWithMessageDialogFragment");
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C107275Ni r2 = (C107275Ni) this.A00;
                int i = 1;
                if (r2.A04) {
                    i = 5;
                }
                AnonymousClass7dF r02 = r2.A01;
                if (r02 != null) {
                    VoipActivityV2.A19(((C1493170r) r02).A00, i);
                    return;
                }
                return;
            default:
                C107275Ni r22 = (C107275Ni) this.A00;
                int i2 = 2;
                if (r22.A04) {
                    i2 = 7;
                }
                AnonymousClass7dF r03 = r22.A01;
                if (r03 != null) {
                    ((C1493170r) r03).A00.BnL(i2);
                    return;
                }
                return;
        }
    }
}
