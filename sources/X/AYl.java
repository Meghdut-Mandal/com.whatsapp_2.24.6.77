package X;

import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

public final /* synthetic */ class AYl implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ CameraManager A03;
    public final /* synthetic */ CaptureRequest.Builder A04;
    public final /* synthetic */ AnonymousClass61X A05;
    public final /* synthetic */ C199599fa A06;
    public final /* synthetic */ A2F A07;
    public final /* synthetic */ B43 A08;
    public final /* synthetic */ C198749e8 A09;
    public final /* synthetic */ Integer A0A;
    public final /* synthetic */ boolean A0B;

    public /* synthetic */ AYl(CameraManager cameraManager, CaptureRequest.Builder builder, AnonymousClass61X r3, C199599fa r4, A2F a2f, B43 b43, C198749e8 r7, Integer num, int i, int i2, int i3, boolean z) {
        this.A06 = r4;
        this.A09 = r7;
        this.A03 = cameraManager;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A0A = num;
        this.A04 = builder;
        this.A08 = b43;
        this.A0B = z;
        this.A07 = a2f;
        this.A05 = r3;
    }

    public final Object call() {
        C199599fa r0 = this.A06;
        C198749e8 r6 = this.A09;
        CameraManager cameraManager = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        Integer num = this.A0A;
        CaptureRequest.Builder builder = this.A04;
        B43 b43 = this.A08;
        boolean z = this.A0B;
        r0.A02(cameraManager, builder, this.A05, this.A07, b43, r6, num, i, i2, i3, z);
        return null;
    }
}
