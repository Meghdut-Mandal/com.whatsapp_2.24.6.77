package com.whatsapp.biz.cart.view.fragment;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass04S;
import X.AnonymousClass141;
import X.AnonymousClass164;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass19A;
import X.AnonymousClass1GX;
import X.AnonymousClass1H2;
import X.AnonymousClass1KK;
import X.AnonymousClass1N2;
import X.AnonymousClass1N6;
import X.AnonymousClass1NG;
import X.AnonymousClass1X4;
import X.AnonymousClass1XN;
import X.AnonymousClass22t;
import X.AnonymousClass3L0;
import X.AnonymousClass3L6;
import X.AnonymousClass3LW;
import X.AnonymousClass60S;
import X.AnonymousClass6O1;
import X.AnonymousClass6VE;
import X.AnonymousClass960;
import X.AnonymousClass9R0;
import X.AnonymousClass9R1;
import X.AnonymousClass9UA;
import X.AnonymousClass9UB;
import X.AnonymousClass9Y1;
import X.AnonymousClass9ZJ;
import X.B79;
import X.C011004s;
import X.C012005e;
import X.C1261362r;
import X.C1497072l;
import X.C163357q4;
import X.C167597yL;
import X.C167627yS;
import X.C167697yb;
import X.C168167zo;
import X.C178358fo;
import X.C187938ym;
import X.C18820ts;
import X.C191569Dm;
import X.C191579Dn;
import X.C191589Do;
import X.C19420v0;
import X.C195119So;
import X.C196089Xp;
import X.C19700wN;
import X.C19730wQ;
import X.C19770wU;
import X.C19890wg;
import X.C199349fA;
import X.C19970wo;
import X.C202099l2;
import X.C20690y0;
import X.C20810yC;
import X.C21060yb;
import X.C225314u;
import X.C226815j;
import X.C29461Ws;
import X.C31771cM;
import X.C36321k7;
import X.C36341k9;
import X.C36401kF;
import X.C39001qm;
import X.C63273Jk;
import X.C65713Te;
import X.C88314Sf;
import X.C99304t3;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;

public class CartFragment extends Hilt_CartFragment {
    public static final HashMap A1C = AnonymousClass001.A0J();
    public static final HashMap A1D = AnonymousClass001.A0J();
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public TextView A04;
    public C19700wN A05;
    public C191569Dm A06;
    public C191579Dn A07;
    public C191589Do A08;
    public AnonymousClass60S A09;
    public C20690y0 A0A;
    public AnonymousClass17Y A0B;
    public KeyboardPopupLayout A0C;
    public C19730wQ A0D;
    public AnonymousClass1X4 A0E;
    public AnonymousClass164 A0F;
    public WaTextView A0G;
    public WaTextView A0H;
    public AnonymousClass1KK A0I;
    public C178358fo A0J;
    public AnonymousClass6VE A0K;
    public AnonymousClass960 A0L;
    public AnonymousClass9ZJ A0M;
    public AnonymousClass9UA A0N;
    public C168167zo A0O;
    public C167697yb A0P;
    public C167627yS A0Q;
    public C167597yL A0R;
    public C31771cM A0S;
    public C29461Ws A0T;
    public AnonymousClass9Y1 A0U;
    public C195119So A0V;
    public C196089Xp A0W;
    public C202099l2 A0X;
    public AnonymousClass1NG A0Y;
    public AnonymousClass9UB A0Z;
    public AnonymousClass16I A0a;
    public AnonymousClass185 A0b;
    public AnonymousClass171 A0c;
    public C21060yb A0d;
    public C19970wo A0e;
    public C19420v0 A0f;
    public C18820ts A0g;
    public AnonymousClass22t A0h;
    public C1261362r A0i;
    public AnonymousClass6O1 A0j;
    public AnonymousClass1XN A0k;
    public AnonymousClass1H2 A0l;
    public EmojiSearchProvider A0m;
    public C20810yC A0n;
    public UserJid A0o;
    public MentionableEntry A0p;
    public C199349fA A0q;
    public AnonymousClass19A A0r;
    public AnonymousClass3L6 A0s;
    public C19890wg A0t;
    public AnonymousClass9R0 A0u;
    public AnonymousClass9R1 A0v;
    public C63273Jk A0w;
    public AnonymousClass1N6 A0x;
    public AnonymousClass1N2 A0y;
    public AnonymousClass1GX A0z;
    public C19770wU A10;
    public WDSButton A11;
    public boolean A12 = false;
    public int A13;
    public View A14;
    public View A15;
    public View A16;
    public LinearLayout A17;
    public RecyclerView A18;
    public WaTextView A19;
    public final C88314Sf A1A = new C163357q4(this, 0);
    public final C226815j A1B = new B79(this, 1);

    public static void A05(AnonymousClass04S r3, C187938ym r4, CartFragment cartFragment) {
        C187938ym r0 = C187938ym.AT_LEAST_ONE_UPDATED;
        int i = R.string.f12nameremoved;
        if (r4 == r0) {
            i = R.string.f12nameremoved;
        }
        C39001qm A042 = AnonymousClass3LW.A04(cartFragment);
        A042.A0r(false);
        A042.A0c(i);
        A042.A0m(cartFragment, r3, R.string.f12nameremoved);
        C36341k9.A11(A042);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1.A02 != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(com.whatsapp.biz.cart.view.fragment.CartFragment r5) {
        /*
            X.7yL r1 = r5.A0R
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x000b
            boolean r1 = r1.A02
            r0 = 0
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            r4 = 0
            if (r0 != 0) goto L_0x001f
            X.7yS r0 = r5.A0Q
            X.6Uh r3 = r0.A02
            X.0wU r2 = r3.A0B
            r1 = 11
            X.75B r0 = new X.75B
            r0.<init>((int) r1, (java.lang.Object) r3, (boolean) r4)
            r2.Boy(r0)
        L_0x001f:
            A07(r5)
            X.7zo r0 = r5.A0O
            int r0 = r0.A0L()
            r1 = 8
            if (r0 != 0) goto L_0x0046
            android.view.View r0 = r5.A14
            r0.setVisibility(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A18
            r0.setVisibility(r1)
            android.view.View r0 = r5.A15
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r5.A17
        L_0x003d:
            r0.setVisibility(r1)
            X.8fo r0 = r5.A0J
            r0.A00()
            return
        L_0x0046:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A18
            r0.setVisibility(r4)
            android.widget.LinearLayout r0 = r5.A17
            r0.setVisibility(r4)
            android.view.View r0 = r5.A14
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.cart.view.fragment.CartFragment.A06(com.whatsapp.biz.cart.view.fragment.CartFragment):void");
    }

    /* JADX WARNING: type inference failed for: r0v51, types: [X.8VO] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0289 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0294 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0263 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(com.whatsapp.biz.cart.view.fragment.CartFragment r20) {
        /*
            r2 = r20
            X.7zo r0 = r2.A0O
            int r1 = r0.A0L()
            X.7zo r0 = r2.A0O
            java.util.ArrayList r7 = r0.A0M()
            X.7zo r0 = r2.A0O
            java.util.Date r10 = r0.A01
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r11 = r7.iterator()
        L_0x001a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0078
            X.6B4 r5 = X.C165617ti.A0M(r11)
            X.9up r6 = r5.A02
            java.util.List r9 = r6.A07
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0076
            r8 = 0
            java.lang.Object r0 = r9.get(r8)
            X.9tv r0 = (X.C206759tv) r0
            java.lang.String r3 = r0.A04
            java.lang.Object r0 = r9.get(r8)
            X.9tv r0 = (X.C206759tv) r0
            java.lang.String r0 = r0.A00
            X.6bu r14 = new X.6bu
            r14.<init>(r3, r0)
        L_0x0044:
            java.math.BigDecimal r9 = r6.A06
            X.6bV r3 = r6.A02
            if (r9 == 0) goto L_0x0074
            if (r3 == 0) goto L_0x0054
            boolean r0 = r3.A00(r10)
            if (r0 == 0) goto L_0x0054
            java.math.BigDecimal r9 = r3.A00
        L_0x0054:
            java.lang.String r8 = r6.A0F
            java.lang.String r3 = r6.A05
            X.6Tk r15 = r6.A04
            long r5 = r5.A00
            int r0 = (int) r5
            X.C36321k7.A0x(r8, r3)
            r13 = 0
            r20 = 0
            X.9tP r12 = new X.9tP
            r17 = r3
            r18 = r9
            r19 = r0
            r16 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r4.add(r12)
            goto L_0x001a
        L_0x0074:
            r9 = 0
            goto L_0x0054
        L_0x0076:
            r14 = 0
            goto L_0x0044
        L_0x0078:
            X.7yS r0 = r2.A0Q
            X.6Dt r3 = r0.A0S()
            java.math.BigDecimal r11 = X.C202099l2.A02(r7)
            X.7zo r0 = r2.A0O
            java.util.Date r0 = r0.A01
            java.math.BigDecimal r10 = X.C202099l2.A01(r0, r7)
            java.math.BigDecimal r9 = X.C202099l2.A00(r3, r11, r10, r4)
            r5 = r10
            r3 = 0
            if (r10 == 0) goto L_0x028f
            if (r9 == 0) goto L_0x00ab
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            int r0 = r10.compareTo(r0)
            if (r0 < 0) goto L_0x00b4
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            int r0 = r9.compareTo(r0)
            if (r0 < 0) goto L_0x00b4
            java.math.BigDecimal r5 = r10.add(r9)
            X.AnonymousClass00C.A08(r5)
        L_0x00ab:
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            int r0 = r5.compareTo(r0)
            if (r0 <= 0) goto L_0x00b4
            r3 = r5
        L_0x00b4:
            if (r11 == 0) goto L_0x00d0
            if (r3 == 0) goto L_0x00d0
            int r0 = r3.compareTo(r11)
            if (r0 <= 0) goto L_0x00d0
            if (r10 != 0) goto L_0x028c
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
        L_0x00c2:
            java.math.BigDecimal r3 = r11.subtract(r0)
            if (r9 == 0) goto L_0x00cf
            int r0 = r9.compareTo(r3)
            if (r0 <= 0) goto L_0x00cf
            r9 = r3
        L_0x00cf:
            r3 = r11
        L_0x00d0:
            X.7yS r0 = r2.A0Q
            X.08S r0 = r0.A01
            java.lang.Object r6 = r0.A04()
            X.9fx r6 = (X.C199779fx) r6
            X.7yb r0 = r2.A0P
            X.00s r0 = r0.A03
            java.util.List r5 = X.C36401kF.A0w(r0)
            if (r6 == 0) goto L_0x0130
            if (r5 == 0) goto L_0x0130
            boolean r0 = r6.A01
            r8 = 0
            if (r0 == 0) goto L_0x0108
            java.util.Iterator r5 = r5.iterator()
        L_0x00ef:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0100
            X.6B4 r0 = X.C165617ti.A0M(r5)
            X.9up r0 = r0.A02
            X.6Tk r0 = r0.A04
            if (r0 == 0) goto L_0x00ef
            r8 = r0
        L_0x0100:
            X.6Dt r5 = r6.A00
            X.8VO r0 = new X.8VO
            r0.<init>(r5, r8, r9)
            r8 = r0
        L_0x0108:
            X.7zo r7 = r2.A0O
            java.util.List r6 = r7.A0C
            int r5 = r6.size()
        L_0x0110:
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x0289
            java.lang.Object r12 = r6.get(r5)
            boolean r0 = r12 instanceof X.AnonymousClass8VO
            if (r0 != 0) goto L_0x0122
            boolean r0 = r12 instanceof X.AnonymousClass8VL
            if (r0 == 0) goto L_0x0110
            int r5 = r5 + 1
        L_0x0122:
            if (r8 == 0) goto L_0x027b
            int r0 = r6.size()
            if (r5 != r0) goto L_0x0265
            r6.add(r8)
        L_0x012d:
            r7.A08(r5)
        L_0x0130:
            X.9l2 r0 = r2.A0X
            java.lang.String r8 = r0.A03(r11, r3, r4)
            X.9l2 r0 = r2.A0X
            r7 = 0
            java.lang.String r14 = r0.A04(r3, r4, r7)
            android.view.View r3 = r2.A16
            r0 = 2131433841(0x7f0b1971, float:1.848948E38)
            android.view.View r13 = X.C012005e.A02(r3, r0)
            android.view.View r3 = r2.A16
            r0 = 2131433840(0x7f0b1970, float:1.8489477E38)
            android.widget.TextView r12 = X.C36391kE.A0O(r3, r0)
            android.view.View r3 = r2.A16
            r0 = 2131433838(0x7f0b196e, float:1.8489473E38)
            android.widget.TextView r6 = X.C36391kE.A0O(r3, r0)
            android.view.View r3 = r2.A16
            r0 = 2131433837(0x7f0b196d, float:1.848947E38)
            android.widget.TextView r5 = X.C36391kE.A0O(r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r15 = 0
            r3 = 8
            if (r0 == 0) goto L_0x01d7
            r13.setVisibility(r3)
            r12.setVisibility(r3)
        L_0x0170:
            X.7zo r11 = r2.A0O
            java.util.List r10 = r11.A0C
            int r9 = r10.size()
        L_0x0178:
            int r9 = r9 + -1
            if (r9 < 0) goto L_0x01d5
            java.lang.Object r4 = r10.get(r9)
            boolean r0 = r4 instanceof X.AnonymousClass8VP
            if (r0 != 0) goto L_0x018e
            boolean r0 = r4 instanceof X.AnonymousClass8VL
            if (r0 != 0) goto L_0x018c
            boolean r0 = r4 instanceof X.AnonymousClass8VO
            if (r0 == 0) goto L_0x0178
        L_0x018c:
            int r9 = r9 + 1
        L_0x018e:
            X.8VP r0 = X.C168167zo.A00(r11, r9)
            if (r0 == 0) goto L_0x019a
            r10.remove(r9)
            r11.A09(r9)
        L_0x019a:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x01c8
            r0 = 2131887570(0x7f1205d2, float:1.940975E38)
            r6.setText(r0)
            r5.setVisibility(r3)
        L_0x01a9:
            X.7zo r4 = r2.A0O
            r3 = 0
        L_0x01ac:
            java.util.List r2 = r4.A0C
            int r0 = r2.size()
            if (r3 >= r0) goto L_0x0294
            java.lang.Object r2 = r2.get(r3)
            X.9EB r2 = (X.AnonymousClass9EB) r2
            boolean r0 = r2 instanceof X.AnonymousClass8VM
            if (r0 == 0) goto L_0x01c5
            X.8VM r2 = (X.AnonymousClass8VM) r2
            r2.A00 = r1
            r4.A07(r3)
        L_0x01c5:
            int r3 = r3 + 1
            goto L_0x01ac
        L_0x01c8:
            r0 = 2131894959(0x7f1222af, float:1.9424737E38)
            r6.setText(r0)
            r5.setText(r8)
            r5.setVisibility(r7)
            goto L_0x01a9
        L_0x01d5:
            r9 = -1
            goto L_0x018e
        L_0x01d7:
            r13.setVisibility(r7)
            r12.setVisibility(r7)
            r12.setText(r14)
            X.0yC r12 = r2.A0n
            r0 = 5996(0x176c, float:8.402E-42)
            boolean r0 = r12.A0E(r0)
            if (r0 == 0) goto L_0x019a
            X.9l2 r0 = r2.A0X
            java.lang.String r16 = r0.A04(r11, r4, r7)
            X.9l2 r0 = r2.A0X
            r11 = 1
            java.lang.String r17 = r0.A04(r10, r4, r11)
            X.9l2 r0 = r2.A0X
            java.lang.String r18 = r0.A04(r9, r4, r11)
            X.0yC r4 = r2.A0n
            r0 = 7120(0x1bd0, float:9.977E-42)
            boolean r0 = r4.A0E(r0)
            if (r0 == 0) goto L_0x0170
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L_0x0170
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            if (r0 == 0) goto L_0x0219
            boolean r0 = android.text.TextUtils.isEmpty(r18)
            if (r0 != 0) goto L_0x0170
        L_0x0219:
            X.7zo r4 = r2.A0O
            X.8VP r14 = new X.8VP
            r20 = 0
            r19 = r15
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.util.List r10 = r4.A0C
            int r9 = r10.size()
        L_0x022a:
            int r9 = r9 + -1
            if (r9 < 0) goto L_0x0263
            java.lang.Object r11 = r10.get(r9)
            boolean r0 = r11 instanceof X.AnonymousClass8VP
            if (r0 != 0) goto L_0x0240
            boolean r0 = r11 instanceof X.AnonymousClass8VL
            if (r0 != 0) goto L_0x023e
            boolean r0 = r11 instanceof X.AnonymousClass8VO
            if (r0 == 0) goto L_0x022a
        L_0x023e:
            int r9 = r9 + 1
        L_0x0240:
            int r0 = r10.size()
            if (r9 != r0) goto L_0x024e
            r10.add(r14)
        L_0x0249:
            r4.A08(r9)
            goto L_0x019a
        L_0x024e:
            X.8VP r0 = X.C168167zo.A00(r4, r9)
            if (r0 == 0) goto L_0x025c
            r10.set(r9, r14)
            r4.A07(r9)
            goto L_0x019a
        L_0x025c:
            r0 = -1
            if (r9 == r0) goto L_0x019a
            r10.add(r9, r14)
            goto L_0x0249
        L_0x0263:
            r9 = -1
            goto L_0x0240
        L_0x0265:
            X.8VO r0 = X.C168167zo.A01(r7, r5)
            if (r0 == 0) goto L_0x0273
            r6.set(r5, r8)
            r7.A07(r5)
            goto L_0x0130
        L_0x0273:
            r0 = -1
            if (r5 == r0) goto L_0x0130
            r6.add(r5, r8)
            goto L_0x012d
        L_0x027b:
            X.8VO r0 = X.C168167zo.A01(r7, r5)
            if (r0 == 0) goto L_0x0130
            r6.remove(r5)
            r7.A09(r5)
            goto L_0x0130
        L_0x0289:
            r5 = -1
            goto L_0x0122
        L_0x028c:
            r0 = r10
            goto L_0x00c2
        L_0x028f:
            if (r9 == 0) goto L_0x00b4
            r5 = r9
            goto L_0x00ab
        L_0x0294:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.cart.view.fragment.CartFragment.A07(com.whatsapp.biz.cart.view.fragment.CartFragment):void");
    }

    public static void A08(CartFragment cartFragment) {
        String A0H2;
        C167697yb r1 = cartFragment.A0P;
        AnonymousClass185 r0 = r1.A0L;
        UserJid userJid = r1.A0O;
        AnonymousClass3L0 A022 = r0.A02(userJid);
        if (A022 != null) {
            A0H2 = A022.A08;
        } else {
            A0H2 = r1.A0M.A0H(new AnonymousClass141(userJid));
        }
        if (!TextUtils.isEmpty(A0H2)) {
            View A023 = C012005e.A02(cartFragment.A16, R.id.recipient_name_layout);
            ImageView A0G2 = C36401kF.A0G(cartFragment.A16, R.id.recipient_name_prompt_icon);
            TextEmojiLabel A0O2 = C36401kF.A0O(cartFragment.A16, R.id.recipient_name_text);
            A023.setVisibility(0);
            C36321k7.A0L(cartFragment.A0a(), A0G2, cartFragment.A0g, R.drawable.chevron);
            A0O2.A0I(A0H2);
        }
    }

    public static void A09(CartFragment cartFragment, boolean z) {
        if (z) {
            ((C225314u) cartFragment.A0i()).Bnv();
            C99304t3.A01(cartFragment.A0d(), cartFragment.A0a().getString(R.string.f12nameremoved), 0).A0P();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x03b5, code lost:
        if (r6 == 1) goto L_0x03b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1G(android.os.Bundle r35, android.view.LayoutInflater r36, android.view.ViewGroup r37) {
        /*
            r34 = this;
            r5 = r34
            android.os.Bundle r1 = r5.A0b()
            java.lang.String r0 = "extra_business_id"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            X.C18740tg.A06(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r5.A0o = r0
            android.os.Bundle r1 = r5.A0b()
            java.lang.String r0 = "extra_entry_point"
            int r6 = r1.getInt(r0)
            r5.A00 = r6
            com.whatsapp.jid.UserJid r1 = r5.A0o
            X.3L6 r4 = r5.A0s
            X.0wQ r0 = r5.A0D
            boolean r0 = r0.A0M(r1)
            r2 = 1
            r1 = r0 ^ 1
            java.lang.String r3 = "cart_view_tag"
            java.lang.String r0 = "IsConsumer"
            r4.A04(r3, r0, r1)
            if (r6 == 0) goto L_0x048d
            if (r6 == r2) goto L_0x0489
            r0 = 2
            if (r6 == r0) goto L_0x0485
            r0 = 3
            if (r6 == r0) goto L_0x0481
            r0 = 4
            if (r6 == r0) goto L_0x047d
            r0 = 5
            if (r6 != r0) goto L_0x0491
            java.lang.String r2 = "CatalogSearch"
        L_0x0045:
            X.3L6 r1 = r5.A0s
            java.lang.String r0 = "EntryPoint"
            r1.A03(r3, r0, r2)
            r0 = 2131625009(0x7f0e0431, float:1.8877214E38)
            r4 = 0
            r2 = r36
            r1 = r37
            android.view.View r1 = r2.inflate(r0, r1, r4)
            r5.A16 = r1
            r0 = 2131432240(0x7f0b1330, float:1.8486232E38)
            com.whatsapp.WaTextView r0 = X.C36401kF.A0Q(r1, r0)
            r5.A0H = r0
            android.view.View r1 = r5.A16
            r0 = 2131428605(0x7f0b04fd, float:1.847886E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            com.whatsapp.KeyboardPopupLayout r0 = (com.whatsapp.KeyboardPopupLayout) r0
            r5.A0C = r0
            android.view.View r1 = r5.A16
            r0 = 2131429985(0x7f0b0a61, float:1.8481658E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            com.whatsapp.mentions.MentionableEntry r0 = (com.whatsapp.mentions.MentionableEntry) r0
            r5.A0p = r0
            android.view.View r1 = r5.A16
            r0 = 2131429843(0x7f0b09d3, float:1.848137E38)
            android.view.View r3 = X.C012005e.A02(r1, r0)
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            android.view.View r1 = r5.A16
            r0 = 2131430365(0x7f0b0bdd, float:1.8482429E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            r5.A15 = r0
            android.view.View r1 = r5.A16
            r0 = 2131428609(0x7f0b0501, float:1.8478867E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            r5.A14 = r0
            android.view.View r1 = r5.A16
            r0 = 2131429873(0x7f0b09f1, float:1.8481431E38)
            com.whatsapp.WaTextView r0 = X.C36401kF.A0Q(r1, r0)
            r5.A19 = r0
            android.view.View r1 = r5.A16
            r0 = 2131429872(0x7f0b09f0, float:1.848143E38)
            com.whatsapp.WaTextView r0 = X.C36401kF.A0Q(r1, r0)
            r5.A0G = r0
            android.view.View r1 = r5.A16
            r0 = 2131428611(0x7f0b0503, float:1.8478871E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            r5.A03 = r0
            android.view.View r1 = r5.A16
            r0 = 2131428623(0x7f0b050f, float:1.8478896E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r5.A18 = r0
            android.view.View r1 = r5.A16
            r0 = 2131433834(0x7f0b196a, float:1.8489465E38)
            r8 = 2131433834(0x7f0b196a, float:1.8489465E38)
            android.widget.LinearLayout r0 = X.C90514aH.A0U(r1, r0)
            r5.A17 = r0
            X.9UA r0 = r5.A0N
            X.0yC r1 = r0.A01
            r0 = 1867(0x74b, float:2.616E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00f1
            android.view.View r1 = r5.A16
            r0 = 2131433839(0x7f0b196f, float:1.8489475E38)
            android.widget.TextView r0 = X.C36391kE.A0O(r1, r0)
            r5.A04 = r0
        L_0x00f1:
            android.view.View r1 = r5.A16
            r0 = 2131433826(0x7f0b1962, float:1.8489449E38)
            X.C012005e.A02(r1, r0)
            android.view.View r1 = r5.A16
            r0 = 2131433835(0x7f0b196b, float:1.8489467E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.C36431kI.A0y(r1, r0)
            r5.A11 = r0
            android.view.View r1 = r5.A16
            r0 = 2131428606(0x7f0b04fe, float:1.8478861E38)
            android.view.View r7 = X.C012005e.A02(r1, r0)
            android.view.View r1 = r5.A16
            int r0 = r5.A1m()
            r1.setMinimumHeight(r0)
            android.view.View r1 = r5.A16
            r0 = 2131434609(0x7f0b1c71, float:1.8491037E38)
            android.view.View r6 = X.C012005e.A02(r1, r0)
            int r1 = r6.getPaddingLeft()
            int r0 = r6.getPaddingRight()
            int r2 = java.lang.Math.max(r1, r0)
            android.view.ViewGroup$MarginLayoutParams r1 = X.AnonymousClass000.A0a(r6)
            X.0ts r0 = r5.A0g
            boolean r0 = X.C36351kA.A1Y(r0)
            if (r0 == 0) goto L_0x0479
            r1.rightMargin = r2
        L_0x0139:
            r6.setLayoutParams(r1)
            android.content.res.Resources r1 = X.C36341k9.A0G(r5)
            r0 = 2131167786(0x7f070a2a, float:1.7949855E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.A02 = r0
            android.content.res.Resources r1 = X.C36341k9.A0G(r5)
            r0 = 2131167785(0x7f070a29, float:1.7949853E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.A01 = r0
            android.app.Dialog r0 = r5.A02
            if (r0 == 0) goto L_0x016b
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x016b
            android.app.Dialog r0 = r5.A02
            android.view.Window r1 = r0.getWindow()
            r0 = 16
            r1.setSoftInputMode(r0)
        L_0x016b:
            com.whatsapp.mentions.MentionableEntry r2 = r5.A0p
            android.content.Context r1 = r5.A0a()
            r0 = 2131896778(0x7f1229ca, float:1.9428427E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setHint(r0)
            X.9Do r1 = r5.A08
            com.whatsapp.jid.UserJid r9 = r5.A0o
            X.1ds r0 = r1.A00
            X.0tq r0 = r0.A02
            X.17Y r12 = X.C36351kA.A0M(r0)
            X.1ds r11 = r1.A00
            X.0tq r10 = r11.A02
            X.0wU r22 = X.C36341k9.A0Z(r10)
            X.004 r0 = r10.A1P
            java.lang.Object r6 = r0.get()
            X.6MH r6 = (X.AnonymousClass6MH) r6
            X.004 r0 = r10.A1Q
            java.lang.Object r2 = r0.get()
            X.6VE r2 = (X.AnonymousClass6VE) r2
            X.004 r0 = r10.A6p
            java.lang.Object r1 = r0.get()
            X.1cM r1 = (X.C31771cM) r1
            X.004 r0 = r10.A1S
            java.lang.Object r0 = r0.get()
            X.1Ws r0 = (X.C29461Ws) r0
            X.1dr r11 = r11.A01
            X.8VB r20 = X.C32581dr.A09(r11)
            X.8V9 r16 = X.C32581dr.A03(r11)
            X.1KK r13 = X.C165587tf.A0L(r10)
            X.9Y1 r19 = X.C165607th.A0P(r10)
            X.9dH r11 = new X.9dH
            r18 = r0
            r21 = r9
            r15 = r2
            r17 = r1
            r14 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.0yC r10 = r5.A0n
            X.9Xp r9 = r5.A0W
            X.0ts r6 = r5.A0g
            X.9Dn r2 = r5.A07
            com.whatsapp.jid.UserJid r1 = r5.A0o
            X.7zo r0 = new X.7zo
            r16 = r5
            r17 = r5
            r12 = r0
            r13 = r2
            r14 = r11
            r15 = r5
            r18 = r9
            r19 = r6
            r20 = r10
            r21 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r5.A0O = r0
            com.whatsapp.jid.UserJid r2 = r5.A0o
            X.9Dm r1 = r5.A06
            X.9xE r0 = new X.9xE
            r0.<init>(r1, r11, r2)
            X.04H r1 = X.C165617ti.A0A(r0, r5)
            java.lang.Class<X.7yb> r0 = X.C167697yb.class
            X.04R r0 = r1.A00(r0)
            X.7yb r0 = (X.C167697yb) r0
            r5.A0P = r0
            X.60S r1 = r5.A09
            com.whatsapp.jid.UserJid r0 = r5.A0o
            X.6Uh r1 = r1.A00(r0)
            X.6iC r0 = new X.6iC
            r0.<init>(r1)
            X.04H r1 = X.C165617ti.A0A(r0, r5)
            java.lang.Class<X.7yS> r0 = X.C167627yS.class
            X.04R r0 = r1.A00(r0)
            X.7yS r0 = (X.C167627yS) r0
            r5.A0Q = r0
            X.04H r1 = X.C36441kJ.A0b(r5)
            java.lang.Class<X.7yL> r0 = X.C167597yL.class
            X.04R r0 = r1.A00(r0)
            X.7yL r0 = (X.C167597yL) r0
            r5.A0R = r0
            r0 = 32
            X.2hx r1 = new X.2hx
            r1.<init>(r5, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = r5.A11
            r0.setOnClickListener(r1)
            X.7yb r0 = r5.A0P
            X.00s r1 = r0.A0E
            r0 = 13
            X.BA6.A00(r5, r1, r0)
            X.0wU r1 = r5.A10
            r0 = 49
            X.C1497072l.A00(r1, r5, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A18
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            r1.setMargins(r4, r4, r4, r4)
            r0 = 2
            r1.addRule(r0, r8)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A18
            r0.setLayoutParams(r1)
            android.widget.LinearLayout r0 = r5.A17
            r0.setVisibility(r4)
            android.view.View r1 = r5.A15
            r0 = 8
            r1.setVisibility(r0)
            r0 = 33
            X.C48732hx.A00(r7, r5, r0)
            android.view.View r1 = r5.A03
            r0 = 34
            X.C48732hx.A00(r1, r5, r0)
            androidx.recyclerview.widget.RecyclerView r2 = r5.A18
            android.content.Context r1 = r5.A0a()
            X.1wt r0 = new X.1wt
            r0.<init>(r1)
            r2.A0t(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r5.A18
            r0 = 1
            r1.A0U = r0
            X.7zo r0 = r5.A0O
            r1.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A18
            X.0By r1 = r0.A0H
            boolean r0 = r1 instanceof X.C02810Bz
            if (r0 == 0) goto L_0x029b
            X.0Bz r1 = (X.C02810Bz) r1
            r1.A00 = r4
        L_0x029b:
            X.7yb r0 = r5.A0P
            X.00s r2 = r0.A08
            X.0Ab r1 = r5.A0m()
            r0 = 12
            X.BA6.A01(r1, r2, r5, r0)
            X.7yb r0 = r5.A0P
            X.00s r2 = r0.A0C
            X.0Ab r1 = r5.A0m()
            r0 = 24
            X.BA6.A01(r1, r2, r5, r0)
            X.7yb r0 = r5.A0P
            X.00s r2 = r0.A03
            X.0Ab r1 = r5.A0m()
            r0 = 18
            X.BA6.A01(r1, r2, r5, r0)
            X.7yb r0 = r5.A0P
            X.00s r2 = r0.A02
            X.0Ab r1 = r5.A0m()
            r0 = 25
            X.BA6.A01(r1, r2, r5, r0)
            X.7yS r0 = r5.A0Q
            X.08S r2 = r0.A01
            X.0Ab r1 = r5.A0m()
            r0 = 22
            X.BA6.A01(r1, r2, r5, r0)
            X.7yS r1 = r5.A0Q
            X.6Uh r1 = r1.A02
            X.1Rs r6 = r1.A0A
            X.0Ab r2 = r5.A0m()
            r1 = 20
            X.BA6.A01(r2, r6, r5, r1)
            X.7yL r1 = r5.A0R
            X.1Rs r6 = r1.A03
            X.0Ab r2 = r5.A0m()
            r1 = 23
            X.BA6.A01(r2, r6, r5, r1)
            X.7yb r1 = r5.A0P
            X.00s r6 = r1.A0A
            X.0Ab r2 = r5.A0m()
            r1 = 11
            X.BA6.A01(r2, r6, r5, r1)
            X.7yb r1 = r5.A0P
            X.00s r6 = r1.A07
            X.0Ab r2 = r5.A0m()
            r1 = 26
            X.BA6.A01(r2, r6, r5, r1)
            X.7yb r1 = r5.A0P
            X.00s r6 = r1.A06
            X.0Ab r2 = r5.A0m()
            r1 = 14
            X.BA6.A01(r2, r6, r5, r1)
            X.7yb r1 = r5.A0P
            X.00s r6 = r1.A09
            X.0Ab r2 = r5.A0m()
            r1 = 15
            X.BA6.A01(r2, r6, r5, r1)
            X.7yb r1 = r5.A0P
            X.00s r6 = r1.A05
            X.0Ab r2 = r5.A0m()
            r1 = 17
            X.BA6.A01(r2, r6, r5, r1)
            X.7yb r1 = r5.A0P
            X.00s r6 = r1.A0D
            X.0Ab r2 = r5.A0m()
            r1 = 19
            X.BA6.A01(r2, r6, r5, r1)
            X.7yb r1 = r5.A0P
            X.00s r6 = r1.A04
            X.0Ab r2 = r5.A0m()
            r1 = 21
            X.BA6.A01(r2, r6, r5, r1)
            X.9UA r1 = r5.A0N
            X.0yC r2 = r1.A01
            r1 = 1867(0x74b, float:2.616E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x037e
            android.widget.TextView r1 = r5.A04
            if (r1 == 0) goto L_0x037e
            X.7yb r1 = r5.A0P
            X.00s r6 = r1.A0B
            X.0Ab r2 = r5.A0m()
            r1 = 16
            X.BA6.A01(r2, r6, r5, r1)
            X.7yb r7 = r5.A0P
            com.whatsapp.jid.UserJid r6 = r5.A0o
            X.9UA r2 = r7.A0H
            X.A8t r1 = new X.A8t
            r1.<init>(r7)
            r2.A00(r1, r6)
        L_0x037e:
            X.7yb r2 = r5.A0P
            r2.A00 = r4
            r1 = 1
            r2.A01 = r1
            X.9dH r6 = r2.A0I
            X.0wU r2 = r6.A0N
            r1 = 43
            X.C1497072l.A00(r2, r6, r1)
            X.7yb r1 = r5.A0P
            X.9dH r6 = r1.A0I
            X.1KK r2 = r6.A0C
            com.whatsapp.jid.UserJid r1 = r6.A0K
            r9 = 2
            X.BAG.A00(r2, r1, r6, r9)
            A08(r5)
            com.whatsapp.WaTextView r8 = r5.A0G
            X.7yb r1 = r5.A0P
            X.185 r7 = r1.A0L
            com.whatsapp.jid.UserJid r6 = r1.A0O
            r2 = 0
            X.3U1 r1 = new X.3U1
            r1.<init>((X.AnonymousClass185) r7, (X.C235618y) r2, (com.whatsapp.jid.UserJid) r6)
            X.3ur r1 = r1.A03
            int r6 = r1.hostStorage
            if (r6 == r9) goto L_0x03b7
            r2 = 1
            r1 = 2131889093(0x7f120bc5, float:1.941284E38)
            if (r6 != r2) goto L_0x03ba
        L_0x03b7:
            r1 = 2131889094(0x7f120bc6, float:1.9412842E38)
        L_0x03ba:
            r8.setText(r1)
            X.01I r16 = r5.A0i()
            X.0yC r1 = r5.A0n
            r18 = r1
            X.1N2 r1 = r5.A0y
            r17 = r1
            X.0wN r15 = r5.A05
            X.1H2 r14 = r5.A0l
            X.1XN r13 = r5.A0k
            X.0yb r12 = r5.A0d
            X.0ts r11 = r5.A0g
            X.62r r10 = r5.A0i
            com.whatsapp.emoji.search.EmojiSearchProvider r9 = r5.A0m
            X.0v0 r8 = r5.A0f
            X.0wg r7 = r5.A0t
            com.whatsapp.KeyboardPopupLayout r6 = r5.A0C
            com.whatsapp.mentions.MentionableEntry r2 = r5.A0p
            java.lang.Integer r32 = java.lang.Integer.valueOf(r0)
            r33 = 0
            X.6O1 r1 = r5.A0j
            X.22t r0 = new X.22t
            r25 = r1
            r26 = r13
            r27 = r14
            r28 = r9
            r29 = r18
            r30 = r7
            r31 = r17
            r22 = r8
            r23 = r11
            r24 = r10
            r19 = r6
            r20 = r2
            r21 = r12
            r17 = r3
            r18 = r15
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r5.A0h = r0
            com.whatsapp.KeyboardPopupLayout r1 = r5.A0C
            r0 = 2131429849(0x7f0b09d9, float:1.8481382E38)
            android.view.View r3 = r1.findViewById(r0)
            com.whatsapp.emoji.search.EmojiSearchContainer r3 = (com.whatsapp.emoji.search.EmojiSearchContainer) r3
            X.22t r2 = r5.A0h
            X.01I r0 = r5.A0i()
            X.3J6 r1 = new X.3J6
            r1.<init>(r0, r2, r3)
            X.7rG r0 = new X.7rG
            r0.<init>(r5, r4)
            r1.A00 = r0
            X.22t r1 = r5.A0h
            X.4Sf r0 = r5.A1A
            r1.A0H(r0)
            X.AVW r0 = new X.AVW
            r0.<init>(r5, r4)
            r1.A0F = r0
            java.util.HashMap r1 = A1C
            com.whatsapp.jid.UserJid r0 = r5.A0o
            java.lang.String r2 = X.C90504aG.A0l(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0457
            java.util.HashMap r1 = A1D
            com.whatsapp.jid.UserJid r0 = r5.A0o
            java.lang.String r0 = X.C90504aG.A0l(r0, r1)
            java.util.ArrayList r1 = X.C65713Te.A03(r0)
            com.whatsapp.mentions.MentionableEntry r0 = r5.A0p
            r0.setMentionableText(r2, r1)
        L_0x0457:
            X.9Y1 r2 = r5.A0U
            X.9Sx r1 = X.C36321k7.A03(r2)
            X.9Y1 r0 = r5.A0U
            X.C36321k7.A0p(r1, r0)
            r0 = 37
            X.C36401kF.A1F(r1, r0)
            r0 = 52
            X.C36411kG.A1G(r1, r0)
            com.whatsapp.jid.UserJid r0 = r5.A0o
            r1.A00 = r0
            r2.A03(r1)
            r5.A03()
            android.view.View r0 = r5.A16
            return r0
        L_0x0479:
            r1.leftMargin = r2
            goto L_0x0139
        L_0x047d:
            java.lang.String r2 = "Conversation"
            goto L_0x0045
        L_0x0481:
            java.lang.String r2 = "PLM"
            goto L_0x0045
        L_0x0485:
            java.lang.String r2 = "Collection"
            goto L_0x0045
        L_0x0489:
            java.lang.String r2 = "Product"
            goto L_0x0045
        L_0x048d:
            java.lang.String r2 = "Catalog"
            goto L_0x0045
        L_0x0491:
            java.lang.String r0 = "CartFragment/logQplCartViewAnnotations/unhandled entry point"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.cart.view.fragment.CartFragment.A1G(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A1M() {
        if (this.A0n.A0E(6715)) {
            this.A0x.A02(this.A0o, 62);
        }
        super.A1M();
    }

    public void A1Q(Bundle bundle) {
        this.A0s.A00(774774619, "cart_view_tag", "CartFragment");
        super.A1Q(bundle);
        this.A0a.registerObserver(this.A1B);
        this.A0W = new C196089Xp(this.A0V, this.A0v);
        if (bundle == null) {
            this.A13 = 2;
            return;
        }
        this.A13 = bundle.getInt("extra_input_method");
        this.A12 = bundle.getBoolean("extra_is_sending_order");
    }

    private void A03() {
        int i;
        int dimensionPixelSize = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        if (C36341k9.A0G(this).getConfiguration().orientation == 1) {
            i = dimensionPixelSize * 2;
        } else {
            dimensionPixelSize /= 2;
            i = dimensionPixelSize;
        }
        ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(this.A19);
        A0a2.topMargin = i;
        this.A19.setLayoutParams(A0a2);
        ViewGroup.MarginLayoutParams A0a3 = AnonymousClass000.A0a(this.A0G);
        A0a3.topMargin = dimensionPixelSize;
        this.A0G.setLayoutParams(A0a3);
    }

    public void A1H() {
        super.A1H();
        this.A0W.A00();
        this.A0a.unregisterObserver(this.A1B);
        this.A0s.A05("cart_view_tag", false);
    }

    public void A1K() {
        MentionableEntry mentionableEntry;
        super.A1K();
        UserJid userJid = this.A0o;
        if (!(userJid == null || (mentionableEntry = this.A0p) == null)) {
            A1C.put(userJid, mentionableEntry.getStringText());
            A1D.put(this.A0o, C65713Te.A01(this.A0p.getMentions()));
        }
        if (this.A00 == 1) {
            A0i().setRequestedOrientation(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r1 != 2) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1L() {
        /*
            r5 = this;
            super.A1L()
            X.01I r3 = r5.A0i()
            int r1 = r5.A13
            if (r1 == 0) goto L_0x005c
            r0 = 1
            r4 = 2
            if (r1 == r0) goto L_0x0041
            if (r1 == r4) goto L_0x0054
        L_0x0011:
            X.7yb r1 = r5.A0P
            r0 = 0
            r1.A00 = r0
            r0 = 1
            r1.A01 = r0
            X.9dH r2 = r1.A0I
            X.0wU r1 = r2.A0N
            r0 = 43
            X.C1497072l.A00(r1, r2, r0)
            X.7yS r0 = r5.A0Q
            X.6Uh r2 = r0.A02
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0C
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L_0x003b
            X.00s r0 = r2.A01
            X.C36341k9.A19(r0, r1)
            X.0wU r1 = r2.A0B
            r0 = 45
            X.C1497072l.A00(r1, r2, r0)
        L_0x003b:
            r0 = 10
            r3.setRequestedOrientation(r0)
            return
        L_0x0041:
            X.22t r0 = r5.A0h
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x0054
            com.whatsapp.KeyboardPopupLayout r2 = r5.A0C
            r1 = 1
            X.AVW r0 = new X.AVW
            r0.<init>(r5, r1)
            r2.post(r0)
        L_0x0054:
            android.view.Window r0 = r3.getWindow()
            r0.setSoftInputMode(r4)
            goto L_0x0011
        L_0x005c:
            android.view.Window r1 = r3.getWindow()
            r0 = 4
            r1.setSoftInputMode(r0)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.cart.view.fragment.CartFragment.A1L():void");
    }

    public void A1R(Bundle bundle) {
        int i;
        super.A1R(bundle);
        if (this.A0h.isShowing()) {
            i = 1;
        } else {
            i = 2;
            if (AnonymousClass1N2.A00(this.A0C)) {
                i = 0;
            }
        }
        this.A13 = i;
        bundle.putInt("extra_input_method", i);
        bundle.putBoolean("extra_is_sending_order", this.A12);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        C011004s.A09(view, true);
    }

    public int A1Y() {
        return R.style.f13nameremoved;
    }

    public void A1n(View view) {
        super.A1n(view);
        BottomSheetBehavior.A02(view).A0d(false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A03();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.A0n.A0E(6715)) {
            C1497072l.A00(this.A10, this, 48);
        }
        AnonymousClass01I A0h2 = A0h();
        if (A0h2 instanceof C225314u) {
            ((C225314u) A0h2).A2x(0);
        }
    }
}
