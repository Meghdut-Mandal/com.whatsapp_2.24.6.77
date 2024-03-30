package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.0dw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C10250dw implements C16820q9 {
    public final /* synthetic */ AnonymousClass0JJ A00;
    public final /* synthetic */ C04470Kt A01;

    public /* synthetic */ C10250dw(AnonymousClass0JJ r1, C04470Kt r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void B04(Object obj, Object obj2) {
        C04470Kt r4 = this.A01;
        C07780Zg r3 = (C07780Zg) ((C07560Yg) obj).A04();
        AnonymousClass0JV r2 = new AnonymousClass0JV((TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r3.A00);
        r4.writeToParcel(obtain, AnonymousClass000.A1U(r2.asBinder(), obtain) ? 1 : 0);
        r3.A01(2, obtain);
    }
}
