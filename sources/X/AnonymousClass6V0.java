package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6V0  reason: invalid class name */
public class AnonymousClass6V0 {
    public static final AnonymousClass6V0 A04 = new AnonymousClass6V0();
    public int A00 = 0;
    public final AnonymousClass6S3 A01 = new AnonymousClass6S3(this);
    public volatile long A02 = -1;
    public volatile Map A03 = AnonymousClass001.A0J();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if ((android.os.SystemClock.elapsedRealtime() - r5.A02) <= 5000) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.AnonymousClass6V0 r5, X.C125125zM r6, boolean r7) {
        /*
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x001a
            long r3 = r5.A02
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001a
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r5.A02
            long r3 = r3 - r0
            r1 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 0
            if (r0 > 0) goto L_0x0021
        L_0x001a:
            r1 = 0
            if (r7 == 0) goto L_0x0022
            boolean r0 = r6.A0L
            if (r0 != 0) goto L_0x0026
        L_0x0021:
            return r1
        L_0x0022:
            boolean r0 = r6.A0K
            if (r0 == 0) goto L_0x0021
        L_0x0026:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6V0.A00(X.6V0, X.5zM, boolean):boolean");
    }

    public static boolean A01(C125125zM r1, String str) {
        if (str.equals("meta.dav1d.av1.decoder") && r1.A08) {
            return false;
        }
        String str2 = r1.A07;
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        return str2.equals(str);
    }

    public C23079B3l A02(AnonymousClass7eI r5, C125125zM r6, String str, boolean z) {
        Set A0r;
        if (r6.A0I) {
            AnonymousClass6V0 r3 = this.A01.A02;
            if (A00(r3, r6, z) && A01(r6, str)) {
                synchronized (r3.A03) {
                    A0r = C90524aI.A0r(str, r3.A03);
                }
                if (A0r != null) {
                    synchronized (A0r) {
                        if (!A0r.isEmpty()) {
                            r3.A00--;
                            Iterator it = A0r.iterator();
                            C23079B3l b3l = (C23079B3l) it.next();
                            it.remove();
                            return b3l;
                        }
                    }
                }
            }
            try {
                if (r6.A09) {
                    return r5.B4L(str, z);
                }
                return AnonymousClass6S3.A00(str, z);
            } catch (Exception e) {
                throw new C108725Uq(str, e);
            }
        } else {
            if (A00(this, r6, z) && A01(r6, str)) {
                synchronized (this) {
                    Set A0r2 = C90524aI.A0r(str, this.A03);
                    if (A0r2 != null && !A0r2.isEmpty()) {
                        this.A00--;
                        Iterator it2 = A0r2.iterator();
                        C23079B3l b3l2 = (C23079B3l) it2.next();
                        it2.remove();
                        return b3l2;
                    }
                }
            }
            try {
                if (r6.A09) {
                    return r5.B4L(str, z);
                }
                return AnonymousClass6S3.A00(str, z);
            } catch (Exception e2) {
                throw new C108725Uq(str, e2);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0167, code lost:
        r5.A02 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x016a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x017a, code lost:
        if (r8.A0O != false) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if (r8.A0K != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        if (r4.size() < r8.A02) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c0, code lost:
        if (r1 != false) goto L_0x00c6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:128:0x0150 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x00bb */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0176 A[Catch:{ all -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bb A[SYNTHETIC, Splitter:B:66:0x00bb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C23079B3l r20, X.C125125zM r21, java.lang.Integer r22, java.lang.String r23, boolean r24) {
        /*
            r19 = this;
            r8 = r21
            boolean r0 = r8.A0I
            r5 = r19
            r6 = r20
            r9 = r23
            r10 = r24
            if (r0 == 0) goto L_0x00fd
            X.6S3 r0 = r5.A01
            X.6V0 r7 = r0.A02
            boolean r1 = A00(r7, r8, r10)
            if (r1 == 0) goto L_0x00d3
            boolean r1 = A01(r8, r9)
            if (r1 == 0) goto L_0x00d3
            boolean r1 = r8.A0J
            r11 = 1
            if (r1 == 0) goto L_0x0048
            boolean r2 = r0.A00
            if (r2 != 0) goto L_0x0048
            r0.A00 = r11
            java.util.concurrent.ScheduledExecutorService r12 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            r2 = 31
            X.75C r13 = new X.75C
            r3 = r22
            r13.<init>((java.lang.Object) r0, (java.lang.Object) r3, (int) r2)
            r14 = 5
            r3 = 1000(0x3e8, float:1.401E-42)
            int r2 = r8.A04
            int r2 = java.lang.Math.max(r3, r2)
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r18 = java.util.concurrent.TimeUnit.MILLISECONDS
            r16 = r2
            r12.scheduleAtFixedRate(r13, r14, r16, r18)
        L_0x0048:
            int r3 = r7.A00
            int r2 = r8.A03
            r5 = 0
            if (r3 >= r2) goto L_0x00d3
            java.util.Map r3 = r7.A03
            monitor-enter(r3)
            java.util.Map r2 = r7.A03     // Catch:{ all -> 0x00ca }
            java.util.Set r4 = X.C90524aI.A0r(r9, r2)     // Catch:{ all -> 0x00ca }
            if (r4 != 0) goto L_0x0063
            java.util.HashSet r4 = X.C36441kJ.A16()     // Catch:{ all -> 0x00ca }
            java.util.Map r2 = r7.A03     // Catch:{ all -> 0x00ca }
            r2.put(r9, r4)     // Catch:{ all -> 0x00ca }
        L_0x0063:
            monitor-exit(r3)     // Catch:{ all -> 0x00ca }
            monitor-enter(r4)
            boolean r2 = r4.contains(r6)     // Catch:{ all -> 0x00c7 }
            if (r2 == 0) goto L_0x006d
            r11 = 0
            goto L_0x0080
        L_0x006d:
            if (r24 == 0) goto L_0x0074
            boolean r2 = r8.A0L     // Catch:{ all -> 0x00c7 }
            if (r2 != 0) goto L_0x0078
            goto L_0x0082
        L_0x0074:
            boolean r2 = r8.A0K     // Catch:{ all -> 0x00c7 }
            if (r2 == 0) goto L_0x0082
        L_0x0078:
            int r3 = r4.size()     // Catch:{ all -> 0x00c7 }
            int r2 = r8.A02     // Catch:{ all -> 0x00c7 }
            if (r3 >= r2) goto L_0x0082
        L_0x0080:
            monitor-exit(r4)     // Catch:{ all -> 0x00c7 }
            goto L_0x0085
        L_0x0082:
            r11 = 0
            r5 = 1
            goto L_0x0080
        L_0x0085:
            if (r5 != 0) goto L_0x00d3
            if (r1 != 0) goto L_0x00aa
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x00bb, all -> 0x00a8 }
            r7.A02 = r2     // Catch:{ IllegalStateException -> 0x00bb, all -> 0x00a8 }
            r6.reset()     // Catch:{ IllegalStateException -> 0x00bb, all -> 0x00a8 }
            if (r11 == 0) goto L_0x00a3
            monitor-enter(r4)     // Catch:{ IllegalStateException -> 0x00bb, all -> 0x00a8 }
            r4.add(r6)     // Catch:{ all -> 0x00a0 }
            int r2 = r7.A00     // Catch:{ all -> 0x00a0 }
            int r2 = r2 + 1
            r7.A00 = r2     // Catch:{ all -> 0x00a0 }
            monitor-exit(r4)     // Catch:{ all -> 0x00a0 }
            goto L_0x00a3
        L_0x00a0:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a0 }
            throw r2     // Catch:{ IllegalStateException -> 0x00bb, all -> 0x00a8 }
        L_0x00a3:
            r0 = -1
            r7.A02 = r0
            return
        L_0x00a8:
            r2 = move-exception
            goto L_0x00c2
        L_0x00aa:
            r12 = 1
            X.5xX r5 = new X.5xX     // Catch:{ IllegalStateException -> 0x00bb }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IllegalStateException -> 0x00bb }
            java.util.concurrent.ConcurrentLinkedQueue r3 = r0.A01     // Catch:{ IllegalStateException -> 0x00bb }
            monitor-enter(r3)     // Catch:{ IllegalStateException -> 0x00bb }
            r3.add(r5)     // Catch:{ all -> 0x00b8 }
            monitor-exit(r3)     // Catch:{ all -> 0x00b8 }
            return
        L_0x00b8:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b8 }
            throw r2     // Catch:{ IllegalStateException -> 0x00bb }
        L_0x00bb:
            X.AnonymousClass6S3.A01(r6, r0, r9)     // Catch:{ all -> 0x00bf }
            goto L_0x00cd
        L_0x00bf:
            r2 = move-exception
            if (r1 != 0) goto L_0x00c6
        L_0x00c2:
            r0 = -1
            r7.A02 = r0
        L_0x00c6:
            throw r2
        L_0x00c7:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00c7 }
            throw r2
        L_0x00ca:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ca }
            throw r2
        L_0x00cd:
            if (r1 != 0) goto L_0x00d3
            r1 = -1
            r7.A02 = r1
        L_0x00d3:
            boolean r1 = r8.A0J
            if (r1 != 0) goto L_0x00eb
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            boolean r0 = r8.A0P     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x017c
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0183 }
            if (r0 != 0) goto L_0x017f
            boolean r0 = r8.A0O     // Catch:{ all -> 0x0183 }
            if (r0 != 0) goto L_0x017f
            goto L_0x017c
        L_0x00eb:
            r11 = 0
            X.5xX r5 = new X.5xX
            r12 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.A01
            monitor-enter(r0)
            r0.add(r5)     // Catch:{ all -> 0x00fa }
            monitor-exit(r0)     // Catch:{ all -> 0x00fa }
            return
        L_0x00fa:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00fa }
            throw r2
        L_0x00fd:
            boolean r0 = A00(r5, r8, r10)
            if (r0 == 0) goto L_0x0172
            boolean r0 = A01(r8, r9)
            if (r0 == 0) goto L_0x0172
            monitor-enter(r5)
            int r1 = r5.A00     // Catch:{ all -> 0x016f }
            int r0 = r8.A03     // Catch:{ all -> 0x016f }
            if (r1 >= r0) goto L_0x012d
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x016f }
            java.util.Set r2 = X.C90524aI.A0r(r9, r0)     // Catch:{ all -> 0x016f }
            if (r2 != 0) goto L_0x0121
            java.util.HashSet r2 = X.C36441kJ.A16()     // Catch:{ all -> 0x016f }
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x016f }
            r0.put(r9, r2)     // Catch:{ all -> 0x016f }
        L_0x0121:
            boolean r0 = r2.contains(r6)     // Catch:{ all -> 0x016f }
            if (r0 != 0) goto L_0x0144
            if (r24 == 0) goto L_0x012f
            boolean r0 = r8.A0L     // Catch:{ all -> 0x016f }
            if (r0 != 0) goto L_0x0133
        L_0x012d:
            monitor-exit(r5)     // Catch:{ all -> 0x016f }
            goto L_0x0172
        L_0x012f:
            boolean r0 = r8.A0K     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x012d
        L_0x0133:
            int r1 = r2.size()     // Catch:{ all -> 0x016f }
            int r0 = r8.A02     // Catch:{ all -> 0x016f }
            if (r1 >= r0) goto L_0x012d
            r2.add(r6)     // Catch:{ all -> 0x016f }
            int r0 = r5.A00     // Catch:{ all -> 0x016f }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x016f }
        L_0x0144:
            r1 = -1
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0150 }
            r5.A02 = r3     // Catch:{ IllegalStateException -> 0x0150 }
            r6.reset()     // Catch:{ IllegalStateException -> 0x0150 }
            goto L_0x0167
        L_0x0150:
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x016b }
            java.util.Set r0 = X.C90524aI.A0r(r9, r0)     // Catch:{ all -> 0x016b }
            if (r0 == 0) goto L_0x0164
            boolean r0 = r0.remove(r6)     // Catch:{ all -> 0x016b }
            if (r0 == 0) goto L_0x0164
            int r0 = r5.A00     // Catch:{ all -> 0x016b }
            int r0 = r0 + -1
            r5.A00 = r0     // Catch:{ all -> 0x016b }
        L_0x0164:
            r5.A02 = r1     // Catch:{ all -> 0x016f }
            goto L_0x012d
        L_0x0167:
            r5.A02 = r1     // Catch:{ all -> 0x016f }
            monitor-exit(r5)     // Catch:{ all -> 0x016f }
            return
        L_0x016b:
            r0 = move-exception
            r5.A02 = r1     // Catch:{ all -> 0x016f }
            throw r0     // Catch:{ all -> 0x016f }
        L_0x016f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x016f }
            throw r0
        L_0x0172:
            boolean r0 = r8.A0P     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x017c
            if (r24 != 0) goto L_0x017f
            boolean r0 = r8.A0O     // Catch:{ all -> 0x0183 }
            if (r0 != 0) goto L_0x017f
        L_0x017c:
            r6.stop()     // Catch:{ all -> 0x0183 }
        L_0x017f:
            r6.release()
            return
        L_0x0183:
            r0 = move-exception
            r6.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6V0.A03(X.B3l, X.5zM, java.lang.Integer, java.lang.String, boolean):void");
    }
}
