package X;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0bl  reason: invalid class name and case insensitive filesystem */
public class C09060bl implements View.OnKeyListener {
    public final /* synthetic */ SearchView A00;

    public C09060bl(SearchView searchView) {
        this.A00 = searchView;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.A00;
        if (searchView.A01 != null) {
            SearchView.SearchAutoComplete searchAutoComplete = searchView.A0d;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                    view.cancelLongPress();
                    searchView.A0J(searchAutoComplete.getText().toString());
                    return true;
                }
            } else if (searchView.A01 == null || searchView.A07 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            } else {
                if (i == 66 || i == 84 || i == 61) {
                    return searchView.A0L(searchAutoComplete.getListSelection());
                }
                int i2 = 0;
                if (i != 21) {
                    if (i == 22) {
                        i2 = searchAutoComplete.length();
                    } else if (i != 19) {
                        return false;
                    } else {
                        searchAutoComplete.getListSelection();
                        return false;
                    }
                }
                searchAutoComplete.setSelection(i2);
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.A00();
                return true;
            }
        }
        return false;
    }
}
