package X;

/* renamed from: X.6Nn  reason: invalid class name and case insensitive filesystem */
public final class C131046Nn {
    public final Object A00;
    public final Throwable A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C131046Nn) {
                C131046Nn r5 = (C131046Nn) obj;
                Object obj2 = this.A00;
                if (obj2 == null || !obj2.equals(r5.A00)) {
                    Throwable th = this.A01;
                    if (!(th == null || r5.A01 == null)) {
                        return th.toString().equals(th.toString());
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C131046Nn(Object obj) {
        this.A00 = obj;
        this.A01 = null;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A00;
        return AnonymousClass000.A0L(this.A01, A0M);
    }

    public C131046Nn(Throwable th) {
        this.A01 = th;
        this.A00 = null;
    }
}
