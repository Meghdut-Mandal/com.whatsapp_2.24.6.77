package X;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.78a  reason: invalid class name */
public final class AnonymousClass78a extends Thread {
    public final /* synthetic */ Map A00;

    public AnonymousClass78a(Map map) {
        this.A00 = map;
    }

    public final void run() {
        HttpURLConnection httpURLConnection;
        Map map = this.A00;
        Uri.Builder A0I = C90504aG.A0I("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps");
        Iterator A10 = AnonymousClass000.A10(map);
        while (A10.hasNext()) {
            String A0C = AnonymousClass001.A0C(A10);
            A0I.appendQueryParameter(A0C, C36431kI.A1A(A0C, map));
        }
        String A0b = C90474aD.A0b(A0I);
        try {
            httpURLConnection = (HttpURLConnection) C90504aG.A0r(A0b);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder A0h = C90524aI.A0h(C90474aD.A05(A0b) + 65);
                A0h.append("Received non-success response code ");
                A0h.append(responseCode);
                Log.w("HttpUrlPinger", AnonymousClass000.A0p(" from pinging URL: ", A0b, A0h));
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            StringBuilder A0i = C90464aC.A0i(message, C90474aD.A05(A0b) + 32);
            C36321k7.A1O("Error while parsing ping URL: ", A0b, ". ", message, A0i);
            Log.w("HttpUrlPinger", A0i.toString(), e);
        } catch (IOException | RuntimeException e2) {
            String message2 = e2.getMessage();
            StringBuilder A0i2 = C90464aC.A0i(message2, C90474aD.A05(A0b) + 27);
            C36321k7.A1O("Error while pinging URL: ", A0b, ". ", message2, A0i2);
            Log.w("HttpUrlPinger", A0i2.toString(), e2);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
