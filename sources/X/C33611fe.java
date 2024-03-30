package X;

import java.io.File;

/* renamed from: X.1fe  reason: invalid class name and case insensitive filesystem */
public abstract class C33611fe {
    public AnonymousClass6CW A00;
    public final AnonymousClass17Y A01;
    public final C20050ww A02;
    public final C19630wG A03;
    public final AnonymousClass13E A04;

    public synchronized AnonymousClass6CW A00() {
        AnonymousClass6CW r0;
        r0 = this.A00;
        if (r0 == null) {
            AnonymousClass658 r2 = new AnonymousClass658(this.A01, this.A02, this.A04, new File(this.A03.A00.getCacheDir(), A01()), "payments-image");
            r2.A01 = 16777216;
            r2.A05 = true;
            r0 = r2.A01();
            this.A00 = r0;
        }
        return r0;
    }

    public C33611fe(AnonymousClass17Y r1, C20050ww r2, C19630wG r3, AnonymousClass13E r4) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
    }

    public String A01() {
        return "payment_merchant_image_cache";
    }
}
