package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import androidx.car.app.CarAppBinder;
import androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub;

public class B9N implements AnonymousClass7dU {
    public Object A00;
    public Object A01;
    public final int A02;

    public B9N(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final Object B5f() {
        int i = this.A02;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ((CarAppBinder) obj).m26lambda$onNewIntent$5$androidxcarappCarAppBinder((Intent) this.A01);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 1:
                ((CarAppBinder) obj).m25lambda$onConfigurationChanged$6$androidxcarappCarAppBinder((Configuration) this.A01);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 2:
                ((RemoteUtils$SurfaceCallbackStub) obj).m45lambda$onStableAreaChanged$2$androidxcarapputilsRemoteUtils$SurfaceCallbackStub((Rect) this.A01);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 3:
                ((RemoteUtils$SurfaceCallbackStub) obj).m48lambda$onVisibleAreaChanged$1$androidxcarapputilsRemoteUtils$SurfaceCallbackStub((Rect) this.A01);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 4:
                ((RemoteUtils$SurfaceCallbackStub) obj).m46lambda$onSurfaceAvailable$0$androidxcarapputilsRemoteUtils$SurfaceCallbackStub((C134946bs) this.A01);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            default:
                ((RemoteUtils$SurfaceCallbackStub) obj).m47lambda$onSurfaceDestroyed$3$androidxcarapputilsRemoteUtils$SurfaceCallbackStub((C134946bs) this.A01);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }
}
