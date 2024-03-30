package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.webkit.WebMessage;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7O2  reason: invalid class name */
public final class AnonymousClass7O2 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ Message $msg;
    public final /* synthetic */ C133796a0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7O2(Message message, C133796a0 r3) {
        super(0);
        this.$msg = message;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        C131056No r0;
        Object obj = this.$msg.obj;
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type android.webkit.WebMessage");
        String data = ((WebMessage) obj).getData();
        if (data.length() <= 1024) {
            try {
                JSONObject A1C = C36441kJ.A1C(data);
                Object obj2 = A1C.get("method");
                if (AnonymousClass00C.A0J(obj2, "isSupported")) {
                    C133796a0 r3 = this.this$0;
                    Object obj3 = A1C.get("data");
                    AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                    Object obj4 = ((JSONObject) obj3).get("feature");
                    C90494aF.A10(obj4);
                    if (!AnonymousClass00C.A0J(obj4, "UPI_PAY") || r3.A05.A04("UPI") == null) {
                        C133796a0.A02(r3, C36381kD.A0j(), A1C);
                    } else {
                        C133796a0.A03(new AnonymousClass7O3(r3, C36441kJ.A1B().put("responseData", C36441kJ.A1B().put("result", true).put("webview_token", A1C.get("webview_token"))).put("method", A1C.get("method")).put("callbackID", A1C.get("callbackID"))));
                    }
                } else if (AnonymousClass00C.A0J(obj2, "startUpiPayment")) {
                    C133796a0 r1 = this.this$0;
                    C92624eH r02 = r1.A00;
                    if (r02 == null) {
                        throw C36331k8.A0d("secureWebView");
                    }
                    String string = A1C.getString("webview_token");
                    C123065vs r5 = r02.A06;
                    String url = r02.getUrl();
                    if (r5.A02) {
                        String A00 = C131056No.A00(url);
                        HashMap hashMap = r5.A04;
                        if (!hashMap.containsKey(A00) || (r0 = (C131056No) hashMap.get(A00)) == null || !string.equals(r0.A01)) {
                            C133796a0.A02(r1, "FAILURE", A1C);
                        }
                    }
                    Object obj5 = A1C.get("data");
                    AnonymousClass00C.A0E(obj5, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj5;
                    Object obj6 = jSONObject.get("reference_id");
                    AnonymousClass00C.A0E(obj6, "null cannot be cast to non-null type kotlin.String");
                    String str2 = (String) obj6;
                    Object obj7 = jSONObject.get("payment_config");
                    AnonymousClass00C.A0E(obj7, "null cannot be cast to non-null type kotlin.String");
                    String str3 = (String) obj7;
                    Object obj8 = jSONObject.get("amount");
                    AnonymousClass00C.A0E(obj8, "null cannot be cast to non-null type kotlin.String");
                    String str4 = (String) obj8;
                    Object obj9 = jSONObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
                    AnonymousClass00C.A0E(obj9, "null cannot be cast to non-null type kotlin.String");
                    String str5 = (String) obj9;
                    Object obj10 = jSONObject.get("signature_type");
                    AnonymousClass00C.A0E(obj10, "null cannot be cast to non-null type kotlin.String");
                    String str6 = (String) obj10;
                    Set A0w = C90504aG.A0w(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, "signature_type", "webview_token"});
                    AnonymousClass00C.A0D(A0w, 1);
                    JSONObject A1B = C36441kJ.A1B();
                    Iterator<String> keys = jSONObject.keys();
                    AnonymousClass00C.A08(keys);
                    C12380hx r4 = new C12380hx(C15060md.A02(new AnonymousClass7TE(A0w), new C18660tW(new C12790if(C155797Xl.A00, C15080mf.A05(keys)), 3)));
                    while (r4.hasNext()) {
                        String str7 = (String) r4.next();
                        A1B.put(str7, jSONObject.get(str7));
                    }
                    C134696bS r6 = new C134696bS(str5, str6, C36381kD.A0y(A1B));
                    Context context = r1.A02;
                    UserJid userJid = r1.A04;
                    Intent A0D = C36431kI.A0D();
                    A0D.setClassName(context.getPackageName(), "com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity");
                    A0D.putExtra("extra_receiver_jid", userJid.getRawString());
                    A0D.putExtra("extra_order_id", str2);
                    A0D.putExtra("extra_payment_config_id", str3);
                    A0D.putExtra("extra_p2m_amount", str4);
                    Object obj11 = A1C.get("method");
                    AnonymousClass00C.A0E(obj11, "null cannot be cast to non-null type kotlin.String");
                    A0D.putExtra("method", (String) obj11);
                    Object obj12 = A1C.get("callbackID");
                    AnonymousClass00C.A0E(obj12, "null cannot be cast to non-null type kotlin.String");
                    A0D.putExtra("callbackID", (String) obj12);
                    A0D.putExtra("extra_merchant_signature_data", r6);
                    A0D.putExtra("referral_screen", "webview");
                    A0D.putExtra("extra_payment_config_id", str3);
                    A0D.putExtra("extra_transaction_type", "p2m");
                    ((Activity) context).startActivityForResult(A0D, 1000);
                }
            } catch (JSONException unused) {
                str = "Exception while parsing data from JS";
            } catch (NoSuchAlgorithmException unused2) {
                str = "Key algorithm not supported";
            } catch (InvalidKeySpecException unused3) {
                str = "Invalid public key";
            } catch (SignatureException unused4) {
                str = "Invalid signature";
            }
        } else {
            str = "Payload size exceeds limit";
            Log.e(str);
        }
        return AnonymousClass0AJ.A00;
    }
}
