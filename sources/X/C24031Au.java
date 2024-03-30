package X;

/* renamed from: X.1Au  reason: invalid class name and case insensitive filesystem */
public class C24031Au {
    public final C21010yW A00;
    public final C24021At A01;

    public void A00() {
        C24021At r5 = this.A01;
        synchronized (r5.A02) {
            C24021At.A00(r5).edit().putInt("sticker_pack_delete_count", C24021At.A00(r5).getInt("sticker_pack_delete_count", 0) + 1).apply();
        }
    }

    public C24031Au(C21010yW r1, C24021At r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
