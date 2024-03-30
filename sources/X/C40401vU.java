package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.settings.SettingsRowIconText;

/* renamed from: X.1vU  reason: invalid class name and case insensitive filesystem */
public final class C40401vU extends C02920Ck {
    public final C006302t A00;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 1) {
            return new C47432eX(C36371kC.A0I(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved), this.A00);
        }
        if (i == 2) {
            return new C47422eW(C36371kC.A0I(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved));
        }
        C36321k7.A1S("SettingsSearchResultsListAdapter/onCreateViewHolder type not handled - ", AnonymousClass000.A0u(), i);
        throw AnonymousClass000.A0d("Unexpected view type: ", AnonymousClass000.A0u(), i);
    }

    public C40401vU(C006302t r2) {
        super((C02830Cb) C40351vM.A00);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r6, int i) {
        C42561z1 r62 = (C42561z1) r6;
        AnonymousClass00C.A0D(r62, 0);
        Object A0L = A0L(i);
        AnonymousClass00C.A08(A0L);
        C63403Jx r4 = (C63403Jx) A0L;
        boolean z = r62 instanceof C47432eX;
        AnonymousClass00C.A0D(r4, 0);
        View view = r62.A0H;
        if (z) {
            SettingsRowIconText settingsRowIconText = (SettingsRowIconText) C36361kB.A0F(view, R.id.settings_result_list_item);
            settingsRowIconText.setText((CharSequence) r4.A04);
            settingsRowIconText.setSubText(r4.A03);
            Drawable drawable = r4.A01;
            settingsRowIconText.setIcon(drawable);
            AnonymousClass3YC.A00(settingsRowIconText, r4, r62, 15);
            int i2 = 216;
            if (drawable != null) {
                i2 = 0;
            }
            C36341k9.A0z(settingsRowIconText, i2, settingsRowIconText.getPaddingTop());
            return;
        }
        C36351kA.A0F(view, R.id.settings_search_no_matches).setText(r4.A04);
    }

    public int getItemViewType(int i) {
        return ((C63403Jx) A0L(i)).A00;
    }
}
