package X;

import android.view.View;
import androidx.cardview.widget.CardView;

/* renamed from: X.1z4  reason: invalid class name and case insensitive filesystem */
public abstract class C42591z4 extends AnonymousClass0D3 {
    public final View A00;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if ((r9 instanceof X.AnonymousClass2c6) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.AnonymousClass2HU
            if (r0 == 0) goto L_0x0074
            r0 = r8
            X.2HU r0 = (X.AnonymousClass2HU) r0
            boolean r1 = r9 instanceof X.C46872bo
            r3 = 1
            if (r1 != 0) goto L_0x0015
            boolean r1 = r9 instanceof X.C181778o1
            if (r1 != 0) goto L_0x0015
            boolean r2 = r9 instanceof X.AnonymousClass2c6
            r1 = 0
            if (r2 == 0) goto L_0x0016
        L_0x0015:
            r1 = 1
        L_0x0016:
            X.C18740tg.A0B(r1)
            android.view.View r1 = r0.A00
            boolean r2 = r1 instanceof android.widget.FrameLayout
            X.C18740tg.A0B(r2)
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageMedia"
            X.AnonymousClass00C.A0E(r9, r2)
            r6 = r9
            X.2bU r6 = (X.AnonymousClass2bU) r6
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.FrameLayout"
            X.AnonymousClass00C.A0E(r1, r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.2IQ r2 = r0.A00
            if (r2 != 0) goto L_0x00c8
            boolean r2 = r6 instanceof X.C46872bo
            if (r2 == 0) goto L_0x004c
            android.content.Context r3 = r0.A02
            X.01z r4 = r0.A03
            X.2bo r6 = (X.C46872bo) r6
            X.4Uw r5 = r0.A04
            int r7 = r0.A01
            X.8ZI r2 = new X.8ZI
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0046:
            r0.A00 = r2
            r1.addView(r2)
        L_0x004b:
            return
        L_0x004c:
            boolean r2 = r6 instanceof X.C181778o1
            if (r2 == 0) goto L_0x0060
            android.content.Context r3 = r0.A02
            X.01z r4 = r0.A03
            X.8o1 r6 = (X.C181778o1) r6
            X.4Uw r5 = r0.A04
            int r7 = r0.A01
            X.8Zh r2 = new X.8Zh
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0046
        L_0x0060:
            boolean r2 = r6 instanceof X.AnonymousClass2c6
            if (r2 == 0) goto L_0x00c1
            android.content.Context r3 = r0.A02
            X.01z r4 = r0.A03
            X.2c6 r6 = (X.AnonymousClass2c6) r6
            X.4Uw r5 = r0.A04
            int r7 = r0.A01
            X.8Zb r2 = new X.8Zb
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0046
        L_0x0074:
            boolean r1 = r8 instanceof X.AnonymousClass2HT
            boolean r0 = r9 instanceof X.AnonymousClass3I9
            if (r1 == 0) goto L_0x0090
            if (r0 == 0) goto L_0x004b
            X.3I9 r9 = (X.AnonymousClass3I9) r9
            if (r9 == 0) goto L_0x004b
            android.view.View r1 = r8.A00
            boolean r0 = r1 instanceof X.C43532Ij
        L_0x0084:
            if (r0 == 0) goto L_0x004b
            X.2Ir r1 = (X.C43562Ir) r1
            if (r1 == 0) goto L_0x004b
            X.2bV r0 = r9.A01
            r1.A01(r0)
            return
        L_0x0090:
            if (r0 == 0) goto L_0x004b
            X.3I9 r9 = (X.AnonymousClass3I9) r9
            if (r9 == 0) goto L_0x004b
            int r0 = r9.A00
            boolean r4 = X.AnonymousClass000.A1O(r0)
            android.view.View r3 = r8.A0H
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.content.res.Resources r1 = X.C36341k9.A0F(r3)
            r0 = 2131166085(0x7f070385, float:1.7946405E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.height = r0
            if (r4 == 0) goto L_0x00bc
            r0 = -1
        L_0x00b2:
            r2.width = r0
            r3.setLayoutParams(r2)
            android.view.View r1 = r8.A00
            boolean r0 = r1 instanceof X.C43522Ii
            goto L_0x0084
        L_0x00bc:
            int r0 = X.AnonymousClass3R4.A02(r3)
            goto L_0x00b2
        L_0x00c1:
            java.lang.String r0 = "InteractiveMessageCarouselViewHolder/createConversationRowInteractive; unsupported message type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x00c8:
            X.3T1 r9 = (X.AnonymousClass3T1) r9
            r2.A22(r9, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42591z4.A0B(java.lang.Object):void");
    }

    public C42591z4(CardView cardView) {
        super(cardView);
        View A0L = C36411kG.A0L(cardView);
        AnonymousClass00C.A08(A0L);
        this.A00 = A0L;
    }
}
