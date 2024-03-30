package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class A3J implements C16820q9 {
    public final C98784s1 A00;

    public A3J(C98784s1 r1) {
        this.A00 = r1;
    }

    public final void B04(Object obj, Object obj2) {
        C98784s1 r6 = this.A00;
        C07560Yg r8 = (C07560Yg) obj;
        A3E a3e = new A3E((TaskCompletionSource) obj2);
        r8.A09();
        C170348Db r4 = new C170348Db();
        r4.A00 = a3e;
        C204449q1 r3 = (C204449q1) ((C23102B4r) r8.A04());
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r3.A01);
        obtain.writeInt(1);
        r6.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(r4.asBinder());
        obtain.writeString((String) null);
        r3.A00(63, obtain);
    }
}
