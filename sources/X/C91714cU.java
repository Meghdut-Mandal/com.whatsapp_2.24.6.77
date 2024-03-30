package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: X.4cU  reason: invalid class name and case insensitive filesystem */
public final class C91714cU extends Handler {
    public boolean A00;
    public final AnonymousClass6ZF A01 = new AnonymousClass6ZF();
    public final /* synthetic */ C90754ai A02;

    public static final synchronized void A00(C91714cU r4, String str) {
        synchronized (r4) {
            if (r4.A00) {
                if (Log.isLoggable("WearableLS", 2)) {
                    String valueOf = String.valueOf(r4.A02.A00);
                    StringBuilder A0h = C90524aI.A0h(str.length() + 17 + C90474aD.A05(valueOf));
                    A0h.append("unbindService: ");
                    A0h.append(str);
                    Log.v("WearableLS", AnonymousClass000.A0p(", ", valueOf, A0h));
                }
                try {
                    r4.A02.unbindService(r4.A01);
                } catch (RuntimeException e) {
                    Log.e("WearableLS", "Exception when unbinding from local service", e);
                }
                r4.A00 = false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91714cU(Looper looper, C90754ai r3) {
        super(looper);
        this.A02 = r3;
    }

    public final void dispatchMessage(Message message) {
        synchronized (this) {
            if (!this.A00) {
                if (Log.isLoggable("WearableLS", 2)) {
                    String valueOf = String.valueOf(this.A02.A00);
                    Log.v("WearableLS", AnonymousClass000.A0p("bindService: ", valueOf, C90524aI.A0h(C90474aD.A05(valueOf) + 13)));
                }
                C90754ai r3 = this.A02;
                r3.bindService(r3.A01, this.A01, 1);
                this.A00 = true;
            }
        }
        try {
            super.dispatchMessage(message);
        } finally {
            if (!hasMessages(0)) {
                A00(this, "dispatch");
            }
        }
    }
}
