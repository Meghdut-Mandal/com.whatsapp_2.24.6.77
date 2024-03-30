package X;

import com.whatsapp.calling.views.VoipReturnToCallBanner;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.7qZ  reason: invalid class name and case insensitive filesystem */
public class C163667qZ implements AnonymousClass1NK {
    public Object A00;
    public final int A01;

    public C163667qZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BSa(C107265Nh r5) {
        switch (this.A01) {
            case 0:
                int i = r5.A08;
                C93124fp r1 = (C93124fp) this.A00;
                if (i != 2) {
                    r1.A0H = false;
                }
                r1.setVisibility(8);
                return;
            case 3:
                Log.i("voip/VoipActivityV2/onCallEnded");
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
                if (!voipActivityV2.A0Q.A00) {
                    Log.i("voip/VoipActivityV2/finishActivity Finishing");
                    voipActivityV2.finish();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BSi(C107265Nh r3, boolean z) {
        if (3 - this.A01 == 0) {
            Log.i("voip/VoipActivityV2/onCallMissed");
            VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
            if (!voipActivityV2.A0Q.A00) {
                Log.i("voip/VoipActivityV2/finishActivity Finishing");
                voipActivityV2.finish();
            }
        }
    }

    public void BSj(long j, boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.A01 != 0) {
            return;
        }
        if (z3) {
            C90514aH.A1N(this.A00);
            return;
        }
        C93124fp r2 = (C93124fp) this.A00;
        r2.A0H = true;
        r2.setVisibility(0);
        r2.setCallNotificationTimer(j);
        VoipReturnToCallBanner voipReturnToCallBanner = (VoipReturnToCallBanner) r2;
        if (voipReturnToCallBanner.A04.getVisibility() == 0 && z != voipReturnToCallBanner.A0K) {
            r2.A0K = z;
            r2.A01();
        } else if (r2.A0J != z2) {
            r2.A0J = z2;
        } else if (r2.A0I != z4) {
            r2.A0I = z4;
            r2.A03();
            return;
        } else {
            return;
        }
        r2.A02();
    }

    public void BSl(C107265Nh r6) {
        switch (this.A01) {
            case 0:
                AnonymousClass6BK A002 = AnonymousClass1Q8.A00(r6);
                C93124fp r4 = (C93124fp) this.A00;
                boolean z = A002.A02;
                boolean z2 = A002.A01;
                boolean z3 = A002.A00;
                if (z) {
                    r4.setVisibility(8);
                    return;
                }
                r4.A0J = z2;
                r4.A0I = z3;
                r4.A03();
                r4.setVisibility(8);
                r4.postDelayed(r4.A0O, 2000);
                return;
            case 2:
                AnonymousClass6YP r1 = (AnonymousClass6YP) this.A00;
                AnonymousClass6YP.A0D(r1, r1.A0V());
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bgj() {
        switch (this.A01) {
            case 1:
                Log.i("CameraUi/onShowingIncomingCallUI");
                AnonymousClass6YT r1 = (AnonymousClass6YT) this.A00;
                if (r1.A0S()) {
                    r1.A0T = false;
                    AnonymousClass6YT.A0K(r1, r1.A0I.A02());
                    return;
                }
                return;
            case 2:
                ((AnonymousClass6YP) this.A00).A0K();
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BSm(AnonymousClass11F r1, CallState callState, String str) {
    }
}
