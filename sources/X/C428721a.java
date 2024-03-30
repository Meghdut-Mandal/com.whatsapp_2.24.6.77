package X;

import android.view.animation.Animation;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.HomeActivity;

/* renamed from: X.21a  reason: invalid class name and case insensitive filesystem */
public class C428721a extends C67243Zb {
    public final /* synthetic */ HomeActivity A00;

    public C428721a(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    public void onAnimationEnd(Animation animation) {
        SearchView searchView = this.A00.A0L;
        if (searchView != null) {
            searchView.A0E();
        }
    }
}
