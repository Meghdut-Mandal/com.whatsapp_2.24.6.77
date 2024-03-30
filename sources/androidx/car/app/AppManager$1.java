package androidx.car.app;

import X.AnonymousClass001;
import X.AnonymousClass92V;
import X.C90974bF;
import androidx.car.app.IAppManager;

public class AppManager$1 extends IAppManager.Stub {
    public final /* synthetic */ AnonymousClass92V this$0;
    public final /* synthetic */ C90974bF val$carContext;

    public AppManager$1(AnonymousClass92V r1, C90974bF r2) {
        this.this$0 = r1;
        this.val$carContext = r2;
    }

    public static /* synthetic */ Object lambda$onBackPressed$0(C90974bF r0) {
        throw AnonymousClass001.A0A("getOnBackPressedDispatcher");
    }

    public static /* synthetic */ Object lambda$startLocationUpdates$1(C90974bF r0) {
        throw AnonymousClass001.A0A("getCarService");
    }

    public static /* synthetic */ Object lambda$stopLocationUpdates$2(C90974bF r0) {
        throw AnonymousClass001.A0A("getCarService");
    }

    public void getTemplate(IOnDoneCallback iOnDoneCallback) {
        throw AnonymousClass001.A0A("getLifecycle");
    }

    public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
        throw AnonymousClass001.A0A("getLifecycle");
    }

    public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        throw AnonymousClass001.A0A("getPackageManager");
    }

    public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        throw AnonymousClass001.A0A("getLifecycle");
    }
}
