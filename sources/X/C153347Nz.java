package X;

import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.7Nz  reason: invalid class name and case insensitive filesystem */
public final class C153347Nz extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ WeakReference $activityWeakReference;
    public final /* synthetic */ C130236Kg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153347Nz(C130236Kg r2, WeakReference weakReference) {
        super(0);
        this.this$0 = r2;
        this.$activityWeakReference = weakReference;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C225314u r1;
        Object obj = this.$activityWeakReference.get();
        if ((obj instanceof C225314u) && (r1 = (C225314u) obj) != null) {
            r1.BO5(R.string.f12nameremoved);
        }
        return AnonymousClass0AJ.A00;
    }
}
