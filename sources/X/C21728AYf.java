package X;

import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.AYf  reason: case insensitive filesystem */
public class C21728AYf implements Callable {
    public final /* synthetic */ AnonymousClass9YE A00;
    public final /* synthetic */ CaptureRequest.Builder A01;
    public final /* synthetic */ A2F A02;
    public final /* synthetic */ B31 A03;

    public C21728AYf(CaptureRequest.Builder builder, AnonymousClass9YE r2, A2F a2f, B31 b31) {
        this.A00 = r2;
        this.A03 = b31;
        this.A01 = builder;
        this.A02 = a2f;
    }

    public /* bridge */ /* synthetic */ Object call() {
        CaptureRequest.Builder builder;
        B31 b31 = this.A03;
        if (b31 == null || (builder = this.A01) == null) {
            return this.A02;
        }
        C165577te.A0v(builder, CaptureRequest.CONTROL_AF_TRIGGER, 1);
        CaptureRequest build = builder.build();
        A2F a2f = this.A02;
        b31.B2a(build, (Handler) null, a2f);
        return a2f;
    }
}
