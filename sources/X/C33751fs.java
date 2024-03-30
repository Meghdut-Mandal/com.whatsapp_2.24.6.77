package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1fs  reason: invalid class name and case insensitive filesystem */
public class C33751fs {
    public C19730wQ A00;
    public C20810yC A01;
    public C33761ft A02;
    public AnonymousClass12U A03;
    public final C19600wD A04;
    public final C18820ts A05;
    public final C20380xT A06;

    public String A00(String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("faq.whatsapp.com");
        builder.appendPath("cxt");
        builder.appendQueryParameter("entrypointid", str);
        C18820ts r2 = this.A05;
        builder.appendQueryParameter("lg", r2.A06());
        builder.appendQueryParameter("lc", r2.A05());
        builder.appendQueryParameter("platform", "android");
        builder.appendQueryParameter("anid", (String) this.A02.A00().second);
        return builder.toString();
    }

    public void A01(AnonymousClass01I r5, String str) {
        boolean A022;
        if (!this.A04.A09()) {
            boolean A023 = C19600wD.A02(r5);
            int i = R.string.f12nameremoved;
            if (A023) {
                i = R.string.f12nameremoved;
            }
            AnonymousClass3P9 A032 = LegacyMessageDialogFragment.A03(new Object[0], i);
            C66233Ve r1 = C66233Ve.A00;
            A032.A03 = R.string.f12nameremoved;
            A032.A06 = r1;
            A032.A02().A1f(r5.getSupportFragmentManager(), (String) null);
            return;
        }
        C19730wQ r0 = this.A00;
        r0.A0G();
        if (r0.A00 != null && this.A03.A03()) {
            if (A02(str, 6518)) {
                A022 = C20800yB.A01(C21000yV.A02, this.A01, 6519);
            } else {
                A022 = A02(str, 3063);
            }
            if (A022) {
                r5.startActivity(AnonymousClass190.A13(r5.getBaseContext(), str));
                return;
            }
        }
        Context baseContext = r5.getBaseContext();
        String A002 = A00(str);
        Intent intent = new Intent();
        intent.setClassName(baseContext, "com.whatsapp.contextualhelp.ContextualHelpActivity");
        intent.putExtra("webview_url", A002);
        intent.putExtra("webview_hide_url", true);
        intent.putExtra("webview_javascript_enabled", true);
        intent.putExtra("webview_avoid_external", true);
        intent.putExtra("webview_deeplink_enabled", true);
        r5.startActivity(intent);
    }

    public boolean A02(String str, int i) {
        String A09 = this.A01.A09(i);
        if (A09 != null) {
            try {
                JSONArray jSONArray = new JSONObject(A09).getJSONArray("entrypoints_allowed_list");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    if (jSONArray.getString(i2).equalsIgnoreCase(str)) {
                        return true;
                    }
                }
            } catch (JSONException e) {
                Log.e("ContextualHelpHandler/allowContentInBloks", e);
            }
        }
        return false;
    }

    public C33751fs(C19600wD r1, C18820ts r2, C20380xT r3) {
        this.A06 = r3;
        this.A05 = r2;
        this.A04 = r1;
    }
}
