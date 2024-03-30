package X;

import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.extensions.webview.viewmodel.WaFlowsViewModel;

/* renamed from: X.7Su  reason: invalid class name and case insensitive filesystem */
public final class C154597Su extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154597Su(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer) {
        super(1);
        this.this$0 = flowsWebBottomSheetContainer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        WaFlowsViewModel waFlowsViewModel = this.this$0.A0G;
        if (waFlowsViewModel == null) {
            throw C36331k8.A0d("waFlowsViewModel");
        }
        waFlowsViewModel.A04.A0D(obj);
        return AnonymousClass0AJ.A00;
    }
}
