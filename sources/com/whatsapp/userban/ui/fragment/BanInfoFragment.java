package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass000;
import X.AnonymousClass3Y9;
import X.C012005e;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C55682v1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

public class BanInfoFragment extends Hilt_BanInfoFragment {
    public Button A00;
    public BanAppealViewModel A01;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        A10(true);
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        if (!this.A01.A0B()) {
            C36391kE.A1F(menu, 1, R.string.f12nameremoved);
        }
        super.A1U(menu, menuInflater);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        this.A01 = C36351kA.A0o(this);
        BanAppealViewModel.A02(A0i(), false);
        C36401kF.A0G(view, R.id.ban_icon).setImageDrawable(C36341k9.A0G(this).getDrawable(R.drawable.icon_banned));
        TextView A0O = C36391kE.A0O(view, R.id.heading);
        int i = C36341k9.A0E(this.A01.A08.A06).getInt("support_ban_appeal_violation_type", 0);
        C36321k7.A1T("BanAppealRepository/getBanViolationType ", AnonymousClass000.A0u(), i);
        int i2 = R.string.f12nameremoved;
        if (i == 15) {
            i2 = R.string.f12nameremoved;
        }
        A0O.setText(i2);
        C36391kE.A0O(view, R.id.sub_heading).setText(R.string.f12nameremoved);
        this.A00 = (Button) C012005e.A02(view, R.id.action_button);
        boolean equals = C55682v1.A00(C36371kC.A0t(C36341k9.A0E(this.A01.A08.A06), "support_ban_appeal_state")).equals("IN_REVIEW");
        Button button = this.A00;
        int i3 = R.string.f12nameremoved;
        if (equals) {
            i3 = R.string.f12nameremoved;
        }
        button.setText(i3);
        AnonymousClass3Y9.A00(this.A00, this, 43);
    }

    public boolean A1X(MenuItem menuItem) {
        if (menuItem.getItemId() != 1) {
            return super.A1X(menuItem);
        }
        this.A01.A0U(A0i(), false);
        return true;
    }
}
