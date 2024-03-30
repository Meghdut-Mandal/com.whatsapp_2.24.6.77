package androidx.car.app.model;

import X.AnonymousClass001;
import X.B9Q;
import X.C132496Ty;
import X.C22753AvO;
import X.C22754AvP;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ISearchCallback;

public class SearchCallbackDelegateImpl implements C22753AvO {
    public final ISearchCallback mStubCallback = null;

    public class SearchCallbackStub extends ISearchCallback.Stub {
        public final C22754AvP mCallback;

        public void onSearchSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
            C132496Ty.A01(iOnDoneCallback, new B9Q(2, str, this), "onSearchSubmitted");
        }

        public void onSearchTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            C132496Ty.A01(iOnDoneCallback, new B9Q(3, str, this), "onSearchTextChanged");
        }

        /* renamed from: lambda$onSearchSubmitted$1$androidx-car-app-model-SearchCallbackDelegateImpl$SearchCallbackStub  reason: not valid java name */
        public /* synthetic */ Object m36lambda$onSearchSubmitted$1$androidxcarappmodelSearchCallbackDelegateImpl$SearchCallbackStub(String str) {
            throw AnonymousClass001.A0A("onSearchSubmitted");
        }

        /* renamed from: lambda$onSearchTextChanged$0$androidx-car-app-model-SearchCallbackDelegateImpl$SearchCallbackStub  reason: not valid java name */
        public /* synthetic */ Object m37lambda$onSearchTextChanged$0$androidxcarappmodelSearchCallbackDelegateImpl$SearchCallbackStub(String str) {
            throw AnonymousClass001.A0A("onSearchTextChanged");
        }

        public SearchCallbackStub(C22754AvP avP) {
            this.mCallback = avP;
        }
    }
}
