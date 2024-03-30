package com.whatsapp.crop;

import X.AnonymousClass000;
import X.AnonymousClass17Y;
import X.AnonymousClass1GX;
import X.AnonymousClass1H2;
import X.AnonymousClass1HA;
import X.AnonymousClass1MP;
import X.AnonymousClass3Qg;
import X.AnonymousClass6YG;
import X.C1032954s;
import X.C18800tq;
import X.C20060wx;
import X.C21060yb;
import X.C224914p;
import X.C32691e2;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36431kI;
import X.C80403vL;
import X.C81113wU;
import X.C89334Wd;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class CropImage extends C224914p {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public Bitmap.CompressFormat A0A;
    public Bitmap A0B;
    public Matrix A0C;
    public Matrix A0D;
    public Rect A0E;
    public Uri A0F;
    public AnonymousClass17Y A0G;
    public C32691e2 A0H;
    public C21060yb A0I;
    public AnonymousClass1MP A0J;
    public C20060wx A0K;
    public CropImageView A0L;
    public AnonymousClass3Qg A0M;
    public C1032954s A0N;
    public AnonymousClass1H2 A0O;
    public AnonymousClass1HA A0P;
    public AnonymousClass1GX A0Q;
    public String A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;

    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        String A10;
        String string;
        boolean z = true;
        requestWindowFeature(1);
        super.onCreate(bundle);
        C81113wU.A01(this.A04, this.A0J);
        getWindow().addFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        setContentView((int) R.layout.f9nameremoved);
        C21060yb r3 = this.A0I;
        AnonymousClass6YG.A00(findViewById(R.id.root_view), getWindow(), r3);
        this.A0L = (CropImageView) findViewById(R.id.image);
        Intent intent = getIntent();
        if (intent != null) {
            bundle2 = intent.getExtras();
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            if (bundle2.getString("circleCrop") != null) {
                this.A0S = true;
                this.A00 = 1;
                this.A01 = 1;
            }
            Uri uri = (Uri) bundle2.getParcelable("output");
            this.A0F = uri;
            if (!(uri == null || (string = bundle2.getString("outputFormat")) == null)) {
                this.A0A = Bitmap.CompressFormat.valueOf(string);
            }
            this.A00 = bundle2.getInt("aspectX");
            this.A01 = bundle2.getInt("aspectY");
            this.A06 = bundle2.getInt("outputX");
            this.A07 = bundle2.getInt("outputY");
            this.A05 = bundle2.getInt("minCrop");
            this.A03 = bundle2.getInt("maxCrop");
            this.A0E = (Rect) bundle2.getParcelable("initialRect");
            this.A0T = bundle2.getBoolean("cropByOutputSize", true);
            this.A0X = bundle2.getBoolean("scale", true);
            this.A0Y = bundle2.getBoolean("scaleUpIfNeeded", true);
            this.A04 = bundle2.getInt("maxFileSize");
            this.A0U = bundle2.getBoolean("flattenRotation", true);
            this.A0R = bundle2.getString("webImageSource");
            this.A0V = bundle2.getBoolean("rotateAspect", false);
        } else {
            Log.i("crop/oncreate/no-extras");
        }
        if (bundle != null) {
            this.A08 = bundle.getInt("rotate");
            this.A0E = (Rect) bundle.getParcelable("initialRect");
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("crop/oncreate/ bitmap:");
        if (this.A0B != null) {
            z = false;
        }
        A0u.append(z);
        A0u.append(" aspectX:");
        A0u.append(this.A00);
        A0u.append(" aspectY:");
        A0u.append(this.A01);
        A0u.append(" outputX:");
        A0u.append(this.A06);
        A0u.append(" outputY:");
        A0u.append(this.A07);
        A0u.append(" minCrop:");
        A0u.append(this.A05);
        A0u.append(" maxCrop:");
        A0u.append(this.A03);
        A0u.append(" cropByOutputSize:");
        A0u.append(this.A0T);
        A0u.append(" initialRect:");
        Rect rect = this.A0E;
        if (rect == null) {
            A10 = "null";
        } else {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append(rect.left);
            A0u2.append(",");
            A0u2.append(rect.top);
            A0u2.append(",");
            A0u2.append(rect.right);
            A0u2.append(",");
            A10 = C36381kD.A10(A0u2, rect.bottom);
        }
        A0u.append(A10);
        A0u.append(" scale:");
        A0u.append(this.A0X);
        A0u.append(" scaleUp:");
        A0u.append(this.A0Y);
        A0u.append(" flattenRotation:");
        C36331k8.A1S(A0u, this.A0U);
        if (intent != null) {
            Point point = new Point();
            C36321k7.A0K(this, point);
            C80403vL.A01(this.A04, this, intent, point, 27);
            return;
        }
        finish();
    }

    public static Intent A01() {
        Log.e("profileinfo/activityres/fail/load-image");
        return C36431kI.A0D().putExtra("io-error", true).putExtra("error_message_id", R.string.f12nameremoved);
    }

    public static void A07(Rect rect, CropImage cropImage) {
        int i = rect.left;
        int i2 = cropImage.A09;
        rect.left = i * i2;
        rect.right *= i2;
        rect.top *= i2;
        rect.bottom *= i2;
    }

    public void A2F() {
        if (!this.A0Z) {
            this.A0Z = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            this.A04 = C36341k9.A0Z(A0B2);
            this.A0G = C36351kA.A0M(A0B2);
            this.A0O = C36351kA.A0e(A0B2);
            this.A0H = C36371kC.A0R(A0B2);
            this.A0K = (C20060wx) A0B2.A8B.get();
            this.A0N = (C1032954s) A0B2.A00.A8H.get();
            this.A0Q = (AnonymousClass1GX) A0B2.A4k.get();
            this.A0I = C36351kA.A0U(A0B2);
            this.A0J = (AnonymousClass1MP) A0B2.A8X.get();
            this.A0P = (AnonymousClass1HA) A0B2.A84.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003b, code lost:
        if (r11.A01 == 0) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A2j(X.AnonymousClass3PL r17) {
        /*
            r16 = this;
            r11 = r16
            com.whatsapp.crop.CropImageView r0 = r11.A0L
            r6 = 1
            r1 = r17
            r0.A07(r1, r6)
            android.graphics.Bitmap r0 = r11.A0B
            int r8 = r0.getWidth()
            android.graphics.Bitmap r0 = r11.A0B
            int r4 = r0.getHeight()
            r0 = 0
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r0, r0, r8, r4)
            android.graphics.Rect r0 = r11.A0E
            if (r0 == 0) goto L_0x019f
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>(r0)
        L_0x0025:
            com.whatsapp.crop.CropImageView r0 = r11.A0L
            X.3Qg r2 = new X.3Qg
            r2.<init>(r0)
            com.whatsapp.crop.CropImageView r0 = r11.A0L
            android.graphics.Matrix r3 = r0.getImageMatrix()
            boolean r10 = r11.A0S
            int r0 = r11.A00
            if (r0 == 0) goto L_0x003d
            int r0 = r11.A01
            r8 = 1
            if (r0 != 0) goto L_0x003e
        L_0x003d:
            r8 = 0
        L_0x003e:
            boolean r7 = r11.A0T
            int r4 = r11.A05
            int r0 = r11.A09
            int r4 = r4 / r0
            r1 = 1
            if (r10 == 0) goto L_0x0049
            r8 = 1
        L_0x0049:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r3)
            r2.A03 = r0
            r2.A05 = r9
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r5)
            r2.A06 = r0
            r3 = 0
            if (r8 != 0) goto L_0x005f
            if (r7 != 0) goto L_0x005f
            r1 = 0
        L_0x005f:
            r2.A0A = r1
            r2.A08 = r10
            r2.A01 = r4
            android.graphics.RectF r0 = r2.A05
            float r1 = r0.width()
            android.graphics.RectF r0 = r2.A05
            float r0 = r0.height()
            float r1 = r1 / r0
            r2.A00 = r1
            android.graphics.Rect r0 = X.AnonymousClass3Qg.A00(r2)
            r2.A04 = r0
            android.graphics.Paint r0 = r2.A0B
            r1 = 128(0x80, float:1.794E-43)
            r0.setARGB(r1, r3, r3, r3)
            android.graphics.Paint r0 = r2.A0C
            r0.setARGB(r1, r3, r3, r3)
            android.graphics.Paint r0 = r2.A0D
            X.C36421kH.A0q(r0)
            r0.setAntiAlias(r3)
            r2.A02 = r3
            com.whatsapp.crop.CropImageView r1 = r11.A0L
            java.util.ArrayList r0 = r1.A06
            r0.add(r2)
            r1.invalidate()
            r11.A0M = r2
            r0 = 2131428558(0x7f0b04ce, float:1.8478764E38)
            android.view.View r0 = r11.findViewById(r0)
            X.AnonymousClass3Y0.A01(r0, r11, r6)
            r0 = 2131432196(0x7f0b1304, float:1.8486143E38)
            android.view.View r1 = r11.findViewById(r0)
            r0 = 2
            X.AnonymousClass3Y0.A01(r1, r11, r0)
            r0 = 2131433485(0x7f0b180d, float:1.8488757E38)
            android.view.View r1 = r11.findViewById(r0)
            r0 = 3
            X.AnonymousClass3Y0.A01(r1, r11, r0)
            boolean r0 = r11.A0T
            if (r0 == 0) goto L_0x00c5
            r0 = 8
            r1.setVisibility(r0)
        L_0x00c5:
            java.lang.String r0 = r11.A0R
            if (r0 == 0) goto L_0x0176
            X.17Y r13 = r11.A0G
            X.0yb r14 = r11.A0I
            X.1e2 r12 = r11.A0H
            r0 = 2131888545(0x7f1209a1, float:1.9411728E38)
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r15 = "https://www.whatsapp.com/legal/"
            java.lang.String r6 = "terms-and-privacy-policy"
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableString r2 = X.C36441kJ.A0O(r0)
            int r1 = r2.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r5 = 0
            java.lang.Object[] r3 = r2.getSpans(r3, r1, r0)
            android.text.style.URLSpan[] r3 = (android.text.style.URLSpan[]) r3
            if (r3 == 0) goto L_0x019c
            int r1 = r3.length
        L_0x00f2:
            if (r5 >= r1) goto L_0x019c
            r4 = r3[r5]
            java.lang.String r0 = r4.getURL()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0198
            int r3 = r2.getSpanStart(r4)
            int r1 = r2.getSpanEnd(r4)
            int r0 = r2.getSpanFlags(r4)
            r2.removeSpan(r4)
            X.21s r10 = new X.21s
            r10.<init>(r11, r12, r13, r14, r15)
            r2.setSpan(r10, r3, r1, r0)
        L_0x0117:
            r5 = -10066330(0xffffffffff666666, float:-3.0625412E38)
            r4 = 0
            r3 = 1069547520(0x3fc00000, float:1.5)
            r6 = 0
            if (r2 == 0) goto L_0x013a
            r0 = 2131434809(0x7f0b1d39, float:1.8491442E38)
            com.whatsapp.TextEmojiLabel r1 = X.C36421kH.A0I(r11, r0)
            r1.setVisibility(r6)
            X.0yb r0 = r11.A0I
            X.C36331k8.A16(r1, r0)
            X.0yC r0 = r11.A01
            X.C36331k8.A1A(r0, r1)
            r1.setText(r2)
            r1.setShadowLayer(r3, r4, r3, r5)
        L_0x013a:
            X.17Y r13 = r11.A0G
            X.0yb r14 = r11.A0I
            X.1e2 r12 = r11.A0H
            java.lang.String r15 = r11.A0R
            X.21s r10 = new X.21s
            r10.<init>(r11, r12, r13, r14, r15)
            java.lang.String r0 = r11.A0R
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r0 = r0.getHost()
            android.text.SpannableString r2 = X.C36441kJ.A0O(r0)
            int r0 = r2.length()
            r2.setSpan(r10, r6, r0, r6)
            r0 = 2131430867(0x7f0b0dd3, float:1.8483447E38)
            com.whatsapp.TextEmojiLabel r1 = X.C36421kH.A0I(r11, r0)
            r1.setVisibility(r6)
            X.0yb r0 = r11.A0I
            X.C36331k8.A16(r1, r0)
            X.0yC r0 = r11.A01
            X.C36331k8.A1A(r0, r1)
            r1.setText(r2)
            r1.setShadowLayer(r3, r4, r3, r5)
        L_0x0176:
            r0 = 2131430860(0x7f0b0dcc, float:1.8483433E38)
            android.view.View r3 = r11.findViewById(r0)
            android.graphics.Rect r2 = X.AnonymousClass001.A06()
            com.whatsapp.crop.CropImageView r1 = r11.A0L
            X.1mQ r0 = new X.1mQ
            r0.<init>(r2, r1, r11)
            r3.setTouchDelegate(r0)
            java.lang.String r0 = "crop/oncreate/end"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wU r1 = r11.A04
            X.1MP r0 = r11.A0J
            X.C81113wU.A01(r1, r0)
            return
        L_0x0198:
            int r5 = r5 + 1
            goto L_0x00f2
        L_0x019c:
            r2 = 0
            goto L_0x0117
        L_0x019f:
            boolean r0 = r11.A0T
            if (r0 == 0) goto L_0x020a
            int r0 = r11.A06
            if (r0 >= r8) goto L_0x0207
            int r1 = r11.A07
            if (r1 >= r8) goto L_0x0207
            float r2 = (float) r8
            float r1 = (float) r1
            float r2 = r2 * r1
            float r0 = (float) r0
            float r2 = r2 / r0
            int r7 = (int) r2
            r0 = r8
        L_0x01b2:
            int r3 = r11.A00
            if (r3 == 0) goto L_0x01bf
            int r1 = r11.A01
            if (r1 == 0) goto L_0x01bf
            if (r3 <= r1) goto L_0x0203
            int r1 = r1 * r0
            int r7 = r1 / r3
        L_0x01bf:
            if (r7 <= r4) goto L_0x01c8
            float r2 = (float) r7
            float r1 = (float) r4
            float r2 = r2 / r1
            float r0 = (float) r0
            float r0 = r0 / r2
            int r0 = (int) r0
            r7 = r4
        L_0x01c8:
            if (r0 <= r8) goto L_0x01d1
            float r1 = (float) r0
            float r0 = (float) r8
            float r1 = r1 / r0
            float r0 = (float) r7
            float r0 = r0 / r1
            int r7 = (int) r0
            r0 = r8
        L_0x01d1:
            int r2 = r11.A05
            if (r2 <= 0) goto L_0x01f0
            int r1 = r11.A09
            int r2 = r2 / r1
            if (r0 >= r2) goto L_0x01e4
            r0 = r2
            if (r3 == 0) goto L_0x01e4
            int r1 = r11.A01
            if (r1 == 0) goto L_0x01e4
            int r1 = r1 * r2
            int r7 = r1 / r3
        L_0x01e4:
            if (r7 >= r2) goto L_0x01f0
            r7 = r2
            if (r3 == 0) goto L_0x01f0
            int r1 = r11.A01
            if (r1 == 0) goto L_0x01f0
            int r3 = r3 * r2
            int r0 = r3 / r1
        L_0x01f0:
            int r8 = r8 - r0
            int r1 = r8 / 2
            int r4 = r4 - r7
            int r4 = r4 / 2
            float r3 = (float) r1
            float r2 = (float) r4
            int r1 = r1 + r0
            float r1 = (float) r1
            int r4 = r4 + r7
            float r0 = (float) r4
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>(r3, r2, r1, r0)
            goto L_0x0025
        L_0x0203:
            int r0 = r7 * r3
            int r0 = r0 / r1
            goto L_0x01bf
        L_0x0207:
            int r7 = r11.A07
            goto L_0x01b2
        L_0x020a:
            r0 = r8
            r7 = r4
            goto L_0x01b2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.crop.CropImage.A2j(X.3PL):void");
    }

    public void onDestroy() {
        Log.i("crop/ondestroy");
        super.onDestroy();
        Bitmap bitmap = this.A0B;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.A0L.A01 = true;
            this.A0B.recycle();
            this.A0B = null;
        }
        C81113wU.A01(this.A04, this.A0J);
    }

    public CropImage(int i) {
        this.A0Z = false;
        C89334Wd.A00(this, 11);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("rotate", this.A08);
        AnonymousClass3Qg r0 = this.A0M;
        if (r0 != null) {
            Rect A022 = r0.A02();
            A07(A022, this);
            bundle.putParcelable("initialRect", A022);
        }
    }

    public CropImage() {
        this(0);
        this.A0A = Bitmap.CompressFormat.JPEG;
        this.A0Y = true;
        this.A09 = 1;
    }
}
