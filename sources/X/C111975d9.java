package X;

import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.5d9  reason: invalid class name and case insensitive filesystem */
public class C111975d9 implements AnonymousClass4SU {
    public Object A00;
    public final int A01;

    public C111975d9(VoipActivityV2 voipActivityV2, int i) {
        this.A01 = i;
        this.A00 = voipActivityV2;
    }

    public final void BxA() {
        if (this.A01 != 0) {
            VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
            CallInfo A012 = VoipActivityV2.A01(voipActivityV2);
            if (A012 != null && !A012.isGroupCall && A012.self.A06 == 0 && VoipActivityV2.A1N(C90494aF.A0M(A012), voipActivityV2, 1, true)) {
                AnonymousClass6YM r0 = voipActivityV2.A0r;
                C18740tg.A06(r0);
                r0.A0P();
                return;
            }
            return;
        }
        C144196rn.A00((C144196rn) ((VoipActivityV2) this.A00).A1c.get());
    }
}
