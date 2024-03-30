package com.whatsapp.wabloks.base;

import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass6EW;
import X.AnonymousClass704;
import X.C131376Ou;
import X.C149076zt;
import X.C149096zv;
import X.C18740tg;
import X.C36361kB;
import X.C36411kG;
import X.C90524aI;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.util.Queue;

public class FdsContentFragmentManager extends Hilt_FdsContentFragmentManager {
    public C131376Ou A00;
    public boolean A01 = true;
    public FrameLayout A02;
    public final Queue A03 = C90524aI.A0l();

    public void A1H() {
        this.A00.A02(A0b().getString("fds_observer_id")).A04(this);
        this.A02 = null;
        super.A1H();
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass6EW A022 = this.A00.A02(A0b().getString("fds_observer_id"));
        AnonymousClass6EW.A00(A022, AnonymousClass704.class, this, 15);
        AnonymousClass6EW.A00(A022, C149096zv.class, this, 14);
        A022.A02(new C149076zt());
    }

    public static void A00(AnonymousClass02E r5, FdsContentFragmentManager fdsContentFragmentManager, String str) {
        AnonymousClass09Y A0S = C36411kG.A0S(fdsContentFragmentManager);
        A0S.A0J(str);
        A0S.A0G = true;
        A0S.A06(R.anim.f1nameremoved, R.anim.f1nameremoved, R.anim.f1nameremoved, R.anim.f1nameremoved);
        FrameLayout frameLayout = fdsContentFragmentManager.A02;
        C18740tg.A04(frameLayout);
        A0S.A0F(r5, (String) null, frameLayout.getId());
        A0S.A00(false);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        this.A02 = (FrameLayout) A0E.findViewById(R.id.wa_fcs_modal_fragment_container);
        return A0E;
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        AnonymousClass02E A0L = A0k().A0L(R.id.wa_fcs_modal_fragment_container);
        if (A0L != null) {
            A0L.A1U(menu, menuInflater);
        }
    }

    public boolean A1X(MenuItem menuItem) {
        AnonymousClass02E A0L = A0k().A0L(R.id.wa_fcs_modal_fragment_container);
        if (A0L != null) {
            return A0L.A1X(menuItem);
        }
        return false;
    }
}
