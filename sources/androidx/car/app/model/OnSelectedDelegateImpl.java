package androidx.car.app.model;

import X.AnonymousClass001;
import X.B9O;
import X.C132496Ty;
import X.C22745AvG;
import X.C22752AvN;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnSelectedListener;

public class OnSelectedDelegateImpl implements C22752AvN {
    public final IOnSelectedListener mStub = null;

    public class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        public final C22745AvG mListener;

        public void onSelected(int i, IOnDoneCallback iOnDoneCallback) {
            C132496Ty.A01(iOnDoneCallback, new B9O(this, i, 1), "onSelectedListener");
        }

        /* renamed from: lambda$onSelected$0$androidx-car-app-model-OnSelectedDelegateImpl$OnSelectedListenerStub  reason: not valid java name */
        public /* synthetic */ Object m35lambda$onSelected$0$androidxcarappmodelOnSelectedDelegateImpl$OnSelectedListenerStub(int i) {
            throw AnonymousClass001.A0A("onSelected");
        }

        public OnSelectedListenerStub(C22745AvG avG) {
            this.mListener = avG;
        }
    }
}
