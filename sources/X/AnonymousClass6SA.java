package X;

import android.content.Context;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.6SA  reason: invalid class name */
public final class AnonymousClass6SA {
    public static AnonymousClass6SA A04;
    public int A00 = 1;
    public AnonymousClass6ZH A01 = new AnonymousClass6ZH(this);
    public final Context A02;
    public final ScheduledExecutorService A03;

    public static final synchronized zzw A00(AnonymousClass6F5 r4, AnonymousClass6SA r5) {
        zzw zzw;
        synchronized (r5) {
            if (C90494aF.A1a("MessengerIpcClient")) {
                String valueOf = String.valueOf(r4);
                C90464aC.A1G("Queueing ", valueOf, "MessengerIpcClient", C90524aI.A0h(C90474aD.A05(valueOf) + 9));
            }
            if (!r5.A01.A03(r4)) {
                AnonymousClass6ZH r0 = new AnonymousClass6ZH(r5);
                r5.A01 = r0;
                r0.A03(r4);
            }
            zzw = r4.A02.zza;
        }
        return zzw;
    }

    public static synchronized AnonymousClass6SA A01(Context context) {
        AnonymousClass6SA r1;
        synchronized (AnonymousClass6SA.class) {
            r1 = A04;
            if (r1 == null) {
                r1 = new AnonymousClass6SA(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new AnonymousClass00J("MessengerIpcClient"))));
                A04 = r1;
            }
        }
        return r1;
    }

    public AnonymousClass6SA(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = scheduledExecutorService;
        this.A02 = context.getApplicationContext();
    }
}
