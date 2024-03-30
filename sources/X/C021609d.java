package X;

import android.widget.ListView;
import androidx.fragment.app.ListFragment;

/* renamed from: X.09d  reason: invalid class name and case insensitive filesystem */
public class C021609d implements Runnable {
    public final /* synthetic */ ListFragment A00;

    public C021609d(ListFragment listFragment) {
        this.A00 = listFragment;
    }

    public void run() {
        ListView listView = this.A00.A05;
        listView.focusableViewAvailable(listView);
    }
}
