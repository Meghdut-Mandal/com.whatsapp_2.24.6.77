package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

public final class aa implements IntegrityManager {
    public final aj a;

    public aa(aj ajVar) {
        this.a = ajVar;
    }

    public final Task requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.a.c(integrityTokenRequest);
    }
}
