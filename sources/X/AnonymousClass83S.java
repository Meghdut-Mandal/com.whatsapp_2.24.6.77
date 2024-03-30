package X;

import android.util.Log;

/* renamed from: X.83S  reason: invalid class name */
public class AnonymousClass83S extends C21780zn {
    public final ThreadLocal A00 = new ThreadLocal();
    public final ThreadLocal A01 = new ThreadLocal();

    public /* bridge */ /* synthetic */ AnonymousClass103 A01() {
        return new AnonymousClass83O();
    }

    public /* bridge */ /* synthetic */ boolean A02(AnonymousClass103 r7) {
        AnonymousClass83O r72 = (AnonymousClass83O) r7;
        if (r72 != null) {
            try {
                ThreadLocal threadLocal = this.A01;
                AnonymousClass105 r2 = (AnonymousClass105) threadLocal.get();
                if (r2 == null) {
                    r2 = new AnonymousClass105("/proc/self/stat");
                    threadLocal.set(r2);
                }
                r2.A04();
                if (!r2.A02) {
                    return false;
                }
                int i = 0;
                do {
                    r2.A06();
                    i++;
                } while (i < 13);
                r72.userTimeS = A00(r2);
                r72.systemTimeS = A00(r2);
                r72.childUserTimeS = A00(r2);
                r72.childSystemTimeS = A00(r2);
                ThreadLocal threadLocal2 = this.A00;
                if (threadLocal2.get() == null) {
                    threadLocal2.set(new AnonymousClass83O());
                }
                AnonymousClass83O r4 = (AnonymousClass83O) threadLocal2.get();
                if (Double.compare(r72.userTimeS, r4.userTimeS) < 0 || Double.compare(r72.systemTimeS, r4.systemTimeS) < 0 || Double.compare(r72.childUserTimeS, r4.childUserTimeS) < 0 || Double.compare(r72.childSystemTimeS, r4.childSystemTimeS) < 0) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Cpu Time Decreased from ");
                    A0u.append(r4);
                    Log.e("CpuMetricsCollector", AnonymousClass000.A0l(r72, " to ", A0u), (Throwable) null);
                    return false;
                }
                r4.A03(r72);
                return true;
            } catch (C21800zp e) {
                Log.e("CpuMetricsCollector", "Unable to parse CPU time field", e);
                return false;
            }
        } else {
            throw AnonymousClass001.A08("Null value passed to getSnapshot!");
        }
    }

    public static double A00(AnonymousClass105 r6) {
        double A02 = (((double) r6.A02()) * 1.0d) / ((double) C1903898e.A00);
        r6.A06();
        return A02;
    }
}
