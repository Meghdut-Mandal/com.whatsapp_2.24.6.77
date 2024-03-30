package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.whatsapp.R;
import com.whatsapp.TextData;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.1ok  reason: invalid class name and case insensitive filesystem */
public final class C38401ok extends FrameLayout implements C18700tb {
    public CardView A00;
    public C87414Os A01;
    public TextEmojiLabel A02;
    public C21060yb A03;
    public C19970wo A04;
    public AnonymousClass1H2 A05;
    public C32721e5 A06;
    public AnonymousClass1DU A07;
    public C19890wg A08;
    public AnonymousClass2bV A09;
    public AnonymousClass1QZ A0A;
    public boolean A0B;
    public C63413Jy A0C;
    public final List A0D;

    public final void setEmojiLoader(AnonymousClass1H2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setLinkifyWeb(AnonymousClass1DU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setMessage(AnonymousClass2bV r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A09 = r2;
    }

    public final void setSharedPreferencesFactory(C19890wg r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setSystemServices(C21060yb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setTime(C19970wo r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        if (r5.length != 0) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setTextContent(java.lang.String r24) {
        /*
            r23 = this;
            r7 = r24
            android.text.SpannableStringBuilder r8 = X.C36441kJ.A0P(r7)
            r9 = r23
            X.0yb r1 = r9.getSystemServices()
            X.0wg r0 = r9.getSharedPreferencesFactory()
            X.AnonymousClass6YV.A08(r1, r0, r8)
            X.1DU r0 = r9.getLinkifyWeb()
            r0.A06(r8)
            int r1 = r8.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r6 = 0
            java.lang.Object[] r5 = r8.getSpans(r6, r1, r0)
            android.text.style.URLSpan[] r5 = (android.text.style.URLSpan[]) r5
            X.1DU r0 = r9.getLinkifyWeb()
            int r10 = X.AnonymousClass3UN.A02(r0, r7)
            com.whatsapp.TextEmojiLabel r3 = r9.A02
            java.lang.String r0 = "textContentView"
            if (r3 != 0) goto L_0x003a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x003a:
            r0 = 150(0x96, float:2.1E-43)
            if (r10 >= r0) goto L_0x012e
            r0 = 17
            r3.setGravity(r0)
            r0 = 4
            r3.setTextAlignment(r0)
        L_0x0047:
            android.util.DisplayMetrics r1 = X.C36361kB.A0B(r9)
            int r0 = r1.heightPixels
            float r11 = (float) r0
            float r0 = r1.density
            float r11 = r11 / r0
            X.1e5 r0 = r9.A06
            if (r0 == 0) goto L_0x012b
            X.2bV r0 = r9.A09
            if (r0 == 0) goto L_0x012b
            X.AnonymousClass00C.A0B(r5)
            int r0 = r5.length
            if (r0 == 0) goto L_0x012b
            X.2bV r4 = r9.A09
            if (r4 == 0) goto L_0x012b
            X.1e5 r2 = r9.A06
            if (r2 == 0) goto L_0x012b
            r0 = r5[r6]
            java.lang.String r1 = r0.getURL()
            X.11F r0 = r4.A0J()
            java.util.Set r2 = r2.BFr(r0, r4, r1)
        L_0x0075:
            r0 = 350(0x15e, float:4.9E-43)
            r1 = 0
            if (r10 > r0) goto L_0x007b
            r1 = 1
        L_0x007b:
            X.2bV r0 = r9.A09
            if (r0 == 0) goto L_0x0090
            byte[] r0 = r0.A1c()
            if (r0 == 0) goto L_0x0090
            if (r1 == 0) goto L_0x0090
            if (r2 != 0) goto L_0x0090
            X.AnonymousClass00C.A0B(r5)
            int r0 = r5.length
            r1 = 1
            if (r0 != 0) goto L_0x0091
        L_0x0090:
            r1 = 0
        L_0x0091:
            int r0 = (int) r11
            int r0 = X.AnonymousClass3UN.A01(r10, r0, r1)
            float r1 = (float) r0
            r0 = 2
            r3.setTextSize(r0, r1)
            android.content.Context r2 = r9.getContext()
            android.text.TextPaint r1 = r3.getPaint()
            X.1H2 r0 = r9.getEmojiLoader()
            X.AnonymousClass3UG.A03(r2, r1, r0, r8)
            X.AnonymousClass00C.A0B(r5)
            int r4 = r5.length
            r11 = 0
            r14 = 0
        L_0x00b0:
            if (r11 >= r4) goto L_0x013c
            r10 = r5[r11]
            java.lang.String r18 = r10.getURL()
            int r2 = r8.getSpanStart(r10)
            int r1 = r8.getSpanEnd(r10)
            int r0 = r1 - r2
            int r14 = r14 + r0
            r8.removeSpan(r10)
            X.AnonymousClass00C.A0B(r18)
            java.lang.String r12 = X.C55812vE.A00(r18)
            r8.replace(r2, r1, r12)
            int r1 = X.C36441kJ.A09(r12, r2)
            android.content.res.Resources r10 = r9.getResources()
            r0 = 2131168463(0x7f070ccf, float:1.7951229E38)
            int r13 = X.C36441kJ.A05(r10, r0)
            float r10 = (float) r13
            r0 = 0
            r3.setShadowLayer(r10, r0, r0, r6)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r10 >= r0) goto L_0x00ef
            r10 = 0
            r0 = 1
            r3.setLayerType(r0, r10)
        L_0x00ef:
            r3.setPadding(r13, r13, r13, r13)
            float r0 = r3.getTextSize()
            int r10 = (int) r0
            java.lang.String r0 = "…"
            boolean r22 = X.AnonymousClass099.A0O(r12, r0, r6)
            X.4Os r0 = r9.A01
            X.3cT r15 = new X.3cT
            r20 = r1
            r21 = r10
            r19 = r2
            r17 = r3
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r8.setSpan(r15, r2, r1, r6)
            java.lang.Class<android.text.style.ImageSpan> r0 = android.text.style.ImageSpan.class
            java.lang.Object[] r10 = r8.getSpans(r2, r1, r0)
            android.text.style.ImageSpan[] r10 = (android.text.style.ImageSpan[]) r10
            X.AnonymousClass00C.A0B(r10)
            int r2 = r10.length
            r1 = 0
        L_0x011e:
            if (r1 >= r2) goto L_0x0128
            r0 = r10[r1]
            r8.removeSpan(r0)
            int r1 = r1 + 1
            goto L_0x011e
        L_0x0128:
            int r11 = r11 + 1
            goto L_0x00b0
        L_0x012b:
            r2 = 0
            goto L_0x0075
        L_0x012e:
            r0 = 16
            r3.setGravity(r0)
            r0 = 5
            r3.setTextAlignment(r0)
            r3.setTextDirection(r0)
            goto L_0x0047
        L_0x013c:
            r3.setText(r8)
            r3.requestLayout()
            int r10 = X.C63883Lu.A00(r7)
            int r3 = r7.length()
            r2 = 0
        L_0x014b:
            if (r2 >= r3) goto L_0x0161
            if (r10 <= 0) goto L_0x0161
            int r1 = r7.codePointAt(r2)
            boolean r0 = java.lang.Character.isWhitespace(r1)
            if (r0 == 0) goto L_0x015b
            int r10 = r10 + -1
        L_0x015b:
            int r0 = java.lang.Character.charCount(r1)
            int r2 = r2 + r0
            goto L_0x014b
        L_0x0161:
            r7 = 2000(0x7d0, double:9.88E-321)
            int r10 = r10 - r14
            int r10 = r10 + r4
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r10 <= r0) goto L_0x016b
            r10 = 1000(0x3e8, float:1.401E-42)
        L_0x016b:
            int r0 = r10 * 60
            long r2 = (long) r0
            long r2 = r2 + r7
            X.0wo r1 = r9.getTime()
            X.3Jy r0 = new X.3Jy
            r0.<init>(r1, r2)
            r9.A0C = r0
            java.util.List r1 = r9.A0D
            r1.clear()
        L_0x017f:
            if (r6 >= r4) goto L_0x0190
            r0 = r5[r6]
            java.lang.String r0 = r0.getURL()
            X.AnonymousClass00C.A08(r0)
            r1.add(r0)
            int r6 = r6 + 1
            goto L_0x017f
        L_0x0190:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38401ok.setTextContent(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public final void setTextContentProperties(TextData textData) {
        int i = textData.textColor;
        if (i != 0) {
            TextEmojiLabel textEmojiLabel = this.A02;
            if (textEmojiLabel == null) {
                throw C36331k8.A0d("textContentView");
            }
            textEmojiLabel.setTextColor(i);
        }
        int i2 = textData.backgroundColor;
        if (i2 != 0) {
            setBackgroundColor(i2);
        }
        TextEmojiLabel textEmojiLabel2 = this.A02;
        if (textEmojiLabel2 == null) {
            throw C36331k8.A0d("textContentView");
        }
        textEmojiLabel2.setTypeface(AnonymousClass3UN.A04(C36371kC.A0B(this), textData.fontStyle));
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0A;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1H2 getEmojiLoader() {
        AnonymousClass1H2 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("emojiLoader");
    }

    public final AnonymousClass1DU getLinkifyWeb() {
        AnonymousClass1DU r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("linkifyWeb");
    }

    public final C19890wg getSharedPreferencesFactory() {
        C19890wg r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("sharedPreferencesFactory");
    }

    public final C63413Jy getStaticContentPlayer() {
        C63413Jy r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("staticContentPlayer");
    }

    public final C21060yb getSystemServices() {
        C21060yb r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0W();
    }

    public final C19970wo getTime() {
        C19970wo r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("time");
    }

    public final CardView getWebPagePreviewContainer() {
        CardView cardView = this.A00;
        if (cardView != null) {
            return cardView;
        }
        throw C36331k8.A0d("webPagePreviewContainer");
    }

    public C38401ok(Context context) {
        super(context);
        if (!this.A0B) {
            this.A0B = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A07 = C36391kE.A0j(A0W);
            this.A04 = C36351kA.A0V(A0W);
            this.A05 = C36351kA.A0e(A0W);
            this.A03 = C36351kA.A0U(A0W);
            this.A08 = C36351kA.A0m(A0W);
        }
        this.A0D = AnonymousClass001.A0I();
        View A0J = C36411kG.A0J(LayoutInflater.from(context), this, R.layout.f9nameremoved);
        this.A02 = C36361kB.A0R(A0J, R.id.message_text);
        this.A00 = (CardView) C36361kB.A0F(A0J, R.id.web_page_preview_container);
    }

    public final List getDisplayedUrls() {
        return this.A0D;
    }

    public final void setLinkCallback(C87414Os r1) {
        this.A01 = r1;
    }

    public final void setPhishingManager(C32721e5 r1) {
        this.A06 = r1;
    }
}
