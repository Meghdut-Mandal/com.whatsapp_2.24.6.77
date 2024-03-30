package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5Gu  reason: invalid class name */
public abstract class AnonymousClass5Gu extends C96954oA {
    public View.OnClickListener A00;
    public ViewGroup A01;
    public FrameLayout A02;
    public ImageView A03;
    public LinearLayout A04;
    public TextView A05;
    public TextView A06;
    public CharSequence A07;
    public CharSequence A08;
    public final List A09 = AnonymousClass001.A0I();

    public void A0C() {
        ViewGroup viewGroup;
        View.OnClickListener onClickListener;
        List list = this.A09;
        int i = 0;
        if (list.size() > 2) {
            viewGroup = this.A01;
            viewGroup.setVisibility(0);
            this.A05.setText(this.A08);
            onClickListener = this.A00;
        } else {
            if (!list.isEmpty()) {
                i = 8;
                this.A01.setVisibility(8);
            } else if (this.A02.getChildCount() <= 0) {
                viewGroup = this.A01;
                viewGroup.setVisibility(0);
                this.A05.setText(this.A07);
                onClickListener = null;
            }
            this.A02.setVisibility(i);
            return;
        }
        viewGroup.setOnClickListener(onClickListener);
    }

    public AnonymousClass5Gu(View view) {
        super(view);
        View view2 = this.A0H;
        this.A06 = C36391kE.A0O(view2, R.id.header);
        this.A01 = C36411kG.A0O(view2, R.id.see_more_container);
        this.A03 = C36401kF.A0G(view2, R.id.see_more_icon);
        this.A05 = C36391kE.A0O(view2, R.id.see_more_text);
        this.A02 = C36441kJ.A0T(view2, R.id.custom_empty_view_container);
        this.A04 = C90514aH.A0U(view2, R.id.list_item_container);
    }
}
