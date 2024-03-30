package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.1kg  reason: invalid class name and case insensitive filesystem */
public class C36641kg extends BroadcastReceiver {
    public AnonymousClass1YK A00;
    public final Object A01 = C36441kJ.A11();
    public volatile boolean A02 = false;

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    C18830tt.APZ(C56042vd.A00(context), this);
                    this.A02 = true;
                }
            }
        }
        Log.i("PaymentMethodUpdateNotification/dismiss");
        this.A00.A02();
    }
}
