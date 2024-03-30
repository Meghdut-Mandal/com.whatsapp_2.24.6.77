package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.spamreport.ReportSpamDialogFragment;

/* renamed from: X.4Dt  reason: invalid class name and case insensitive filesystem */
public final class C84574Dt extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84574Dt(ReportSpamDialogFragment reportSpamDialogFragment) {
        super(0);
        this.this$0 = reportSpamDialogFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return UserJid.Companion.A02(this.this$0.A0b().getString("senderJid"));
    }
}
