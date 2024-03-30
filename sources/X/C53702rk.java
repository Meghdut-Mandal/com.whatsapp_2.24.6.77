package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.2rk  reason: invalid class name and case insensitive filesystem */
public class C53702rk implements C160527l9 {
    public Object A00;
    public final int A01;

    public C53702rk(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public int BHb() {
        switch (this.A01) {
            case 0:
                return 0;
            case 2:
                return AnonymousClass3R4.A02((View) this.A00);
            case 3:
                return AnonymousClass3R4.A01(((View) this.A00).getContext(), 36);
            case 4:
                return AnonymousClass3R4.A02((View) this.A00);
            case 7:
                AnonymousClass2IS r2 = (AnonymousClass2IS) this.A00;
                int i = 72;
                if (r2.A0O) {
                    i = 100;
                }
                return AnonymousClass3R4.A01(r2.getContext(), i);
            case 8:
                return C36341k9.A0F(((C65633Sw) this.A00).A0G).getDimensionPixelSize(R.dimen.f7nameremoved);
            case 9:
                return C65023Qk.A01(((AnonymousClass2IO) this.A00).A0A.A05);
            case 10:
                return ((C43522Ii) this.A00).A04;
            case 11:
                return ((C43532Ij) this.A00).A05;
            case 12:
                C42601z5 r22 = (C42601z5) this.A00;
                return r22.A0A.A08.A09(r22.A08.A0I.getContext());
            case 13:
                return 400;
            case 14:
                return C36421kH.A0B((C19630wG) this.A00).getDimensionPixelSize(R.dimen.f7nameremoved);
            default:
                return ((View) this.A00).getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        }
    }

    public /* synthetic */ void BXv() {
        switch (this.A01) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 9:
                ((AnonymousClass2IQ) this.A00).A2J();
                return;
            case 8:
                Log.w("ConversationRowSticker/onFileReadError");
                ((C65633Sw) this.A00).A01 = false;
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        if (r6 != null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        r0 = com.whatsapp.R.drawable.media_location;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        r1.setImageResource(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        r1.setImageBitmap(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b9, code lost:
        r2.A02(r1, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0176, code lost:
        r0.setImageBitmap(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r7.setImageBitmap(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0179, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bte(android.graphics.Bitmap r6, android.view.View r7, X.AnonymousClass3T1 r8) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x00dc;
                case 1: goto L_0x01d2;
                case 2: goto L_0x019b;
                case 3: goto L_0x00d3;
                case 4: goto L_0x009c;
                case 5: goto L_0x007d;
                case 6: goto L_0x0076;
                case 7: goto L_0x0150;
                case 8: goto L_0x002c;
                case 9: goto L_0x0015;
                case 10: goto L_0x005b;
                case 11: goto L_0x0047;
                case 12: goto L_0x00ef;
                case 13: goto L_0x008c;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            boolean r0 = r7 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x0014
            if (r6 == 0) goto L_0x0014
            android.widget.ImageView r7 = (android.widget.ImageView) r7
        L_0x0011:
            r7.setImageBitmap(r6)
        L_0x0014:
            return
        L_0x0015:
            r3 = 0
            if (r6 == 0) goto L_0x0142
            java.lang.Object r2 = r5.A00
            X.2IO r2 = (X.AnonymousClass2IO) r2
            android.content.res.Resources r1 = X.C36341k9.A0F(r2)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r6)
            r2.setThumbnail(r0)
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r2 = r2.A0A
            goto L_0x00b1
        L_0x002c:
            if (r6 == 0) goto L_0x003a
            boolean r0 = r8 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x003a
            java.lang.Object r0 = r5.A00
            X.3Sw r0 = (X.C65633Sw) r0
            com.whatsapp.stickers.StickerView r0 = r0.A0G
            goto L_0x0176
        L_0x003a:
            java.lang.Object r1 = r5.A00
            X.3Sw r1 = (X.C65633Sw) r1
            r0 = 0
            r1.A01 = r0
            com.whatsapp.stickers.StickerView r1 = r1.A0G
            r0 = 2131233775(0x7f080bef, float:1.8083697E38)
            goto L_0x0088
        L_0x0047:
            r0 = 2
            X.AnonymousClass00C.A0D(r8, r0)
            java.lang.Object r0 = r5.A00
            X.2Ij r0 = (X.C43532Ij) r0
            com.whatsapp.components.button.ThumbnailButton r1 = r0.A06
            int r0 = X.C36411kG.A08(r6)
            r1.setVisibility(r0)
            if (r6 != 0) goto L_0x0098
            return
        L_0x005b:
            r0 = 2
            X.AnonymousClass00C.A0D(r8, r0)
            java.lang.Object r0 = r5.A00
            X.2Ii r0 = (X.C43522Ii) r0
            com.whatsapp.components.button.ThumbnailButton r2 = r0.A06
            r1 = 0
            int r0 = X.C36411kG.A08(r6)
            r2.setVisibility(r0)
            if (r6 == 0) goto L_0x0014
            r2.setVisibility(r1)
            r2.setImageBitmap(r6)
            return
        L_0x0076:
            java.lang.Object r0 = r5.A00
            X.2IG r0 = (X.AnonymousClass2IG) r0
            android.widget.ImageView r1 = r0.A05
            goto L_0x0083
        L_0x007d:
            java.lang.Object r0 = r5.A00
            X.2IF r0 = (X.AnonymousClass2IF) r0
            android.widget.ImageView r1 = r0.A02
        L_0x0083:
            if (r6 != 0) goto L_0x0098
            r0 = 2131233159(0x7f080987, float:1.8082448E38)
        L_0x0088:
            r1.setImageResource(r0)
            return
        L_0x008c:
            if (r6 == 0) goto L_0x0014
            java.lang.Object r0 = r5.A00
            X.2YX r0 = (X.AnonymousClass2YX) r0
            com.whatsapp.components.button.ThumbnailButton r1 = r0.A0S
            r0 = 0
            r1.setVisibility(r0)
        L_0x0098:
            r1.setImageBitmap(r6)
            return
        L_0x009c:
            r3 = 0
            java.lang.Object r0 = r5.A00
            X.8ZW r0 = (X.AnonymousClass8ZW) r0
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r2 = r0.A02
            if (r6 == 0) goto L_0x00bd
            android.content.res.Resources r1 = X.C36341k9.A0F(r0)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r6)
            r2.setImageDrawable(r0)
        L_0x00b1:
            int r1 = r6.getWidth()
            int r0 = r6.getHeight()
        L_0x00b9:
            r2.A02(r1, r0, r3)
            return
        L_0x00bd:
            android.graphics.drawable.ColorDrawable r0 = X.C36401kF.A0A(r0)
            r2.setImageDrawable(r0)
            boolean r0 = r8 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x0014
            X.2bU r8 = (X.AnonymousClass2bU) r8
            X.3Qj r0 = r8.A01
            if (r0 == 0) goto L_0x0014
            int r1 = r0.A0A
            int r0 = r0.A06
            goto L_0x00b9
        L_0x00d3:
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r6 == 0) goto L_0x020a
            X.C36411kG.A1D(r7)
            goto L_0x0011
        L_0x00dc:
            if (r6 == 0) goto L_0x0014
            java.lang.Object r0 = r5.A00
            X.3FP r0 = (X.AnonymousClass3FP) r0
            com.whatsapp.WaImageView r1 = r0.A08
            X.C36411kG.A1D(r1)
            r1.setImageBitmap(r6)
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x00ef:
            java.lang.Object r1 = r5.A00
            X.1z5 r1 = (X.C42601z5) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            com.whatsapp.webpagepreview.WebPagePreviewView r4 = r1.A08
            com.whatsapp.components.button.ThumbnailButton r1 = r4.A0I
            r0 = 0
            r1.setVisibility(r0)
            if (r6 == 0) goto L_0x0113
            int r0 = r6.getHeight()
            if (r0 == 0) goto L_0x0113
            int r0 = r6.getWidth()
            if (r0 == 0) goto L_0x0113
            com.whatsapp.components.button.ThumbnailButton r0 = r4.A0I
            X.C36411kG.A1D(r0)
            com.whatsapp.components.button.ThumbnailButton r0 = r4.A0I
            goto L_0x0176
        L_0x0113:
            com.whatsapp.components.button.ThumbnailButton r3 = r4.A0I
            android.content.Context r2 = r3.getContext()
            r1 = 2131232351(0x7f08065f, float:1.8080809E38)
            r0 = 2131103050(0x7f060d4a, float:1.7818555E38)
            X.AnonymousClass3UF.A0B(r2, r3, r1, r0)
            com.whatsapp.components.button.ThumbnailButton r1 = r4.A0I
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r1.setScaleType(r0)
            com.whatsapp.components.button.ThumbnailButton r0 = r4.A0I
            r1 = 1069547520(0x3fc00000, float:1.5)
            r0.setScaleY(r1)
            com.whatsapp.components.button.ThumbnailButton r0 = r4.A0I
            r0.setScaleX(r1)
            com.whatsapp.components.button.ThumbnailButton r2 = r4.A0I
            android.content.Context r1 = r2.getContext()
            r0 = 2131101660(0x7f0607dc, float:1.7815736E38)
            X.C36341k9.A0q(r1, r2, r0)
            return
        L_0x0142:
            java.lang.Object r1 = r5.A00
            X.2IO r1 = (X.AnonymousClass2IO) r1
            r1.A06 = r3
            android.graphics.drawable.ColorDrawable r0 = X.C36401kF.A0A(r1)
            r1.setThumbnail(r0)
            return
        L_0x0150:
            if (r6 == 0) goto L_0x017a
            boolean r0 = r8 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x017a
            X.2bU r8 = (X.AnonymousClass2bU) r8
            X.3Qj r0 = X.AnonymousClass2bU.A00(r8)
            int r2 = r0.A0A
            if (r2 == 0) goto L_0x0170
            int r1 = r0.A06
            if (r1 == 0) goto L_0x0170
            java.lang.Object r0 = r5.A00
            X.2IJ r0 = (X.AnonymousClass2IJ) r0
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r0 = r0.A05
            r0.A04(r2, r1)
            X.C36411kG.A1D(r0)
        L_0x0170:
            java.lang.Object r0 = r5.A00
            X.2IJ r0 = (X.AnonymousClass2IJ) r0
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r0 = r0.A05
        L_0x0176:
            r0.setImageBitmap(r6)
            return
        L_0x017a:
            java.lang.Object r2 = r5.A00
            X.2IJ r2 = (X.AnonymousClass2IJ) r2
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r3 = r2.A05
            X.C36441kJ.A1D(r3)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131101070(0x7f06058e, float:1.781454E38)
            X.C36391kE.A1C(r1, r3, r0)
            android.content.Context r2 = r2.getContext()
            r1 = 2131231272(0x7f080228, float:1.807862E38)
            r0 = 2131101071(0x7f06058f, float:1.7814541E38)
            X.AnonymousClass3UF.A0B(r2, r3, r1, r0)
            return
        L_0x019b:
            java.lang.Object r4 = r5.A00
            X.2I9 r4 = (X.AnonymousClass2I9) r4
            if (r6 == 0) goto L_0x01c8
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r3 = r4.A0E
            android.content.res.Resources r1 = X.C36341k9.A0F(r4)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r6)
            r3.setImageDrawable(r0)
            int r2 = r6.getWidth()
            int r1 = r6.getHeight()
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x01bf
            int r0 = r4.A02
            if (r0 > 0) goto L_0x01c3
        L_0x01bf:
            r4.A01 = r1
            r4.A02 = r2
        L_0x01c3:
            r0 = 0
            r3.A02(r2, r1, r0)
            return
        L_0x01c8:
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r1 = r4.A0E
            android.graphics.drawable.ColorDrawable r0 = X.C36401kF.A0A(r4)
            r1.setImageDrawable(r0)
            return
        L_0x01d2:
            if (r6 == 0) goto L_0x0200
            boolean r0 = r7 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x0200
            r2 = r7
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            X.2bU r8 = (X.AnonymousClass2bU) r8
            java.lang.String r0 = r8.A05
            r1 = 0
            if (r0 == 0) goto L_0x01fd
            boolean r0 = X.AnonymousClass1GX.A0b(r0)
            if (r0 == 0) goto L_0x01fd
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
        L_0x01ea:
            r2.setScaleType(r0)
            r2.setImageBitmap(r6)
            r7.setVisibility(r1)
            java.lang.Object r0 = r5.A00
            X.2I5 r0 = (X.AnonymousClass2I5) r0
            android.view.View r0 = r0.A02
            r0.setVisibility(r1)
            return
        L_0x01fd:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            goto L_0x01ea
        L_0x0200:
            r0 = 0
            r7.setTag(r0)
            r0 = 8
            r7.setVisibility(r0)
            return
        L_0x020a:
            X.C36441kJ.A1D(r7)
            java.lang.Object r2 = r5.A00
            android.view.View r2 = (android.view.View) r2
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131101070(0x7f06058e, float:1.781454E38)
            X.C36391kE.A1C(r1, r7, r0)
            android.content.Context r2 = r2.getContext()
            r1 = 2131231272(0x7f080228, float:1.807862E38)
            r0 = 2131101071(0x7f06058f, float:1.7814541E38)
            X.AnonymousClass3UF.A0B(r2, r7, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53702rk.Bte(android.graphics.Bitmap, android.view.View, X.3T1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0071, code lost:
        r1.setImageDrawable((android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        r1.setBackgroundColor(-7829368);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0082, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0096, code lost:
        r2.setImageDrawable(new android.graphics.drawable.ColorDrawable(-7829368));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void Btu(android.view.View r4) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 1: goto L_0x0006;
                case 2: goto L_0x0090;
                case 3: goto L_0x0083;
                case 4: goto L_0x0076;
                case 5: goto L_0x006b;
                case 6: goto L_0x0064;
                case 7: goto L_0x005d;
                case 8: goto L_0x0048;
                case 9: goto L_0x0035;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0025;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            boolean r0 = r4 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x0005
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1 = -7829368(0xffffffffff888888, float:NaN)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r4.setImageDrawable(r0)
            r1 = 0
            r4.setVisibility(r1)
            java.lang.Object r0 = r3.A00
            X.2I5 r0 = (X.AnonymousClass2I5) r0
            android.view.View r0 = r0.A02
            r0.setVisibility(r1)
            return
        L_0x0025:
            java.lang.Object r1 = r3.A00
            X.1z5 r1 = (X.C42601z5) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r1.A08
            com.whatsapp.components.button.ThumbnailButton r0 = r1.A0I
            X.C36411kG.A1D(r0)
            com.whatsapp.components.button.ThumbnailButton r2 = r1.A0I
            goto L_0x0096
        L_0x0035:
            java.lang.Object r2 = r3.A00
            X.2IO r2 = (X.AnonymousClass2IO) r2
            r0 = 0
            r2.A06 = r0
            r1 = -7829368(0xffffffffff888888, float:NaN)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r2.setThumbnail(r0)
            return
        L_0x0048:
            java.lang.String r0 = "ConversationRowSticker/showPlaceholder"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Object r1 = r3.A00
            X.3Sw r1 = (X.C65633Sw) r1
            r0 = 0
            r1.A01 = r0
            com.whatsapp.stickers.StickerView r1 = r1.A0G
            r0 = 2131233775(0x7f080bef, float:1.8083697E38)
            r1.setImageResource(r0)
            return
        L_0x005d:
            java.lang.Object r0 = r3.A00
            X.2IJ r0 = (X.AnonymousClass2IJ) r0
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r1 = r0.A05
            goto L_0x007c
        L_0x0064:
            java.lang.Object r0 = r3.A00
            X.2IG r0 = (X.AnonymousClass2IG) r0
            android.widget.ImageView r1 = r0.A05
            goto L_0x0071
        L_0x006b:
            java.lang.Object r0 = r3.A00
            X.2IF r0 = (X.AnonymousClass2IF) r0
            android.widget.ImageView r1 = r0.A02
        L_0x0071:
            r0 = 0
            r1.setImageDrawable(r0)
            goto L_0x007c
        L_0x0076:
            java.lang.Object r0 = r3.A00
            X.8ZW r0 = (X.AnonymousClass8ZW) r0
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r1 = r0.A02
        L_0x007c:
            r0 = -7829368(0xffffffffff888888, float:NaN)
            r1.setBackgroundColor(r0)
            return
        L_0x0083:
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 0
            r4.setImageDrawable(r0)
            r0 = -7829368(0xffffffffff888888, float:NaN)
            r4.setBackgroundColor(r0)
            return
        L_0x0090:
            java.lang.Object r0 = r3.A00
            X.2I9 r0 = (X.AnonymousClass2I9) r0
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r2 = r0.A0E
        L_0x0096:
            r1 = -7829368(0xffffffffff888888, float:NaN)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r2.setImageDrawable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53702rk.Btu(android.view.View):void");
    }
}
