package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import com.whatsapp.R;
import java.lang.reflect.Method;

/* renamed from: X.0sx  reason: invalid class name and case insensitive filesystem */
public class C18310sx implements View.OnLayoutChangeListener {
    public Object A00;
    public final int A01;

    public C18310sx(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        if (this.A01 != 0) {
            ((BottomAppBar$Behavior) this.A00).A00.get();
            view.removeOnLayoutChangeListener(this);
            return;
        }
        SearchView searchView = (SearchView) this.A00;
        View view2 = searchView.A0X;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.A0Y.getPaddingLeft();
            Rect A06 = AnonymousClass001.A06();
            Method method = AnonymousClass04u.A00;
            boolean A07 = AnonymousClass04F.A07(searchView);
            if (searchView.A0A) {
                i9 = resources.getDimensionPixelSize(R.dimen.f7nameremoved) + resources.getDimensionPixelSize(R.dimen.f7nameremoved);
            } else {
                i9 = 0;
            }
            SearchView.SearchAutoComplete searchAutoComplete = searchView.A0d;
            searchAutoComplete.getDropDownBackground().getPadding(A06);
            int i11 = A06.left;
            if (A07) {
                i10 = -i11;
            } else {
                i10 = paddingLeft - (i11 + i9);
            }
            searchAutoComplete.setDropDownHorizontalOffset(i10);
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + A06.left) + A06.right) + i9) - paddingLeft);
        }
    }
}
