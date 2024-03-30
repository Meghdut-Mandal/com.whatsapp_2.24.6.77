package X;

import android.content.Context;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class B7O extends C178498gd {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03 = 2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7O(Context context, AnonymousClass17Y r9, C29221Vu r10, AnonymousClass9YX r11, AnonymousClass8g9 r12, AnonymousClass9FQ r13, C186018vH r14) {
        super(context, r9, r10, r11, "get-purpose-limiting-key");
        this.A00 = r12;
        this.A01 = r13;
        this.A02 = r14;
    }

    public void A05(C202059ky r4) {
        switch (this.A03) {
            case 0:
                AnonymousClass00C.A0D(r4, 0);
                super.A05(r4);
                ((AnonymousClass8gG) this.A02).A07.A01(r4, (Integer) this.A01, "get-order-transaction");
                ((AnonymousClass9FK) this.A00).A00.Bnv();
                return;
            case 1:
                ((AnonymousClass8gD) this.A00).A03.BOb(r4, 23);
                super.A05(r4);
                ((AnonymousClass9Q3) this.A02).A00((C206719tr) this.A01, r4);
                return;
            case 2:
                return;
            case 3:
                super.A05(r4);
                ((C22964AzG) this.A01).Bc3(r4);
                return;
            default:
                super.A05(r4);
                ((AnonymousClass8gL) this.A00).A02.A02.A01(r4, (Integer) this.A02, "upi-send-to-vpa");
                ((C22965AzH) this.A01).BcL(r4);
                return;
        }
    }

    public void A06(C202059ky r4) {
        switch (this.A03) {
            case 0:
                AnonymousClass00C.A0D(r4, 0);
                super.A06(r4);
                ((AnonymousClass8gG) this.A02).A07.A01(r4, (Integer) this.A01, "get-order-transaction");
                ((AnonymousClass9FK) this.A00).A00.Bnv();
                return;
            case 1:
                ((AnonymousClass8gD) this.A00).A03.BOb(r4, 23);
                super.A06(r4);
                ((AnonymousClass9Q3) this.A02).A00((C206719tr) this.A01, r4);
                return;
            case 2:
                return;
            case 3:
                super.A06(r4);
                ((C22964AzG) this.A01).Bc3(r4);
                return;
            default:
                super.A06(r4);
                ((AnonymousClass8gL) this.A00).A02.A02.A01(r4, (Integer) this.A02, "upi-send-to-vpa");
                ((C22965AzH) this.A01).BcL(r4);
                return;
        }
    }

    public void A07(C203399nx r22) {
        IllegalStateException illegalStateException;
        C203399nx A0c;
        C203399nx r14 = r22;
        switch (this.A03) {
            case 0:
                AnonymousClass00C.A0D(r14, 0);
                super.A07(r14);
                try {
                    AnonymousClass8gG r6 = (AnonymousClass8gG) this.A02;
                    ArrayList A04 = r6.A08.A04((AZ9) null, r14);
                    if (A04 == null || A04.size() <= 0) {
                        r6.A07.A02((Integer) this.A01, "get-order-transaction", 2);
                        ((AnonymousClass9FK) this.A00).A00.Bnv();
                        return;
                    }
                    C178548gi r2 = new C178548gi();
                    r2.A01 = A04;
                    r6.A06.A03(r2);
                    r6.A07.A02((Integer) this.A01, "get-order-transaction", 2);
                    AnonymousClass9FK r62 = (AnonymousClass9FK) this.A00;
                    C202319lY r1 = (C202319lY) A04.get(0);
                    if (r1 != null) {
                        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = r62.A00;
                        AVb.A00(indiaUpiCheckOrderDetailsActivity.A04, indiaUpiCheckOrderDetailsActivity, new C21297AGb(r1), 37);
                    }
                    r62.A00.Bnv();
                    return;
                } catch (C235919b unused) {
                    Log.e("PAY: IndiaUpiP2mGetOrderTransactionAction/getOrderTransaction: invalid response message");
                    ((AnonymousClass8gG) this.A02).A07.A01(C202059ky.A00(), (Integer) this.A01, "get-order-transaction");
                    ((AnonymousClass9FK) this.A00).A00.Bnv();
                    return;
                }
            case 1:
                AnonymousClass8gD r7 = (AnonymousClass8gD) this.A00;
                r7.A03.BOb((C202059ky) null, 23);
                super.A07(r14);
                C203399nx A032 = C203399nx.A03(r14);
                if (A032 != null && (A0c = A032.A0c("alias")) != null) {
                    AnonymousClass9Q3 r63 = (AnonymousClass9Q3) this.A02;
                    try {
                        r63.A00(new C206719tr(C165617ti.A0P(C146356vT.A00(), String.class, A0c.A0i("alias_value", (String) null), "upiAlias"), A0c.A0h("alias_type"), A0c.A0h("alias_id"), C90514aH.A0y(A0c.A0h("alias_status"))), (C202059ky) null);
                        return;
                    } catch (C235919b unused2) {
                        r7.A04.A05("onDeregisterVpaAlias/onResponseSuccess/corrupt stream exception");
                        r63.A00((C206719tr) null, new C202059ky(500));
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                try {
                    C203399nx A0e = C90514aH.A0e(r14, (C592133b) this.A02);
                    Class<String> cls = String.class;
                    Long A0P = C165567td.A0P();
                    Long A0Q = C165567td.A0Q();
                    C203539oF r64 = C203379ns.A00;
                    Class<String> cls2 = cls;
                    Long l = A0P;
                    Long l2 = A0Q;
                    C203379ns.A03(r14, cls2, l, l2, r64.A0Z(A0e, cls, A0P, A0Q, (Object) null, new String[]{"account", "action"}, false), new String[]{"account", "action"}, true);
                    Class<Long> cls3 = Long.class;
                    C203539oF r13 = r64;
                    Long A0t = C36411kG.A0t();
                    C203379ns.A03(r14, cls3, A0t, l2, (Object) null, new String[]{"account", "expiry-ts"}, false);
                    Class<String> cls4 = cls;
                    C203379ns.A03(r14, cls4, C90474aD.A0Y(), 10000L, (Object) null, new String[]{"account", "purpose-enc-certificate"}, false);
                    Long l3 = A0P;
                    Long l4 = A0Q;
                    C203379ns.A03(r14, cls4, l3, l4, (Object) null, new String[]{"account", PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE}, false);
                    C203539oF.A0A(A0e, r14, 28);
                    AIB.A03(r14, AKX.A00, new String[]{"account"});
                    C193619Me r4 = new C193619Me(Base64.decode((String) r13.A0Z(r14, cls4, l3, l4, (Object) null, new String[]{"account", "data"}, false), 8), ((Number) r13.A0Z(r14, cls3, l, l2, (Object) null, new String[]{"account", "key-version"}, false)).intValue(), ((Number) r13.A0Z(r14, cls3, A0t, l2, (Object) null, new String[]{"account", "server-ts"}, false)).longValue());
                    IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((AnonymousClass9FQ) this.A01).A00;
                    AZ9 A002 = AZ9.A00();
                    AtomicBoolean atomicBoolean = A002.A00;
                    if (!atomicBoolean.get()) {
                        r4.A01 = A002.A02;
                        if (!atomicBoolean.get()) {
                            r4.A00 = A002.A01;
                            indiaUpiSendPaymentActivity.A0F = r4;
                            return;
                        }
                        illegalStateException = AnonymousClass001.A09("key has been destroyed");
                    } else {
                        illegalStateException = AnonymousClass001.A09("key has been destroyed");
                    }
                    throw illegalStateException;
                } catch (C235919b unused3) {
                    Log.e("CorruptStreamException when parsing UPIGetPurposeLimitingKeyResponseSuccess");
                    return;
                }
            case 3:
                super.A07(r14);
                try {
                    C186278vh r5 = new C186278vh(r14, (C185958vB) this.A02);
                    C179008it r65 = (C179008it) ((C22964AzG) this.A01);
                    r65.A0S.A06(r65.A00, (C202059ky) null, 16);
                    r65.A02 = C173858Tk.A0J(r65);
                    r65.A04.A01("upi-get-credential");
                    r65.Bnv();
                    String str = r65.A02;
                    if (r65 instanceof IndiaUpiDebitCardVerificationActivity) {
                        IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity = (IndiaUpiDebitCardVerificationActivity) r65;
                        String A0D = indiaUpiDebitCardVerificationActivity.A0M.A0D();
                        C175748az r12 = indiaUpiDebitCardVerificationActivity.A05;
                        indiaUpiDebitCardVerificationActivity.A4H((C175818b6) r12.A08, A0D, r12.A0B, str, (String) C207249un.A06(r12), 1);
                        return;
                    }
                    IndiaUpiAadhaarCardVerificationActivity indiaUpiAadhaarCardVerificationActivity = (IndiaUpiAadhaarCardVerificationActivity) r65;
                    C184228s6 r23 = (C184228s6) r5.A00;
                    if (r23 != null) {
                        indiaUpiAadhaarCardVerificationActivity.A05 = r23.A00;
                        indiaUpiAadhaarCardVerificationActivity.A06 = r23.A01;
                    }
                    String A0D2 = indiaUpiAadhaarCardVerificationActivity.A0M.A0D();
                    C175748az r15 = indiaUpiAadhaarCardVerificationActivity.A02;
                    if (r15 == null) {
                        throw C36331k8.A0d("bankAccount");
                    }
                    String str2 = r15.A0B;
                    C175898bF r72 = r15.A08;
                    AnonymousClass00C.A0E(r72, "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData");
                    C175818b6 r73 = (C175818b6) r72;
                    C175748az r16 = indiaUpiAadhaarCardVerificationActivity.A02;
                    if (r16 == null) {
                        throw C36331k8.A0d("bankAccount");
                    }
                    indiaUpiAadhaarCardVerificationActivity.A4I(r73, A0D2, str2, str, (String) C207249un.A06(r16), 1, true);
                    return;
                } catch (C235919b unused4) {
                    Log.e("PAY: IndiaUpiOtpAction: could not parse generate-otp response");
                    ((C22964AzG) this.A01).Bc3(C202059ky.A00());
                    return;
                }
            default:
                super.A07(r14);
                ((AnonymousClass8gL) this.A00).A02.A04((Integer) this.A02, "upi-send-to-vpa");
                ((C22965AzH) this.A01).BcL((C202059ky) null);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7O(Context context, AnonymousClass17Y r9, C29221Vu r10, AnonymousClass9YX r11, AnonymousClass8gG r12, AnonymousClass9FK r13, Integer num) {
        super(context, r9, r10, r11, "get-order-transaction");
        this.A02 = r12;
        this.A01 = num;
        this.A00 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7O(Context context, AnonymousClass17Y r9, C29221Vu r10, AnonymousClass9YX r11, C22964AzG azG, AnonymousClass8gP r13, C185958vB r14) {
        super(context, r9, r10, r11, "upi-generate-otp");
        this.A00 = r13;
        this.A01 = azG;
        this.A02 = r14;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7O(Context context, AnonymousClass17Y r9, C29221Vu r10, AnonymousClass9YX r11, C22965AzH azH, AnonymousClass8gL r13, Integer num) {
        super(context, r9, r10, r11, "upi-send-to-vpa");
        this.A00 = r13;
        this.A01 = azH;
        this.A02 = num;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7O(Context context, AnonymousClass17Y r9, C206719tr r10, C29221Vu r11, AnonymousClass9YX r12, AnonymousClass8gD r13, AnonymousClass9Q3 r14) {
        super(context, r9, r11, r12, "deregister-alias");
        this.A00 = r13;
        this.A02 = r14;
        this.A01 = r10;
    }
}
