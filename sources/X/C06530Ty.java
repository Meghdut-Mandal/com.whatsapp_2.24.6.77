package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: X.0Ty  reason: invalid class name and case insensitive filesystem */
public final class C06530Ty {
    public boolean A00;
    public boolean A01;
    public final IntentFilter A02;
    public final BroadcastReceiver A03;

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.A03);
        sb.append(" filter=");
        sb.append(this.A02);
        if (this.A01) {
            sb.append(" DEAD");
        }
        return AnonymousClass000.A0q("}", sb);
    }

    public C06530Ty(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.A02 = intentFilter;
        this.A03 = broadcastReceiver;
    }
}
