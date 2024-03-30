package X;

import android.content.Intent;
import com.whatsapp.inappsupport.ui.SupportAiActivity;

/* renamed from: X.4KL  reason: invalid class name */
public final class AnonymousClass4KL extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ SupportAiActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4KL(SupportAiActivity supportAiActivity) {
        super(1);
        this.this$0 = supportAiActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass11F r4 = (AnonymousClass11F) obj;
        C36321k7.A1K(r4, "SupportAiActivity/openSupportChat/", AnonymousClass000.A0u());
        Intent A0F = C36391kE.A0F(this.this$0, C36441kJ.A0j(), r4);
        AnonymousClass00C.A08(A0F);
        this.this$0.A33(A0F, true);
        return AnonymousClass0AJ.A00;
    }
}
