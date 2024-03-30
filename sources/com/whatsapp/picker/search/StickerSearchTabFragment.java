package com.whatsapp.picker.search;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass11F;
import X.AnonymousClass1HA;
import X.AnonymousClass2M8;
import X.AnonymousClass3HE;
import X.AnonymousClass4ME;
import X.AnonymousClass9OB;
import X.C012005e;
import X.C135066c4;
import X.C18740tg;
import X.C20810yC;
import X.C36321k7;
import X.C36341k9;
import X.C36361kB;
import X.C65993Ug;
import X.C78053rU;
import X.C88234Rx;
import X.C96064mj;
import X.C96424nJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

public final class StickerSearchTabFragment extends Hilt_StickerSearchTabFragment implements C88234Rx {
    public ViewTreeObserver.OnGlobalLayoutListener A00;
    public RecyclerView A01;
    public C20810yC A02;
    public C96064mj A03;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass3HE r0;
        AnonymousClass1HA r9;
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        this.A01 = (RecyclerView) C012005e.A02(inflate, R.id.tab_result);
        AnonymousClass00C.A0B(inflate);
        C78053rU r6 = A00(this).A00;
        C18740tg.A06(r6);
        List A0I = AnonymousClass001.A0I();
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            int i = bundle2.getInt("sticker_category_tab");
            C65993Ug.A00(A0m(), A00(this).A1k().A01, new AnonymousClass4ME(this, i), 32);
            A0I = A00(this).A1l(i);
        }
        AnonymousClass2M8 r02 = r6.A00;
        if (!(r02 == null || (r0 = r02.A0D) == null || (r9 = r0.A0A) == null)) {
            C96064mj r7 = new C96064mj(A0a(), r9, this, C36361kB.A0i(), A0I);
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                recyclerView.setAdapter(r7);
                AnonymousClass9OB r4 = new AnonymousClass9OB(A0a(), viewGroup, recyclerView, r7);
                this.A00 = r4.A05;
                inflate.getViewTreeObserver().addOnGlobalLayoutListener(this.A00);
                C20810yC r3 = this.A02;
                if (r3 != null) {
                    recyclerView.A0v(new C96424nJ(C36341k9.A0G(this), r4.A06, r3));
                } else {
                    throw C36321k7.A07();
                }
            }
            this.A03 = r7;
        }
        return inflate;
    }

    public void A1K() {
        C96064mj r0 = this.A03;
        if (r0 != null) {
            r0.A04 = false;
            r0.A06();
        }
        super.A1K();
    }

    public static final StickerSearchDialogFragment A00(StickerSearchTabFragment stickerSearchTabFragment) {
        AnonymousClass02E r1 = stickerSearchTabFragment.A0I;
        if (r1 instanceof StickerSearchDialogFragment) {
            AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.whatsapp.picker.search.StickerSearchDialogFragment");
            return (StickerSearchDialogFragment) r1;
        }
        throw new RuntimeException("Parent fragment of StickerSearchTabFragment is not of type StickerSearchDialogFragment");
    }

    public void A1J() {
        List list;
        ViewTreeObserver viewTreeObserver;
        RecyclerView recyclerView = this.A01;
        if (!(recyclerView == null || (viewTreeObserver = recyclerView.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A00);
        }
        RecyclerView recyclerView2 = this.A01;
        if (!(recyclerView2 == null || (list = recyclerView2.A0Q) == null)) {
            list.clear();
        }
        super.A1J();
        this.A01 = null;
    }

    public void A1L() {
        super.A1L();
        C96064mj r0 = this.A03;
        if (r0 != null) {
            r0.A04 = true;
            r0.A06();
        }
    }

    public void Bhl(AnonymousClass11F r2, C135066c4 r3, Integer num, int i) {
        A00(this).Bhl(r2, r3, num, i);
    }
}
