package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.6yo  reason: invalid class name and case insensitive filesystem */
public class C148406yo implements C88074Rh {
    public final /* synthetic */ AnonymousClass6YM A00;

    public C148406yo(AnonymousClass6YM r1) {
        this.A00 = r1;
    }

    public void Bfm(boolean z) {
        C36321k7.A1X("voip/onScreenLockChanged:", AnonymousClass000.A0u(), z);
        AnonymousClass6YM r2 = this.A00;
        r2.A0K = z;
        if (C34681hT.A0T(Voip.getCallInfo())) {
            if (z && r2.A1O) {
                C108345Td.A00(C108345Td.SCREEN_LOCKED, r2.A1j);
                r2.A2C.BwF();
                Voip.stopVideoCaptureStream();
            }
            if (!r2.A0K && r2.A1I && r2.A0h != null) {
                Log.i("onScreenLockChanged screen is turned on, but ear-near is still true, release and reacquire the proximity wake lock.");
                AnonymousClass6YM.A06(r2);
                r2.A0c.sendEmptyMessageDelayed(14, 6000);
            }
        }
    }
}
