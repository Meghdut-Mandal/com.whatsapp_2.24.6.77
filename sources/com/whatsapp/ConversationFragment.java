package com.whatsapp;

import X.AnonymousClass02T;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass15A;
import X.AnonymousClass15C;
import X.AnonymousClass15D;
import X.AnonymousClass15E;
import X.AnonymousClass22h;
import X.C016307a;
import X.C224514j;
import X.C43472Ht;
import X.C66893Xs;
import X.C67493a0;
import X.C70803fk;
import X.C88684Tq;
import X.C90094Zb;
import android.app.assist.AssistContent;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import java.util.List;

public class ConversationFragment extends Hilt_ConversationFragment implements AnonymousClass15A, AnonymousClass15C, AnonymousClass15D, AnonymousClass15E {
    public Bundle A00;
    public FrameLayout A01;
    public C43472Ht A02;
    public final AnonymousClass02T A03 = new C67493a0(this);

    private void A00(Menu menu, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            item.setOnMenuItemClickListener(onMenuItemClickListener);
            if (item.getSubMenu() != null) {
                A00(item.getSubMenu(), onMenuItemClickListener);
            }
        }
    }

    public void A1H() {
        C43472Ht r0 = this.A02;
        if (r0 != null) {
            Toolbar toolbar = r0.A04.A0j;
            if (toolbar != null) {
                Menu menu = toolbar.getMenu();
                for (int i = 0; i < menu.size(); i++) {
                    menu.getItem(i).setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener) null);
                }
            }
            C43472Ht r1 = this.A02;
            r1.A04.A1u();
            r1.A09.clear();
            r1.A00.A07();
            r1.A01.clear();
        }
        super.A1H();
    }

    public void A1I() {
        Toolbar toolbar;
        C43472Ht r0 = this.A02;
        if (r0 != null && (toolbar = r0.A04.A0j) != null) {
            Menu menu = toolbar.getMenu();
            if (menu != null) {
                A00(menu, (MenuItem.OnMenuItemClickListener) null);
            }
            if (menu instanceof C016307a) {
                ((C016307a) menu).A0C((AnonymousClass02T) null);
            }
        }
    }

    public void A1T(Menu menu) {
        Toolbar toolbar;
        C43472Ht r0 = this.A02;
        if (r0 != null && (toolbar = r0.A04.A0j) != null) {
            Menu menu2 = toolbar.getMenu();
            C70803fk r2 = this.A02.A04;
            for (C88684Tq BdM : r2.A7C) {
                BdM.BdM(menu2);
            }
            r2.A2l.Bic(menu2);
        }
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        Toolbar toolbar;
        C43472Ht r0 = this.A02;
        if (r0 != null && (toolbar = r0.A04.A0j) != null) {
            Menu menu2 = toolbar.getMenu();
            menu2.clear();
            C70803fk r2 = this.A02.A04;
            for (C88684Tq BUv : r2.A7C) {
                BUv.BUv(menu2);
            }
            r2.A2l.BiY(menu2);
            A00(menu2, new C66893Xs(this.A02));
            if (menu2 instanceof C016307a) {
                ((C016307a) menu2).A0C(this.A03);
            }
        }
    }

    public void A1Z(AssistContent assistContent) {
        C43472Ht r0 = this.A02;
        if (r0 != null) {
            r0.A03(assistContent);
        }
    }

    public void B0n(AnonymousClass141 r2, AnonymousClass11F r3) {
        C43472Ht r0 = this.A02;
        if (r0 != null) {
            r0.B0n(r2, r3);
        }
    }

    public void BQs(long j, boolean z) {
        C43472Ht r0 = this.A02;
        if (r0 != null) {
            r0.BQs(j, z);
        }
    }

    public void BRT() {
        C43472Ht r0 = this.A02;
        if (r0 != null) {
            r0.BRT();
        }
    }

    public void BUu(long j, boolean z) {
        C43472Ht r0 = this.A02;
        if (r0 != null) {
            r0.BUu(j, z);
        }
    }

    public void Bch(PickerSearchDialogFragment pickerSearchDialogFragment) {
        C43472Ht r0 = this.A02;
        if (r0 != null) {
            r0.Bch(pickerSearchDialogFragment);
        }
    }

    public void BkD() {
        C43472Ht r0 = this.A02;
        if (r0 != null) {
            r0.BkD();
        }
    }

    public void Btk(DialogFragment dialogFragment) {
        C43472Ht r0 = this.A02;
        if (r0 != null) {
            r0.Btk(dialogFragment);
        }
    }

    public void A1B() {
        super.A1B();
        C43472Ht r0 = this.A02;
        if (r0 != null) {
            r0.A04.A20();
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(A1D());
        this.A01 = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.A00 = bundle;
        return this.A01;
    }

    public void A1K() {
        super.A1K();
        C43472Ht r1 = this.A02;
        if (r1 != null) {
            r1.A00.A08();
            r1.A04.A1w();
        }
    }

    public void A1L() {
        super.A1L();
        C43472Ht r0 = this.A02;
        if (r0 != null) {
            r0.A04.A1y();
        }
    }

    public void A1M() {
        super.A1M();
        C43472Ht r0 = this.A02;
        if (r0 != null) {
            r0.A04.A1z();
        }
    }

    public void A1N(int i, int i2, Intent intent) {
        super.A1N(i, i2, intent);
        C43472Ht r1 = this.A02;
        if (r1 != null) {
            r1.A00.A0C(i, i2, intent);
            r1.A04.A24(i, i2, intent);
        }
    }

    public void A1S(Bundle bundle, View view) {
        C43472Ht r3 = new C43472Ht(A1D());
        this.A02 = r3;
        r3.A00 = this;
        r3.A01 = this;
        r3.setCustomActionBarEnabled(true);
        r3.A00 = this;
        r3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.A01.addView(this.A02);
        A10(true);
        C43472Ht r0 = this.A02;
        AnonymousClass22h.A00(r0);
        r0.A01.A00();
        C43472Ht r4 = this.A02;
        Bundle bundle2 = this.A00;
        C70803fk r02 = r4.A04;
        if (r02 != null) {
            r02.A2l = r4;
            List list = r4.A09;
            if (list == null || 0 >= list.size()) {
                r4.A04.A29(bundle2);
            } else {
                list.get(0);
                throw new NullPointerException("onCreate");
            }
        }
        this.A02.getViewTreeObserver().addOnGlobalLayoutListener(new C90094Zb(this, 1));
        Toolbar toolbar = this.A02.A04.A0j;
        if (toolbar != null) {
            toolbar.setBackgroundColor(A0a().getResources().getColor(C224514j.A00(A1D(), R.attr.f4nameremoved, R.color.f6nameremoved)));
        }
    }
}
