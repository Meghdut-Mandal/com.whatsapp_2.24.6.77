package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.3dl  reason: invalid class name and case insensitive filesystem */
public final class C69583dl implements C22923AyZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C594233w A01;
    public final /* synthetic */ AnonymousClass1KH A02;

    public C69583dl(C594233w r1, AnonymousClass1KH r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public void BfK(boolean z) {
        Map A11 = C36391kE.A11(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, C36391kE.A11("success", Boolean.valueOf(z)));
        AnonymousClass1KH r4 = this.A02;
        r4.A00.Bp3(new C80513vW(this.A01, A11, r4, this.A00, 3));
    }
}
