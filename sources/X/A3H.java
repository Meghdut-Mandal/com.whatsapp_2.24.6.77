package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class A3H implements C16820q9 {
    public final /* synthetic */ C98754ry A00;

    public /* synthetic */ A3H(C98754ry r1) {
        this.A00 = r1;
    }

    public final void B04(Object obj, Object obj2) {
        C170268Ct r3 = new C170268Ct((TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        obtain.writeStrongBinder(r3);
        ((C204429pz) ((C07560Yg) obj).A04()).A00(11, obtain);
    }
}
