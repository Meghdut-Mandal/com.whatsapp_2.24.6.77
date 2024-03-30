package X;

import android.view.ViewGroup;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.R;
import com.whatsapp.WaViewPager;
import com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet;
import java.util.List;

/* renamed from: X.AmT  reason: case insensitive filesystem */
public final class C22428AmT extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterReactionsSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22428AmT(NewsletterReactionsSheet newsletterReactionsSheet) {
        super(1);
        this.this$0 = newsletterReactionsSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass80R r2;
        int i;
        ViewGroup.LayoutParams layoutParams;
        C195659Vl r7 = (C195659Vl) obj;
        NewsletterReactionsSheet newsletterReactionsSheet = this.this$0;
        AnonymousClass00C.A0B(r7);
        MaterialButtonToggleGroup materialButtonToggleGroup = newsletterReactionsSheet.A02;
        if (materialButtonToggleGroup != null) {
            List list = r7.A01;
            int i2 = 0;
            if (list.size() <= 1) {
                i2 = 8;
            }
            materialButtonToggleGroup.setVisibility(i2);
            if (materialButtonToggleGroup.getWidth() > 0 && (layoutParams = materialButtonToggleGroup.getLayoutParams()) != null) {
                layoutParams.width = materialButtonToggleGroup.getWidth();
            }
            int ordinal = ((C188338zQ) list.get(r7.A00)).ordinal();
            if (ordinal == 0) {
                i = R.id.reactions_button_all;
            } else if (ordinal == 1) {
                i = R.id.reactions_button_contacts;
            }
            MaterialButtonToggleGroup.A01(materialButtonToggleGroup, i, true);
        }
        NewsletterReactionsSheet newsletterReactionsSheet2 = this.this$0;
        WaViewPager waViewPager = newsletterReactionsSheet2.A05;
        if (waViewPager != null) {
            AnonymousClass07S realAdapter = waViewPager.getRealAdapter();
            if (!(realAdapter instanceof AnonymousClass80R) || (r2 = (AnonymousClass80R) realAdapter) == null) {
                r2 = new AnonymousClass80R(newsletterReactionsSheet2);
                waViewPager.setAdapter(r2);
            }
            List list2 = r7.A01;
            if (!AnonymousClass00C.A0J(r2.A00, list2)) {
                r2.A00 = list2;
                r2.A09();
            }
            waViewPager.setCurrentLogicalItem(r7.A00);
        }
        return AnonymousClass0AJ.A00;
    }
}
