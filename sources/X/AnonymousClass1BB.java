package X;

import java.util.Collection;
import java.util.HashMap;

/* renamed from: X.1BB  reason: invalid class name */
public class AnonymousClass1BB extends C19590wC {
    public final AnonymousClass1BA A00;

    public AnonymousClass1BB(AnonymousClass1BA r1) {
        this.A00 = r1;
    }

    public void A00() {
        for (C129156Fn A02 : getObservers()) {
            A02.A02();
        }
    }

    /* renamed from: A01 */
    public void registerObserver(C129156Fn r7) {
        super.registerObserver(r7);
        HashMap hashMap = new HashMap(this.A00.A01);
        for (String str : hashMap.keySet()) {
            int intValue = ((Number) hashMap.get(str)).intValue();
            for (C129156Fn r0 : getObservers()) {
                r0.toString();
                r0.A0A(str, intValue);
            }
        }
    }

    public void A02(Collection collection, boolean z) {
        for (C129156Fn A0C : getObservers()) {
            A0C.A0C(collection, z);
        }
    }

    public void A03(Collection collection, boolean z) {
        for (C129156Fn A0D : getObservers()) {
            A0D.A0D(collection, z);
        }
    }
}
