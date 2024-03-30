package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class A27 implements C23109B5o {
    public C197479bm A00;
    public final AnonymousClass88Y A01;
    public final AnonymousClass9JJ A02;
    public final AnonymousClass9S2 A03;
    public final boolean A04;
    public final Context A05;
    public final C197439bi A06;
    public volatile int A07 = 0;

    public static synchronized void A00(A27 a27) {
        synchronized (a27) {
            a27.A01();
            if (a27.A07 == 1) {
                AnonymousClass88Y r0 = a27.A01;
                r0.BKJ();
                r0.BKS();
                a27.A07 = 2;
            }
        }
    }

    public synchronized void A01() {
        if (this.A07 == 0) {
            AnonymousClass9JJ r3 = this.A02;
            AnonymousClass88Y r2 = this.A01;
            if (!r3.A00) {
                r3.A00 = true;
                AnonymousClass9QN r1 = new AnonymousClass9QN(r2, r3);
                r1.A00(new AnonymousClass88P(this));
                r1.A00(new AnonymousClass88O(this));
                r1.A00(new AnonymousClass88N(this));
                r1.A00(new C1690683c(this));
                r1.A00(new C1690583b(this));
                r1.A00(new C1690483a(this));
            }
            this.A07 = 1;
        }
    }

    public C23113B5s B9y(C1691688a r3) {
        synchronized (this) {
            if (this.A07 == 0) {
                if (this.A04) {
                    A00(this);
                } else {
                    A01();
                }
            }
        }
        B30 b30 = (B30) this.A02.A01.get(r3);
        if (b30 != null) {
            return (C23113B5s) b30;
        }
        throw AnonymousClass001.A08("Component not available. Did you add specify the dependency or the plugin configuration?");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r3.A07 == 4) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void release() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r1 = r3.A07     // Catch:{ all -> 0x0046 }
            r0 = 3
            if (r1 == r0) goto L_0x000c
            int r2 = r3.A07     // Catch:{ all -> 0x0046 }
            r1 = 4
            r0 = 0
            if (r2 != r1) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            r1 = 2
            if (r0 == 0) goto L_0x0017
            r3.A07 = r1     // Catch:{ all -> 0x0046 }
            X.88Y r0 = r3.A01     // Catch:{ all -> 0x0046 }
            r0.B5X()     // Catch:{ all -> 0x0046 }
        L_0x0017:
            int r0 = r3.A07     // Catch:{ all -> 0x0046 }
            if (r0 != r1) goto L_0x0023
            r0 = 1
            r3.A07 = r0     // Catch:{ all -> 0x0046 }
            X.88Y r0 = r3.A01     // Catch:{ all -> 0x0046 }
            r0.release()     // Catch:{ all -> 0x0046 }
        L_0x0023:
            boolean r0 = r3.A04     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0044
            int r1 = r3.A07     // Catch:{ all -> 0x0046 }
            r0 = 1
            if (r1 != r0) goto L_0x0044
            r0 = 0
            r3.A07 = r0     // Catch:{ all -> 0x0046 }
            X.9JJ r1 = r3.A02     // Catch:{ all -> 0x0046 }
            boolean r0 = r1.A00     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x003d
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x0046 }
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x0046 }
            r0.clear()     // Catch:{ all -> 0x0046 }
        L_0x003d:
            X.88Y r0 = r3.A01     // Catch:{ all -> 0x0046 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x0046 }
            r0.clear()     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r3)
            return
        L_0x0046:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A27.release():void");
    }

    public C22876AxX B9z(AnonymousClass94T r2) {
        return this.A03.A00(r2);
    }

    public Object BA0(AnonymousClass94Q r2) {
        return this.A06.A00.get(r2);
    }

    public boolean BLR(C1691688a r2) {
        return this.A02.A01.containsKey(r2);
    }

    public boolean BLS(AnonymousClass94T r2) {
        return this.A03.A02.containsKey(r2);
    }

    public A27(Context context, C197439bi r7, C22790Aw1[] aw1Arr) {
        boolean z = false;
        this.A05 = context.getApplicationContext();
        this.A01 = new AnonymousClass88Y();
        this.A06 = r7;
        Boolean bool = (Boolean) r7.A00.get(C23109B5o.A00);
        this.A04 = bool != null ? bool.booleanValue() : z;
        this.A02 = new AnonymousClass9JJ(aw1Arr);
        AnonymousClass9S2 r4 = new AnonymousClass9S2(aw1Arr);
        this.A03 = r4;
        if (!r4.A00) {
            r4.A00 = true;
            AnonymousClass88X r1 = new AnonymousClass88X(this);
            Map map = r4.A02;
            map.put(C23111B5q.A00, r1);
            ArrayList arrayList = r4.A01;
            arrayList.add(r1);
            AnonymousClass88W r12 = new AnonymousClass88W(this);
            map.put(C23110B5p.A00, r12);
            arrayList.add(r12);
            AnonymousClass88U r13 = new AnonymousClass88U(this);
            map.put(r13.BDK(), r13);
            arrayList.add(r13);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A24 a24 = (A24) ((C22876AxX) it.next());
                if (!a24.A01) {
                    a24.A01 = true;
                }
            }
            r4.A00(C23112B5r.A00);
        }
    }

    public Context getContext() {
        return this.A05;
    }
}
