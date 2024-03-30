package X;

import com.whatsapp.spamreport.ReportSpamDialogFragment;

/* renamed from: X.4Dp  reason: invalid class name and case insensitive filesystem */
public final class C84534Dp extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84534Dp(ReportSpamDialogFragment reportSpamDialogFragment) {
        super(0);
        this.this$0 = reportSpamDialogFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string = this.this$0.A0b().getString("flow");
        if (string != null) {
            return string;
        }
        throw C36381kD.A0k();
    }
}
