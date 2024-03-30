package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass190;
import X.AnonymousClass1RU;
import X.AnonymousClass3KU;
import X.AnonymousClass3LW;
import X.AnonymousClass3W9;
import X.AnonymousClass4XQ;
import X.C05480Pw;
import X.C19420v0;
import X.C19900wh;
import X.C19970wo;
import X.C20810yC;
import X.C24801Dv;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C39001qm;
import X.C53222qy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.util.Log;

public abstract class BanAppealBaseFragment extends WaFragment {
    public C24801Dv A00;
    public AnonymousClass1RU A01;
    public C19970wo A02;
    public C19420v0 A03;
    public C19900wh A04;
    public C20810yC A05;
    public BanAppealViewModel A06;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        this.A06 = C36351kA.A0o(this);
    }

    public boolean A1X(MenuItem menuItem) {
        StringBuilder A0t = C36401kF.A0t(menuItem, 0);
        A0t.append("BanAppealBaseFragment/onOptionsItemSelected/option item : ");
        C36321k7.A1Y(A0t, menuItem.getItemId());
        switch (menuItem.getItemId()) {
            case 101:
                if (A1Z().A09.A0I() + 1 > 2) {
                    C53222qy.A00((String) null, 16).A1f(A0l(), "BanAppealBaseFragment");
                    break;
                } else {
                    A1Z().A07(A0a(), 16);
                    return true;
                }
            case 102:
                AnonymousClass1RU A1Z = A1Z();
                AnonymousClass3KU A032 = A1Z().A03();
                if (A032 != null) {
                    String A042 = A1Z.A04(A032.A07);
                    C39001qm A043 = AnonymousClass3LW.A04(this);
                    A043.A0d(R.string.f12nameremoved);
                    A043.A0p(C05480Pw.A00(C36401kF.A0q(this, A042, new Object[1], 0, R.string.f12nameremoved)));
                    A043.A0h(new AnonymousClass4XQ(this, 15), R.string.f12nameremoved);
                    A043.A0f(AnonymousClass3W9.A00, R.string.f12nameremoved);
                    C36371kC.A0O(A043).show();
                    return true;
                }
                throw C36381kD.A0l();
            case 103:
                C24801Dv r5 = this.A00;
                if (r5 != null) {
                    AnonymousClass01I A0i = A0i();
                    AnonymousClass01I A0i2 = A0i();
                    C19420v0 r0 = this.A03;
                    if (r0 != null) {
                        int A0I = r0.A0I();
                        C19900wh r02 = this.A04;
                        if (r02 != null) {
                            r5.A06(A0i, AnonymousClass190.A1H(A0i2, (String) null, r02.A01(), A0I, false));
                            return true;
                        }
                        throw C36331k8.A0d("waStartupSharedPreferences");
                    }
                    throw C36331k8.A0d("waSharedPreferences");
                }
                throw C36331k8.A0d("activityUtils");
            case 104:
                BanAppealViewModel banAppealViewModel = this.A06;
                if (banAppealViewModel != null) {
                    banAppealViewModel.A0U(A0i(), false);
                    return true;
                }
                break;
            default:
                return false;
        }
        return true;
    }

    public final AnonymousClass1RU A1Z() {
        AnonymousClass1RU r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("accountSwitcher");
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (!A1Z().A0B()) {
            return null;
        }
        A10(true);
        return null;
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        int i;
        int i2;
        C36331k8.A1I(menu, menuInflater);
        if (A1Z().A0B()) {
            if (A1Z().A03() == null) {
                Log.i("BanAppealBaseFragment/onCreateOptionsMenu/getCurrentAccount is null");
                if (A1Z().A0A()) {
                    Log.i("BanAppealBaseFragment/onCreateOptionsMenu/userRegisteredBannedAccount/inactiveAccountsPresent");
                    i = 103;
                } else {
                    Log.i("BanAppealBaseFragment/onCreateOptionsMenu/userRegisteredBannedAccount/no inactiveAccountsPresent");
                    i = 104;
                    i2 = R.string.f12nameremoved;
                    C36391kE.A1F(menu, i, i2);
                }
            } else if (A1Z().A0A()) {
                Log.i("BanAppealBaseFragment/onCreateOptionsMenu/inactiveAccountsPresent");
                C36391kE.A1F(menu, 101, R.string.f12nameremoved);
                i = 102;
            } else {
                return;
            }
            i2 = R.string.f12nameremoved;
            C36391kE.A1F(menu, i, i2);
        }
    }
}
