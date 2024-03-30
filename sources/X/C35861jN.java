package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.1jN  reason: invalid class name and case insensitive filesystem */
public class C35861jN extends C118095nK {
    public Object A00;
    public String A01;

    public C35861jN(C203399nx r10, int i) {
        Object A03;
        long j;
        long j2;
        String[] strArr;
        C22993Azj azj;
        C203399nx r2 = r10;
        switch (i) {
            case 0:
                C203399nx.A0A(r10, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                this.A01 = (String) C203379ns.A03(r2, String.class, 1L, 20L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "#elementValue"}, false);
                strArr = new String[]{"options", "option"};
                azj = AKO.A00;
                j2 = 1;
                j = 50;
                break;
            case 1:
                C203399nx.A0A(r10, "option");
                this.A01 = (String) C203379ns.A03(r2, String.class, 1L, 20L, (Object) null, new String[]{"value", "#elementValue"}, false);
                A03 = C203379ns.A02(r10, AKP.A00, new String[]{"thumbnail_media"});
                break;
            case 2:
                C203399nx.A0A(r10, "report");
                this.A01 = (String) C203379ns.A03(r2, String.class, -9007199254740991L, 9007199254740991L, (Object) null, new String[]{"message_id"}, false);
                strArr = new String[]{"reporter"};
                azj = AOL.A00;
                j2 = 1;
                j = 19999;
                break;
            case 3:
                C203399nx.A0A(r10, "reaction");
                this.A01 = (String) C203379ns.A03(r2, String.class, 1L, 100L, (Object) null, new String[]{"code"}, false);
                A03 = C203379ns.A03(r2, Long.class, 1L, 9007199254740991L, (Object) null, new String[]{"count"}, false);
                break;
            default:
                C203399nx.A0A(r10, "collection");
                this.A01 = (String) C203379ns.A03(r2, String.class, 1L, 1000L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME}, false);
                A03 = C203379ns.A03(r2, Long.class, 0L, 9007199254740991L, (Object) null, new String[]{"version"}, false);
                break;
        }
        AnonymousClass00C.A0D(r10, 0);
        A03 = C203539oF.A09(r2, azj, strArr, j2, j);
        this.A00 = A03;
        this.A00 = r10;
    }
}
