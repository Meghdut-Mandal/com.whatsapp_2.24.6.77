package X;

/* renamed from: X.1yV  reason: invalid class name and case insensitive filesystem */
public class C42241yV implements AnonymousClass00P, C006302t {
    public Object A00;
    public final int A01;

    public C42241yV(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object invoke(Object obj) {
        boolean z;
        switch (this.A01) {
            case 0:
                z = ((AnonymousClass3QK) obj).A02.equals(this.A00);
                break;
            case 1:
                z = ((AnonymousClass1HX) this.A00).A08((AnonymousClass3T1) obj);
                break;
            default:
                ((C19700wN) this.A00).A0E("participant-attribute-parser", ((AnonymousClass3HV) obj).A00, false);
                return null;
        }
        return Boolean.valueOf(z);
    }
}
