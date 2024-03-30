package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.2LG  reason: invalid class name */
public final class AnonymousClass2LG extends C33341fA {
    public static final int[] A06 = {R.id.contact_icon1, R.id.contact_icon2, R.id.contact_icon3, R.id.contact_icon4, R.id.contact_icon5};
    public final AnonymousClass171 A00;
    public final AnonymousClass1RY A01;
    public final C18820ts A02;
    public final C33541fX A03;
    public final C32931eR A04;
    public final C32881eL A05;

    public AnonymousClass2LG(AnonymousClass1NG r9, AnonymousClass16D r10, AnonymousClass171 r11, AnonymousClass16K r12, AnonymousClass1RY r13, ConversationsFragment conversationsFragment, C18820ts r15, C21010yW r16, C32931eR r17, C32881eL r18, C33541fX r19, C19770wU r20) {
        super(r9, r10, r12, conversationsFragment, r16, r20);
        this.A00 = r11;
        this.A02 = r15;
        this.A01 = r13;
        this.A04 = r17;
        this.A05 = r18;
        this.A03 = r19;
    }

    public void A02() {
        AnonymousClass16D r2 = this.A04;
        this.A00 = new C50312kY(this.A03, r2, this.A05, this, 5, true, false);
    }

    public void A06(ViewGroup viewGroup, boolean z) {
        AnonymousClass00C.A0D(viewGroup, 0);
    }

    public void A04() {
        View findViewById = this.A06.A0d().findViewById(R.id.conversations_empty_nux);
        C36421kH.A0x(findViewById.findViewById(R.id.empty_third_chat_text), findViewById.findViewById(R.id.select_apps_button));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.view.ViewGroup r11, X.AnonymousClass01I r12, java.util.ArrayList r13, java.util.ArrayList r14) {
        /*
            r10 = this;
            int r1 = r13.size()
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            r4 = r1
            r3 = 0
            r6 = 0
        L_0x000b:
            if (r6 >= r1) goto L_0x003c
            java.lang.Object r7 = r13.get(r6)
            X.141 r7 = (X.AnonymousClass141) r7
            X.171 r0 = r10.A00
            java.lang.String r0 = X.C36381kD.A0v(r0, r7)
            java.lang.String r5 = android.text.Html.escapeHtml(r0)
            r8.add(r5)
            int[] r0 = A06
            r0 = r0[r6]
            android.widget.ImageView r2 = X.C36391kE.A0N(r11, r0)
            X.1RY r0 = r10.A01
            r0.A08(r2, r7)
            if (r2 == 0) goto L_0x0039
            r2.setVisibility(r3)
            r0 = 0
            r2.setOnClickListener(r0)
            r2.setContentDescription(r5)
        L_0x0039:
            int r6 = r6 + 1
            goto L_0x000b
        L_0x003c:
            int[] r2 = A06
            r0 = 5
            if (r4 >= r0) goto L_0x004d
            r0 = r2[r4]
            android.view.View r0 = r11.findViewById(r0)
            X.C36341k9.A0y(r0)
            int r4 = r4 + 1
            goto L_0x003c
        L_0x004d:
            r9 = 1
            int r7 = r14.size()
            r6 = 3
            int r0 = java.lang.Math.min(r1, r6)
            int r7 = r7 - r0
            r5 = 2
            if (r7 <= 0) goto L_0x00ab
            if (r1 == 0) goto L_0x00d9
            android.content.res.Resources r4 = r12.getResources()
            if (r1 == r9) goto L_0x009c
            if (r1 == r5) goto L_0x0090
            r2 = 2131755257(0x7f1000f9, float:1.9141388E38)
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.C36341k9.A1P(r8, r1)
            java.lang.Object r0 = r8.get(r5)
            r1[r5] = r0
            X.AnonymousClass000.A1L(r1, r7, r6)
        L_0x0077:
            java.lang.String r2 = r4.getQuantityString(r2, r7, r1)
        L_0x007b:
            r0 = 2131433022(0x7f0b163e, float:1.8487818E38)
            android.widget.TextView r1 = X.C36391kE.A0P(r11, r0)
            if (r1 == 0) goto L_0x008f
            X.C36361kB.A1P(r2, r1)
            r1.setVisibility(r3)
            r0 = 25
            X.C48742hy.A01(r1, r10, r0)
        L_0x008f:
            return
        L_0x0090:
            r2 = 2131755258(0x7f1000fa, float:1.914139E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.C36341k9.A1P(r8, r1)
            X.AnonymousClass000.A1L(r1, r7, r5)
            goto L_0x0077
        L_0x009c:
            r2 = 2131755256(0x7f1000f8, float:1.9141386E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Object r0 = r8.get(r3)
            r1[r3] = r0
            X.AnonymousClass000.A1L(r1, r7, r9)
            goto L_0x0077
        L_0x00ab:
            if (r1 == 0) goto L_0x00d9
            if (r1 == r9) goto L_0x00cd
            if (r1 == r5) goto L_0x00c4
            r2 = 2131891803(0x7f12165b, float:1.9418336E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.C36341k9.A1P(r8, r1)
            java.lang.Object r0 = r8.get(r5)
            r1[r5] = r0
        L_0x00bf:
            java.lang.String r2 = r12.getString(r2, r1)
            goto L_0x007b
        L_0x00c4:
            r2 = 2131891804(0x7f12165c, float:1.9418338E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.C36341k9.A1P(r8, r1)
            goto L_0x00bf
        L_0x00cd:
            r2 = 2131891801(0x7f121659, float:1.9418332E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Object r0 = r8.get(r3)
            r1[r3] = r0
            goto L_0x00bf
        L_0x00d9:
            android.content.res.Resources r4 = r12.getResources()
            r2 = 2131755255(0x7f1000f7, float:1.9141384E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            X.AnonymousClass000.A1L(r1, r7, r3)
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2LG.A05(android.view.ViewGroup, X.01I, java.util.ArrayList, java.util.ArrayList):void");
    }
}
