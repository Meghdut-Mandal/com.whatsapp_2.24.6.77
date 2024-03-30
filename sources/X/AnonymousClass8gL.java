package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.8gL  reason: invalid class name */
public class AnonymousClass8gL extends AnonymousClass9I1 {
    public final AnonymousClass16T A00;
    public final C196129Xv A01;
    public final AnonymousClass5GM A02;
    public final Context A03;
    public final AnonymousClass17Y A04;
    public final AnonymousClass19A A05;
    public final C202269lR A06;
    public final C29221Vu A07;
    public final C29131Vl A08;

    public AnonymousClass8gL(Context context, AnonymousClass17Y r3, AnonymousClass16T r4, AnonymousClass19A r5, C196129Xv r6, C202269lR r7, C29221Vu r8, C29121Vk r9, AnonymousClass5GM r10, C29131Vl r11) {
        super(r7.A04, r9);
        this.A03 = context;
        this.A04 = r3;
        this.A05 = r5;
        this.A08 = r11;
        this.A06 = r7;
        this.A00 = r4;
        this.A01 = r6;
        this.A07 = r8;
        this.A02 = r10;
    }

    public void A01(C135086c7 r26, C135086c7 r27, C22954Az6 az6) {
        String str;
        String str2;
        String str3;
        String str4;
        Log.i("PAY: verifyPaymentVpa called");
        String A012 = this.A08.A01();
        C135086c7 r13 = r27;
        boolean z = !C202349ld.A02(r13);
        String str5 = null;
        if (z) {
            str = (String) C165577te.A0g(r13);
            if (((String) r13.A00).length() == 10) {
                str4 = "mobile_number";
            } else {
                str4 = "numeric_id";
            }
            str3 = "mobile_number";
            if (str4 != str3) {
                str3 = "numeric_id";
            }
            str2 = "2";
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str5 = (String) C165577te.A0g(r26);
        }
        AnonymousClass19A r3 = this.A05;
        String A09 = r3.A09();
        ArrayList arrayList = AnonymousClass8v1.A00;
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C165567td.A1E(A0T);
        C203539oF.A0E(A0T, A09);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-get-vpa-name");
        if (str5 != null && C203539oF.A0X(str5, true)) {
            C36331k8.A1D(A0a, "vpa", str5);
        }
        C203539oF.A0G(A0a, A012, false);
        if (str != null && C203539oF.A0R(str, 8, true)) {
            C36331k8.A1D(A0a, "value", str);
        }
        A0a.A08(str2, "version", AnonymousClass8v1.A01);
        A0a.A08(str3, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AnonymousClass8v1.A00);
        r3.A0K(new C178478gb(this.A03, this.A04, r13, az6, this.A07, this.A00, this, this.A02.A02.A00("upi-get-vpa-name"), z), C165567td.A0I(A0a, A0T), A09, 204, AnonymousClass6X5.A0L);
    }

    public void A00(AnonymousClass16X r34, C135086c7 r35, C135086c7 r36, C135086c7 r37, C175928bI r38, AnonymousClass8gJ r39, C22965AzH azH, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, HashMap hashMap, boolean z) {
        String str11;
        String str12;
        AnonymousClass1AL[] A0k;
        Log.i("PAY: IndiaUpiPaymentSetup sendPaymentToNonWaVpa called");
        C175928bI r3 = r38;
        Boolean bool = r3.A0I;
        AnonymousClass16X r11 = r34;
        C207119ua A022 = this.A01.A02(AnonymousClass16W.A05, r11);
        AnonymousClass19A r32 = this.A05;
        String A09 = r32.A09();
        ArrayList arrayList = AnonymousClass8v5.A00;
        String A012 = this.A08.A01();
        String A062 = this.A06.A06("MPIN", hashMap, 6);
        String str13 = r3.A0Q;
        String str14 = r3.A0O;
        String str15 = r3.A0S;
        String str16 = r3.A0K;
        String str17 = (String) C165577te.A0g(r36);
        String str18 = (String) C165577te.A0g(r35);
        String str19 = r3.A0R;
        String str20 = r3.A0P;
        String str21 = (String) C165577te.A0g(r37);
        String obj = r11.toString();
        String str22 = r3.A0U;
        if (z) {
            str11 = "p2m";
        } else {
            str11 = "p2p";
        }
        if (bool != null) {
            str12 = C165617ti.A0Y(bool.booleanValue() ? 1 : 0);
        } else {
            str12 = null;
        }
        C185708uf A023 = C185708uf.A02(A022);
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1D(A0T);
        if (C203539oF.A0W(A09, false)) {
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
        }
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-send-to-vpa");
        C203539oF.A0D(A0a, str);
        C203539oF.A0G(A0a, A012, false);
        if (C203539oF.A0U(A062, 0, false)) {
            C36331k8.A1D(A0a, "mpin", A062);
        }
        if (C203539oF.A0P(str13, 0, 100, false)) {
            C36331k8.A1D(A0a, "sender-vpa", str13);
        }
        if (C203539oF.A0P(str14, 0, 100, false)) {
            C36331k8.A1D(A0a, "receiver-vpa", str14);
        }
        if (C203539oF.A0P(str15, 0, 35, false)) {
            C36331k8.A1D(A0a, "seq-no", str15);
        }
        if (C203539oF.A0Q(str16, 0, false)) {
            C36331k8.A1D(A0a, "message-id", str16);
        }
        String str23 = str4;
        if (str4 != null && C203539oF.A0P(str23, 0, 4, true)) {
            C36331k8.A1D(A0a, "mcc", str23);
        }
        String str24 = str3;
        if (str3 != null && C203539oF.A0T(str24, 0, true)) {
            C36331k8.A1D(A0a, "ref-id", str24);
        }
        String str25 = str5;
        if (str5 != null && C203539oF.A0P(str25, 0, 2048, true)) {
            C36331k8.A1D(A0a, "ref-url", str25);
        }
        String str26 = str9;
        if (str9 != null && C203539oF.A0Q(str26, 0, true)) {
            C36331k8.A1D(A0a, "note", str26);
        }
        if (str17 != null && C203539oF.A0X(str17, true)) {
            C36331k8.A1D(A0a, "payee-name", str17);
        }
        String str27 = str7;
        if (str7 != null && C203539oF.A0P(str27, 0, 4, true)) {
            C36331k8.A1D(A0a, "mode", str27);
        }
        String str28 = str6;
        if (str6 != null && C203539oF.A0P(str28, 1, 4, true)) {
            C36331k8.A1D(A0a, "purpose-code", str28);
        }
        if (str18 != null && C203539oF.A0W(str18, true)) {
            C36331k8.A1D(A0a, "upi-bank-info", str18);
        }
        if (str19 != null && C203539oF.A0O(str19)) {
            C36331k8.A1D(A0a, "sender-vpa-id", str19);
        }
        if (str20 != null && C203539oF.A0O(str20)) {
            C36331k8.A1D(A0a, "receiver-vpa-id", str20);
        }
        if (str21 != null && C203539oF.A0P(str21, 8, 15, true)) {
            C36331k8.A1D(A0a, "receiver-upi-number", str21);
        }
        if (obj != null && C203539oF.A0O(obj)) {
            C36331k8.A1D(A0a, "amount", obj);
        }
        String str29 = str2;
        if (str2 != null && C203539oF.A0O(str29)) {
            C36331k8.A1D(A0a, "currency", str29);
        }
        if (str22 != null && C203539oF.A0X(str22, true)) {
            C36331k8.A1D(A0a, "token", str22);
        }
        String str30 = str8;
        if (str8 != null && C203539oF.A0X(str30, true)) {
            C36331k8.A1D(A0a, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str30);
        }
        String str31 = str10;
        if (str10 != null && C203539oF.A0Q(str31, 1, true)) {
            C36331k8.A1D(A0a, "international-pay-detail", str31);
        }
        A0a.A08(str11, "transaction-type", AnonymousClass8v5.A01);
        A0a.A08("2", "version", AnonymousClass8v5.A02);
        A0a.A08(str12, "is_first_send", AnonymousClass8v5.A00);
        A0T.A05(C165567td.A0I(C165577te.A0Y(A023, "amount"), A0a));
        C203399nx A032 = A0T.A03();
        AnonymousClass9YX A042 = AnonymousClass9I1.A04(this, "upi-send-to-vpa");
        List A0I = AnonymousClass001.A0I();
        C203399nx A0b = A032.A0b(0);
        if (!(A0b == null || (A0k = A0b.A0k()) == null)) {
            C18740tg.A06(A0k);
            A0I = Arrays.asList(A0k);
        }
        r39.A00("U66", A0I);
        r32.A0E(new B7O(this.A03, this.A04, this.A07, A042, azH, this, this.A02.A02.A00("upi-send-to-vpa")), A032, A09, 204, AnonymousClass6X5.A0L);
    }
}
