package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.R;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.1nb  reason: invalid class name and case insensitive filesystem */
public class C38031nb extends BaseAdapter implements Filterable {
    public String A00;
    public List A01 = AnonymousClass001.A0I();
    public List A02 = AnonymousClass001.A0I();
    public ArrayList A03;
    public final C589531r A04;
    public final Map A05 = AnonymousClass001.A0J();
    public final Filter A06 = new C38061ne(this);
    public final /* synthetic */ GroupChatInfoActivity A07;

    public boolean areAllItemsEnabled() {
        return false;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 3;
    }

    public boolean hasStableIds() {
        return true;
    }

    public C38031nb(C589531r r2, GroupChatInfoActivity groupChatInfoActivity) {
        this.A07 = groupChatInfoActivity;
        this.A04 = r2;
    }

    public static void A00(C38031nb r3, List list) {
        GroupChatInfoActivity groupChatInfoActivity = r3.A07;
        if (groupChatInfoActivity.A1J.A0M(groupChatInfoActivity.A0y) == 1) {
            r3.A02 = Collections.emptyList();
        } else {
            r3.A02 = list;
            r3.A03 = C202859mm.A03(groupChatInfoActivity.A0q, r3.A00);
        }
        r3.notifyDataSetChanged();
    }

    public int getCount() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A02.get(i);
    }

    public int getItemViewType(int i) {
        Object obj = this.A02.get(i);
        if (obj instanceof C75083me) {
            return 0;
        }
        if ((obj instanceof C75073md) || (obj instanceof C75063mc)) {
            return 1;
        }
        if (obj instanceof C75093mf) {
            return 2;
        }
        return -1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C61953Ed r2;
        UserJid A0i;
        Object r1;
        C87834Qi r3 = (C87834Qi) this.A02.get(i);
        if (view == null) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                GroupChatInfoActivity groupChatInfoActivity = this.A07;
                view = groupChatInfoActivity.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup, false);
                r1 = new AnonymousClass2VG(view, this.A04, groupChatInfoActivity);
            } else if (itemViewType == 1) {
                GroupChatInfoActivity groupChatInfoActivity2 = this.A07;
                view = groupChatInfoActivity2.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup, false);
                r1 = new AnonymousClass2VE(view, groupChatInfoActivity2);
            } else if (itemViewType == 2) {
                GroupChatInfoActivity groupChatInfoActivity3 = this.A07;
                view = groupChatInfoActivity3.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup, false);
                r1 = new AnonymousClass2VF(view, groupChatInfoActivity3);
            } else {
                throw AnonymousClass001.A09(AnonymousClass000.A0r("Unknown type: ", AnonymousClass000.A0u(), itemViewType));
            }
            view.setTag(r1);
        }
        if (!(r3 instanceof C75083me) || (A0i = C36391kE.A0i(((C75083me) r3).A00)) == null) {
            r2 = null;
        } else {
            r2 = (C61953Ed) this.A05.get(A0i);
        }
        ((C61483Cb) view.getTag()).A00(r3, r2, this.A03);
        return view;
    }

    public boolean isEnabled(int i) {
        return ((C87834Qi) this.A02.get(i)).isEnabled();
    }

    public Filter getFilter() {
        return this.A06;
    }
}
