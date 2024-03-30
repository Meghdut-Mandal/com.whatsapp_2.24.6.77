package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager;

/* renamed from: X.6Zy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C133776Zy implements Handler.Callback {
    public final /* synthetic */ XmppConnectionMetricsWorkManager A00;

    public /* synthetic */ C133776Zy(XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager) {
        this.A00 = xmppConnectionMetricsWorkManager;
    }

    public final boolean handleMessage(Message message) {
        XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager = this.A00;
        if (message.what != C36331k8.A1a(xmppConnectionMetricsWorkManager, message)) {
            return false;
        }
        ((AnonymousClass64I) xmppConnectionMetricsWorkManager.A04.get()).A00();
        return true;
    }
}
