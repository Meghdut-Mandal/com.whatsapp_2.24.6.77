package androidx.car.app.utils;

import X.AnonymousClass001;
import X.AnonymousClass01M;
import X.AnonymousClass6HW;
import X.Av9;
import X.B9M;
import X.B9N;
import X.B9P;
import X.C132496Ty;
import X.C134946bs;
import X.C1502274l;
import android.graphics.Rect;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;

public class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {
    public final AnonymousClass01M mLifecycle;
    public final Av9 mSurfaceCallback;

    /* renamed from: lambda$onClick$7$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub  reason: not valid java name */
    public /* synthetic */ Object m41lambda$onClick$7$androidxcarapputilsRemoteUtils$SurfaceCallbackStub(float f, float f2) {
        throw AnonymousClass001.A0A("onClick");
    }

    /* renamed from: lambda$onFling$5$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub  reason: not valid java name */
    public /* synthetic */ Object m42lambda$onFling$5$androidxcarapputilsRemoteUtils$SurfaceCallbackStub(float f, float f2) {
        throw AnonymousClass001.A0A("onFling");
    }

    /* renamed from: lambda$onScale$6$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub  reason: not valid java name */
    public /* synthetic */ Object m43lambda$onScale$6$androidxcarapputilsRemoteUtils$SurfaceCallbackStub(float f, float f2, float f3) {
        throw AnonymousClass001.A0A("onScale");
    }

    /* renamed from: lambda$onScroll$4$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub  reason: not valid java name */
    public /* synthetic */ Object m44lambda$onScroll$4$androidxcarapputilsRemoteUtils$SurfaceCallbackStub(float f, float f2) {
        throw AnonymousClass001.A0A("onScroll");
    }

    /* renamed from: lambda$onStableAreaChanged$2$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub  reason: not valid java name */
    public /* synthetic */ Object m45lambda$onStableAreaChanged$2$androidxcarapputilsRemoteUtils$SurfaceCallbackStub(Rect rect) {
        throw AnonymousClass001.A0A("onStableAreaChanged");
    }

    /* renamed from: lambda$onVisibleAreaChanged$1$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub  reason: not valid java name */
    public /* synthetic */ Object m48lambda$onVisibleAreaChanged$1$androidxcarapputilsRemoteUtils$SurfaceCallbackStub(Rect rect) {
        throw AnonymousClass001.A0A("onVisibleAreaChanged");
    }

    public void onClick(float f, float f2) {
        AnonymousClass6HW.A00(new C1502274l(this.mLifecycle, new B9M(this, f, f2, 0), "onClick", 2));
    }

    public void onFling(float f, float f2) {
        AnonymousClass6HW.A00(new C1502274l(this.mLifecycle, new B9M(this, f, f2, 1), "onFling", 2));
    }

    public void onScale(float f, float f2, float f3) {
        AnonymousClass6HW.A00(new C1502274l(this.mLifecycle, new B9P(this, 8), "onScale", 2));
    }

    public void onScroll(float f, float f2) {
        AnonymousClass6HW.A00(new C1502274l(this.mLifecycle, new B9M(this, f, f2, 2), "onScroll", 2));
    }

    public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        C132496Ty.A00(iOnDoneCallback, new B9N(rect, this, 2), this.mLifecycle, "onStableAreaChanged");
    }

    public void onSurfaceAvailable(C134946bs r4, IOnDoneCallback iOnDoneCallback) {
        C132496Ty.A00(iOnDoneCallback, new B9N(r4, this, 4), this.mLifecycle, "onSurfaceAvailable");
    }

    public void onSurfaceDestroyed(C134946bs r4, IOnDoneCallback iOnDoneCallback) {
        C132496Ty.A00(iOnDoneCallback, new B9N(r4, this, 5), this.mLifecycle, "onSurfaceDestroyed");
    }

    public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        C132496Ty.A00(iOnDoneCallback, new B9N(rect, this, 3), this.mLifecycle, "onVisibleAreaChanged");
    }

    public RemoteUtils$SurfaceCallbackStub(AnonymousClass01M r1, Av9 av9) {
        this.mLifecycle = r1;
        this.mSurfaceCallback = av9;
    }

    /* renamed from: lambda$onSurfaceAvailable$0$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub  reason: not valid java name */
    public /* synthetic */ Object m46lambda$onSurfaceAvailable$0$androidxcarapputilsRemoteUtils$SurfaceCallbackStub(C134946bs r2) {
        r2.A00();
        throw AnonymousClass001.A0A("onSurfaceAvailable");
    }

    /* renamed from: lambda$onSurfaceDestroyed$3$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub  reason: not valid java name */
    public /* synthetic */ Object m47lambda$onSurfaceDestroyed$3$androidxcarapputilsRemoteUtils$SurfaceCallbackStub(C134946bs r2) {
        r2.A00();
        throw AnonymousClass001.A0A("onSurfaceDestroyed");
    }
}
