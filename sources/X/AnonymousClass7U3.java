package X;

import android.view.View;
import com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet;

/* renamed from: X.7U3  reason: invalid class name */
public final class AnonymousClass7U3 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ View $view;
    public final /* synthetic */ TextVariantsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7U3(View view, TextVariantsBottomSheet textVariantsBottomSheet) {
        super(1);
        this.this$0 = textVariantsBottomSheet;
        this.$view = view;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C99304t3 r1;
        Boolean bool = (Boolean) obj;
        AnonymousClass00C.A0B(bool);
        boolean booleanValue = bool.booleanValue();
        C1255260f r2 = this.this$0.A02;
        if (booleanValue) {
            if (r2 != null) {
                r2.A00(this.$view, 1);
            }
        } else if (!(r2 == null || (r1 = r2.A00) == null)) {
            r1.A0R(3);
        }
        return AnonymousClass0AJ.A00;
    }
}
