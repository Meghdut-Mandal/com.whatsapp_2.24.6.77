package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: X.1nM  reason: invalid class name and case insensitive filesystem */
public final class C37881nM extends BaseAdapter {
    public final ArrayList A00;

    public long getItemId(int i) {
        return 0;
    }

    public int getCount() {
        return this.A00.size();
    }

    public Object getItem(int i) {
        Object obj = this.A00.get(i);
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public C37881nM(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Object item = getItem(i);
        AnonymousClass00C.A0E(item, "null cannot be cast to non-null type com.whatsapp.components.button.ThumbnailButton");
        return (View) item;
    }
}
