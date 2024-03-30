package com.whatsapp.wds.components.textlayout;

import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass2vZ;
import X.AnonymousClass4SZ;
import X.C05250Oz;
import X.C14890mM;
import X.C17150qo;
import X.C17960sM;
import X.C36381kD;
import X.C51122nJ;
import X.C51382nj;
import X.C51392nk;
import X.C56012va;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public final class WDSTextLayout extends FrameLayout {
    public static final /* synthetic */ C17960sM[] A0G;
    public AnonymousClass4SZ A00;
    public AnonymousClass4SZ A01;
    public final AnonymousClass00S A02;
    public final C17150qo A03;
    public final C17150qo A04;
    public final C17150qo A05;
    public final C17150qo A06;
    public final C17150qo A07;
    public final C17150qo A08;
    public final C17150qo A09;
    public final C17150qo A0A;
    public final C17150qo A0B;
    public final C17150qo A0C;
    public final C17150qo A0D;
    public final C17150qo A0E;
    public final C17150qo A0F;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSTextLayout(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void setTextLayoutViewState(C56012va r4) {
        AnonymousClass00C.A0D(r4, 0);
        this.A0F.Bsf(this, r4, A0G[0]);
    }

    static {
        Class<WDSTextLayout> cls = WDSTextLayout.class;
        A0G = new C17960sM[]{new C14890mM(cls, "textLayoutViewState", "getTextLayoutViewState()Lcom/whatsapp/wds/components/textlayout/model/TextLayoutViewState;"), new C14890mM(cls, "layoutStyle", "getLayoutStyle()Lcom/whatsapp/wds/components/textlayout/attributes/TextLayoutStyle;"), new C14890mM(cls, "layoutSize", "getLayoutSize()Lcom/whatsapp/wds/components/textlayout/attributes/TextLayoutSize;"), new C14890mM(cls, "headerImage", "getHeaderImage()Landroid/graphics/drawable/Drawable;"), new C14890mM(cls, "headlineText", "getHeadlineText()Ljava/lang/CharSequence;"), new C14890mM(cls, "descriptionText", "getDescriptionText()Ljava/lang/CharSequence;"), new C14890mM(cls, "footnoteText", "getFootnoteText()Ljava/lang/CharSequence;"), new C14890mM(cls, "primaryButtonText", "getPrimaryButtonText()Ljava/lang/String;"), new C14890mM(cls, "secondaryButtonText", "getSecondaryButtonText()Ljava/lang/String;"), new C14890mM(cls, "primaryButtonClickListener", "getPrimaryButtonClickListener()Landroid/view/View$OnClickListener;"), new C14890mM(cls, "secondaryButtonClickListener", "getSecondaryButtonClickListener()Landroid/view/View$OnClickListener;"), new C14890mM(cls, "footnotePosition", "getFootnotePosition()Lcom/whatsapp/wds/components/textlayout/attributes/FootnotePosition;"), new C14890mM(cls, "content", "getContent()Lcom/whatsapp/wds/components/textlayout/model/TextLayoutViewState$ContentView$Content;")};
    }

    public final AnonymousClass2vZ getContent() {
        return (AnonymousClass2vZ) this.A03.BIo(this, A0G[12]);
    }

    public final CharSequence getDescriptionText() {
        return (CharSequence) this.A04.BIo(this, A0G[5]);
    }

    public final C51382nj getFootnotePosition() {
        return (C51382nj) this.A05.BIo(this, A0G[11]);
    }

    public final CharSequence getFootnoteText() {
        return (CharSequence) this.A06.BIo(this, A0G[6]);
    }

    public final Drawable getHeaderImage() {
        return (Drawable) this.A07.BIo(this, A0G[3]);
    }

    public final CharSequence getHeadlineText() {
        return (CharSequence) this.A08.BIo(this, A0G[4]);
    }

    public final C51392nk getLayoutSize() {
        return (C51392nk) this.A09.BIo(this, A0G[2]);
    }

    public final C51122nJ getLayoutStyle() {
        return (C51122nJ) this.A0A.BIo(this, A0G[1]);
    }

    public final View.OnClickListener getPrimaryButtonClickListener() {
        return (View.OnClickListener) this.A0B.BIo(this, A0G[9]);
    }

    public final String getPrimaryButtonText() {
        return (String) this.A0C.BIo(this, A0G[7]);
    }

    public final View.OnClickListener getSecondaryButtonClickListener() {
        return (View.OnClickListener) this.A0D.BIo(this, A0G[10]);
    }

    public final String getSecondaryButtonText() {
        return (String) this.A0E.BIo(this, A0G[8]);
    }

    public final C56012va getTextLayoutViewState() {
        return (C56012va) this.A0F.BIo(this, A0G[0]);
    }

    public final void setContent(AnonymousClass2vZ r4) {
        this.A03.Bsf(this, r4, A0G[12]);
    }

    public final void setDescriptionText(CharSequence charSequence) {
        this.A04.Bsf(this, charSequence, A0G[5]);
    }

    public final void setFootnotePosition(C51382nj r4) {
        this.A05.Bsf(this, r4, A0G[11]);
    }

    public final void setFootnoteText(CharSequence charSequence) {
        this.A06.Bsf(this, charSequence, A0G[6]);
    }

    public final void setHeaderImage(Drawable drawable) {
        this.A07.Bsf(this, drawable, A0G[3]);
    }

    public final void setHeadlineText(CharSequence charSequence) {
        this.A08.Bsf(this, charSequence, A0G[4]);
    }

    public final void setLayoutSize(C51392nk r4) {
        this.A09.Bsf(this, r4, A0G[2]);
    }

    public final void setLayoutStyle(C51122nJ r4) {
        this.A0A.Bsf(this, r4, A0G[1]);
    }

    public final void setPrimaryButtonClickListener(View.OnClickListener onClickListener) {
        this.A0B.Bsf(this, onClickListener, A0G[9]);
    }

    public final void setPrimaryButtonText(String str) {
        this.A0C.Bsf(this, str, A0G[7]);
    }

    public final void setSecondaryButtonClickListener(View.OnClickListener onClickListener) {
        this.A0D.Bsf(this, onClickListener, A0G[10]);
    }

    public final void setSecondaryButtonText(String str) {
        this.A0E.Bsf(this, str, A0G[8]);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WDSTextLayout(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            r0 = 1
            X.AnonymousClass00C.A0D(r6, r0)
            r5.<init>(r6, r7)
            X.4Ec r1 = new X.4Ec
            r1.<init>(r5)
            r5.A02 = r1
            X.2n0 r2 = X.C51012n0.A00
            X.4NX r0 = new X.4NX
            r0.<init>(r5, r2)
            r5.A0F = r0
            X.3yG r0 = new X.3yG
            r0.<init>(r1)
            r5.A0A = r0
            X.3yG r0 = new X.3yG
            r0.<init>(r1)
            r5.A09 = r0
            X.3yG r0 = new X.3yG
            r0.<init>(r1)
            r5.A07 = r0
            X.3yG r0 = new X.3yG
            r0.<init>(r1)
            r5.A08 = r0
            X.3yG r0 = new X.3yG
            r0.<init>(r1)
            r5.A04 = r0
            X.3yG r0 = new X.3yG
            r0.<init>(r1)
            r5.A06 = r0
            X.3yG r0 = new X.3yG
            r0.<init>(r1)
            r5.A0C = r0
            X.3yG r0 = new X.3yG
            r0.<init>(r1)
            r5.A0E = r0
            X.3yG r0 = new X.3yG
            r0.<init>(r1)
            r5.A0B = r0
            X.3yG r0 = new X.3yG
            r0.<init>(r1)
            r5.A0D = r0
            X.3yG r0 = new X.3yG
            r0.<init>(r1)
            r5.A05 = r0
            X.3yG r0 = new X.3yG
            r0.<init>(r1)
            r5.A03 = r0
            r4 = -1
            r1 = -2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r4, r1)
            r5.setLayoutParams(r0)
            if (r7 == 0) goto L_0x010f
            int[] r0 = X.C27991Qq.A0E
            X.AnonymousClass00C.A09(r0)
            r1 = 0
            android.content.res.TypedArray r3 = r6.obtainStyledAttributes(r7, r0, r1, r1)
            r0 = 3
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r5.setHeaderImage(r0)
            r0 = 4
            java.lang.String r0 = r3.getString(r0)
            r5.setHeadlineText(r0)
            java.lang.String r0 = r3.getString(r1)
            r5.setDescriptionText(r0)
            r0 = 2
            java.lang.String r0 = r3.getString(r0)
            r5.setFootnoteText(r0)
            r0 = 6
            java.lang.String r0 = r3.getString(r0)
            r5.setPrimaryButtonText(r0)
            r0 = 7
            java.lang.String r0 = r3.getString(r0)
            r5.setSecondaryButtonText(r0)
            r0 = 9
            int r1 = r3.getResourceId(r0, r4)
            if (r1 == r4) goto L_0x00c0
            X.2mx r0 = new X.2mx
            r0.<init>(r1)
            r5.setContent(r0)
        L_0x00c0:
            X.2nj[] r2 = X.C51382nj.values()
            r0 = 1
            int r1 = r3.getInt(r0, r4)
            if (r1 < 0) goto L_0x0116
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            int r0 = r2.length
            int r0 = r0 + -1
            if (r1 > r0) goto L_0x0116
            r0 = r2[r1]
        L_0x00d6:
            r5.setFootnotePosition(r0)
            X.2nk[] r2 = X.C51392nk.values()
            r0 = 8
            int r1 = r3.getInt(r0, r4)
            if (r1 < 0) goto L_0x0113
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            int r0 = r2.length
            int r0 = r0 + -1
            if (r1 > r0) goto L_0x0113
            r0 = r2[r1]
        L_0x00f0:
            r5.setLayoutSize(r0)
            X.2nJ[] r2 = X.C51122nJ.values()
            r0 = 5
            int r1 = r3.getInt(r0, r4)
            if (r1 < 0) goto L_0x0110
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            int r0 = r2.length
            int r0 = r0 + -1
            if (r1 > r0) goto L_0x0110
            r0 = r2[r1]
        L_0x0109:
            r5.setLayoutStyle(r0)
            r3.recycle()
        L_0x010f:
            return
        L_0x0110:
            X.2nJ r0 = X.C51122nJ.CARD
            goto L_0x0109
        L_0x0113:
            X.2nk r0 = X.C51392nk.MEDIUM
            goto L_0x00f0
        L_0x0116:
            X.2nj r0 = X.C51382nj.CONTENT_END
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.textlayout.WDSTextLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public /* synthetic */ WDSTextLayout(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }
}
