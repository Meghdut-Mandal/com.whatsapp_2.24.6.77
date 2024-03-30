package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.1aN  reason: invalid class name and case insensitive filesystem */
public class C30541aN implements C30531aM {
    public final AnonymousClass17Z A00;
    public final C20810yC A01;
    public final AnonymousClass005 A02;

    public CallInfo B9F() {
        C20810yC r3 = this.A01;
        AnonymousClass005 r2 = this.A02;
        AnonymousClass00C.A0D(r3, 0);
        AnonymousClass00C.A0D(r2, 1);
        if (C20800yB.A01(C21000yV.A02, r3, 8032)) {
            return (CallInfo) ((AnonymousClass05K) ((C122415uo) r2.get()).A03.getValue()).getValue();
        }
        return Voip.getCallInfo();
    }

    public C30541aN(AnonymousClass17Z r1, C20810yC r2, AnonymousClass005 r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public int BwF() {
        CallState currentCallState = Voip.getCurrentCallState();
        if (currentCallState != null && currentCallState != CallState.NONE) {
            return Voip.turnScreenShareOff();
        }
        Log.w("turnScreenSharingOff ignored as no call active");
        return 670007;
    }
}
