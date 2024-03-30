package X;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0bk  reason: invalid class name and case insensitive filesystem */
public class C09050bk implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView A00;

    public C09050bk(SearchView searchView) {
        this.A00 = searchView;
    }

    public void onFocusChange(View view, boolean z) {
        SearchView searchView = this.A00;
        View.OnFocusChangeListener onFocusChangeListener = searchView.A04;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
