package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Mf  reason: invalid class name and case insensitive filesystem */
public final class C26971Mf implements Handler.Callback {
    public final /* synthetic */ C20720y3 A00;

    public C26971Mf(C20720y3 r1) {
        this.A00 = r1;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Log.i("MessageHandler/reconnect");
            this.A00.A0B(message.arg1);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            C20720y3 r1 = this.A00;
            AtomicBoolean atomicBoolean = C20720y3.A14;
            r1.A0Z.BoM();
            return true;
        }
    }
}
