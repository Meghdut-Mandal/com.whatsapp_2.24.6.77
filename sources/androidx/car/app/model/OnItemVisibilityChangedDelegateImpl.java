package androidx.car.app.model;

import X.AnonymousClass001;
import X.C132496Ty;
import X.C207689wm;
import X.C22744AvF;
import X.C22751AvM;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnItemVisibilityChangedListener;

public class OnItemVisibilityChangedDelegateImpl implements C22751AvM {
    public final IOnItemVisibilityChangedListener mStub = null;

    public class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        public final C22744AvF mListener;

        /* renamed from: lambda$onItemVisibilityChanged$0$androidx-car-app-model-OnItemVisibilityChangedDelegateImpl$OnItemVisibilityChangedListenerStub  reason: not valid java name */
        public /* synthetic */ Object m34lambda$onItemVisibilityChanged$0$androidxcarappmodelOnItemVisibilityChangedDelegateImpl$OnItemVisibilityChangedListenerStub(int i, int i2) {
            throw AnonymousClass001.A0A("onItemVisibilityChanged");
        }

        public void onItemVisibilityChanged(int i, int i2, IOnDoneCallback iOnDoneCallback) {
            C132496Ty.A01(iOnDoneCallback, new C207689wm(this, i, i2), "onItemVisibilityChanged");
        }

        public OnItemVisibilityChangedListenerStub(C22744AvF avF) {
            this.mListener = avF;
        }
    }
}
