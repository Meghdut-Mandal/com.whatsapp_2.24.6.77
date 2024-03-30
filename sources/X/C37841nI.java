package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1nI  reason: invalid class name and case insensitive filesystem */
public class C37841nI extends ArrayAdapter {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass1RY A01;
    public final /* synthetic */ C21130A9q A02;
    public final /* synthetic */ List A03;

    public boolean hasStableIds() {
        return true;
    }

    public int getCount() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A03.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass141 r2 = (AnonymousClass141) this.A03.get(i);
        C18740tg.A06(r2);
        if (view == null) {
            view = C36361kB.A0E(LayoutInflater.from(this.A00), viewGroup, R.layout.f9nameremoved);
        }
        C36391kE.A0O(view, R.id.contact_name).setText(this.A02.A0C.A0H(r2));
        ImageView A0G = C36401kF.A0G(view, R.id.contact_row_photo);
        this.A01.A08(A0G, r2);
        C011504z.A06(A0G, 2);
        C33521fV.A04(view, R.string.f12nameremoved);
        return view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37841nI(Context context, Context context2, AnonymousClass1RY r4, C21130A9q a9q, List list, List list2) {
        super(context, R.layout.f9nameremoved, list);
        this.A02 = a9q;
        this.A03 = list2;
        this.A00 = context2;
        this.A01 = r4;
    }
}
