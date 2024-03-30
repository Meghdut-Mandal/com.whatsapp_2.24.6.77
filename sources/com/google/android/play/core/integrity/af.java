package com.google.android.play.core.integrity;

import X.AX1;
import X.AnonymousClass000;
import X.C204459q2;
import X.C21819Aav;
import X.C23101B4q;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class af extends AX1 {
    public final /* synthetic */ byte[] a;
    public final /* synthetic */ Long b;
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ IntegrityTokenRequest d;
    public final /* synthetic */ aj e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.e = ajVar;
        this.a = bArr;
        this.b = l;
        this.c = taskCompletionSource2;
        this.d = integrityTokenRequest;
    }

    public final void a(Exception exc) {
        if (exc instanceof C21819Aav) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    public final void b() {
        try {
            aj ajVar = this.e;
            Bundle a2 = aj.a(ajVar, this.a, this.b, (Parcelable) null);
            ai aiVar = new ai(this.e, this.c);
            C204459q2 r4 = (C204459q2) ((C23101B4q) ajVar.a.A01);
            Parcel A00 = AX1.A00(r4);
            a2.writeToParcel(A00, 0);
            A00.writeStrongBinder(aiVar);
            r4.A00(2, A00);
        } catch (RemoteException e2) {
            this.e.b.A01("requestIntegrityToken(%s)", e2, AnonymousClass000.A1b(this.d));
            this.c.trySetException(new IntegrityServiceException(-100, e2));
        }
    }
}
