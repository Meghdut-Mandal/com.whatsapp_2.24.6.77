package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.1lq  reason: invalid class name and case insensitive filesystem */
public final class C37121lq extends Handler {
    public final AnonymousClass12U A00;
    public final WeakReference A01;

    public void handleMessage(Message message) {
        Activity A0D = C36441kJ.A0D(this.A01);
        if (A0D == null) {
            Log.w("DeleteAccountConfirmation/delete account confirmation was garbage collected with messages still enqueued");
        } else if (message.what == 0) {
            Log.i("DeleteAccountConfirmation/timeout/expired");
            AnonymousClass3SJ.A00(A0D, 1);
            if (this.A00.A00() != 0) {
                Log.w("DeleteAccountConfirmation/dialog-delete-failed");
                AnonymousClass3SJ.A01(A0D, 3);
            }
        }
    }

    public C37121lq(DeleteAccountConfirmation deleteAccountConfirmation, AnonymousClass12U r3) {
        super(Looper.getMainLooper());
        this.A00 = r3;
        this.A01 = AnonymousClass001.A0F(deleteAccountConfirmation);
    }
}
