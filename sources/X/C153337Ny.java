package X;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import org.json.JSONObject;

/* renamed from: X.7Ny  reason: invalid class name and case insensitive filesystem */
public final class C153337Ny extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ JSONObject $response;
    public final /* synthetic */ AnonymousClass6EV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153337Ny(AnonymousClass6EV r2, JSONObject jSONObject) {
        super(0);
        this.this$0 = r2;
        this.$response = jSONObject;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        WebMessagePort A00 = this.this$0.A00();
        if (A00 != null) {
            A00.postMessage(new WebMessage(this.$response.toString()));
        }
        return AnonymousClass0AJ.A00;
    }
}
