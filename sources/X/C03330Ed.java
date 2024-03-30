package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.0Ed  reason: invalid class name and case insensitive filesystem */
public class C03330Ed extends BaseAdapter {
    public int A00 = -1;
    public final /* synthetic */ C09440cN A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.A01.A02.inflate(R.layout.f9nameremoved, viewGroup, false);
        }
        ((AnonymousClass080) view).BKf(getItem(i), 0);
        return view;
    }

    public C03330Ed(C09440cN r2) {
        this.A01 = r2;
        A01();
    }

    /* renamed from: A00 */
    public C018707z getItem(int i) {
        C016307a r0 = this.A01.A01;
        r0.A05();
        ArrayList arrayList = r0.A08;
        int i2 = this.A00;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C018707z) arrayList.get(i);
    }

    public void A01() {
        C016307a r0 = this.A01.A01;
        C018707z r4 = r0.A04;
        if (r4 != null) {
            r0.A05();
            ArrayList arrayList = r0.A08;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == r4) {
                    this.A00 = i;
                    return;
                }
            }
        }
        this.A00 = -1;
    }

    public int getCount() {
        C016307a r0 = this.A01.A01;
        r0.A05();
        int size = r0.A08.size();
        if (this.A00 >= 0) {
            return size - 1;
        }
        return size;
    }

    public void notifyDataSetChanged() {
        A01();
        super.notifyDataSetChanged();
    }
}
