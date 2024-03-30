package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;

/* renamed from: X.9RZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9RZ {
    public final /* synthetic */ AnonymousClass6C8 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass9RZ(AnonymousClass6C8 r1, BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void A00(C175798b4 r7, C202059ky r8) {
        int i;
        int i2;
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        AnonymousClass6C8 r5 = this.A00;
        String str = this.A02;
        if (r8 != null || r7 == null) {
            HashMap A0J = AnonymousClass001.A0J();
            A0J.put("remaining_validates", String.valueOf(1));
            C19970wo r1 = brazilPayBloksActivity.A07;
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            } else {
                i = 60;
            }
            A0J.put("next_resend_ts", String.valueOf((long) Math.ceil(((double) (C19970wo.A00(r1) + ((long) (i * 1000)))) / 1000.0d)));
            if (r8 != null) {
                i2 = r8.A00;
            } else {
                i2 = 0;
            }
            C179158jJ.A0j(r5, A0J, i2);
            return;
        }
        r5.A00("on_success");
    }
}
