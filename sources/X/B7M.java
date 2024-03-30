package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public class B7M extends C178498gd {
    public Object A00;
    public Object A01;
    public final int A02;

    public void A05(C202059ky r12) {
        C202059ky r5 = r12;
        switch (this.A02) {
            case 0:
                C36321k7.A1J(r12, "PAY: IndiaUpiBlockListManager fetch error: ", AnonymousClass000.A0u());
                ((C192639Hz) this.A01).A01.Bf8(r12);
                return;
            case 1:
                super.A05(r12);
                ((C22962AzE) this.A01).BQZ(r12);
                return;
            case 2:
            case 4:
                super.A05(r12);
                ((C22953Az5) this.A01).BeS(r12);
                return;
            case 3:
                super.A05(r12);
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((C194499Py) this.A01).A00;
                if (r12 == null) {
                    indiaUpiSendPaymentActivity.A0V.A02(indiaUpiSendPaymentActivity.A00, 2);
                }
                C178848hw.A1I(r12, indiaUpiSendPaymentActivity, true);
                return;
            case 9:
                super.A05(r12);
                ((AnonymousClass9Q2) this.A01).A00((AnonymousClass16X) null, (AnonymousClass16X) null, r12);
                return;
            case 10:
                super.A05(r12);
                A08(r12);
                B1N b1n = ((AnonymousClass8gR) this.A00).A00;
                if (b1n != null) {
                    b1n.BZk(r12, (String) null);
                    return;
                }
                return;
            case 11:
                super.A05(r12);
                ((AnonymousClass9Qx) this.A01).A00(r12, (String) null);
                return;
            case 12:
                super.A05(r12);
                C167757yl r0 = ((C191929Fa) this.A01).A00;
                if (r12 != null) {
                    C193699Mm.A00(r0.A00, 4);
                    return;
                } else {
                    C167757yl.A01(r0);
                    return;
                }
            case 13:
                super.A05(r12);
                AnonymousClass8gK r4 = (AnonymousClass8gK) this.A00;
                AF7 af7 = r4.A05;
                C176658cT A022 = af7.A02(r12, 5);
                A022.A0O = "";
                af7.BOl(A022);
                C22967AzJ azJ = r4.A01;
                if (azJ != null) {
                    azJ.BeO((C175748az) null, r12);
                    return;
                }
                return;
            case 14:
                AnonymousClass00C.A0D(r12, 0);
                super.A05(r12);
                ((AnonymousClass9FX) this.A00).A00.A00.A0D(new C199919gG(r5, (C202059ky) null, false, false, false, false));
                return;
            default:
                super.A05(r12);
                ((C22963AzF) this.A01).Bf8(r12);
                return;
        }
    }

    public void A06(C202059ky r12) {
        C202059ky r5 = r12;
        switch (this.A02) {
            case 0:
                C36321k7.A1J(r12, "PAY: IndiaUpiBlockListManager fetch error: ", AnonymousClass000.A0u());
                ((C192639Hz) this.A01).A01.Bf8(r12);
                return;
            case 1:
                super.A06(r12);
                ((C22962AzE) this.A01).BQZ(r12);
                return;
            case 2:
            case 4:
                super.A06(r12);
                ((C22953Az5) this.A01).BeS(r12);
                return;
            case 3:
                super.A06(r12);
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((C194499Py) this.A01).A00;
                if (r12 == null) {
                    indiaUpiSendPaymentActivity.A0V.A02(indiaUpiSendPaymentActivity.A00, 2);
                }
                C178848hw.A1I(r12, indiaUpiSendPaymentActivity, true);
                return;
            case 9:
                super.A06(r12);
                ((AnonymousClass9Q2) this.A01).A00((AnonymousClass16X) null, (AnonymousClass16X) null, r12);
                return;
            case 10:
                super.A06(r12);
                A08(r12);
                B1N b1n = ((AnonymousClass8gR) this.A00).A00;
                if (b1n != null) {
                    b1n.BZk(r12, (String) null);
                    return;
                }
                return;
            case 11:
                super.A06(r12);
                ((AnonymousClass9Qx) this.A01).A00(r12, (String) null);
                return;
            case 12:
                super.A06(r12);
                C167757yl r0 = ((C191929Fa) this.A01).A00;
                if (r12 != null) {
                    C193699Mm.A00(r0.A00, 4);
                    return;
                } else {
                    C167757yl.A01(r0);
                    return;
                }
            case 13:
                super.A06(r12);
                AnonymousClass8gK r4 = (AnonymousClass8gK) this.A00;
                AF7 af7 = r4.A05;
                C176658cT A022 = af7.A02(r12, 5);
                A022.A0O = "";
                af7.BOl(A022);
                C22967AzJ azJ = r4.A01;
                if (azJ != null) {
                    azJ.BeO((C175748az) null, r12);
                    return;
                }
                return;
            case 14:
                AnonymousClass00C.A0D(r12, 0);
                super.A06(r12);
                ((AnonymousClass9FX) this.A00).A00.A00.A0D(new C199919gG(r5, (C202059ky) null, false, false, false, false));
                return;
            default:
                super.A06(r12);
                ((C22963AzF) this.A01).Bf8(r12);
                return;
        }
    }

    public void A07(C203399nx r26) {
        String str;
        Bundle bundle;
        Bundle bundle2;
        String str2;
        String str3;
        ArrayList arrayList;
        C203399nx r6 = r26;
        switch (this.A02) {
            case 0:
                C203399nx A03 = C203399nx.A03(r6);
                if (A03 != null) {
                    arrayList = AnonymousClass001.A0I();
                    C203399nx[] r5 = A03.A02;
                    if (r5 != null) {
                        for (C203399nx A0x : r5) {
                            String A0x2 = C36391kE.A0x(A0x, "vpa");
                            if (!TextUtils.isEmpty(A0x2)) {
                                arrayList.add(A0x2);
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                C192639Hz r52 = (C192639Hz) this.A01;
                C196129Xv r4 = r52.A00;
                synchronized (r4) {
                    long A002 = C19970wo.A00(r4.A02);
                    r4.A00 = A002;
                    if (arrayList != null) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        C36341k9.A1N("PAY: IndiaUpiBlockListManager fetch success size: ", A0u, arrayList);
                        A0u.append(" time: ");
                        C36351kA.A1S(A0u, r4.A00);
                        Set set = r4.A09;
                        set.clear();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            set.add(new AnonymousClass9Tt(C165577te.A0T(AnonymousClass001.A0C(it), "upiHandle"), r4));
                        }
                        r4.A08.A0L(TextUtils.join(";", arrayList));
                    } else {
                        C36321k7.A1V("PAY: IndiaUpiBlockListManager fetch success hash matched time: ", AnonymousClass000.A0u(), A002);
                    }
                    C36341k9.A0w(C90494aF.A0E(r4.A08), "payments_block_list_last_sync_time", r4.A00);
                }
                r52.A01.Bf8((C202059ky) null);
                return;
            case 1:
                super.A07(r6);
                ((C22962AzE) this.A01).BQZ((C202059ky) null);
                return;
            case 2:
            case 4:
                super.A07(r6);
                ((C22953Az5) this.A01).BeS((C202059ky) null);
                return;
            case 3:
                super.A07(r6);
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((C194499Py) this.A01).A00;
                indiaUpiSendPaymentActivity.A0V.A02(indiaUpiSendPaymentActivity.A00, 2);
                C178848hw.A1I((C202059ky) null, indiaUpiSendPaymentActivity, true);
                return;
            case 9:
                super.A07(r6);
                C203399nx A032 = C203399nx.A03(r6);
                if (A032 == null) {
                    Log.e("PAY: IndiaUpiPaymentMethodAction sendCheckPin: empty account node");
                } else {
                    C175718aw r62 = new C175718aw();
                    r62.A04(((AnonymousClass8gQ) this.A00).A03, A032, 6);
                    Bundle bundle3 = r62.A00;
                    if (!((bundle3 != null && bundle3.getString("updatedVpaFor") != null) || (bundle = r62.A00) == null || !"1".equals(bundle.getString("valid")) || (bundle2 = r62.A00) == null || bundle2.getString("balance") == null)) {
                        Bundle bundle4 = r62.A00;
                        if (bundle4 != null) {
                            str2 = bundle4.getString("balance");
                        } else {
                            str2 = null;
                        }
                        int i = ((AnonymousClass16V) AnonymousClass16W.A05).A01;
                        AnonymousClass16X A003 = AnonymousClass16X.A00(str2, i);
                        Bundle bundle5 = r62.A00;
                        if (bundle5 != null) {
                            str3 = bundle5.getString("usableBalance");
                        } else {
                            str3 = null;
                        }
                        ((AnonymousClass9Q2) this.A01).A00(A003, AnonymousClass16X.A00(str3, i), (C202059ky) null);
                        return;
                    }
                }
                ((AnonymousClass9Q2) this.A01).A00((AnonymousClass16X) null, (AnonymousClass16X) null, C202059ky.A00());
                return;
            case 10:
                super.A07(r6);
                C203399nx A033 = C203399nx.A03(r6);
                if (A033 == null) {
                    Log.w("PAY: IndiaUpiPinActions sendGetListKeys: empty account node");
                    A08((C202059ky) null);
                    B1N b1n = ((AnonymousClass8gR) this.A00).A00;
                    if (b1n != null) {
                        b1n.BZk(C202059ky.A00(), (String) null);
                        return;
                    }
                    return;
                }
                String A0i = A033.A0i("keys", (String) null);
                if (TextUtils.isEmpty(A0i)) {
                    Log.w("PAY: IndiaUpiPinActions sendGetListKeys: missing keys");
                    A08((C202059ky) null);
                    B1N b1n2 = ((AnonymousClass8gR) this.A00).A00;
                    if (b1n2 != null) {
                        b1n2.BZk(C202059ky.A00(), (String) null);
                        return;
                    }
                    return;
                }
                AnonymousClass8gR r3 = (AnonymousClass8gR) this.A00;
                r3.A03.A0J(A0i);
                r3.A05.A04((Integer) this.A01, "upi-list-keys");
                B1N b1n3 = r3.A00;
                if (b1n3 != null) {
                    b1n3.BZk((C202059ky) null, A0i);
                    return;
                }
                return;
            case 11:
                super.A07(r6);
                C203399nx A034 = C203399nx.A03(r6);
                if (A034 != null) {
                    ((AnonymousClass9Qx) this.A01).A00((C202059ky) null, A034.A0i("signed-qr-code", (String) null));
                    return;
                }
                return;
            case 12:
                super.A07(r6);
                C167757yl.A01(((C191929Fa) this.A01).A00);
                return;
            case 13:
                super.A07(r6);
                AnonymousClass8gK r53 = (AnonymousClass8gK) this.A00;
                AnonymousClass1EU r11 = r53.A04;
                C22958AzA BFB = C165587tf.A0W(r11).BFB();
                C18740tg.A06(BFB);
                ArrayList BlE = BFB.BlE(r53.A02, r6);
                ArrayList A0I = AnonymousClass001.A0I();
                Iterator it2 = BlE.iterator();
                C175848bA r21 = null;
                C175748az r32 = null;
                while (it2.hasNext()) {
                    C175848bA r63 = (C175848bA) ((C206279t0) it2.next());
                    String str4 = (String) C165577te.A0g(r63.A02);
                    C202159l8 r14 = C202159l8.A0F;
                    String str5 = r63.A06;
                    boolean z = r63.A08;
                    int A035 = C165587tf.A03(z ? 1 : 0);
                    boolean z2 = r63.A07;
                    int A036 = C165587tf.A03(z2 ? 1 : 0);
                    byte[] bArr = r63.A09;
                    C175748az r13 = new C175748az(r14, A035, A036, -1, -1);
                    r13.A0A = str5;
                    r13.A0E(str4);
                    r13.A0B = (String) C165577te.A0g(r63.A01);
                    r13.A0D = bArr;
                    r13.A08 = r63;
                    A0I.add(r13);
                    if ((str4 != null && str4.equals(C165577te.A0g(r53.A00.A02))) || (r21 == null && (z2 || z))) {
                        r32 = r13;
                        r21 = r63;
                    }
                }
                AF7 af7 = r53.A05;
                C176658cT A022 = af7.A02((C202059ky) null, 5);
                if (r32 != null) {
                    C175898bF r2 = r32.A08;
                    if (r2 instanceof C175818b6) {
                        str = ((C175818b6) r2).A0B;
                        A022.A0O = str;
                        af7.BOl(A022);
                        r11.A01().A06(new C200609hi(this.A01, r21, this, r32, 0), A0I);
                        return;
                    }
                }
                str = "";
                A022.A0O = str;
                af7.BOl(A022);
                r11.A01().A06(new C200609hi(this.A01, r21, this, r32, 0), A0I);
                return;
            case 14:
                AnonymousClass00C.A0D(r6, 0);
                super.A07(r6);
                C203399nx A0e = C90514aH.A0e(r6, (C592133b) this.A01);
                Class<String> cls = String.class;
                C203379ns.A03(r6, cls, C165567td.A0P(), C165567td.A0Q(), "update-alias", new String[]{"account", "action"}, false);
                C184828t4 r22 = (C184828t4) C203539oF.A06(r6, AKZ.A00, new String[]{"account", "alias"});
                C203539oF.A0A(A0e, r6, 29);
                AnonymousClass00C.A08(r22);
                C146356vT A004 = C146356vT.A00();
                C185018tN r23 = (C185018tN) r22.A00;
                C135086c7 A0P = C165617ti.A0P(A004, cls, r23.A03, "upiAlias");
                String str6 = r23.A02;
                AnonymousClass00C.A08(str6);
                String str7 = r23.A00;
                AnonymousClass00C.A08(str7);
                String str8 = r23.A01;
                AnonymousClass00C.A0B(str8);
                Locale locale = Locale.US;
                AnonymousClass00C.A09(locale);
                C206719tr r24 = new C206719tr(A0P, str6, str7, C36431kI.A1D(locale, str8));
                IndiaUpiNumberSettingsViewModel indiaUpiNumberSettingsViewModel = ((AnonymousClass9FX) this.A00).A00;
                indiaUpiNumberSettingsViewModel.A01.A03(r24);
                indiaUpiNumberSettingsViewModel.A00.A0D(new C199919gG((C202059ky) null, (C202059ky) null, false, false, true, false));
                return;
            default:
                super.A07(r6);
                ((C22963AzF) this.A01).Bf8((C202059ky) null);
                return;
        }
    }

    public void A08(C202059ky r4) {
        ((AnonymousClass8gR) this.A00).A05.A02.A01(r4, (Integer) this.A01, "upi-list-keys");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7M(Context context, AnonymousClass17Y r9, C29221Vu r10, AnonymousClass9YX r11, AnonymousClass8gA r12, C191929Fa r13) {
        super(context, r9, r10, r11, "upi-verify-qr-code");
        this.A02 = 12;
        this.A00 = r12;
        this.A01 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7M(Context context, AnonymousClass17Y r9, C29221Vu r10, AnonymousClass9YX r11, AnonymousClass8gA r12, AnonymousClass9Qx r13) {
        super(context, r9, r10, r11, "upi-sign-qr-code");
        this.A02 = 11;
        this.A00 = r12;
        this.A01 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7M(Context context, AnonymousClass17Y r13, C29221Vu r14, AnonymousClass9YX r15, AnonymousClass8gK r16, AF7 af7, C22975AzR azR, AnonymousClass5GM r19, String str) {
        super(context, r13, r14, r15, af7, r19, "upi-register-vpa", str, 5);
        this.A02 = 13;
        this.A00 = r16;
        this.A01 = azR;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7M(Context context, AnonymousClass17Y r9, C29221Vu r10, AnonymousClass9YX r11, AnonymousClass8gO r12, C194499Py r13) {
        super(context, r9, r10, r11, "upi-collect-from-vpa");
        this.A02 = 3;
        this.A00 = r12;
        this.A01 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7M(Context context, AnonymousClass17Y r9, C29221Vu r10, AnonymousClass9YX r11, AnonymousClass8gQ r12, AnonymousClass9Q2 r13) {
        super(context, r9, r10, r11, "upi-check-balance");
        this.A02 = 9;
        this.A00 = r12;
        this.A01 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7M(Context context, AnonymousClass17Y r11, C29221Vu r12, AnonymousClass9YX r13, AnonymousClass8gR r14, AF7 af7, Integer num) {
        super(context, r11, r12, r13, af7, "upi-list-keys", 1);
        this.A02 = 10;
        this.A00 = r14;
        this.A01 = num;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7M(Context context, AnonymousClass17Y r9, C29221Vu r10, AnonymousClass9YX r11, AnonymousClass9FX r12, C185978vD r13) {
        super(context, r9, r10, r11, "update-alias");
        this.A02 = 14;
        this.A00 = r12;
        this.A01 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7M(Context context, AnonymousClass17Y r11, C29221Vu r12, AnonymousClass9YX r13, C22962AzE azE, AnonymousClass8gO r15, AF7 af7) {
        super(context, r11, r12, r13, af7, "upi-accept-collect", 31);
        this.A02 = 1;
        this.A00 = r15;
        this.A01 = azE;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public B7M(android.content.Context r7, X.AnonymousClass17Y r8, X.C29221Vu r9, X.AnonymousClass9YX r10, X.C22963AzF r11, X.AnonymousClass8gS r12, int r13) {
        /*
            r6 = this;
            r0 = r6
            r6.A02 = r13
            switch(r13) {
                case 5: goto L_0x001a;
                case 6: goto L_0x0017;
                case 7: goto L_0x0014;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.String r5 = "upi-resume-mandate"
        L_0x0008:
            r6.A00 = r12
            r6.A01 = r11
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0014:
            java.lang.String r5 = "upi-pause-mandate"
            goto L_0x0008
        L_0x0017:
            java.lang.String r5 = "upi-revoke-mandate"
            goto L_0x0008
        L_0x001a:
            java.lang.String r5 = "upi-accept-mandate-request"
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B7M.<init>(android.content.Context, X.17Y, X.1Vu, X.9YX, X.AzF, X.8gS, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7M(Context context, AnonymousClass17Y r9, C192639Hz r10, C29221Vu r11, AnonymousClass9YX r12, AnonymousClass8gB r13) {
        super(context, r9, r11, r12, "upi-get-blocked-vpas");
        this.A02 = 0;
        this.A00 = r13;
        this.A01 = r10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7M(Context context, AnonymousClass17Y r9, C22953Az5 az5, C29221Vu r11, AnonymousClass9YX r12, AnonymousClass8gO r13) {
        super(context, r9, r11, r12, "upi-reject-collect");
        this.A02 = 2;
        this.A00 = r13;
        this.A01 = az5;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7M(Context context, AnonymousClass17Y r9, C22953Az5 az5, C29221Vu r11, AnonymousClass9YX r12, AnonymousClass8gS r13) {
        super(context, r9, r11, r12, "upi-reject-mandate-request");
        this.A02 = 4;
        this.A00 = r13;
        this.A01 = az5;
    }
}
