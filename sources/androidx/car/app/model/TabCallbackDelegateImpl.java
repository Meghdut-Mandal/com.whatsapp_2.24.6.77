package androidx.car.app.model;

import X.AnonymousClass001;
import X.B9Q;
import X.C132496Ty;
import X.C22755AvQ;
import X.C22756AvR;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ITabCallback;

public class TabCallbackDelegateImpl implements C22755AvQ {
    public final ITabCallback mStubCallback = null;

    public class TabCallbackStub extends ITabCallback.Stub {
        public final C22756AvR mCallback;

        public void onTabSelected(String str, IOnDoneCallback iOnDoneCallback) {
            C132496Ty.A01(iOnDoneCallback, new B9Q(4, str, this), "onTabSelected");
        }

        /* renamed from: lambda$onTabSelected$0$androidx-car-app-model-TabCallbackDelegateImpl$TabCallbackStub  reason: not valid java name */
        public /* synthetic */ Object m38lambda$onTabSelected$0$androidxcarappmodelTabCallbackDelegateImpl$TabCallbackStub(String str) {
            throw AnonymousClass001.A0A("onTabSelected");
        }

        public TabCallbackStub(C22756AvR avR) {
            this.mCallback = avR;
        }
    }
}
