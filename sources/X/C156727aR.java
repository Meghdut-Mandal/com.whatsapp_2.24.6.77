package X;

import android.os.Handler;
import android.view.Choreographer;
import java.util.List;

/* renamed from: X.7aR  reason: invalid class name and case insensitive filesystem */
public final class C156727aR extends C005502l {
    public static final ThreadLocal A0A = new AnonymousClass78e();
    public static final AnonymousClass00T A0B = C36431kI.A1I(AnonymousClass7PY.A00);
    public List A00 = AnonymousClass001.A0I();
    public List A01 = AnonymousClass001.A0I();
    public boolean A02;
    public boolean A03;
    public final Handler A04;
    public final Choreographer A05;
    public final C162267oJ A06;
    public final AnonymousClass75E A07 = new AnonymousClass75E(this);
    public final Object A08 = C36441kJ.A11();
    public final C005002g A09 = new C005002g();

    public static final void A00(C156727aR r3) {
        C005002g r1;
        Object obj;
        Runnable runnable;
        boolean z;
        while (true) {
            Object obj2 = r3.A08;
            synchronized (obj2) {
                r1 = r3.A09;
                if (r1.isEmpty()) {
                    obj = null;
                } else {
                    obj = r1.A0N();
                }
                runnable = (Runnable) obj;
            }
            if (runnable != null) {
                runnable.run();
            } else {
                synchronized (obj2) {
                    z = false;
                    if (r1.isEmpty()) {
                        r3.A03 = false;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            }
        }
    }

    public void A03(Runnable runnable, C005102h r6) {
        synchronized (this.A08) {
            this.A09.A0O(runnable);
            if (!this.A03) {
                this.A03 = true;
                Handler handler = this.A04;
                AnonymousClass75E r1 = this.A07;
                handler.post(r1);
                if (!this.A02) {
                    this.A02 = true;
                    this.A05.postFrameCallback(r1);
                }
            }
        }
    }

    public C156727aR(Handler handler, Choreographer choreographer) {
        this.A05 = choreographer;
        this.A04 = handler;
        this.A06 = new C136936fJ(choreographer, this);
    }
}
