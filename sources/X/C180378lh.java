package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.8lh  reason: invalid class name and case insensitive filesystem */
public class C180378lh extends C166387vf {
    public C21060yb A00;
    public C20810yC A01;
    public C32681e1 A02;
    public final ImageButton A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextEmojiLabel A06;
    public final WDSButton A07;
    public final WDSButton A08;

    public C180378lh(Context context) {
        super(context);
        View A0J = C36411kG.A0J(LayoutInflater.from(context), this, getLayoutRes());
        this.A05 = C36391kE.A0P(A0J, R.id.nux_title);
        this.A07 = C36431kI.A0y(A0J, R.id.nux_cta);
        this.A08 = C36431kI.A0y(A0J, R.id.nux_cta2);
        this.A03 = (ImageButton) C012005e.A02(A0J, R.id.nux_close);
        this.A04 = C36401kF.A0G(A0J, R.id.nux_icon);
        this.A06 = C36401kF.A0O(A0J, R.id.nux_description);
    }

    public int getLayoutRes() {
        return R.layout.f9nameremoved;
    }
}
