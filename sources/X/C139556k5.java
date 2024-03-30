package X;

import com.facebook.common.callercontext.CallerContextable;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.6k5  reason: invalid class name and case insensitive filesystem */
public class C139556k5 implements CallerContextable {
    public String A00 = null;
    public final C133326Xw A01;
    public final AnonymousClass5YD A02;
    public final C123015vn A03;
    public final C123635wp A04;
    public final AnonymousClass6PQ A05;
    public final C101284xI A06;
    public final C111595cX A07;
    public final Set A08 = Collections.newSetFromMap(new WeakHashMap());
    public final AnonymousClass5ZV A09;
    public final Map A0A = Collections.synchronizedMap(AnonymousClass001.A0J());
    public final ScheduledExecutorService A0B;

    public static void A00(C139556k5 r9, C124595yT r10, C125235zX r11, C159007ic r12, AnonymousClass5YD r13, C135056c3 r14, boolean z) {
        AnonymousClass5VK r0;
        C124595yT r5 = r10;
        AnonymousClass6SG r102 = r10.A08;
        C139556k5 r4 = r9;
        C159007ic r7 = r12;
        C135056c3 r92 = r14;
        try {
            if (!AnonymousClass000.A1X(r5.A03.get(120, TimeUnit.SECONDS))) {
                C1263463o r1 = new C1263463o();
                r1.A00 = C108395Ti.VOLTRON_MODULE_FAILURE;
                r1.A03 = AnonymousClass001.A09("Voltron modules required for effect failed to load.");
                r0 = r1.A00();
                A01(r4, r12, r14, r102, r0);
                return;
            }
            new C1502874r(r4, r5, r11, r7, r13, r92, r102, z).run();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            AnonymousClass6YR.A0C("DefaultCameraCoreEffectManager", "voltron module load exception.", e);
            C1263463o r15 = new C1263463o();
            r15.A00 = C108395Ti.VOLTRON_MODULE_FAILURE;
            r15.A03 = e;
            r0 = r15.A00();
        }
    }

    public static void A01(C139556k5 r7, C159007ic r8, C135056c3 r9, AnonymousClass6SG r10, Exception exc) {
        Exception exc2 = exc;
        if (!(exc instanceof AnonymousClass5VK)) {
            C1263463o r1 = new C1263463o();
            r1.A00 = C108395Ti.OTHER;
            r1.A03 = exc;
            exc2 = r1.A00();
        }
        new AnonymousClass753(r8, r7, exc2, r10, r9, 4).run();
    }

    public C139556k5(C133326Xw r2, C123015vn r3, C123635wp r4, AnonymousClass6PQ r5, C101284xI r6, AnonymousClass5ZV r7, C111595cX r8, ScheduledExecutorService scheduledExecutorService) {
        this.A05 = r5;
        this.A06 = r6;
        this.A01 = r2;
        this.A09 = r7;
        this.A07 = r8;
        this.A03 = r3;
        this.A02 = new AnonymousClass5YD();
        this.A0B = scheduledExecutorService;
        this.A04 = r4;
    }
}
