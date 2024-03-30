package X;

import android.os.Looper;
import com.whatsapp.messaging.xmpp.XmppProcessingAndLogoutWorker;

/* renamed from: X.7MW  reason: invalid class name */
public final class AnonymousClass7MW extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ XmppProcessingAndLogoutWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7MW(XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker) {
        super(0);
        this.this$0 = xmppProcessingAndLogoutWorker;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker = this.this$0;
        Looper A00 = xmppProcessingAndLogoutWorker.A0A.A00();
        AnonymousClass00C.A08(A00);
        return new C91644cN(A00, xmppProcessingAndLogoutWorker);
    }
}
