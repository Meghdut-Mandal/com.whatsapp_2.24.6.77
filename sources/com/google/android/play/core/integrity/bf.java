package com.google.android.play.core.integrity;

import X.AX1;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C199269f2;
import X.C204459q2;
import X.C23100B4p;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class bf extends bm {
    public final /* synthetic */ long a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ bn c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i, long j, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.a = j;
        this.b = taskCompletionSource2;
    }

    public final void b() {
        if (!bn.k(this.c)) {
            try {
                bn bnVar = this.c;
                Bundle b2 = bn.b(bnVar, this.a, 0);
                bl blVar = new bl(this.c, this.b);
                C204459q2 r4 = (C204459q2) ((C23100B4p) bnVar.a.A01);
                Parcel A00 = AX1.A00(r4);
                b2.writeToParcel(A00, 0);
                A00.writeStrongBinder(blVar);
                r4.A00(2, A00);
            } catch (RemoteException e) {
                bn bnVar2 = this.c;
                long j = this.a;
                C199269f2 r2 = bnVar2.b;
                Object[] A0L = AnonymousClass001.A0L();
                AnonymousClass000.A1M(A0L, 0, j);
                r2.A01("warmUpIntegrityToken(%s)", e, A0L);
                this.b.trySetException(new StandardIntegrityException(-100, e));
            }
        } else {
            a(new StandardIntegrityException(-2, (Throwable) null));
        }
    }
}
