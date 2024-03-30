package X;

/* renamed from: X.7rB  reason: invalid class name and case insensitive filesystem */
public class C164047rB implements B2S {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C164047rB(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A03 = obj;
        this.A00 = obj4;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    public void BVK() {
        switch (this.A04) {
            case 0:
                AnonymousClass6MY.A00((AnonymousClass6MY) this.A03, (C158077fl) this.A01, this.A00);
                return;
            case 1:
                Object obj = this.A00;
                C158077fl r2 = (C158077fl) this.A01;
                AnonymousClass17Y r1 = ((C130016Jj) this.A03).A00;
                if (r1 != null) {
                    r1.Bp3(AnonymousClass74N.A00(obj, r2, 38));
                    return;
                }
                throw C36321k7.A06();
            default:
                ((C160217ke) this.A01).BfE((C122855vX) this.A02);
                return;
        }
    }

    public void BWk(Exception exc) {
        switch (this.A04) {
            case 0:
                AnonymousClass6MY.A00((AnonymousClass6MY) this.A03, (C158077fl) this.A01, this.A00);
                return;
            case 1:
                Object obj = this.A00;
                C158077fl r2 = (C158077fl) this.A01;
                AnonymousClass17Y r1 = ((C130016Jj) this.A03).A00;
                if (r1 != null) {
                    r1.Bp3(AnonymousClass74N.A00(obj, r2, 38));
                    return;
                }
                throw C36321k7.A06();
            default:
                ((C160217ke) this.A01).BfE((C122855vX) this.A02);
                return;
        }
    }

    public void Bi5(AnonymousClass6OQ r5) {
        Object obj;
        Object obj2;
        AnonymousClass17Y r1;
        int i;
        int i2 = this.A04;
        Object obj3 = this.A03;
        switch (i2) {
            case 0:
                obj = this.A00;
                obj2 = this.A02;
                r1 = ((AnonymousClass6MY) obj3).A00;
                if (r1 != null) {
                    i = 34;
                    break;
                } else {
                    throw C36321k7.A06();
                }
            case 1:
                obj = this.A00;
                obj2 = this.A02;
                r1 = ((C130016Jj) obj3).A00;
                if (r1 != null) {
                    i = 37;
                    break;
                } else {
                    throw C36321k7.A06();
                }
            default:
                C36411kG.A1O(obj3);
                return;
        }
        r1.Bp3(AnonymousClass74N.A00(obj, obj2, i));
    }
}
