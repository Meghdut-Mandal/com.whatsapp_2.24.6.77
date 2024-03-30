package X;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0cA  reason: invalid class name and case insensitive filesystem */
public class C09310cA implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchView A00;

    public C09310cA(SearchView searchView) {
        this.A00 = searchView;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.A00.A0F();
        return true;
    }
}
