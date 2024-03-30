package X;

import com.facebook.debug.tracer.Tracer;
import com.facebook.systrace.Systrace;

public class A0X implements B5X {
    public static A0X A04;
    public C192359Gr A00;
    public C130376Kv A01;
    public String A02;
    public boolean A03;

    public void BWv(int i, int i2, String str, String str2) {
    }

    public void BhF(C23077B3i b3i, String str, long j, long j2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        com.facebook.systrace.Systrace.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bgt(X.C23077B3i r22, X.C21664AUg r23) {
        /*
            r21 = this;
            java.lang.String r0 = "CacheInstrumentationListener.onSpanAdded"
            com.facebook.debug.tracer.Tracer.A00(r0)
            r4 = r21
            X.6Kv r0 = r4.A01     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0067
            java.lang.String r8 = ""
            java.lang.String r6 = "UNKNOWN"
            X.9Gr r5 = r4.A00     // Catch:{ all -> 0x006b }
            monitor-enter(r5)     // Catch:{ all -> 0x006b }
            java.util.TreeSet r0 = r5.A01     // Catch:{ all -> 0x0064 }
            r3 = r23
            java.lang.Object r1 = r0.floor(r3)     // Catch:{ all -> 0x0064 }
            X.AUg r1 = (X.C21664AUg) r1     // Catch:{ all -> 0x0064 }
            java.util.Map r0 = r5.A00     // Catch:{ all -> 0x0064 }
            java.lang.Object r2 = r0.get(r1)     // Catch:{ all -> 0x0064 }
            X.9Gq r2 = (X.C192349Gq) r2     // Catch:{ all -> 0x0064 }
            monitor-exit(r5)     // Catch:{ all -> 0x006b }
            java.lang.String r11 = "unknown"
            if (r2 == 0) goto L_0x0040
            X.9jQ r1 = r2.A00     // Catch:{ all -> 0x006b }
            java.lang.String r5 = r1.A03     // Catch:{ all -> 0x006b }
            X.5RZ r0 = r1.A00     // Catch:{ all -> 0x006b }
            java.lang.String r6 = r0.name()     // Catch:{ all -> 0x006b }
            java.lang.String r8 = r2.A01     // Catch:{ all -> 0x006b }
            java.lang.String r10 = r1.A06     // Catch:{ all -> 0x006b }
            if (r10 != 0) goto L_0x003a
            r10 = r11
        L_0x003a:
            java.lang.String r0 = r1.A05     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0044
            r11 = r0
            goto L_0x0044
        L_0x0040:
            r5 = r11
            r10 = r11
            r1 = 0
            goto L_0x0046
        L_0x0044:
            boolean r1 = r1.A0A     // Catch:{ all -> 0x006b }
        L_0x0046:
            X.6Kv r0 = r4.A01     // Catch:{ all -> 0x006b }
            java.lang.String r4 = r4.A02     // Catch:{ all -> 0x006b }
            java.lang.String r7 = r3.A07     // Catch:{ all -> 0x006b }
            long r12 = r3.A05     // Catch:{ all -> 0x006b }
            long r14 = r3.A04     // Catch:{ all -> 0x006b }
            X.8zF r3 = X.C188228zF.SPAN_ADDED     // Catch:{ all -> 0x006b }
            r16 = 0
            r9 = 0
            X.AUS r2 = new X.AUS     // Catch:{ all -> 0x006b }
            r18 = 0
            r20 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r18, r20)     // Catch:{ all -> 0x006b }
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x006b }
            r0.add(r2)     // Catch:{ all -> 0x006b }
            goto L_0x0067
        L_0x0064:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x0067:
            com.facebook.systrace.Systrace.A00()
            return
        L_0x006b:
            r0 = move-exception
            com.facebook.systrace.Systrace.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0X.Bgt(X.B3i, X.AUg):void");
    }

    public void Bgu(C23077B3i b3i, C21664AUg aUg) {
        Tracer.A00("CacheInstrumentationListener.onSpanRemoved");
        Systrace.A00();
    }

    public void Bgv(C23077B3i b3i, C21664AUg aUg, C21664AUg aUg2, Integer num) {
        Tracer.A00("CacheInstrumentationListener.onSpanTouched");
        try {
            C130376Kv r8 = this.A01;
            if (r8 != null) {
                C21664AUg aUg3 = aUg;
                if (!(aUg == null || num == C023109s.A0G)) {
                    String str = this.A02;
                    String str2 = aUg3.A07;
                    long j = aUg3.A05;
                    long j2 = aUg3.A04;
                    C21664AUg aUg4 = aUg2;
                    long j3 = aUg4.A05;
                    long j4 = j3;
                    long j5 = j2;
                    long j6 = j;
                    r8.A01.add(new AUS(C188228zF.SPAN_TOUCHED, str, (String) null, (String) null, str2, (String) null, (String) null, "unknown", "unknown", j6, j5, j4, aUg4.A04, false));
                }
            }
        } finally {
            Systrace.A00();
        }
    }
}
