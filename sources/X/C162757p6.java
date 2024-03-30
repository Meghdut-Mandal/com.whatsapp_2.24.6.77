package X;

import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onItemsScroll$1;
import com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment;
import com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel;
import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;
import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel;
import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1;
import java.util.List;

/* renamed from: X.7p6  reason: invalid class name and case insensitive filesystem */
public class C162757p6 extends C96444nL {
    public Object A00;
    public final int A01 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162757p6(Resources resources, AnonymousClass0CP r9, C95834mM r10, StickerExpressionsFragment stickerExpressionsFragment, C20810yC r12, boolean z) {
        super(resources, (GridLayoutManager) r9, r10, r12, z);
        this.A00 = stickerExpressionsFragment;
        AnonymousClass00C.A0B(r12);
        AnonymousClass00C.A0B(resources);
        AnonymousClass00C.A0E(r9, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }

    public void A03(RecyclerView recyclerView, int i) {
        AnonymousClass00C.A0D(recyclerView, 0);
        super.A03(recyclerView, i);
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        ExpressionsSearchViewModel expressionsSearchViewModel;
        C007403e r0;
        if (this.A01 != 0) {
            AnonymousClass00C.A0D(recyclerView, 0);
            super.A04(recyclerView, i, i2);
            StickerExpressionsFragment stickerExpressionsFragment = (StickerExpressionsFragment) this.A00;
            C125385zp r1 = stickerExpressionsFragment.A0E;
            if (r1 != null && !AnonymousClass00C.A0J(this.A01, r1)) {
                AnonymousClass63V r12 = StickerExpressionsFragment.A03(stickerExpressionsFragment).A0I;
                AnonymousClass55P r02 = AnonymousClass55P.A00;
                r12.A00(r02, r02, 6);
            }
            C125385zp r13 = this.A01;
            stickerExpressionsFragment.A0E = r13;
            if (r13 != null) {
                StickerExpressionsFragment.A03(stickerExpressionsFragment).A0U(r13, false);
            }
            if (i2 != 0) {
                if (C36331k8.A1b(stickerExpressionsFragment.A0Q)) {
                    StickerExpressionsViewModel A03 = StickerExpressionsFragment.A03(stickerExpressionsFragment);
                    int i3 = this.A00;
                    if (AnonymousClass1Ax.A03(A03.A0M, 6471)) {
                        int A0F = C90484aE.A0F(A03.A04);
                        int A0F2 = C90484aE.A0F(A03.A03);
                        List list = A03.A02;
                        if (list != null) {
                            int A04 = C90524aI.A04(list, A0F2 + A0F);
                            String str = A03.A01;
                            if (str != null && i3 + 20 > A04 && (r0 = A03.A06) != null && !r0.BL7()) {
                                List list2 = A03.A03;
                                if (list2 == null) {
                                    list2 = C023409w.A00;
                                }
                                A03.A06 = C36391kE.A12(new StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1(A03, str, list2, list, (C023509x) null), C109325Xd.A00(A03));
                            }
                        }
                    }
                }
                expressionsSearchViewModel = stickerExpressionsFragment.A0C;
            } else {
                return;
            }
        } else {
            AnonymousClass00C.A0D(recyclerView, 0);
            super.A04(recyclerView, i, i2);
            AvatarExpressionsFragment avatarExpressionsFragment = (AvatarExpressionsFragment) this.A00;
            C125385zp r14 = avatarExpressionsFragment.A0E;
            if (r14 != null && !AnonymousClass00C.A0J(this.A01, r14)) {
                AnonymousClass63V r15 = ((AvatarExpressionsViewModel) avatarExpressionsFragment.A0P.getValue()).A04;
                AnonymousClass55M r03 = AnonymousClass55M.A00;
                r15.A00(r03, r03, 6);
            }
            C125385zp r16 = this.A01;
            avatarExpressionsFragment.A0E = r16;
            if (r16 != null) {
                ((AvatarExpressionsViewModel) avatarExpressionsFragment.A0P.getValue()).A0T(r16);
            }
            if (i2 != 0) {
                expressionsSearchViewModel = avatarExpressionsFragment.A0B;
            } else {
                return;
            }
        }
        if (expressionsSearchViewModel != null) {
            C36331k8.A1T(new ExpressionsSearchViewModel$onItemsScroll$1(expressionsSearchViewModel, (C023509x) null), C109325Xd.A00(expressionsSearchViewModel));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162757p6(Resources resources, AnonymousClass0CP r9, AvatarExpressionsFragment avatarExpressionsFragment, C95834mM r11, C20810yC r12, boolean z) {
        super(resources, (GridLayoutManager) r9, r11, r12, z);
        this.A00 = avatarExpressionsFragment;
        AnonymousClass00C.A0B(r12);
        AnonymousClass00C.A0B(resources);
        AnonymousClass00C.A0E(r9, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }
}
