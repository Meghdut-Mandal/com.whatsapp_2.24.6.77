package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.community.SubgroupWithParentView;

/* renamed from: X.2F0  reason: invalid class name */
public final class AnonymousClass2F0 extends SubgroupWithParentView implements C22929Ayf {
    public AnonymousClass2F0(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public LinearLayout.LayoutParams getHeaderLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.f7nameremoved), getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        layoutParams.gravity = 1;
        return layoutParams;
    }

    public View getHeaderView() {
        return this;
    }
}
