package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9RY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9RY {
    public final /* synthetic */ AnonymousClass6C8 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass9RY(AnonymousClass6C8 r1, BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A01 = brazilPayBloksActivity;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void A00(C202059ky r8, AnonymousClass8b7 r9) {
        int i;
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        String str = this.A02;
        AnonymousClass6C8 r4 = this.A00;
        if (r8 == null) {
            HashMap A0J = AnonymousClass001.A0J();
            A0J.put("remaining_validates", String.valueOf(1));
            C19970wo r1 = brazilPayBloksActivity.A07;
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            } else {
                i = 60;
            }
            A0J.put("next_resend_ts", String.valueOf((long) Math.ceil(((double) (C19970wo.A00(r1) + ((long) (i * 1000)))) / 1000.0d)));
            if (r9 != null) {
                A0J.put("verified_state", C165617ti.A0Y(r9.A0a ? 1 : 0));
                brazilPayBloksActivity.A0F.A01().A04(new C203869p1(A0J, r4, 13), r9.A07());
                return;
            }
            r4.A01("on_success", A0J);
            return;
        }
        C179158jJ.A0j(r4, (Map) null, r8.A00);
    }
}
