package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0bW  reason: invalid class name and case insensitive filesystem */
public class C08910bW implements TextWatcher {
    public final /* synthetic */ SearchView A00;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C08910bW(SearchView searchView) {
        this.A00 = searchView;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SearchView searchView = this.A00;
        Editable text = searchView.A0d.getText();
        searchView.A09 = text;
        boolean z = !TextUtils.isEmpty(text);
        SearchView.A03(searchView, z);
        boolean z2 = !z;
        int i4 = 8;
        if (searchView.A0D && !searchView.A0K() && z2) {
            searchView.A0a.setVisibility(8);
            i4 = 0;
        }
        searchView.A0c.setVisibility(i4);
        SearchView.A01(searchView);
        SearchView.A02(searchView);
        if (searchView.A06 != null && !TextUtils.equals(charSequence, searchView.A08)) {
            searchView.A06.Be1(charSequence.toString());
        }
        searchView.A08 = charSequence.toString();
    }
}
