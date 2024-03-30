package X;

import android.webkit.ValueCallback;
import com.whatsapp.extensions.webview.view.FlowsWebViewFragment;

/* renamed from: X.7Sz  reason: invalid class name and case insensitive filesystem */
public final class C154647Sz extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ FlowsWebViewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154647Sz(FlowsWebViewFragment flowsWebViewFragment) {
        super(1);
        this.this$0 = flowsWebViewFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C92624eH r2 = this.this$0.A00;
        if (r2 != null) {
            r2.evaluateJavascript("window.navigateBack()", (ValueCallback) null);
        }
        return AnonymousClass0AJ.A00;
    }
}
