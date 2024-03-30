package X;

import android.database.Cursor;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0fo  reason: invalid class name and case insensitive filesystem */
public class C11150fo implements Runnable {
    public final /* synthetic */ SearchView A00;

    public C11150fo(SearchView searchView) {
        this.A00 = searchView;
    }

    public void run() {
        C03370Eh r1 = this.A00.A07;
        if (r1 instanceof AnonymousClass0HG) {
            r1.B2b((Cursor) null);
        }
    }
}
