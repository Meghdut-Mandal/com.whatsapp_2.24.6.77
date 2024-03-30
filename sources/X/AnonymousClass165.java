package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.165  reason: invalid class name */
public class AnonymousClass165 {
    public final C19700wN A00;
    public final C19420v0 A01;
    public final AnonymousClass167 A02 = new AnonymousClass167();
    public final C220612s A03;
    public final AnonymousClass12P A04;
    public final C219612i A05;
    public final Map A06 = Collections.synchronizedMap(new AnonymousClass166(200));

    public void A00() {
        AnonymousClass167 r2 = this.A02;
        synchronized (r2) {
            Iterator it = r2.A02.values().iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("getLabelId");
            }
        }
    }

    public AnonymousClass165(C19700wN r3, C19420v0 r4, C220612s r5, AnonymousClass12P r6, C219612i r7) {
        this.A00 = r3;
        this.A05 = r7;
        this.A04 = r6;
        this.A01 = r4;
        this.A03 = r5;
    }
}
