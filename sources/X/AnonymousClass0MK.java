package X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.0MK  reason: invalid class name */
public class AnonymousClass0MK extends AnonymousClass0E7 {
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                throw AnonymousClass001.A0A("onResult");
            } catch (RuntimeException e) {
                throw e;
            }
        } else if (i != 2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Don't know how to handle message: ");
            A0u.append(i);
            Log.wtf("BasePendingResult", A0u.toString(), new Exception());
        } else {
            ((BasePendingResult) message.obj).A07(Status.A0B);
        }
    }

    public AnonymousClass0MK(Looper looper) {
        super(looper);
    }

    public AnonymousClass0MK() {
        super(Looper.getMainLooper());
    }
}
