package X;

/* renamed from: X.0ks  reason: invalid class name and case insensitive filesystem */
public final class C14050ks extends AnonymousClass0A0 implements AnonymousClass05G, C023609y {
    public final C005102h collectContext;
    public final int collectContextSize;
    public final AnonymousClass05G collector;
    public C023509x completion;
    public C005102h lastEmissionContext;

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public C14050ks(C005102h r3, AnonymousClass05G r4) {
        super(C12580iK.A00, C008903u.A00);
        this.collector = r4;
        this.collectContext = r3;
        this.collectContextSize = AnonymousClass000.A0I(r3.fold(0, C14860mJ.A00));
    }

    public C023609y getCallerFrame() {
        C023509x r1 = this.completion;
        if (r1 instanceof C023609y) {
            return (C023609y) r1;
        }
        return null;
    }

    public C005102h getContext() {
        C005102h r0 = this.lastEmissionContext;
        if (r0 == null) {
            return C008903u.A00;
        }
        return r0;
    }

    public Object B6N(Object obj, C023509x r6) {
        IllegalStateException A0g;
        try {
            C005102h context = r6.getContext();
            C07570Yj.A04(context);
            C005102h r2 = this.lastEmissionContext;
            if (r2 != context) {
                if (r2 instanceof C12650iR) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                    A0u.append(((C12650iR) r2).A00);
                    A0u.append(", but then emission attempt of value '");
                    A0u.append(obj);
                    A0g = AnonymousClass001.A09(AnonymousClass091.A01(AnonymousClass000.A0q("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ", A0u)));
                } else if (AnonymousClass000.A0I(context.fold(0, new C14790mC(this))) == this.collectContextSize) {
                    this.lastEmissionContext = context;
                } else {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("Flow invariant is violated:\n\t\tFlow was collected in ");
                    A0u2.append(this.collectContext);
                    A0u2.append(",\n\t\tbut emission happened in ");
                    A0u2.append(context);
                    A0g = AnonymousClass000.A0g(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead", A0u2);
                }
                throw A0g;
            }
            this.completion = r6;
            C019408g r22 = AnonymousClass0RZ.A00;
            AnonymousClass05G r1 = this.collector;
            AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
            Object BKt = r22.BKt(r1, obj, this);
            AnonymousClass0AO r12 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            if (!AnonymousClass00C.A0J(BKt, r12)) {
                this.completion = null;
            }
            if (BKt != r12) {
                return AnonymousClass0AJ.A00;
            }
            return BKt;
        } catch (Throwable th) {
            this.lastEmissionContext = new C12650iR(r6.getContext(), th);
            throw th;
        }
    }

    public Object invokeSuspend(Object obj) {
        Throwable A00 = AnonymousClass0AK.A00(obj);
        if (A00 != null) {
            C005102h r1 = this.lastEmissionContext;
            if (r1 == null) {
                r1 = C008903u.A00;
            }
            this.lastEmissionContext = new C12650iR(r1, A00);
        }
        C023509x r0 = this.completion;
        if (r0 != null) {
            r0.resumeWith(obj);
        }
        return AnonymousClass0AO.COROUTINE_SUSPENDED;
    }
}
