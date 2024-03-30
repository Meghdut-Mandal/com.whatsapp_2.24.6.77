package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.8vY  reason: invalid class name and case insensitive filesystem */
public final class C186188vY extends AnonymousClass5PS {
    public final C184318sF A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final C203399nx A05;
    public final C203399nx A06;
    public final C203399nx A07;
    public final C184838t5 A08;

    public C186188vY(C203399nx r31, C186008vG r32) {
        C203399nx r6 = r31;
        C203399nx A0e = C90514aH.A0e(r6, r32);
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        C203539oF r10 = C203379ns.A00;
        C203399nx r16 = r6;
        Class<String> cls2 = cls;
        Long l = A0P;
        Long l2 = A0Q;
        C203379ns.A03(r16, cls2, l, l2, r10.A0Z(A0e, cls, A0P, A0Q, (Object) null, new String[]{"account", "action"}, false), new String[]{"account", "action"}, true);
        Class<Long> cls3 = Long.class;
        Long A0Y = C90474aD.A0Y();
        Long l3 = A0Y;
        Long l4 = A0Q;
        C203379ns.A03(r6, cls3, l3, l4, (Object) null, new String[]{"account", "version"}, false);
        C203539oF r162 = r10;
        C203399nx r17 = r6;
        Class<String> cls4 = cls;
        this.A04 = (String) r162.A0Z(r17, cls4, A0Y, A0Q, (Object) null, new String[]{"account", "international-qr", "pay-detail"}, false);
        C203539oF.A07(r6, cls3, l3, l4, (Object) null, new String[]{"account", "international-qr", "qr-detail", "expiry-time-stamp"}, false);
        C203379ns.A03(r17, cls4, A0Y, 10000L, (Object) null, new String[]{"account", "international-qr", "qr-detail", "payload"}, false);
        this.A03 = (String) r162.A0Z(r17, cls4, A0Y, C165587tf.A0c(), (Object) null, new String[]{"account", "international-qr", "merchant-detail", "vpa"}, false);
        String[] strArr = {"account", "international-qr", "merchant-detail", PublicKeyCredentialControllerUtility.JSON_KEY_NAME};
        Long A0Z = C165577te.A0Z();
        this.A02 = (String) r162.A0Z(r17, cls4, A0Y, A0Z, (Object) null, strArr, false);
        C203539oF.A07(r17, cls4, A0Y, A0Z, (Object) null, new String[]{"account", "international-qr", "merchant-detail", "invoice-number"}, false);
        this.A01 = (String) C203539oF.A07(r6, cls, A0Y, A0Z, (Object) null, new String[]{"account", "international-qr", "merchant-detail", "mcc"}, false);
        this.A00 = (C184318sF) C203539oF.A06(r6, AS1.A00, new String[]{"account", "international-qr", "fx-detail"});
        C23214B9w b9w = new C23214B9w(A0e, 10);
        AnonymousClass00C.A0D(b9w, 1);
        this.A08 = (C184838t5) b9w.B15(r6);
        this.A07 = (C203399nx) C203539oF.A09(r6, AS2.A00, C165607th.A1b(r6, this, "account"), 1, 1).get(0);
        this.A05 = (C203399nx) C203539oF.A09(r6, AS3.A00, new String[]{"account", "international-qr", "merchant-detail"}, 1, 1).get(0);
        this.A06 = (C203399nx) C203539oF.A09(r6, AS4.A00, new String[]{"account", "international-qr", "qr-detail"}, 1, 1).get(0);
    }
}
