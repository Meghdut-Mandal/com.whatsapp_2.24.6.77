package X;

import androidx.car.app.CarAppBinder;
import androidx.car.app.model.AlertCallbackDelegateImpl;
import androidx.car.app.model.OnClickDelegateImpl;
import androidx.car.app.model.OnContentRefreshDelegateImpl;
import androidx.car.app.navigation.NavigationManager$1;

public class B9P implements AnonymousClass7dU {
    public Object A00;
    public final int A01;

    public B9P(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object B5f() {
        switch (this.A01) {
            case 0:
                ((CarAppBinder) this.A00).m21lambda$onAppPause$3$androidxcarappCarAppBinder();
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 1:
                ((CarAppBinder) this.A00).m22lambda$onAppResume$2$androidxcarappCarAppBinder();
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 2:
                ((CarAppBinder) this.A00).m23lambda$onAppStart$1$androidxcarappCarAppBinder();
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 3:
                ((CarAppBinder) this.A00).m24lambda$onAppStop$4$androidxcarappCarAppBinder();
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 4:
                ((AlertCallbackDelegateImpl.AlertCallbackStub) this.A00).m28lambda$onAlertDismissed$1$androidxcarappmodelAlertCallbackDelegateImpl$AlertCallbackStub();
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 5:
                ((OnClickDelegateImpl.OnClickListenerStub) this.A00).m32lambda$onClick$0$androidxcarappmodelOnClickDelegateImpl$OnClickListenerStub();
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 6:
                ((OnContentRefreshDelegateImpl.OnContentRefreshListenerStub) this.A00).m33lambda$onContentRefreshRequested$0$androidxcarappmodelOnContentRefreshDelegateImpl$OnContentRefreshListenerStub();
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 7:
                ((NavigationManager$1) this.A00).m39lambda$onStopNavigation$0$androidxcarappnavigationNavigationManager$1();
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            default:
                throw AnonymousClass001.A0A("onScale");
        }
    }
}
