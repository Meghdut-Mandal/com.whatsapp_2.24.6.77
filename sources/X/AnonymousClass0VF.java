package X;

import android.os.PersistableBundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.0VF  reason: invalid class name */
public abstract class AnonymousClass0VF {
    public static PersistableBundle A00(AnonymousClass0UW r3) {
        String str;
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = r3.A01;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        persistableBundle.putString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        persistableBundle.putString("uri", r3.A03);
        persistableBundle.putString("key", r3.A02);
        persistableBundle.putBoolean("isBot", r3.A04);
        persistableBundle.putBoolean("isImportant", r3.A05);
        return persistableBundle;
    }

    public static AnonymousClass0UW A01(PersistableBundle persistableBundle) {
        AnonymousClass0TO r1 = new AnonymousClass0TO();
        r1.A01 = persistableBundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        r1.A03 = persistableBundle.getString("uri");
        r1.A02 = persistableBundle.getString("key");
        r1.A04 = persistableBundle.getBoolean("isBot");
        r1.A05 = persistableBundle.getBoolean("isImportant");
        return new AnonymousClass0UW(r1);
    }
}
