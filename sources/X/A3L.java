package X;

import android.app.PendingIntent;
import android.os.IBinder;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

public final /* synthetic */ class A3L implements C16820q9 {
    public final C06200Sr A00;
    public final AnonymousClass8CL A01;
    public final C98744rx A02;
    public final A3M A03;
    public final AnonymousClass6JN A04;

    public A3L(C06200Sr r1, AnonymousClass8CL r2, C98744rx r3, A3M a3m, AnonymousClass6JN r5) {
        this.A02 = r3;
        this.A03 = a3m;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void B04(Object obj, Object obj2) {
        C170368Dd r7;
        C98744rx r3 = this.A02;
        A3M a3m = this.A03;
        AnonymousClass6JN r1 = this.A04;
        AnonymousClass8CL r9 = this.A01;
        C06200Sr r4 = this.A00;
        C170338Da r8 = new C170338Da(new A47(r3, a3m, r1), (TaskCompletionSource) obj2);
        r9.A02 = r3.A08;
        AnonymousClass9MO r32 = ((AnonymousClass8BW) obj).A00;
        synchronized (r32) {
            AnonymousClass8BW r2 = ((C21018A3h) r32.A00).A00;
            r2.A09();
            AnonymousClass0UL r0 = r4.A01;
            if (r0 != null) {
                Map map = r32.A03;
                synchronized (map) {
                    r7 = (C170368Dd) map.get(r0);
                    if (r7 == null) {
                        r7 = new C170368Dd(r4);
                    }
                    map.put(r0, r7);
                }
                ((C23102B4r) r2.A04()).Byw(new AnonymousClass8CC((PendingIntent) null, (IBinder) null, r7, r8, r9, 1));
            }
        }
    }
}
