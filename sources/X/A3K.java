package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class A3K implements C16820q9 {
    public final /* synthetic */ AnonymousClass8Bh A00;
    public final /* synthetic */ C98754ry A01;

    public /* synthetic */ A3K(AnonymousClass8Bh r1, C98754ry r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void B04(Object obj, Object obj2) {
        AnonymousClass8Bh r4 = this.A00;
        C170248Cr r3 = new C170248Cr((TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        r4.writeToParcel(obtain, AnonymousClass000.A1U(r3, obtain) ? 1 : 0);
        ((C204429pz) ((C07560Yg) obj).A04()).A00(10, obtain);
    }
}
