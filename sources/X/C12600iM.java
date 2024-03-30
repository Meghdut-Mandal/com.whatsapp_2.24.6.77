package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0iM  reason: invalid class name and case insensitive filesystem */
public final class C12600iM implements C023509x, C023609y {
    public static final AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(C12600iM.class, Object.class, "result");
    public final C023509x A00;
    public volatile Object result;

    public final Object A00() {
        Object obj = this.result;
        AnonymousClass0AO r2 = AnonymousClass0AO.UNDECIDED;
        if (obj == r2) {
            if (!AnonymousClass0A8.A00(this, r2, AnonymousClass0AO.COROUTINE_SUSPENDED, A01)) {
                obj = this.result;
            }
            return AnonymousClass0AO.COROUTINE_SUSPENDED;
        }
        if (obj != AnonymousClass0AO.RESUMED) {
            if (!(obj instanceof AnonymousClass03N)) {
                return obj;
            }
            throw ((AnonymousClass03N) obj).exception;
        }
        return AnonymousClass0AO.COROUTINE_SUSPENDED;
    }

    public C023609y getCallerFrame() {
        C023509x r1 = this.A00;
        if (r1 instanceof C023609y) {
            return (C023609y) r1;
        }
        return null;
    }

    public C005102h getContext() {
        return this.A00.getContext();
    }

    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            AnonymousClass0AO r1 = AnonymousClass0AO.UNDECIDED;
            if (obj2 != r1) {
                AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
                if (obj2 == r2) {
                    if (AnonymousClass0A8.A00(this, r2, AnonymousClass0AO.RESUMED, A01)) {
                        this.A00.resumeWith(obj);
                        return;
                    }
                } else {
                    throw AnonymousClass001.A09("Already resumed");
                }
            } else if (AnonymousClass0A8.A00(this, r1, obj, A01)) {
                return;
            }
        }
    }

    public C12600iM(Object obj, C023509x r2) {
        this.A00 = r2;
        this.result = obj;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SafeContinuation for ");
        return AnonymousClass000.A0o(this.A00, A0u);
    }

    public C12600iM(C023509x r2) {
        this(AnonymousClass0AO.UNDECIDED, r2);
    }
}
