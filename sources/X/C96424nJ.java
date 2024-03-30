package X;

import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4nJ  reason: invalid class name and case insensitive filesystem */
public class C96424nJ extends AnonymousClass0UE {
    public Resources A00;
    public final GridLayoutManager A01;
    public final boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (r1 < (r6 + r4)) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r11 != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r1 <= r5) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (r1 <= r7) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(androidx.recyclerview.widget.RecyclerView r13) {
        /*
            r12 = this;
            androidx.recyclerview.widget.GridLayoutManager r9 = r12.A01
            int r8 = r9.A1T()
            int r7 = r9.A1V()
            int r6 = r9.A1S()
            int r5 = r9.A1U()
            int r4 = r9.A01
            android.content.res.Resources r0 = r12.A00
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 1
            boolean r11 = X.AnonymousClass000.A1S(r1, r0)
            int r3 = r9.A0L()
            r2 = 0
        L_0x0026:
            if (r2 >= r3) goto L_0x0075
            android.view.View r0 = r9.A0R(r2)
            if (r0 == 0) goto L_0x0075
            int r1 = androidx.recyclerview.widget.RecyclerView.A00(r0)
            X.0D3 r10 = r13.A0S(r0)
            X.4o3 r10 = (X.C96884o3) r10
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0067
            if (r11 == 0) goto L_0x006e
            if (r7 == r5) goto L_0x0069
            if (r1 < r6) goto L_0x0073
            int r0 = r6 + r4
            if (r1 >= r0) goto L_0x0073
        L_0x0046:
            r1 = 1
        L_0x0047:
            boolean r0 = r10.A02
            if (r0 == r1) goto L_0x005b
            r10.A02 = r1
            if (r1 == 0) goto L_0x005e
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x005e
            com.whatsapp.stickers.StickerView r1 = r10.A07
            r0 = 1
            r1.A03 = r0
            r1.A04()
        L_0x005b:
            int r2 = r2 + 1
            goto L_0x0026
        L_0x005e:
            com.whatsapp.stickers.StickerView r1 = r10.A07
            r0 = 0
            r1.A03 = r0
            r1.A05()
            goto L_0x005b
        L_0x0067:
            if (r11 == 0) goto L_0x006e
        L_0x0069:
            if (r1 < r6) goto L_0x0073
            if (r1 > r5) goto L_0x0073
            goto L_0x0046
        L_0x006e:
            if (r1 < r8) goto L_0x0073
            if (r1 > r7) goto L_0x0073
            goto L_0x0046
        L_0x0073:
            r1 = 0
            goto L_0x0047
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96424nJ.A05(androidx.recyclerview.widget.RecyclerView):void");
    }

    public C96424nJ(Resources resources, GridLayoutManager gridLayoutManager, C20810yC r4) {
        this.A01 = gridLayoutManager;
        this.A00 = resources;
        this.A02 = r4.A0E(272);
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        A05(recyclerView);
    }
}
