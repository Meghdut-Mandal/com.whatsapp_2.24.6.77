package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9UG  reason: invalid class name */
public class AnonymousClass9UG {
    public final AnonymousClass627 A00;
    public final AnonymousClass16S A01;
    public final C29131Vl A02;

    public AnonymousClass9UG(AnonymousClass16S r1, AnonymousClass627 r2, C29131Vl r3) {
        this.A01 = r1;
        this.A02 = r3;
        this.A00 = r2;
    }

    public C79593ty A00(C22989Azf azf, AnonymousClass7hO r13, C22990Azg azg, String str) {
        HashMap A0J = AnonymousClass001.A0J();
        A0J.put("action", "start");
        A0J.put("presentation_style_type", "modal");
        HashMap A0J2 = AnonymousClass001.A0J();
        A0J2.put("device_id", this.A02.A01());
        AnonymousClass627 r5 = this.A00;
        C203639oR r3 = r5.A00;
        r3.A0F(A0J2);
        C128166Be r8 = new C128166Be("br_p2m_checkout_add_card", (String) null, A0J);
        C79593ty r1 = new C79593ty();
        r3.A0H.put("PaymentData", azg);
        r5.A00(r13, new C203579oL(r1, azf, this, 1), r8, str, (Map) null);
        return r1;
    }

    public C79593ty A01(C22989Azf azf, AnonymousClass7hO r11, C22990Azg azg, String str, String str2) {
        HashMap A0J = AnonymousClass001.A0J();
        A0J.put("action", "start");
        A0J.put("credential_id", str);
        C175798b4 r0 = (C175798b4) this.A01.A07(str);
        if (r0 != null) {
            A0J.put("network", C175798b4.A02(r0.A01));
        }
        A0J.put("device_id", this.A02.A01());
        C128166Be r6 = new C128166Be("br_p2p_verify_card", "CardAddedScreen", A0J);
        C79593ty r1 = new C79593ty();
        AnonymousClass627 r3 = this.A00;
        r3.A00.A0H.put("PaymentData", azg);
        r3.A00(r11, new C203579oL(r1, azf, this, 1), r6, str2, (Map) null);
        return r1;
    }
}
