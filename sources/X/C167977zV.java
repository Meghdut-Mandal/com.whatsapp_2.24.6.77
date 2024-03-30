package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.framework.alerts.ui.AlertCardListFragment;
import java.util.List;

/* renamed from: X.7zV  reason: invalid class name and case insensitive filesystem */
public final class C167977zV extends AnonymousClass0CZ {
    public AlertCardListFragment A00;
    public List A01 = AnonymousClass001.A0I();

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        View inflate = C36341k9.A0J(viewGroup, 0).inflate(R.layout.f9nameremoved, viewGroup, false);
        List list = AnonymousClass0D3.A0I;
        AnonymousClass00C.A0B(inflate);
        return new AnonymousClass806(inflate);
    }

    public int A0J() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r9, int i) {
        ImageView imageView;
        Context context;
        int i2;
        AnonymousClass806 r92 = (AnonymousClass806) r9;
        AnonymousClass00C.A0D(r92, 0);
        C21667AUj aUj = (C21667AUj) this.A01.get(i);
        AlertCardListFragment alertCardListFragment = this.A00;
        AnonymousClass00C.A0D(aUj, 0);
        AnonymousClass00T r5 = r92.A03;
        ((View) C36381kD.A0p(r5)).setVisibility(0);
        int i3 = aUj.A01;
        if (i3 != 1) {
            if (i3 == 2) {
                AnonymousClass00T r4 = r92.A04;
                View view = r92.A0H;
                C36391kE.A18(view.getContext(), (ImageView) C36381kD.A0p(r4), R.drawable.ic_alert);
                imageView = (ImageView) C36381kD.A0p(r4);
                context = view.getContext();
                i2 = R.color.f6nameremoved;
            } else if (i3 == 3) {
                AnonymousClass00T r42 = r92.A04;
                View view2 = r92.A0H;
                C36391kE.A18(view2.getContext(), (ImageView) C36381kD.A0p(r42), R.drawable.ic_card);
                imageView = (ImageView) C36381kD.A0p(r42);
                context = view2.getContext();
                i2 = R.color.f6nameremoved;
            }
            AnonymousClass06T.A00(C36431kI.A0G(context, i2), imageView);
        } else {
            AnonymousClass00T r43 = r92.A04;
            View view3 = r92.A0H;
            C36391kE.A18(view3.getContext(), (ImageView) C36381kD.A0p(r43), R.drawable.ic_alert_round);
            AnonymousClass06T.A00(C36431kI.A0G(view3.getContext(), R.color.f6nameremoved), (ImageView) C36381kD.A0p(r43));
            ((View) C36381kD.A0p(r5)).setVisibility(8);
        }
        C36351kA.A0G(r92.A05).setText(aUj.A08);
        C36351kA.A0G(r92.A02).setText(aUj.A05);
        TextView A0G = C36351kA.A0G(r92.A01);
        A0G.setText(aUj.A04);
        AnonymousClass3YG.A00(A0G, alertCardListFragment, aUj, 23);
        if (((View) C36381kD.A0p(r5)).getVisibility() == 0) {
            TextView A0G2 = C36351kA.A0G(r5);
            A0G2.setText(R.string.f12nameremoved);
            AnonymousClass3YG.A00(A0G2, alertCardListFragment, aUj, 24);
        }
    }

    public C167977zV(AlertCardListFragment alertCardListFragment, List list) {
        this.A00 = alertCardListFragment;
        this.A01 = list;
    }
}
