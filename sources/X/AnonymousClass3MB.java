package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3MB  reason: invalid class name */
public final class AnonymousClass3MB {
    public static final AnonymousClass1AL[] A00(String str, String str2) {
        String str3;
        AnonymousClass1AL r6 = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        if ("stickers".equals(str)) {
            str3 = "contact_allowlist";
        } else {
            str3 = "contact_blacklist";
        }
        AnonymousClass1AL r5 = new AnonymousClass1AL("value", str3);
        if (str2 == null) {
            return new AnonymousClass1AL[]{r6, r5};
        }
        AnonymousClass1AL[] r1 = new AnonymousClass1AL[3];
        r1[0] = r6;
        r1[1] = r5;
        C36341k9.A1L("dhash", str2, r1, 2);
        return r1;
    }
}
