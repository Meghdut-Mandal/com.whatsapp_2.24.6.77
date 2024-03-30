package X;

/* renamed from: X.0nV  reason: invalid class name and case insensitive filesystem */
public class C15540nV extends AnonymousClass0A5 implements C023609y {
    public final C023509x A00;

    public C15540nV(C023509x r2, C005102h r3) {
        super(r3, true);
        this.A00 = r2;
    }

    public final boolean A0s() {
        return true;
    }

    public void A0h(Object obj) {
        C023509x A01 = AnonymousClass0AA.A01(this.A00);
        if (obj instanceof AnonymousClass0AT) {
            obj = AnonymousClass00C.A02(((AnonymousClass0AT) obj).A00);
        }
        AnonymousClass0AE.A00(obj, A01);
    }

    public void A0y(Object obj) {
        C023509x r1 = this.A00;
        if (obj instanceof AnonymousClass0AT) {
            obj = AnonymousClass00C.A02(((AnonymousClass0AT) obj).A00);
        }
        r1.resumeWith(obj);
    }

    public final C023609y getCallerFrame() {
        C023509x r1 = this.A00;
        if (r1 instanceof C023609y) {
            return (C023609y) r1;
        }
        return null;
    }
}
