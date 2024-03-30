package com.whatsapp.deviceauth;

import X.AnonymousClass00N;
import X.AnonymousClass05R;
import androidx.lifecycle.OnLifecycleEvent;

public abstract class DeviceAuthenticationPlugin implements AnonymousClass00N {
    public abstract void A04();

    public abstract boolean A05();

    @OnLifecycleEvent(AnonymousClass05R.ON_CREATE)
    public void onCreate() {
        if (A05()) {
            A04();
        }
    }
}
