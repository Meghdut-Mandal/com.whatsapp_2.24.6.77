package X;

import android.util.Log;
import com.facebook.wearable.datax.Service;

/* renamed from: X.Akc  reason: case insensitive filesystem */
public final class C22314Akc extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Service this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22314Akc(Service service) {
        super(1);
        this.this$0 = service;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A09 = C36431kI.A09(obj);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Deallocating service ");
        Log.i(Service.TAG, C36381kD.A10(A0u, this.this$0.id));
        Service.deallocateNative(A09);
        return AnonymousClass0AJ.A00;
    }
}
