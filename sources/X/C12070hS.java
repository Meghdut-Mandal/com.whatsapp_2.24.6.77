package X;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: X.0hS  reason: invalid class name and case insensitive filesystem */
public final class C12070hS implements Runnable {
    public static final AnonymousClass0UT A02 = new AnonymousClass0UT("RevokeAccessOperation", new String[0]);
    public final AnonymousClass0JQ A00 = new AnonymousClass0JQ((AnonymousClass0XK) null);
    public final String A01;

    public final void run() {
        AnonymousClass0UT r3;
        String str;
        String str2;
        Status status = Status.A07;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(AnonymousClass000.A0p("https://accounts.google.com/o/oauth2/revoke?token=", this.A01, AnonymousClass000.A0u())).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.A09;
            } else {
                Log.e("RevokeAccessOperation", A02.A01.concat("Unable to revoke access!"));
            }
            A02.A00(AnonymousClass000.A0r("Response Code: ", AnonymousClass000.A0u(), responseCode));
        } catch (IOException e) {
            r3 = A02;
            str = String.valueOf(e.toString());
            str2 = "IOException when revoking access: ";
            Log.e("RevokeAccessOperation", r3.A01.concat(str2.concat(str)));
            this.A00.A06(status);
        } catch (Exception e2) {
            r3 = A02;
            str = String.valueOf(e2.toString());
            str2 = "Exception when revoking access: ";
            Log.e("RevokeAccessOperation", r3.A01.concat(str2.concat(str)));
            this.A00.A06(status);
        }
        this.A00.A06(status);
    }

    public C12070hS(String str) {
        AnonymousClass006.A03(str);
        this.A01 = str;
    }
}
