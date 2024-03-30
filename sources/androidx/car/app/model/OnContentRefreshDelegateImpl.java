package androidx.car.app.model;

import X.AnonymousClass001;
import X.B9P;
import X.C132496Ty;
import X.C22749AvK;
import X.C22750AvL;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnContentRefreshListener;

public class OnContentRefreshDelegateImpl implements C22749AvK {
    public final IOnContentRefreshListener mListener = null;

    public class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        public final C22750AvL mOnContentRefreshListener;

        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
            C132496Ty.A01(iOnDoneCallback, new B9P(this, 6), "onClick");
        }

        /* renamed from: lambda$onContentRefreshRequested$0$androidx-car-app-model-OnContentRefreshDelegateImpl$OnContentRefreshListenerStub  reason: not valid java name */
        public /* synthetic */ Object m33lambda$onContentRefreshRequested$0$androidxcarappmodelOnContentRefreshDelegateImpl$OnContentRefreshListenerStub() {
            throw AnonymousClass001.A0A("onContentRefreshRequested");
        }

        public OnContentRefreshListenerStub(C22750AvL avL) {
            this.mOnContentRefreshListener = avL;
        }
    }
}
