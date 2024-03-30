package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9Qu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C194699Qu {
    public final /* synthetic */ BrazilPayBloksActivity A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C194699Qu(BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A00 = brazilPayBloksActivity;
        this.A01 = str;
    }

    public final void A00(C202059ky r5) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A00;
        String str = this.A01;
        AnonymousClass6C8 r2 = brazilPayBloksActivity.A01;
        if (r2 == null) {
            Log.i("PAY: BrazilPayBloksActivity onActivityResult - appToAppBloksCallback is null!");
        } else if (r5 != null) {
            C179158jJ.A0j(r2, (Map) null, r5.A00);
        } else {
            HashMap A0J = AnonymousClass001.A0J();
            A0J.put("app_to_app_authorization_code", str);
            brazilPayBloksActivity.A01.A01("on_success", A0J);
        }
    }
}
