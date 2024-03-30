package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.650  reason: invalid class name */
public class AnonymousClass650 {
    public boolean A00;
    public final Context A01;
    public final ExecutorService A02 = Executors.newSingleThreadExecutor();
    public final AtomicInteger A03 = new AtomicInteger(0);
    public final AnonymousClass78c A04;
    public final AnonymousClass6OM A05;
    public final AnonymousClass6NH A06;
    public final AtomicBoolean A07 = new AtomicBoolean(false);
    public final AnonymousClass6HV A08;

    public AnonymousClass650(Context context, C116465kd r8, AnonymousClass5ZT r9, String str, List list, int i, int i2, boolean z) {
        this.A05 = new AnonymousClass6OM(r8, z);
        this.A01 = context;
        AnonymousClass6HV r5 = new AnonymousClass6HV();
        this.A08 = r5;
        this.A06 = new AnonymousClass6NH(context, r8, r9, str, r5);
        C1501674f r1 = new C1501674f(this);
        if (!this.A00) {
            this.A02.execute(r1);
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AnonymousClass7i9) it.next()).Br9(this);
            }
        }
        AnonymousClass78c r0 = new AnonymousClass78c(this.A03, this.A05, this.A06, i, i2);
        this.A04 = r0;
        r0.start();
    }

    public void A00() {
        C1501674f r1 = new C1501674f(this, 26);
        if (!this.A00) {
            this.A02.execute(r1);
        }
    }
}
