package X;

import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.AgZ  reason: case insensitive filesystem */
public final class C22088AgZ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass8VT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22088AgZ(AnonymousClass8VT r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        View A01;
        AnonymousClass8VT r1 = this.this$0;
        List list = AnonymousClass0D3.A0I;
        AnonymousClass1RJ r0 = r1.A04;
        if (r0 == null || (A01 = r0.A01()) == null) {
            return null;
        }
        return A01.findViewById(R.id.applied_promotion_name);
    }
}
