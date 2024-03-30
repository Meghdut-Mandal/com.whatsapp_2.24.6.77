package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.9S6  reason: invalid class name */
public class AnonymousClass9S6 {
    public final C24611Dc A00 = C165597tg.A0S("PaymentStepUpWebviewAction");
    public final Context A01;
    public final AnonymousClass17Y A02;
    public final C29221Vu A03;
    public final C29121Vk A04;

    public void A00(B1R b1r, C206359tF r15, C203399nx r16, String str) {
        C203399nx[] r3;
        AnonymousClass1AL[] r2 = new AnonymousClass1AL[1];
        char A1Y = C36371kC.A1Y("step_up_id", r15.A02, r2);
        C203399nx A042 = C203399nx.A04("step_up", r2);
        AnonymousClass1AL[] r22 = new AnonymousClass1AL[1];
        C36341k9.A1L("challenge_id", r15.A00.A01, r22, A1Y);
        C203399nx A043 = C203399nx.A04("step_up_challenge", r22);
        if (r16 != null) {
            r3 = new C203399nx[3];
            r3[A1Y] = A042;
            r3[1] = A043;
            r3[2] = r16;
        } else {
            r3 = new C203399nx[2];
            r3[A1Y] = A042;
            r3[1] = A043;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        C36381kD.A1M("action", "get-step-up-webview-url", A0I);
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            C36381kD.A1M("provider_type", str2, A0I);
        }
        C203399nx A05 = C203399nx.A05("account", C165577te.A1a(A0I, A1Y), r3);
        C29121Vk r7 = this.A04;
        Context context = this.A01;
        AnonymousClass17Y r32 = this.A02;
        r7.A0H(new B7J(context, this.A03, r32, this, b1r, 16), A05, "get", 0);
    }

    public AnonymousClass9S6(Context context, AnonymousClass17Y r3, C29221Vu r4, C29121Vk r5) {
        this.A01 = context;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }
}
