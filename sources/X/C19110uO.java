package X;

import java.util.Set;

/* renamed from: X.0uO  reason: invalid class name and case insensitive filesystem */
public abstract class C19110uO {
    public C19130uQ A00() {
        if (this instanceof C19240uc) {
            C19240uc r1 = (C19240uc) this;
            Class<C19060uJ> cls = C19060uJ.class;
            if (r1.A05.contains(cls)) {
                return r1.A00.A00();
            }
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
        }
        C19220ua r0 = (C19220ua) ((C19120uP) this).A03.get(C19060uJ.class);
        if (r0 == null) {
            return C19120uP.A04;
        }
        return r0;
    }

    public C19130uQ A01(Class cls) {
        if (this instanceof C19240uc) {
            C19240uc r1 = (C19240uc) this;
            if (r1.A02.contains(cls)) {
                return r1.A00.A01(cls);
            }
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
        }
        AnonymousClass006.A02(cls, "Null interface requested.");
        return (C19130uQ) ((C19120uP) this).A02.get(cls);
    }

    public Object A02(Class cls) {
        if (this instanceof C19240uc) {
            C19240uc r1 = (C19240uc) this;
            if (r1.A01.contains(cls)) {
                Object A02 = r1.A00.A02(cls);
                if (!cls.equals(C19150uS.class)) {
                    return A02;
                }
                return new C141796nq((C19150uS) A02, r1.A03);
            }
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
        }
        C19130uQ A01 = A01(cls);
        if (A01 == null) {
            return null;
        }
        return A01.get();
    }

    public Set A03() {
        if (!(this instanceof C19240uc)) {
            return (Set) A00().get();
        }
        C19240uc r1 = (C19240uc) this;
        Class<C19060uJ> cls = C19060uJ.class;
        if (r1.A04.contains(cls)) {
            return r1.A00.A03();
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }
}
