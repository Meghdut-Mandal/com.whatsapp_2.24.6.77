package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1wP  reason: invalid class name and case insensitive filesystem */
public final class C40971wP extends AnonymousClass0CZ {
    public AnonymousClass3HX A00;
    public AnonymousClass2L3 A01;
    public AnonymousClass2Yn A02;
    public List A03 = C023409w.A00;
    public final C57752yl A04;
    public final AnonymousClass1RY A05;
    public final C19630wG A06;
    public final C18820ts A07;
    public final AnonymousClass1GQ A08;
    public final C17770s0 A09;
    public final AnonymousClass00T A0A;
    public final C61553Cl A0B;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.2Ym} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.2Ym} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.2Ym} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.2Ym} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X.2Ym} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ X.AnonymousClass0D3 BUw(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            r3 = 0
            X.AnonymousClass00C.A0D(r6, r3)
            if (r7 == 0) goto L_0x004b
            r0 = 1
            if (r7 != r0) goto L_0x0062
            X.2yl r3 = r5.A04
            android.view.LayoutInflater r1 = X.C36351kA.A0C(r6)
            r0 = 2131624825(0x7f0e0379, float:1.887684E38)
            android.view.View r4 = X.C36361kB.A0E(r1, r6, r0)
            X.AnonymousClass00C.A08(r4)
            X.0s0 r2 = r5.A09
            X.1RY r1 = r5.A05
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1Mz r0 = r3.A00
            X.0tq r0 = r0.A01
            X.0tt r0 = r0.A00
            X.004 r0 = r0.A1i
            java.lang.Object r0 = r0.get()
            X.3CE r0 = (X.AnonymousClass3CE) r0
            X.2Yn r3 = new X.2Yn
            r3.<init>(r4, r0, r1, r2)
            r5.A02 = r3
            X.3HX r0 = r5.A00
            if (r0 == 0) goto L_0x0043
            X.2Ye r0 = r0.A00
            if (r0 == 0) goto L_0x0043
            java.util.List r1 = r0.A00
            X.3oA r0 = r3.A01
            r0.A01(r1)
        L_0x0043:
            X.0D3 r3 = (X.AnonymousClass0D3) r3
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.newsletter.ui.directory.adapter.viewholders.DirectoryCategoriesViewHolder<com.whatsapp.newsletter.ui.directory.adapter.DirectoryCategoriesDataItem>"
            X.AnonymousClass00C.A0E(r3, r0)
            return r3
        L_0x004b:
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.0ts r2 = r5.A07
            android.view.LayoutInflater r1 = X.C36351kA.A0C(r6)
            r0 = 2131624826(0x7f0e037a, float:1.8876843E38)
            android.view.View r1 = X.C36371kC.A0J(r1, r6, r0, r3)
            X.0s0 r0 = r5.A09
            X.2Ym r3 = new X.2Ym
            r3.<init>(r1, r2, r0)
            goto L_0x0043
        L_0x0062:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "View type not supported "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40971wP.BUw(android.view.ViewGroup, int):X.0D3");
    }

    public int A0J() {
        return this.A03.size();
    }

    public final void A0L(AnonymousClass3HX r6) {
        AnonymousClass3HX r4;
        AnonymousClass2Yn r0;
        if (r6 != null) {
            C46522Ye r2 = r6.A00;
            if (!(r2 == null || (r0 = this.A02) == null)) {
                r0.A01.A01(r2.A00);
            }
            r4 = new AnonymousClass3HX(r2);
            ArrayList A0I = AnonymousClass001.A0I();
            A0I.add(new C46532Yf(C36371kC.A0v(this.A06, R.string.f12nameremoved)));
            C46522Ye r22 = r4.A00;
            if (r22 != null) {
                AnonymousClass1GQ r1 = this.A08;
                if (r1.A06() && AnonymousClass1GQ.A01(r1, 4356)) {
                    this.A00 = r4;
                    A0I.add(r22);
                }
            }
            C36351kA.A1H(this.A01);
            AnonymousClass2L3 r23 = new AnonymousClass2L3(this.A03, A0I);
            AnonymousClass4YW.A00(r23, (C33301f4) this.A0A.getValue(), this, A0I, 1);
            this.A01 = r23;
        } else {
            r4 = null;
        }
        this.A00 = r4;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r5, int i) {
        C42541yz r52 = (C42541yz) r5;
        AnonymousClass00C.A0D(r52, 0);
        C54872th r3 = (C54872th) this.A03.get(i);
        List list = AnonymousClass0D3.A0I;
        if (r52 instanceof AnonymousClass2Ym) {
            C46532Yf r32 = (C46532Yf) r3;
            AnonymousClass00C.A0D(r32, 0);
            View view = r52.A0H;
            C36351kA.A0E(view).setText(r32.A00);
            AnonymousClass3Y4.A00(view.findViewById(R.id.see_all_container), r52, 28);
            return;
        }
        C46522Ye r33 = (C46522Ye) r3;
        AnonymousClass00C.A0D(r33, 0);
        RecyclerView recyclerView = ((AnonymousClass2Yn) r52).A00;
        AnonymousClass00C.A07(recyclerView);
        recyclerView.setVisibility(C36351kA.A00(C36401kF.A1a(r33.A00) ? 1 : 0));
    }

    public int getItemViewType(int i) {
        Object obj = this.A03.get(i);
        if (obj instanceof C46532Yf) {
            return 0;
        }
        if (obj instanceof C46522Ye) {
            return 1;
        }
        throw C36441kJ.A18();
    }

    public C40971wP(C57752yl r3, C27731Pn r4, C19630wG r5, C18820ts r6, AnonymousClass1GQ r7, C61553Cl r8, C17770s0 r9, C19770wU r10) {
        C36321k7.A1B(r10, r4, r5, r6, r7);
        C36321k7.A10(r3, r8);
        this.A06 = r5;
        this.A07 = r6;
        this.A08 = r7;
        this.A04 = r3;
        this.A0B = r8;
        this.A09 = r9;
        this.A0A = C36431kI.A1I(new C84234Cl(r10));
        this.A05 = r4.A05(r5.A00, "newsletter-directory-categories-adapter");
    }
}
