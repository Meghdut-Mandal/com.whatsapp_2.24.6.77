package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.8vf  reason: invalid class name and case insensitive filesystem */
public class C186258vf extends AnonymousClass5PS {
    public Object A00;
    public Object A01;

    public C186258vf(C203399nx r26, C185938v9 r27) {
        C203399nx r10 = r26;
        C203399nx A0e = C90514aH.A0e(r10, r27);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        Long l = A0P;
        Long l2 = A0Q;
        C203379ns.A03(r10, cls, l, l2, "result", strArr, false);
        String[] A0l = C165617ti.A0l();
        Class<Jid> cls2 = Jid.class;
        C203539oF r2 = C203379ns.A00;
        this.A00 = r2.A0Z(r10, cls2, l, l2, r2.A0Z(A0e, cls2, A0P, A0Q, (Object) null, new String[]{"to"}, false), A0l, true);
        Class<String> cls3 = cls;
        C203379ns.A03(r10, cls3, l, l2, r2.A0Z(A0e, cls, A0P, A0Q, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, true);
        this.A01 = C203539oF.A09(r10, C21447ALv.A00, new String[]{"groups", "group"}, 1, 10000);
        this.A00 = r10;
    }

    public C186258vf(C203399nx r19, C186018vH r20, int i) {
        C203399nx r9 = r19;
        C186018vH r1 = r20;
        if (2 - i != 0) {
            C203399nx A0e = C90514aH.A0e(r9, r1);
            String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
            Class<String> cls = String.class;
            Long A0P = C165567td.A0P();
            Long A0Q = C165567td.A0Q();
            Class<String> cls2 = cls;
            Long l = A0P;
            Long l2 = A0Q;
            C203379ns.A03(r9, cls2, l, l2, "result", strArr, false);
            String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
            String[] strArr3 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
            C203539oF r12 = C203379ns.A00;
            C203379ns.A03(r9, cls2, l, l2, r12.A0Z(A0e, cls, A0P, A0Q, (Object) null, strArr3, false), strArr2, true);
            C203539oF r8 = r12;
            this.A00 = r8.A0Z(r9, Jid.class, l, l2, (Object) null, C165617ti.A0l(), false);
            this.A01 = C203539oF.A03(r9, APB.A00, "messages");
        } else {
            C203399nx A0e2 = C90514aH.A0e(r9, r1);
            String[] strArr4 = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
            Class<String> cls3 = String.class;
            Long A0P2 = C165567td.A0P();
            Long A0Q2 = C165567td.A0Q();
            Class<String> cls4 = cls3;
            Long l3 = A0P2;
            Long l4 = A0Q2;
            C203379ns.A03(r9, cls4, l3, l4, "error", strArr4, false);
            String[] strArr5 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
            String[] strArr6 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
            C203539oF r10 = C203379ns.A00;
            C203379ns.A03(r9, cls4, l3, l4, r10.A0Z(A0e2, cls3, A0P2, A0Q2, (Object) null, strArr6, false), strArr5, true);
            C203399nx r11 = r9;
            this.A01 = r10.A0Z(r11, Jid.class, A0P2, A0Q2, (Object) null, C165617ti.A0l(), false);
            this.A00 = C203539oF.A03(r9, APA.A00, "error");
        }
        this.A00 = r9;
    }

    public C186258vf(C203399nx r20, C185928v8 r21) {
        C203399nx r12 = r20;
        C203399nx A0e = C90514aH.A0e(r12, r21);
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        Class<String> cls2 = cls;
        Long l = A0P;
        Long l2 = A0Q;
        C203379ns.A03(r12, cls2, l, l2, C203379ns.A00.A0Z(A0e, cls, A0P, A0Q, (Object) null, new String[]{"account", "action"}, false), new String[]{"account", "action"}, true);
        this.A00 = C203539oF.A06(r12, AJA.A00, new String[]{"account", "custom_payment_method"});
        C23212B9u b9u = new C23212B9u(A0e, 17);
        AnonymousClass00C.A0D(b9u, 1);
        this.A01 = b9u.B15(r12);
        this.A00 = r12;
    }
}
