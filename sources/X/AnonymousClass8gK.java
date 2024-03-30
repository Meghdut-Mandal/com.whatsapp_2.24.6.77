package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.8gK  reason: invalid class name */
public class AnonymousClass8gK extends AnonymousClass9I1 {
    public C175818b6 A00;
    public C22967AzJ A01;
    public final AnonymousClass16T A02;
    public final AnonymousClass1EZ A03;
    public final AnonymousClass1EU A04;
    public final AF7 A05;
    public final Context A06;
    public final AnonymousClass17Y A07;
    public final C20810yC A08;
    public final AnonymousClass19A A09;
    public final AE0 A0A;
    public final C29221Vu A0B;
    public final AnonymousClass5GM A0C;
    public final C29131Vl A0D;

    public AnonymousClass8gK(Context context, AnonymousClass17Y r3, AnonymousClass16T r4, C20810yC r5, AnonymousClass19A r6, C202269lR r7, AE0 ae0, AnonymousClass1EZ r9, C29221Vu r10, C29121Vk r11, AnonymousClass1EU r12, C22967AzJ azJ, AF7 af7, AnonymousClass5GM r15, C29131Vl r16) {
        super(r7.A04, r11);
        this.A06 = context;
        this.A08 = r5;
        this.A07 = r3;
        this.A09 = r6;
        this.A0D = r16;
        this.A04 = r12;
        this.A03 = r9;
        this.A02 = r4;
        this.A0B = r10;
        this.A0A = ae0;
        this.A05 = af7;
        this.A0C = r15;
        this.A01 = azJ;
    }

    public void A00(C175818b6 r27, C22975AzR azR, boolean z, boolean z2) {
        Log.i("PAY: IndiaUpiPaymentSetup registerVpa called");
        AnonymousClass9YX r25 = this.A00;
        r25.A02("upi-register-vpa");
        AnonymousClass19A r24 = this.A09;
        String A092 = r24.A09();
        ArrayList arrayList = AnonymousClass8v4.A00;
        String A012 = this.A0D.A01();
        C175818b6 r6 = r27;
        String str = (String) C165577te.A0g(r6.A05);
        String A0B2 = this.A0A.A0B();
        String str2 = (String) C165577te.A0g(r6.A08);
        String str3 = r6.A0E;
        String str4 = "1";
        String str5 = "0";
        if (z) {
            str5 = str4;
        }
        if (!z2) {
            str4 = "0";
        }
        AnonymousClass5GM r11 = null;
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1D(A0T);
        C203539oF.A0E(A0T, A092);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-register-vpa");
        if (C203539oF.A0U(A012, 1, false)) {
            C36331k8.A1D(A0a, "device-id", A012);
        }
        if (C203539oF.A0P(str, 1, 100000, false)) {
            C36331k8.A1D(A0a, "upi-bank-info", str);
        }
        if (A0B2 != null && C203539oF.A0R(A0B2, 1, true)) {
            C36331k8.A1D(A0a, "provider-type", A0B2);
        }
        if (str2 != null && C203539oF.A0P(str2, 1, 200, true)) {
            C36331k8.A1D(A0a, "vpa", str2);
        }
        if (str3 != null && C203539oF.A0S(str3, 1, true)) {
            C36331k8.A1D(A0a, "vpa-id", str3);
        }
        A0a.A09(str5, "default-debit", AnonymousClass8v4.A02);
        A0a.A09(str4, "default-credit", AnonymousClass8v4.A00);
        A0a.A08("0", "default-debit-p2m", AnonymousClass8v4.A01);
        C203399nx A0I = C165567td.A0I(A0a, A0T);
        this.A00 = r6;
        AF7 af7 = this.A05;
        af7.A07((C202059ky) null, 5, 0);
        boolean A0E = this.A08.A0E(2227);
        String str6 = "in_upi_register_tag";
        if (A0E) {
            this.A0C.A01(185475893, str6);
        }
        Context context = this.A06;
        AnonymousClass17Y r15 = this.A07;
        C29221Vu r1 = this.A0B;
        if (A0E) {
            r11 = this.A0C;
        } else {
            str6 = null;
        }
        C165577te.A19(r24, new B7M(context, r15, r1, r25, this, af7, azR, r11, str6), A0I, A092);
    }
}
