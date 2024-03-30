package X;

import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;

/* renamed from: X.7Sy  reason: invalid class name and case insensitive filesystem */
public final class C154637Sy extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154637Sy(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer) {
        super(1);
        this.this$0 = flowsWebBottomSheetContainer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number = (Number) obj;
        if (number != null) {
            int intValue = number.intValue();
            if (intValue == 2) {
                this.this$0.A1b();
            } else if (intValue == 0) {
                FlowsWebBottomSheetContainer.A05(this.this$0, (String) null, "extensions-integrity-check-failed");
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
