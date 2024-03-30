package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0Qt  reason: invalid class name and case insensitive filesystem */
public abstract class C05710Qt {
    public static final AnonymousClass0AR A00(C023509x r4) {
        int i;
        if (!(r4 instanceof AnonymousClass0AD)) {
            i = 1;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass0AD.A04;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(r4);
                if (obj == null) {
                    atomicReferenceFieldUpdater.set(r4, AnonymousClass0AE.A00);
                    break;
                }
                boolean z = obj instanceof AnonymousClass0AR;
                AnonymousClass035 r0 = AnonymousClass0AE.A00;
                if (z) {
                    if (AnonymousClass0A8.A00(r4, obj, r0, atomicReferenceFieldUpdater)) {
                        AnonymousClass0AR r3 = (AnonymousClass0AR) obj;
                        if (r3 != null) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = AnonymousClass0AR.A04;
                            Object obj2 = atomicReferenceFieldUpdater2.get(r3);
                            if (!(obj2 instanceof C06620Uj) || ((C06620Uj) obj2).A00 == null) {
                                AnonymousClass0AR.A02.set(r3, 536870911);
                                atomicReferenceFieldUpdater2.set(r3, C12930it.A00);
                                return r3;
                            }
                            r3.A0K();
                        }
                    }
                } else if (obj != r0 && !(obj instanceof Throwable)) {
                    throw AnonymousClass000.A0f(obj, "Inconsistent state ", AnonymousClass000.A0u());
                }
            }
            i = 2;
        }
        return new AnonymousClass0AR(i, r4);
    }
}
