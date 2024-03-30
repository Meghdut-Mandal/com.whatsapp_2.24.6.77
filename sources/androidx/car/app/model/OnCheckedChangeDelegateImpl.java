package androidx.car.app.model;

import X.AnonymousClass001;
import X.B9R;
import X.C132496Ty;
import X.C22746AvH;
import X.C22757AvS;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnCheckedChangeListener;

public class OnCheckedChangeDelegateImpl implements C22746AvH {
    public final IOnCheckedChangeListener mStub = null;

    public class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        public final C22757AvS mListener;

        public void onCheckedChange(boolean z, IOnDoneCallback iOnDoneCallback) {
            C132496Ty.A01(iOnDoneCallback, new B9R(0, this, z), "onCheckedChange");
        }

        /* renamed from: lambda$onCheckedChange$0$androidx-car-app-model-OnCheckedChangeDelegateImpl$OnCheckedChangeListenerStub  reason: not valid java name */
        public /* synthetic */ Object m31lambda$onCheckedChange$0$androidxcarappmodelOnCheckedChangeDelegateImpl$OnCheckedChangeListenerStub(boolean z) {
            throw AnonymousClass001.A0A("onCheckedChange");
        }

        public OnCheckedChangeListenerStub(C22757AvS avS) {
            this.mListener = avS;
        }
    }
}
