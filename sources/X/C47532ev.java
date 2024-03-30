package X;

import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2ev  reason: invalid class name and case insensitive filesystem */
public final class C47532ev extends AnonymousClass3LJ implements C88574Tf {
    public DisplayMetrics A00;
    public View A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public final int A05 = A0B().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    public final View A06;
    public final TextEmojiLabel A07;
    public final C32731e6 A08;
    public final AnonymousClass1DW A09;
    public final C20810yC A0A;
    public final AnonymousClass1DU A0B;
    public final AnonymousClass2bV A0C;
    public final C63413Jy A0D;
    public final C38401ok A0E;
    public final AnonymousClass1EM A0F;
    public final AnonymousClass1SV A0G;

    public final boolean A0K(float f, float f2, boolean z) {
        Spanned spanned;
        CharSequence text = this.A07.getText();
        if (text instanceof Spanned) {
            spanned = (Spanned) text;
        } else {
            spanned = null;
        }
        if (spanned != null) {
            C68793cT[] r6 = (C68793cT[]) spanned.getSpans(0, spanned.length(), C68793cT.class);
            AnonymousClass00C.A0B(r6);
            for (C68793cT r3 : r6) {
                Iterator it = r3.A05.iterator();
                while (it.hasNext()) {
                    if (((RectF) it.next()).contains(f, f2)) {
                        if (z) {
                            String str = r3.A04;
                            String A002 = C55812vE.A00(str);
                            C32731e6 r32 = this.A08;
                            AnonymousClass2bV r1 = this.A0C;
                            Set BFr = r32.BFr(r1.A0J(), r1, str);
                            this.A02 = 1;
                            A0D();
                            Context A0B2 = A0B();
                            String str2 = r1.A1J.A01;
                            AnonymousClass00C.A07(str2);
                            C24791Du r7 = this.A00;
                            boolean A0O = AnonymousClass099.A0O(A002, "…", false);
                            boolean z2 = true;
                            if (this.A09.A0C(Uri.parse(str)) == 1) {
                                z2 = false;
                            }
                            AnonymousClass3MP.A00(A0B2, r7, this, str, str2, BFr, A0O, z2);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47532ev(AnonymousClass17Y r10, C32691e2 r11, C21060yb r12, C18820ts r13, C32731e6 r14, AnonymousClass1DW r15, C20810yC r16, AnonymousClass1DU r17, AnonymousClass1SU r18, AnonymousClass3T1 r19, AnonymousClass3G7 r20, AnonymousClass1EM r21, AnonymousClass1SV r22) {
        super(r11, r10, r12, r13, r18, r20);
        AnonymousClass3T1 r1 = r19;
        this.A0A = r16;
        this.A0B = r17;
        this.A0F = r21;
        this.A08 = r14;
        this.A0G = r22;
        this.A09 = r15;
        C18740tg.A06(r1);
        AnonymousClass2bV r110 = (AnonymousClass2bV) r1;
        this.A0C = r110;
        C38401ok A002 = C55452ue.A00(A0B(), r14, r110);
        this.A0E = A002;
        View A0L = C36411kG.A0L(A002);
        AnonymousClass00C.A08(A0L);
        this.A06 = A0L;
        this.A07 = C36361kB.A0R(A002, R.id.message_text);
        this.A0D = A002.getStaticContentPlayer();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a4, code lost:
        if (r1 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.graphics.Bitmap r5, android.view.View r6, android.view.View r7, X.C47532ev r8, com.whatsapp.webpagepreview.WebPagePreviewView r9, int r10, int r11, int r12, boolean r13) {
        /*
            android.view.View r0 = r8.A01
            if (r0 == 0) goto L_0x00b9
            if (r5 == 0) goto L_0x0087
            int r0 = r8.A05
            float r1 = (float) r0
            android.util.DisplayMetrics r0 = r8.A00
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "displayMetrics"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0014:
            float r0 = r0.density
            float r1 = r1 / r0
            int r0 = (int) r1
            if (r10 < r0) goto L_0x0087
            android.content.Context r0 = r8.A0B()     // Catch:{ OutOfMemoryError -> 0x0099 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ OutOfMemoryError -> 0x0099 }
            r0 = 2131168456(0x7f070cc8, float:1.7951214E38)
            r4 = 2131168456(0x7f070cc8, float:1.7951214E38)
            int r2 = r1.getDimensionPixelSize(r0)     // Catch:{ OutOfMemoryError -> 0x0099 }
            r0 = 2131428555(0x7f0b04cb, float:1.8478758E38)
            X.C36381kD.A18(r9, r0)     // Catch:{ OutOfMemoryError -> 0x0099 }
            r1 = 1068708659(0x3fb33333, float:1.4)
            float r0 = (float) r10     // Catch:{ OutOfMemoryError -> 0x0099 }
            float r0 = r0 * r1
            int r3 = (int) r0     // Catch:{ OutOfMemoryError -> 0x0099 }
            int r11 = r11 * r2
            int r11 = r11 / r10
            android.view.View r0 = r8.A06     // Catch:{ OutOfMemoryError -> 0x0099 }
            int r1 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x0099 }
            com.whatsapp.TextEmojiLabel r0 = r8.A07     // Catch:{ OutOfMemoryError -> 0x0099 }
            int r0 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x0099 }
            int r1 = r1 - r0
            int r1 = r1 - r12
            int r0 = java.lang.Math.min(r11, r1)     // Catch:{ OutOfMemoryError -> 0x0099 }
            int r3 = java.lang.Math.min(r3, r0)     // Catch:{ OutOfMemoryError -> 0x0099 }
            int r12 = r12 + r3
            r0 = 0
            r9.setImagePlayFrameVisibility(r0)     // Catch:{ OutOfMemoryError -> 0x0099 }
            r9.setImageProgressBarVisibility(r0)     // Catch:{ OutOfMemoryError -> 0x0099 }
            android.view.View r0 = r8.A01     // Catch:{ OutOfMemoryError -> 0x0099 }
            if (r0 == 0) goto L_0x0075
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()     // Catch:{ OutOfMemoryError -> 0x0099 }
            if (r1 == 0) goto L_0x0075
            android.content.Context r0 = r8.A0B()     // Catch:{ OutOfMemoryError -> 0x0099 }
            int r0 = X.C36361kB.A02(r0, r4)     // Catch:{ OutOfMemoryError -> 0x0099 }
            r1.width = r0     // Catch:{ OutOfMemoryError -> 0x0099 }
            r1.height = r12     // Catch:{ OutOfMemoryError -> 0x0099 }
            android.view.View r0 = r8.A01     // Catch:{ OutOfMemoryError -> 0x0099 }
            if (r0 == 0) goto L_0x0075
            r0.setLayoutParams(r1)     // Catch:{ OutOfMemoryError -> 0x0099 }
        L_0x0075:
            r0 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r5, r2, r11, r0)     // Catch:{ OutOfMemoryError -> 0x0099 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ OutOfMemoryError -> 0x0099 }
            r9.A0E()     // Catch:{ OutOfMemoryError -> 0x0099 }
            r9.A0J(r2, r3)     // Catch:{ OutOfMemoryError -> 0x0099 }
            r9.setImageLargeThumbWithBitmap(r0)     // Catch:{ OutOfMemoryError -> 0x0099 }
            goto L_0x00ad
        L_0x0087:
            java.lang.String r1 = r8.A04
            if (r1 == 0) goto L_0x0090
            X.2bV r0 = r8.A0C
            r9.A0N(r0, r1)
        L_0x0090:
            android.view.View r1 = r8.A01
            if (r1 != 0) goto L_0x00a6
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()
            throw r0
        L_0x0099:
            java.lang.String r1 = r8.A04
            if (r1 == 0) goto L_0x00a2
            X.2bV r0 = r8.A0C
            r9.A0N(r0, r1)
        L_0x00a2:
            android.view.View r1 = r8.A01
            if (r1 == 0) goto L_0x00ad
        L_0x00a6:
            android.content.Context r0 = r8.A0B()
            X.AnonymousClass3UN.A08(r0, r1)
        L_0x00ad:
            android.view.View r0 = r8.A01
            if (r0 == 0) goto L_0x00b4
            r0.requestLayout()
        L_0x00b4:
            com.whatsapp.TextEmojiLabel r0 = r8.A07
            r0.requestLayout()
        L_0x00b9:
            r0 = 4
            X.2i5 r2 = new X.2i5
            r2.<init>(r0, r8, r13)
            r7.setOnClickListener(r2)
            r1 = 7
            X.2rs r0 = new X.2rs
            r0.<init>(r7, r8, r1)
            r7.setOnTouchListener(r0)
            r6.setOnClickListener(r2)
            r0 = 11
            X.C89564Xa.A00(r6, r8, r0)
            java.lang.String r0 = r8.A04
            if (r0 == 0) goto L_0x00f7
            r2 = 10000(0x2710, double:4.9407E-320)
            int r1 = r0.length()
            r0 = 89
            if (r1 < r0) goto L_0x0102
            java.lang.Integer r0 = X.C36361kB.A0i()
        L_0x00e5:
            long r6 = X.C36431kI.A09(r0)
            r4 = 4500(0x1194, double:2.2233E-320)
            r0 = 3000(0xbb8, double:1.482E-320)
            long r6 = r6 * r0
            long r6 = r6 + r4
            long r1 = java.lang.Math.max(r2, r6)
            X.3Jy r0 = r8.A0D
            r0.A00 = r1
        L_0x00f7:
            X.3Jy r0 = r8.A0D
            r0.A01()
            X.3G7 r0 = r8.A05
            r0.A01()
            return
        L_0x0102:
            int r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x00e5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47532ev.A00(android.graphics.Bitmap, android.view.View, android.view.View, X.2ev, com.whatsapp.webpagepreview.WebPagePreviewView, int, int, int, boolean):void");
    }

    public long A0A() {
        return this.A0D.A00;
    }

    public void A0G() {
        C63413Jy r2 = this.A0D;
        r2.A01 = 0;
        r2.A02 = SystemClock.elapsedRealtime();
        A01(this);
    }

    public void A0H() {
        this.A0D.A02();
    }

    public static final void A01(C47532ev r7) {
        DisplayMetrics A0X = AnonymousClass000.A0X(r7.A0B());
        AnonymousClass00C.A08(A0X);
        r7.A00 = A0X;
        TextEmojiLabel textEmojiLabel = r7.A07;
        boolean z = false;
        if (textEmojiLabel.getText().length() <= 350) {
            z = true;
        }
        CharSequence text = textEmojiLabel.getText();
        if (text instanceof Spanned) {
            C68793cT[] r2 = (C68793cT[]) ((Spanned) text).getSpans(0, text.length(), C68793cT.class);
            AnonymousClass00C.A0B(r2);
            int length = r2.length;
            if (length != 0) {
                r7.A03 = 1;
                r7.A02 = C36371kC.A0n();
            }
            if (C66013Ui.A0q(r7.A0C) && z && length > 0) {
                textEmojiLabel.addOnLayoutChangeListener(new AnonymousClass4YA(r7, r2, 3));
                textEmojiLabel.requestLayout();
                return;
            }
        }
        r7.A0D.A01();
        r7.A05.A01();
    }

    public void BTk() {
        this.A02 = C36361kB.A0j();
    }

    public void BVf() {
        A0E();
    }
}
