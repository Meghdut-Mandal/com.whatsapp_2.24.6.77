package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.0dr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C10200dr implements C16820q9 {
    public final /* synthetic */ AnonymousClass0JL A00;

    public /* synthetic */ C10200dr(AnonymousClass0JL r1) {
        this.A00 = r1;
    }

    public final void B04(Object obj, Object obj2) {
        AnonymousClass0JL r0 = this.A00;
        AnonymousClass0JU r4 = new AnonymousClass0JU((TaskCompletionSource) obj2);
        C07750Zd r3 = (C07750Zd) ((C07560Yg) obj).A04();
        String str = r0.A00;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r3.A00);
        obtain.writeStrongBinder(r4.asBinder());
        obtain.writeString(str);
        r3.A00(2, obtain);
    }
}
