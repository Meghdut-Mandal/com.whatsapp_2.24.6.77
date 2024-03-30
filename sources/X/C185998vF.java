package X;

import java.util.ArrayList;

/* renamed from: X.8vF  reason: invalid class name and case insensitive filesystem */
public final class C185998vF extends C50502l1 {
    public static final ArrayList A00 = C165567td.A0f("EXACT", "MAX", "UNKNOWN");
    public static final ArrayList A01 = C36351kA.A10(new String[]{"ASPRESENTED", "BIMONTHLY", "DAILY", "FORTNIGHTLY", "HALFYEARLY", "MONTHLY", "ONETIME", "QUARTERLY", "UNKNOWN", "WEEKLY", "YEARLY"});
    public static final ArrayList A02 = C165567td.A0e("0", "1");
    public static final ArrayList A03 = C165567td.A0e("0", "1");

    public C185998vF(C185708uf r16, C185678uc r17, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1D(A0T);
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-create-mandate");
        C203539oF.A0G(A0a, str2, false);
        String str19 = str3;
        if (C203539oF.A0P(str19, 0, 35, false)) {
            C36331k8.A1D(A0a, "seq-no", str19);
        }
        String str20 = str4;
        if (C203539oF.A0P(str20, 1, 100, false)) {
            C36331k8.A1D(A0a, "sender-vpa", str20);
        }
        String str21 = str5;
        if (C203539oF.A0P(str21, 1, 100, false)) {
            C36331k8.A1D(A0a, "receiver-vpa", str21);
        }
        String str22 = str6;
        if (C203539oF.A0U(str22, 0, false)) {
            C36331k8.A1D(A0a, "upi-bank-info", str22);
        }
        String str23 = str7;
        if (str7 != null && C203539oF.A0Q(str23, 0, true)) {
            C36331k8.A1D(A0a, "mandate-name", str23);
        }
        Long l3 = l;
        if (C203539oF.A0L(l3, 0, 9007199254740991L, false)) {
            C36411kG.A1K(A0a, "start-ts", l3.longValue());
        }
        Long l4 = l2;
        if (C203539oF.A0L(l4, 0, 9007199254740991L, false)) {
            C36411kG.A1K(A0a, "end-ts", l4.longValue());
        }
        String str24 = str8;
        if (str8 != null && C203539oF.A0P(str24, 1, 2, true)) {
            C36331k8.A1D(A0a, "recurrence-day", str24);
        }
        String str25 = str9;
        if (C203539oF.A0U(str25, 0, false)) {
            C36331k8.A1D(A0a, "mpin", str25);
        }
        String str26 = str10;
        if (C203539oF.A0P(str26, 1, 100, false)) {
            C36331k8.A1D(A0a, "receiver-name", str26);
        }
        String str27 = str11;
        if (C203539oF.A0P(str27, 1, 100, false)) {
            C36331k8.A1D(A0a, "purpose-code", str27);
        }
        String str28 = str12;
        if (C203539oF.A0P(str28, 0, 4, false)) {
            C36331k8.A1D(A0a, "mcc", str28);
        }
        String str29 = str13;
        if (str13 != null && C203539oF.A0T(str29, 1, true)) {
            C36331k8.A1D(A0a, "ref-id", str29);
        }
        String str30 = str14;
        if (str14 != null && C203539oF.A0P(str30, 1, 2, true)) {
            C36331k8.A1D(A0a, "initiation-mode", str30);
        }
        String str31 = str15;
        if (C203539oF.A0S(str31, 1, false)) {
            C36331k8.A1D(A0a, "credential-id", str31);
        }
        A0a.A09(str16, "is-revocable", A02);
        A0a.A09("1", "share-to-payee", A03);
        A0a.A09(str17, "amount-rule", A00);
        A0a.A09(str18, "frequency-rule", A01);
        C36361kB.A1H(C165577te.A0Y(r16, "amount"), A0a);
        C165577te.A1G(A0a, r17);
        C165567td.A1F(A0a, A0T, this);
    }
}
