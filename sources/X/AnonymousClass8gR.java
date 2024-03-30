package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.8gR  reason: invalid class name */
public class AnonymousClass8gR extends AnonymousClass9I1 {
    public B1N A00;
    public C202269lR A01;
    public final Context A02;
    public final AE0 A03;
    public final C195479Ul A04;
    public final AnonymousClass5GM A05;
    public final AnonymousClass17Y A06;
    public final AnonymousClass19A A07;
    public final C29221Vu A08;
    public final AF7 A09;
    public final C29131Vl A0A;

    public AnonymousClass8gR(Context context, AnonymousClass17Y r3, AnonymousClass19A r4, C202269lR r5, AE0 ae0, C29221Vu r7, C29121Vk r8, C195479Ul r9, B1N b1n, AF7 af7, AnonymousClass5GM r12, C29131Vl r13) {
        super(r5.A04, r8);
        this.A02 = context;
        this.A06 = r3;
        this.A07 = r4;
        this.A0A = r13;
        this.A01 = r5;
        this.A04 = r9;
        this.A09 = af7;
        this.A08 = r7;
        this.A03 = ae0;
        this.A05 = r12;
        this.A00 = b1n;
    }

    public static void A00(C135086c7 r21, C135086c7 r22, AnonymousClass8gR r23, C185708uf r24, C185708uf r25, String str, String str2, String str3, String str4, HashMap hashMap) {
        String str5;
        String str6;
        String str7;
        AnonymousClass8gR r1 = r23;
        r1.A09.Buu();
        Log.i("PAY: IndiaUpiPaymentSetup sendSetPin called");
        AnonymousClass9YX r13 = r1.A00;
        r13.A02("upi-set-mpin");
        String str8 = null;
        String str9 = str4;
        HashMap hashMap2 = hashMap;
        if (hashMap != null) {
            C202269lR r5 = r1.A01;
            str5 = r5.A06("SMS", hashMap2, 1);
            if ("AADHAAR".equals(str9)) {
                str8 = r5.A06("AADHAAR", hashMap2, 1);
            }
            String A062 = r5.A06("MPIN", hashMap2, 1);
            str6 = r5.A06("ATMPIN", hashMap2, 1);
            str7 = str8;
            str8 = A062;
        } else {
            str5 = null;
            str6 = null;
            str7 = null;
        }
        AnonymousClass19A r232 = r1.A07;
        String A092 = r232.A09();
        ArrayList arrayList = AnonymousClass8v6.A00;
        String A0s = C165607th.A0s(r21);
        String str10 = (String) C165577te.A0g(r22);
        String A012 = r1.A0A.A01();
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1D(A0T);
        C36331k8.A1C(A0T, A092);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-set-mpin");
        if (A0s != null && C203539oF.A0O(A0s)) {
            C36331k8.A1D(A0a, "vpa", A0s);
        }
        String str11 = str;
        if (str != null && C203539oF.A0O(str11)) {
            C36331k8.A1D(A0a, "vpa-id", str11);
        }
        if (str10 != null && C203539oF.A0P(str10, 1, 100000, true)) {
            C36331k8.A1D(A0a, "upi-bank-info", str10);
        }
        String str12 = str2;
        if (C203539oF.A0S(str12, 1, false)) {
            C36331k8.A1D(A0a, "credential-id", str12);
        }
        String str13 = str3;
        if (C203539oF.A0P(str13, 35, 35, false)) {
            C36331k8.A1D(A0a, "seq-no", str13);
        }
        C203539oF.A0G(A0a, A012, false);
        if (C203539oF.A0P(str5, 0, 10000, false)) {
            C36331k8.A1D(A0a, "otp", str5);
        }
        if (C203539oF.A0P(str8, 0, 10000, false)) {
            C36331k8.A1D(A0a, "mpin", str8);
        }
        if (str6 != null && C203539oF.A0P(str6, 0, 10000, true)) {
            C36331k8.A1D(A0a, "atm-pin", str6);
        }
        if (str7 != null && C203539oF.A0P(str7, 0, 10000, true)) {
            C36331k8.A1D(A0a, "aadhaar-otp", str7);
        }
        A0a.A08(str9, "otp-type", AnonymousClass8v6.A02);
        A0a.A09("1", "default-debit", AnonymousClass8v6.A01);
        A0a.A09("1", "default-credit", AnonymousClass8v6.A00);
        C165577te.A1G(A0a, r25);
        C165577te.A1G(A0a, r24);
        r232.A0E(new B7L(r1.A02, r1.A06, r1.A08, r13, r1), C165567td.A0I(A0a, A0T), A092, 204, 0);
    }

    public static void A01(C135086c7 r18, C135086c7 r19, AnonymousClass8gR r20, String str, String str2, String str3, HashMap hashMap) {
        String str4;
        String str5;
        AnonymousClass8gR r3 = r20;
        AF7 af7 = r3.A09;
        af7.Buu();
        Log.i("PAY: IndiaUpiPaymentSetup sendChangePin called");
        AnonymousClass9YX r13 = r3.A00;
        r13.A02("upi-change-mpin");
        HashMap hashMap2 = hashMap;
        if (hashMap != null) {
            C202269lR r2 = r3.A01;
            str4 = r2.A06("MPIN", hashMap2, 2);
            str5 = r2.A06("NMPIN", hashMap2, 2);
        } else {
            str4 = null;
            str5 = null;
        }
        AnonymousClass19A r12 = r3.A07;
        String A092 = r12.A09();
        String A012 = r3.A0A.A01();
        String A0s = C165607th.A0s(r18);
        String str6 = (String) C165577te.A0g(r19);
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1D(A0T);
        C203539oF.A0E(A0T, A092);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-change-mpin");
        C203539oF.A0D(A0a, str2);
        String str7 = str3;
        if (C203539oF.A0P(str7, 35, 35, false)) {
            C36331k8.A1D(A0a, "seq-no", str7);
        }
        if (C203539oF.A0P(str4, 0, 1000, false)) {
            C36331k8.A1D(A0a, "old-mpin", str4);
        }
        if (C203539oF.A0P(str5, 0, 1000, false)) {
            C36331k8.A1D(A0a, "new-mpin", str5);
        }
        C203539oF.A0G(A0a, A012, false);
        if (A0s != null && C203539oF.A0S(A0s, 0, true)) {
            C36331k8.A1D(A0a, "vpa", A0s);
        }
        String str8 = str;
        if (str != null && C203539oF.A0O(str8)) {
            C36331k8.A1D(A0a, "vpa-id", str8);
        }
        if (str6 != null && C203539oF.A0W(str6, true)) {
            C36331k8.A1D(A0a, "upi-bank-info", str6);
        }
        C203399nx A0I = C165567td.A0I(A0a, A0T);
        af7.A07((C202059ky) null, 7, 0);
        Context context = r3.A02;
        C165577te.A19(r12, new B7L(context, r3.A06, r3.A08, r13, r3, af7), A0I, A092);
    }

    public void A02() {
        AF7 af7 = this.A09;
        af7.Buu();
        Log.i("PAY: IndiaUpiPaymentSetup sendGetListKeys called");
        String A0D = this.A03.A0D();
        if (!TextUtils.isEmpty(A0D)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("PAY: IndiaUpiPaymentSetup got cached listkeys; callback: ");
            C36321k7.A1N(this.A00, A0u);
            B1N b1n = this.A00;
            if (b1n != null) {
                b1n.BZk((C202059ky) null, A0D);
                return;
            }
            return;
        }
        AnonymousClass9YX r7 = this.A00;
        r7.A02("upi-list-keys");
        Log.i("PAY: IndiaUPIPaymentBankSetup sendGetListKeys");
        Integer A002 = this.A05.A02.A00("upi-list-keys");
        AnonymousClass19A r11 = this.A07;
        String A092 = r11.A09();
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1C(new AnonymousClass1AL("xmlns", "w:pay"), A0T);
        C36331k8.A1C(A0T, A092);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-list-keys");
        C203399nx A0I = C165567td.A0I(A0a, A0T);
        af7.A07((C202059ky) null, 1, 0);
        r11.A0E(new B7M(this.A02, this.A06, this.A08, r7, this, af7, A002), A0I, A092, 204, 0);
    }
}
