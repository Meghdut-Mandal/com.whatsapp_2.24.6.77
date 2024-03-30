package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0is  reason: invalid class name and case insensitive filesystem */
public final class C12920is implements C007903j {
    public static final AtomicIntegerFieldUpdater A01;
    public static final AtomicReferenceFieldUpdater A02;
    public static final AtomicReferenceFieldUpdater A03;
    public final C15470nO A00;
    public volatile Object _exceptionsHolder;
    public volatile int _isCompleting = 0;
    public volatile Object _rootCause;

    static {
        Class<C12920is> cls = C12920is.class;
        A01 = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleting");
        Class<Object> cls2 = Object.class;
        A03 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_rootCause");
        A02 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_exceptionsHolder");
    }

    public C12920is(Throwable th, C15470nO r3) {
        this.A00 = r3;
        this._rootCause = th;
    }

    public static final ArrayList A01() {
        return new ArrayList(4);
    }

    public final void A05() {
        A01.set(this, 1);
    }

    private final Object A00() {
        return A02.get(this);
    }

    private final void A02(Object obj) {
        A02.set(this, obj);
    }

    public final Throwable A03() {
        return (Throwable) A03.get(this);
    }

    public final void A07(Throwable th) {
        A03.set(this, th);
    }

    public final boolean A09() {
        return AnonymousClass000.A1P(A01.get(this));
    }

    public final ArrayList A04(Throwable th) {
        ArrayList arrayList;
        Object A002 = A00();
        if (A002 == null) {
            arrayList = A01();
        } else if (A002 instanceof Throwable) {
            arrayList = A01();
            arrayList.add(A002);
        } else if (A002 instanceof ArrayList) {
            arrayList = (ArrayList) A002;
        } else {
            throw AnonymousClass000.A0f(A002, "State is ", AnonymousClass000.A0u());
        }
        Throwable A032 = A03();
        if (A032 != null) {
            arrayList.add(0, A032);
        }
        if (th != null && !th.equals(A032)) {
            arrayList.add(th);
        }
        A02(C007803i.A05);
        return arrayList;
    }

    public final void A06(Throwable th) {
        Throwable A032 = A03();
        if (A032 == null) {
            A07(th);
        } else if (th != A032) {
            Object A002 = A00();
            if (A002 == null) {
                A02(th);
            } else if (A002 instanceof Throwable) {
                if (th != A002) {
                    ArrayList A012 = A01();
                    A012.add(A002);
                    A012.add(th);
                    A02(A012);
                }
            } else if (A002 instanceof ArrayList) {
                ((AbstractCollection) A002).add(th);
            } else {
                throw AnonymousClass000.A0f(A002, "State is ", AnonymousClass000.A0u());
            }
        }
    }

    public final boolean A08() {
        return AnonymousClass000.A1V(A03());
    }

    public final boolean A0A() {
        if (A00() == C007803i.A05) {
            return true;
        }
        return false;
    }

    public boolean BL7() {
        return AnonymousClass000.A1W(A03());
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Finishing[cancelling=");
        A0u.append(A08());
        A0u.append(", completing=");
        A0u.append(A09());
        A0u.append(", rootCause=");
        A0u.append(A03());
        A0u.append(", exceptions=");
        A0u.append(A00());
        A0u.append(", list=");
        return AnonymousClass000.A0n(BDY(), A0u);
    }

    public C15470nO BDY() {
        return this.A00;
    }
}
