package X;

/* renamed from: X.6eA  reason: invalid class name and case insensitive filesystem */
public final class C136306eA implements AnonymousClass7dW {
    public final float A00;
    public final Object A01;

    public /* bridge */ /* synthetic */ C160547lB BxH(C156857b4 r4) {
        C129076Ev A002;
        float f = this.A00;
        Object obj = this.A01;
        if (obj == null) {
            A002 = null;
        } else {
            A002 = C136386eJ.A00(r4, obj);
        }
        return new C136396eK(A002, f);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C136306eA)) {
            return false;
        }
        C136306eA r4 = (C136306eA) obj;
        if (r4.A00 != this.A00 || !AnonymousClass00C.A0J(r4.A01, this.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(C90474aD.A02(AnonymousClass000.A0J(this.A01) * 31, 1.0f), this.A00);
    }

    public C136306eA(Object obj, float f) {
        this.A00 = f;
        this.A01 = obj;
    }

    public C136306eA() {
        this((Object) null, 1500.0f);
    }
}
