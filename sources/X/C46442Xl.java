package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Xl  reason: invalid class name and case insensitive filesystem */
public class C46442Xl extends AnonymousClass5EQ {
    public final C143526qh A00;
    public final List A01 = AnonymousClass001.A0I();

    public C46442Xl(C143526qh r5, List list) {
        super(39);
        this.A00 = r5;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A01.add(new C62293Fp(r5, (AnonymousClass544) it.next()));
        }
    }
}
