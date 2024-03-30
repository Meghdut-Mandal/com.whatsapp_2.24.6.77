package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6im  reason: invalid class name and case insensitive filesystem */
public class C138836im implements AnonymousClass7e8, C157137bt {
    public static final String A0C = AnonymousClass6VD.A01("Processor");
    public Context A00;
    public PowerManager.WakeLock A01;
    public WorkDatabase A02;
    public AnonymousClass7eB A03;
    public Map A04 = AnonymousClass001.A0J();
    public Map A05 = AnonymousClass001.A0J();
    public Map A06;
    public Set A07;
    public C18850tv A08;
    public List A09;
    public final Object A0A;
    public final List A0B;

    public static void A00(C138836im r4) {
        synchronized (r4.A0A) {
            if (!(!r4.A05.isEmpty())) {
                Context context = r4.A00;
                Intent A0H = C36441kJ.A0H(context, SystemForegroundService.class);
                A0H.setAction("ACTION_STOP_FOREGROUND");
                try {
                    context.startService(A0H);
                } catch (Throwable th) {
                    AnonymousClass6VD.A00();
                    Log.e(A0C, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = r4.A01;
                if (wakeLock != null) {
                    wakeLock.release();
                    r4.A01 = null;
                }
            }
        }
    }

    public static boolean A01(AnonymousClass758 r3, String str) {
        if (r3 != null) {
            r3.A0H = true;
            AnonymousClass758.A02(r3);
            C97484pl r1 = r3.A0F;
            r1.cancel(true);
            if (r3.A03 == null || !r1.isCancelled()) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("WorkSpec ");
                A0u.append(r3.A08);
                AnonymousClass6VD.A00().A04(AnonymousClass758.A0I, AnonymousClass000.A0q(" is already done. Not interrupting.", A0u));
            } else {
                C128916Ec r12 = r3.A03;
                r12.A03 = true;
                r12.A07();
            }
            AnonymousClass6VD A002 = AnonymousClass6VD.A00();
            String str2 = A0C;
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("WorkerWrapper interrupted for ");
            AnonymousClass6VD.A03(A002, str, str2, A0u2);
            return true;
        }
        AnonymousClass6VD A003 = AnonymousClass6VD.A00();
        String str3 = A0C;
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("WorkerWrapper could not be found for ");
        AnonymousClass6VD.A03(A003, str, str3, A0u3);
        return false;
    }

    public void A02(AnonymousClass7e8 r3) {
        synchronized (this.A0A) {
            this.A0B.add(r3);
        }
    }

    public void A03(AnonymousClass7e8 r3) {
        synchronized (this.A0A) {
            this.A0B.remove(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C120755s1 r14, X.C114465hI r15) {
        /*
            r13 = this;
            X.69L r4 = r15.A00
            java.lang.String r3 = r4.A01
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            r9 = r13
            androidx.work.impl.WorkDatabase r8 = r13.A02
            r5 = 0
            X.7qj r0 = new X.7qj
            r0.<init>(r13, r12, r3, r5)
            java.lang.Object r10 = r8.A03(r0)
            X.6QA r10 = (X.AnonymousClass6QA) r10
            if (r10 != 0) goto L_0x003a
            X.AnonymousClass6VD.A00()
            java.lang.String r2 = A0C
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Didn't find WorkSpec for id "
            java.lang.String r0 = X.AnonymousClass000.A0l(r4, r0, r1)
            android.util.Log.w(r2, r0)
            X.7eB r0 = r13.A03
            X.6iy r0 = (X.C138956iy) r0
            java.util.concurrent.Executor r1 = r0.A02
            X.75C r0 = new X.75C
            r0.<init>((X.C138836im) r13, (X.AnonymousClass69L) r4)
            r1.execute(r0)
            return r5
        L_0x003a:
            java.lang.Object r2 = r13.A0A
            monitor-enter(r2)
            boolean r0 = r13.A05(r3)     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x0077
            java.util.Map r0 = r13.A06     // Catch:{ all -> 0x00e0 }
            java.util.Set r3 = X.C90524aI.A0r(r3, r0)     // Catch:{ all -> 0x00e0 }
            java.util.Iterator r0 = r3.iterator()     // Catch:{ all -> 0x00e0 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x00e0 }
            X.5hI r0 = (X.C114465hI) r0     // Catch:{ all -> 0x00e0 }
            X.69L r0 = r0.A00     // Catch:{ all -> 0x00e0 }
            int r1 = r0.A00     // Catch:{ all -> 0x00e0 }
            int r0 = r4.A00     // Catch:{ all -> 0x00e0 }
            if (r1 != r0) goto L_0x008d
            r3.add(r15)     // Catch:{ all -> 0x00e0 }
            X.6VD r6 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x00e0 }
            java.lang.String r3 = A0C     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "Work "
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            r1.append(r4)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = " is already enqueued for processing"
            X.AnonymousClass6VD.A03(r6, r0, r3, r1)     // Catch:{ all -> 0x00e0 }
        L_0x0075:
            monitor-exit(r2)     // Catch:{ all -> 0x00e0 }
            goto L_0x009c
        L_0x0077:
            int r1 = r10.A0I     // Catch:{ all -> 0x00e0 }
            int r0 = r4.A00     // Catch:{ all -> 0x00e0 }
            if (r1 != r0) goto L_0x008d
            android.content.Context r6 = r13.A00     // Catch:{ all -> 0x00e0 }
            X.0tv r7 = r13.A08     // Catch:{ all -> 0x00e0 }
            X.7eB r11 = r13.A03     // Catch:{ all -> 0x00e0 }
            X.5yI r5 = new X.5yI     // Catch:{ all -> 0x00e0 }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00e0 }
            java.util.List r0 = r13.A09     // Catch:{ all -> 0x00e0 }
            r5.A07 = r0     // Catch:{ all -> 0x00e0 }
            goto L_0x009d
        L_0x008d:
            X.7eB r0 = r13.A03     // Catch:{ all -> 0x00e0 }
            X.6iy r0 = (X.C138956iy) r0     // Catch:{ all -> 0x00e0 }
            java.util.concurrent.Executor r1 = r0.A02     // Catch:{ all -> 0x00e0 }
            X.75C r0 = new X.75C     // Catch:{ all -> 0x00e0 }
            r0.<init>((X.C138836im) r13, (X.AnonymousClass69L) r4)     // Catch:{ all -> 0x00e0 }
            r1.execute(r0)     // Catch:{ all -> 0x00e0 }
            goto L_0x0075
        L_0x009c:
            return r5
        L_0x009d:
            if (r14 == 0) goto L_0x00a1
            r5.A06 = r14     // Catch:{ all -> 0x00e0 }
        L_0x00a1:
            X.758 r6 = new X.758     // Catch:{ all -> 0x00e0 }
            r6.<init>(r5)     // Catch:{ all -> 0x00e0 }
            X.4pl r5 = r6.A0A     // Catch:{ all -> 0x00e0 }
            r0 = 3
            X.74w r1 = new X.74w     // Catch:{ all -> 0x00e0 }
            r1.<init>(r13, r5, r4, r0)     // Catch:{ all -> 0x00e0 }
            X.6iy r11 = (X.C138956iy) r11     // Catch:{ all -> 0x00e0 }
            java.util.concurrent.Executor r0 = r11.A02     // Catch:{ all -> 0x00e0 }
            r5.B0P(r1, r0)     // Catch:{ all -> 0x00e0 }
            java.util.Map r0 = r13.A04     // Catch:{ all -> 0x00e0 }
            r0.put(r3, r6)     // Catch:{ all -> 0x00e0 }
            java.util.HashSet r1 = X.C36441kJ.A16()     // Catch:{ all -> 0x00e0 }
            r1.add(r15)     // Catch:{ all -> 0x00e0 }
            java.util.Map r0 = r13.A06     // Catch:{ all -> 0x00e0 }
            r0.put(r3, r1)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r2)     // Catch:{ all -> 0x00e0 }
            X.772 r0 = r11.A01
            r0.execute(r6)
            X.6VD r3 = X.AnonymousClass6VD.A00()
            java.lang.String r2 = A0C
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            X.AnonymousClass000.A1C(r13, r1)
            java.lang.String r0 = ": processing "
            X.AnonymousClass6VD.A02(r3, r4, r0, r2, r1)
            r0 = 1
            return r0
        L_0x00e0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138836im.A04(X.5s1, X.5hI):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r3.A05.containsKey(r4) != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A0A
            monitor-enter(r2)
            java.util.Map r0 = r3.A04     // Catch:{ all -> 0x0017 }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0014
            java.util.Map r0 = r3.A05     // Catch:{ all -> 0x0017 }
            boolean r1 = r0.containsKey(r4)     // Catch:{ all -> 0x0017 }
            r0 = 0
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138836im.A05(java.lang.String):boolean");
    }

    public void BX7(AnonymousClass69L r7, boolean z) {
        synchronized (this.A0A) {
            Map map = this.A04;
            String str = r7.A01;
            AnonymousClass758 r0 = (AnonymousClass758) map.get(str);
            if (r0 != null && r7.equals(C109445Xp.A00(r0.A08))) {
                map.remove(str);
            }
            AnonymousClass6VD A002 = AnonymousClass6VD.A00();
            String str2 = A0C;
            StringBuilder A0u = AnonymousClass000.A0u();
            AnonymousClass000.A1C(this, A0u);
            C36421kH.A1N(A0u);
            A0u.append(str);
            A002.A04(str2, C36371kC.A0z(" executed; reschedule = ", A0u, z));
            for (AnonymousClass7e8 BX7 : this.A0B) {
                BX7.BX7(r7, z);
            }
        }
    }

    public C138836im(Context context, C18850tv r3, WorkDatabase workDatabase, AnonymousClass7eB r5, List list) {
        this.A00 = context;
        this.A08 = r3;
        this.A03 = r5;
        this.A02 = workDatabase;
        this.A09 = list;
        this.A07 = C36441kJ.A16();
        this.A0B = AnonymousClass001.A0I();
        this.A01 = null;
        this.A0A = C36441kJ.A11();
        this.A06 = AnonymousClass001.A0J();
    }
}
