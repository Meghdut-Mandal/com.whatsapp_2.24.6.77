package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.AYh  reason: case insensitive filesystem */
public final /* synthetic */ class C21730AYh implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C1692288g A01;
    public final /* synthetic */ A2F A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C21730AYh(CaptureRequest.Builder builder, C1692288g r2, A2F a2f, boolean z) {
        this.A01 = r2;
        this.A00 = builder;
        this.A02 = a2f;
        this.A03 = z;
    }

    public final Object call() {
        C1692288g r0 = this.A01;
        CaptureRequest.Builder builder = this.A00;
        A2F a2f = this.A02;
        boolean z = this.A03;
        C195169St r1 = r0.A02;
        r1.A00();
        AnonymousClass9YE r02 = r1.A01;
        if (r02 != null) {
            r02.A01(builder, a2f);
        }
        C202989n4 r12 = r1.A02;
        if (r12 == null) {
            return null;
        }
        r12.A0B(z, true);
        return null;
    }
}
