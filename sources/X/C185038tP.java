package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8tP  reason: invalid class name and case insensitive filesystem */
public final class C185038tP extends C118095nK {
    public static final ArrayList A06 = C165567td.A0f("email", "pn", "username");
    public static final ArrayList A07 = C165567td.A0f("active", "onboarding", "removed");
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C185038tP(C203399nx r22) {
        C203399nx r3 = r22;
        C203399nx.A0A(r3, "integrator");
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        this.A04 = (String) C203539oF.A07(r3, cls, A0P, A0Q, "true", new String[]{"opted_in"}, false);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Long A0Y = C90474aD.A0Y();
        C203539oF r2 = C203379ns.A00;
        this.A00 = (Long) r2.A0Z(r3, Long.class, A0Y, 999L, (Object) null, strArr, false);
        C203539oF r8 = r2;
        C203399nx r9 = r3;
        Long l = A0Y;
        this.A03 = (String) r8.A0Z(r9, cls, l, C165577te.A0Z(), (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME}, false);
        this.A01 = (String) r2.A0Z(r3, cls, A0P, A0Q, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ICON}, false);
        this.A05 = C203379ns.A08(r3, "status", A07);
        this.A02 = C203379ns.A09(r3, A06, new String[]{"identifier_type"});
        this.A00 = r3;
    }
}
