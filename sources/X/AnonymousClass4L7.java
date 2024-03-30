package X;

import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity;

/* renamed from: X.4L7  reason: invalid class name */
public final class AnonymousClass4L7 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ EnforcedMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4L7(EnforcedMessagesActivity enforcedMessagesActivity) {
        super(1);
        this.this$0 = enforcedMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C36391kE.A0N(this.this$0.A00, R.id.channel_badge).setImageResource(R.drawable.vec_ic_warning_triangle_badge);
        ImageView A0N = C36391kE.A0N(this.this$0.A00, R.id.channel_icon);
        int dimensionPixelSize = this.this$0.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.this$0.A07.A09(A0N, (AnonymousClass141) obj, dimensionPixelSize);
        return AnonymousClass0AJ.A00;
    }
}
