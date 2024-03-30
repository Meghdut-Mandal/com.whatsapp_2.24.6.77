package com.google.android.play.core.integrity;

import X.C199269f2;
import X.C90524aI;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class bk extends bi {
    public final /* synthetic */ bn c;
    public final C199269f2 d = new C199269f2("OnRequestIntegrityTokenCallback");
    public final long e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.e = j;
    }

    public final void c(Bundle bundle) {
        super.c(bundle);
        this.d.A02("onRequestExpressIntegrityToken", C90524aI.A0w());
        ApiException a = this.c.f.a(bundle);
        if (a != null) {
            this.a.trySetException(a);
            return;
        }
        bj bjVar = new bj(this, this.c.c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.b = bjVar;
        taskCompletionSource.trySetResult(bVar.c());
    }
}
