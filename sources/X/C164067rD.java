package X;

/* renamed from: X.7rD  reason: invalid class name and case insensitive filesystem */
public class C164067rD implements B2S {
    public Object A00;
    public final int A01;

    public C164067rD(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BVK() {
        if (this.A01 != 0) {
            ((C160057kO) this.A00).BVK();
        }
    }

    public void BWk(Exception exc) {
        if (this.A01 != 0) {
            AnonymousClass00C.A0D(exc, 0);
            ((C160057kO) this.A00).BWk(exc);
        }
    }

    public void Bi5(AnonymousClass6OQ r3) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            ((C160057kO) obj).Bi5(r3);
        } else {
            ((AnonymousClass1UC) ((C30471aG) obj).A04.get()).A09();
        }
    }
}
