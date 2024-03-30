package X;

import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.6OM  reason: invalid class name */
public class AnonymousClass6OM {
    public final C116465kd A00;
    public final LinkedList A01 = C90524aI.A0l();
    public final Map A02;
    public final Set A03 = C36441kJ.A16();
    public final SynchronousQueue A04 = new SynchronousQueue();
    public final AnonymousClass78b A05;
    public final boolean A06;

    public synchronized int A01(String str) {
        int i;
        if (str != null) {
            Integer num = (Integer) this.A02.get(str);
            if (num != null) {
                i = num.intValue();
            }
        }
        i = 0;
        return i;
    }

    public synchronized void A02(Job job) {
        this.A01.addFirst(job);
        A00(job, this);
        this.A05.A00.open();
    }

    public static void A00(Job job, AnonymousClass6OM r3) {
        String str = job.parameters.groupId;
        if (str != null) {
            C36421kH.A1M(str, r3.A02, r3.A01(str) + 1);
        }
    }

    public AnonymousClass6OM(C116465kd r3, boolean z) {
        AnonymousClass78b r1 = new AnonymousClass78b(this);
        this.A05 = r1;
        this.A02 = AnonymousClass001.A0J();
        this.A06 = z;
        this.A00 = r3;
        r1.start();
    }
}
