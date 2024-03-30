package androidx.car.app.model;

import X.AnonymousClass001;
import X.B9Q;
import X.C132496Ty;
import X.C22742AvD;
import X.C22743AvE;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IInputCallback;

public class InputCallbackDelegateImpl implements C22743AvE {
    public final IInputCallback mCallback = null;

    public class OnInputCallbackStub extends IInputCallback.Stub {
        public final C22742AvD mCallback;

        public void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
            C132496Ty.A01(iOnDoneCallback, new B9Q(0, str, this), "onInputSubmitted");
        }

        public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            C132496Ty.A01(iOnDoneCallback, new B9Q(1, str, this), "onInputTextChanged");
        }

        /* renamed from: lambda$onInputSubmitted$0$androidx-car-app-model-InputCallbackDelegateImpl$OnInputCallbackStub  reason: not valid java name */
        public /* synthetic */ Object m29lambda$onInputSubmitted$0$androidxcarappmodelInputCallbackDelegateImpl$OnInputCallbackStub(String str) {
            throw AnonymousClass001.A0A("onInputSubmitted");
        }

        /* renamed from: lambda$onInputTextChanged$1$androidx-car-app-model-InputCallbackDelegateImpl$OnInputCallbackStub  reason: not valid java name */
        public /* synthetic */ Object m30lambda$onInputTextChanged$1$androidxcarappmodelInputCallbackDelegateImpl$OnInputCallbackStub(String str) {
            throw AnonymousClass001.A0A("onInputTextChanged");
        }

        public OnInputCallbackStub(C22742AvD avD) {
            this.mCallback = avD;
        }
    }
}
