package com.google.android.play.core.integrity;

import X.AX1;
import X.AnonymousClass001;
import X.C199269f2;
import X.C201499ji;
import X.C204459q2;
import X.C23100B4p;
import X.C36331k8;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class bh extends bm {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ int d;
    public final /* synthetic */ bn e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(bnVar, taskCompletionSource);
        this.e = bnVar;
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
    }

    public final void b() {
        if (bn.k(this.e)) {
            a(new StandardIntegrityException(-2, (Throwable) null));
            return;
        }
        try {
            bn bnVar = this.e;
            C201499ji r5 = bnVar.a;
            Bundle bundle = this.a;
            as a2 = bnVar.e.a(this.b, this.c, r5);
            C204459q2 r4 = (C204459q2) ((C23100B4p) r5.A01);
            Parcel A00 = AX1.A00(r4);
            bundle.writeToParcel(A00, 0);
            A00.writeStrongBinder(a2);
            r4.A00(6, A00);
        } catch (RemoteException e2) {
            bn bnVar2 = this.e;
            int i = this.d;
            C199269f2 r2 = bnVar2.b;
            Object[] A0L = AnonymousClass001.A0L();
            C36331k8.A1W(A0L, i);
            r2.A01("requestAndShowDialog(%s)", e2, A0L);
            this.c.trySetException(new StandardIntegrityException(-100, e2));
        }
    }
}
