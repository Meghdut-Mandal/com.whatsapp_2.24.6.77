package X;

import android.os.Handler;
import com.whatsapp.R;
import java.util.AbstractMap;

/* renamed from: X.64X  reason: invalid class name */
public class AnonymousClass64X {
    public boolean A00;
    public boolean A01;
    public final long A02;
    public final Handler A03 = C36341k9.A0H();
    public final C122085uH A04;
    public final Runnable A05;
    public final boolean A06;

    public void A00() {
        this.A00 = true;
        this.A03.removeCallbacks(this.A05);
        C122085uH r1 = this.A04;
        C1271967i r2 = (C1271967i) r1.A03.get();
        if (r2 != null) {
            ((AbstractMap) r2.A01(R.id.bk_context_key_timers)).remove(r1.A02);
        }
    }

    public AnonymousClass64X(C122085uH r3, long j, boolean z) {
        this.A02 = j;
        this.A06 = z;
        this.A00 = false;
        this.A01 = true;
        this.A04 = r3;
        this.A05 = new C1497572q(this, 39);
    }
}
