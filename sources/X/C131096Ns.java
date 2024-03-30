package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6Ns  reason: invalid class name and case insensitive filesystem */
public class C131096Ns {
    public SharedPreferences A00;
    public final C19890wg A01;

    public static SharedPreferences A00(C131096Ns r2) {
        SharedPreferences sharedPreferences = r2.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences A002 = r2.A01.A00(C19430v1.A0A);
        r2.A00 = A002;
        return A002;
    }

    public C131096Ns(C19890wg r1) {
        this.A01 = r1;
    }

    public void A01(String str) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator A10 = AnonymousClass000.A10(A00(this).getAll());
        while (A10.hasNext()) {
            String A0C = AnonymousClass001.A0C(A10);
            if (A0C != null && (A0C.startsWith("ResumableUrl-") || A0C.startsWith(AnonymousClass000.A0p("gdrive-ResumableUrl-", str, AnonymousClass000.A0u())) || A0C.startsWith(AnonymousClass000.A0p("gbackup-ResumableUrl-", str, AnonymousClass000.A0u())))) {
                A0I.add(A0C);
            }
        }
        SharedPreferences.Editor edit = A00(this).edit();
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            edit.remove(AnonymousClass001.A0C(it));
        }
        if (!edit.commit()) {
            Log.w("gdrive-api/remove-all-resumable-uris unable to commit after cleanup to shared prefs.");
        }
    }

    public void A02(String str, String str2) {
        SharedPreferences.Editor edit = A00(this).edit();
        StringBuilder A0u = AnonymousClass000.A0u();
        C36321k7.A1O("gbackup-ResumableUrl-", str, "-", str2, A0u);
        edit.remove(A0u.toString());
        if (!edit.commit()) {
            Log.w("gdrive-api/remove-resumable-uri unable to commit resumable uri to shared prefs.");
        }
    }
}
