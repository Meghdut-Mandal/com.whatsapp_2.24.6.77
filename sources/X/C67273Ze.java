package X;

import android.view.View;
import android.widget.AbsListView;
import com.whatsapp.BottomSheetListView;
import com.whatsapp.R;
import com.whatsapp.registration.EULA;

/* renamed from: X.3Ze  reason: invalid class name and case insensitive filesystem */
public class C67273Ze implements AbsListView.OnScrollListener {
    public final /* synthetic */ BottomSheetListView A00;
    public final /* synthetic */ EULA A01;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C67273Ze(BottomSheetListView bottomSheetListView, EULA eula) {
        this.A01 = eula;
        this.A00 = bottomSheetListView;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View findViewById = this.A01.findViewById(R.id.fade_view);
        if (findViewById != null) {
            findViewById.setVisibility(C36351kA.A00(this.A00.A01() ? 1 : 0));
        }
    }
}
