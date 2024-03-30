package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.8ti  reason: invalid class name and case insensitive filesystem */
public final class C185168ti extends C118095nK implements C22836Awl {
    public final C184348sI A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C185168ti(C203399nx r18) {
        C203399nx r3 = r18;
        String[] A0O = C203399nx.A0O(r3, "state");
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        C203379ns.A03(r3, cls, A0P, A0Q, "resource", A0O, false);
        this.A02 = (String) C203379ns.A00.A0Z(r3, cls, A0P, A0Q, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        Long A0t = C36411kG.A0t();
        C203399nx r10 = r3;
        Class<String> cls2 = cls;
        this.A05 = (String) C203539oF.A07(r10, cls2, A0t, 10000L, (Object) null, new String[]{"parameters"}, false);
        this.A03 = (String) C203539oF.A07(r3, cls, A0P, A0Q, (Object) null, new String[]{"merge"}, false);
        this.A04 = (String) C203539oF.A07(r10, cls2, A0t, 10000L, (Object) null, new String[]{"merge_param"}, false);
        this.A01 = (String) C203539oF.A07(r3, cls, A0P, A0Q, (Object) null, new String[]{"catch"}, false);
        this.A00 = (C184348sI) C203539oF.A02(r3, AL2.A00, 0);
        this.A00 = r3;
    }
}
