package X;

import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: X.09Q  reason: invalid class name */
public class AnonymousClass09Q extends AnonymousClass09P {
    public final WindowInsets.Builder A00;

    public void A02(AnonymousClass09T r3) {
        this.A00.setMandatorySystemGestureInsets(r3.A03());
    }

    public void A03(AnonymousClass09T r3) {
        this.A00.setSystemGestureInsets(r3.A03());
    }

    public void A04(AnonymousClass09T r3) {
        this.A00.setTappableElementInsets(r3.A03());
    }

    public void A05(AnonymousClass09T r3) {
        this.A00.setStableInsets(r3.A03());
    }

    public void A06(AnonymousClass09T r3) {
        this.A00.setSystemWindowInsets(r3.A03());
    }

    public AnonymousClass09Q(AnonymousClass09H r3) {
        super(r3);
        WindowInsets.Builder builder;
        WindowInsets A06 = r3.A06();
        if (A06 == null) {
            builder = new WindowInsets.Builder();
        }
        this.A00 = builder;
    }

    public AnonymousClass09H A00() {
        A01();
        WindowInsets build = this.A00.build();
        AnonymousClass09H r0 = AnonymousClass09H.A01;
        Objects.requireNonNull(build);
        AnonymousClass09H r2 = new AnonymousClass09H(build);
        r2.A00.A0H(this.A00);
        return r2;
    }

    public AnonymousClass09Q() {
        this.A00 = new WindowInsets.Builder();
    }
}
