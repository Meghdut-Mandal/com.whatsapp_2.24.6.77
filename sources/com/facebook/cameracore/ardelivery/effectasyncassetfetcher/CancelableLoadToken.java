package com.facebook.cameracore.ardelivery.effectasyncassetfetcher;

import X.AnonymousClass7eW;
import com.facebook.cameracore.ardelivery.listener.CancelableToken;

public class CancelableLoadToken implements CancelableToken {
    public AnonymousClass7eW mLoadToken;

    public boolean cancel() {
        AnonymousClass7eW r0 = this.mLoadToken;
        if (r0 != null) {
            return r0.cancel();
        }
        return false;
    }

    public CancelableLoadToken(AnonymousClass7eW r1) {
        this.mLoadToken = r1;
    }
}
