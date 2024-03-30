package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.1lr  reason: invalid class name and case insensitive filesystem */
public final class C37131lr extends Handler {
    public final C88904Um A00;
    public final WeakReference A01;

    public void handleMessage(Message message) {
        Object obj = this.A01.get();
        if (obj == null) {
            C36321k7.A1L(message, "MatchPhoneNumberFragment was garbage collected with active messages still enqueued: ", AnonymousClass000.A0u());
        }
        int i = message.what;
        if (i == 1) {
            Log.i("MatchPhoneNumberFragment/check-number/match");
            removeMessages(4);
            if (obj != null) {
                C88904Um r0 = this.A00;
                r0.B5d();
                r0.BaU();
            }
        } else if (i != 2) {
            if (i == 3) {
                Log.e("MatchPhoneNumberFragment/error");
            } else if (i == 4) {
                Log.w("MatchPhoneNumberFragment/timeout");
                removeMessages(4);
            } else {
                return;
            }
            if (obj != null) {
                C88904Um r02 = this.A00;
                r02.B5d();
                r02.BUN();
            }
        } else {
            Log.w("MatchPhoneNumberFragment/check-number/mismatch");
            removeMessages(4);
            if (obj != null) {
                C88904Um r03 = this.A00;
                r03.B5d();
                r03.BbB();
            }
        }
    }

    public C37131lr(AnonymousClass155 r2, C88904Um r3) {
        super(Looper.getMainLooper());
        this.A01 = AnonymousClass001.A0F(r2);
        this.A00 = r3;
    }
}
