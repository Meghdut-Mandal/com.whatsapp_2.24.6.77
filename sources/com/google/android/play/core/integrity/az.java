package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

public final class az implements StandardIntegrityManager {
    public final bn a;
    public final bt b;

    public az(bn bnVar, bt btVar) {
        this.a = bnVar;
        this.b = btVar;
    }

    public final Task prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        return this.a.e(((e) prepareIntegrityTokenRequest).a, 0).onSuccessTask(new ay(this, prepareIntegrityTokenRequest));
    }

    public final /* synthetic */ Task a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l) {
        return Tasks.forResult(new bs(this.b, ((e) prepareIntegrityTokenRequest).a, l.longValue(), 0));
    }
}
