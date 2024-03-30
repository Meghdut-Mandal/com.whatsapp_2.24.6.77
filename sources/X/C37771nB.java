package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.support.faq.SearchFAQ;
import java.util.List;

/* renamed from: X.1nB  reason: invalid class name and case insensitive filesystem */
public class C37771nB extends ArrayAdapter {
    public final /* synthetic */ SearchFAQ A00;

    public View getView(int i, View view, ViewGroup viewGroup) {
        C598035i r0;
        LinearLayout linearLayout;
        if (view == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            LayoutInflater layoutInflater = (LayoutInflater) C21060yb.A02(getContext(), "layout_inflater");
            C18740tg.A06(layoutInflater);
            layoutInflater.inflate(R.layout.f9nameremoved, linearLayout2, true);
            r0 = new C598035i();
            r0.A01 = C36391kE.A0P(linearLayout2, R.id.search_faq_row_text);
            r0.A00 = linearLayout2.findViewById(R.id.divider);
            linearLayout2.setTag(r0);
            linearLayout = linearLayout2;
        } else {
            r0 = (C598035i) view.getTag();
            linearLayout = view;
        }
        Object item = getItem(i);
        C18740tg.A06(item);
        C606238o r3 = (C606238o) item;
        r0.A01.setText(r3.A02);
        View view2 = r0.A00;
        int i2 = 8;
        if (i < getCount() - 1) {
            i2 = 0;
        }
        view2.setVisibility(i2);
        AnonymousClass3YC.A00(linearLayout, this, r3, 32);
        return linearLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37771nB(Context context, SearchFAQ searchFAQ, List list) {
        super(context, R.layout.f9nameremoved, list);
        this.A00 = searchFAQ;
    }
}
