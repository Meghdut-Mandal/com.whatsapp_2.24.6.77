package X;

import android.os.Message;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import org.json.JSONException;

/* renamed from: X.7Nw  reason: invalid class name and case insensitive filesystem */
public final class C153317Nw extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ Message $msg;
    public final /* synthetic */ C133786Zz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153317Nw(Message message, C133786Zz r3) {
        super(0);
        this.$msg = message;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        Object obj = this.$msg.obj;
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type android.webkit.WebMessage");
        String data = ((WebMessage) obj).getData();
        if (data.length() <= 1024) {
            try {
                C133786Zz r0 = this.this$0;
                FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = r0.A03;
                if (flowsWebBottomSheetContainer != null) {
                    WebMessagePort A00 = r0.A01;
                    if (A00 == null) {
                        throw C36331k8.A0d("sendPort");
                    }
                    flowsWebBottomSheetContainer.A1m(A00, C36441kJ.A1C(data));
                }
            } catch (JSONException unused) {
                str = "Exception while parsing data from JS";
            } catch (NoSuchAlgorithmException unused2) {
                str = "Key algorithm not supported";
            } catch (InvalidKeySpecException unused3) {
                str = "Invalid public key";
            }
        } else {
            str = "Payload size exceeds limit";
            Log.e(str);
        }
        return AnonymousClass0AJ.A00;
    }
}
