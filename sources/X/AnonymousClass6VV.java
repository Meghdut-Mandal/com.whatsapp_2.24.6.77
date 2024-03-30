package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.6VV  reason: invalid class name */
public abstract class AnonymousClass6VV {
    public static final Object A03(AnonymousClass00S r9, C006302t r10) {
        Snapshot snapshot;
        Snapshot A06;
        C93904hK r4;
        C006302t r5 = r10;
        if (r10 == null) {
            return r9.invoke();
        }
        C1269066c r2 = AnonymousClass6YQ.A05;
        Snapshot snapshot2 = (Snapshot) r2.A01();
        if (snapshot2 == null || (snapshot2 instanceof C93904hK)) {
            if (snapshot2 instanceof C93904hK) {
                r4 = (C93904hK) snapshot2;
            } else {
                r4 = null;
            }
            snapshot = new C93864hG(r4, r5, (C006302t) null, true, false);
        } else {
            snapshot = snapshot2.A07(r10);
        }
        try {
            A06 = snapshot.A06();
            Object invoke = r9.invoke();
            r2.A02(A06);
            snapshot.A0B();
            return invoke;
        } catch (Throwable th) {
            snapshot.A0B();
            throw th;
        }
    }

    public static final C137216fm A01(C009003v r2) {
        AnonymousClass6YQ.A09(AnonymousClass6YQ.A09);
        synchronized (AnonymousClass6YQ.A07) {
            AnonymousClass6YQ.A02 = C007103b.A0T(r2, AnonymousClass6YQ.A02);
        }
        return new C137216fm(r2);
    }

    public static final Snapshot A02() {
        return AnonymousClass6YQ.A01((Snapshot) AnonymousClass6YQ.A05.A01(), (C006302t) null, false);
    }

    public static final void A04() {
        boolean z;
        synchronized (AnonymousClass6YQ.A07) {
            C1506876f A0L = ((C93854hF) AnonymousClass6YQ.A08.get()).A0L();
            z = true;
            if (A0L == null || A0L.size() <= 0) {
                z = false;
            }
        }
        if (z) {
            AnonymousClass6YQ.A09(AnonymousClass7WL.A00);
        }
    }

    public static final C93904hK A00(C006302t r2, C006302t r3) {
        C93904hK r1;
        C93904hK A0M;
        Snapshot A00 = AnonymousClass6YQ.A00();
        if ((A00 instanceof C93904hK) && (r1 = (C93904hK) A00) != null && (A0M = r1.A0M(r2, r3)) != null) {
            return A0M;
        }
        throw AnonymousClass001.A09("Cannot create a mutable snapshot of an read-only snapshot");
    }
}
