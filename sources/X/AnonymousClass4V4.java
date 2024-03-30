package X;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

/* renamed from: X.4V4  reason: invalid class name */
public interface AnonymousClass4V4 extends ListAdapter {
    Cursor BAi();

    AnonymousClass3T1 BD5(int i);

    AnonymousClass3T1 BD6(Cursor cursor, int i);

    int BDA(AnonymousClass3T1 r1, int i);

    View BJ5(View view, ViewGroup viewGroup, AnonymousClass3T1 r3, int i);

    Cursor BvP(Cursor cursor);

    void notifyDataSetChanged();
}
