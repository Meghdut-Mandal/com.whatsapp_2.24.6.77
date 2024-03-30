package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;
import com.whatsapp.stickers.store.StickerStoreTabFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4mp  reason: invalid class name and case insensitive filesystem */
public abstract class C96124mp extends AnonymousClass0CZ {
    public List A00;
    public final /* synthetic */ StickerStoreTabFragment A01;

    public C96124mp(StickerStoreTabFragment stickerStoreTabFragment, List list) {
        this.A01 = stickerStoreTabFragment;
        this.A00 = list;
    }

    public static void A00(AnonymousClass68B r6, C96124mp r7, C96934o8 r8) {
        C96144mr r5 = r8.A00;
        if (r5 != null) {
            List list = r6.A05;
            AnonymousClass00C.A0B(list);
            ArrayList arrayList = null;
            if (C36401kF.A1a(list)) {
                arrayList = C36321k7.A0J(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C135066c4 A0U = C90504aG.A0U(it);
                    AnonymousClass00C.A0B(A0U);
                    arrayList.add(new AnonymousClass6CV(A0U, false));
                }
            }
            C127906Ac r1 = new C127906Ac(r6, arrayList);
            r5.A04 = r1.A00;
            r5.A06 = r1.A01;
            C96144mr r2 = r8.A00;
            int i = r7.A01.A00;
            r2.A00 = i;
            r8.A0D.A1o(i);
            r8.A00.A06();
            r8.A0H.setAdapter(r8.A00);
            C48902iF.A00(r8.A0F, r7, r6, 36);
            r8.A04.setVisibility(C36351kA.A00(r6.A0P ? 1 : 0));
        }
    }

    public static void A01(C96124mp r11, C96934o8 r12, AnonymousClass6CW r13) {
        String str;
        StickerStoreTabFragment stickerStoreTabFragment = r11.A01;
        int dimensionPixelSize = C36341k9.A0G(stickerStoreTabFragment).getDimensionPixelSize(R.dimen.f7nameremoved);
        C20810yC r3 = stickerStoreTabFragment.A08;
        AnonymousClass1HA r5 = stickerStoreTabFragment.A0C;
        if (stickerStoreTabFragment instanceof StickerStoreMyTabFragment) {
            str = "sticker_store_my_tab";
        } else {
            str = "sticker_store_featured_tab";
        }
        r12.A00 = new C96144mr(r3, stickerStoreTabFragment.A0B, r5, (StickerView) null, r13, dimensionPixelSize, 0, false, "sticker_store_my_tab".equals(str));
    }

    public void BSE(AnonymousClass0D3 r7, int i) {
        int i2;
        C96934o8 r72 = (C96934o8) r7;
        AnonymousClass68B r3 = (AnonymousClass68B) this.A00.get(i);
        r72.A0A.setText(r3.A0J);
        long j = r3.A02;
        int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        TextView textView = r72.A0B;
        if (i3 > 0) {
            textView.setText(AnonymousClass3TF.A02(this.A01.A06, j));
            i2 = 0;
        } else {
            i2 = 4;
        }
        textView.setVisibility(i2);
        r72.A01.setVisibility(i2);
        r72.A0C.setText(r3.A0H);
        View view = r72.A0G;
        view.setClickable(true);
        view.setOnClickListener(new AnonymousClass3YL(this, i, 17, r3));
        StickerStoreTabFragment stickerStoreTabFragment = this.A01;
        if (stickerStoreTabFragment.A08.A0E(7296)) {
            stickerStoreTabFragment.A0H.Boy(new AnonymousClass737(this, r72, r3, 8));
            return;
        }
        if (r72.A00 == null) {
            A01(this, r72, stickerStoreTabFragment.A0E.A04());
        }
        A00(r3, this, r72);
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        StickerStoreTabFragment stickerStoreTabFragment = this.A01;
        View inflate = stickerStoreTabFragment.A0J.inflate(R.layout.f9nameremoved, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.sticker_row_recycler);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.A0t(new C96274n4(this, C36341k9.A0G(stickerStoreTabFragment).getDimensionPixelSize(R.dimen.f7nameremoved)));
        int dimensionPixelSize = C36341k9.A0G(stickerStoreTabFragment).getDimensionPixelSize(R.dimen.f7nameremoved);
        if (stickerStoreTabFragment.A00 == 0) {
            stickerStoreTabFragment.A00 = Math.min(5, Math.max(viewGroup.getWidth() / dimensionPixelSize, 1));
        }
        return new C96934o8(inflate, stickerStoreTabFragment);
    }
}
