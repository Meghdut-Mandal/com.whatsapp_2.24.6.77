package X;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* renamed from: X.8FP  reason: invalid class name */
public final class AnonymousClass8FP extends AX1 {
    public final /* synthetic */ TaskCompletionSource A00;
    public final /* synthetic */ C201499ji A01;
    public final /* synthetic */ AX1 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8FP(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, C201499ji r3, AX1 ax1) {
        super(taskCompletionSource);
        this.A01 = r3;
        this.A00 = taskCompletionSource2;
        this.A02 = ax1;
    }

    public final void b() {
        C201499ji r6 = this.A01;
        synchronized (r6.A08) {
            TaskCompletionSource taskCompletionSource = this.A00;
            r6.A0C.add(taskCompletionSource);
            taskCompletionSource.zza.addOnCompleteListener(new A4B(taskCompletionSource, r6));
            if (r6.A0D.getAndIncrement() > 0) {
                r6.A06.A02("Already connected to the service.", C90524aI.A0w());
            }
            AX1 ax1 = this.A02;
            if (r6.A01 == null && !r6.A02) {
                C199269f2 r8 = r6.A06;
                r8.A02("Initiate binding to the service.", new Object[0]);
                List<AX1> list = r6.A0B;
                list.add(ax1);
                C204169pZ r4 = new C204169pZ(r6);
                r6.A00 = r4;
                r6.A02 = true;
                if (!r6.A03.bindService(r6.A04, r4, 1)) {
                    r8.A02("Failed to bind to the service.", new Object[0]);
                    r6.A02 = false;
                    for (AX1 a : list) {
                        a.a(new C21819Aav());
                    }
                    list.clear();
                }
            } else if (r6.A02) {
                r6.A06.A02("Waiting to bind to the service.", new Object[0]);
                r6.A0B.add(ax1);
            } else {
                ax1.run();
            }
        }
    }
}
