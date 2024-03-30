package X;

import android.os.Bundle;
import com.whatsapp.calling.callrating.CategorizedUserProblemsFragment;

/* renamed from: X.7KZ  reason: invalid class name */
public final class AnonymousClass7KZ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CategorizedUserProblemsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7KZ(CategorizedUserProblemsFragment categorizedUserProblemsFragment) {
        super(0);
        this.this$0 = categorizedUserProblemsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Integer valueOf;
        Bundle bundle = this.this$0.A0A;
        if (bundle != null && (valueOf = Integer.valueOf(bundle.getInt("index"))) != null) {
            return valueOf;
        }
        throw C36381kD.A0k();
    }
}
