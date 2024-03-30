package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3GN  reason: invalid class name */
public class AnonymousClass3GN {
    public final HashSet A00 = C36441kJ.A16();
    public final LinkedHashMap A01 = C36431kI.A1G();
    public final /* synthetic */ AnonymousClass1Y2 A02;

    public synchronized void A00() {
        Iterator A10 = C36371kC.A10(this.A01);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            HashSet hashSet = this.A00;
            if (!hashSet.contains(A11.getKey())) {
                break;
            }
            AnonymousClass3T1 r2 = (AnonymousClass3T1) A11.getValue();
            A10.remove();
            hashSet.remove(A11.getKey());
            AnonymousClass1Y2 r0 = this.A02;
            boolean A04 = C64933Qa.A04(r2);
            C20280xJ r02 = (C20280xJ) r0.A00.get();
            if (A04) {
                r02.A02(r2);
            } else {
                r02.A01(r2);
            }
        }
    }

    public synchronized String toString() {
        StringBuilder A0u;
        A0u = AnonymousClass000.A0u();
        A0u.append("[pending:");
        A0u.append(this.A01.size());
        A0u.append(" ready:");
        A0u.append(this.A00.size());
        return AnonymousClass000.A0q("]", A0u);
    }

    public AnonymousClass3GN(AnonymousClass1Y2 r2) {
        this.A02 = r2;
    }
}
