package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

/* renamed from: X.1or  reason: invalid class name and case insensitive filesystem */
public final class C38441or extends LinearLayout {
    public C38441or(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        View inflate = View.inflate(context, R.layout.f9nameremoved, this);
        setGravity(17);
        if (C222013h.A07) {
            C36391kE.A0N(inflate, R.id.action_icon).setImageResource(C222013h.A07 ? R.drawable.ic_voip_add_person_filled_wds : R.drawable.ic_voip_add_person);
        }
        C33521fV.A04(inflate, R.string.f12nameremoved);
        C33521fV.A02(inflate);
    }
}
