package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.1jU  reason: invalid class name and case insensitive filesystem */
public class C35931jU extends Handler {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35931jU(Looper looper, Object obj, int i) {
        super(looper);
        this.A01 = i;
        this.A00 = obj;
    }

    public void dispatchMessage(Message message) {
        StringBuilder sb;
        long j;
        String str;
        switch (this.A01) {
            case 0:
                long uptimeMillis = SystemClock.uptimeMillis();
                super.dispatchMessage(message);
                j = SystemClock.uptimeMillis() - uptimeMillis;
                if (j > 1000) {
                    sb = new StringBuilder();
                    str = "AsyncCommitManager/dispatching id: ";
                    break;
                } else {
                    return;
                }
            case 1:
                long uptimeMillis2 = SystemClock.uptimeMillis();
                super.dispatchMessage(message);
                j = SystemClock.uptimeMillis() - uptimeMillis2;
                if (j > 1000) {
                    sb = new StringBuilder();
                    str = "AsyncCommitManager/receipt/dispatching id: ";
                    break;
                } else {
                    return;
                }
            default:
                super.dispatchMessage(message);
                return;
        }
        sb.append(str);
        sb.append(message.arg1);
        sb.append(" msg:");
        sb.append(message.getCallback());
        sb.append(" took:");
        sb.append(j);
        Log.i(sb.toString());
    }

    public void handleMessage(Message message) {
        if (2 - this.A01 != 0) {
            super.handleMessage(message);
            return;
        }
        super.handleMessage(message);
        if (message.what == 0) {
            AnonymousClass1BS.A05((AnonymousClass1BS) this.A00);
        }
    }
}
