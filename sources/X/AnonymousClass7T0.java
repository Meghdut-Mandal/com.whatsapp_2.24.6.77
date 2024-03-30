package X;

import android.webkit.ValueCallback;
import com.whatsapp.extensions.webview.view.FlowsWebViewFragment;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.7T0  reason: invalid class name */
public final class AnonymousClass7T0 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ FlowsWebViewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7T0(FlowsWebViewFragment flowsWebViewFragment) {
        super(1);
        this.this$0 = flowsWebViewFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C92624eH r4;
        JSONArray A0u;
        JSONObject put;
        JSONArray put2;
        String A0y;
        StringBuilder A0u2;
        String str;
        C110875bN r10 = (C110875bN) obj;
        if (r10 instanceof AnonymousClass57E) {
            r4 = this.this$0.A00;
            if (r4 != null) {
                C128586Cv r7 = ((AnonymousClass57E) r10).A00;
                A0y = C36381kD.A0y(C90524aI.A0u().put(C36441kJ.A1B().put("collection_id", r7.A01).put("media_id", r7.A03).put("media_type", "image").put("media_metadata", C36441kJ.A1B().put("media_name", r7.A02).put("file_size_bytes", r7.A00).put("preview_img_base64", r7.A04))));
                A0u2 = AnonymousClass000.A0u();
                str = "window.media_add(";
            }
            return AnonymousClass0AJ.A00;
        }
        if (r10 instanceof AnonymousClass57F) {
            r4 = this.this$0.A00;
            if (r4 != null) {
                AnonymousClass6AH r72 = ((AnonymousClass57F) r10).A00;
                A0u = C90524aI.A0u();
                put = C36441kJ.A1B().put("collection_id", r72.A00).put("media_id", r72.A01).put("failed_state", C36441kJ.A1B().put("err_code", 0).put("is_retryable", false));
            }
            return AnonymousClass0AJ.A00;
        }
        if (r10 instanceof AnonymousClass57G) {
            r4 = this.this$0.A00;
            if (r4 != null) {
                AnonymousClass6BR r8 = ((AnonymousClass57G) r10).A00;
                put2 = C90524aI.A0u().put(C36441kJ.A1B().put("collection_id", r8.A01).put("media_id", r8.A02).put("upload_state", C36441kJ.A1B().put("progress", r8.A00)));
                A0y = C36381kD.A0y(put2);
                A0u2 = AnonymousClass000.A0u();
                str = "window.media_state(";
            }
        } else if ((r10 instanceof AnonymousClass57H) && (r4 = this.this$0.A00) != null) {
            AnonymousClass6DZ r82 = ((AnonymousClass57H) r10).A00;
            A0u = C90524aI.A0u();
            put = C36441kJ.A1B().put("collection_id", r82.A01).put("media_id", r82.A05).put("success_state", C36441kJ.A1B().put("cdn_url", r82.A00).put("encryption_metadata", C36441kJ.A1B().put("enc_key", r82.A02).put("hmac", r82.A03).put("iv", r82.A04).put("plaintext_hash", r82.A06)));
        }
        return AnonymousClass0AJ.A00;
        put2 = A0u.put(put);
        A0y = C36381kD.A0y(put2);
        A0u2 = AnonymousClass000.A0u();
        str = "window.media_state(";
        A0u2.append(str);
        r4.evaluateJavascript(C36321k7.A0E(A0y, A0u2), (ValueCallback) null);
        return AnonymousClass0AJ.A00;
    }
}
