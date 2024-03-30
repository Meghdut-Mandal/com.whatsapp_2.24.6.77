package X;

import android.text.TextUtils;
import android.widget.Filter;
import com.whatsapp.R;
import com.whatsapp.group.GroupChatInfoActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ne  reason: invalid class name and case insensitive filesystem */
public class C38061ne extends Filter {
    public final /* synthetic */ C38031nb A00;

    public C38061ne(C38031nb r1) {
        this.A00 = r1;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (!TextUtils.isEmpty(charSequence)) {
            ArrayList A0I = AnonymousClass001.A0I();
            String charSequence2 = charSequence.toString();
            C38031nb r2 = this.A00;
            GroupChatInfoActivity groupChatInfoActivity = r2.A07;
            ArrayList A03 = C202859mm.A03(groupChatInfoActivity.A0q, charSequence2);
            boolean contains = AnonymousClass14B.A06(charSequence).contains(AnonymousClass14B.A06(groupChatInfoActivity.getString(R.string.f12nameremoved)));
            for (C87834Qi r5 : r2.A01) {
                if (r5 instanceof C75083me) {
                    AnonymousClass141 r8 = ((C75083me) r5).A00;
                    if (!groupChatInfoActivity.A0j.A0h(r8, A03, true)) {
                        if (!C202859mm.A04(groupChatInfoActivity.A0q, r8.A0a, A03, true)) {
                            if (contains) {
                                if (!groupChatInfoActivity.A0M.A0J(groupChatInfoActivity.A1Y, C36351kA.A0k(r8))) {
                                }
                            }
                        }
                    }
                    A0I.add(r5);
                }
            }
            boolean isEmpty = A0I.isEmpty();
            arrayList = A0I;
            if (isEmpty) {
                A0I.add(0, new C75093mf(charSequence.toString()));
                arrayList = A0I;
            }
        } else {
            arrayList = this.A00.A01;
        }
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        List list;
        Object obj = filterResults.values;
        if (obj == null) {
            list = this.A00.A01;
        } else {
            list = (ArrayList) obj;
        }
        C38031nb.A00(this.A00, list);
    }
}
