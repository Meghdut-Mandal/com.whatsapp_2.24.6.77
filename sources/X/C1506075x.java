package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Comparator;

/* renamed from: X.75x  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1506075x implements Comparator {
    public static final /* synthetic */ C1506075x A00 = new C1506075x();

    public final int compare(Object obj, Object obj2) {
        try {
            return ((C203399nx) obj).A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID) - ((C203399nx) obj2).A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        } catch (C235919b unused) {
            return 0;
        }
    }
}
