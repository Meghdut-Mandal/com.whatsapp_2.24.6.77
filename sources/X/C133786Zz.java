package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.webkit.WebMessagePort;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;

/* renamed from: X.6Zz  reason: invalid class name and case insensitive filesystem */
public final class C133786Zz implements Handler.Callback {
    public C92624eH A00;
    public WebMessagePort A01;
    public final Handler A02;
    public final FlowsWebBottomSheetContainer A03;

    public boolean handleMessage(Message message) {
        AnonymousClass00C.A0D(message, 0);
        if (message.what != 0) {
            return true;
        }
        C110865bM.A00(new C153317Nw(message, this));
        return true;
    }

    public C133786Zz(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer) {
        Handler handler;
        this.A03 = flowsWebBottomSheetContainer;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            handler = new Handler(myLooper, this);
        } else {
            handler = null;
        }
        this.A02 = handler;
    }
}
