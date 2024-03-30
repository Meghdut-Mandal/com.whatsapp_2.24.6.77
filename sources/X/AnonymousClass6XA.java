package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6XA  reason: invalid class name */
public abstract class AnonymousClass6XA {
    public static Uri.Builder A00(C20810yC r2, C24121Be r3, String str) {
        Uri.Builder A0I;
        if (r2.A0E(2713)) {
            Uri.Builder scheme = new Uri.Builder().scheme("https");
            C24121Be.A00(r3);
            A0I = scheme.encodedAuthority(r3.A00);
        } else {
            A0I = C90504aG.A0I("https://static.whatsapp.net");
        }
        return A0I.path(str);
    }

    public static Uri A01(C19630wG r3, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(C90514aH.A0j(r3));
        A0u.append("/");
        AnonymousClass000.A1D("NetworkResource", "/", str, A0u);
        File A0S = C90524aI.A0S(A0u.toString());
        if (!A0S.exists()) {
            return null;
        }
        return Uri.fromFile(A0S);
    }

    public static FileInputStream A02(C19630wG r3, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(C90514aH.A0j(r3));
        A0u.append("/");
        AnonymousClass000.A1D("NetworkResource", "/", str, A0u);
        File A0S = C90524aI.A0S(A0u.toString());
        if (!A0S.exists()) {
            C36321k7.A1P("DownloadableUtils/getInputStream: file-missing: ", str, AnonymousClass000.A0u());
            return null;
        }
        try {
            return C90524aI.A0U(A0S);
        } catch (FileNotFoundException e) {
            Log.e("DownloadableUtils/unexpected/getInputStream: file-missing", e);
            return null;
        }
    }

    public static String A03(Uri.Builder builder, Map map) {
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            builder.appendQueryParameter(C90494aF.A0f(A11), C90514aH.A10(A11));
        }
        return C90474aD.A0b(builder);
    }

    public static void A04(String str) {
        C36321k7.A1P("DownloadableUtils/reportCriticalEventIfBeta", str, AnonymousClass000.A0u());
    }

    public static boolean A05(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '-' && c != '_') {
                return false;
            }
        }
        return true;
    }
}
