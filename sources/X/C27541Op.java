package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1Op  reason: invalid class name and case insensitive filesystem */
public class C27541Op {
    public final ArrayList A00 = new ArrayList();

    public void A00(C87854Qk r2) {
        this.A00.add(r2);
    }

    public void A01(C87854Qk r2) {
        this.A00.remove(r2);
    }

    public void A02(AnonymousClass11F r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C87854Qk) it.next()).BQN(r3);
        }
    }
}
