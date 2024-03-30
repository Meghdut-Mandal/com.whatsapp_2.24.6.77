package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass07B;
import X.AnonymousClass3XT;
import X.AnonymousClass4A2;
import X.C19420v0;
import X.C36331k8;
import X.C36341k9;
import X.C36411kG;
import X.C36431kI;
import X.C50712lP;
import X.C62053Eo;
import X.C66943Xx;
import X.C68733cN;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.whatsapp.R;
import com.whatsapp.wds.components.banners.WDSBanner;
import java.util.List;
import java.util.Map;

public class AudienceSelectionContactPickerFragment extends SelectedListContactPickerFragment {
    public int A00 = 1;
    public MenuItem A01;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        List list;
        String str;
        String str2;
        WDSBanner wDSBanner;
        ViewStub A0M;
        View inflate;
        View findViewById;
        AnonymousClass00C.A0D(layoutInflater, 0);
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = A1Z();
        }
        this.A00 = A1Z().getInt("status_distribution_mode");
        AnonymousClass3XT A012 = this.A24.A01(bundle2);
        this.A1W = A012;
        if (A012 == null) {
            list = null;
        } else if (this.A00 == 1) {
            list = A012.A01;
        } else {
            list = A012.A02;
        }
        this.A2n = list;
        boolean z = A1Z().getBoolean("use_custom_multiselect_limit", false);
        this.A3C = z;
        if (z) {
            this.A00 = A1Z().getInt("custom_multiselect_limit");
            this.A01 = R.plurals.f10nameremoved;
        }
        View A1G = super.A1G(bundle, layoutInflater, viewGroup);
        if (!(A1G == null || (A0M = C36431kI.A0M(A1G, R.id.share_button_layout_stub)) == null || (inflate = A0M.inflate()) == null || (findViewById = inflate.findViewById(R.id.share_button)) == null)) {
            C66943Xx.A00(findViewById, this, 33);
        }
        boolean A1O = AnonymousClass000.A1O(this.A00);
        SharedPreferences A0E = C36341k9.A0E(this.A1C);
        if (A1O) {
            str = "pref_audience_selection_include_nux_seen";
        } else {
            str = "pref_audience_selection_exclude_nux_seen";
        }
        if (!A0E.getBoolean(str, false)) {
            ViewGroup viewGroup2 = null;
            if (A1G != null) {
                viewGroup2 = C36411kG.A0P(A1G, R.id.audience_selection_nux_holder);
            }
            A0c().inflate(R.layout.f9nameremoved, viewGroup2, true);
            if (!(viewGroup2 == null || (wDSBanner = (WDSBanner) viewGroup2.findViewById(R.id.audience_selection_nux)) == null)) {
                C62053Eo r3 = new C62053Eo();
                r3.A02 = C50712lP.A00;
                int i = this.A00;
                int i2 = R.string.f12nameremoved;
                if (i == 1) {
                    i2 = R.string.f12nameremoved;
                }
                r3.A00 = i2;
                wDSBanner.setState(r3.A01());
                wDSBanner.setOnDismissListener((AnonymousClass00S) new AnonymousClass4A2(wDSBanner));
            }
            boolean A1O2 = AnonymousClass000.A1O(this.A00);
            SharedPreferences.Editor A002 = C19420v0.A00(this.A1C);
            if (A1O2) {
                str2 = "pref_audience_selection_include_nux_seen";
            } else {
                str2 = "pref_audience_selection_exclude_nux_seen";
            }
            C36331k8.A0w(A002, str2, true);
        }
        return A1G;
    }

    public void A1R(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.A1R(bundle);
        bundle.putInt("status_distribution_mode", this.A00);
        this.A24.A03(bundle, this.A1W);
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        C36331k8.A1I(menu, menuInflater);
        super.A1U(menu, menuInflater);
        MenuItem icon = menu.add(0, R.id.menuitem_select_all, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_unselect_all);
        AnonymousClass00C.A08(icon);
        this.A01 = icon;
        icon.setShowAsAction(2);
        MenuItem menuItem = this.A01;
        if (menuItem == null) {
            throw C36331k8.A0d("unselectAllMenuItem");
        }
        menuItem.setTitle(R.string.f12nameremoved);
    }

    public boolean A1X(MenuItem menuItem) {
        AnonymousClass00C.A0D(menuItem, 0);
        if (menuItem.getItemId() != R.id.menuitem_select_all) {
            return super.A1X(menuItem);
        }
        Map map = this.A3o;
        AnonymousClass00C.A07(map);
        if (!map.isEmpty()) {
            map.clear();
            A25().A00.clear();
            A1g();
            A25().A06();
            SelectedListContactPickerFragment.A05(this, C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved), 0);
            A00(this);
        }
        return true;
    }

    public static final void A00(AudienceSelectionContactPickerFragment audienceSelectionContactPickerFragment) {
        String string;
        int size = audienceSelectionContactPickerFragment.A3o.size();
        AnonymousClass07B A002 = C68733cN.A00(audienceSelectionContactPickerFragment);
        if (size == 0) {
            boolean A1O = AnonymousClass000.A1O(audienceSelectionContactPickerFragment.A00);
            Resources A0G = C36341k9.A0G(audienceSelectionContactPickerFragment);
            int i = R.string.f12nameremoved;
            if (A1O) {
                i = R.string.f12nameremoved;
            }
            string = A0G.getString(i);
        } else {
            Resources A0G2 = C36341k9.A0G(audienceSelectionContactPickerFragment);
            int i2 = audienceSelectionContactPickerFragment.A00;
            int i3 = R.string.f12nameremoved;
            if (i2 == 1) {
                i3 = R.string.f12nameremoved;
            }
            Object[] objArr = new Object[1];
            C36331k8.A1W(objArr, size);
            string = A0G2.getString(i3, objArr);
        }
        A002.A0Q(string);
    }

    public void A1P(Bundle bundle) {
        super.A1P(bundle);
        A00(this);
    }
}
