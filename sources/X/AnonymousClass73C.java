package X;

import com.whatsapp.voipcalling.Voip;

/* renamed from: X.73C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73C implements Runnable {
    public final /* synthetic */ AnonymousClass6YM A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass73C(AnonymousClass6YM r1, String str, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = str;
    }

    public final void run() {
        AnonymousClass6YM r0 = this.A00;
        boolean z = this.A02;
        boolean z2 = this.A03;
        String str = this.A01;
        C19730wQ r02 = r0.A29;
        if (r02 != null) {
            r02.A0G();
            if (r02.A0E == null) {
                return;
            }
            if (z) {
                if (z2) {
                    Voip.endCallAndAcceptPendingCallWithVideoStopped(str);
                } else {
                    Voip.endCallAndAcceptPendingCall(str);
                }
            } else if (z2) {
                Voip.acceptCallWithVideoStopped();
            } else {
                Voip.acceptCall();
            }
        }
    }
}
