package X;

import android.view.View;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment;

/* renamed from: X.7U4  reason: invalid class name */
public final class AnonymousClass7U4 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ View $view;
    public final /* synthetic */ VariantsCarouselFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7U4(View view, VariantsCarouselFragment variantsCarouselFragment) {
        super(1);
        this.this$0 = variantsCarouselFragment;
        this.$view = view;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C99304t3 r1;
        Number number = (Number) obj;
        if (number != null) {
            VariantsCarouselFragment variantsCarouselFragment = this.this$0;
            View view = this.$view;
            C1255260f r12 = variantsCarouselFragment.A00;
            if (r12 != null) {
                r12.A00(view, number.intValue());
                return AnonymousClass0AJ.A00;
            }
        }
        C1255260f r0 = this.this$0.A00;
        if (!(r0 == null || (r1 = r0.A00) == null)) {
            r1.A0R(3);
        }
        return AnonymousClass0AJ.A00;
    }
}
