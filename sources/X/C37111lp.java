package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.1lp  reason: invalid class name and case insensitive filesystem */
public final class C37111lp extends Handler {
    public final AnonymousClass13I A00;
    public final WeakReference A01;

    public void handleMessage(Message message) {
        Activity A0D = C36441kJ.A0D(this.A01);
        if (A0D == null) {
            removeMessages(1);
        } else if (message.what == 1) {
            Log.e("restore>VerifyMessageStoreHelper/timeout");
            removeMessages(1);
            if (this.A00.A00) {
                C65443Sb.A02(new DisplayExceptionDialogFactory$LoginFailedDialogFragment(), ((AnonymousClass01I) A0D).getSupportFragmentManager());
                return;
            }
            AnonymousClass3SJ.A01(A0D, 200);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37111lp(Looper looper, AnonymousClass13I r2, WeakReference weakReference) {
        super(looper);
        C18740tg.A06(looper);
        this.A00 = r2;
        this.A01 = weakReference;
    }
}
