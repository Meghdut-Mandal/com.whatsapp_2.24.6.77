package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0AD  reason: invalid class name */
public final class AnonymousClass0AD extends AnonymousClass0AC implements C023509x, C023609y {
    public static final AtomicReferenceFieldUpdater A04 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass0AD.class, Object.class, "_reusableCancellableContinuation");
    public Object A00 = AnonymousClass0AE.A01;
    public final Object A01;
    public final C023509x A02;
    public final C005502l A03;
    public volatile Object _reusableCancellableContinuation;

    public AnonymousClass0AD(C023509x r4, C005502l r5) {
        super(-1);
        this.A03 = r5;
        this.A02 = r4;
        Object fold = r4.getContext().fold(0, AnonymousClass0AF.A00);
        AnonymousClass00C.A0B(fold);
        this.A01 = fold;
    }

    public C005102h getContext() {
        return this.A02.getContext();
    }

    public Object A0B() {
        Object obj = this.A00;
        this.A00 = AnonymousClass0AE.A01;
        return obj;
    }

    public C023609y getCallerFrame() {
        C023509x r1 = this.A02;
        if (r1 instanceof C023609y) {
            return (C023609y) r1;
        }
        return null;
    }

    public void resumeWith(Object obj) {
        C005102h context;
        Object A002;
        C023509x r9 = this.A02;
        C005102h context2 = r9.getContext();
        Object obj2 = obj;
        Throwable A003 = AnonymousClass0AK.A00(obj);
        if (A003 != null) {
            obj2 = new AnonymousClass0AT(A003);
        }
        C005502l r1 = this.A03;
        if (r1.A04(context2)) {
            this.A00 = obj2;
            this.A00 = 0;
            r1.A03(this, context2);
            return;
        }
        AnonymousClass03G A004 = AnonymousClass0AL.A00();
        long j = A004.A00;
        if (j >= 4294967296L) {
            this.A00 = obj2;
            this.A00 = 0;
            A004.A07(this);
            return;
        }
        A004.A00 = j + 4294967296L;
        try {
            context = r9.getContext();
            A002 = AnonymousClass0AF.A00(this.A01, context);
            r9.resumeWith(obj);
            AnonymousClass0AF.A01(A002, context);
            do {
            } while (A004.A09());
        } catch (Throwable th) {
            try {
                A0A(th, (Throwable) null);
            } catch (Throwable th2) {
                A004.A08(true);
                throw th2;
            }
        }
        A004.A08(true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispatchedContinuation[");
        sb.append(this.A03);
        sb.append(", ");
        sb.append(C05730Qv.A00(this.A02));
        sb.append(']');
        return sb.toString();
    }

    public void A0F(Object obj, Throwable th) {
    }

    public C023509x A0E() {
        return this;
    }
}
