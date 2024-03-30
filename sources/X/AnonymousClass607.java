package X;

/* renamed from: X.607  reason: invalid class name */
public abstract class AnonymousClass607 {
    public final C137096fa A00;

    public C157597dn A01(C157597dn r3, Object obj) {
        if (!(this instanceof C93544gk)) {
            C93554gl r1 = (C93554gl) this;
            if (r3 == null || !(r3 instanceof C161547n5)) {
                C157587dm r12 = r1.A00;
                AnonymousClass00T r0 = C113525fg.A01;
                return new C93994hT(r12, obj);
            }
            ((C161547n5) r3).setValue(obj);
            return r3;
        } else if (r3 == null || !AnonymousClass00C.A0J(r3.getValue(), obj)) {
            return new C137136fe(obj);
        } else {
            return r3;
        }
    }

    public AnonymousClass607(AnonymousClass00S r2) {
        this.A00 = new C137096fa(r2);
    }
}
