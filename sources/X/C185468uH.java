package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8uH  reason: invalid class name and case insensitive filesystem */
public final class C185468uH extends C118095nK implements C22840Awp {
    public static final ArrayList A03 = C165567td.A0e("image", "preview");
    public final String A00;
    public final String A01;
    public final String A02;

    public C185468uH(C203399nx r11) {
        C203399nx r3 = r11;
        String[] A0M = C203399nx.A0M(r11, "picture");
        Class<String> cls = String.class;
        Long A0Y = C90474aD.A0Y();
        Long A0e = C165597tg.A0e();
        C203539oF r2 = C203379ns.A00;
        this.A01 = (String) r2.A0Z(r3, cls, A0Y, A0e, (Object) null, A0M, false);
        this.A00 = (String) r2.A0Z(r3, cls, C36411kG.A0t(), 4096L, (Object) null, new String[]{"direct_path"}, false);
        this.A02 = C203379ns.A08(r11, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A03);
        this.A00 = r11;
    }
}
