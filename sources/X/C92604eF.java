package X;

import android.os.Handler;
import android.os.Message;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

/* renamed from: X.4eF  reason: invalid class name and case insensitive filesystem */
public final class C92604eF extends WebMessagePort.WebMessageCallback {
    public final /* synthetic */ C133796a0 A00;

    public C92604eF(C133796a0 r1) {
        this.A00 = r1;
    }

    public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        Handler handler = this.A00.A03;
        handler.dispatchMessage(Message.obtain(handler, 0, webMessage));
    }
}
