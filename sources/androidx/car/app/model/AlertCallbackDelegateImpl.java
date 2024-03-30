package androidx.car.app.model;

import X.AnonymousClass001;
import X.B9O;
import X.B9P;
import X.C132496Ty;
import X.C22740AvB;
import X.C22741AvC;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IAlertCallback;

public class AlertCallbackDelegateImpl implements C22741AvC {
    public final IAlertCallback mCallback = null;

    public class AlertCallbackStub extends IAlertCallback.Stub {
        public final C22740AvB mCallback;

        public void onAlertCancelled(int i, IOnDoneCallback iOnDoneCallback) {
            C132496Ty.A01(iOnDoneCallback, new B9O(this, i, 0), "onCancel");
        }

        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
            C132496Ty.A01(iOnDoneCallback, new B9P(this, 4), "onDismiss");
        }

        /* renamed from: lambda$onAlertCancelled$0$androidx-car-app-model-AlertCallbackDelegateImpl$AlertCallbackStub  reason: not valid java name */
        public /* synthetic */ Object m27lambda$onAlertCancelled$0$androidxcarappmodelAlertCallbackDelegateImpl$AlertCallbackStub(int i) {
            throw AnonymousClass001.A0A("onCancel");
        }

        /* renamed from: lambda$onAlertDismissed$1$androidx-car-app-model-AlertCallbackDelegateImpl$AlertCallbackStub  reason: not valid java name */
        public /* synthetic */ Object m28lambda$onAlertDismissed$1$androidxcarappmodelAlertCallbackDelegateImpl$AlertCallbackStub() {
            throw AnonymousClass001.A0A("onDismiss");
        }

        public AlertCallbackStub(C22740AvB avB) {
            this.mCallback = avB;
        }
    }
}
