package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1ym  reason: invalid class name and case insensitive filesystem */
public class C42411ym extends AnonymousClass0D3 {
    public final View A00;
    public final CheckBox A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final View A05;
    public final ImageView A06;
    public final ImageView A07;

    public C42411ym(View view) {
        super(view);
        this.A04 = C36391kE.A0P(view, R.id.title_tv);
        this.A03 = C36391kE.A0P(view, R.id.subtitle_tv);
        this.A05 = view.findViewById(R.id.primary_action_btn);
        this.A02 = C36391kE.A0N(view, R.id.primary_action_icon);
        this.A06 = C36391kE.A0N(view, R.id.secondary_action_btn);
        this.A07 = C36391kE.A0N(view, R.id.third_action_btn);
        this.A01 = (CheckBox) view.findViewById(R.id.cbx);
        this.A00 = view;
    }
}
