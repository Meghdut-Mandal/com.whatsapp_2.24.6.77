package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.StatusesFragment;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.1nZ  reason: invalid class name and case insensitive filesystem */
public class C38011nZ extends BaseAdapter implements Filterable {
    public long A00 = 5;
    public Filter A01;
    public final Map A02 = AnonymousClass001.A0J();
    public final /* synthetic */ StatusesFragment A03;

    public int getViewTypeCount() {
        return 4;
    }

    public boolean hasStableIds() {
        return true;
    }

    public C38011nZ(StatusesFragment statusesFragment) {
        this.A03 = statusesFragment;
    }

    public static void A00(StatusesFragment statusesFragment) {
        statusesFragment.A0o.getFilter().filter(statusesFragment.A1E);
    }

    public int getCount() {
        return this.A03.A1G.size();
    }

    public Filter getFilter() {
        Filter filter = this.A01;
        if (filter != null) {
            return filter;
        }
        C38101ni r1 = new C38101ni(this.A03);
        this.A01 = r1;
        return r1;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A03.A1G.get(i);
    }

    public long getItemId(int i) {
        C88134Rn r1 = (C88134Rn) this.A03.A1G.get(i);
        if (r1 instanceof C77923rH) {
            UserJid userJid = ((C77923rH) r1).A01.A09;
            Map map = this.A02;
            Number number = (Number) map.get(userJid);
            if (number == null) {
                long j = this.A00;
                this.A00 = 1 + j;
                number = Long.valueOf(j);
                map.put(userJid, number);
            }
            return number.longValue();
        } else if (r1 instanceof C77913rG) {
            return ((C77913rG) r1).A00;
        } else {
            if (r1 instanceof C77933rI) {
                Objects.requireNonNull(r1);
                return 3;
            }
            throw new UnsupportedOperationException("Each list item must have an id");
        }
    }

    public int getItemViewType(int i) {
        Object obj = this.A03.A1G.get(i);
        if (obj instanceof C77923rH) {
            return 0;
        }
        if (obj instanceof C77913rG) {
            return 1;
        }
        if (obj instanceof C77933rI) {
            return 2;
        }
        throw new UnsupportedOperationException("Each list item type must have a itemType");
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        StatusesFragment statusesFragment = this.A03;
        return ((C88134Rn) statusesFragment.A1G.get(i)).BJ6(statusesFragment.A1D(), view, viewGroup, statusesFragment.A0O, statusesFragment.A1R, statusesFragment.A1S, statusesFragment.A1Q, statusesFragment.A1F, statusesFragment.A1L);
    }
}
