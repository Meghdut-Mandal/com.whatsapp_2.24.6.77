package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.0Em  reason: invalid class name and case insensitive filesystem */
public class C03410Em extends FrameLayout {
    public ViewGroup A00;
    public boolean A01 = true;

    public void onViewAdded(View view) {
        if (this.A01) {
            super.onViewAdded(view);
            return;
        }
        throw AnonymousClass001.A09("This GhostViewHolder is detached!");
    }

    public C03410Em(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.A00 = viewGroup;
        viewGroup.setTag(R.id.ghost_view_holder, this);
        new AnonymousClass0SN(this.A00).A00.add(this);
    }

    public static void A00(View view, ArrayList arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            A00((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            ViewGroup viewGroup = this.A00;
            viewGroup.setTag(R.id.ghost_view_holder, (Object) null);
            new AnonymousClass0SN(viewGroup).A00.remove(this);
            this.A01 = false;
        }
    }
}
