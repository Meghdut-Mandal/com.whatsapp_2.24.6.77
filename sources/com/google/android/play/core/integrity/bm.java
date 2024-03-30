package com.google.android.play.core.integrity;

import X.AX1;
import X.C21819Aav;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class bm extends AX1 {
    public final /* synthetic */ bn f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f = bnVar;
    }

    public final void a(Exception exc) {
        if (!(exc instanceof C21819Aav)) {
            super.a(exc);
        } else if (bn.k(this.f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
