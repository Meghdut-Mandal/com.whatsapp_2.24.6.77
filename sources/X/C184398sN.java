package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8sN  reason: invalid class name and case insensitive filesystem */
public final class C184398sN extends C118095nK {
    public final C184078rr A00;
    public final C184078rr A01;
    public final B07 A02;
    public final Long A03;
    public final Long A04;
    public final String A05;
    public final String A06;

    public C184398sN(C203399nx r20) {
        Object obj;
        C203399nx r5 = r20;
        C203399nx.A09(r5);
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        C203399nx r12 = r5;
        this.A06 = (String) C203539oF.A07(r12, cls, A0P, A0Q, "true", new String[]{"is_sender"}, false);
        this.A05 = (String) C203539oF.A07(r12, cls, A0P, A0Q, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        Class<Long> cls2 = Long.class;
        C203539oF r4 = C203379ns.A00;
        this.A03 = (Long) r4.A0Z(r5, cls2, 99L, 2147476647L, (Object) null, new String[]{"server_id"}, false);
        Class<Long> cls3 = cls2;
        this.A04 = (Long) C203539oF.A07(r12, cls3, C36411kG.A0t(), A0Q, (Object) null, new String[]{"t"}, false);
        this.A01 = (C184078rr) C203379ns.A01(r5, APZ.A00);
        this.A00 = (C184078rr) C203379ns.A01(r5, C21530APa.A00);
        C22993Azj[] azjArr = new C22993Azj[5];
        azjArr[0] = C21531APb.A00;
        azjArr[1] = C21532APc.A00;
        azjArr[2] = C21533APd.A00;
        azjArr[3] = C21534APe.A00;
        ArrayList A0d = C165567td.A0d(C21535APf.A00, azjArr, 4);
        String[] strArr = new String[0];
        AnonymousClass00C.A0D(r5, 0);
        try {
            obj = r4.A0a(r5, "NewsletterEdit|NewsletterText|NewsletterMedia|NewsletterRevoke|NewsletterPollCreation", A0d, strArr);
        } catch (C235919b unused) {
            obj = null;
        }
        this.A02 = (B07) obj;
        this.A00 = r5;
    }
}
