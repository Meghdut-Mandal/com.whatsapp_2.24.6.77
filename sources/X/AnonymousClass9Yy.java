package X;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Objects;

/* renamed from: X.9Yy  reason: invalid class name */
public abstract class AnonymousClass9Yy {
    public static Bundle A00(ContentResolver contentResolver, Uri uri, Bundle bundle, AnonymousClass62X r5, String str) {
        int i;
        r5.A00(uri);
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (acquireUnstableContentProviderClient != null) {
            try {
                Bundle call = acquireUnstableContentProviderClient.call(str, (String) null, bundle);
                if (i >= 24) {
                    return call;
                }
                acquireUnstableContentProviderClient.release();
                return call;
            } finally {
                if (Build.VERSION.SDK_INT >= 24) {
                    acquireUnstableContentProviderClient.close();
                    throw th;
                }
                acquireUnstableContentProviderClient.release();
            }
        } else {
            throw AnonymousClass001.A09("Failed to acquire client");
        }
    }

    public static void A01(Bundle bundle, AnonymousClass9PH r4, String str) {
        String str2;
        Objects.requireNonNull(bundle);
        Bundle bundle2 = bundle.getBundle("@exception@");
        if (bundle2 != null) {
            C197889cX A00 = r4.A00(bundle2);
            C21849AbZ abZ = new C21849AbZ(A00);
            Throwable th = A00.A02;
            if (th != null) {
                C197889cX.A00(th, abZ);
            } else {
                String str3 = A00.A01;
                if (str3 != null) {
                    th = new C21850Aba(A00, str3);
                    C197889cX.A00(th, abZ);
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Remote error code ");
                    th = new C21850Aba(A00, C36381kD.A10(A0u, A00.A00));
                    C197889cX.A00(th, abZ);
                }
            }
            String message = th.getMessage();
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Exception in provider when invoking ");
            A0u2.append(str);
            A0u2.append("(): ");
            AnonymousClass000.A1C(th, A0u2);
            if (message != null) {
                str2 = AnonymousClass000.A0p(": ", message, AnonymousClass000.A0u());
            } else {
                str2 = "";
            }
            throw new AnonymousClass91W(AnonymousClass000.A0q(str2, A0u2), th);
        }
    }
}
