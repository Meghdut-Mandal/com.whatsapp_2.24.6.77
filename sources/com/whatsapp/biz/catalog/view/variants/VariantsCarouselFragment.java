package com.whatsapp.biz.catalog.view.variants;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01z;
import X.AnonymousClass5X0;
import X.AnonymousClass6YS;
import X.AnonymousClass7U4;
import X.C1255260f;
import X.C128866Dx;
import X.C165147sx;
import X.C36331k8;
import X.C36441kJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public final class VariantsCarouselFragment extends Hilt_VariantsCarouselFragment {
    public C1255260f A00;
    public C128866Dx A01;
    public C128866Dx A02;
    public VariantsCarouselFragmentViewModel A03;
    public ShimmerFrameLayout A04;
    public ShimmerFrameLayout A05;
    public UserJid A06;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C128866Dx r2;
        C128866Dx r22;
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        this.A04 = (ShimmerFrameLayout) inflate.findViewById(R.id.variants_container1);
        this.A05 = (ShimmerFrameLayout) inflate.findViewById(R.id.variants_container2);
        ShimmerFrameLayout shimmerFrameLayout = this.A04;
        if (!(shimmerFrameLayout == null || (r22 = this.A01) == null)) {
            UserJid userJid = this.A06;
            if (userJid == null) {
                throw C36331k8.A0d("bizJid");
            }
            AnonymousClass01z A0k = A0k();
            AnonymousClass00C.A08(A0k);
            r22.A01(A0k, this, shimmerFrameLayout, userJid);
        }
        ShimmerFrameLayout shimmerFrameLayout2 = this.A05;
        if (!(shimmerFrameLayout2 == null || (r2 = this.A02) == null)) {
            UserJid userJid2 = this.A06;
            if (userJid2 == null) {
                throw C36331k8.A0d("bizJid");
            }
            AnonymousClass01z A0k2 = A0k();
            AnonymousClass00C.A08(A0k2);
            r2.A01(A0k2, this, shimmerFrameLayout2, userJid2);
        }
        C128866Dx r23 = this.A01;
        if (r23 != null) {
            r23.A04 = new AnonymousClass6YS(this, 1);
        }
        C128866Dx r24 = this.A02;
        if (r24 != null) {
            r24.A04 = new AnonymousClass6YS(this, 0);
        }
        return inflate;
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        VariantsCarouselFragmentViewModel variantsCarouselFragmentViewModel = this.A03;
        if (variantsCarouselFragmentViewModel == null) {
            throw C36331k8.A0d("viewModel");
        }
        C165147sx.A02(A0m(), variantsCarouselFragmentViewModel.A04, AnonymousClass5X0.A02(this, 4), 36);
        VariantsCarouselFragmentViewModel variantsCarouselFragmentViewModel2 = this.A03;
        if (variantsCarouselFragmentViewModel2 == null) {
            throw C36331k8.A0d("viewModel");
        }
        C165147sx.A02(A0m(), variantsCarouselFragmentViewModel2.A08, new AnonymousClass7U4(view, this), 37);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c7, code lost:
        if (r0.A01.A01.size() > 15) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C134606bJ r7, X.C128866Dx r8, com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment r9, X.C134746bX r10, java.lang.Integer r11, int r12) {
        /*
            if (r11 == 0) goto L_0x00f8
            int r1 = r11.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x001e
            if (r8 == 0) goto L_0x0149
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.variants.VariantsDisplayData<com.whatsapp.biz.catalog.data.variants.ProductVariantTypeOption.ThumbnailOption>"
            X.AnonymousClass00C.A0E(r10, r0)
            r0 = 1
            r8.A00 = r0
        L_0x0013:
            X.63M r2 = r8.A06
            java.lang.String r6 = "titleController"
            if (r2 != 0) goto L_0x0045
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x001e:
            r0 = 2
            if (r1 != r0) goto L_0x00f8
            if (r8 == 0) goto L_0x0149
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.variants.VariantsDisplayData<com.whatsapp.biz.catalog.data.variants.ProductVariantTypeOption.TextOption>"
            X.AnonymousClass00C.A0E(r10, r0)
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel r0 = r9.A03
            if (r0 != 0) goto L_0x0031
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x0031:
            boolean r1 = r0.A03
            r0 = 2
            r8.A00 = r0
            X.6NO r0 = r8.A03
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = "dropdownController"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0041:
            r0.A01(r7, r10, r12, r1)
            goto L_0x0013
        L_0x0045:
            java.lang.String r1 = r10.A00
            int r0 = r8.A00
            r2.A01 = r1
            r2.A00 = r0
            com.facebook.shimmer.ShimmerFrameLayout r0 = r8.A02
            java.lang.String r4 = "shimmerView"
            if (r0 != 0) goto L_0x0058
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x0058:
            r0.A01()
            X.63M r1 = r8.A06
            if (r1 != 0) goto L_0x0064
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x0064:
            r5 = 0
            r0 = 0
            r2 = -1
            android.widget.TextView r1 = r1.A02
            r1.setBackground(r0)
            r0 = -2
            X.C90514aH.A1J(r1, r2, r0)
            java.util.List r0 = r10.A01
            boolean r1 = r0.isEmpty()
            r3 = 8
            com.facebook.shimmer.ShimmerFrameLayout r0 = r8.A02
            if (r1 == 0) goto L_0x0097
            if (r0 != 0) goto L_0x0083
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x0083:
            r0.setVisibility(r3)
            X.63M r0 = r8.A06
            if (r0 != 0) goto L_0x008f
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x008f:
            android.widget.TextView r1 = r0.A02
            java.lang.String r0 = r0.A01
            r1.setText(r0)
            goto L_0x00ed
        L_0x0097:
            if (r0 != 0) goto L_0x009e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x009e:
            r0.setVisibility(r5)
            androidx.recyclerview.widget.RecyclerView r2 = r8.A01
            if (r2 != 0) goto L_0x00ac
            java.lang.String r0 = "carouselView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00ac:
            int r1 = r8.A00
            r0 = 2
            r4 = 1
            if (r1 != r0) goto L_0x00ca
            X.6NO r0 = r8.A03
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = "dropdownController"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00bd:
            X.6bX r0 = r0.A01
            java.util.List r0 = r0.A01
            int r1 = r0.size()
            r0 = 15
            if (r1 <= r0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r3 = 0
        L_0x00cb:
            r2.setVisibility(r3)
            X.6bJ r3 = X.C129376Gr.A01(r10, r12)
            X.63M r2 = r8.A06
            if (r2 != 0) goto L_0x00db
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x00db:
            java.lang.String r1 = r3.A01
            java.util.Map r0 = r10.A02
            X.6bO r0 = X.C129376Gr.A00(r3, r7, r0)
            if (r0 == 0) goto L_0x00ea
            boolean r0 = r0.A02
            if (r0 != r4) goto L_0x00ea
            r5 = 1
        L_0x00ea:
            r2.A00(r1, r5)
        L_0x00ed:
            X.4mh r1 = r8.A05
            if (r1 != 0) goto L_0x013d
            java.lang.String r0 = "adapter"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00f8:
            if (r8 == 0) goto L_0x0149
            com.facebook.shimmer.ShimmerFrameLayout r1 = r8.A02
            java.lang.String r0 = "shimmerView"
            if (r1 != 0) goto L_0x0105
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0105:
            r1.A01()
            com.facebook.shimmer.ShimmerFrameLayout r1 = r8.A02
            if (r1 != 0) goto L_0x0111
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0111:
            r0 = 8
            r1.setVisibility(r0)
            X.63M r1 = r8.A06
            java.lang.String r3 = "titleController"
            if (r1 != 0) goto L_0x0121
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0121:
            r0 = 0
            r2 = -1
            android.widget.TextView r1 = r1.A02
            r1.setBackground(r0)
            r0 = -2
            X.C90514aH.A1J(r1, r2, r0)
            X.63M r0 = r8.A06
            if (r0 != 0) goto L_0x0135
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0135:
            android.widget.TextView r1 = r0.A02
            java.lang.String r0 = r0.A01
            r1.setText(r0)
            return
        L_0x013d:
            r1.A03 = r10
            r0 = 0
            r1.A04 = r0
            r1.A01 = r7
            r1.A00 = r12
            r1.A06()
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment.A00(X.6bJ, X.6Dx, com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment, X.6bX, java.lang.Integer, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d7, code lost:
        r1 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01df, code lost:
        r10 = r0.A02;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1Y(X.C207269up r21, X.C006302t r22, boolean r23) {
        /*
            r20 = this;
            r19 = r20
            r0 = r19
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel r0 = r0.A03
            r18 = r0
            java.lang.String r17 = "viewModel"
            if (r0 != 0) goto L_0x0011
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r17)
            throw r0
        L_0x0011:
            r2 = r21
            r0.A00 = r2
            r1 = r23
            r0.A02 = r1
            X.00s r4 = r0.A05
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            if (r21 == 0) goto L_0x0270
            X.6bW r1 = r2.A0B
            if (r1 == 0) goto L_0x0270
            X.6JL r14 = r0.A06
            r11 = 0
            X.6bD r0 = r1.A00
            r12 = 0
            r10 = 1
            if (r0 == 0) goto L_0x008e
            java.util.List r5 = r0.A00
            if (r5 == 0) goto L_0x008e
            boolean r0 = X.C36401kF.A1a(r5)
            if (r0 == 0) goto L_0x008e
        L_0x0038:
            java.util.List r0 = r1.A03
            if (r0 == 0) goto L_0x0270
            java.lang.Object r7 = X.C007103b.A0M(r0)
            X.6b5 r7 = (X.C134466b5) r7
            if (r7 == 0) goto L_0x0270
            java.lang.Object r2 = X.C007103b.A0P(r0, r10)
            X.6b5 r2 = (X.C134466b5) r2
            java.util.HashMap r13 = X.AnonymousClass001.A0J()
            if (r2 == 0) goto L_0x00ce
            java.util.List r0 = r7.A00()
            java.util.Iterator r15 = r0.iterator()
            r1 = 0
        L_0x0059:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r8 = r15.next()
            int r9 = r1 + 1
            if (r1 >= 0) goto L_0x006c
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x006c:
            X.6b4 r8 = (X.C134456b4) r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            boolean r0 = r7 instanceof X.C102224zW
            if (r0 == 0) goto L_0x0088
            r0 = r7
            X.4zW r0 = (X.C102224zW) r0
            java.lang.String r1 = r0.A00
        L_0x007b:
            java.lang.String r0 = r8.A00()
            X.011 r0 = X.C36441kJ.A19(r1, r0)
            r13.put(r0, r6)
            r1 = r9
            goto L_0x0059
        L_0x0088:
            r0 = r7
            X.4zV r0 = (X.C102214zV) r0
            java.lang.String r1 = r0.A00
            goto L_0x007b
        L_0x008e:
            r5 = r12
            goto L_0x0038
        L_0x0090:
            java.util.List r0 = r2.A00()
            java.util.Iterator r15 = r0.iterator()
            r1 = 0
        L_0x0099:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r8 = r15.next()
            int r9 = r1 + 1
            if (r1 >= 0) goto L_0x00ac
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x00ac:
            X.6b4 r8 = (X.C134456b4) r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            boolean r0 = r2 instanceof X.C102224zW
            if (r0 == 0) goto L_0x00c8
            r0 = r2
            X.4zW r0 = (X.C102224zW) r0
            java.lang.String r1 = r0.A00
        L_0x00bb:
            java.lang.String r0 = r8.A00()
            X.011 r0 = X.C36441kJ.A19(r1, r0)
            r13.put(r0, r6)
            r1 = r9
            goto L_0x0099
        L_0x00c8:
            r0 = r2
            X.4zV r0 = (X.C102214zV) r0
            java.lang.String r1 = r0.A00
            goto L_0x00bb
        L_0x00ce:
            if (r5 == 0) goto L_0x0270
            java.util.LinkedHashMap r9 = X.C36431kI.A1G()
            java.util.HashMap r8 = X.AnonymousClass001.A0J()
            java.util.Iterator r16 = r5.iterator()
        L_0x00dc:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r0 = r16.next()
            X.6bO r0 = (X.C134656bO) r0
            java.util.List r15 = r0.A01
            if (r15 != 0) goto L_0x00ee
            X.09w r15 = X.C023409w.A00
        L_0x00ee:
            int r5 = r15.size()
            r1 = 2
            if (r5 <= r1) goto L_0x0147
            java.lang.String r0 = "areOptionsValid: found unexpected number of options. Maximum 2 is supported"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00fa:
            boolean r0 = r7 instanceof X.C102224zW
            if (r0 == 0) goto L_0x0141
            r0 = r7
            X.4zW r0 = (X.C102224zW) r0
            java.lang.String r13 = r0.A00
        L_0x0103:
            X.0yC r6 = r14.A00
            r5 = 4982(0x1376, float:6.981E-42)
            boolean r0 = r6.A0E(r5)
            if (r0 == 0) goto L_0x0211
            java.util.List r0 = r7.A00()
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.Iterator r15 = r0.iterator()
        L_0x0119:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0215
            java.lang.Object r14 = r15.next()
            r0 = r14
            X.6b4 r0 = (X.C134456b4) r0
            java.lang.String r0 = r0.A00()
            X.6bJ r1 = new X.6bJ
            r1.<init>(r13, r0)
            java.lang.Object r0 = r8.get(r1)
            if (r0 != 0) goto L_0x013d
            if (r2 != 0) goto L_0x0119
            X.6bO r0 = X.C129376Gr.A00(r1, r12, r9)
            if (r0 == 0) goto L_0x0119
        L_0x013d:
            r7.add(r14)
            goto L_0x0119
        L_0x0141:
            r0 = r7
            X.4zV r0 = (X.C102214zV) r0
            java.lang.String r13 = r0.A00
            goto L_0x0103
        L_0x0147:
            java.lang.Object r6 = r15.get(r11)
            X.6bJ r6 = (X.C134606bJ) r6
            java.lang.Object r5 = X.C007103b.A0P(r15, r10)
            X.6bJ r5 = (X.C134606bJ) r5
            X.011 r1 = X.C36441kJ.A19(r6, r5)
            r9.put(r1, r0)
            if (r5 == 0) goto L_0x00dc
            java.lang.Object r15 = r8.get(r5)
            X.011 r15 = (X.AnonymousClass011) r15
            X.0yC r10 = r14.A00
            r1 = 4982(0x1376, float:6.981E-42)
            boolean r1 = r10.A0E(r1)
            if (r1 == 0) goto L_0x01e4
            if (r15 == 0) goto L_0x019a
            java.lang.Object r1 = r15.first
            X.6bJ r1 = (X.C134606bJ) r1
            X.6bO r1 = X.C129376Gr.A00(r1, r5, r9)
            if (r1 == 0) goto L_0x01df
            boolean r10 = r0.A02
            boolean r1 = r1.A02
            if (r10 != r1) goto L_0x01df
        L_0x017e:
            java.lang.Object r1 = r15.first
            X.6bJ r1 = (X.C134606bJ) r1
            X.6bO r1 = X.C129376Gr.A00(r1, r5, r9)
            if (r1 == 0) goto L_0x019d
            boolean r1 = r1.A02
            if (r10 != r1) goto L_0x019d
            int r10 = X.C90474aD.A08(r15)
            java.lang.Number r1 = X.C134606bJ.A00(r6, r13)
            int r1 = r1.intValue()
            if (r10 <= r1) goto L_0x019d
        L_0x019a:
            X.AnonymousClass6JL.A00(r5, r6, r13, r8)
        L_0x019d:
            java.lang.Object r10 = r8.get(r6)
            X.011 r10 = (X.AnonymousClass011) r10
            if (r10 == 0) goto L_0x01db
            java.lang.Object r1 = r10.first
            X.6bJ r1 = (X.C134606bJ) r1
            X.6bO r15 = X.C129376Gr.A00(r1, r6, r9)
            if (r15 == 0) goto L_0x01d7
            boolean r1 = r0.A02
            boolean r15 = r15.A02
            if (r1 != r15) goto L_0x01d7
        L_0x01b5:
            java.lang.Object r0 = r10.first
            X.6bJ r0 = (X.C134606bJ) r0
            X.6bO r0 = X.C129376Gr.A00(r0, r6, r9)
            if (r0 == 0) goto L_0x01c6
            boolean r0 = r0.A02
            if (r1 != r0) goto L_0x01c6
        L_0x01c3:
            r10 = 1
            goto L_0x00dc
        L_0x01c6:
            if (r1 == 0) goto L_0x01c3
            int r1 = X.C90474aD.A08(r10)
            java.lang.Number r0 = X.C134606bJ.A00(r5, r13)
            int r0 = r0.intValue()
            if (r1 <= r0) goto L_0x01c3
            goto L_0x01db
        L_0x01d7:
            boolean r1 = r0.A02
            if (r1 == 0) goto L_0x01b5
        L_0x01db:
            X.AnonymousClass6JL.A00(r6, r5, r13, r8)
            goto L_0x01c3
        L_0x01df:
            boolean r10 = r0.A02
            if (r10 == 0) goto L_0x017e
            goto L_0x019a
        L_0x01e4:
            if (r15 == 0) goto L_0x01f4
            int r1 = X.C90474aD.A08(r15)
            java.lang.Number r0 = X.C134606bJ.A00(r6, r13)
            int r0 = r0.intValue()
            if (r1 <= r0) goto L_0x01f7
        L_0x01f4:
            X.AnonymousClass6JL.A00(r5, r6, r13, r8)
        L_0x01f7:
            java.lang.Object r0 = r8.get(r6)
            X.011 r0 = (X.AnonymousClass011) r0
            if (r0 == 0) goto L_0x020d
            int r1 = X.C90474aD.A08(r0)
            java.lang.Number r0 = X.C134606bJ.A00(r5, r13)
            int r0 = r0.intValue()
            if (r1 <= r0) goto L_0x01c3
        L_0x020d:
            X.AnonymousClass6JL.A00(r6, r5, r13, r8)
            goto L_0x01c3
        L_0x0211:
            java.util.List r7 = r7.A00()
        L_0x0215:
            X.6bX r1 = new X.6bX
            r1.<init>(r13, r7, r9, r8)
            if (r2 == 0) goto L_0x0273
            r0 = 2
            X.6bX[] r7 = new X.C134746bX[r0]
            r7[r11] = r1
            boolean r0 = r2 instanceof X.C102224zW
            if (r0 == 0) goto L_0x025c
            r0 = r2
            X.4zW r0 = (X.C102224zW) r0
            java.lang.String r11 = r0.A00
        L_0x022a:
            boolean r0 = r6.A0E(r5)
            if (r0 == 0) goto L_0x0262
            java.util.List r0 = r2.A00()
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r5 = r0.iterator()
        L_0x023c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0266
            java.lang.Object r2 = r5.next()
            r0 = r2
            X.6b4 r0 = (X.C134456b4) r0
            java.lang.String r1 = r0.A00()
            X.6bJ r0 = new X.6bJ
            r0.<init>(r11, r1)
            java.lang.Object r0 = r8.get(r0)
            if (r0 == 0) goto L_0x023c
            r6.add(r2)
            goto L_0x023c
        L_0x025c:
            r0 = r2
            X.4zV r0 = (X.C102214zV) r0
            java.lang.String r11 = r0.A00
            goto L_0x022a
        L_0x0262:
            java.util.List r6 = r2.A00()
        L_0x0266:
            X.6bX r0 = new X.6bX
            r0.<init>(r11, r6, r9, r8)
            java.util.List r7 = X.C90524aI.A0p(r0, r7, r10)
            goto L_0x0277
        L_0x0270:
            X.09w r7 = X.C023409w.A00
            goto L_0x027a
        L_0x0273:
            java.util.List r7 = java.util.Collections.singletonList(r1)
        L_0x0277:
            X.AnonymousClass00C.A08(r7)
        L_0x027a:
            r0 = r18
            X.9up r0 = r0.A00
            r1 = 0
            if (r0 == 0) goto L_0x02e5
            X.6bW r2 = r0.A0B
        L_0x0283:
            r6 = 0
            r0 = r18
            X.6Cp r0 = com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel.A01(r2, r0, r7, r6)
            r3.add(r0)
            r0 = r18
            X.9up r0 = r0.A00
            if (r0 == 0) goto L_0x02e3
            X.6bW r5 = r0.A0B
        L_0x0295:
            r2 = 1
            r0 = r18
            X.6Cp r0 = com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel.A01(r5, r0, r7, r2)
            r3.add(r0)
            r0 = r18
            X.9up r0 = r0.A00
            if (r0 == 0) goto L_0x02e1
            X.6bW r0 = r0.A0B
            if (r0 == 0) goto L_0x02e1
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x02e1
            java.lang.Object r0 = X.C007103b.A0P(r0, r6)
        L_0x02b1:
            boolean r0 = r0 instanceof X.C102224zW
            if (r0 != 0) goto L_0x02ce
            r0 = r18
            X.9up r0 = r0.A00
            if (r0 == 0) goto L_0x02c7
            X.6bW r0 = r0.A0B
            if (r0 == 0) goto L_0x02c7
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x02c7
            java.lang.Object r1 = X.C007103b.A0P(r0, r2)
        L_0x02c7:
            boolean r0 = r1 instanceof X.C102224zW
            if (r0 == 0) goto L_0x02ce
            java.util.Collections.reverse(r3)
        L_0x02ce:
            X.68e r0 = new X.68e
            r0.<init>(r3)
            r4.A0C(r0)
            r0 = r19
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel r0 = r0.A03
            if (r0 != 0) goto L_0x02e7
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r17)
            throw r0
        L_0x02e1:
            r0 = r1
            goto L_0x02b1
        L_0x02e3:
            r5 = r1
            goto L_0x0295
        L_0x02e5:
            r2 = r1
            goto L_0x0283
        L_0x02e7:
            r1 = r22
            r0.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment.A1Y(X.9up, X.02t, boolean):void");
    }

    public void A1Q(Bundle bundle) {
        UserJid userJid;
        super.A1Q(bundle);
        this.A03 = (VariantsCarouselFragmentViewModel) C36441kJ.A0b(this).A00(VariantsCarouselFragmentViewModel.class);
        Bundle bundle2 = this.A0A;
        if (bundle2 == null || (userJid = (UserJid) bundle2.getParcelable("extra_product_owner_jid")) == null) {
            throw AnonymousClass001.A09("VariantsCarouselFragment requires a product owner id");
        }
        this.A06 = userJid;
    }
}
