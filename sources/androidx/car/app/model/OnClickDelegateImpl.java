package androidx.car.app.model;

import X.AnonymousClass001;
import X.B9P;
import X.C132496Ty;
import X.C22747AvI;
import X.C22748AvJ;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnClickListener;

public class OnClickDelegateImpl implements C22747AvI {
    public final boolean mIsParkedOnly = false;
    public final IOnClickListener mListener = null;

    public class OnClickListenerStub extends IOnClickListener.Stub {
        public final C22748AvJ mOnClickListener;

        public void onClick(IOnDoneCallback iOnDoneCallback) {
            C132496Ty.A01(iOnDoneCallback, new B9P(this, 5), "onClick");
        }

        /* renamed from: lambda$onClick$0$androidx-car-app-model-OnClickDelegateImpl$OnClickListenerStub  reason: not valid java name */
        public /* synthetic */ Object m32lambda$onClick$0$androidxcarappmodelOnClickDelegateImpl$OnClickListenerStub() {
            throw AnonymousClass001.A0A("onClick");
        }

        public OnClickListenerStub(C22748AvJ avJ) {
            this.mOnClickListener = avJ;
        }
    }
}
