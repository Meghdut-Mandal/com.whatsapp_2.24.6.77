package X;

import android.view.View;

/* renamed from: X.7qO  reason: invalid class name and case insensitive filesystem */
public class C163557qO implements View.OnLongClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C163557qO(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        r3.A05 = java.lang.Integer.valueOf(r0);
        r1 = com.whatsapp.stickers.StarStickerFromPickerDialogFragment.A03(r3);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r0 = r2.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        ((X.C225314u) X.C24801Dv.A00(r0)).Btm(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r7) {
        /*
            r6 = this;
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x006c;
                case 1: goto L_0x0077;
                case 2: goto L_0x00b9;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A00
            X.4mj r0 = (X.C96064mj) r0
            java.lang.Object r3 = r6.A01
            X.6c4 r3 = (X.C135066c4) r3
            X.7hc r1 = r0.A02
            if (r1 == 0) goto L_0x00fb
            X.7t9 r1 = (X.C165267t9) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0050;
                case 1: goto L_0x004a;
                case 2: goto L_0x003f;
                case 3: goto L_0x0034;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.Object r2 = r1.A00
            X.6x9 r2 = (X.C147396x9) r2
            r0 = 4
        L_0x001d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A05 = r0
            com.whatsapp.stickers.StarStickerFromPickerDialogFragment r1 = com.whatsapp.stickers.StarStickerFromPickerDialogFragment.A03(r3)
        L_0x0027:
            android.content.Context r0 = r2.A0B
        L_0x0029:
            android.app.Activity r0 = X.C24801Dv.A00(r0)
            X.14u r0 = (X.C225314u) r0
            r0.Btm(r1)
        L_0x0032:
            r0 = 1
            return r0
        L_0x0034:
            java.lang.Object r0 = r1.A00
            X.6x9 r0 = (X.C147396x9) r0
            com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment r1 = X.C55522ul.A00(r3)
            android.content.Context r0 = r0.A0B
            goto L_0x0029
        L_0x003f:
            java.lang.Object r2 = r1.A00
            X.5Kv r2 = (X.C106685Kv) r2
            boolean r0 = r2.A0D
            com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment r1 = com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment.A03(r3, r0)
            goto L_0x0027
        L_0x004a:
            java.lang.Object r2 = r1.A00
            X.6x9 r2 = (X.C147396x9) r2
            r0 = 3
            goto L_0x001d
        L_0x0050:
            java.lang.Object r1 = r1.A00
            X.6x9 r1 = (X.C147396x9) r1
            java.lang.Integer r0 = X.C36371kC.A0n()
            r3.A05 = r0
            com.whatsapp.stickers.StarStickerFromPickerDialogFragment r2 = com.whatsapp.stickers.StarStickerFromPickerDialogFragment.A03(r3)
            android.content.Context r1 = r1.A0B
            java.lang.Class<X.14u> r0 = X.C225314u.class
            android.app.Activity r0 = X.C24801Dv.A01(r1, r0)
            X.14u r0 = (X.C225314u) r0
            r0.Btm(r2)
            goto L_0x0032
        L_0x006c:
            java.lang.Object r0 = r6.A00
            X.52X r0 = (X.AnonymousClass52X) r0
            java.lang.Object r5 = r6.A01
            X.6Eu r5 = (X.C129066Eu) r5
            X.60n r0 = r0.A03
            goto L_0x0081
        L_0x0077:
            java.lang.Object r0 = r6.A00
            X.52b r0 = (X.C1028252b) r0
            java.lang.Object r5 = r6.A01
            X.6Eu r5 = (X.C129066Eu) r5
            X.60n r0 = r0.A03
        L_0x0081:
            if (r0 == 0) goto L_0x00fb
            com.whatsapp.calling.callgrid.view.CallGrid r0 = r0.A00
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r4 = r0.A07
            X.C18740tg.A06(r4)
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x00a4
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x00a4
            X.1PZ r3 = r4.A0T
            r2 = 34
            r1 = 16
            java.lang.Integer r0 = X.C36371kC.A0n()
            r3.A01(r0, r2, r1)
            com.whatsapp.jid.UserJid r0 = r5.A0b
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0L(r4, r0)
        L_0x00a4:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/CallGridViewModel//showVoiceCallParticipantMenu "
            r2.append(r0)
            com.whatsapp.jid.UserJid r1 = r5.A0b
            X.C36321k7.A1N(r1, r2)
            X.00s r0 = r4.A0K
            r0.A0D(r1)
            goto L_0x0032
        L_0x00b9:
            java.lang.Object r4 = r6.A00
            X.7yq r4 = (X.C167797yq) r4
            java.lang.Object r3 = r6.A01
            X.8bI r3 = (X.C175928bI) r3
            X.0yb r0 = r4.A0N
            android.content.ClipboardManager r1 = r0.A09()
            r2 = 0
            if (r1 != 0) goto L_0x00d4
            X.17Y r1 = r4.A0I
            r0 = 2131895677(0x7f12257d, float:1.9426194E38)
            r1.A06(r0, r2)
            goto L_0x0032
        L_0x00d4:
            X.9jw r0 = r3.A0G     // Catch:{ NullPointerException | SecurityException -> 0x00f1 }
            X.6c7 r0 = r0.A08     // Catch:{ NullPointerException | SecurityException -> 0x00f1 }
            if (r0 != 0) goto L_0x00dc
            r0 = 0
            goto L_0x00de
        L_0x00dc:
            java.lang.Object r0 = r0.A00     // Catch:{ NullPointerException | SecurityException -> 0x00f1 }
        L_0x00de:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ NullPointerException | SecurityException -> 0x00f1 }
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r0)     // Catch:{ NullPointerException | SecurityException -> 0x00f1 }
            r1.setPrimaryClip(r0)     // Catch:{ NullPointerException | SecurityException -> 0x00f1 }
            X.17Y r1 = r4.A0I     // Catch:{ NullPointerException | SecurityException -> 0x00f1 }
            r0 = 2131895395(0x7f122463, float:1.9425622E38)
            r1.A06(r0, r2)     // Catch:{ NullPointerException | SecurityException -> 0x00f1 }
            goto L_0x0032
        L_0x00f1:
            X.17Y r1 = r4.A0I
            r0 = 2131895677(0x7f12257d, float:1.9426194E38)
            r1.A06(r0, r2)
            goto L_0x0032
        L_0x00fb:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163557qO.onLongClick(android.view.View):boolean");
    }
}
