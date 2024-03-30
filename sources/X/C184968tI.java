package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8tI  reason: invalid class name and case insensitive filesystem */
public final class C184968tI extends C118095nK {
    public static final ArrayList A03 = C165567td.A0e("pay_on_delivery", "pix_key");
    public final C184728su A00;
    public final String A01;
    public final C184038rn A02;

    public C184968tI(C203399nx r10) {
        C203399nx r2 = r10;
        C203399nx.A0A(r10, "custom_payment_method");
        Class<String> cls = String.class;
        C203379ns.A03(r2, cls, C165567td.A0P(), C165567td.A0Q(), "BR", new String[]{"country"}, false);
        C203539oF.A07(r2, cls, C90474aD.A0Y(), C165577te.A0Z(), (Object) null, new String[]{"created"}, false);
        this.A01 = C203379ns.A08(r10, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A03);
        this.A00 = (C184728su) C203539oF.A02(r10, AJD.A00, 0);
        this.A02 = (C184038rn) C203379ns.A01(r10, AJE.A00);
        this.A00 = r10;
    }
}
