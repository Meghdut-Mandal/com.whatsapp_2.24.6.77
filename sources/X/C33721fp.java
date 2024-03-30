package X;

import android.view.LayoutInflater;
import com.whatsapp.R;

/* renamed from: X.1fp  reason: invalid class name and case insensitive filesystem */
public final class C33721fp extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C33701fn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33721fp(C33701fn r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C33701fn r1 = this.this$0;
        boolean A06 = r1.A06(r1.A05);
        int i = R.layout.f9nameremoved;
        if (A06) {
            i = R.layout.f9nameremoved;
        }
        return LayoutInflater.from(this.this$0.A02.getContext()).inflate(i, this.this$0.A02, false);
    }
}
