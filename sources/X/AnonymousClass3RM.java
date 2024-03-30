package X;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.URLSpan;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.3RM  reason: invalid class name */
public abstract class AnonymousClass3RM {
    public static String A01(String str) {
        if (!str.startsWith("whatsapp:user-notice")) {
            return "open-link";
        }
        String queryParameter = Uri.parse(AnonymousClass000.A0p("h://", str, AnonymousClass000.A0u())).getQueryParameter("action");
        if (queryParameter == null) {
            return "";
        }
        return queryParameter;
    }

    public static SpannableString A00(Context context, AnonymousClass4SH r16, String str) {
        Spanned fromHtml = Html.fromHtml(str);
        String obj = fromHtml.toString();
        SpannableString A0O = C36441kJ.A0O(obj);
        for (Object obj2 : fromHtml.getSpans(0, obj.length(), Object.class)) {
            int spanStart = fromHtml.getSpanStart(obj2);
            int spanEnd = fromHtml.getSpanEnd(obj2);
            int spanFlags = fromHtml.getSpanFlags(obj2);
            if (obj2 instanceof URLSpan) {
                URLSpan uRLSpan = (URLSpan) obj2;
                AnonymousClass4SH r11 = r16;
                if (r16 != null) {
                    String url = uRLSpan.getURL();
                    obj2 = new AnonymousClass2gB(context, r11, url, A01(url), A02(url));
                }
            }
            A0O.setSpan(obj2, spanStart, spanEnd, spanFlags);
        }
        return A0O;
    }

    public static HashMap A02(String str) {
        HashMap A0J = AnonymousClass001.A0J();
        if (!str.startsWith("whatsapp:user-notice")) {
            A0J.put("link", str);
        } else {
            Uri parse = Uri.parse(AnonymousClass000.A0p("h://", str, AnonymousClass000.A0u()));
            Iterator<String> it = parse.getQueryParameterNames().iterator();
            while (it.hasNext()) {
                String A0C = AnonymousClass001.A0C(it);
                if (!"action".equals(A0C)) {
                    A0J.put(A0C, parse.getQueryParameter(A0C));
                }
            }
        }
        return A0J;
    }
}
