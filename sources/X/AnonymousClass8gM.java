package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.8gM  reason: invalid class name */
public class AnonymousClass8gM extends AnonymousClass9I1 {
    public B1K A00;
    public final AnonymousClass16T A01;
    public final C202269lR A02;
    public final AnonymousClass1EU A03;
    public final Context A04;
    public final AnonymousClass17Y A05;
    public final C20810yC A06;
    public final AnonymousClass19A A07;
    public final C29221Vu A08;
    public final AF7 A09;
    public final AnonymousClass5GM A0A;

    public AnonymousClass8gM(Context context, AnonymousClass17Y r3, AnonymousClass16T r4, C20810yC r5, AnonymousClass19A r6, C202269lR r7, C29221Vu r8, C29121Vk r9, AnonymousClass1EU r10, B1K b1k, AF7 af7, AnonymousClass5GM r13) {
        super(r7.A04, r9);
        this.A06 = r5;
        this.A04 = context;
        this.A05 = r3;
        this.A07 = r6;
        this.A03 = r10;
        this.A02 = r7;
        this.A01 = r4;
        this.A09 = af7;
        this.A08 = r8;
        this.A0A = r13;
        this.A00 = b1k;
    }

    public void A00(String str, String str2, boolean z) {
        Log.i("PAY: IndiaUpiPaymentSetup createPaymentAccountBatch called");
        AF7 af7 = this.A09;
        af7.A07((C202059ky) null, 3, 0);
        AnonymousClass9YX r11 = this.A00;
        r11.A02("upi-batch");
        AnonymousClass19A r4 = this.A07;
        String A092 = r4.A09();
        boolean z2 = z;
        String A0Y = C165617ti.A0Y(z2 ? 1 : 0);
        ArrayList arrayList = AnonymousClass8v2.A00;
        AnonymousClass5GM r14 = null;
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, "xmlns", "w:pay");
        C36341k9.A1C(A0T);
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C203539oF.A0E(A0T, A092);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-batch");
        C36331k8.A1D(A0a, "version", "2");
        String str3 = str2;
        if (C203539oF.A0R(str3, 1, true)) {
            C36331k8.A1D(A0a, "provider-type", str3);
        }
        A0a.A08(A0Y, "popular-banks", AnonymousClass8v2.A01);
        A0a.A08(str, "account-type", AnonymousClass8v2.A00);
        C203399nx A0I = C165567td.A0I(A0a, A0T);
        boolean A0E = this.A06.A0E(2227);
        String str4 = "in_upi_batch_tag";
        if (A0E) {
            this.A0A.A01(185468726, str4);
        }
        Context context = this.A04;
        AnonymousClass17Y r9 = this.A05;
        C29221Vu r10 = this.A08;
        if (A0E) {
            r14 = this.A0A;
        } else {
            str4 = null;
        }
        C165577te.A19(r4, new AnonymousClass8gU(context, r9, r10, r11, this, af7, r14, str4, z2), A0I, A092);
    }

    public void A01(String str, String str2, boolean z, boolean z2) {
        Log.i("PAY: IndiaUpiPaymentSetup sendGetBanksList called");
        AF7 af7 = this.A09;
        af7.A07((C202059ky) null, 4, 0);
        AnonymousClass9YX r11 = this.A00;
        r11.A02("upi-get-banks");
        AnonymousClass19A r4 = this.A07;
        String A092 = r4.A09();
        boolean z3 = z;
        String A0Y = C165617ti.A0Y(z3 ? 1 : 0);
        ArrayList arrayList = AnonymousClass8v3.A00;
        AnonymousClass5GM r14 = null;
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1C(new AnonymousClass1AL("xmlns", "w:pay"), A0T);
        C203539oF.A0E(A0T, A092);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-get-banks");
        C36331k8.A1D(A0a, "version", "2");
        String str3 = str2;
        if (C203539oF.A0R(str3, 1, true)) {
            C36331k8.A1D(A0a, "provider-type", str3);
        }
        A0a.A08(A0Y, "popular-banks", AnonymousClass8v3.A01);
        A0a.A08(str, "account-type", AnonymousClass8v3.A00);
        C203399nx A0I = C165567td.A0I(A0a, A0T);
        boolean A0E = this.A06.A0E(2227);
        String str4 = "in_upi_get_banks_tag";
        if (A0E) {
            this.A0A.A01(185478219, str4);
        }
        Context context = this.A04;
        AnonymousClass17Y r9 = this.A05;
        C29221Vu r10 = this.A08;
        if (A0E) {
            r14 = this.A0A;
        } else {
            str4 = null;
        }
        C165577te.A19(r4, new AnonymousClass8gV(context, r9, r10, r11, this, af7, r14, str4, z2, z3), A0I, A092);
    }
}
