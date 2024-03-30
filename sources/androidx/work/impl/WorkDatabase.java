package androidx.work.impl;

import X.AnonymousClass6Q8;
import X.AnonymousClass7e9;
import X.AnonymousClass7eA;
import X.C138886ir;
import X.C138896is;
import X.C138906it;
import X.C138916iu;
import X.C138926iv;
import X.C138936iw;
import X.C138946ix;
import X.C157157bv;
import X.C158957iW;
import X.C158967iX;
import X.C158977iY;
import X.C160977lt;

public abstract class WorkDatabase extends AnonymousClass6Q8 {
    public AnonymousClass7e9 A08() {
        AnonymousClass7e9 r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A00 != null) {
            return workDatabase_Impl.A00;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A00 == null) {
                workDatabase_Impl.A00 = new C138886ir(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A00;
        }
        return r0;
    }

    public C158957iW A09() {
        C158957iW r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A01 != null) {
            return workDatabase_Impl.A01;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A01 == null) {
                workDatabase_Impl.A01 = new C138896is(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A01;
        }
        return r0;
    }

    public C158967iX A0A() {
        C158967iX r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A02 != null) {
            return workDatabase_Impl.A02;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A02 == null) {
                workDatabase_Impl.A02 = new C138906it(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A02;
        }
        return r0;
    }

    public C157157bv A0B() {
        C157157bv r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A03 != null) {
            return workDatabase_Impl.A03;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A03 == null) {
                workDatabase_Impl.A03 = new C138916iu(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A03;
        }
        return r0;
    }

    public AnonymousClass7eA A0C() {
        AnonymousClass7eA r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A04 != null) {
            return workDatabase_Impl.A04;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A04 == null) {
                workDatabase_Impl.A04 = new C138926iv(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A04;
        }
        return r0;
    }

    public C160977lt A0D() {
        C160977lt r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A05 != null) {
            return workDatabase_Impl.A05;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A05 == null) {
                workDatabase_Impl.A05 = new C138936iw(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A05;
        }
        return r0;
    }

    public C158977iY A0E() {
        C158977iY r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A06 != null) {
            return workDatabase_Impl.A06;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A06 == null) {
                workDatabase_Impl.A06 = new C138946ix(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A06;
        }
        return r0;
    }
}
