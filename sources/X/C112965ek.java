package X;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: X.5ek  reason: invalid class name and case insensitive filesystem */
public abstract class C112965ek {
    public static C161357mc A00;

    public static C115075iI A00(Bitmap bitmap) {
        AnonymousClass006.A02(bitmap, "image must not be null");
        try {
            C161357mc r2 = A00;
            AnonymousClass006.A02(r2, "IBitmapDescriptorFactory is not initialized");
            C133816a2 r22 = (C133816a2) r2;
            Parcel A002 = C133816a2.A00(r22);
            AnonymousClass6UO.A01(A002, bitmap);
            return new C115075iI(C133816a2.A01(A002, r22, 6));
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }
}
