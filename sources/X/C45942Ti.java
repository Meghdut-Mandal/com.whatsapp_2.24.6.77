package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.whatsapp.R;
import java.io.File;

/* renamed from: X.2Ti  reason: invalid class name and case insensitive filesystem */
public class C45942Ti extends C45952Tw implements AnonymousClass4O6 {
    public int A00 = 1;
    public Drawable A01;
    public Drawable A02;
    public Drawable A03;
    public TextPaint A04;
    public C18820ts A05;
    public AnonymousClass3QW A06;
    public boolean A07;
    public Paint A08;
    public Drawable A09;
    public Drawable A0A;
    public Drawable A0B;

    private TextPaint A00() {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(-1);
        textPaint.setTextSize(C36441kJ.A00(C36341k9.A0F(this), R.dimen.f7nameremoved));
        return textPaint;
    }

    private void A01(Canvas canvas, C74833mF r9, float f) {
        String str;
        File file = r9.A03;
        if (file != null) {
            str = file.getName();
        } else {
            str = null;
        }
        if (r9.getType() == 4 && !TextUtils.isEmpty(str)) {
            if (this.A04 == null) {
                this.A04 = A00();
            }
            Drawable drawable = this.A0A;
            if (drawable == null) {
                drawable = C36381kD.A0H(getContext(), R.drawable.gallery_album_overlay);
                this.A0A = drawable;
            }
            drawable.setBounds(0, getHeight() - ((int) (this.A04.getTextSize() * 2.0f)), getWidth(), getHeight());
            this.A0A.draw(canvas);
            TextPaint textPaint = this.A04;
            canvas.drawText(TextUtils.ellipsize(str, textPaint, f - ((textPaint.getTextSize() / 3.0f) * 2.0f), TextUtils.TruncateAt.END).toString(), this.A04.getTextSize() / 3.0f, C36441kJ.A02(this) - (this.A04.getTextSize() / 3.0f), this.A04);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r1 == 3) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r4 == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r3 != false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r5 == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r1 == 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r12.A04 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r12.A04 = A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r3 = X.AnonymousClass3UY.A07(r12.A05, r1);
        r4 = ((float) r0) + (r12.A04.getTextSize() / 3.0f);
        r2 = X.C36441kJ.A02(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (X.C222013h.A07 == false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        r0 = X.C36441kJ.A00(X.C36341k9.A0F(r12), com.whatsapp.R.dimen.f7nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        r13.drawText(r3, r4, r2 - r0, r12.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c7, code lost:
        r0 = r12.A04.getTextSize() / 3.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d0, code lost:
        r6 = r12.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d2, code lost:
        if (r6 != null) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d4, code lost:
        r6 = X.AnonymousClass00E.A00(getContext(), com.whatsapp.R.drawable.mark_video);
        r12.A0B = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e2, code lost:
        r6 = r12.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e4, code lost:
        if (r6 != null) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e6, code lost:
        r6 = X.AnonymousClass00E.A00(getContext(), com.whatsapp.R.drawable.mark_gif);
        r12.A09 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f3, code lost:
        if (r6 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f5, code lost:
        r9 = r12.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f7, code lost:
        if (r9 != null) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f9, code lost:
        r9 = X.AnonymousClass00E.A00(getContext(), com.whatsapp.R.drawable.gallery_album_overlay);
        r12.A0A = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0206, code lost:
        r9.setBounds(0, getHeight() - (r6.getIntrinsicHeight() * 2), getWidth(), getHeight());
        r12.A0A.draw(r13);
        r5 = r6.getIntrinsicHeight() / 4;
        r6.setBounds(r5, (getHeight() - r6.getIntrinsicHeight()) - r5, r6.getIntrinsicWidth() + r5, getHeight() - r5);
        r6.draw(r13);
        r0 = r6.getIntrinsicWidth() + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0248, code lost:
        r1 = r2.BBF();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x024e, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r1 != 1) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.graphics.Canvas r13) {
        /*
            r12 = this;
            X.4V2 r0 = r12.A08
            if (r0 == 0) goto L_0x01ba
            android.graphics.drawable.Drawable r0 = r12.getDrawable()
            if (r0 == 0) goto L_0x01ba
            int r0 = r12.A00
            r8 = 2
            r7 = 3
            if (r0 == r7) goto L_0x0066
            X.4V2 r2 = r12.A08
            int r1 = r2.getType()
            r5 = 1
            r0 = 0
            r4 = 1
            if (r1 == r8) goto L_0x001f
            r4 = 0
            r3 = 1
            if (r1 == r5) goto L_0x024e
        L_0x001f:
            r3 = 0
            if (r1 != r7) goto L_0x024e
        L_0x0022:
            r10 = 0
            if (r4 == 0) goto L_0x0248
            r1 = 0
        L_0x0028:
            if (r3 != 0) goto L_0x01d0
            if (r4 != 0) goto L_0x01e2
            if (r5 == 0) goto L_0x0066
        L_0x002e:
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0066
            android.text.TextPaint r3 = r12.A04
            if (r3 != 0) goto L_0x003c
            android.text.TextPaint r3 = r12.A00()
            r12.A04 = r3
        L_0x003c:
            X.0ts r3 = r12.A05
            java.lang.String r3 = X.AnonymousClass3UY.A07(r3, r1)
            float r4 = (float) r0
            android.text.TextPaint r0 = r12.A04
            float r0 = r0.getTextSize()
            r1 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 / r1
            float r4 = r4 + r0
            float r2 = X.C36441kJ.A02(r12)
            boolean r0 = X.C222013h.A07
            if (r0 == 0) goto L_0x01c7
            android.content.res.Resources r1 = X.C36341k9.A0F(r12)
            r0 = 2131166391(0x7f0704b7, float:1.7947026E38)
            float r0 = X.C36441kJ.A00(r1, r0)
        L_0x0060:
            float r2 = r2 - r0
            android.text.TextPaint r0 = r12.A04
            r13.drawText(r3, r4, r2, r0)
        L_0x0066:
            X.4V2 r4 = r12.A08
            boolean r0 = r4 instanceof X.C74833mF
            if (r0 == 0) goto L_0x01ba
            X.3mF r4 = (X.C74833mF) r4
            int r0 = r12.A00
            if (r0 == r8) goto L_0x00ff
            X.2bU r0 = r4.A02
            if (r0 == 0) goto L_0x00ff
            X.0ts r0 = r12.A05
            if (r0 == 0) goto L_0x00ff
            android.text.TextPaint r0 = r12.A04
            if (r0 != 0) goto L_0x0084
            android.text.TextPaint r0 = r12.A00()
            r12.A04 = r0
        L_0x0084:
            int r0 = r4.getType()
            r9 = 1073741824(0x40000000, float:2.0)
            if (r0 == r7) goto L_0x00b2
            android.graphics.drawable.Drawable r3 = r12.A03
            if (r3 != 0) goto L_0x009d
            android.content.Context r1 = r12.getContext()
            r0 = 2131231685(0x7f0803c5, float:1.8079458E38)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass00E.A00(r1, r0)
            r12.A03 = r3
        L_0x009d:
            int r2 = r12.getWidth()
            android.text.TextPaint r0 = r12.A04
            float r0 = r0.getTextSize()
            float r0 = r0 * r9
            int r1 = (int) r0
            r0 = 0
            r3.setBounds(r0, r0, r2, r1)
            android.graphics.drawable.Drawable r0 = r12.A03
            r0.draw(r13)
        L_0x00b2:
            X.0ts r3 = r12.A05
            X.2bU r2 = r4.A02
            long r0 = r2.A00
            java.lang.String r8 = X.AnonymousClass3TF.A02(r3, r0)
            android.text.TextPaint r0 = r12.A04
            float r3 = r0.getTextSize()
            r6 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 / r6
            android.text.TextPaint r0 = r12.A04
            float r0 = r0.getTextSize()
            r5 = 1068149419(0x3faaaaab, float:1.3333334)
            float r0 = r0 * r5
            int r0 = (int) r0
            float r1 = (float) r0
            android.text.TextPaint r0 = r12.A04
            r13.drawText(r8, r3, r1, r0)
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x00ff
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "fw score: "
            r1.append(r0)
            int r0 = r2.A06
            java.lang.String r3 = X.C36381kD.A10(r1, r0)
            android.text.TextPaint r0 = r12.A04
            float r2 = r0.getTextSize()
            float r2 = r2 / r6
            android.text.TextPaint r0 = r12.A04
            float r0 = r0.getTextSize()
            float r0 = r0 * r5
            float r0 = r0 * r9
            int r0 = (int) r0
            float r1 = (float) r0
            android.text.TextPaint r0 = r12.A04
            r13.drawText(r3, r2, r1, r0)
        L_0x00ff:
            int r0 = r12.A00
            if (r0 == r7) goto L_0x01ba
            X.2bU r5 = r4.A02
            if (r5 == 0) goto L_0x01bf
            boolean r0 = X.C65453Sc.A03(r5)
            if (r0 == 0) goto L_0x01bb
            android.graphics.drawable.Drawable r0 = r12.A01
            if (r0 != 0) goto L_0x011e
            android.content.Context r1 = r12.getContext()
            r0 = 2131233190(0x7f0809a6, float:1.808251E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r1, r0)
            r12.A01 = r0
        L_0x011e:
            int r6 = r12.getWidth()
            android.graphics.drawable.Drawable r0 = r12.A01
            int r0 = r0.getIntrinsicWidth()
            int r6 = r6 - r0
            int r3 = r12.getHeight()
            android.graphics.drawable.Drawable r0 = r12.A01
            int r0 = r0.getIntrinsicHeight()
            int r3 = r3 - r0
            int r1 = r12.getWidth()
            int r0 = r12.getHeight()
            android.graphics.drawable.Drawable r2 = r12.A01
            r2.setBounds(r6, r3, r1, r0)
            int r1 = r12.getWidth()
            int r0 = r2.getIntrinsicWidth()
            int r1 = r1 - r0
            float r0 = (float) r1
            r12.A01(r13, r4, r0)
            r2.draw(r13)
            r2 = 1
        L_0x0152:
            boolean r0 = r5.A15
            if (r0 == 0) goto L_0x01bd
            android.graphics.drawable.Drawable r0 = r12.A02
            if (r0 != 0) goto L_0x0167
            android.content.Context r1 = r12.getContext()
            r0 = 2131233201(0x7f0809b1, float:1.8082533E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r1, r0)
            r12.A02 = r0
        L_0x0167:
            int r6 = r12.getWidth()
            android.graphics.drawable.Drawable r0 = r12.A02
            int r0 = r0.getIntrinsicWidth()
            int r6 = r6 - r0
            int r5 = r12.getHeight()
            android.graphics.drawable.Drawable r0 = r12.A02
            int r0 = r0.getIntrinsicHeight()
            int r5 = r5 - r0
            int r3 = r12.getWidth()
            int r1 = r12.getHeight()
            if (r2 == 0) goto L_0x01a5
            android.graphics.drawable.Drawable r0 = r12.A01
            if (r0 == 0) goto L_0x01a5
            android.graphics.Rect r1 = r0.getBounds()
            int r6 = r1.left
            android.graphics.drawable.Drawable r0 = r12.A02
            int r0 = r0.getIntrinsicWidth()
            int r6 = r6 - r0
            int r5 = r1.bottom
            android.graphics.drawable.Drawable r0 = r12.A02
            int r0 = r0.getIntrinsicHeight()
            int r5 = r5 - r0
            int r3 = r1.left
            int r1 = r1.bottom
        L_0x01a5:
            android.graphics.drawable.Drawable r2 = r12.A02
            r2.setBounds(r6, r5, r3, r1)
            int r1 = r12.getWidth()
            int r0 = r2.getIntrinsicWidth()
            int r1 = r1 - r0
            float r0 = (float) r1
            r12.A01(r13, r4, r0)
            r2.draw(r13)
        L_0x01ba:
            return
        L_0x01bb:
            r2 = 0
            goto L_0x0152
        L_0x01bd:
            if (r2 != 0) goto L_0x01ba
        L_0x01bf:
            float r0 = X.C36441kJ.A01(r12)
            r12.A01(r13, r4, r0)
            return
        L_0x01c7:
            android.text.TextPaint r0 = r12.A04
            float r0 = r0.getTextSize()
            float r0 = r0 / r1
            goto L_0x0060
        L_0x01d0:
            android.graphics.drawable.Drawable r6 = r12.A0B
            if (r6 != 0) goto L_0x01f5
            android.content.Context r4 = r12.getContext()
            r3 = 2131233139(0x7f080973, float:1.8082407E38)
            android.graphics.drawable.Drawable r6 = X.AnonymousClass00E.A00(r4, r3)
            r12.A0B = r6
            goto L_0x01f3
        L_0x01e2:
            android.graphics.drawable.Drawable r6 = r12.A09
            if (r6 != 0) goto L_0x01f5
            android.content.Context r4 = r12.getContext()
            r3 = 2131233137(0x7f080971, float:1.8082403E38)
            android.graphics.drawable.Drawable r6 = X.AnonymousClass00E.A00(r4, r3)
            r12.A09 = r6
        L_0x01f3:
            if (r6 == 0) goto L_0x002e
        L_0x01f5:
            android.graphics.drawable.Drawable r9 = r12.A0A
            if (r9 != 0) goto L_0x0206
            android.content.Context r4 = r12.getContext()
            r3 = 2131231684(0x7f0803c4, float:1.8079456E38)
            android.graphics.drawable.Drawable r9 = X.AnonymousClass00E.A00(r4, r3)
            r12.A0A = r9
        L_0x0206:
            int r5 = r12.getHeight()
            int r3 = r6.getIntrinsicHeight()
            int r3 = r3 * 2
            int r5 = r5 - r3
            int r4 = r12.getWidth()
            int r3 = r12.getHeight()
            r9.setBounds(r0, r5, r4, r3)
            android.graphics.drawable.Drawable r0 = r12.A0A
            r0.draw(r13)
            int r0 = r6.getIntrinsicHeight()
            int r5 = r0 / 4
            int r4 = r12.getHeight()
            int r0 = r6.getIntrinsicHeight()
            int r4 = r4 - r0
            int r4 = r4 - r5
            int r3 = r6.getIntrinsicWidth()
            int r3 = r3 + r5
            int r0 = r12.getHeight()
            int r0 = r0 - r5
            r6.setBounds(r5, r4, r3, r0)
            r6.draw(r13)
            int r0 = r6.getIntrinsicWidth()
            int r0 = r0 + r5
            goto L_0x002e
        L_0x0248:
            long r1 = r2.BBF()
            goto L_0x0028
        L_0x024e:
            r5 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45942Ti.A03(android.graphics.Canvas):void");
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass4V2 r0 = this.A08;
        Canvas canvas2 = canvas;
        if (r0 != null && r0.getType() == 3) {
            if (this.A08 == null) {
                Paint A0E = C36371kC.A0E();
                A0E.setColor(-16777216);
                A0E.setAlpha(51);
                C36431kI.A1L(A0E);
                this.A08 = A0E;
            }
            canvas2.drawRect(0.0f, 0.0f, C36441kJ.A01(this), C36441kJ.A02(this), this.A08);
        }
        super.onDraw(canvas);
    }

    public C45942Ti(Context context) {
        super(context);
    }

    public void setMediaItem(AnonymousClass4V2 r3) {
        super.setMediaItem(r3);
        AnonymousClass4V2 r1 = this.A08;
        if (r1 instanceof C74833mF) {
            C011004s.A08(this, AnonymousClass3RL.A01(((C74833mF) r1).A02));
        }
    }

    public void setDetailsLevel(int i) {
        this.A00 = i;
    }

    public void setShowForwardScore(boolean z) {
        this.A07 = z;
    }
}
