package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.businessproductlist.view.adapter.BusinessProductListAdapter;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8WR  reason: invalid class name */
public abstract class AnonymousClass8WR extends C167967zU implements C159967kF, C34411h0 {
    public C207109uZ A00;
    public Boolean A01;
    public final C24801Dv A02;
    public final C19730wQ A03;
    public final C202279lS A04;
    public final C196089Xp A05;
    public final UserJid A06;
    public final List A07 = AnonymousClass001.A0I();
    public final C20810yC A08;

    public boolean BtE() {
        return true;
    }

    public long A0L(C207269up r7) {
        if (r7 == null) {
            return 0;
        }
        boolean A0E = this.A08.A0E(4983);
        List list = this.A07;
        if (A0E) {
            return C129356Gp.A00(r7, list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass6B4 A0M = C165617ti.A0M(it);
            if (A0M.A02.A0F.equals(r7.A0F)) {
                return A0M.A00;
            }
        }
        return 0;
    }

    public AnonymousClass80I A0M(ViewGroup viewGroup, int i) {
        if (i == 9) {
            return new C102354zn(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
        }
        throw AnonymousClass001.A09("product-list-base-adapter/onCreateViewHolder/unknown view type");
    }

    public void A0N() {
        boolean z = this instanceof BusinessProductListAdapter;
        boolean A0P = A0P();
        if (z) {
            if (A0P) {
                List list = this.A00;
                AnonymousClass00C.A07(list);
                ArrayList A0I = AnonymousClass001.A0I();
                for (Object next : list) {
                    if (next instanceof AnonymousClass8WM) {
                        A0I.add(next);
                    }
                }
                for (Object next2 : A0I) {
                    int indexOf = list.indexOf(next2);
                    list.remove(next2);
                    A09(indexOf);
                }
            }
        } else if (A0P) {
            List list2 = this.A00;
            int size = list2.size() - 2;
            int i = (size - 3) + 1;
            if (i < 0) {
                Log.w("CollectionProductListBaseAdapter/hideLoadingView/hideLoadingView invalied end pos");
                i = 0;
            }
            while (size >= i) {
                Object obj = list2.get(size);
                if (obj instanceof AnonymousClass8WM) {
                    list2.remove(obj);
                    A09(size);
                }
                size--;
            }
        }
    }

    public void A0O() {
        if (!(this instanceof BusinessProductListAdapter)) {
            List list = this.A00;
            if (list.size() != 0 && !A0P()) {
                int i = 0;
                do {
                    int A072 = C36431kI.A07(list);
                    list.add(A072, new AnonymousClass8WM());
                    A08(A072);
                    i++;
                } while (i < 3);
            }
        } else if (!A0P()) {
            int i2 = 0;
            do {
                List list2 = this.A00;
                int max = Math.max(0, C36431kI.A07(list2));
                list2.add(max, new AnonymousClass8WM());
                A08(max);
                i2++;
            } while (i2 < 3);
        }
    }

    public boolean A0P() {
        if (this instanceof BusinessProductListAdapter) {
            List list = this.A00;
            AnonymousClass00C.A07(list);
            ArrayList A0I = AnonymousClass001.A0I();
            for (Object next : list) {
                if (next instanceof AnonymousClass8WM) {
                    A0I.add(next);
                }
            }
            return C36401kF.A1a(A0I);
        }
        List list2 = this.A00;
        if (list2.size() < 2) {
            return false;
        }
        return list2.get(C36421kH.A06(list2, 2)) instanceof AnonymousClass8WM;
    }

    public boolean B9S() {
        Boolean bool = this.A01;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public int BCN(int i) {
        while (i >= 0) {
            if (BLw(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public C207269up BGG(int i) {
        return ((AnonymousClass8WQ) this.A00.get(i)).A01;
    }

    public boolean BLw(int i) {
        List list = this.A00;
        if (i >= list.size() || i < 0 || ((AnonymousClass9EL) list.get(i)).A00 != 14) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r3, int i) {
        AnonymousClass80I r32 = (AnonymousClass80I) r3;
        if (getItemViewType(i) == 2) {
            ((C102334zl) r32).A00 = ((AnonymousClass8WN) this.A00.get(i)).A00;
        }
        r32.A0C((AnonymousClass9EL) this.A00.get(i));
    }

    public AnonymousClass8WR(C24801Dv r2, C19730wQ r3, C202279lS r4, C196089Xp r5, C20810yC r6, UserJid userJid) {
        this.A08 = r6;
        this.A06 = userJid;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = r5;
    }

    public C207109uZ B94() {
        return this.A00;
    }
}
