package X;

/* renamed from: X.7rA  reason: invalid class name and case insensitive filesystem */
public class C164037rA implements B2S {
    public Object A00;
    public Object A01;
    public final int A02;

    public C164037rA(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public void BVK() {
        switch (this.A02) {
            case 0:
                ((C160227kf) this.A00).BVK();
                return;
            case 1:
                ((C160087kR) this.A00).BVL(C90524aI.A0X("network error while creating user"));
                return;
            case 2:
                ((C160087kR) this.A00).BVL(C90524aI.A0X("network error while refreshing token"));
                C21430zE r3 = ((C146046uw) this.A01).A05;
                r3.markerAnnotate(386138113, "exception", "IOException");
                r3.markerEnd(386138113, 3);
                return;
            default:
                ((C160057kO) this.A00).BWk((Exception) this.A01);
                return;
        }
    }

    public void BWk(Exception exc) {
        switch (this.A02) {
            case 0:
                AnonymousClass00C.A0D(exc, 0);
                ((C160227kf) this.A00).BWl(exc, (Integer) null);
                return;
            case 3:
                AnonymousClass00C.A0D(exc, 0);
                ((C160057kO) this.A00).BWk(exc);
                return;
            default:
                AnonymousClass00C.A0D(exc, 0);
                C160087kR r1 = (C160087kR) this.A00;
                if (((C146046uw) this.A01).A03 != null) {
                    exc = new AnonymousClass5V1(exc);
                }
                r1.BWk(exc);
                return;
        }
    }

    public void Bi5(AnonymousClass6OQ r6) {
        switch (this.A02) {
            case 0:
                ((AnonymousClass737) this.A01).run();
                return;
            case 1:
                C146046uw r4 = (C146046uw) this.A01;
                if (r6 != null) {
                    r4.A04.B3w((String) C135086c7.A00(r6.A02)).Blp(new AnonymousClass7OV(r6, r4, (C160087kR) this.A00, 0));
                    return;
                }
                throw C36381kD.A0l();
            case 2:
                C146046uw r42 = (C146046uw) this.A01;
                C158287gg r1 = r42.A04;
                if (r6 != null) {
                    r1.B3w((String) C135086c7.A00(r6.A02)).Blp(new C139346jd(this.A00, r42, 2));
                    return;
                }
                throw C36381kD.A0l();
            default:
                ((C160057kO) this.A00).BWk((Exception) this.A01);
                return;
        }
    }
}
