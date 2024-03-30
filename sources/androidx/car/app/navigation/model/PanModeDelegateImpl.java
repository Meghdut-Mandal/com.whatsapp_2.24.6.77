package androidx.car.app.navigation.model;

import X.AnonymousClass001;
import X.B9R;
import X.C132496Ty;
import X.C22758AvT;
import X.C22759AvU;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.model.IPanModeListener;

public class PanModeDelegateImpl implements C22758AvT {
    public final IPanModeListener mStub = null;

    public class PanModeListenerStub extends IPanModeListener.Stub {
        public final C22759AvU mListener;

        public void onPanModeChanged(boolean z, IOnDoneCallback iOnDoneCallback) {
            C132496Ty.A01(iOnDoneCallback, new B9R(1, this, z), "onPanModeChanged");
        }

        /* renamed from: lambda$onPanModeChanged$0$androidx-car-app-navigation-model-PanModeDelegateImpl$PanModeListenerStub  reason: not valid java name */
        public /* synthetic */ Object m40lambda$onPanModeChanged$0$androidxcarappnavigationmodelPanModeDelegateImpl$PanModeListenerStub(boolean z) {
            throw AnonymousClass001.A0A("onPanModeChanged");
        }

        public PanModeListenerStub(C22759AvU avU) {
            this.mListener = avU;
        }
    }
}
