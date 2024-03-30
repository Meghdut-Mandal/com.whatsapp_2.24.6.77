package X;

/* renamed from: X.0A5  reason: invalid class name */
public abstract class AnonymousClass0A5 extends C007503f implements C023509x, C007403e, AnonymousClass040 {
    public final C005102h A00;

    public void A0z(Object obj) {
    }

    public void A10(Throwable th, boolean z) {
    }

    public String A0b() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" was cancelled");
        return sb.toString();
    }

    public final void A0i(Object obj) {
        if (obj instanceof AnonymousClass0AT) {
            AnonymousClass0AT r3 = (AnonymousClass0AT) obj;
            A10(r3.A00, r3.A00());
            return;
        }
        A0z(obj);
    }

    public final void A0k(Throwable th) {
        C05720Qu.A00(this.A00, th);
    }

    public AnonymousClass0A5(C005102h r2, boolean z) {
        super(z);
        A0n((C007403e) r2.get(C007403e.A00));
        this.A00 = r2.plus(this);
    }

    public String A0a() {
        return super.A0a();
    }

    public final void A0x(Integer num, Object obj, C009003v r7) {
        C005102h context;
        Object A002;
        int intValue = num.intValue();
        if (intValue == 0) {
            AnonymousClass0A9.A00(obj, this, r7);
        } else if (intValue == 2) {
            AnonymousClass00C.A0D(r7, 0);
            AnonymousClass0AA.A01(AnonymousClass0AA.A00(obj, this, r7)).resumeWith(AnonymousClass0AJ.A00);
        } else if (intValue == 3) {
            try {
                context = getContext();
                A002 = AnonymousClass0AF.A00((Object) null, context);
                C07710Yz.A03(r7, 2);
                Object invoke = r7.invoke(obj, this);
                AnonymousClass0AF.A01(A002, context);
                if (invoke != AnonymousClass0AO.COROUTINE_SUSPENDED) {
                    resumeWith(invoke);
                }
            } catch (Throwable th) {
                resumeWith(new AnonymousClass03N(th));
            }
        } else if (intValue != 1) {
            throw new C13180jS();
        }
    }

    public final void resumeWith(Object obj) {
        Throwable A002 = AnonymousClass0AK.A00(obj);
        if (A002 != null) {
            obj = new AnonymousClass0AT(A002);
        }
        Object A0Y = A0Y(obj);
        if (A0Y != C007803i.A00) {
            A0y(A0Y);
        }
    }

    public void A0y(Object obj) {
        A0h(obj);
    }

    public C005102h BAE() {
        return this.A00;
    }

    public final C005102h getContext() {
        return this.A00;
    }
}
