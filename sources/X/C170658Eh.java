package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.8Eh  reason: invalid class name and case insensitive filesystem */
public final class C170658Eh extends C128996En {
    public final AnonymousClass8CV A00;

    public C170658Eh(Context context, AnonymousClass8CV r4) {
        super(context, "FaceNativeHandle", "face");
        this.A00 = r4;
        A00();
    }

    public final /* synthetic */ Object A01(Context context, AnonymousClass0Z3 r7) {
        String str;
        Object obj;
        Object queryLocalInterface;
        if (AnonymousClass0Z3.A00(context, "com.google.android.gms.vision.dynamite.face") > AnonymousClass0Z3.A01(context, "com.google.android.gms.vision.dynamite", false)) {
            str = "com.google.android.gms.vision.face.NativeFaceDetectorV2Creator";
        } else {
            str = "com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator";
        }
        IBinder A09 = r7.A09(str);
        if (A09 == null) {
            return null;
        }
        IInterface queryLocalInterface2 = A09.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
        if (queryLocalInterface2 instanceof C23099B4o) {
            obj = (C23099B4o) queryLocalInterface2;
            if (obj == null) {
                return null;
            }
        } else {
            obj = new C170528Du(A09);
        }
        AnonymousClass0LR r3 = new AnonymousClass0LR(context);
        AnonymousClass8CV r2 = this.A00;
        AnonymousClass006.A01(r2);
        C204469q3 r4 = (C204469q3) obj;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r4.A00);
        r2.writeToParcel(obtain, AnonymousClass000.A1U(r3.asBinder(), obtain) ? 1 : 0);
        Parcel A002 = r4.A00(obtain);
        IBinder readStrongBinder = A002.readStrongBinder();
        if (readStrongBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            if (!(queryLocalInterface instanceof C23098B4n)) {
                queryLocalInterface = new AnonymousClass8Dt(readStrongBinder);
            }
        }
        A002.recycle();
        return queryLocalInterface;
    }

    public final void A03() {
        Object A002 = A00();
        AnonymousClass006.A01(A002);
        C204469q3 r2 = (C204469q3) ((C23098B4n) A002);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r2.A00);
        r2.A01(obtain);
    }
}
