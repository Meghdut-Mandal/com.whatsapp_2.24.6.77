package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6I1  reason: invalid class name */
public abstract class AnonymousClass6I1 {
    public static final String A00;

    public static final boolean A00(Context context, C18850tv r7) {
        String str;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        boolean A1a = C36341k9.A1a(context, r7);
        if (Build.VERSION.SDK_INT >= 28) {
            str = C109455Xq.A00();
        } else {
            String str2 = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, AnonymousClass6VR.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(A1a);
                Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
                AnonymousClass00C.A0B(invoke);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                AnonymousClass6VD A002 = AnonymousClass6VD.A00();
                String str3 = A00;
                if (A002.A00 <= 3) {
                    Log.d(str3, "Unable to check ActivityThread for processName", th);
                }
            }
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        runningAppProcessInfo = null;
                        break;
                    }
                    runningAppProcessInfo = it.next();
                    if (runningAppProcessInfo.pid == myPid) {
                        break;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = runningAppProcessInfo;
                if (runningAppProcessInfo2 != null) {
                    str2 = runningAppProcessInfo2.processName;
                }
            }
            str = str2;
        }
        return AnonymousClass00C.A0J(str, context.getApplicationInfo().processName);
    }

    static {
        String A01 = AnonymousClass6VD.A01("ProcessUtils");
        AnonymousClass00C.A08(A01);
        A00 = A01;
    }
}
