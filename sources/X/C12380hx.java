package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0hx  reason: invalid class name and case insensitive filesystem */
public final class C12380hx implements Iterator, AnonymousClass00W {
    public int A00 = -1;
    public Object A01;
    public final Iterator A02;
    public final /* synthetic */ C12810ih A03;

    public C12380hx(C12810ih r2) {
        this.A03 = r2;
        this.A02 = r2.A01.iterator();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r4 = this;
        L_0x0000:
            java.util.Iterator r1 = r4.A02
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r3 = r1.next()
            X.0ih r2 = r4.A03
            X.02t r0 = r2.A00
            java.lang.Object r0 = r0.invoke(r3)
            boolean r1 = X.AnonymousClass000.A1X(r0)
            boolean r0 = r2.A02
            if (r1 != r0) goto L_0x0000
            r4.A01 = r3
            r0 = 1
        L_0x001f:
            r4.A00 = r0
            return
        L_0x0022:
            r0 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12380hx.A00():void");
    }

    public boolean hasNext() {
        if (this.A00 == -1) {
            A00();
        }
        return AnonymousClass000.A1O(this.A00);
    }

    public Object next() {
        if (this.A00 == -1) {
            A00();
        }
        if (this.A00 != 0) {
            Object obj = this.A01;
            this.A01 = null;
            this.A00 = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }
}
