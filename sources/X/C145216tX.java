package X;

/* renamed from: X.6tX  reason: invalid class name and case insensitive filesystem */
public class C145216tX implements C160427kz {
    public final /* synthetic */ C17790s2 A00;
    public final /* synthetic */ C29931Yo A01;

    public C145216tX(C17790s2 r1, C29931Yo r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BWm(Integer num) {
        this.A00.BWY();
    }

    public void BjA(Integer num) {
        this.A00.Bj9();
    }

    public void onSuccess() {
        C29931Yo r4 = this.A01;
        C19420v0 r3 = r4.A0C.A01;
        C36341k9.A0v(C19420v0.A00(r3), "payment_background_backoff_attempt", 0);
        C36341k9.A0u(C19420v0.A00(r3), "payment_backgrounds_backoff_timestamp");
        r3.A1Z("payment_backgrounds_last_fetch_timestamp");
        r4.A0D.Boy(new AVb(this, this.A00, 13));
    }

    public void BQX() {
    }
}
