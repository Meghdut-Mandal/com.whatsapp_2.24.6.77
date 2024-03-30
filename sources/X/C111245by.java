package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5by  reason: invalid class name and case insensitive filesystem */
public abstract class C111245by {
    public static final Intent A00(Activity activity, C20810yC r9, UserJid userJid, String str) {
        Intent A04;
        C36341k9.A1E(str, 1, r9);
        String str2 = null;
        List A0Y = C007103b.A0Y(AnonymousClass099.A0L(C36431kI.A19(r9, 4609), new String[]{","}, 0));
        List A0Y2 = C007103b.A0Y(AnonymousClass099.A0L(C36431kI.A19(r9, 4375), new String[]{","}, 0));
        if (A0Y2.contains("*") || C007103b.A0j(A0Y2, Uri.parse(str).getHost())) {
            if (userJid != null) {
                str2 = userJid.user;
            }
            if (!C007103b.A0j(A0Y, str2)) {
                Intent A0D = C36431kI.A0D();
                A0D.setClassName(activity.getPackageName(), "com.whatsapp.payments.ui.CheckoutLiteWebViewActivity");
                C18740tg.A06(str);
                A0D.putExtra("webview_url", str);
                A0D.putExtra("webview_javascript_enabled", true);
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    A0D.putExtra("webview_callback", (String) null);
                }
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    A0D.putExtra("webview_cancel_callback", (String) null);
                }
                A0D.putExtra("webview_should_ask_before_close", true);
                A0D.putExtra("webview_hide_url", false);
                A0D.putExtra("webview_open_new_tab_in_external_browser", true);
                A0D.putExtra("deep_link_type_support", 1);
                A0D.putExtra("webview_deeplink_enabled", true);
                A0D.putExtra("webview_title_show_domain_only", true);
                A0D.putExtra("webview_toolbar_v2", true);
                A0D.putExtra("webview_can_navigate_back", true);
                A04 = A0D.putExtra("message_cta_type", "checkout_lite");
                AnonymousClass00C.A0B(A04);
                return A04;
            }
        }
        A04 = C36331k8.A04(str);
        AnonymousClass00C.A0B(A04);
        return A04;
    }
}
