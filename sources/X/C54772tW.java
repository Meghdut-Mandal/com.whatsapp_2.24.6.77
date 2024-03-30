package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.2tW  reason: invalid class name and case insensitive filesystem */
public abstract class C54772tW {
    public static final Message A00(C203399nx r3, Boolean bool, String str, int i, boolean z, boolean z2) {
        int i2;
        if (str != null) {
            i2 = 233;
            if (z) {
                i2 = 356;
            }
        } else {
            i2 = 6;
            if (z) {
                i2 = 343;
            }
        }
        Message obtain = Message.obtain((Handler) null, 0, i2, i, r3);
        if (str != null) {
            obtain.getData().putString("messageClient:iqId", str);
        }
        obtain.getData().putBoolean("messageClient:dropIfOffline", z2);
        if (bool != null) {
            obtain.getData().putBoolean("messageClient:checkCallback", bool.booleanValue());
        }
        return obtain;
    }
}
