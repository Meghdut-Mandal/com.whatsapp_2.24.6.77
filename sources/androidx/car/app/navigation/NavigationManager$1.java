package androidx.car.app.navigation;

import X.AnonymousClass001;
import X.AnonymousClass01M;
import X.AnonymousClass92W;
import X.B9P;
import X.C132496Ty;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.INavigationManager;

public class NavigationManager$1 extends INavigationManager.Stub {
    public final /* synthetic */ AnonymousClass92W this$0;
    public final /* synthetic */ AnonymousClass01M val$lifecycle;

    public NavigationManager$1(AnonymousClass92W r1, AnonymousClass01M r2) {
        this.this$0 = r1;
        this.val$lifecycle = r2;
    }

    /* renamed from: lambda$onStopNavigation$0$androidx-car-app-navigation-NavigationManager$1  reason: not valid java name */
    public /* synthetic */ Object m39lambda$onStopNavigation$0$androidxcarappnavigationNavigationManager$1() {
        throw AnonymousClass001.A0A("onStopNavigation");
    }

    public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
        C132496Ty.A00(iOnDoneCallback, new B9P(this, 7), this.val$lifecycle, "onStopNavigation");
    }
}
