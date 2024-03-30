package com.whatsapp.conversationslist;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass3ZU;
import X.C012005e;
import X.C21060yb;
import X.C33501fT;
import X.C33521fV;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C81113wU;
import X.C99304t3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.fragment.app.ListFragment;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

public abstract class FolderConversationsFragment extends Hilt_FolderConversationsFragment {
    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ListView listView;
        AnonymousClass00C.A0D(layoutInflater, 0);
        View A1G = super.A1G(bundle, layoutInflater, viewGroup);
        if (!(A1G == null || (listView = (ListView) C012005e.A02(A1G, 16908298)) == null)) {
            listView.removeHeaderView(this.A0G);
            listView.removeHeaderView(this.A1J);
        }
        return A1G;
    }

    public abstract List A1d();

    public void A1j() {
    }

    public void A1k() {
    }

    public void A1n(ListView listView) {
    }

    public void A1o(ListView listView) {
    }

    public void A1p(ListView listView) {
    }

    public void A1q(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        View findViewById;
        boolean A1a = C36341k9.A1a(charSequence, charSequence2);
        AnonymousClass01I A0i = A0i();
        if (!A0i.isFinishing() && A1d().size() != A1a && (findViewById = A0i.findViewById(R.id.container)) != null) {
            C99304t3 A01 = C99304t3.A01(findViewById, charSequence, 0);
            A01.A0Z(charSequence2, onClickListener);
            A01.A0X(C36351kA.A01(A0i, R.attr.f4nameremoved, R.color.f6nameremoved));
            ArrayList A0I = AnonymousClass001.A0I();
            A0I.add(A0i.findViewById(R.id.fab));
            A0I.add(A0i.findViewById(R.id.fab_second));
            C21060yb r5 = this.A1d;
            AnonymousClass00C.A07(r5);
            AnonymousClass3ZU r2 = new AnonymousClass3ZU(this, A01, r5, A0I, false);
            this.A2g = r2;
            r2.A05(new C81113wU((Object) this, 11));
            AnonymousClass3ZU r0 = this.A2g;
            if (r0 != null) {
                r0.A02();
            }
        }
    }

    public boolean A1y() {
        return false;
    }

    public void A1h() {
        A1l();
        A1i();
        C33501fT r1 = this.A1H;
        if (r1 != null) {
            r1.setVisibility(false);
        }
    }

    public final View A22(int i) {
        LayoutInflater A0J = C36381kD.A0J(this);
        ListFragment.A00(this);
        View A0J2 = C36371kC.A0J(A0J, this.A05, i, false);
        FrameLayout frameLayout = new FrameLayout(A0a());
        C33521fV.A07(frameLayout, false);
        frameLayout.addView(A0J2);
        ListFragment.A00(this);
        this.A05.addHeaderView(frameLayout, (Object) null, false);
        return A0J2;
    }
}
