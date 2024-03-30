package X;

import java.util.ArrayList;

/* renamed from: X.8sy  reason: invalid class name and case insensitive filesystem */
public final class C184768sy extends C118095nK {
    public static final ArrayList A01 = C36351kA.A10(new String[]{"CURRENT", "OD_SECURED", "OD_UNSECURED", "SAVINGS"});
    public static final ArrayList A02 = C165567td.A0e("0", "1");
    public static final ArrayList A03 = C165567td.A0e("0", "1");
    public static final ArrayList A04 = C165567td.A0e("1", "2");
    public final C184778sz A00;

    public C184768sy(C203399nx r27) {
        C203399nx r3 = r27;
        String[] A0O = C203399nx.A0O(r3, "bank");
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        C203379ns.A03(r3, cls, A0P, A0Q, "upi", A0O, false);
        Long A0Y = C90474aD.A0Y();
        Long A0a = C165577te.A0a();
        C203399nx r10 = r3;
        Class<String> cls2 = cls;
        C203539oF.A07(r10, cls2, A0Y, A0a, (Object) null, new String[]{"vpa"}, false);
        C203379ns.A03(r10, cls2, A0Y, A0a, (Object) null, new String[]{"provider"}, false);
        Long A0Z = C165577te.A0Z();
        C203399nx r15 = r3;
        Class<String> cls3 = cls;
        Long l = A0Y;
        C203539oF.A07(r15, cls3, l, A0Z, (Object) null, new String[]{"vpa-id"}, false);
        C203379ns.A03(r15, cls3, l, A0Z, (Object) null, new String[]{"account-number"}, false);
        Long A0t = C36411kG.A0t();
        C203539oF.A07(r15, cls3, A0t, A0Z, (Object) null, new String[]{"mmid"}, false);
        C203539oF.A07(r10, cls2, A0Y, A0a, (Object) null, new String[]{"account-name"}, false);
        Class<Long> cls4 = Long.class;
        C203399nx r152 = r3;
        C203379ns.A03(r152, cls4, A0t, A0Z, (Object) null, new String[]{"atm-pin-length"}, false);
        C203379ns.A03(r152, cls4, A0t, A0Z, (Object) null, new String[]{"mpin-length"}, false);
        C203379ns.A03(r152, cls4, A0t, A0Z, (Object) null, new String[]{"otp-length"}, false);
        C203399nx r19 = r3;
        Class<String> cls5 = cls;
        Long l2 = A0Y;
        C203539oF.A07(r19, cls5, l2, 3000L, (Object) null, new String[]{"image"}, false);
        C203539oF.A07(r19, cls5, l2, A0Z, (Object) null, new String[]{"bank-name"}, false);
        C203539oF.A07(r19, cls5, l2, C165587tf.A0b(), (Object) null, new String[]{"bank-phone-number"}, false);
        C203539oF.A07(r19, cls5, l2, A0Z, (Object) null, C165597tg.A1Z(), false);
        C203539oF.A07(r19, cls5, l2, A0Q, (Object) null, new String[]{"upi-bank-info"}, false);
        C203539oF.A07(r19, cls5, l2, A0Z, (Object) null, new String[]{"transaction-prefix"}, false);
        C203539oF.A07(r19, cls4, A0t, A0Q, (Object) null, new String[]{"bank-ref-id"}, false);
        C203539oF.A07(r10, cls2, A0Y, 11L, (Object) null, new String[]{"ifsc-code"}, false);
        C203539oF.A07(r10, cls2, A0Y, A0Z, (Object) null, new String[]{"account-ref-id"}, false);
        C203379ns.A0G(r3, "is-mpin-set", A03);
        C203379ns.A0G(r3, "pin-format-version", A04);
        C203539oF.A07(r3, cls, A0P, A0Q, (Object) null, new String[]{"account-type"}, false);
        C203379ns.A0H(r3, "is-aadhaar-enabled", A02);
        this.A00 = (C184778sz) C203539oF.A02(r3, C21386AJm.A00, 0);
        this.A00 = r3;
    }
}
