package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.9Qt  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9Qt {
    public final /* synthetic */ AnonymousClass6C8 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;

    public /* synthetic */ AnonymousClass9Qt(AnonymousClass6C8 r1, BrazilPayBloksActivity brazilPayBloksActivity) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r1;
    }

    public final void A00(C175798b4 r10, C202059ky r11, ArrayList arrayList, boolean z) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        AnonymousClass6C8 r3 = this.A00;
        if (r11 == null) {
            BrazilPayBloksActivity.A0F(r3, r10, brazilPayBloksActivity, (String) null, arrayList, z);
            return;
        }
        int i = r11.A01;
        HashMap A0J = AnonymousClass001.A0J();
        if (i >= 0) {
            A0J.put("remaining_retries", String.valueOf(i));
        }
        C179158jJ.A0j(r3, A0J, r11.A00);
    }
}
