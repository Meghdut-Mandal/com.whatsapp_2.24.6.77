package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7sJ  reason: invalid class name and case insensitive filesystem */
public class C164747sJ implements AnonymousClass7i1 {
    public Object A00;
    public final int A01;

    public C164747sJ(C122875vZ r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final Intent BlG(Context context, Uri uri) {
        String str;
        JSONObject jSONObject;
        if (this.A01 != 0) {
            C122875vZ r3 = (C122875vZ) this.A00;
            String A09 = ((C20800yB) r3.A00.get()).A09(210);
            if (TextUtils.isEmpty(A09)) {
                return null;
            }
            C118035nE r1 = new C118035nE();
            r3.A01.get();
            if (!AnonymousClass6Gm.A00(r1, uri.toString(), A09) || (jSONObject = r1.A00) == null) {
                return null;
            }
            try {
                JSONObject A1B = C36441kJ.A1B();
                return WaBloksActivity.A07(context, "com.bloks.www.minishops.whatsapp.pdp", C90484aE.A0l(A1B, "params", C90484aE.A0x(jSONObject, "server_params", A1B)));
            } catch (JSONException e) {
                e = e;
                str = "ShopsLinks.handleShopsPdpLink: Failed to assemble JSON";
                Log.e(str, e);
                return null;
            }
        } else {
            C122875vZ r6 = (C122875vZ) this.A00;
            C118035nE r4 = new C118035nE();
            String obj = uri.toString();
            AnonymousClass005 r32 = r6.A00;
            String A092 = ((C20800yB) r32.get()).A09(265);
            boolean z = false;
            if (((C20800yB) r32.get()).A0E(267) && !TextUtils.isEmpty(A092)) {
                r6.A01.get();
                if (AnonymousClass6Gm.A00(r4, obj, A092) && r4.A00 != null) {
                    z = true;
                }
            }
            if (!z) {
                return null;
            }
            try {
                JSONObject jSONObject2 = r4.A00;
                JSONObject A1B2 = C36441kJ.A1B();
                return WaBloksActivity.A07(context, "com.bloks.www.minishops.storefront.wa", C90484aE.A0l(A1B2, "params", C90484aE.A0x(jSONObject2, "server_params", A1B2)));
            } catch (JSONException e2) {
                e = e2;
                str = "ShopsLinks.handleStoreFrontLink: Failed to assemble JSON";
                Log.e(str, e);
                return null;
            }
        }
    }
}
