package X;

import android.content.Context;

/* renamed from: X.1Mq  reason: invalid class name and case insensitive filesystem */
public final class C27081Mq implements AnonymousClass004 {
    public final int A00;
    public final C27071Mp A01;
    public final C18800tq A02;

    public C27081Mq(C27071Mp r1, C18800tq r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public Object get() {
        int i = this.A00;
        if (i == 0) {
            return A00();
        }
        if (i == 1) {
            return new C198909eO(this.A02.AIB());
        }
        if (i == 2) {
            Context A002 = C19610wE.A00(this.A02.AfJ);
            this.A02.A02.get();
            return new C117425mF(A002);
        } else if (i == 3) {
            return new C122505ux(C19610wE.A00(this.A02.AfJ), (C19970wo) this.A02.A8b.get(), (C18820ts) this.A02.A9X.get(), AnonymousClass1BE.A00());
        } else {
            throw new AssertionError(this.A00);
        }
    }

    public static AnonymousClass09C A00() {
        C28771Tz r0 = new C28771Tz();
        C19620wF.A00(r0);
        return r0;
    }
}
