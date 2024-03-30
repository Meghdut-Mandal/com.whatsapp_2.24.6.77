package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class A3I implements C16820q9 {
    public final /* synthetic */ C98754ry A00;

    public /* synthetic */ A3I(C98754ry r1) {
        this.A00 = r1;
    }

    public final void B04(Object obj, Object obj2) {
        C170258Cs r3 = new C170258Cs((TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        obtain.writeStrongBinder(r3);
        ((C204429pz) ((C07560Yg) obj).A04()).A00(2, obtain);
    }
}
