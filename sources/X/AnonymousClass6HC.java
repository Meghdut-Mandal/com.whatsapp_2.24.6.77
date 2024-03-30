package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.6HC  reason: invalid class name */
public abstract class AnonymousClass6HC {
    public static boolean A00(C20810yC r6, C21010yW r7, C21430zE r8, String str) {
        String str2;
        boolean z;
        String A09 = r6.A09(1854);
        String str3 = "";
        if (A09 != null) {
            str2 = A09.trim();
        } else {
            str2 = str3;
        }
        String A092 = r6.A09(1855);
        if (A092 != null) {
            str3 = A092.trim();
        }
        HashSet A16 = C36441kJ.A16();
        if (!TextUtils.isEmpty(str2)) {
            A16.addAll(Arrays.asList(str2.split(",")));
        }
        HashSet A162 = C36441kJ.A16();
        if (!TextUtils.isEmpty(str3)) {
            A162.addAll(Arrays.asList(str3.split(",")));
        }
        if (A16.isEmpty() && A162.isEmpty()) {
            return false;
        }
        HashSet A0k = C90524aI.A0k(A16);
        A0k.addAll(A162);
        r8.markerStart(185477621);
        r8.markerAnnotate(185477621, "categories", A0k.toString());
        r8.markerAnnotate(185477621, "checkLocation", str);
        HashMap A0J = AnonymousClass001.A0J();
        if (!A16.isEmpty()) {
            Iterator it = A16.iterator();
            z = true;
            while (it.hasNext()) {
                String A0C = AnonymousClass001.A0C(it);
                try {
                    A0J.put(A0C, Boolean.valueOf(A01(A0C)));
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    z = false;
                }
            }
            C1039057n r1 = new C1039057n();
            r1.A02 = str;
            r1.A01 = (Boolean) A0J.get("su_exists");
            r1.A00 = (Boolean) A0J.get("rw_paths");
            r7.Bly(r1);
        } else {
            z = true;
        }
        Iterator it2 = A162.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            String A0C2 = AnonymousClass001.A0C(it2);
            if (!A0J.containsKey(A0C2) || !Boolean.TRUE.equals(A0J.get(A0C2))) {
                try {
                    if (A01(A0C2)) {
                    }
                } catch (Exception e2) {
                    Log.e((Throwable) e2);
                    z = false;
                }
            }
            z2 = true;
        }
        short s = 576;
        if (z) {
            s = 575;
        }
        r8.markerEnd(185477621, s);
        return z2;
    }

    public static boolean A01(String str) {
        BufferedReader bufferedReader;
        if (str.equals("rw_paths")) {
            return AnonymousClass6IU.A00();
        }
        if (str.equals("su_exists")) {
            Process process = null;
            try {
                Process exec = Runtime.getRuntime().exec(new String[]{"which", "su"});
                if (exec == null) {
                    return false;
                }
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(exec.getInputStream());
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader);
                        boolean A1V = AnonymousClass000.A1V(bufferedReader.readLine());
                        bufferedReader.close();
                        inputStreamReader.close();
                        exec.destroy();
                        return A1V;
                    } catch (Throwable th) {
                        inputStreamReader.close();
                        throw th;
                    }
                } catch (Exception unused) {
                    exec.destroy();
                    return false;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } catch (Throwable unused2) {
                if (process == null) {
                    return false;
                }
                process.destroy();
                return false;
            }
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unknown check category: ");
            throw AnonymousClass000.A0c(str, A0u);
        }
        throw th;
    }
}
