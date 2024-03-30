package X;

import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1QH  reason: invalid class name */
public class AnonymousClass1QH {
    public AnonymousClass191 A00;
    public ScheduledFuture A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass17Z A03;
    public final C220412q A04;
    public final AnonymousClass1A4 A05;
    public final AnonymousClass1QL A06;
    public final AnonymousClass1QM A07;
    public final AnonymousClass1QM A08;
    public final AnonymousClass16J A09;
    public final ScheduledThreadPoolExecutor A0A;

    public static synchronized void A00(AnonymousClass1QH r5, AnonymousClass1QM r6, long j, boolean z) {
        synchronized (r5) {
            long j2 = 0;
            if (j != 0) {
                AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
                j2 = Math.max(AnonymousClass6X5.A0L, j);
            }
            ScheduledFuture scheduledFuture = r5.A01;
            if (scheduledFuture != null && !scheduledFuture.isDone() && r5.A01.getDelay(TimeUnit.MILLISECONDS) > j2 && !r5.A01.cancel(false)) {
                Log.e("EphemeralUpdateManager/scheduleRunnable/unable to cancel future");
            }
            if (j2 < 86400000) {
                ScheduledFuture<?> schedule = r5.A0A.schedule(r6, j2, TimeUnit.MILLISECONDS);
                r5.A01 = schedule;
                if (z) {
                    try {
                        schedule.get();
                    } catch (InterruptedException | ExecutionException e) {
                        Log.e("EphemeralUpdateManager/scheduleNextRun", e);
                    }
                }
            }
        }
        return;
    }

    public AnonymousClass1QH(C19700wN r23, AnonymousClass16D r24, C19970wo r25, AnonymousClass17Z r26, AnonymousClass163 r27, C220412q r28, C20310xM r29, AnonymousClass17S r30, AnonymousClass1A4 r31, AnonymousClass1DQ r32, AnonymousClass1QJ r33, AnonymousClass16J r34, AnonymousClass1FN r35, AnonymousClass1QI r36, C26171Jd r37, C20170x8 r38, C20810yC r39, AnonymousClass1A1 r40, C19770wU r41) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        C19770wU r2 = r41;
        C20810yC r4 = r39;
        if (C20800yB.A01(C21000yV.A02, r4, 2335)) {
            scheduledThreadPoolExecutor = new AnonymousClass79U((C19780wV) r2, new AnonymousClass77G("ephemeral-update"), 1);
        } else {
            scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, AnonymousClass1QK.A00);
            scheduledThreadPoolExecutor.setKeepAliveTime(10, TimeUnit.MILLISECONDS);
        }
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A00 = new C36181jt(this, 0);
        AnonymousClass1A4 r11 = r31;
        this.A05 = r11;
        AnonymousClass1QL r12 = new AnonymousClass1QL(this);
        this.A06 = r12;
        this.A09 = r34;
        this.A04 = r28;
        this.A02 = r24;
        AnonymousClass1FN r15 = r35;
        AnonymousClass1QJ r14 = r33;
        AnonymousClass1DQ r13 = r32;
        AnonymousClass17S r10 = r30;
        AnonymousClass1A1 r20 = r40;
        AnonymousClass163 r8 = r27;
        C20170x8 r18 = r38;
        C19970wo r7 = r25;
        C26171Jd r17 = r37;
        AnonymousClass1QI r16 = r36;
        C19700wN r6 = r23;
        C20310xM r9 = r29;
        C20810yC r19 = r4;
        this.A07 = new AnonymousClass1QM(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, 100);
        this.A08 = new AnonymousClass1QM(r6, r7, r8, r9, r10, r11, (AnonymousClass1QL) null, r13, r14, r15, r16, r17, r18, r19, r20, 0);
        this.A03 = r26;
        this.A0A = scheduledThreadPoolExecutor;
    }

    public void A01() {
        this.A0A.execute(new C35691j6(this, 34));
    }

    public void A02(AnonymousClass11F r2, String str) {
        this.A05.A00(r2, str);
    }

    public void A03(AnonymousClass11F r5, String str) {
        AnonymousClass1A4 r3 = this.A05;
        Map map = r3.A02;
        Set set = (Set) map.get(r5);
        if (set != null) {
            set.remove(str);
            if (set.isEmpty()) {
                map.remove(r5);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("EphemeralSessionManager/null session: ");
            sb.append(r5);
            Log.e(sb.toString());
        }
        if (map.isEmpty()) {
            r3.A00 = -1;
        }
        if (r5 != null) {
            AnonymousClass3T1 A0C = r3.A01.A0C(r5);
            if (A0C == null) {
                return;
            }
            if (!A0C.A1G() && !C66013Ui.A0K(A0C.A1I)) {
                return;
            }
        }
        A01();
    }
}
