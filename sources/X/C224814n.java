package X;

/* renamed from: X.14n  reason: invalid class name and case insensitive filesystem */
public abstract class C224814n extends AnonymousClass01L implements C18700tb {
    public boolean A00 = false;
    public final Object A01 = new Object();
    public volatile C27011Mj A02;

    private void A0N() {
        A1e(new C36051jg(this, 4));
    }

    /* renamed from: A2E */
    public final C27011Mj A2H() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C27011Mj(this);
                }
            }
        }
        return this.A02;
    }

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            A2H().generatedComponent();
        }
    }

    public void A2G() {
        new C27011Mj(this);
    }

    public C224814n(int i) {
        super(i);
        A0N();
    }

    public AnonymousClass04G BAw() {
        return C28721Tt.A00(this, super.BAw());
    }

    public final Object generatedComponent() {
        return A2H().generatedComponent();
    }

    public C224814n() {
        A0N();
    }
}
