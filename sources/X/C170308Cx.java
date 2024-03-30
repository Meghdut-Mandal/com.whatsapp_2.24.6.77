package X;

/* renamed from: X.8Cx  reason: invalid class name and case insensitive filesystem */
public abstract class C170308Cx extends C21013A3b {
    public AnonymousClass8DG A00;
    public boolean A01 = false;
    public final AnonymousClass8DG A02;

    public C170308Cx(AnonymousClass8DG r2) {
        this.A02 = r2;
        this.A00 = (AnonymousClass8DG) r2.A06(4);
    }

    public final /* synthetic */ AnonymousClass8DG Bya() {
        return this.A02;
    }

    public /* synthetic */ AnonymousClass8DG A00() {
        if (!this.A01) {
            AnonymousClass8DG r1 = this.A00;
            C165597tg.A0J(r1).Byd(r1);
            this.A01 = true;
        }
        return this.A00;
    }

    public void A01() {
        if (this.A01) {
            AnonymousClass8DG r2 = (AnonymousClass8DG) this.A00.A06(4);
            C165597tg.A0J(r2).Bye(r2, this.A00);
            this.A00 = r2;
            this.A01 = false;
        }
    }

    public /* synthetic */ Object clone() {
        C170308Cx r3 = (C170308Cx) this.A02.A06(5);
        AnonymousClass8DG A002 = A00();
        r3.A01();
        AnonymousClass8DG r1 = r3.A00;
        C165597tg.A0J(r1).Bye(r1, A002);
        return r3;
    }
}
