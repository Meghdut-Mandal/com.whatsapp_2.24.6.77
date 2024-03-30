package X;

import android.os.Bundle;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;

/* renamed from: X.7Sx  reason: invalid class name and case insensitive filesystem */
public final class C154627Sx extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154627Sx(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer) {
        super(1);
        this.this$0 = flowsWebBottomSheetContainer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String string;
        Bundle bundle = this.this$0.A0A;
        if (!(bundle == null || (string = bundle.getString("observer_id")) == null)) {
            FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = this.this$0;
            C131376Ou r0 = flowsWebBottomSheetContainer.A0J;
            if (r0 != null) {
                r0.A02(string).A02(new C149006zm());
                flowsWebBottomSheetContainer.A0i().finish();
            } else {
                throw C36331k8.A0d("uiObserversFactory");
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
