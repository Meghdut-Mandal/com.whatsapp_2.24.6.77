package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.status.StatusesFragment;
import java.util.List;

/* renamed from: X.3rG  reason: invalid class name and case insensitive filesystem */
public class C77913rG implements C88134Rn {
    public final long A00;
    public final /* synthetic */ StatusesFragment A01;

    public View BJ6(Context context, View view, ViewGroup viewGroup, AnonymousClass1RY r15, List list, List list2, List list3, List list4, boolean z) {
        int i;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, viewGroup, false);
            C011504z.A06(view, 1);
        }
        TextView A0E = C36351kA.A0E(view);
        C33511fU.A03(A0E);
        long j = this.A00;
        if (j == 0) {
            i = R.string.f12nameremoved;
        } else if (j == 1) {
            i = R.string.f12nameremoved;
        } else {
            if (j != 2) {
                C36341k9.A1M("statusesFragment/invalid id: ", AnonymousClass000.A0u(), j);
            }
            i = R.string.f12nameremoved;
        }
        A0E.setText(i);
        ImageView A0N = C36391kE.A0N(view, R.id.status_chevron);
        C011504z.A06(A0N, 2);
        StatusesFragment statusesFragment = this.A01;
        if (!statusesFragment.A1M || j != 2 || statusesFragment.A1K) {
            A0N.setVisibility(4);
            C012005e.A0V(view, (C011705b) null);
            view.setOnClickListener((View.OnClickListener) null);
            view.setClickable(false);
        } else {
            A0N.setVisibility(0);
            boolean z2 = statusesFragment.A1J;
            int i2 = R.string.f12nameremoved;
            if (z2) {
                i2 = R.string.f12nameremoved;
            }
            C33521fV.A03(view, i2);
            boolean z3 = statusesFragment.A1J;
            Resources A0G = C36341k9.A0G(statusesFragment);
            int i3 = R.drawable.ic_chevron_up;
            if (z3) {
                i3 = R.drawable.ic_chevron_down;
            }
            A0N.setImageDrawable(A0G.getDrawable(i3));
            view.setClickable(true);
            AnonymousClass3YC.A00(view, this, A0N, 17);
        }
        C33521fV.A07(view, true);
        return view;
    }

    public C77913rG(StatusesFragment statusesFragment, long j) {
        this.A01 = statusesFragment;
        this.A00 = j;
    }
}
