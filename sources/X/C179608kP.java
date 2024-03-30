package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.8kP  reason: invalid class name and case insensitive filesystem */
public class C179608kP extends AnonymousClass80E {
    public final WaImageView A00;
    public final C196089Xp A01;
    public final C18820ts A02;
    public final AnonymousClass1SV A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final C20810yC A08;
    public final C19770wU A09;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.AnonymousClass9FT r20) {
        /*
            r19 = this;
            r0 = r20
            X.8k4 r0 = (X.C179398k4) r0
            X.B1o r9 = r0.A02
            X.9ui r8 = X.C207219uk.A00(r9)
            X.9uJ r7 = r0.A01
            X.9tv r15 = r0.A00
            r6 = r19
            com.whatsapp.WaImageView r14 = r6.A00
            android.content.res.Resources r10 = X.C36341k9.A0F(r14)
            com.whatsapp.WaTextView r1 = r6.A07
            java.lang.String r0 = r7.A04
            r1.setText(r0)
            int r2 = r7.A01
            r5 = 1
            r4 = 0
            if (r2 <= 0) goto L_0x0034
            com.whatsapp.WaTextView r3 = r6.A05
            r1 = 2131891927(0x7f1216d7, float:1.9418588E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.AnonymousClass000.A1L(r0, r2, r4)
            java.lang.String r0 = r10.getString(r1, r0)
            r3.setText(r0)
        L_0x0034:
            X.9uM r11 = r7.A03
            com.whatsapp.WaTextView r10 = r6.A04
            if (r11 != 0) goto L_0x0083
            X.9uM r12 = r7.A02
            if (r12 != 0) goto L_0x006f
            r0 = 0
        L_0x003f:
            r10.setText(r0)
            com.whatsapp.WaTextView r1 = r6.A06
            r0 = 8
            r1.setVisibility(r0)
        L_0x0049:
            java.lang.String r1 = r7.A00()
            java.lang.String r0 = "custom-item"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00ce
            android.content.Context r2 = X.C36441kJ.A0F(r6)
            r1 = 2131232855(0x7f080857, float:1.8081831E38)
            r0 = 2131101822(0x7f06087e, float:1.7816065E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A02(r2, r1, r0)
            r14.setImageDrawable(r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            r14.setScaleX(r0)
            r14.setScaleY(r0)
            return
        L_0x006f:
            long r0 = r12.A01
            long r2 = (long) r2
            long r0 = r0 * r2
            int r11 = r12.A00
            java.lang.String r3 = r12.A02
            X.9uM r2 = new X.9uM
            r2.<init>(r0, r11, r3)
            X.0ts r0 = r6.A02
            java.lang.String r0 = r8.A07(r0, r2)
            goto L_0x003f
        L_0x0083:
            long r0 = r11.A01
            long r2 = (long) r2
            long r0 = r0 * r2
            int r13 = r11.A00
            java.lang.String r11 = r11.A02
            X.9uM r12 = new X.9uM
            r12.<init>(r0, r13, r11)
            X.0ts r11 = r6.A02
            java.lang.String r0 = r8.A07(r11, r12)
            r10.setText(r0)
            com.whatsapp.WaTextView r10 = r6.A06
            r10.setVisibility(r4)
            X.9uM r13 = r7.A02
            if (r13 != 0) goto L_0x00a7
            r0 = 0
        L_0x00a3:
            r10.setText(r0)
            goto L_0x0049
        L_0x00a7:
            long r0 = r13.A01
            long r0 = r0 * r2
            int r12 = r13.A00
            java.lang.String r3 = r13.A02
            X.9uM r2 = new X.9uM
            r2.<init>(r0, r12, r3)
            java.lang.String r0 = r8.A07(r11, r2)
            if (r0 == 0) goto L_0x00a3
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r0)
            android.text.style.StrikethroughSpan r2 = new android.text.style.StrikethroughSpan
            r2.<init>()
            int r1 = r3.length()
            r0 = 33
            r3.setSpan(r2, r4, r1, r0)
            r0 = r3
            goto L_0x00a3
        L_0x00ce:
            if (r15 == 0) goto L_0x00dc
            X.9Xp r13 = r6.A01
            X.6pu r17 = X.C143056pu.A00
            r18 = 2
            r16 = 0
            r13.A02(r14, r15, r16, r17, r18)
            return
        L_0x00dc:
            X.0yC r1 = r6.A08
            r0 = 7581(0x1d9d, float:1.0623E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = r7.A00
            if (r0 == 0) goto L_0x00f7
            X.5M1 r2 = new X.5M1
            r2.<init>(r14, r0)
            X.0wU r1 = r6.A09
            java.lang.String[] r0 = new java.lang.String[r4]
            r1.Box(r2, r0)
            return
        L_0x00f7:
            X.9uP r0 = r8.A09
            java.util.List r1 = r0.A09
            int r0 = r8.A02()
            if (r0 != r5) goto L_0x0115
            int r0 = r1.size()
            if (r0 != r5) goto L_0x0115
            r0 = 5
            X.9nX r1 = new X.9nX
            r1.<init>(r6, r0)
            X.1SV r0 = r6.A03
            X.3T1 r9 = (X.AnonymousClass3T1) r9
            r0.A0C(r14, r9, r1)
            return
        L_0x0115:
            A00(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179608kP.A0B(X.9FT):void");
    }

    public C179608kP(View view, C196089Xp r3, C18820ts r4, C20810yC r5, AnonymousClass1SV r6, C19770wU r7) {
        super(view);
        this.A00 = C36431kI.A0X(view, R.id.item_thumbnail);
        this.A07 = C36401kF.A0Q(view, R.id.item_title);
        this.A05 = C36401kF.A0Q(view, R.id.item_quantity);
        this.A04 = C36401kF.A0Q(view, R.id.item_price);
        this.A06 = C36401kF.A0Q(view, R.id.item_sale_price);
        this.A08 = r5;
        this.A09 = r7;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r6;
    }

    public static void A00(C179608kP r3) {
        Drawable A022 = AnonymousClass3UF.A02(C36441kJ.A0F(r3), R.drawable.cart, R.color.f6nameremoved);
        WaImageView waImageView = r3.A00;
        waImageView.setImageDrawable(A022);
        waImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }
}
