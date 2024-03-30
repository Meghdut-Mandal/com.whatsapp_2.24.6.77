package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.6oY  reason: invalid class name and case insensitive filesystem */
public class C142236oY implements C159947kD {
    public final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();

    public void BQz(AnonymousClass6MO r3, C160377ku r4, Object obj, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((C159947kD) it.next()).BQz(r3, r4, obj, str);
            }
        }
    }

    public void BSB(AnonymousClass6MO r3, C160377ku r4, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((C159947kD) it.next()).BSB(r3, r4, str);
            }
        }
    }

    public void Bft(C160377ku r3, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((C159947kD) it.next()).Bft(r3, str);
            }
        }
    }
}
