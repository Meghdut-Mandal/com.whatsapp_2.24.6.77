package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.1kf  reason: invalid class name and case insensitive filesystem */
public class C36631kf extends BroadcastReceiver {
    public C25251Fo A00;
    public final Object A01 = C36441kJ.A11();
    public volatile boolean A02 = false;

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    C18830tt.APY(C56042vd.A00(context), this);
                    this.A02 = true;
                }
            }
        }
        Log.i("MessagelessPaymentNotification/dismiss");
        this.A00.A01();
    }
}
