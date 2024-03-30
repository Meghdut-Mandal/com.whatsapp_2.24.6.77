package com.whatsapp.stickers.store;

import X.AnonymousClass001;
import X.AnonymousClass0I4;
import X.AnonymousClass1AP;
import X.AnonymousClass5L8;
import X.AnonymousClass68B;
import X.AnonymousClass6WF;
import X.C107175Mv;
import X.C129016Ep;
import X.C160517l8;
import X.C35771jE;
import X.C36331k8;
import X.C90514aH;
import X.C96124mp;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StickerStoreMyTabFragment extends Hilt_StickerStoreMyTabFragment implements C160517l8 {
    public View A00;
    public AnonymousClass0I4 A01;
    public C129016Ep A02;
    public AnonymousClass6WF A03;
    public boolean A04;
    public C107175Mv A05;

    public void Bc7() {
        this.A05 = null;
    }

    public static void A00(StickerStoreMyTabFragment stickerStoreMyTabFragment) {
        C36331k8.A1E(stickerStoreMyTabFragment.A05);
        C107175Mv r1 = new C107175Mv(stickerStoreMyTabFragment.A0E, stickerStoreMyTabFragment);
        stickerStoreMyTabFragment.A05 = r1;
        C36331k8.A1F(r1, stickerStoreMyTabFragment.A0H);
    }

    public void Bc5(AnonymousClass68B r5) {
        C96124mp r3 = this.A0G;
        if ((r3 instanceof AnonymousClass5L8) && r3.A00 != null) {
            String str = r5.A0F;
            for (int i = 0; i < r3.A00.size(); i++) {
                if (str.equals(((AnonymousClass68B) r3.A00.get(i)).A0F)) {
                    r3.A00.set(i, r5);
                    r3.A07(i);
                    return;
                }
            }
        }
    }

    public void Bc8(String str) {
        if (this.A0I != null) {
            for (int i = 0; i < this.A0I.size(); i++) {
                if (AnonymousClass68B.A00(str, this.A0I, i)) {
                    this.A0I.remove(i);
                    C96124mp r1 = this.A0G;
                    if (r1 instanceof AnonymousClass5L8) {
                        r1.A00 = this.A0I;
                        r1.A06();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void A1B() {
        super.A1B();
        List list = this.A0I;
        if (list != null && this.A04) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C90514aH.A0f(this, i).A00 = size - i;
            }
            AnonymousClass1AP r4 = this.A0E;
            r4.A0N.Boy(new C35771jE(r4, this.A0I, 9));
        }
    }

    public void Bc6(List list) {
        if (!A1c()) {
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass68B A0g = C90514aH.A0g(it);
                if (!A0g.A0R) {
                    A0I.add(A0g);
                }
            }
            list = A0I;
        }
        this.A0I = list;
        C96124mp r0 = this.A0G;
        if (r0 == null) {
            AnonymousClass5L8 r3 = new AnonymousClass5L8(this, list);
            this.A0G = r3;
            RecyclerView recyclerView = this.A03;
            if (recyclerView != null) {
                recyclerView.suppressLayout(false);
                RecyclerView.A0E(r3, recyclerView, true, true);
                recyclerView.A0z(true);
                recyclerView.requestLayout();
            }
            A1a();
            return;
        }
        r0.A00 = list;
        r0.A06();
    }
}
