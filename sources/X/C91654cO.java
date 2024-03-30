package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.4cO  reason: invalid class name and case insensitive filesystem */
public class C91654cO extends Handler {
    public final boolean A00;
    public final /* synthetic */ AnonymousClass6YM A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91654cO(Looper looper, AnonymousClass6YM r3) {
        super(looper);
        this.A01 = r3;
        this.A00 = C36361kB.A1a(looper, Looper.getMainLooper());
    }

    public void handleMessage(Message message) {
        long uptimeMillis = SystemClock.uptimeMillis();
        CallInfo callInfo = Voip.getCallInfo();
        boolean z = this.A00;
        AnonymousClass6YM r0 = this.A01;
        if (z) {
            AnonymousClass6YM.A09(r0, callInfo, uptimeMillis);
            r0.A0d.sendEmptyMessageDelayed(0, 1000);
            return;
        }
        r0.A28.A0H(new AnonymousClass735(this, callInfo, 1, uptimeMillis));
    }
}
