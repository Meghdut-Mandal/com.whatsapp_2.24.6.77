package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;

/* renamed from: X.9Ra  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C194739Ra {
    public final /* synthetic */ AnonymousClass6C8 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C194739Ra(AnonymousClass6C8 r1, BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A01 = brazilPayBloksActivity;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void A00(C202059ky r10) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        String str = this.A02;
        AnonymousClass6C8 r4 = this.A00;
        if (r10 != null) {
            int i = r10.A01;
            HashMap A0J = AnonymousClass001.A0J();
            A0J.put("remaining_retries", String.valueOf(i));
            C165597tg.A1M(A0J, r10.A00);
            if (i >= 0) {
                AnonymousClass9YB A012 = brazilPayBloksActivity.A0F.A01();
                AnonymousClass9FC r6 = new AnonymousClass9FC(i);
                C203869p1 r3 = new C203869p1(A0J, r4, 14);
                C19770wU r7 = A012.A03;
                C36331k8.A1F(new C175578ai(r3, A012.A01, A012.A02, r6, r7, str), r7);
                return;
            }
            r4.A01("on_failure", A0J);
            return;
        }
        r4.A00("on_success");
    }
}
