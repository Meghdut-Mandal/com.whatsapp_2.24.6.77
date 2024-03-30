package X;

import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CarouselScrollbarView;
import com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;
import com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onItemsScroll$1;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment;
import com.whatsapp.expressionstray.gifs.GifExpressionsFragment;
import com.whatsapp.search.IteratingPlayer;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7oi  reason: invalid class name and case insensitive filesystem */
public class C162517oi extends AnonymousClass0UE {
    public Object A00;
    public final int A01;

    public C162517oi(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A03(RecyclerView recyclerView, int i) {
        boolean z;
        switch (this.A01) {
            case 0:
                if (i == 1) {
                    ((InputMethodManager) ((C1271967i) this.A00).A00.getSystemService("input_method")).hideSoftInputFromWindow(recyclerView.getWindowToken(), 0);
                    return;
                }
                return;
            case 2:
                if (i == 2 || i == 1) {
                    C120815s7 r2 = (C120815s7) this.A00;
                    RecyclerView recyclerView2 = r2.A00;
                    recyclerView2.A0w(this);
                    recyclerView2.A0J = null;
                    r2.A01.A07(recyclerView2);
                    return;
                }
                return;
            case 3:
                CarouselScrollbarView.A00((CarouselScrollbarView) this.A00);
                return;
            case 8:
                CallGrid callGrid = (CallGrid) this.A00;
                CallGridViewModel callGridViewModel = callGrid.A07;
                if (callGridViewModel != null && i == 0) {
                    callGridViewModel.A0W(callGrid.getVisibleParticipantJids());
                    return;
                }
                return;
            case 11:
                boolean z2 = false;
                AnonymousClass00C.A0D(recyclerView, 0);
                C96154ms r5 = (C96154ms) this.A00;
                boolean z3 = r5.A03;
                if (i != 0) {
                    z2 = true;
                }
                r5.A03 = z2;
                if (z3 != z2) {
                    Iterator it = r5.A0R.iterator();
                    while (it.hasNext()) {
                        C97024oH r3 = (C97024oH) it.next();
                        boolean z4 = r5.A03;
                        if (r3 instanceof C1043459g) {
                            ((C1043459g) r3).A01.setScrolling(z4);
                        }
                        if (r5.A03) {
                            IteratingPlayer iteratingPlayer = r5.A0M;
                            int i2 = r3.A05;
                            if (i2 == -1) {
                                i2 = r3.A04;
                            }
                            z = true;
                            if (i2 == iteratingPlayer.A00) {
                                r3.A0E(z);
                            }
                        }
                        z = false;
                        r3.A0E(z);
                    }
                    return;
                }
                return;
            case 12:
                if (i == 1) {
                    ((AnonymousClass6Q0) this.A00).A02 = true;
                    return;
                } else if (i == 0) {
                    C96134mq.A01(((AnonymousClass6Q0) this.A00).A07);
                    return;
                } else {
                    return;
                }
            case 13:
                AnonymousClass00C.A0D(recyclerView, 0);
                A05(recyclerView);
                return;
            case 14:
                AnonymousClass00C.A0D(recyclerView, 0);
                ((C129046Es) this.A00).A06.A03(recyclerView, i);
                return;
            case 18:
                int i3 = 0;
                boolean A1R = AnonymousClass000.A1R(recyclerView.computeVerticalScrollOffset());
                View view = ((StickerStorePackPreviewActivity) this.A00).A01;
                if (view != null) {
                    if (!A1R) {
                        i3 = 8;
                    }
                    view.setVisibility(i3);
                    return;
                }
                return;
            default:
                super.A03(recyclerView, i);
                return;
        }
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        View view;
        int i3;
        ExpressionsSearchViewModel expressionsSearchViewModel;
        C95864mP r0;
        Object value;
        AnonymousClass55X r10;
        ArrayList A0J;
        View view2;
        AnonymousClass1N2 r02;
        View findViewById;
        float f;
        View findViewById2;
        float f2;
        switch (this.A01) {
            case 1:
                if (i != 0) {
                    ((C124785yn) this.A00).A04 += i;
                }
                if (i2 != 0) {
                    ((C124785yn) this.A00).A05 += i2;
                    return;
                }
                return;
            case 3:
                CarouselScrollbarView.A00((CarouselScrollbarView) this.A00);
                return;
            case 4:
                BusinessApiHomeFragment businessApiHomeFragment = (BusinessApiHomeFragment) this.A00;
                BusinessApiSearchActivity A1Y = businessApiHomeFragment.A1Y();
                if (businessApiHomeFragment.A00.canScrollVertically(-1)) {
                    A1Y.A3j();
                    findViewById2 = A1Y.findViewById(R.id.search_toolbar_container);
                    f2 = AnonymousClass1RH.A00(A1Y);
                } else {
                    Menu menu = A1Y.A00;
                    if (!(menu == null || menu.findItem(1) == null)) {
                        A1Y.A00.removeItem(1);
                    }
                    A1Y.A09 = false;
                    findViewById2 = A1Y.findViewById(R.id.search_toolbar_container);
                    f2 = 0.0f;
                }
                C011004s.A05(findViewById2, f2);
                if (i2 != 0 && recyclerView.getScrollState() == 1 && AnonymousClass1N2.A00(businessApiHomeFragment.A0F) && (view2 = businessApiHomeFragment.A0F) != null) {
                    r02 = businessApiHomeFragment.A06;
                    break;
                } else {
                    return;
                }
                break;
            case 5:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (linearLayoutManager != null) {
                    int A0L = linearLayoutManager.A0L();
                    int A0M = linearLayoutManager.A0M();
                    int A1T = linearLayoutManager.A1T();
                    C174338Wd r2 = (C174338Wd) this.A00;
                    Object A04 = r2.A0H.A04.A03.A04();
                    if (A0M - (A0L + A1T) <= 4 && (A04 instanceof AnonymousClass8WB)) {
                        recyclerView.post(new C1497172m(this, 18));
                    }
                    C174338Wd.A01(r2);
                    return;
                }
                return;
            case 6:
                BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment = (BusinessDirectoryConsumerHomeFragment) this.A00;
                boolean canScrollVertically = recyclerView.canScrollVertically(-1);
                BusinessDirectoryActivity A002 = BusinessDirectoryConsumerHomeFragment.A00(businessDirectoryConsumerHomeFragment);
                if (canScrollVertically) {
                    A002.A3k();
                    BusinessDirectoryActivity A003 = BusinessDirectoryConsumerHomeFragment.A00(businessDirectoryConsumerHomeFragment);
                    findViewById = A003.findViewById(R.id.search_toolbar_container);
                    f = AnonymousClass1RH.A00(A003);
                } else {
                    A002.A3i();
                    findViewById = BusinessDirectoryConsumerHomeFragment.A00(businessDirectoryConsumerHomeFragment).findViewById(R.id.search_toolbar_container);
                    f = 0.0f;
                }
                C011004s.A05(findViewById, f);
                if (i2 != 0 && recyclerView.getScrollState() == 1 && AnonymousClass1N2.A00(businessDirectoryConsumerHomeFragment.A0F) && (view2 = businessDirectoryConsumerHomeFragment.A0F) != null) {
                    r02 = businessDirectoryConsumerHomeFragment.A0E;
                    break;
                } else {
                    return;
                }
                break;
            case 7:
                CallGrid.A04((CallGrid) this.A00);
                return;
            case 8:
                CallGrid.A03((CallGrid) this.A00);
                return;
            case 9:
                AnonymousClass00C.A0D(recyclerView, 0);
                EmojiExpressionsFragment emojiExpressionsFragment = (EmojiExpressionsFragment) this.A00;
                LinearLayoutManager linearLayoutManager2 = emojiExpressionsFragment.A04;
                if (linearLayoutManager2 != null) {
                    int A1T2 = linearLayoutManager2.A1T();
                    int A1V = linearLayoutManager2.A1V();
                    if (A1T2 >= 0 && A1V >= 0 && (r0 = emojiExpressionsFragment.A0B) != null) {
                        AnonymousClass6CK A004 = ((C1256760v) r0.A0L(A1T2)).A00();
                        AnonymousClass6CK r03 = emojiExpressionsFragment.A0C;
                        if (r03 != null && !AnonymousClass00C.A0J(A004, r03)) {
                            AnonymousClass63V r1 = C90514aH.A0c(emojiExpressionsFragment).A06;
                            AnonymousClass55N r04 = AnonymousClass55N.A00;
                            r1.A00(r04, r04, 6);
                        }
                        emojiExpressionsFragment.A0C = A004;
                        AnonymousClass05L r7 = C90514aH.A0c(emojiExpressionsFragment).A0C;
                        C110665b2 r6 = (C110665b2) r7.getValue();
                        if (r6 instanceof AnonymousClass55X) {
                            do {
                                value = r7.getValue();
                                r10 = (AnonymousClass55X) r6;
                                List<AnonymousClass6CK> list = r10.A02;
                                A0J = C36321k7.A0J(list);
                                for (AnonymousClass6CK r12 : list) {
                                    String str = r12.A02;
                                    A0J.add(new AnonymousClass6CK(r12.A01, r12.A00, str, AnonymousClass00C.A0J(str, A004.A02)));
                                }
                            } while (!r7.B3B(value, new AnonymousClass55X(r10.A00, A0J, r10.A01)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                AnonymousClass00C.A0D(recyclerView, 0);
                if (i2 != 0 && (expressionsSearchViewModel = ((GifExpressionsFragment) this.A00).A05) != null) {
                    C36331k8.A1T(new ExpressionsSearchViewModel$onItemsScroll$1(expressionsSearchViewModel, (C023509x) null), C109325Xd.A00(expressionsSearchViewModel));
                    return;
                }
                return;
            case 12:
                AnonymousClass6Q0 r13 = (AnonymousClass6Q0) this.A00;
                if (r13.A02 && i2 != 0) {
                    C96134mq.A01(r13.A07);
                    return;
                }
                return;
            case 13:
                AnonymousClass00C.A0D(recyclerView, 0);
                A05(recyclerView);
                return;
            case 14:
                AnonymousClass00C.A0D(recyclerView, 0);
                ((C129046Es) this.A00).A06.A04(recyclerView, i, i2);
                return;
            case 15:
                SearchFragment searchFragment = (SearchFragment) this.A00;
                C99304t3 r14 = searchFragment.A06;
                if (r14 != null) {
                    r14.A0R(3);
                }
                SearchFragment.A09(searchFragment);
                if (i2 != 0 && recyclerView.getScrollState() == 1) {
                    searchFragment.A1d.A0r(false);
                    return;
                }
                return;
            case 16:
                StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this.A00;
                int A1S = stickerStoreFeaturedTabFragment.A02.A1S();
                int top = stickerStoreFeaturedTabFragment.A01.getTop();
                if (A1S == 0) {
                    if (top != stickerStoreFeaturedTabFragment.A01.getHeight()) {
                        view = stickerStoreFeaturedTabFragment.A01;
                        i3 = view.getHeight();
                    } else {
                        return;
                    }
                } else if (top != 0 && stickerStoreFeaturedTabFragment.A01.getAnimation() == null) {
                    view = stickerStoreFeaturedTabFragment.A01;
                    i3 = 0;
                } else {
                    return;
                }
                view.startAnimation(new C92524e7(stickerStoreFeaturedTabFragment.A01, i3));
                return;
            case 17:
                if (i == 0 && i2 == 0) {
                    C96144mr r15 = (C96144mr) this.A00;
                    StickerView stickerView = r15.A0D;
                    if (stickerView != null && stickerView.getVisibility() == 0) {
                        C96144mr.A01(r15);
                        return;
                    }
                    return;
                }
                ((C96144mr) this.A00).A0L();
                return;
            case 18:
                int i4 = 0;
                boolean A1R = AnonymousClass000.A1R(recyclerView.computeVerticalScrollOffset());
                View view3 = ((StickerStorePackPreviewActivity) this.A00).A01;
                if (view3 != null) {
                    if (!A1R) {
                        i4 = 8;
                    }
                    view3.setVisibility(i4);
                    return;
                }
                return;
            default:
                super.A04(recyclerView, i, i2);
                return;
        }
        r02.A01(view2);
    }

    public final void A05(RecyclerView recyclerView) {
        View BJ2;
        C129046Es r6 = (C129046Es) this.A00;
        if (r6.A04 != null) {
            float A002 = (C36341k9.A00(recyclerView.getContext()) * 0.8f) + 0.5f;
            float min = Math.min(((float) recyclerView.computeVerticalScrollOffset()) / (C36441kJ.A00(C36341k9.A0F(recyclerView), R.dimen.f7nameremoved) / 3.0f), 1.0f);
            double d = (double) min;
            if (0.0d <= d && d <= 1.0d) {
                A002 *= min;
            }
            C160157kY r0 = r6.A04;
            if (r0 != null && (BJ2 = r0.BJ2()) != null) {
                BJ2.setBackgroundColor(C018107s.A05(C018107s.A06(r6.A02, (int) (((float) 13) * min)), r6.A01));
                C011004s.A05(BJ2, A002);
            }
        }
    }
}
