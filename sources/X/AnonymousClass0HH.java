package X;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0HH  reason: invalid class name */
public abstract class AnonymousClass0HH extends C03370Eh {
    public int A00;
    public int A01;
    public LayoutInflater A02;

    @Deprecated
    public AnonymousClass0HH(Context context, int i) {
        super(context, (Cursor) null, true);
        this.A00 = i;
        this.A01 = i;
        this.A02 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View A03(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.A02.inflate(this.A00, viewGroup, false);
    }

    public View A04(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.A02.inflate(this.A01, viewGroup, false);
    }
}
