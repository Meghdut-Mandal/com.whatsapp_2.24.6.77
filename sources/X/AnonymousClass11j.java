package X;

import android.os.Process;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.11j  reason: invalid class name */
public abstract class AnonymousClass11j {
    public static Method A00;
    public static final int[] A01 = {4096};

    static {
        try {
            A00 = Process.class.getMethod("readProcFile", new Class[]{String.class, int[].class, String[].class, long[].class, float[].class});
        } catch (Exception unused) {
            A00 = null;
            Log.e("procreader/native API inaccessible");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00() {
        /*
            java.lang.reflect.Method r6 = A00
            r5 = 0
            if (r6 == 0) goto L_0x0065
            int r2 = android.os.Process.myPid()     // Catch:{ RuntimeException -> 0x005e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x005e }
            r1.<init>()     // Catch:{ RuntimeException -> 0x005e }
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch:{ RuntimeException -> 0x005e }
            r1.append(r2)     // Catch:{ RuntimeException -> 0x005e }
            java.lang.String r0 = "/cgroup"
            r1.append(r0)     // Catch:{ RuntimeException -> 0x005e }
            java.lang.String r1 = r1.toString()     // Catch:{ RuntimeException -> 0x005e }
            r4 = 0
            java.lang.String[] r3 = new java.lang.String[]{r4}     // Catch:{ Exception -> 0x0058 }
            r0 = 5
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0058 }
            r2[r5] = r1     // Catch:{ Exception -> 0x0058 }
            int[] r1 = A01     // Catch:{ Exception -> 0x0058 }
            r0 = 1
            r2[r0] = r1     // Catch:{ Exception -> 0x0058 }
            r0 = 2
            r2[r0] = r3     // Catch:{ Exception -> 0x0058 }
            r0 = 3
            r2[r0] = r4     // Catch:{ Exception -> 0x0058 }
            r0 = 4
            r2[r0] = r4     // Catch:{ Exception -> 0x0058 }
            r6.invoke(r4, r2)     // Catch:{ Exception -> 0x0058 }
            r1 = r3[r5]     // Catch:{ Exception -> 0x0058 }
            if (r1 == 0) goto L_0x0065
            java.lang.String r0 = "/bg_non_interactive"
            boolean r0 = r1.contains(r0)     // Catch:{ RuntimeException -> 0x005e }
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = "cpuset:/"
            boolean r0 = r1.contains(r0)     // Catch:{ RuntimeException -> 0x005e }
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "cpuset:/top-app"
            boolean r0 = r1.contains(r0)     // Catch:{ RuntimeException -> 0x005e }
            if (r0 != 0) goto L_0x0065
        L_0x0056:
            r5 = 1
            return r5
        L_0x0058:
            java.lang.String r0 = "procreader/native API invoke error"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x005e }
            return r5
        L_0x005e:
            r1 = move-exception
            java.lang.String r0 = "procreader/Runtime Exception"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11j.A00():boolean");
    }
}
