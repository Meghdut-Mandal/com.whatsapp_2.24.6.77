package org.chromium.net;

import java.util.concurrent.Executor;

public abstract class NetworkQualityRttListener {
    public final Executor mExecutor;

    public abstract void onRttObservation(int i, long j, int i2);

    public NetworkQualityRttListener(Executor executor) {
        if (executor != null) {
            this.mExecutor = executor;
            return;
        }
        throw new IllegalStateException("Executor must not be null");
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }
}
