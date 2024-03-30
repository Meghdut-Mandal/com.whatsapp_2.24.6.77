package androidx.biometric;

import X.AnonymousClass00N;
import X.AnonymousClass05R;
import androidx.lifecycle.OnLifecycleEvent;

public abstract class BiometricPrompt$ResetCallbackObserver implements AnonymousClass00N {
    @OnLifecycleEvent(AnonymousClass05R.ON_DESTROY)
    public abstract void resetCallback();
}
