package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9jA  reason: invalid class name */
public class AnonymousClass9jA {
    public static Map A0E = new AnonymousClass5ZP(2);
    public static Map A0F = new AnonymousClass5ZP(3);
    public final C19460v5 A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass16T A02;
    public final C29121Vk A03;
    public final AnonymousClass1EU A04;
    public final C178518gf A05;
    public final C195019Sd A06;
    public final AnonymousClass627 A07;
    public final C201649k3 A08;
    public final C131376Ou A09;
    public final C24801Dv A0A;
    public final C33061ee A0B;
    public final AnonymousClass190 A0C;
    public final C29131Vl A0D;

    public void A00(Context context, String str) {
        AnonymousClass17Y r5 = this.A01;
        r5.A05(0, R.string.f12nameremoved);
        HashMap A0J = AnonymousClass001.A0J();
        A0J.put("action", "start");
        HashMap A0J2 = AnonymousClass001.A0J();
        A0J2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "modal");
        HashMap A0J3 = AnonymousClass001.A0J();
        A0J3.put("style", A0J2);
        A0J.put("presentation", A0J3);
        HashMap A0J4 = AnonymousClass001.A0J();
        A0J4.put("device_id", this.A0D.A01());
        AnonymousClass627 r7 = this.A07;
        C203639oR r6 = r7.A00;
        r6.A0F(A0J4);
        C128166Be r10 = new C128166Be("br_merchant_onboarding", (String) null, A0J);
        C23184B8s b8s = new C23184B8s(this, 0);
        C23218BAa bAa = new C23218BAa(this, 0);
        C79593ty r2 = new C79593ty();
        r6.A0H.put("BRMerchantData", b8s);
        r7.A00(bAa, new C203749ok(r2, this, 0), r10, str, (Map) null);
        r2.A0B(new C23209B9r(context, this, 2), r5.A04);
    }

    public AnonymousClass9jA(C19460v5 r1, C24801Dv r2, AnonymousClass17Y r3, C33061ee r4, AnonymousClass16T r5, AnonymousClass190 r6, C29121Vk r7, AnonymousClass1EU r8, C178518gf r9, C195019Sd r10, AnonymousClass627 r11, C201649k3 r12, C29131Vl r13, C131376Ou r14) {
        this.A01 = r3;
        this.A0C = r6;
        this.A00 = r1;
        this.A0A = r2;
        this.A0D = r13;
        this.A04 = r8;
        this.A09 = r14;
        this.A07 = r11;
        this.A03 = r7;
        this.A02 = r5;
        this.A05 = r9;
        this.A08 = r12;
        this.A06 = r10;
        this.A0B = r4;
    }

    public AnonymousClass9jA() {
    }
}
