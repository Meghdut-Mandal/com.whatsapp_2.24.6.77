package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import com.whatsapp.R;

/* renamed from: X.1p4  reason: invalid class name and case insensitive filesystem */
public final class C38501p4 extends LinearLayout {
    public Integer A00;
    public final ImageView A01 = C36361kB.A0M(this, R.id.action_button);
    public final ImageView A02 = C36361kB.A0M(this, R.id.rate_button);
    public final Space A03 = ((Space) C36361kB.A0F(this, R.id.space));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38501p4(Context context) {
        super(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
        View.inflate(context, R.layout.f9nameremoved, this);
    }

    public final void setupRateButton(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        C36331k8.A1I(onClickListener, onLongClickListener);
        ImageView imageView = this.A02;
        imageView.setOnClickListener(onClickListener);
        imageView.setOnLongClickListener(onLongClickListener);
        imageView.setVisibility(0);
        A00(this);
    }

    public static final void A00(C38501p4 r1) {
        Space space;
        int i;
        if (r1.A02.getVisibility() == 0 && r1.A01.getVisibility() == 0) {
            space = r1.A03;
            i = 0;
        } else {
            space = r1.A03;
            i = 8;
        }
        space.setVisibility(i);
    }
}
