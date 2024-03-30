package X;

import com.facebook.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.9zw  reason: invalid class name and case insensitive filesystem */
public abstract class C209399zw implements B38 {
    public C202709mU A00;
    public Timeline A01;
    public Object A02;
    public final C202249lP A03 = new C202249lP();
    public final ArrayList A04 = C165607th.A10();

    public abstract void A05();

    public abstract void A06(C202709mU r1, boolean z);

    public final void A04(Timeline timeline, Object obj) {
        this.A01 = timeline;
        this.A02 = obj;
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((C22859AxB) it.next()).Bgs(timeline, this, obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r1 == r3) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BmC(X.C202709mU r3, X.C22859AxB r4, boolean r5) {
        /*
            r2 = this;
            X.9mU r1 = r2.A00
            if (r1 == 0) goto L_0x0007
            r0 = 0
            if (r1 != r3) goto L_0x0008
        L_0x0007:
            r0 = 1
        L_0x0008:
            X.C200319h9.A01(r0)
            java.util.ArrayList r0 = r2.A04
            r0.add(r4)
            X.9mU r0 = r2.A00
            if (r0 != 0) goto L_0x001a
            r2.A00 = r3
            r2.A06(r3, r5)
        L_0x0019:
            return
        L_0x001a:
            com.facebook.android.exoplayer2.Timeline r1 = r2.A01
            if (r1 == 0) goto L_0x0019
            java.lang.Object r0 = r2.A02
            r4.Bgs(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209399zw.BmC(X.9mU, X.AxB, boolean):void");
    }

    public final void BnU(C22859AxB axB) {
        ArrayList arrayList = this.A04;
        arrayList.remove(axB);
        if (arrayList.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            A05();
        }
    }

    public final void Bnl(C160837lf r5) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03.A02;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass9GI r1 = (AnonymousClass9GI) it.next();
            if (r1.A01 == r5) {
                copyOnWriteArrayList.remove(r1);
            }
        }
    }
}
