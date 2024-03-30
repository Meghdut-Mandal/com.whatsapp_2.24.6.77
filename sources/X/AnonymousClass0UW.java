package X;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.0UW  reason: invalid class name */
public class AnonymousClass0UW {
    public IconCompat A00;
    public CharSequence A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    public AnonymousClass0UW(AnonymousClass0TO r2) {
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A03 = r2.A03;
        this.A02 = r2.A02;
        this.A04 = r2.A04;
        this.A05 = r2.A05;
    }

    public Person A00() {
        return C05260Pa.A00(this);
    }

    public Bundle A01() {
        Bundle bundle;
        Bundle A07 = AnonymousClass001.A07();
        A07.putCharSequence(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A01);
        IconCompat iconCompat = this.A00;
        if (iconCompat != null) {
            bundle = iconCompat.A0B();
        } else {
            bundle = null;
        }
        A07.putBundle(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, bundle);
        A07.putString("uri", this.A03);
        A07.putString("key", this.A02);
        A07.putBoolean("isBot", this.A04);
        A07.putBoolean("isImportant", this.A05);
        return A07;
    }
}
