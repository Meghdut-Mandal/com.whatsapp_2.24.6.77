package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.0dp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C10180dp implements C16820q9 {
    public final /* synthetic */ AnonymousClass0K4 A00;

    public /* synthetic */ C10180dp(AnonymousClass0K4 r1) {
        this.A00 = r1;
    }

    /* JADX INFO: finally extract failed */
    public final void B04(Object obj, Object obj2) {
        AnonymousClass0K4 r4 = this.A00;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        C07760Ze r1 = (C07760Ze) ((C07560Yg) obj).A04();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r1.A01);
        obtain.writeInt(1);
        r4.writeToParcel(obtain, 0);
        try {
            r1.A00.transact(1, obtain, (Parcel) null, 1);
            obtain.recycle();
            taskCompletionSource.setResult((Object) null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
