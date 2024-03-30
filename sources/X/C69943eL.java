package X;

import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.3eL  reason: invalid class name and case insensitive filesystem */
public final class C69943eL implements AnonymousClass4V4 {
    public final C235718z A00;
    public final AnonymousClass4V4 A01;
    public final List A02 = AnonymousClass001.A0I();

    public C69943eL(C235718z r2, AnonymousClass4V4 r3) {
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public Cursor BAi() {
        return this.A01.BAi();
    }

    public AnonymousClass3T1 BD6(Cursor cursor, int i) {
        return this.A01.BD6(cursor, i);
    }

    public int BDA(AnonymousClass3T1 r2, int i) {
        return this.A01.BDA(r2, i);
    }

    public View BJ5(View view, ViewGroup viewGroup, AnonymousClass3T1 r4, int i) {
        return this.A01.BJ5(view, viewGroup, r4, i);
    }

    public boolean areAllItemsEnabled() {
        return this.A01.areAllItemsEnabled();
    }

    public long getItemId(int i) {
        return this.A01.getItemId(i);
    }

    public int getViewTypeCount() {
        return this.A01.getViewTypeCount();
    }

    public boolean hasStableIds() {
        return this.A01.hasStableIds();
    }

    public boolean isEnabled(int i) {
        return this.A01.isEnabled(i);
    }

    public void notifyDataSetChanged() {
        this.A01.notifyDataSetChanged();
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.A01.registerDataSetObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.A01.unregisterDataSetObserver(dataSetObserver);
    }

    /* renamed from: BD5 */
    public AnonymousClass3T1 getItem(int i) {
        List list = this.A02;
        if (list.size() > i) {
            return C36411kG.A0n(list, i);
        }
        return null;
    }

    public Cursor BvP(Cursor cursor) {
        AnonymousClass11F r2;
        List list = this.A02;
        list.clear();
        if (cursor != null) {
            int count = cursor.getCount();
            for (int i = 0; i < count; i++) {
                AnonymousClass3T1 BD6 = this.A01.BD6(cursor, i);
                if (BD6 != null && ((r2 = BD6.A1J.A00) == null || (true ^ this.A00.A0P(r2)))) {
                    list.add(BD6);
                }
            }
        }
        return this.A01.BvP(cursor);
    }

    public int getCount() {
        return this.A02.size();
    }

    public boolean isEmpty() {
        return this.A02.isEmpty();
    }

    public int getItemViewType(int i) {
        return this.A01.BDA(getItem(i), i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.A01.BJ5(view, viewGroup, getItem(i), i);
    }
}
