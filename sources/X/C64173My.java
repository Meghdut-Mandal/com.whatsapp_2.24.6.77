package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;

/* renamed from: X.3My  reason: invalid class name and case insensitive filesystem */
public class C64173My {
    public final AnonymousClass12P A00;

    public C64173My(AnonymousClass12P r1) {
        this.A00 = r1;
    }

    public static HashMap A00(C64173My r7) {
        Cursor A09;
        HashMap A0J = AnonymousClass001.A0J();
        AnonymousClass1M0 A04 = r7.A00.get();
        try {
            A09 = A04.A02.A09("SELECT seq, name FROM SQLITE_SEQUENCE", "SequencesHandler/GET_ALL_SEQUENCES", (String[]) null);
            int columnIndexOrThrow = A09.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("seq");
            while (A09.moveToNext()) {
                A0J.put(A09.getString(columnIndexOrThrow), C36361kB.A0k(A09, columnIndexOrThrow2));
            }
            A09.close();
            A04.close();
            return A0J;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
