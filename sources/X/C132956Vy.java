package X;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.6Vy  reason: invalid class name and case insensitive filesystem */
public class C132956Vy {
    public static Context A00;
    public static JSONObject A01 = C36441kJ.A1B();
    public static boolean A02;
    public static boolean A03;

    public static synchronized JSONObject A00() {
        JSONObject jSONObject;
        synchronized (C132956Vy.class) {
            jSONObject = A01;
            jSONObject.length();
        }
        return jSONObject;
    }

    public static void A01() {
        String str;
        A00();
        if (A00().has("systemproperties")) {
            try {
                JSONObject jSONObject = A00().getJSONObject("systemproperties");
                Log.w("EndToEnd-Test", AnonymousClass000.A0l(jSONObject, "Setting E2E system properties: ", AnonymousClass000.A0u()));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String A0C = AnonymousClass001.A0C(keys);
                    if (jSONObject.isNull(A0C)) {
                        str = null;
                    } else {
                        str = jSONObject.getString(A0C);
                    }
                    System.setProperty(A0C, str);
                }
            } catch (Exception e) {
                Log.e("EndToEnd-Test", "Failed to set E2E system properties", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if ("true".equals(java.lang.System.getProperty("fb.running_e2e")) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean A02() {
        /*
            java.lang.Class<X.6Vy> r4 = X.C132956Vy.class
            monitor-enter(r4)
            A00()     // Catch:{ all -> 0x0036 }
            boolean r0 = A02     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0032
            java.lang.String r3 = "true"
            java.lang.String r1 = "fb.running_e2e"
            java.lang.String r0 = X.C21760zl.A02(r1)     // Catch:{ all -> 0x0036 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0036 }
            r2 = 1
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = java.lang.System.getProperty(r1)     // Catch:{ all -> 0x0036 }
            boolean r1 = r3.equals(r0)     // Catch:{ all -> 0x0036 }
            r0 = 0
            if (r1 == 0) goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            A03 = r0     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = "EndToEnd-Test"
            java.lang.String r0 = "Is running E2E test"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0036 }
        L_0x0030:
            A02 = r2     // Catch:{ all -> 0x0036 }
        L_0x0032:
            boolean r0 = A03     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)
            return r0
        L_0x0036:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132956Vy.A02():boolean");
    }
}
