package X;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.0E4  reason: invalid class name */
public final class AnonymousClass0E4 extends Handler {
    public WeakReference A00;

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.A00.get(), i);
        } else if (i == 1) {
            ((DialogInterface) message.obj).dismiss();
        }
    }

    public AnonymousClass0E4(DialogInterface dialogInterface) {
        this.A00 = AnonymousClass001.A0F(dialogInterface);
    }
}
