package X;

/* renamed from: X.A0t  reason: case insensitive filesystem */
public class C20960A0t implements C22865AxK {
    public Object A00;
    public boolean A01 = false;
    public final C22865AxK A02;

    public Object get() {
        if (!this.A01) {
            this.A00 = this.A02.get();
            this.A01 = true;
        }
        return this.A00;
    }

    public C20960A0t(C22865AxK axK) {
        this.A02 = axK;
    }
}
