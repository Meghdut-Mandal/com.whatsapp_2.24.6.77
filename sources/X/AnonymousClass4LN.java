package X;

import android.app.Dialog;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet;
import java.util.List;

/* renamed from: X.4LN  reason: invalid class name */
public final class AnonymousClass4LN extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ StickerInfoBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LN(StickerInfoBottomSheet stickerInfoBottomSheet) {
        super(1);
        this.this$0 = stickerInfoBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View findViewById;
        int A0S;
        int i;
        int i2;
        String string;
        String str;
        List<AnonymousClass3FV> list = (List) obj;
        StickerInfoBottomSheet stickerInfoBottomSheet = this.this$0;
        AnonymousClass00C.A0B(list);
        if (!list.isEmpty()) {
            LayoutInflater from = LayoutInflater.from(stickerInfoBottomSheet.A0a());
            for (AnonymousClass3FV r5 : list) {
                View A0E = C36361kB.A0E(from, stickerInfoBottomSheet.A00, R.layout.f9nameremoved);
                AnonymousClass00C.A0B(A0E);
                AnonymousClass22V r1 = (AnonymousClass22V) C36361kB.A0G(A0E, R.id.list_item_with_icon);
                boolean z = r5 instanceof C47832fh;
                if (z) {
                    i = R.drawable.vec_sticker_info_view_pack;
                } else if (r5 instanceof C47822fg) {
                    i = R.drawable.vec_sticker_info_view_more_creator;
                } else if (r5 instanceof C47812ff) {
                    i = R.drawable.vec_sticker_info_send;
                } else if (r5 instanceof C47742fY) {
                    i = R.drawable.vec_sticker_info_remove;
                } else if (r5 instanceof C47802fe) {
                    i = R.drawable.vec_sticker_info_edit;
                } else if (r5 instanceof C47792fd) {
                    i = R.drawable.vec_sticker_info_create_your_own;
                } else {
                    if (!(r5 instanceof C47782fc)) {
                        if (r5 instanceof C47772fb) {
                            i = R.drawable.vec_sticker_info_create_ai;
                        } else if (!(r5 instanceof C47762fa)) {
                            i = R.drawable.vec_sticker_info_star;
                        }
                    }
                    i = R.drawable.vec_sticker_info_create_avatar;
                }
                r1.setIcon(i);
                if (z) {
                    i2 = R.string.f12nameremoved;
                } else if (r5 instanceof C47822fg) {
                    i2 = R.string.f12nameremoved;
                } else if (r5 instanceof C47812ff) {
                    i2 = R.string.f12nameremoved;
                } else if (r5 instanceof C47742fY) {
                    boolean z2 = ((C47742fY) r5).A00;
                    i2 = R.string.f12nameremoved;
                    if (!z2) {
                        i2 = R.string.f12nameremoved;
                    }
                } else if (r5 instanceof C47802fe) {
                    i2 = R.string.f12nameremoved;
                } else if (r5 instanceof C47792fd) {
                    i2 = R.string.f12nameremoved;
                } else if (r5 instanceof C47782fc) {
                    i2 = R.string.f12nameremoved;
                } else if (r5 instanceof C47772fb) {
                    i2 = R.string.f12nameremoved;
                } else if (r5 instanceof C47762fa) {
                    i2 = R.string.f12nameremoved;
                } else {
                    i2 = R.string.f12nameremoved;
                }
                boolean z3 = r5 instanceof C47812ff;
                Resources A0G = C36341k9.A0G(stickerInfoBottomSheet);
                if (z3) {
                    Object[] A0L = AnonymousClass001.A0L();
                    AnonymousClass141 r0 = C36431kI.A0w(stickerInfoBottomSheet).A00;
                    if (r0 == null || (str = r0.A0J()) == null) {
                        str = null;
                    }
                    string = C36411kG.A0w(A0G, str, A0L, 0, i2);
                } else {
                    string = A0G.getString(i2);
                }
                r1.setTitle(string);
                AnonymousClass3YC.A00(A0E, r5, stickerInfoBottomSheet, 22);
                ViewGroup viewGroup = stickerInfoBottomSheet.A00;
                if (viewGroup != null) {
                    viewGroup.addView(A0E);
                }
            }
            ViewGroup viewGroup2 = stickerInfoBottomSheet.A00;
            if (viewGroup2 != null) {
                viewGroup2.requestLayout();
            }
            Dialog dialog = stickerInfoBottomSheet.A02;
            if (!(!(dialog instanceof AnonymousClass0FL) || dialog == null || (findViewById = dialog.findViewById(R.id.design_bottom_sheet)) == null)) {
                if (!C011304x.A03(findViewById) || findViewById.isLayoutRequested()) {
                    findViewById.addOnLayoutChangeListener(new AnonymousClass4YA(stickerInfoBottomSheet, findViewById, 4));
                } else {
                    BottomSheetBehavior A02 = BottomSheetBehavior.A02(findViewById);
                    View view = stickerInfoBottomSheet.A0F;
                    if (view != null) {
                        A0S = view.getHeight();
                    } else {
                        A0S = A02.A0S();
                    }
                    C36351kA.A1G(A02, A0S);
                }
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
