package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.3Bg  reason: invalid class name and case insensitive filesystem */
public class C61283Bg {
    public final /* synthetic */ C64603Oq A00;

    public C61283Bg(C64603Oq r1) {
        this.A00 = r1;
    }

    public void A00() {
        ArrayList A14;
        LinkedHashMap linkedHashMap = this.A00.A03;
        synchronized (linkedHashMap) {
            A14 = C36441kJ.A14(linkedHashMap.size());
            Iterator A10 = C36391kE.A10(linkedHashMap);
            while (A10.hasNext()) {
                Runnable runnable = (Runnable) A10.next();
                if (runnable != null) {
                    A14.add(runnable);
                }
            }
            linkedHashMap.clear();
        }
        Iterator it = A14.iterator();
        while (it.hasNext()) {
            C36411kG.A1O(it.next());
        }
    }
}
