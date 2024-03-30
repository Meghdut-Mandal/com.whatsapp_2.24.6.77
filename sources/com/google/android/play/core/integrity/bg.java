package com.google.android.play.core.integrity;

import X.AX1;
import X.AnonymousClass000;
import X.C199269f2;
import X.C204459q2;
import X.C23100B4p;
import X.C90474aD;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class bg extends bm {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TaskCompletionSource d;
    public final /* synthetic */ bn e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i, String str, long j, long j2, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.e = bnVar;
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = taskCompletionSource2;
    }

    public final void b() {
        if (!bn.k(this.e)) {
            try {
                bn bnVar = this.e;
                Bundle a2 = bn.a(bnVar, this.a, this.b, this.c, 0);
                bk bkVar = new bk(this.e, this.d, this.b);
                C204459q2 r5 = (C204459q2) ((C23100B4p) bnVar.a.A01);
                Parcel A00 = AX1.A00(r5);
                a2.writeToParcel(A00, 0);
                A00.writeStrongBinder(bkVar);
                r5.A00(3, A00);
            } catch (RemoteException e2) {
                bn bnVar2 = this.e;
                String str = this.a;
                C199269f2 r4 = bnVar2.b;
                Object[] A1a = C90474aD.A1a(str);
                AnonymousClass000.A1M(A1a, 1, this.b);
                r4.A01("requestExpressIntegrityToken(%s, %s)", e2, A1a);
                this.d.trySetException(new StandardIntegrityException(-100, e2));
            }
        } else {
            a(new StandardIntegrityException(-2, (Throwable) null));
        }
    }
}
