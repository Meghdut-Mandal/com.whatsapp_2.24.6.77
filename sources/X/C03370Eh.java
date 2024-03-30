package X;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: X.0Eh  reason: invalid class name and case insensitive filesystem */
public abstract class C03370Eh extends BaseAdapter implements C17200qt, Filterable {
    public int A00;
    public Context A01;
    public Cursor A02;
    public DataSetObserver A03;
    public C03130Dh A04;
    public boolean A05;
    public boolean A06;
    public C03390Ek A07;

    public static void A00(Context context, C03370Eh r4) {
        r4.A05 = true;
        r4.A02 = null;
        r4.A06 = false;
        r4.A01 = context;
        r4.A00 = -1;
        r4.A04 = new C03130Dh(r4);
        r4.A03 = new C03150Dj(r4);
    }

    public abstract View A04(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract void A05(View view, Context context, Cursor cursor);

    public boolean hasStableIds() {
        return true;
    }

    public CharSequence B3g(Cursor cursor) {
        if (cursor == null) {
            return "";
        }
        return cursor.toString();
    }

    public Cursor BvP(Cursor cursor) {
        Cursor cursor2 = this.A02;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C03130Dh r0 = this.A04;
            if (r0 != null) {
                cursor2.unregisterContentObserver(r0);
            }
            DataSetObserver dataSetObserver = this.A03;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.A02 = cursor;
        if (cursor != null) {
            C03130Dh r02 = this.A04;
            if (r02 != null) {
                cursor.registerContentObserver(r02);
            }
            DataSetObserver dataSetObserver2 = this.A03;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.A00 = cursor.getColumnIndexOrThrow("_id");
            this.A06 = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.A00 = -1;
        this.A06 = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.A06 || (cursor = this.A02) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.A06) {
            return null;
        }
        this.A02.moveToPosition(i);
        if (view == null) {
            view = A03(this.A01, this.A02, viewGroup);
        }
        A05(view, this.A01, this.A02);
        return view;
    }

    public Filter getFilter() {
        C03390Ek r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C03390Ek r02 = new C03390Ek(this);
        this.A07 = r02;
        return r02;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.A06 || (cursor = this.A02) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.A02;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.A06 || (cursor = this.A02) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.A02.getLong(this.A00);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.A06) {
            throw AnonymousClass001.A09("this should only be called when the cursor is valid");
        } else if (this.A02.moveToPosition(i)) {
            if (view == null) {
                view = A04(this.A01, this.A02, viewGroup);
            }
            A05(view, this.A01, this.A02);
            return view;
        } else {
            throw AnonymousClass001.A09(AnonymousClass000.A0r("couldn't move cursor to position ", AnonymousClass000.A0u(), i));
        }
    }

    @Deprecated
    public C03370Eh(Context context) {
        A00(context, this);
    }

    public View A03(Context context, Cursor cursor, ViewGroup viewGroup) {
        return A04(context, cursor, viewGroup);
    }

    public void B2b(Cursor cursor) {
        Cursor BvP = BvP(cursor);
        if (BvP != null) {
            BvP.close();
        }
    }

    public Cursor Bp5(CharSequence charSequence) {
        return this.A02;
    }

    public Cursor BAi() {
        return this.A02;
    }

    public C03370Eh(Context context, Cursor cursor, boolean z) {
        A00(context, this);
    }
}
