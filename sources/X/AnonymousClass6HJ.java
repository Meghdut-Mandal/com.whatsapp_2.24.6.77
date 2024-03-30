package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.SparseArray;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.6HJ  reason: invalid class name */
public abstract class AnonymousClass6HJ {
    public static SparseArray A00(C20810yC r12) {
        SparseArray sparseArray = new SparseArray();
        float f = 2.0f;
        if (C222013h.A07) {
            f = 0.0f;
        }
        sparseArray.put(C65953Uc.A03, new C123975xO(9.0f, 4.0f, f, R.id.search_media_filter_link, R.string.f12nameremoved, R.drawable.ic_link));
        sparseArray.put(105, new C123975xO(9.0f, 4.0f, 0.0f, R.id.search_media_filter_image, R.string.f12nameremoved, R.drawable.msg_status_image));
        sparseArray.put(97, new C123975xO(8.0f, 4.0f, 0.0f, R.id.search_media_filter_audio, R.string.f12nameremoved, R.drawable.msg_status_audio));
        sparseArray.put(103, new C123975xO(10.0f, 6.0f, 0.2f, R.id.search_media_filter_gif, R.string.f12nameremoved, R.drawable.msg_status_gif));
        sparseArray.put(118, new C123975xO(9.0f, 5.0f, 0.0f, R.id.search_media_filter_video, R.string.f12nameremoved, R.drawable.msg_status_video));
        sparseArray.put(100, new C123975xO(7.0f, 3.0f, 0.0f, R.id.search_media_filter_doc, R.string.f12nameremoved, R.drawable.msg_status_doc));
        sparseArray.put(117, new C123975xO(9.0f, 5.0f, 0.0f, R.id.search_unread_filter, R.string.f12nameremoved, R.drawable.smart_filter_unread));
        AnonymousClass00C.A0D(r12, 0);
        boolean A0E = r12.A0E(3223);
        int i = R.drawable.msg_status_poll;
        if (A0E) {
            i = R.drawable.msg_status_poll_v2;
        }
        sparseArray.put(111, new C123975xO(7.0f, 3.0f, 0.0f, R.id.search_poll_filter, R.string.f12nameremoved, i));
        sparseArray.put(98, new C123975xO(9.0f, 5.0f, 0.0f, R.id.search_business_filter, R.string.f12nameremoved, R.drawable.ic_business_directory_filled_wds));
        return sparseArray;
    }

    public static void A01(Context context, Chip chip, C20810yC r11, int i, int i2) {
        C123975xO r2 = (C123975xO) A00(r11).get(i);
        Drawable A00 = AnonymousClass0BT.A00((Resources.Theme) null, context.getResources(), r2.A03);
        C18740tg.A06(A00);
        int A01 = C65103Qt.A01(context, r2.A01);
        int max = Math.max(A00.getIntrinsicWidth(), A00.getIntrinsicHeight());
        int intrinsicWidth = ((max - A00.getIntrinsicWidth()) / 2) + A01;
        int intrinsicHeight = ((max - A00.getIntrinsicHeight()) / 2) + A01;
        chip.setChipIcon(AnonymousClass3UF.A04(context, new InsetDrawable(A00, intrinsicWidth, intrinsicHeight, intrinsicWidth, intrinsicHeight), i2));
        chip.setChipIconSize(C90524aI.A01(context, 20.0f));
        chip.setChipStartPadding(C90524aI.A01(context, 1.0f));
        chip.setTextStartPadding(C90524aI.A01(context, 1.0f));
        chip.setIconStartPadding(C90524aI.A01(context, r2.A02));
        chip.setIconEndPadding(C90524aI.A01(context, r2.A00));
    }
}
