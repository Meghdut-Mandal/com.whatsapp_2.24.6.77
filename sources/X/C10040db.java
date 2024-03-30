package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.io.IOException;

/* renamed from: X.0db  reason: invalid class name and case insensitive filesystem */
public final class C10040db implements C16760q3 {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ String A01;

    public C10040db(String str, Bundle bundle) {
        this.A01 = str;
        this.A00 = bundle;
    }

    public final /* bridge */ /* synthetic */ Object ByD(IBinder iBinder) {
        Object r4;
        if (iBinder == null) {
            r4 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            if (queryLocalInterface instanceof C17400rI) {
                r4 = (C17400rI) queryLocalInterface;
            } else {
                r4 = new C04630Lk(iBinder);
            }
        }
        String str = this.A01;
        Bundle bundle = this.A00;
        C07780Zg r42 = (C07780Zg) r4;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r42.A00);
        obtain.writeString(str);
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        Parcel A002 = r42.A00(2, obtain);
        Bundle bundle2 = (Bundle) AnonymousClass000.A0W(A002, Bundle.CREATOR);
        A002.recycle();
        AnonymousClass0UT r0 = AnonymousClass0Z2.A01;
        if (bundle2 != null) {
            String string = bundle2.getString("Error");
            if (bundle2.getBoolean("booleanResult")) {
                return null;
            }
            throw new AnonymousClass0OD(string);
        }
        AnonymousClass0Z2.A01.A01("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }
}
