package X;

import android.os.Handler;
import com.whatsapp.messaging.xmpp.XmppProcessingAndLogoutWorker;
import com.whatsapp.util.Log;

/* renamed from: X.7MY  reason: invalid class name */
public final class AnonymousClass7MY extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ XmppProcessingAndLogoutWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7MY(XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker) {
        super(0);
        this.this$0 = xmppProcessingAndLogoutWorker;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker = this.this$0;
        AnonymousClass00T r2 = xmppProcessingAndLogoutWorker.A0D;
        if (C90524aI.A0C(r2).hasMessages(2)) {
            Log.i("XmppProcessingAndLogoutWorker/restart processing");
            Handler A0C = C90524aI.A0C(r2);
            Log.i("XmppProcessingAndLogoutWorker/cancel logout");
            A0C.removeMessages(2);
            XmppProcessingAndLogoutWorker.A00(xmppProcessingAndLogoutWorker);
        }
        return AnonymousClass0AJ.A00;
    }
}
