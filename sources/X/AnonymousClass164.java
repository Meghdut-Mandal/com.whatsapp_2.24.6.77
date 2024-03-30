package X;

import android.content.Context;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.164  reason: invalid class name */
public class AnonymousClass164 {
    public AnonymousClass650 A00;
    public final C19700wN A01;
    public final C19630wG A02;
    public final C20810yC A03;
    public final AnonymousClass005 A04;

    public static synchronized AnonymousClass650 A00(AnonymousClass164 r9) {
        AnonymousClass650 r0;
        synchronized (r9) {
            r0 = r9.A00;
            if (r0 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("WaJobManager/start injected requirementProviders:");
                AnonymousClass005 r1 = r9.A04;
                sb.append(r1.get());
                Log.i(sb.toString());
                C124335y0 r2 = new C124335y0(r9.A02.A00);
                r2.A03 = "WhatsAppJobManager";
                r2.A04 = Arrays.asList((AnonymousClass7i9[]) ((Set) r1.get()).toArray(new AnonymousClass7i9[0]));
                r2.A02 = new AnonymousClass5ZT();
                C20810yC r3 = r9.A03;
                C21000yV r12 = C21000yV.A02;
                r2.A05 = C20800yB.A01(r12, r3, 476);
                r2.A01 = new C116465kd(r9);
                r2.A00 = C20800yB.A00(r12, r3, 419);
                int A002 = C20800yB.A00(r12, r3, 420);
                String str = r2.A03;
                if (str != null) {
                    List list = r2.A04;
                    if (list == null) {
                        list = new LinkedList();
                        r2.A04 = list;
                    }
                    r0 = new AnonymousClass650(r2.A06, r2.A01, r2.A02, str, list, r2.A00, A002, r2.A05);
                    r9.A00 = r0;
                } else {
                    throw new IllegalArgumentException("You must specify a name!");
                }
            }
        }
        return r0;
    }

    public AnonymousClass164(C19700wN r1, C19630wG r2, C20810yC r3, AnonymousClass005 r4) {
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r1;
        this.A04 = r4;
    }

    public void A01(Job job) {
        AnonymousClass650 A002 = A00(this);
        if (job.parameters.wakeLock) {
            Context context = A002.A01;
            String obj = job.toString();
            long j = job.parameters.wakeLockTimeout;
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, obj);
            if (j == 0) {
                newWakeLock.acquire();
            } else {
                newWakeLock.acquire(j);
            }
            job.A02 = newWakeLock;
        }
        C1498272x r1 = new C1498272x(job, A002, 20);
        if (!A002.A00) {
            A002.A02.execute(r1);
        }
    }
}
