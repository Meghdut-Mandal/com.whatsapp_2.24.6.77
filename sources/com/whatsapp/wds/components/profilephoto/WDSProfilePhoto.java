package com.whatsapp.wds.components.profilephoto;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass3QI;
import X.AnonymousClass5QJ;
import X.AnonymousClass5S3;
import X.AnonymousClass5TU;
import X.AnonymousClass5TY;
import X.AnonymousClass61O;
import X.AnonymousClass6E4;
import X.AnonymousClass6K4;
import X.AnonymousClass6RA;
import X.AnonymousClass6SX;
import X.AnonymousClass7OH;
import X.AnonymousClass7QW;
import X.AnonymousClass7QX;
import X.AnonymousClass7QY;
import X.AnonymousClass7i5;
import X.C007103b;
import X.C05250Oz;
import X.C108525Tv;
import X.C112005dC;
import X.C128006Am;
import X.C140336lQ;
import X.C18820ts;
import X.C27991Qq;
import X.C36321k7;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C65723Tf;
import X.C90524aI;
import X.C91174ba;
import X.C93204g7;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public final class WDSProfilePhoto extends C93204g7 implements AnonymousClass7i5 {
    public C18820ts A00;
    public C108525Tv A01;
    public AnonymousClass5TY A02;
    public AnonymousClass6K4 A03;
    public boolean A04;
    public AnonymousClass5S3 A05;
    public C112005dC A06;
    public final AnonymousClass00T A07;
    public final AnonymousClass00T A08;
    public final AnonymousClass00T A09;
    public final AnonymousClass00T A0A;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSProfilePhoto(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX WARNING: type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014e, code lost:
        if (r2 == false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x028a, code lost:
        if (1 <= r9) goto L_0x0269;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r15) {
        /*
            r14 = this;
            r6 = 0
            X.AnonymousClass00C.A0D(r15, r6)
            X.6SX r1 = r14.getProfilePhotoRenderer()
            android.widget.ImageView$ScaleType r0 = r14.getScaleType()
            X.AnonymousClass00C.A08(r0)
            r1.A01 = r0
            X.6SX r1 = r14.getProfilePhotoRenderer()
            r0 = 0
            r1.A00 = r0
            android.graphics.drawable.Drawable r1 = r14.getDrawable()
            if (r1 == 0) goto L_0x002a
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x02b5
            X.6SX r0 = r14.getProfilePhotoRenderer()
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            r0.A00 = r1
        L_0x002a:
            X.6SX r5 = r14.getProfilePhotoRenderer()
            android.graphics.RectF r4 = r5.A0E
            r4.setEmpty()
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x02ae
            android.graphics.RectF r0 = r5.A0I
            r4.set(r0)
            X.6Bm r0 = r5.A04
            float r1 = r0.A01
            r0 = 2
            float r7 = (float) r0
            float r1 = r1 / r7
            r4.inset(r1, r1)
            android.graphics.Path r9 = r5.A0B
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0066
            X.5Tv r0 = r5.A02
            int r1 = r0.ordinal()
            if (r1 == r6) goto L_0x02aa
            r0 = 1
            if (r1 != r0) goto L_0x02c4
            X.5Q8 r0 = X.AnonymousClass5Q8.A00
        L_0x005b:
            boolean r0 = r0 instanceof X.AnonymousClass5Q8
            if (r0 == 0) goto L_0x0294
            android.graphics.Path r8 = X.AnonymousClass6Y8.A06(r4)
        L_0x0063:
            r9.addPath(r8)
        L_0x0066:
            X.5dC r2 = r5.A05
            boolean r0 = r2 instanceof X.AnonymousClass5QJ
            if (r0 == 0) goto L_0x01f4
            X.00T r0 = r5.A0P
            X.C90504aG.A13(r15, r9, r0)
        L_0x0071:
            android.graphics.RectF r0 = r5.A0G
            r4.set(r0)
            X.6Bm r0 = r5.A04
            float r0 = r0.A00
            r4.inset(r0, r0)
        L_0x007d:
            android.graphics.Path r7 = r5.A0A
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x009d
            X.5Tv r0 = r5.A02
            int r1 = r0.ordinal()
            if (r1 == r6) goto L_0x01f0
            r0 = 1
            if (r1 != r0) goto L_0x02ba
            X.5Q8 r0 = X.AnonymousClass5Q8.A00
        L_0x0092:
            boolean r0 = r0 instanceof X.AnonymousClass5Q8
            if (r0 == 0) goto L_0x01d8
            android.graphics.Path r8 = X.AnonymousClass6Y8.A06(r4)
        L_0x009a:
            r7.addPath(r8)
        L_0x009d:
            android.graphics.drawable.BitmapDrawable r0 = r5.A00
            if (r0 == 0) goto L_0x0126
            android.graphics.Bitmap r8 = r0.getBitmap()
            if (r8 == 0) goto L_0x0126
            android.graphics.RectF r3 = r5.A0F
            r3.set(r4)
            int r10 = r8.getWidth()
            int r11 = r8.getHeight()
            android.graphics.Rect r4 = r5.A0C
            r4.set(r6, r6, r10, r11)
            android.widget.ImageView$ScaleType r1 = r5.A01
            int[] r0 = X.C113445fY.A00
            int r1 = X.C90524aI.A03(r1, r0)
            r0 = 1
            r9 = 2
            if (r1 == r0) goto L_0x019e
            if (r1 == r9) goto L_0x0180
            float r2 = (float) r10
            float r0 = r3.height()
            float r2 = r2 * r0
            float r1 = (float) r11
            float r0 = r3.width()
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x015e
            int r0 = r4.height()
            float r2 = (float) r0
            float r0 = r3.width()
            float r2 = r2 * r0
            float r0 = r3.height()
            float r2 = r2 / r0
            int r0 = r4.centerX()
            float r1 = (float) r0
            float r0 = (float) r9
            float r0 = r2 / r0
            float r1 = r1 - r0
            int r0 = (int) r1
            r4.left = r0
            float r0 = (float) r0
            float r0 = r0 + r2
            int r0 = (int) r0
            r4.right = r0
        L_0x00f7:
            r0 = 31
            r10 = 0
            int r9 = r15.saveLayer(r3, r10, r0)
            r15.drawARGB(r6, r6, r6, r6)
            X.00T r2 = r5.A0M
            X.C90504aG.A13(r15, r7, r2)
            java.lang.Object r1 = r2.getValue()
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            android.graphics.PorterDuffXfermode r0 = X.AnonymousClass6SX.A0Q
            r1.setXfermode(r0)
            java.lang.Object r0 = r2.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r15.drawBitmap(r8, r4, r3, r0)
            java.lang.Object r0 = r2.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setXfermode(r10)
            r15.restoreToCount(r9)
        L_0x0126:
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x012f
            X.00T r0 = r5.A0N
            X.C90504aG.A13(r15, r7, r0)
        L_0x012f:
            X.6lQ r3 = r5.A0K
            X.00T r0 = r3.A0A
            java.lang.Object r0 = r0.getValue()
            X.6E4 r0 = (X.AnonymousClass6E4) r0
            boolean r0 = r0.A02()
            r2 = r0 ^ 1
            if (r2 != 0) goto L_0x0147
            X.5S3 r1 = r3.A00
            X.5S3 r0 = X.AnonymousClass5S3.CHECKED
            if (r1 != r0) goto L_0x0150
        L_0x0147:
            X.4ba r0 = r3.A04
            if (r0 == 0) goto L_0x014e
            r0.draw(r15)
        L_0x014e:
            if (r2 != 0) goto L_0x0156
        L_0x0150:
            X.5S3 r1 = r3.A00
            X.5S3 r0 = X.AnonymousClass5S3.NONE
            if (r1 != r0) goto L_0x015d
        L_0x0156:
            X.4ba r0 = r3.A03
            if (r0 == 0) goto L_0x015d
            r0.draw(r15)
        L_0x015d:
            return
        L_0x015e:
            int r0 = r4.width()
            float r2 = (float) r0
            float r0 = r3.height()
            float r2 = r2 * r0
            float r0 = r3.width()
            float r2 = r2 / r0
            int r0 = r4.centerY()
            float r1 = (float) r0
            float r0 = (float) r9
            float r0 = r2 / r0
            float r1 = r1 - r0
            int r0 = (int) r1
            r4.top = r0
            float r0 = (float) r0
            float r0 = r0 + r2
            int r0 = (int) r0
            r4.bottom = r0
            goto L_0x00f7
        L_0x0180:
            float r2 = r3.centerX()
            float r1 = (float) r10
            r9 = 1073741824(0x40000000, float:2.0)
            float r0 = r1 / r9
            float r2 = r2 - r0
            r3.left = r2
            float r2 = r2 + r1
            r3.right = r2
            float r2 = r3.centerY()
            float r1 = (float) r11
            float r0 = r1 / r9
            float r2 = r2 - r0
            r3.top = r2
            float r2 = r2 + r1
            r3.bottom = r2
            goto L_0x00f7
        L_0x019e:
            float r10 = (float) r10
            float r2 = r3.height()
            float r2 = r2 * r10
            float r1 = (float) r11
            float r0 = r3.width()
            float r0 = r0 * r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c3
            float r2 = r3.width()
            float r2 = r2 * r1
            float r2 = r2 / r10
            float r1 = r3.centerY()
            float r0 = (float) r9
            float r0 = r2 / r0
            float r1 = r1 - r0
            r3.top = r1
            float r1 = r1 + r2
            r3.bottom = r1
            goto L_0x00f7
        L_0x01c3:
            float r2 = r3.height()
            float r2 = r2 * r10
            float r2 = r2 / r1
            float r1 = r3.centerX()
            float r0 = (float) r9
            float r0 = r2 / r0
            float r1 = r1 - r0
            r3.left = r1
            float r1 = r1 + r2
            r3.right = r1
            goto L_0x00f7
        L_0x01d8:
            android.graphics.Path r8 = X.C36441kJ.A0M()
            float r3 = r4.width()
            r0 = 2
            float r0 = (float) r0
            float r3 = r3 / r0
            float r2 = r4.left
            float r2 = r2 + r3
            float r1 = r4.top
            float r1 = r1 + r3
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r8.addCircle(r2, r1, r3, r0)
            goto L_0x009a
        L_0x01f0:
            X.5Q7 r0 = X.AnonymousClass5Q7.A00
            goto L_0x0092
        L_0x01f4:
            boolean r0 = r2 instanceof X.AnonymousClass5QK
            if (r0 == 0) goto L_0x0071
            X.5Tv r0 = r5.A02
            int r1 = r0.ordinal()
            if (r1 == r6) goto L_0x0290
            r0 = 1
            if (r1 != r0) goto L_0x02bf
            X.5Q8 r0 = X.AnonymousClass5Q8.A00
        L_0x0205:
            X.5QK r2 = (X.AnonymousClass5QK) r2
            java.util.List r10 = r2.A00
            int r9 = r10.size()
            boolean r0 = r0 instanceof X.AnonymousClass5Q8
            if (r0 == 0) goto L_0x025d
            android.graphics.Path r0 = X.AnonymousClass6Y8.A06(r4)
            java.util.List r8 = X.C36371kC.A11(r0)
        L_0x0219:
            r2 = 0
            java.util.Iterator r8 = r8.iterator()
        L_0x021e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r7 = r8.next()
            int r3 = r2 + 1
            if (r2 >= 0) goto L_0x0231
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x0231:
            android.graphics.Path r7 = (android.graphics.Path) r7
            X.00T r0 = r5.A0O
            java.util.Map r1 = X.C90514aH.A16(r0)
            java.lang.Object r0 = r10.get(r2)
            X.5TU r0 = (X.AnonymousClass5TU) r0
            int r0 = r0.statusColor
            java.lang.Object r0 = X.C36371kC.A0r(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x025b
            int r2 = r0.intValue()
            X.00T r1 = r5.A0P
            java.lang.Object r0 = r1.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setColor(r2)
            X.C90504aG.A13(r15, r7, r1)
        L_0x025b:
            r2 = r3
            goto L_0x021e
        L_0x025d:
            java.util.ArrayList r8 = X.C36341k9.A0l(r4)
            float r0 = (float) r9
            r13 = 1135869952(0x43b40000, float:360.0)
            float r13 = r13 / r0
            r3 = 1
            if (r9 != r3) goto L_0x0280
            r12 = 0
        L_0x0269:
            r11 = -1028390912(0xffffffffc2b40000, float:-90.0)
        L_0x026b:
            android.graphics.Path r2 = X.C36441kJ.A0M()
            float r1 = r12 / r7
            float r1 = r1 + r11
            float r0 = r13 - r12
            r2.addArc(r4, r1, r0)
            r8.add(r2)
            float r11 = r11 + r13
            if (r3 == r9) goto L_0x0219
            int r3 = r3 + 1
            goto L_0x026b
        L_0x0280:
            r0 = 1103101952(0x41c00000, float:24.0)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x028d
            r0 = 1073741824(0x40000000, float:2.0)
            float r12 = r13 / r0
        L_0x028a:
            if (r3 > r9) goto L_0x0219
            goto L_0x0269
        L_0x028d:
            r12 = 1094713344(0x41400000, float:12.0)
            goto L_0x028a
        L_0x0290:
            X.5Q7 r0 = X.AnonymousClass5Q7.A00
            goto L_0x0205
        L_0x0294:
            android.graphics.Path r8 = X.C36441kJ.A0M()
            float r3 = r4.width()
            float r3 = r3 / r7
            float r2 = r4.left
            float r2 = r2 + r3
            float r1 = r4.top
            float r1 = r1 + r3
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r8.addCircle(r2, r1, r3, r0)
            goto L_0x0063
        L_0x02aa:
            X.5Q7 r0 = X.AnonymousClass5Q7.A00
            goto L_0x005b
        L_0x02ae:
            android.graphics.RectF r0 = r5.A0G
            r4.set(r0)
            goto L_0x007d
        L_0x02b5:
            super.onDraw(r15)
            goto L_0x002a
        L_0x02ba:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x02bf:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x02c4:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.profilephoto.WDSProfilePhoto.onDraw(android.graphics.Canvas):void");
    }

    public final void setProfilePhotoShape(C108525Tv r4) {
        AnonymousClass00C.A0D(r4, 0);
        boolean A1W = C36371kC.A1W(r4, this.A01);
        this.A01 = r4;
        if (A1W && this.A0A.BM2()) {
            AnonymousClass6SX profilePhotoRenderer = getProfilePhotoRenderer();
            C108525Tv r1 = this.A01;
            AnonymousClass00C.A0D(r1, 0);
            profilePhotoRenderer.A02 = r1;
            profilePhotoRenderer.A0K.A01 = r1;
            requestLayout();
        }
    }

    public final void setProfilePhotoSize(AnonymousClass5TY r7) {
        C91174ba r0;
        C91174ba r02;
        AnonymousClass00C.A0D(r7, 0);
        boolean A1W = C36371kC.A1W(r7, this.A02);
        this.A02 = r7;
        if (A1W && this.A0A.BM2()) {
            AnonymousClass6SX profilePhotoRenderer = getProfilePhotoRenderer();
            AnonymousClass5TY r2 = this.A02;
            AnonymousClass00C.A0D(r2, 0);
            profilePhotoRenderer.A03 = r2;
            profilePhotoRenderer.A04 = AnonymousClass6RA.A02(r2).A00(profilePhotoRenderer.A08);
            AnonymousClass6SX.A00(profilePhotoRenderer);
            C140336lQ r4 = profilePhotoRenderer.A0K;
            boolean A1W2 = C36371kC.A1W(r4.A02, r2);
            r4.A02 = r2;
            if (A1W2) {
                Context context = r4.A07;
                r4.A05 = AnonymousClass6RA.A01(context, r2);
                if (r4.A04 != null) {
                    AnonymousClass6K4 r22 = (AnonymousClass6K4) r4.A09.getValue();
                    AnonymousClass61O r1 = r4.A05;
                    C36321k7.A0v(r22, 0, r1);
                    r0 = new C91174ba(context, r1, r22);
                } else {
                    r0 = null;
                }
                r4.A04 = r0;
                AnonymousClass6K4 r23 = r4.A06;
                if (r23 != null) {
                    AnonymousClass61O r12 = r4.A05;
                    AnonymousClass00C.A0D(r12, 2);
                    r02 = new C91174ba(context, r12, r23);
                } else {
                    r02 = null;
                }
                r4.A03 = r02;
            }
            requestLayout();
        }
    }

    public final void setProfileStatus(C112005dC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
        AnonymousClass6SX profilePhotoRenderer = getProfilePhotoRenderer();
        profilePhotoRenderer.A05 = r2;
        AnonymousClass6SX.A00(profilePhotoRenderer);
        invalidate();
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    private final RectF getDrawRectF() {
        return (RectF) this.A07.getValue();
    }

    private final AnonymousClass3QI getMarginOffsets() {
        return (AnonymousClass3QI) this.A08.getValue();
    }

    private final AnonymousClass3QI getOriginalMargins() {
        return (AnonymousClass3QI) this.A09.getValue();
    }

    private final AnonymousClass6SX getProfilePhotoRenderer() {
        return (AnonymousClass6SX) this.A0A.getValue();
    }

    public final void A00(AnonymousClass5S3 r9, boolean z) {
        double d;
        this.A05 = r9;
        AnonymousClass6SX profilePhotoRenderer = getProfilePhotoRenderer();
        AnonymousClass5S3 r6 = this.A05;
        AnonymousClass00C.A0D(r6, 0);
        C140336lQ r5 = profilePhotoRenderer.A0K;
        int ordinal = r6.ordinal();
        if (ordinal == 1) {
            C91174ba r3 = r5.A04;
            if (r3 == null) {
                AnonymousClass6K4 r2 = (AnonymousClass6K4) r5.A09.getValue();
                Context context = r5.A07;
                AnonymousClass61O r0 = r5.A05;
                C36321k7.A0v(r2, 0, r0);
                r3 = new C91174ba(context, r0, r2);
                r5.A04 = r3;
            }
            r3.A03 = true;
            d = 1.0d;
        } else if (ordinal == 0) {
            C91174ba r02 = r5.A04;
            if (r02 != null) {
                r02.A03 = false;
            }
            d = 0.0d;
        } else {
            throw C36441kJ.A18();
        }
        AnonymousClass6E4 r03 = (AnonymousClass6E4) r5.A0A.getValue();
        if (z) {
            r03.A01(d);
            return;
        }
        r03.A00(d);
        r5.A00 = r6;
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            AnonymousClass3QI originalMargins = getOriginalMargins();
            int i = marginLayoutParams.leftMargin;
            originalMargins.A01 = i;
            originalMargins.A03 = marginLayoutParams.topMargin;
            originalMargins.A02 = marginLayoutParams.rightMargin;
            originalMargins.A00 = marginLayoutParams.bottomMargin;
            marginLayoutParams.leftMargin = i + getMarginOffsets().A01;
            marginLayoutParams.topMargin += getMarginOffsets().A03;
            marginLayoutParams.rightMargin += getMarginOffsets().A02;
            marginLayoutParams.bottomMargin += getMarginOffsets().A00;
        }
        super.setLayoutParams(layoutParams);
    }

    public final void setProfileBadge(AnonymousClass6K4 r6) {
        C91174ba r0;
        boolean z = !AnonymousClass00C.A0J(r6, this.A03);
        this.A03 = r6;
        if (z && this.A0A.BM2()) {
            AnonymousClass6SX profilePhotoRenderer = getProfilePhotoRenderer();
            C140336lQ r3 = profilePhotoRenderer.A0K;
            boolean z2 = !AnonymousClass00C.A0J(r3.A06, r6);
            r3.A06 = r6;
            if (z2) {
                if (r6 != null) {
                    Context context = r3.A07;
                    AnonymousClass61O r1 = r3.A05;
                    AnonymousClass00C.A0D(r1, 2);
                    r0 = new C91174ba(context, r1, r6);
                } else {
                    r0 = null;
                }
                r3.A03 = r0;
            }
            r3.A02(profilePhotoRenderer.A0G);
            invalidate();
        }
    }

    public final void setStatusIndicatorEnabled(boolean z) {
        boolean A1U = C36381kD.A1U(z ? 1 : 0, this.A04 ? 1 : 0);
        this.A04 = z;
        if (A1U && this.A0A.BM2()) {
            getProfilePhotoRenderer().A07 = z;
            requestLayout();
        }
    }

    public final AnonymousClass6K4 getProfileBadge() {
        return this.A03;
    }

    public final AnonymousClass5S3 getProfilePhotoSelectionState() {
        return this.A05;
    }

    public final C108525Tv getProfilePhotoShape() {
        return this.A01;
    }

    public final AnonymousClass5TY getProfilePhotoSize() {
        return this.A02;
    }

    public final C112005dC getProfileStatus() {
        return this.A06;
    }

    public final boolean getStatusIndicatorEnabled() {
        return this.A04;
    }

    public void onMeasure(int i, int i2) {
        float f;
        AnonymousClass6SX profilePhotoRenderer = getProfilePhotoRenderer();
        AnonymousClass5TY r2 = profilePhotoRenderer.A03;
        Context context = profilePhotoRenderer.A08;
        PointF A002 = AnonymousClass6RA.A00(context, profilePhotoRenderer.A02, r2);
        float A003 = AnonymousClass6RA.A01(context, profilePhotoRenderer.A03).A00();
        A002.offset(A003, A003);
        float dimension = context.getResources().getDimension(profilePhotoRenderer.A03.dimension);
        C128006Am r0 = new C128006Am(dimension, dimension);
        float f2 = r0.A01;
        A002.offset(f2, r0.A00);
        float f3 = (profilePhotoRenderer.A04.A02.A01 - f2) / ((float) 2);
        A002.offset(f3, f3);
        C128006Am r3 = profilePhotoRenderer.A04.A02;
        C128006Am r02 = new C128006Am(Math.max(r3.A01, A002.x), Math.max(r3.A00, A002.y));
        float f4 = r02.A00;
        int i3 = (int) f4;
        float f5 = r02.A01;
        int i4 = (int) f5;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        setMeasuredDimension(i4, i3);
        getDrawRectF().set(0.0f, 0.0f, f5, f4);
        AnonymousClass6SX profilePhotoRenderer2 = getProfilePhotoRenderer();
        RectF drawRectF = getDrawRectF();
        AnonymousClass00C.A0D(drawRectF, 0);
        RectF rectF = profilePhotoRenderer2.A0D;
        rectF.set(drawRectF);
        RectF rectF2 = profilePhotoRenderer2.A0I;
        float f6 = rectF.top;
        rectF2.top = f6;
        rectF2.bottom = f6 + profilePhotoRenderer2.A04.A02.A00;
        if (C36401kF.A1X(profilePhotoRenderer2.A0J)) {
            f = rectF.right - profilePhotoRenderer2.A04.A02.A01;
        } else {
            f = rectF.left;
        }
        rectF2.left = f;
        rectF2.right = f + profilePhotoRenderer2.A04.A02.A01;
        RectF rectF3 = profilePhotoRenderer2.A0G;
        rectF3.set(rectF2);
        float f7 = profilePhotoRenderer2.A04.A01;
        rectF3.inset(f7, f7);
        RectF rectF4 = profilePhotoRenderer2.A0H;
        rectF4.set(rectF3);
        if (profilePhotoRenderer2.A07) {
            float f8 = profilePhotoRenderer2.A04.A00;
            rectF4.inset(f8, f8);
        }
        profilePhotoRenderer2.A0K.A02(rectF3);
        profilePhotoRenderer2.A0A.reset();
        profilePhotoRenderer2.A09.reset();
        profilePhotoRenderer2.A0B.reset();
        AnonymousClass6SX.A00(profilePhotoRenderer2);
        setBackgroundDrawable((Drawable) getProfilePhotoRenderer().A0L.getValue());
        RectF rectF5 = getProfilePhotoRenderer().A0G;
        AnonymousClass3QI marginOffsets = getMarginOffsets();
        marginOffsets.A01 = (int) (getDrawRectF().left - rectF5.left);
        marginOffsets.A03 = (int) (getDrawRectF().top - rectF5.top);
        marginOffsets.A02 = (int) (rectF5.right - getDrawRectF().right);
        marginOffsets.A00 = (int) (rectF5.bottom - getDrawRectF().bottom);
        RectF rectF6 = getProfilePhotoRenderer().A0H;
        setPadding((int) (rectF6.left - getDrawRectF().left), (int) (rectF6.top - getDrawRectF().top), (int) (getDrawRectF().right - rectF6.right), (int) (getDrawRectF().bottom - rectF6.bottom));
        C65723Tf.A02(this, getOriginalMargins());
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        AnonymousClass6SX profilePhotoRenderer = getProfilePhotoRenderer();
        profilePhotoRenderer.A06 = z;
        if (z) {
            C36381kD.A16(profilePhotoRenderer.A08, (Paint) profilePhotoRenderer.A0N.getValue(), R.color.f6nameremoved);
        }
    }

    public /* synthetic */ WDSProfilePhoto(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSProfilePhoto(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        this.A07 = C36431kI.A1I(AnonymousClass7QW.A00);
        this.A09 = C36431kI.A1I(AnonymousClass7QY.A00);
        this.A08 = C36431kI.A1I(AnonymousClass7QX.A00);
        this.A0A = C36431kI.A1I(new AnonymousClass7OH(context, this));
        this.A05 = AnonymousClass5S3.NONE;
        AnonymousClass5TY r3 = AnonymousClass5TY.MEDIUM;
        this.A02 = r3;
        C108525Tv r7 = C108525Tv.CIRCLE;
        this.A01 = r7;
        this.A06 = new AnonymousClass5QJ(AnonymousClass5TU.UNSEEN);
        if (attributeSet != null) {
            int[] iArr = C27991Qq.A0B;
            AnonymousClass00C.A09(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int i = obtainStyledAttributes.getInt(2, 2);
            AnonymousClass5TY[] values = AnonymousClass5TY.values();
            if (i >= 0) {
                AnonymousClass00C.A0D(values, 0);
                if (i <= values.length - 1) {
                    r3 = values[i];
                }
            }
            setProfilePhotoSize(r3);
            int i2 = obtainStyledAttributes.getInt(1, -1);
            C108525Tv[] values2 = C108525Tv.values();
            if (i2 >= 0) {
                AnonymousClass00C.A0D(values2, 0);
                if (i2 <= values2.length - 1) {
                    r7 = values2[i2];
                }
            }
            setProfilePhotoShape(r7);
            setStatusIndicatorEnabled(obtainStyledAttributes.getBoolean(3, false));
            setProfileBadge((AnonymousClass6K4) C007103b.A0P(C90524aI.A0q(AnonymousClass6K4.A02), obtainStyledAttributes.getInt(0, -1)));
            obtainStyledAttributes.recycle();
        }
        setCropToPadding(true);
    }
}
