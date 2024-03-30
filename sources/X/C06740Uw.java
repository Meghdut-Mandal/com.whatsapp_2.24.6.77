package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: X.0Uw  reason: invalid class name and case insensitive filesystem */
public abstract class C06740Uw {
    public BroadcastReceiver A00;
    public final /* synthetic */ AnonymousClass02U A01;

    public abstract int A00();

    public abstract IntentFilter A01();

    public abstract void A04();

    public C06740Uw(AnonymousClass02U r1) {
        this.A01 = r1;
    }

    public void A03() {
        BroadcastReceiver broadcastReceiver = this.A00;
        if (broadcastReceiver != null) {
            try {
                this.A01.A0i.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.A00 = null;
        }
    }

    public void A02() {
        A03();
        IntentFilter A012 = A01();
        if (A012.countActions() != 0) {
            BroadcastReceiver broadcastReceiver = this.A00;
            if (broadcastReceiver == null) {
                broadcastReceiver = new C03070Db(this);
                this.A00 = broadcastReceiver;
            }
            this.A01.A0i.registerReceiver(broadcastReceiver, A012);
        }
    }
}
