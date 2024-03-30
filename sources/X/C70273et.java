package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3et  reason: invalid class name and case insensitive filesystem */
public class C70273et implements AnonymousClass4UY {
    public final /* synthetic */ View A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ AnonymousClass27v A02;

    public C70273et(View view, AnonymousClass27v r2, List list) {
        this.A02 = r2;
        this.A01 = list;
        this.A00 = view;
    }

    public void BXf() {
        C36331k8.A1E(this.A02.A0D.A00);
        BYu();
    }

    public void BXg(AnonymousClass141 r4) {
        if (r4 != null) {
            AnonymousClass27v r1 = this.A02;
            List list = r1.A0R;
            boolean contains = list.contains(r4);
            List list2 = r1.A0Q;
            Object obj = r4;
            if (contains) {
                obj = list.get(list.indexOf(r4));
            }
            list2.add(obj);
        }
        AnonymousClass27v r2 = this.A02;
        C49112ia r12 = new C49112ia(r2, this.A01);
        r2.A0H = r12;
        C36331k8.A1F(r12, r2.A04);
        BYu();
    }

    public void BXh() {
        AnonymousClass27v r1 = this.A02;
        r1.A0T = true;
        C36401kF.A1B(r1, R.id.init_contacts_progress);
        this.A00.setVisibility(8);
    }

    public void BYu() {
        AnonymousClass27v r2 = this.A02;
        r2.A0T = false;
        C36331k8.A11(r2, R.id.init_contacts_progress);
        this.A00.setVisibility(0);
    }

    public void Bgc(int i) {
        AnonymousClass27v r1 = this.A02;
        int A09 = C36391kE.A09(r1, R.id.search_no_matches);
        TextView A0Q = C36391kE.A0Q(r1, R.id.error_text_line1);
        TextView A0Q2 = C36391kE.A0Q(r1, R.id.error_text_line2);
        View findViewById = r1.findViewById(R.id.retry_button);
        AnonymousClass3YE.A00(findViewById, this, this.A01, 43);
        int i2 = 8;
        if (i != 2) {
            i2 = 0;
        }
        findViewById.setVisibility(i2);
        int i3 = R.string.f12nameremoved;
        if (i != 0) {
            i3 = R.string.f12nameremoved;
            if (i != 2) {
                i3 = R.string.f12nameremoved;
            }
        }
        A0Q.setText(i3);
        A0Q.setVisibility(0);
        int i4 = R.string.f12nameremoved;
        if (i != 0) {
            if (i == 2) {
                i4 = R.string.f12nameremoved;
            }
            A0Q2.setVisibility(A09);
        }
        Integer valueOf = Integer.valueOf(i4);
        if (valueOf != null) {
            A0Q2.setText(valueOf.intValue());
            A0Q2.setVisibility(0);
            return;
        }
        A0Q2.setVisibility(A09);
    }
}
