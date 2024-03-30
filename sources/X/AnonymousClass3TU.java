package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.3TU  reason: invalid class name */
public class AnonymousClass3TU {
    public int A00;
    public int A01;
    public AnonymousClass2KY A02;
    public boolean A03;
    public final Context A04;
    public final C32691e2 A05;
    public final AnonymousClass2IR A06;
    public final C89014Ux A07;
    public final C20810yC A08;
    public final AnonymousClass1SV A09;
    public final WebPagePreviewView A0A;
    public final C609039u A0B;
    public final C32731e6 A0C;
    public final AnonymousClass1EM A0D;

    public static float A00(AnonymousClass3T1 r2, C65243Rh r3) {
        if (r3.A01 != 4) {
            new BitmapFactory.Options().inJustDecodeBounds = true;
            AnonymousClass3L1 r1 = r2.A0a;
            if (r1 != null) {
                float f = ((float) r1.A00) / ((float) r1.A01);
                if (f < 1.0f) {
                    return Math.max(f, 0.5625f);
                }
                return Math.min(f, 1.0f);
            }
        }
        return 0.5625f;
    }

    private int A01(AnonymousClass3T1 r4) {
        int A012;
        C89014Ux r2 = this.A07;
        boolean BLu = r2.BLu(r4);
        Context context = this.A04;
        if (BLu) {
            A012 = r2.BAA(context, this.A06.A09.A01());
        } else {
            A012 = AnonymousClass3R4.A01(context, 72);
        }
        return (A012 - this.A00) - this.A01;
    }

    private C79293tU A02(AnonymousClass3T1 r8, C65243Rh r9, Bitmap[] bitmapArr) {
        WebPagePreviewView webPagePreviewView = this.A0A;
        webPagePreviewView.setLargeThumbSizeWidthMatchParent(this.A03);
        int A012 = A01(r8);
        int A002 = (int) (((float) A012) * A00(r8, r9));
        if (this.A03) {
            webPagePreviewView.setVideoLargeThumbFrameHeight(A002);
        } else {
            webPagePreviewView.setImageLargeThumbFrameHeight(A002);
        }
        return new C79293tU(this.A04, webPagePreviewView, bitmapArr, A012, this.A03);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.2iI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: X.3YT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: X.3YT} */
    /* JADX WARNING: type inference failed for: r3v9, types: [X.3tW] */
    /* JADX WARNING: type inference failed for: r3v10, types: [X.3tU] */
    /* JADX WARNING: type inference failed for: r1v12, types: [android.view.View$OnClickListener] */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0125, code lost:
        if (r3.A0E(2060) == false) goto L_0x0127;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.AnonymousClass2IR r15, X.AnonymousClass3TU r16, X.AnonymousClass3T1 r17, X.C88974Ut r18, X.C65243Rh r19, boolean r20, boolean r21, boolean r22) {
        /*
            r11 = r16
            X.1e6 r2 = r11.A0C
            r13 = r19
            java.lang.String r1 = r13.A03
            r12 = r17
            com.whatsapp.jid.UserJid r0 = r12.A0L()
            java.util.Set r17 = r2.BFr(r0, r12, r1)
            if (r17 == 0) goto L_0x0058
            com.whatsapp.webpagepreview.WebPagePreviewView r6 = r11.A0A
            r6.A0G()
            X.1p4 r2 = r15.A0B
            if (r2 == 0) goto L_0x002a
            java.lang.Integer r1 = X.C023109s.A0C
            java.lang.Integer r0 = r2.A00
            if (r1 != r0) goto L_0x002a
            android.widget.ImageView r1 = r2.A01
            r0 = 8
            r1.setVisibility(r0)
        L_0x002a:
            r19 = 2
            X.3YT r1 = new X.3YT
            r14 = r1
            r15 = r11
            r16 = r13
            r18 = r12
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x0037:
            r6.setOnClickListener(r1)
        L_0x003a:
            r0 = 2131431195(0x7f0b0f1b, float:1.8484112E38)
            android.view.View r2 = r6.findViewById(r0)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            X.3Qa r0 = r12.A1J
            boolean r1 = r0.A02
            android.content.Context r0 = r11.A04
            if (r1 == 0) goto L_0x0053
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3SN.A02(r0)
        L_0x004f:
            r2.setForeground(r0)
            return
        L_0x0053:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3SN.A00(r0)
            goto L_0x004f
        L_0x0058:
            r3 = r21
            if (r20 == 0) goto L_0x014c
            com.whatsapp.webpagepreview.WebPagePreviewView r6 = r11.A0A
            r6.A0H()
            java.lang.Boolean r0 = X.C18750th.A03
            android.widget.ProgressBar r0 = r6.A09
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.view.View r0 = r6.A00
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.view.View r0 = r6.A01
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.widget.ProgressBar r0 = r6.A09
            r2 = 0
            r0.setAlpha(r2)
            android.view.View r1 = r6.A00
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            android.view.View r0 = r6.A01
            r0.setAlpha(r2)
            android.view.View r0 = r6.A02
            r0.setAlpha(r2)
            android.widget.ImageView r0 = r6.A06
            r0.setAlpha(r2)
            r6.A0H()
            int r0 = r13.A01
            r6.setVideoLargeLogo(r0)
            r0 = 1
            X.3DS r14 = new X.3DS
            r14.<init>(r12, r6)
            r4 = r18
            X.3Qa r2 = r4.BAa()
            if (r2 == 0) goto L_0x00cd
            X.3Qa r1 = r12.A1J
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00cd
            r4.Bqy(r14)
            int r5 = r4.BAZ()
            r4 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            if (r5 == r0) goto L_0x013d
            r1 = 2
            if (r5 == r1) goto L_0x0136
            r1 = 3
            if (r5 != r1) goto L_0x00cd
            r6.A0I(r2, r4, r2, r2)
        L_0x00cd:
            android.graphics.Bitmap[] r7 = new android.graphics.Bitmap[r0]
            r16 = 2
            X.2iC r10 = new X.2iC
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r6.setOnClickListener(r10)
            X.1SV r1 = r11.A09
            boolean r2 = X.C63783Lk.A01(r12, r1, r3)
            if (r2 == 0) goto L_0x0109
            X.4Ux r2 = r11.A07
            boolean r2 = r2.BLu(r12)
            if (r2 == 0) goto L_0x00f9
            X.3tU r3 = r11.A02(r12, r13, r7)
        L_0x00ee:
            X.3BG r2 = r12.A0V
            if (r2 == 0) goto L_0x0141
            android.widget.ImageView r2 = r6.A07
            r1.A0F(r2, r12, r3, r0)
            goto L_0x003a
        L_0x00f9:
            android.content.Context r4 = r11.A04
            boolean r10 = r11.A03
            int r8 = r11.A01
            int r9 = r11.A00
            X.2KY r5 = r11.A02
            X.3tW r3 = new X.3tW
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x00ee
        L_0x0109:
            int r5 = r11.A01(r12)
            float r3 = A00(r12, r13)
            float r2 = (float) r5
            float r2 = r2 * r3
            int r2 = (int) r2
            r6.setVideoLargeThumbFrameHeight(r2)
            android.content.Context r4 = r11.A04
            X.0yC r3 = r11.A08
            if (r3 == 0) goto L_0x0127
            r2 = 2060(0x80c, float:2.887E-42)
            boolean r2 = r3.A0E(r2)
            r18 = 1
            if (r2 != 0) goto L_0x0129
        L_0x0127:
            r18 = 0
        L_0x0129:
            X.3tV r3 = new X.3tV
            r13 = r3
            r14 = r4
            r15 = r6
            r16 = r7
            r17 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x00ee
        L_0x0136:
            r1 = 1059816735(0x3f2b851f, float:0.67)
            r6.A0I(r2, r4, r4, r1)
            goto L_0x00cd
        L_0x013d:
            r6.A0I(r4, r2, r2, r2)
            goto L_0x00cd
        L_0x0141:
            boolean r0 = r12 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x003a
            android.widget.ImageView r0 = r6.A07
            r1.A0C(r0, r12, r3)
            goto L_0x003a
        L_0x014c:
            X.1SV r2 = r11.A09
            boolean r0 = X.C63783Lk.A01(r12, r2, r3)
            com.whatsapp.webpagepreview.WebPagePreviewView r6 = r11.A0A
            if (r0 == 0) goto L_0x01b0
            r6.A0E()
            r4 = 0
            if (r22 == 0) goto L_0x01ae
            int r0 = r13.A00
        L_0x015e:
            r6.setImageLargeLogo(r0)
            X.4Ux r0 = r11.A07
            boolean r0 = r0.BLu(r12)
            r3 = 1
            if (r0 == 0) goto L_0x017e
            android.graphics.Bitmap[] r0 = new android.graphics.Bitmap[r3]
            X.3tU r3 = r11.A02(r12, r13, r0)
        L_0x0170:
            com.whatsapp.components.button.ThumbnailButton r0 = r6.A0G
            r2.A0C(r0, r12, r3)
        L_0x0175:
            r0 = 16
            X.2iI r1 = new X.2iI
            r1.<init>(r13, r11, r12, r0)
            goto L_0x0037
        L_0x017e:
            X.3BG r0 = r12.A0V
            if (r0 != 0) goto L_0x01a2
            android.widget.FrameLayout r0 = r6.A04
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = -2
            r1.width = r0
            android.widget.FrameLayout r0 = r6.A04
            r0.requestLayout()
            android.graphics.Bitmap[] r7 = new android.graphics.Bitmap[r3]
            android.content.Context r4 = r11.A04
            boolean r10 = r11.A03
            int r8 = r11.A01
            int r9 = r11.A00
            X.2KY r5 = r11.A02
            X.3tW r3 = new X.3tW
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0170
        L_0x01a2:
            android.graphics.Bitmap[] r0 = new android.graphics.Bitmap[r3]
            X.3tU r1 = r11.A02(r12, r13, r0)
            com.whatsapp.components.button.ThumbnailButton r0 = r6.A0G
            r2.A0F(r0, r12, r1, r4)
            goto L_0x0175
        L_0x01ae:
            r0 = 0
            goto L_0x015e
        L_0x01b0:
            r6.A0G()
            goto L_0x0175
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TU.A03(X.2IR, X.3TU, X.3T1, X.4Ut, X.3Rh, boolean, boolean, boolean):void");
    }

    public void A04(AnonymousClass3T1 r23, C88974Ut r24, C65243Rh r25, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass2KY r1;
        ArrayList searchTerms;
        ArrayList searchTerms2;
        int A002 = AnonymousClass3R4.A00(this.A04);
        boolean z5 = z;
        this.A03 = z5;
        if (z4) {
            r1 = new AnonymousClass2KX(A002);
        } else {
            r1 = new AnonymousClass2KY(A002);
        }
        this.A02 = r1;
        AnonymousClass2IR r5 = this.A06;
        AnonymousClass3T1 r10 = r23;
        C88974Ut r17 = r24;
        C65243Rh r3 = r25;
        boolean z6 = z2;
        boolean z7 = z3;
        AnonymousClass3T1 r16 = r10;
        C65243Rh r18 = r3;
        boolean z8 = z5;
        boolean z9 = z6;
        A03(r5, this, r16, r17, r18, z8, z9, z7);
        if (AnonymousClass000.A1S(r10.A0A & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)) {
            C609039u r7 = this.A0B;
            C20810yC r9 = this.A08;
            WebPagePreviewView webPagePreviewView = this.A0A;
            C89004Uw r12 = r5.A0c;
            if (r12 == null) {
                searchTerms2 = null;
            } else {
                searchTerms2 = r12.getSearchTerms();
            }
            AnonymousClass3AD r14 = new AnonymousClass3AD(this, r16, r17, r18, z8, z9, z7);
            boolean A012 = this.A0D.A01();
            AnonymousClass3BG r32 = r10.A0V;
            if (r32 != null) {
                AnonymousClass28U r6 = new AnonymousClass28U(r7.A01, r7.A03, r32);
                r6.A01 = z5;
                webPagePreviewView.setTag(new C62323Fs(r6, r10));
                webPagePreviewView.A0M(r6, searchTerms2, z6, A012);
                if (r32.A09 != null && r32.A00 == null) {
                    Set set = r7.A05;
                    String str = r10.A1J.A01;
                    if (!set.contains(str)) {
                        set.add(str);
                        r7.A04.Boz(new C80833w2(r6, r7, r14, r9, r10, webPagePreviewView, searchTerms2, z6, A012), str);
                    }
                }
            }
        } else if (r10 instanceof AnonymousClass2bV) {
            WebPagePreviewView webPagePreviewView2 = this.A0A;
            AnonymousClass2bV r13 = (AnonymousClass2bV) r10;
            C89004Uw r2 = r5.A0c;
            if (r2 == null) {
                searchTerms = null;
            } else {
                searchTerms = r2.getSearchTerms();
            }
            boolean A013 = C63783Lk.A01(r10, this.A09, z6);
            boolean A014 = this.A0D.A01();
            String str2 = r3.A02;
            String str3 = r3.A03;
            Set BFr = webPagePreviewView2.A0K.BFr(r13.A0L(), r13, str3);
            String str4 = r13.A05;
            String str5 = r13.A04;
            byte[] A1c = r13.A1c();
            WebPagePreviewView.A0B(webPagePreviewView2, Integer.valueOf(r13.A00), str4, str5, str2, str3, searchTerms, A1c, -1, r13.A01, AnonymousClass000.A1V(BFr), A013, z5, false, false, A014);
        }
    }

    public AnonymousClass3TU(Context context, C32691e2 r4, C609039u r5, AnonymousClass2IR r6, C89014Ux r7, C32731e6 r8, C20810yC r9, AnonymousClass1EM r10, AnonymousClass1SV r11) {
        this.A08 = r9;
        this.A04 = context;
        this.A07 = r7;
        this.A05 = r4;
        this.A06 = r6;
        this.A0D = r10;
        this.A0C = r8;
        this.A09 = r11;
        this.A0A = new WebPagePreviewView(context);
        this.A0B = r5;
        this.A02 = new AnonymousClass2KY(AnonymousClass3R4.A00(context));
    }
}
