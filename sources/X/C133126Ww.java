package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.6Ww  reason: invalid class name and case insensitive filesystem */
public class C133126Ww {
    public static C133126Ww A04;
    public C121055sW A00;
    public C121055sW A01;
    public final Handler A02 = new Handler(Looper.getMainLooper(), new C163797qm(this, 1));
    public final Object A03 = C36441kJ.A11();

    public static C133126Ww A00() {
        C133126Ww r0 = A04;
        if (r0 != null) {
            return r0;
        }
        C133126Ww r02 = new C133126Ww();
        A04 = r02;
        return r02;
    }

    public static void A01(C121055sW r4, C133126Ww r5) {
        int i = r4.A01;
        if (i != -2) {
            int i2 = 2750;
            if (i > 0) {
                i2 = i;
            } else if (i == -1) {
                i2 = 1500;
            }
            Handler handler = r5.A02;
            handler.removeCallbacksAndMessages(r4);
            handler.sendMessageDelayed(Message.obtain(handler, 0, r4), (long) i2);
        }
    }

    public static void A02(C133126Ww r2) {
        C121055sW r0 = r2.A01;
        if (r0 != null) {
            r2.A00 = r0;
            r2.A01 = null;
            C16120ob r02 = (C16120ob) r0.A02.get();
            if (r02 != null) {
                AnonymousClass000.A14(AnonymousClass6YL.A0M, ((AnonymousClass0f5) r02).A00, 0);
            } else {
                r2.A00 = null;
            }
        }
    }

    public static boolean A03(C16120ob r2, C133126Ww r3) {
        C121055sW r0 = r3.A00;
        if (r0 == null || r2 == null || r0.A02.get() != r2) {
            return false;
        }
        return true;
    }

    public static boolean A04(C121055sW r2, C133126Ww r3, int i) {
        C16120ob r1 = (C16120ob) r2.A02.get();
        if (r1 == null) {
            return false;
        }
        r3.A02.removeCallbacksAndMessages(r2);
        Handler handler = AnonymousClass6YL.A0M;
        handler.sendMessage(handler.obtainMessage(1, i, 0, ((AnonymousClass0f5) r1).A00));
        return true;
    }

    public void A05(C16120ob r4) {
        synchronized (this.A03) {
            if (A03(r4, this)) {
                C121055sW r1 = this.A00;
                if (!r1.A00) {
                    r1.A00 = true;
                    this.A02.removeCallbacksAndMessages(r1);
                }
            }
        }
    }

    public void A06(C16120ob r4) {
        synchronized (this.A03) {
            if (A03(r4, this)) {
                C121055sW r1 = this.A00;
                if (r1.A00) {
                    r1.A00 = false;
                    A01(r1, this);
                }
            }
        }
    }
}
