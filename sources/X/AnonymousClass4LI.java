package X;

import com.whatsapp.spamreport.ReportSpamDialogFragment;

/* renamed from: X.4LI  reason: invalid class name */
public final class AnonymousClass4LI extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LI(ReportSpamDialogFragment reportSpamDialogFragment) {
        super(1);
        this.this$0 = reportSpamDialogFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        ReportSpamDialogFragment reportSpamDialogFragment = this.this$0;
        C33751fs r1 = reportSpamDialogFragment.A06;
        if (r1 != null) {
            r1.A01(reportSpamDialogFragment.A0i(), str);
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("contextualHelpHandler");
    }
}
