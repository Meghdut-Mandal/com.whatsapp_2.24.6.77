package X;

import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.2jV  reason: invalid class name and case insensitive filesystem */
public class C49672jV extends C132446Tt {
    public Handler A00;
    public Runnable A01;
    public final long A02 = SystemClock.uptimeMillis();
    public final AnonymousClass171 A03;
    public final AnonymousClass144 A04;
    public final WeakReference A05;
    public final boolean A06;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return AnonymousClass171.A04(this.A03, this.A04, 1, true);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Handler A0H = C36341k9.A0H();
        this.A00 = A0H;
        AnonymousClass751 r4 = new AnonymousClass751(41, (String) obj, this);
        this.A01 = r4;
        if (this.A06) {
            A0H.postAtTime(r4, this.A02 + 3000);
        } else {
            r4.run();
        }
    }

    public C49672jV(AnonymousClass171 r3, C62553Gp r4, AnonymousClass144 r5, boolean z) {
        this.A03 = r3;
        this.A05 = AnonymousClass001.A0F(r4);
        this.A04 = r5;
        this.A06 = z;
    }
}
