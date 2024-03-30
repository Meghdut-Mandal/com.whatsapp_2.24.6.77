package X;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import org.json.JSONObject;

/* renamed from: X.7O4  reason: invalid class name */
public final class AnonymousClass7O4 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ JSONObject $response;
    public final /* synthetic */ C133796a0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7O4(C133796a0 r2, JSONObject jSONObject) {
        super(0);
        this.this$0 = r2;
        this.$response = jSONObject;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        WebMessagePort A00 = this.this$0.A01;
        if (A00 == null) {
            throw C36331k8.A0d("sendPort");
        }
        A00.postMessage(new WebMessage(this.$response.toString()));
        return AnonymousClass0AJ.A00;
    }
}
