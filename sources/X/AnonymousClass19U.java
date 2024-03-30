package X;

import android.os.Handler;
import com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager;

/* renamed from: X.19U  reason: invalid class name */
public final class AnonymousClass19U extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ XmppConnectionMetricsWorkManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass19U(XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager) {
        super(0);
        this.this$0 = xmppConnectionMetricsWorkManager;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return new Handler(((AnonymousClass19W) this.this$0.A03.get()).A00(), new C133776Zy(this.this$0));
    }
}
