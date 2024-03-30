package X;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.77A  reason: invalid class name */
public final /* synthetic */ class AnonymousClass77A implements RejectedExecutionHandler {
    public final /* synthetic */ AnonymousClass78c A00;
    public final /* synthetic */ AnonymousClass6OM A01;

    public /* synthetic */ AnonymousClass77A(AnonymousClass78c r1, AnonymousClass6OM r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        AnonymousClass78c r3 = this.A00;
        AnonymousClass6OM r2 = this.A01;
        if (runnable instanceof C1498272x) {
            C1498272x r5 = (C1498272x) runnable;
            if (r5.A02 == 18) {
                Job job = (Job) r5.A00;
                r2.A02(job);
                String str = job.parameters.groupId;
                if (str != null) {
                    synchronized (r2) {
                        r2.A03.remove(str);
                        r2.A05.A00.open();
                    }
                }
            }
        }
        try {
            r3.A00.getQueue().put(C1501374c.A00);
        } catch (InterruptedException unused) {
            C90484aE.A0z();
        }
    }
}
