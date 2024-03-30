package com.google.android.play.core.integrity;

import X.AnonymousClass8FF;
import X.C22896Ay0;
import X.C23101B4q;
import android.os.IBinder;
import android.os.IInterface;

public final /* synthetic */ class ae implements C22896Ay0 {
    public static final /* synthetic */ ae a = new ae();

    public final Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        if (!(queryLocalInterface instanceof C23101B4q)) {
            return new AnonymousClass8FF(iBinder);
        }
        return queryLocalInterface;
    }
}
