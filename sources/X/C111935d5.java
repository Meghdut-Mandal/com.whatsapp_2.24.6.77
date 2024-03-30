package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.5d5  reason: invalid class name and case insensitive filesystem */
public abstract class C111935d5 {
    public static final AnonymousClass6QB A00(String str, int i, boolean z) {
        String str2;
        AnonymousClass6QB A0T = C36421kH.A0T();
        AnonymousClass6QB.A01(A0T, "smax_id", i);
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        C36331k8.A1D(A0T, "xmlns", "waffle");
        if (z) {
            str2 = "get";
        } else {
            str2 = "set";
        }
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
        C36341k9.A1C(A0T);
        return A0T;
    }
}
