package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7zp  reason: invalid class name and case insensitive filesystem */
public final class C168177zp extends AnonymousClass0CZ implements C159967kF {
    public C138566iK A00;
    public C207109uZ A01;
    public boolean A02;
    public final C20810yC A03;
    public final List A04 = AnonymousClass001.A0I();
    public final List A05 = AnonymousClass001.A0I();
    public final C19730wQ A06;
    public final C196089Xp A07;
    public final AnonymousClass1KP A08;
    public final C88374Sl A09;
    public final C18820ts A0A;
    public final UserJid A0B;

    public void A0H(RecyclerView recyclerView) {
        AnonymousClass00C.A0D(recyclerView, 0);
        this.A00 = new C138566iK(recyclerView, this);
    }

    public void A0K(AnonymousClass0D3 r2) {
        AnonymousClass00C.A0D(r2, 0);
        if (r2 instanceof C102354zn) {
            ((AnonymousClass80I) r2).A0B();
        }
    }

    public void BSE(AnonymousClass0D3 r7, int i) {
        long j;
        AnonymousClass00C.A0D(r7, 0);
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            C207269up BGG = BGG(i);
            C102344zm r72 = (C102344zm) r7;
            boolean A0E = this.A03.A0E(4983);
            List list = this.A04;
            if (!A0E) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        j = 0;
                        break;
                    }
                    AnonymousClass6B4 A0M = C165617ti.A0M(it);
                    C207269up r0 = A0M.A02;
                    j = A0M.A00;
                    if (AnonymousClass00C.A0J(r0.A0F, BGG.A0F)) {
                        break;
                    }
                }
            } else {
                j = C129356Gp.A00(BGG, list);
            }
            r72.A0D(new AnonymousClass8WQ(BGG, j));
        } else if (itemViewType == 1) {
            Object obj = this.A05.get(i);
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.biz.catalog.model.product.ProductListHeaderItemModel");
            String str = ((A95) obj).A00;
            WaTextView waTextView = ((AnonymousClass8WT) r7).A00;
            waTextView.setText(str);
            waTextView.setContentDescription(C36351kA.A0w(waTextView.getContext(), str, 1, R.string.f12nameremoved));
        } else if (itemViewType == 2) {
            new AnonymousClass8WM();
            ((C102354zn) r7).A0D();
        } else if (itemViewType == 3) {
            List list2 = AnonymousClass0D3.A0I;
        } else {
            throw C90464aC.A0R("Unsupported view type - ", AnonymousClass000.A0u(), itemViewType);
        }
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 0) {
            List list = AnonymousClass0D3.A0I;
            UserJid userJid = this.A0B;
            C19730wQ r3 = this.A06;
            C18820ts r11 = this.A0A;
            C196089Xp r5 = this.A07;
            C88374Sl r10 = this.A09;
            return C109925Zq.A00(C36371kC.A0B(viewGroup), viewGroup2, r3, new AnonymousClass9ED(897460699), r5, this, (AnonymousClass4PF) null, this.A08, (AnonymousClass4PG) null, r10, r11, userJid);
        } else if (i == 1) {
            List list2 = AnonymousClass0D3.A0I;
            return new AnonymousClass8WT(C90514aH.A0Q(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved));
        } else if (i == 2) {
            return new C102354zn(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
        } else {
            if (i == 3) {
                List list3 = AnonymousClass0D3.A0I;
                return new AnonymousClass8WS(C90514aH.A0Q(LayoutInflater.from(C36371kC.A0B(viewGroup)), viewGroup, R.layout.f9nameremoved));
            }
            throw C90464aC.A0R("Unsupported view type - ", AnonymousClass000.A0u(), i);
        }
    }

    public int A0J() {
        return this.A05.size();
    }

    public final boolean A0L() {
        List list = this.A05;
        if (list.size() <= 0 || !(list.get(0) instanceof A93)) {
            return false;
        }
        return true;
    }

    public C207269up BGG(int i) {
        Object obj = this.A05.get(i);
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.biz.catalog.model.product.ProductListProductItemModel");
        return ((A96) obj).A00;
    }

    public int getItemViewType(int i) {
        return ((C22913AyP) this.A05.get(i)).getType();
    }

    public C168177zp(C19730wQ r2, C196089Xp r3, AnonymousClass1KP r4, C88374Sl r5, C18820ts r6, C20810yC r7, UserJid userJid) {
        C36321k7.A19(userJid, r3, r7, r2);
        AnonymousClass00C.A0D(r6, 6);
        this.A09 = r5;
        this.A0B = userJid;
        this.A07 = r3;
        this.A03 = r7;
        this.A06 = r2;
        this.A0A = r6;
        this.A08 = r4;
    }

    public C207109uZ B94() {
        return this.A01;
    }

    public boolean B9S() {
        return this.A02;
    }
}
