package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;
import java.util.List;

/* renamed from: X.5L8  reason: invalid class name */
public class AnonymousClass5L8 extends C96124mp {
    public final /* synthetic */ StickerStoreMyTabFragment A00;

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return super.BUw(viewGroup, i);
        }
        StickerStoreMyTabFragment stickerStoreMyTabFragment = this.A00;
        return new C96614nc(C36361kB.A0E(LayoutInflater.from(stickerStoreMyTabFragment.A1D()), viewGroup, R.layout.f9nameremoved), stickerStoreMyTabFragment);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5L8(StickerStoreMyTabFragment stickerStoreMyTabFragment, List list) {
        super(stickerStoreMyTabFragment, list);
        this.A00 = stickerStoreMyTabFragment;
    }

    public int A0J() {
        int A06 = C36371kC.A06(this.A00);
        if (A06 > 0) {
            return A06 + 1;
        }
        return A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1.A05.size() != 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSE(X.AnonymousClass0D3 r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.getItemViewType(r11)
            if (r0 != 0) goto L_0x00bc
            X.4o8 r10 = (X.C96934o8) r10
            super.BSE(r10, r11)
            java.util.List r0 = r9.A00
            java.lang.Object r1 = r0.get(r11)
            X.68B r1 = (X.AnonymousClass68B) r1
            com.whatsapp.CircularProgressBar r5 = r10.A0E
            boolean r0 = r1.A0S
            r3 = 8
            r4 = 0
            if (r0 == 0) goto L_0x0025
            java.util.List r0 = r1.A05
            int r2 = r0.size()
            r0 = 0
            if (r2 == 0) goto L_0x0027
        L_0x0025:
            r0 = 8
        L_0x0027:
            r5.setVisibility(r0)
            android.widget.ImageView r7 = r10.A05
            r0 = 2131233801(0x7f080c09, float:1.808375E38)
            r7.setImageResource(r0)
            android.content.Context r2 = r7.getContext()
            r0 = 2131101065(0x7f060589, float:1.781453E38)
            android.content.res.ColorStateList r0 = X.AnonymousClass00F.A04(r2, r0)
            X.AnonymousClass06T.A00(r0, r7)
            android.widget.ImageView r2 = r10.A06
            r0 = 2131233807(0x7f080c0f, float:1.8083762E38)
            r2.setImageResource(r0)
            android.widget.ImageView r5 = r10.A07
            r0 = 2131232711(0x7f0807c7, float:1.8081539E38)
            r5.setImageResource(r0)
            boolean r0 = r1.A01()
            r8 = 4
            if (r0 == 0) goto L_0x00c6
            r7.setVisibility(r8)
            r2.setVisibility(r8)
            r5.setVisibility(r8)
            android.view.View r0 = r10.A03
            r0.setVisibility(r4)
            boolean r6 = r1.A06
            com.whatsapp.WaTextView r0 = r10.A0F
            if (r6 == 0) goto L_0x00bd
            r0.setVisibility(r8)
            android.widget.ProgressBar r0 = r10.A09
            r0.setVisibility(r4)
        L_0x0073:
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r6 = r9.A00
            r0 = 2131894622(0x7f12215e, float:1.9424054E38)
            X.C36421kH.A0z(r7, r6, r0)
            r0 = 35
            X.C48902iF.A00(r7, r9, r1, r0)
            r0 = 2131894638(0x7f12216e, float:1.9424086E38)
            X.C36421kH.A0z(r2, r6, r0)
            r0 = 1
            r2.setLongClickable(r0)
            X.6cw r0 = X.C135586cw.A00
            r2.setOnClickListener(r0)
            X.2rs r0 = new X.2rs
            r0.<init>(r10, r9, r3)
            r2.setOnTouchListener(r0)
            r0 = 2131886168(0x7f120058, float:1.9406907E38)
            X.C33521fV.A05(r2, r0)
            r0 = 2131894619(0x7f12215b, float:1.9424048E38)
            X.C36421kH.A0z(r5, r6, r0)
            r0 = 26
            X.C48772i1.A00(r5, r9, r0)
            X.6Ep r0 = r6.A02
            java.lang.String r1 = r1.A0F
            X.AnonymousClass00C.A0D(r1, r4)
            java.lang.String r0 = r0.A01()
            boolean r0 = X.AnonymousClass00C.A0J(r0, r1)
            if (r0 == 0) goto L_0x00bc
            r2.setVisibility(r3)
        L_0x00bc:
            return
        L_0x00bd:
            r0.setVisibility(r4)
            android.widget.ProgressBar r0 = r10.A09
            r0.setVisibility(r8)
            goto L_0x0073
        L_0x00c6:
            android.view.View r0 = r10.A03
            r0.setVisibility(r8)
            boolean r0 = r1.A0R
            if (r0 == 0) goto L_0x00d9
            r7.setVisibility(r8)
            r2.setVisibility(r3)
            r5.setVisibility(r4)
            goto L_0x0073
        L_0x00d9:
            r5.setVisibility(r3)
            r7.setVisibility(r4)
            r2.setVisibility(r4)
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5L8.BSE(X.0D3, int):void");
    }

    public int getItemViewType(int i) {
        if (A0J() - 1 != i) {
            return 0;
        }
        return 1;
    }
}
