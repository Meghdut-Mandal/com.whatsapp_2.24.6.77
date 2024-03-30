package X;

/* renamed from: X.B7o  reason: case insensitive filesystem */
public class C23154B7o implements C23054B2a {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23154B7o(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void BUT(C175698au r4) {
        if (this.A02 != 0) {
            ((C167547yF) this.A00).A00.A0D(new AnonymousClass00I(r4, this.A01));
        } else if (r4 == null || C202349ld.A02(r4.A01)) {
            ((C23054B2a) this.A01).BWg(C202059ky.A00());
        } else {
            ((C195479Ul) this.A00).A07.A0I(r4.A01, r4.A02);
            ((C23054B2a) this.A01).BUT(r4);
        }
    }

    public void BWg(C202059ky r4) {
        if (this.A02 != 0) {
            ((C167547yF) this.A00).A01.A0D(new AnonymousClass00I(r4, this.A01));
        } else {
            ((C23054B2a) this.A01).BWg(r4);
        }
    }

    public /* synthetic */ void Bbl(AnonymousClass9XA r4) {
        if (this.A02 != 0) {
            ((C167547yF) this.A00).A02.A0D(new AnonymousClass00I(r4, this.A01));
        }
    }
}
