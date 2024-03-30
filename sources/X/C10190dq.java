package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.0dq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C10190dq implements C16820q9 {
    public final /* synthetic */ AnonymousClass0JK A00;

    public /* synthetic */ C10190dq(AnonymousClass0JK r1) {
        this.A00 = r1;
    }

    public final void B04(Object obj, Object obj2) {
        C07730Zb r4 = (C07730Zb) ((C07560Yg) obj).A04();
        AnonymousClass0LX r1 = new AnonymousClass0LX((TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        obtain.writeStrongBinder(r1.asBinder());
        Parcel obtain2 = Parcel.obtain();
        try {
            AnonymousClass000.A15(r4.A00, obtain, obtain2, 1);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
