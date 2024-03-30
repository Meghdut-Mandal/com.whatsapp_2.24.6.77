package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0c5  reason: invalid class name and case insensitive filesystem */
public class C09260c5 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ SearchView A00;

    public C09260c5(SearchView searchView) {
        this.A00 = searchView;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.A00.A0L(i);
    }
}
