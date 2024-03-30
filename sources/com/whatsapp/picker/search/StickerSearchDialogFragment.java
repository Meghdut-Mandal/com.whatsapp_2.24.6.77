package com.whatsapp.picker.search;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass01z;
import X.AnonymousClass04H;
import X.AnonymousClass07S;
import X.AnonymousClass0CZ;
import X.AnonymousClass11F;
import X.AnonymousClass1HA;
import X.AnonymousClass1XQ;
import X.AnonymousClass2M8;
import X.AnonymousClass3HE;
import X.AnonymousClass3S2;
import X.AnonymousClass3Y5;
import X.AnonymousClass3ZJ;
import X.AnonymousClass4WK;
import X.AnonymousClass6DR;
import X.AnonymousClass9OB;
import X.C135066c4;
import X.C138726ib;
import X.C21010yW;
import X.C224514j;
import X.C24021At;
import X.C24031Au;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36441kJ;
import X.C39361s9;
import X.C40121uy;
import X.C44522Nv;
import X.C48762i0;
import X.C63943Ma;
import X.C65173Ra;
import X.C65993Ug;
import X.C68043bF;
import X.C78053rU;
import X.C86434Kx;
import X.C86444Ky;
import X.C88234Rx;
import X.C89144Vk;
import X.C93024fQ;
import X.C96064mj;
import X.C96424nJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class StickerSearchDialogFragment extends Hilt_StickerSearchDialogFragment implements C88234Rx {
    public View A00;
    public ViewTreeObserver.OnGlobalLayoutListener A01;
    public RecyclerView A02;
    public ViewPager A03;
    public TabLayout A04;
    public WaEditText A05;
    public EmojiSearchProvider A06;
    public C21010yW A07;
    public AnonymousClass3ZJ A08;
    public C40121uy A09;
    public C96064mj A0A;
    public C24031Au A0B;
    public Runnable A0C;
    public String A0D = "";
    public final C65173Ra A0E = new C65173Ra();

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        AnonymousClass2M8 r0;
        AnonymousClass3HE r02;
        AnonymousClass1HA r8;
        List list;
        ViewTreeObserver viewTreeObserver;
        AnonymousClass00C.A0D(layoutInflater, 0);
        super.A1G(bundle, layoutInflater, viewGroup);
        if (bundle == null || (str = bundle.getString("search_term")) == null) {
            str = "";
        }
        this.A0D = str;
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        this.A00 = inflate.findViewById(R.id.no_results);
        View findViewById = inflate.findViewById(R.id.get_more_stickers_button);
        C78053rU r3 = this.A00;
        if (r3 != null) {
            AnonymousClass3Y5.A00(findViewById, r3, 6);
        }
        this.A05 = (WaEditText) inflate.findViewById(R.id.search_bar);
        this.A02 = C36441kJ.A0c(inflate, R.id.search_result);
        this.A04 = (TabLayout) inflate.findViewById(R.id.sticker_category_tabs);
        AnonymousClass9OB r7 = new AnonymousClass9OB(A0a(), viewGroup, this.A02, this.A0A);
        this.A01 = r7.A05;
        RecyclerView recyclerView = this.A02;
        if (!(recyclerView == null || (viewTreeObserver = recyclerView.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A01);
        }
        RecyclerView recyclerView2 = this.A02;
        if (recyclerView2 != null) {
            recyclerView2.A0v(new C89144Vk(this, 7));
        }
        C96424nJ r5 = new C96424nJ(C36341k9.A0G(this), r7.A06, this.A02);
        RecyclerView recyclerView3 = this.A02;
        if (recyclerView3 != null) {
            recyclerView3.A0v(r5);
        }
        RecyclerView recyclerView4 = this.A02;
        if (recyclerView4 != null) {
            this.A08 = new AnonymousClass3ZJ(recyclerView4, r5);
            ViewTreeObserver viewTreeObserver2 = recyclerView4.getViewTreeObserver();
            if (viewTreeObserver2 != null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.A08);
            }
        }
        EmojiSearchProvider emojiSearchProvider = this.A06;
        if (emojiSearchProvider != null) {
            this.A09 = (C40121uy) new AnonymousClass04H(new C68043bF(emojiSearchProvider), this).A00(C40121uy.class);
            C65993Ug.A00(A0m(), A1k().A01, new C86434Kx(this), 31);
            C65993Ug.A00(A0m(), A1k().A02, new C86444Ky(this), 30);
            if (this.A0A == null) {
                C78053rU r03 = this.A00;
                if (!(r03 == null || (list = r03.A05) == null)) {
                    A1k().A01.A0D(list);
                }
                C78053rU r04 = this.A00;
                if (!(r04 == null || (r0 = r04.A00) == null || (r02 = r0.A0D) == null || (r8 = r02.A0A) == null)) {
                    C96064mj r6 = new C96064mj(A0a(), r8, this, C36361kB.A0i(), C36401kF.A0w(A1k().A02));
                    this.A0A = r6;
                    RecyclerView recyclerView5 = this.A02;
                    if (recyclerView5 != null) {
                        recyclerView5.setAdapter(r6);
                    }
                }
            }
            View findViewById2 = inflate.findViewById(R.id.clear_search_btn);
            C48762i0.A00(findViewById2, this, 10);
            WaEditText waEditText = this.A05;
            if (waEditText != null) {
                waEditText.addTextChangedListener(new AnonymousClass4WK(findViewById2, this, 4));
            }
            ImageView A0N = C36391kE.A0N(inflate, R.id.back);
            C48762i0.A00(A0N, this, 9);
            C36321k7.A0L(A0a(), A0N, this.A01, R.drawable.ic_back);
            TabLayout tabLayout = this.A04;
            if (tabLayout != null) {
                tabLayout.setTabTextColors(TabLayout.A02(AnonymousClass00F.A00(A0a(), R.color.f6nameremoved), C36351kA.A02(A0a(), A0a(), R.attr.f4nameremoved, R.color.f6nameremoved)));
            }
            TabLayout tabLayout2 = this.A04;
            if (tabLayout2 != null) {
                C36341k9.A0q(A0a(), tabLayout2, C224514j.A00(A0a(), R.attr.f4nameremoved, R.color.f6nameremoved));
            }
            C36341k9.A0q(A0a(), inflate.findViewById(R.id.search_bar_container), C224514j.A00(A0a(), R.attr.f4nameremoved, R.color.f6nameremoved));
            A03(R.string.f12nameremoved, 0);
            A03(R.string.f12nameremoved, 1);
            A03(R.string.f12nameremoved, 2);
            A03(R.string.f12nameremoved, 3);
            A03(R.string.f12nameremoved, 4);
            A03(R.string.f12nameremoved, 5);
            A03(R.string.f12nameremoved, 6);
            TabLayout tabLayout3 = this.A04;
            if (tabLayout3 != null) {
                tabLayout3.setTabMode(0);
            }
            this.A03 = (ViewPager) inflate.findViewById(R.id.sticker_category_viewpager);
            AnonymousClass01z A0k = A0k();
            AnonymousClass00C.A08(A0k);
            C39361s9 r32 = new C39361s9(A0k);
            ViewPager viewPager = this.A03;
            if (viewPager != null) {
                viewPager.setAdapter(r32);
            }
            ViewPager viewPager2 = this.A03;
            if (viewPager2 != null) {
                viewPager2.setOffscreenPageLimit(7);
            }
            ViewPager viewPager3 = this.A03;
            if (viewPager3 != null) {
                viewPager3.A0K(new C138726ib(this.A04));
            }
            TabLayout tabLayout4 = this.A04;
            if (tabLayout4 != null) {
                tabLayout4.A0G(new C63943Ma(this, 1));
            }
            WaEditText waEditText2 = this.A05;
            if (waEditText2 != null) {
                waEditText2.setText("");
            }
            WaEditText waEditText3 = this.A05;
            if (waEditText3 != null) {
                waEditText3.requestFocus();
            }
            WaEditText waEditText4 = this.A05;
            if (waEditText4 != null) {
                waEditText4.A0C(false);
            }
            C44522Nv r2 = new C44522Nv();
            r2.A00 = C36361kB.A0i();
            C21010yW r05 = this.A07;
            if (r05 != null) {
                r05.Bly(r2);
                C24031Au r06 = this.A0B;
                if (r06 != null) {
                    C24021At r62 = r06.A01;
                    synchronized (r62.A03) {
                        C36341k9.A0v(C24021At.A00(r62).edit(), "sticker_search_opened_count", C24021At.A00(r62).getInt("sticker_search_opened_count", 0) + 1);
                    }
                    return inflate;
                }
                throw C36331k8.A0d("stickerAggregatedLogger");
            }
            throw C36331k8.A0d("wamRuntime");
        }
        throw C36331k8.A0d("emojiSearchProvider");
    }

    public void A1R(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.A1R(bundle);
        String str = this.A0D;
        if (str != null && str.length() != 0) {
            bundle.putString("search_term", str);
        }
    }

    private final void A03(int i, int i2) {
        TabLayout tabLayout = this.A04;
        if (tabLayout != null) {
            AnonymousClass6DR A082 = tabLayout.A08();
            A082.A01(i);
            A082.A06 = Integer.valueOf(i2);
            A082.A04 = C36401kF.A0q(this, A0n(i), AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
            C93024fQ r0 = A082.A02;
            if (r0 != null) {
                r0.A06();
            }
            TabLayout tabLayout2 = this.A04;
            if (tabLayout2 != null) {
                tabLayout2.A0H(A082);
            }
        }
    }

    public static final void A06(StickerSearchDialogFragment stickerSearchDialogFragment, boolean z) {
        AnonymousClass07S r1;
        StickerSearchTabFragment stickerSearchTabFragment;
        C96064mj r2;
        ViewPager viewPager = stickerSearchDialogFragment.A03;
        if (viewPager != null) {
            r1 = viewPager.getAdapter();
        } else {
            r1 = null;
        }
        if ((r1 instanceof C39361s9) && (stickerSearchTabFragment = ((C39361s9) r1).A00) != null && (r2 = stickerSearchTabFragment.A03) != null) {
            r2.A04 = z;
            RecyclerView recyclerView = stickerSearchTabFragment.A01;
            if (recyclerView != null) {
                recyclerView.setAdapter((AnonymousClass0CZ) null);
            }
            RecyclerView recyclerView2 = stickerSearchTabFragment.A01;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(r2);
            }
        }
    }

    public void A1J() {
        List list;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        RecyclerView recyclerView = this.A02;
        if (!(recyclerView == null || (viewTreeObserver2 = recyclerView.getViewTreeObserver()) == null)) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this.A01);
        }
        RecyclerView recyclerView2 = this.A02;
        if (!(recyclerView2 == null || (viewTreeObserver = recyclerView2.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A08);
        }
        RecyclerView recyclerView3 = this.A02;
        if (!(recyclerView3 == null || (list = recyclerView3.A0Q) == null)) {
            list.clear();
        }
        Runnable runnable = this.A0C;
        if (runnable != null) {
            WaEditText waEditText = this.A05;
            if (waEditText != null) {
                waEditText.removeCallbacks(runnable);
            }
            this.A0C = null;
        }
        super.A1J();
        this.A04 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A03 = null;
    }

    public final C40121uy A1k() {
        C40121uy r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("stickerSearchViewModel");
    }

    public void Bhl(AnonymousClass11F r2, C135066c4 r3, Integer num, int i) {
        C78053rU r0 = this.A00;
        if (r0 != null && r3 != null) {
            r0.Bhl(r2, r3, num, i);
        }
    }

    public static final void A05(StickerSearchDialogFragment stickerSearchDialogFragment) {
        View view;
        List A0w = C36401kF.A0w(stickerSearchDialogFragment.A1k().A02);
        List A0w2 = C36401kF.A0w(stickerSearchDialogFragment.A1k().A01);
        String str = stickerSearchDialogFragment.A0D;
        int i = 0;
        if (str == null || str.length() != 0) {
            TabLayout tabLayout = stickerSearchDialogFragment.A04;
            if (tabLayout != null) {
                tabLayout.setVisibility(8);
            }
            ViewPager viewPager = stickerSearchDialogFragment.A03;
            if (viewPager == null || viewPager.getVisibility() != 8) {
                A06(stickerSearchDialogFragment, false);
                ViewPager viewPager2 = stickerSearchDialogFragment.A03;
                if (viewPager2 != null) {
                    viewPager2.setVisibility(8);
                }
            }
            if (A0w == null || A0w.isEmpty()) {
                view = stickerSearchDialogFragment.A00;
                if (view == null) {
                    return;
                }
            } else {
                View view2 = stickerSearchDialogFragment.A00;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            }
        } else {
            TabLayout tabLayout2 = stickerSearchDialogFragment.A04;
            if (tabLayout2 != null) {
                tabLayout2.setVisibility(0);
            }
            ViewPager viewPager3 = stickerSearchDialogFragment.A03;
            if (viewPager3 == null || viewPager3.getVisibility() != 0) {
                ViewPager viewPager4 = stickerSearchDialogFragment.A03;
                if (viewPager4 != null) {
                    viewPager4.setVisibility(0);
                }
                A06(stickerSearchDialogFragment, true);
            }
            view = stickerSearchDialogFragment.A00;
            if (view == null) {
                return;
            }
            if (A0w2 != null && !A0w2.isEmpty()) {
                i = 8;
            }
        }
        view.setVisibility(i);
    }

    public void A1M() {
        super.A1M();
        C36421kH.A1D(this.A05);
    }

    public final List A1l(int i) {
        AnonymousClass1XQ[] r3;
        List<C135066c4> A0w = C36401kF.A0w(A1k().A01);
        if (A0w == null) {
            return C36441kJ.A14(0);
        }
        C65173Ra r0 = this.A0E;
        if (i == 0) {
            return A0w;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        Set set = (Set) C36371kC.A0r(r0.A00, i);
        if (set != null) {
            for (C135066c4 r4 : A0w) {
                AnonymousClass3S2 r02 = r4.A04;
                if (r02 != null && (r3 = r02.A0D) != null) {
                    int i2 = 0;
                    int length = r3.length;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (set.contains(r3[i2])) {
                            A0I.add(r4);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        return A0I;
    }
}
