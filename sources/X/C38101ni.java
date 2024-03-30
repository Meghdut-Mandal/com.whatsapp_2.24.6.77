package X;

import android.animation.AnimatorSet;
import android.text.TextUtils;
import android.widget.Filter;
import com.whatsapp.status.StatusesFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1ni  reason: invalid class name and case insensitive filesystem */
public class C38101ni extends Filter {
    public final /* synthetic */ StatusesFragment A00;

    public C38101ni(StatusesFragment statusesFragment) {
        this.A00 = statusesFragment;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList arrayList = null;
        if (TextUtils.isEmpty(charSequence)) {
            StatusesFragment statusesFragment = this.A00;
            C65663Sz r5 = statusesFragment.A0x.A00;
            C65663Sz r7 = r5;
            if (r5 == null) {
                r7 = new C65663Sz(statusesFragment.A0V, C223613z.A00, 0, 0, -1, -1, -1, -1, -1, 0);
            }
            A0I.add(new C77923rH(r7));
            if (r5 != null && statusesFragment.A0w.A02()) {
                A0I.add(new C77933rI(statusesFragment));
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            arrayList = C202859mm.A03(this.A00.A0Z, charSequence.toString());
        }
        StatusesFragment statusesFragment2 = this.A00;
        ArrayList A002 = A00(arrayList, statusesFragment2.A0x.A02);
        ArrayList A003 = A00(arrayList, statusesFragment2.A0x.A03);
        ArrayList A004 = A00(arrayList, statusesFragment2.A0x.A01);
        if (!A002.isEmpty()) {
            A0I.add(new C77913rG(statusesFragment2, 0));
            A0I.addAll(A002);
        }
        if (!A003.isEmpty()) {
            A0I.add(new C77913rG(statusesFragment2, 1));
            A0I.addAll(A003);
        }
        filterResults.values = new C597535d(A0I, A004);
        filterResults.count = A0I.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        String charSequence2;
        Object obj = filterResults.values;
        if (obj != null) {
            C597535d r1 = (C597535d) obj;
            StatusesFragment statusesFragment = this.A00;
            statusesFragment.A1G = r1.A00;
            List list = r1.A01;
            statusesFragment.A1H = list;
            if (!list.isEmpty()) {
                statusesFragment.A1G.add(new C77913rG(statusesFragment, 2));
                if (!statusesFragment.A1M || statusesFragment.A1K || !statusesFragment.A1J) {
                    statusesFragment.A1G.addAll(statusesFragment.A1H);
                }
            }
        }
        StatusesFragment statusesFragment2 = this.A00;
        statusesFragment2.A1E = charSequence;
        if (charSequence == null) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence.toString();
        }
        statusesFragment2.A1F = C202859mm.A03(statusesFragment2.A0Z, charSequence2);
        StatusesFragment.A09(statusesFragment2);
        AnimatorSet animatorSet = statusesFragment2.A00;
        if (animatorSet != null) {
            animatorSet.cancel();
            statusesFragment2.A00 = null;
        }
        statusesFragment2.A0o.notifyDataSetChanged();
    }

    public ArrayList A00(ArrayList arrayList, List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C65663Sz A0h = C36441kJ.A0h(it);
            StatusesFragment statusesFragment = this.A00;
            if (statusesFragment.A0N.A0h(statusesFragment.A0L.A0D(A0h.A09), arrayList, true)) {
                A0I.add(new C77923rH(A0h));
            }
        }
        return A0I;
    }
}
