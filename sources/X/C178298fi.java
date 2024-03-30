package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.8fi  reason: invalid class name and case insensitive filesystem */
public final class C178298fi extends C168107zi {
    public final C02840Cc A00 = new C02840Cc((C02830Cb) new C23136B6u(1), (AnonymousClass0CZ) this);
    public final C18820ts A01;
    public final AnonymousClass1GQ A02;

    public C178298fi(AnonymousClass012 r9, AnonymousClass1RY r10, C18820ts r11, AnonymousClass1GQ r12, AnonymousClass3ET r13, C167707yf r14, boolean z) {
        super(r9, r10, r13, r14, z);
        this.A01 = r11;
        this.A02 = r12;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        boolean A0E = this.A02.A00.A0E(5185);
        int i2 = R.layout.f9nameremoved;
        if (A0E) {
            i2 = R.layout.f9nameremoved;
        }
        if (i == 0) {
            return new C178258fe(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, i2, false), this);
        }
        List list = AnonymousClass0D3.A0I;
        int i3 = R.layout.f9nameremoved;
        if (i == 2) {
            i3 = R.layout.f9nameremoved;
        }
        return new AnonymousClass803(C36371kC.A0J(C36351kA.A0C(viewGroup), viewGroup, i3, false), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0097, code lost:
        if (r3.isEmpty() != false) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BSE(X.AnonymousClass0D3 r13, int r14) {
        /*
            r12 = this;
            X.803 r13 = (X.AnonymousClass803) r13
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            X.0Cc r0 = r12.A00
            java.util.List r0 = r0.A03
            java.lang.Object r7 = r0.get(r14)
            X.9X9 r7 = (X.AnonymousClass9X9) r7
            X.AnonymousClass00C.A0B(r7)
            r6 = 0
            X.AnonymousClass00C.A0D(r7, r6)
            X.8fi r5 = r13.A04
            X.0ts r0 = r5.A01
            java.text.NumberFormat r1 = r0.A0M()
            int r0 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = r1.format(r0)
            boolean r9 = r7.A05
            boolean r4 = r13 instanceof X.C178258fe
            android.widget.TextView r10 = r13.A01
            r2 = 0
            r11 = 1
            if (r9 == 0) goto L_0x0040
            android.content.Context r1 = X.C36441kJ.A0F(r13)
            if (r4 == 0) goto L_0x00e7
            r0 = 2131891540(0x7f121554, float:1.9417803E38)
            java.lang.String r3 = r1.getString(r0)
        L_0x0040:
            r10.setText(r3)
            android.widget.TextView r0 = r13.A02
            if (r9 != 0) goto L_0x0049
            r2 = 8
        L_0x0049:
            r0.setVisibility(r2)
            com.whatsapp.TextEmojiLabel r8 = r13.A03
            java.lang.String r0 = r7.A03
            r8.A0I(r0)
            X.Aj4 r2 = new X.Aj4
            r2.<init>(r5, r7)
            android.view.View r3 = r13.A0H
            r1 = 37
            X.3Y4 r0 = new X.3Y4
            r0.<init>(r2, r1)
            r3.setOnClickListener(r0)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = X.C36361kB.A09(r3)
            r0 = 16843534(0x101030e, float:2.369575E-38)
            r1.resolveAttribute(r0, r2, r11)
            int r0 = r2.resourceId
            r3.setBackgroundResource(r0)
            java.lang.CharSequence r0 = r10.getText()
            r3.setContentDescription(r0)
            r8.setSelected(r9)
            java.util.List r1 = r7.A04
            if (r1 == 0) goto L_0x00e5
            r0 = 5
            java.util.List r3 = X.C007103b.A0a(r1, r0)
        L_0x008b:
            com.whatsapp.contact.FacepileView r8 = r13.A00
            r2 = 0
            if (r8 == 0) goto L_0x009e
            if (r3 == 0) goto L_0x0099
            boolean r1 = r3.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x009b
        L_0x0099:
            r0 = 8
        L_0x009b:
            r8.setVisibility(r0)
        L_0x009e:
            if (r3 == 0) goto L_0x00f0
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00f0
            if (r8 == 0) goto L_0x00af
            int r0 = r3.size()
            r8.setContactsSize(r0)
        L_0x00af:
            java.util.Iterator r9 = r3.iterator()
        L_0x00b3:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00f0
            java.lang.Object r0 = r9.next()
            int r3 = r2 + 1
            if (r2 >= 0) goto L_0x00c6
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x00c6:
            X.9Vi r0 = (X.AnonymousClass9Vi) r0
            if (r8 == 0) goto L_0x00dd
            com.whatsapp.WaImageView r2 = r8.A02(r2)
            if (r2 == 0) goto L_0x00dd
            X.141 r1 = r0.A00
            if (r1 != 0) goto L_0x00df
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x00dd
            X.3ET r0 = r5.A02
            r0.A00(r2, r1)
        L_0x00dd:
            r2 = r3
            goto L_0x00b3
        L_0x00df:
            X.1RY r0 = r5.A01
            r0.A08(r2, r1)
            goto L_0x00dd
        L_0x00e5:
            r3 = 0
            goto L_0x008b
        L_0x00e7:
            r0 = 2131891475(0x7f121513, float:1.9417671E38)
            java.lang.String r3 = X.C36351kA.A0w(r1, r3, r11, r0)
            goto L_0x0040
        L_0x00f0:
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x011d
            if (r4 == 0) goto L_0x011d
            X.8fe r13 = (X.C178258fe) r13
            if (r13 == 0) goto L_0x011d
            X.7yf r0 = r12.A03
            android.widget.ImageView r5 = r13.A00
            X.3T1 r4 = r7.A01
            X.AnonymousClass00C.A0D(r5, r6)
            X.00s r3 = X.C36431kI.A0S()
            X.1SV r2 = r0.A09
            X.9no r0 = new X.9no
            r0.<init>(r5, r3, r11)
            r2.A0C(r5, r4, r0)
            X.012 r2 = r12.A00
            X.AmR r1 = new X.AmR
            r1.<init>(r13)
            r0 = 27
            X.BA8.A01(r2, r3, r1, r0)
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178298fi.BSE(X.0D3, int):void");
    }

    public int getItemViewType(int i) {
        C187978yq r0;
        if (!((AnonymousClass9X9) this.A00.A03.get(i)).A05) {
            r0 = C187978yq.COUNTER_ITEM;
        } else if (this.A04) {
            r0 = C187978yq.MEDIA_ITEM;
        } else {
            r0 = C187978yq.COUNTER_WITH_MY_REACTION;
        }
        return r0.ordinal();
    }
}
