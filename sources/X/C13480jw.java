package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0jw  reason: invalid class name and case insensitive filesystem */
public final class C13480jw extends C12340ht {
    public final HashSet A00 = new HashSet();
    public final Iterator A01;
    public final C006302t A02;

    public C13480jw(Iterator it, C006302t r3) {
        AnonymousClass00C.A0D(it, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A01 = it;
        this.A02 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r3 = this;
        L_0x0000:
            java.util.Iterator r1 = r3.A01
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r2 = r1.next()
            X.02t r0 = r3.A02
            java.lang.Object r1 = r0.invoke(r2)
            java.util.HashSet r0 = r3.A00
            boolean r0 = r0.add(r1)
            if (r0 == 0) goto L_0x0000
            r3.A00 = r2
            X.0Ng r0 = X.AnonymousClass0Ng.Ready
        L_0x001e:
            r3.A01 = r0
            return
        L_0x0021:
            X.0Ng r0 = X.AnonymousClass0Ng.Done
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13480jw.A00():void");
    }
}
