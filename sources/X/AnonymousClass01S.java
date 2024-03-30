package X;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.01S  reason: invalid class name */
public class AnonymousClass01S {
    public final Runnable A00;
    public final Map A01 = new HashMap();
    public final CopyOnWriteArrayList A02 = new CopyOnWriteArrayList();

    public void A00(AnonymousClass027 r4) {
        this.A02.remove(r4);
        C06040Sb r2 = (C06040Sb) this.A01.remove(r4);
        if (r2 != null) {
            r2.A01.A05(r2.A00);
            r2.A00 = null;
        }
        this.A00.run();
    }

    public AnonymousClass01S(Runnable runnable) {
        this.A00 = runnable;
    }
}
