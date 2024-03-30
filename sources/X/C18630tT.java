package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0tT  reason: invalid class name and case insensitive filesystem */
public class C18630tT implements AdapterView.OnItemSelectedListener {
    public Object A00;
    public final int A01;

    public C18630tT(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        AnonymousClass0F6 r1;
        if (this.A01 != 0) {
            ((SearchView) this.A00).A0G(i);
        } else if (i != -1 && (r1 = ((C09470cQ) this.A00).A0B) != null) {
            r1.A08 = false;
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}
