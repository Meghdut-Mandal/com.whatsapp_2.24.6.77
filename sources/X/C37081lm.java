package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.deeplink.DeepLinkActivity;

/* renamed from: X.1lm  reason: invalid class name and case insensitive filesystem */
public final class C37081lm extends Handler {
    public final /* synthetic */ DeepLinkActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37081lm(Looper looper, DeepLinkActivity deepLinkActivity) {
        super(looper);
        this.A00 = deepLinkActivity;
        C18740tg.A06(looper);
    }

    public void handleMessage(Message message) {
        int i = message.arg1;
        if (i != 0) {
            this.A00.Bu2(0, i);
        }
    }
}
