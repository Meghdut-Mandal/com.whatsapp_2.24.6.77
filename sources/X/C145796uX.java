package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.6uX  reason: invalid class name and case insensitive filesystem */
public final class C145796uX implements C159477jQ {
    public final /* synthetic */ C144206ro A00;

    public C145796uX(C144206ro r1) {
        this.A00 = r1;
    }

    public boolean BCK() {
        return C36371kC.A1U(C27631Pa.A00(this.A00.A05), "smart_glasses_user_initiated");
    }

    public void BYf() {
        CallInfo callInfo;
        AnonymousClass6EE r1;
        AnonymousClass6YM r0;
        Log.i("VoipGlassesManager.kt onGlassesError");
        C144206ro r3 = this.A00;
        C203169nR r02 = C108915Vl.A00;
        boolean z = true;
        if (r02 != null && r02.A0B() && (callInfo = Voip.getCallInfo()) != null && (r1 = callInfo.self) != null) {
            if (r3.A00 == null) {
                z = false;
            }
            C18740tg.A0D(z, "VoiceService is null");
            if (!AnonymousClass000.A1S(r1.A06, 6) && (r0 = r3.A00) != null) {
                r0.A1E.execute(AnonymousClass74T.A00);
            }
        }
    }
}
