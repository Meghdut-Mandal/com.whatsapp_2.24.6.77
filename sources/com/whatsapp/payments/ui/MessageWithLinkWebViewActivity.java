package com.whatsapp.payments.ui;

import X.AnonymousClass00C;
import X.AnonymousClass098;
import X.AnonymousClass190;
import X.AnonymousClass1EU;
import X.AnonymousClass3PX;
import X.AnonymousClass7O4;
import X.AnonymousClass7O5;
import X.C133796a0;
import X.C36331k8;
import X.C36431kI;
import X.C36441kJ;
import X.C46632Zt;
import X.C90514aH;
import X.C92624eH;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.webkit.WebView;
import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

public class MessageWithLinkWebViewActivity extends C46632Zt {
    public AnonymousClass1EU A00;
    public AnonymousClass3PX A01;
    public int A02 = 4;
    public UserJid A03;
    public C133796a0 A04;
    public String A05 = "link_to_webview";
    public String A06;

    public void A3j(int i, Intent intent) {
        if (i == 0) {
            AnonymousClass3PX r0 = this.A01;
            if (r0 != null) {
                String str = this.A05;
                int i2 = this.A02;
                r0.A01(this.A03, str, this.A06, 1, i2);
            } else {
                throw C36331k8.A0d("messageWithLinkLogging");
            }
        }
        super.A3j(i, intent);
    }

    public void A3k(WebView webView) {
        AnonymousClass00C.A0D(webView, 0);
        if (A3r() && (webView instanceof C92624eH)) {
            ((C92624eH) webView).A06.A02 = true;
        }
        super.A3k(webView);
    }

    public void A3l(WebView webView, String str) {
        if (A3r()) {
            Looper myLooper = Looper.myLooper();
            UserJid userJid = this.A03;
            C133796a0 r2 = this.A04;
            if (r2 == null) {
                if (myLooper != null && userJid != null) {
                    AnonymousClass190 A0j = C36441kJ.A0j();
                    AnonymousClass1EU r7 = this.A00;
                    if (r7 != null) {
                        r2 = new C133796a0(this, myLooper, A0j, userJid, r7);
                        this.A04 = r2;
                    } else {
                        throw C36331k8.A0d("paymentsManager");
                    }
                } else {
                    return;
                }
            }
            C92624eH r1 = this.A01;
            AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.facebook.secure.securewebview.SecureWebView");
            AnonymousClass00C.A0D(r1, 0);
            C133796a0.A03(new AnonymousClass7O5(r1, r2));
        }
    }

    public boolean A3o() {
        return false;
    }

    public boolean A3r() {
        return this.A0D.A0E(3939);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C133796a0 r3;
        super.onActivityResult(i, i2, intent);
        if (i == 1000 && (r3 = this.A04) != null) {
            String str = "FAILURE";
            if (intent == null) {
                C133796a0.A02(r3, str, (JSONObject) null);
                return;
            }
            if (i2 == -1) {
                str = "SUCCESS";
            } else if (i2 == 0) {
                str = "CANCELED";
            }
            C133796a0.A03(new AnonymousClass7O4(r3, C36441kJ.A1B().put("responseData", C36441kJ.A1B().put("result", str)).put("method", intent.getStringExtra("method")).put("callbackID", intent.getStringExtra("callbackID"))));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("webview_receiver_jid");
        if (stringExtra != null && (!AnonymousClass098.A06(stringExtra))) {
            this.A03 = C36431kI.A0l(stringExtra);
        }
        String stringExtra2 = getIntent().getStringExtra("message_cta_type");
        if (stringExtra2 == null) {
            stringExtra2 = "link_to_webview";
        }
        this.A05 = stringExtra2;
        this.A02 = C90514aH.A0A(stringExtra2.equals("marketing_msg_webview") ? 1 : 0);
        String stringExtra3 = getIntent().getStringExtra("webview_message_template_id");
        this.A06 = stringExtra3;
        AnonymousClass3PX r0 = this.A01;
        if (r0 != null) {
            r0.A01(this.A03, this.A05, stringExtra3, 4, this.A02);
            return;
        }
        throw C36331k8.A0d("messageWithLinkLogging");
    }
}
