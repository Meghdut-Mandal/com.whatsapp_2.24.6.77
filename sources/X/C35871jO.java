package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.1jO  reason: invalid class name and case insensitive filesystem */
public class C35871jO extends C118095nK {
    public String A00;
    public String A01;

    public C35871jO(C203399nx r10, int i) {
        String[] strArr;
        long j;
        Class<String> cls;
        long j2;
        Object A03;
        C203399nx r2 = r10;
        switch (i) {
            case 0:
                C203399nx.A0A(r10, "option");
                strArr = new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME};
                cls = String.class;
                j = 1L;
                j2 = 20;
                break;
            case 1:
                C203399nx.A0A(r10, "property");
                strArr = new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME};
                cls = String.class;
                j = 1L;
                j2 = 200;
                break;
            default:
                C203399nx.A0A(r10, "promotion");
                Class<String> cls2 = String.class;
                this.A00 = (String) C203379ns.A03(r2, cls2, -9007199254740991L, 9007199254740991L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
                A03 = C203539oF.A07(r2, cls2, -9007199254740991L, 9007199254740991L, (Object) null, new String[]{"instance_id"}, false);
                break;
        }
        Long valueOf = Long.valueOf(j2);
        this.A00 = (String) C203379ns.A03(r2, cls, j, valueOf, (Object) null, strArr, false);
        A03 = C203379ns.A03(r2, cls, j, valueOf, (Object) null, new String[]{"value"}, false);
        this.A01 = (String) A03;
        this.A00 = r10;
    }
}
