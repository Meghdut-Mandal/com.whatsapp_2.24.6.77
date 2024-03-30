package X;

/* renamed from: X.65T  reason: invalid class name */
public abstract class AnonymousClass65T {
    public Object A00(C114375h9 r3) {
        if (this instanceof C94764ik) {
            C94764ik r1 = (C94764ik) this;
            if (r3 == r1.A01) {
                Object value = r1.A00.getValue();
                if (value == null) {
                    return null;
                }
                return value;
            }
            throw AnonymousClass001.A09("Check failed.");
        } else if (this instanceof C94774il) {
            throw AnonymousClass001.A09("");
        } else {
            C161607nB r12 = ((C94754ij) this).A00;
            if (r3 == C112405dq.A00) {
                return r12;
            }
            throw AnonymousClass001.A09("Check failed.");
        }
    }

    public boolean A01(C114375h9 r2) {
        if (this instanceof C94764ik) {
            return C36361kB.A1a(r2, ((C94764ik) this).A01);
        }
        if (this instanceof C94774il) {
            return false;
        }
        return C36361kB.A1a(r2, C112405dq.A00);
    }
}
