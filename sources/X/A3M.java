package X;

import android.app.PendingIntent;
import android.os.IBinder;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

public final class A3M implements C16820q9 {
    public boolean A00;
    public final /* synthetic */ C06200Sr A01;
    public final /* synthetic */ C98744rx A02;

    public A3M() {
        this.A00 = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public A3M(C06200Sr r1, C98744rx r2) {
        this();
        this.A02 = r2;
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ void B04(Object obj, Object obj2) {
        AnonymousClass8BW r10 = (AnonymousClass8BW) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (this.A00) {
            AnonymousClass8DZ r6 = new AnonymousClass8DZ(taskCompletionSource);
            try {
                AnonymousClass0UL r3 = this.A01.A01;
                if (r3 != null) {
                    AnonymousClass9MO r1 = r10.A00;
                    AnonymousClass8BW r2 = ((C21018A3h) r1.A00).A00;
                    r2.A09();
                    Map map = r1.A03;
                    synchronized (map) {
                        C170368Dd r5 = (C170368Dd) map.remove(r3);
                        if (r5 != null) {
                            synchronized (r5) {
                                C06200Sr r0 = r5.A00;
                                r0.A02 = null;
                                r0.A01 = null;
                            }
                            ((C23102B4r) r2.A04()).Byw(new AnonymousClass8CC((PendingIntent) null, (IBinder) null, r5, r6, (AnonymousClass8CL) null, 2));
                        }
                    }
                }
            } catch (RuntimeException e) {
                taskCompletionSource.trySetException(e);
            }
        }
    }
}
