package X;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: X.7v5  reason: invalid class name and case insensitive filesystem */
public final class C166137v5 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    public /* bridge */ /* synthetic */ void onCallbackDied(IInterface iInterface, Object obj) {
        AnonymousClass00C.A0D(obj, 1);
        this.A00.A02.remove(obj);
    }

    public C166137v5(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.A00 = multiInstanceInvalidationService;
    }
}
