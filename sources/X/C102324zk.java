package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4zk  reason: invalid class name and case insensitive filesystem */
public class C102324zk extends AnonymousClass80I {
    public final View A00;
    public final C24801Dv A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final AnonymousClass4PF A04;
    public final C167967zU A05;
    public final WDSButton A06;

    public /* bridge */ /* synthetic */ void A0C(AnonymousClass9EL r5) {
        C102284zg r52 = (C102284zg) r5;
        this.A03.setText(r52.A00);
        int i = 0;
        this.A00.setVisibility(C36351kA.A00(r52.A01 ? 1 : 0));
        WDSButton wDSButton = this.A06;
        if ("catalog_products_all_items_collection_id".equals(r52.A02)) {
            i = 8;
        }
        wDSButton.setVisibility(i);
    }

    public C102324zk(View view, C24801Dv r4, AnonymousClass4PF r5, C167967zU r6, UserJid userJid) {
        super(view);
        this.A01 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A00 = C012005e.A02(view, R.id.collection_divider);
        WDSButton A0y = C36431kI.A0y(view, R.id.button_collection_see_all);
        this.A06 = A0y;
        this.A03 = C36401kF.A0Q(view, R.id.textview_collection_title);
        this.A02 = C36401kF.A0Q(view, R.id.textview_collection_subtitle);
        C36411kG.A1C(A0y, this, userJid, 21);
    }
}
