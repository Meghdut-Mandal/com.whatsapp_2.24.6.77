package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.0ds  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C10210ds implements C16820q9 {
    public final /* synthetic */ AnonymousClass0JG A00;
    public final /* synthetic */ AnonymousClass0LV A01;

    public /* synthetic */ C10210ds(AnonymousClass0JG r1, AnonymousClass0LV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void B04(Object obj, Object obj2) {
        AnonymousClass0LV r2 = this.A01;
        C04790Ma r1 = new C04790Ma((TaskCompletionSource) obj2);
        C07740Zc r5 = (C07740Zc) ((C07560Yg) obj).A04();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        boolean A1U = AnonymousClass000.A1U(r1, obtain);
        r2.writeToParcel(obtain, A1U ? 1 : 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            r5.A00.transact(1, obtain, obtain2, A1U);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
