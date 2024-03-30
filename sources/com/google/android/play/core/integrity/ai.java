package com.google.android.play.core.integrity;

import X.C165957uR;
import X.C199269f2;
import X.C90524aI;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class ai extends C165957uR implements IInterface {
    public final /* synthetic */ aj a;
    public final C199269f2 b;
    public final TaskCompletionSource c;

    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        b(C165957uR.A00(parcel));
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this();
        this.a = ajVar;
        this.b = new C199269f2("OnRequestIntegrityTokenCallback");
        this.c = taskCompletionSource;
    }

    public final void b(Bundle bundle) {
        TaskCompletionSource taskCompletionSource;
        this.a.a.A02(this.c);
        this.b.A02("onRequestIntegrityToken", C90524aI.A0w());
        Exception a2 = this.a.e.a(bundle);
        if (a2 != null) {
            taskCompletionSource = this.c;
        } else {
            String string = bundle.getString("token");
            if (string == null) {
                taskCompletionSource = this.c;
                a2 = new IntegrityServiceException(-100, (Throwable) null);
            } else {
                ah ahVar = new ah(this, this.a.c, bundle.getLong("request.token.sid"));
                TaskCompletionSource taskCompletionSource2 = this.c;
                a aVar = new a();
                aVar.a = string;
                aVar.b = ahVar;
                taskCompletionSource2.trySetResult(aVar.c());
                return;
            }
        }
        taskCompletionSource.trySetException(a2);
    }

    public ai() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }
}
