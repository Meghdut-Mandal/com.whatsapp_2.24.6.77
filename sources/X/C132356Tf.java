package X;

import android.os.Handler;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.6Tf  reason: invalid class name and case insensitive filesystem */
public class C132356Tf {
    public boolean A00;
    public final long A01;
    public final C19700wN A02;
    public final AnonymousClass12P A03;
    public final List A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final C1497472p A08;
    public final C29301Wc A09;
    public final C19970wo A0A;
    public final C20810yC A0B;
    public final C19770wU A0C;
    public final Runnable A0D;

    public void A01() {
        synchronized (this) {
            if (!this.A04.isEmpty() || !this.A05.isEmpty()) {
                this.A00 = false;
                Iterator A0y = AnonymousClass000.A0y(this.A05);
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    Handler handler = (Handler) A11.getKey();
                    this.A06.put(handler, C36371kC.A0m());
                    handler.postAtFrontOfQueue((Runnable) A11.getValue());
                }
                this.A0C.BpM(this.A08, "StuckDbHandlerThreadDetector/monitor", this.A01);
            }
        }
    }

    public void A02(Handler handler) {
        synchronized (this) {
            this.A05.put(handler, new C81203wd(handler, this, 47));
        }
    }

    public void A03(String str, ThreadPoolExecutor threadPoolExecutor) {
        synchronized (this) {
            this.A04.add(new C122835vV(str, threadPoolExecutor));
        }
    }

    public static void A00(C132356Tf r12, String str) {
        Runnable runnable;
        C29301Wc r2 = r12.A09;
        boolean z = false;
        if (r2 != null) {
            AnonymousClass1Q9 r0 = C29301Wc.A00(r2).A09;
            boolean A1U = C90494aF.A1U(r0.A03, Boolean.TRUE);
            long j = r12.A01;
            if (System.currentTimeMillis() - C29301Wc.A00(r2).A09.A0E() < j * 2) {
                z = true;
            }
            if (A1U || z) {
                r12.A0C.BpM(r12.A08, "StuckDbHandlerThreadDetector/heartbeat", j);
                return;
            }
        }
        int A002 = C20800yB.A00(C21000yV.A01, r12.A0B, 757) * 1000;
        if (A002 > 0 && (runnable = r12.A0D) != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Map map = r12.A07;
            if (!map.containsKey(str)) {
                map.put(str, Long.valueOf(uptimeMillis));
                r12.A0C.BpM(r12.A08, "StuckDbHandlerThreadDetector/recovery", (long) A002);
            } else if (uptimeMillis - C36431kI.A09(map.get(str)) >= ((long) A002)) {
                runnable.run();
            }
        }
        if (!r12.A00) {
            if (r12.A03 != null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("StuckDbHandlerThreadDetector/not responsive, debugName:");
                A0u.append(str);
                A0u.append(" msgStoreReadLock:");
                C36341k9.A1O(A0u, (String) null);
            }
            C224714l.A01();
            r12.A02.A0E("db-thread-stuck", str, false);
            r12.A00 = true;
        }
    }

    public C132356Tf(C19700wN r3, C29301Wc r4, C19970wo r5, AnonymousClass12P r6, C20810yC r7, C19770wU r8, Runnable runnable, long j) {
        this.A08 = new C1497472p(this, 1);
        this.A00 = false;
        this.A05 = AnonymousClass001.A0J();
        this.A06 = AnonymousClass001.A0J();
        this.A04 = AnonymousClass001.A0I();
        this.A07 = AnonymousClass001.A0J();
        this.A0A = r5;
        this.A0B = r7;
        this.A02 = r3;
        this.A0C = r8;
        this.A09 = r4;
        this.A03 = r6;
        this.A0D = runnable;
        this.A01 = j;
    }

    public C132356Tf(C19700wN r11, C29301Wc r12, C19970wo r13, AnonymousClass12P r14, C20810yC r15, C19770wU r16) {
        this(r11, r12, r13, r14, r15, r16, C1501174a.A00, 120000);
    }
}
