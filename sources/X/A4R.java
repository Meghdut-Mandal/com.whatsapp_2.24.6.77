package X;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.R;
import com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet;

public final /* synthetic */ class A4R implements C16930qR {
    public final /* synthetic */ NewsletterReactionsSheet A00;

    public /* synthetic */ A4R(NewsletterReactionsSheet newsletterReactionsSheet) {
        this.A00 = newsletterReactionsSheet;
    }

    public final void BSU(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        MaterialButton materialButton;
        C188338zQ r2;
        NewsletterReactionsSheet newsletterReactionsSheet = this.A00;
        if (i == R.id.reactions_button_all) {
            materialButton = newsletterReactionsSheet.A00;
            r2 = C188338zQ.ALL;
        } else if (i == R.id.reactions_button_contacts) {
            materialButton = newsletterReactionsSheet.A01;
            r2 = C188338zQ.CONTACTS;
        } else {
            return;
        }
        if (materialButton != null) {
            int i2 = 0;
            if (z) {
                i2 = R.drawable.selected_icon;
            }
            materialButton.setIconResource(i2);
        }
        if (z) {
            C167707yf r1 = newsletterReactionsSheet.A0B;
            if (r1 == null) {
                throw C36331k8.A0a();
            }
            C195659Vl r0 = (C195659Vl) r1.A04.A04();
            if (r0 != null) {
                r1.A0S(r0.A01.indexOf(r2));
            }
        }
    }
}
