package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.community.communityInfo.CAGInfoFragment;

/* renamed from: X.4J7  reason: invalid class name */
public final class AnonymousClass4J7 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CAGInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4J7(CAGInfoFragment cAGInfoFragment) {
        super(1);
        this.this$0 = cAGInfoFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00T r2 = this.this$0.A0C;
        if (!(!((C225314u) r2.getValue()).A0E)) {
            Intent A0C = C36371kC.A0C(((Context) r2.getValue()).getApplicationContext());
            AnonymousClass00C.A08(A0C);
            ((Context) r2.getValue()).startActivity(A0C);
        }
        return AnonymousClass0AJ.A00;
    }
}
