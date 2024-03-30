package X;

import androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub;

public class B9M implements AnonymousClass7dU {
    public float A00;
    public float A01;
    public Object A02;
    public final int A03;

    public B9M(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f, float f2, int i) {
        this.A03 = i;
        this.A02 = remoteUtils$SurfaceCallbackStub;
        this.A00 = f;
        this.A01 = f2;
    }

    public final Object B5f() {
        switch (this.A03) {
            case 0:
                throw AnonymousClass001.A0A("onClick");
            case 1:
                throw AnonymousClass001.A0A("onFling");
            default:
                throw AnonymousClass001.A0A("onScroll");
        }
    }
}
