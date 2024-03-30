package X;

/* renamed from: X.0GC  reason: invalid class name */
public final class AnonymousClass0GC extends C06720Uu {
    public boolean A02(C07020Wa r2, C07020Wa r3, AnonymousClass0f7 r4) {
        boolean z;
        synchronized (r4) {
            if (r4.listeners == r2) {
                r4.listeners = r3;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean A03(AnonymousClass0Xz r2, AnonymousClass0Xz r3, AnonymousClass0f7 r4) {
        boolean z;
        synchronized (r4) {
            if (r4.waiters == r2) {
                r4.waiters = r3;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean A04(AnonymousClass0f7 r3, Object obj, Object obj2) {
        boolean z;
        synchronized (r3) {
            if (r3.value == null) {
                r3.value = obj2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public void A00(AnonymousClass0Xz r1, AnonymousClass0Xz r2) {
        r1.next = r2;
    }

    public void A01(AnonymousClass0Xz r1, Thread thread) {
        r1.thread = thread;
    }
}
