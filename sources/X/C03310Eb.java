package X;

import android.content.Context;
import android.widget.ArrayAdapter;

/* renamed from: X.0Eb  reason: invalid class name and case insensitive filesystem */
public class C03310Eb extends ArrayAdapter {
    public long getItemId(int i) {
        return (long) i;
    }

    public boolean hasStableIds() {
        return true;
    }

    public C03310Eb(Context context, CharSequence[] charSequenceArr, int i) {
        super(context, i, 16908308, charSequenceArr);
    }
}
