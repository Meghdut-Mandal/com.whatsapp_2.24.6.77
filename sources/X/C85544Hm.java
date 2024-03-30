package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.ref.WeakReference;

/* renamed from: X.4Hm  reason: invalid class name and case insensitive filesystem */
public final class C85544Hm extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ WeakReference $adapterRef;
    public final /* synthetic */ WeakReference $managerRef;
    public final /* synthetic */ WeakReference $scrollerRef;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85544Hm(WeakReference weakReference, WeakReference weakReference2, WeakReference weakReference3) {
        super(0);
        this.$adapterRef = weakReference;
        this.$managerRef = weakReference2;
        this.$scrollerRef = weakReference3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinearLayoutManager linearLayoutManager;
        AnonymousClass0CZ r2 = (AnonymousClass0CZ) this.$adapterRef.get();
        if (r2 != null) {
            Object obj = this.$managerRef.get();
            if ((obj instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) obj) != null) {
                int A1S = linearLayoutManager.A1S();
                if (A1S < 1) {
                    A1S = 1;
                }
                Integer valueOf = Integer.valueOf(A1S);
                if (valueOf != null && A1S < r2.A0J()) {
                    C36341k9.A0H().postDelayed(new AnonymousClass736(this.$scrollerRef, valueOf, this.$managerRef, 17), 250);
                }
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
