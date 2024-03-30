package com.google.android.play.core.integrity;

import X.AnonymousClass8FE;
import X.C22896Ay0;
import X.C23100B4p;
import android.os.IBinder;
import android.os.IInterface;

public final /* synthetic */ class bd implements C22896Ay0 {
    public static final /* synthetic */ bd a = new bd();

    public final Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        if (!(queryLocalInterface instanceof C23100B4p)) {
            return new AnonymousClass8FE(iBinder);
        }
        return queryLocalInterface;
    }
}
