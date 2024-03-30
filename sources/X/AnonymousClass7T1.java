package X;

import android.webkit.ValueCallback;
import com.whatsapp.extensions.webview.view.FlowsWebViewFragment;

/* renamed from: X.7T1  reason: invalid class name */
public final class AnonymousClass7T1 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ FlowsWebViewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7T1(FlowsWebViewFragment flowsWebViewFragment) {
        super(1);
        this.this$0 = flowsWebViewFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6BS r5 = (AnonymousClass6BS) obj;
        C92624eH r3 = this.this$0.A00;
        if (r3 != null) {
            AnonymousClass00C.A0B(r5);
            String A0y = C36381kD.A0y(C90464aC.A0q(r5).put("input_type", r5.A02).put("input_name", r5.A01).put("value", r5.A00));
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("window.onNativeComponentValueChange(");
            r3.evaluateJavascript(C36321k7.A0E(A0y, A0u), (ValueCallback) null);
        }
        return AnonymousClass0AJ.A00;
    }
}
