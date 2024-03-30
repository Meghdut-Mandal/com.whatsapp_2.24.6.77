package X;

public abstract class AI8 implements C236119d {
    public final Object A00;
    public final C006302t A01;

    public abstract Object A00(C203399nx r1, Object obj);

    public abstract Object A01(C203399nx r1, Object obj);

    public void BVN(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A01.invoke(new C187028x7(this.A00, new C52812qD(str)));
    }

    public void BWw(C203399nx r5, String str) {
        AnonymousClass00C.A0D(r5, 1);
        C006302t r3 = this.A01;
        Object obj = this.A00;
        r3.invoke(new C187018x6(obj, A00(r5, obj)));
    }

    public void BiM(C203399nx r5, String str) {
        AnonymousClass00C.A0D(r5, 1);
        C006302t r3 = this.A01;
        Object obj = this.A00;
        r3.invoke(new C187048x9(obj, A01(r5, obj)));
    }

    public AI8(C006302t r1, Object obj) {
        this.A00 = obj;
        this.A01 = r1;
    }
}
