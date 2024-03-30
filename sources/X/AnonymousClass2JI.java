package X;

import android.content.Context;
import android.view.LayoutInflater;
import java.util.Map;

/* renamed from: X.2JI  reason: invalid class name */
public final class AnonymousClass2JI extends C39301rf {
    public Map A00 = C000400e.A0D();
    public final C20810yC A01;
    public final C28981Uw A02;
    public final C006302t A03;
    public final LayoutInflater A04;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007f, code lost:
        if (r9.A0E(6148) == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0081, code lost:
        r7.setVisibility(0);
        r1 = X.AnonymousClass001.A0L();
        X.C36421kH.A0k(r6, X.C55142u8.A00(r8.A01), 0, r1);
        X.C36341k9.A0s(r6, r7, r1, com.whatsapp.R.string.f12nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0097, code lost:
        X.C36341k9.A10(r3, com.whatsapp.R.id.bullet, 8);
        X.C36341k9.A10(r3, com.whatsapp.R.id.recipient_name, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a3, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bd, code lost:
        r10.setOnClickListener(r0);
        r10.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c7, code lost:
        if (r8 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ca, code lost:
        r7.setVisibility(8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
            r11 = this;
            r0 = 2
            X.AnonymousClass00C.A0D(r14, r0)
            r2 = 0
            if (r13 != 0) goto L_0x00ce
            android.view.LayoutInflater r1 = r11.A04
            r0 = 2131625618(0x7f0e0692, float:1.887845E38)
            android.view.View r3 = r1.inflate(r0, r14, r2)
        L_0x0010:
            r0 = 2131428767(0x7f0b059f, float:1.8479188E38)
            android.view.ViewGroup r1 = X.C36411kG.A0P(r3, r0)
            android.view.View r0 = r1.getChildAt(r2)
            android.view.View r2 = super.getView(r12, r0, r14)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.conversation.conversationrow.ConversationRow"
            X.AnonymousClass00C.A0E(r2, r0)
            X.2IS r2 = (X.AnonymousClass2IS) r2
            if (r13 != 0) goto L_0x002b
            r1.addView(r2)
        L_0x002b:
            r0 = 2131431947(0x7f0b120b, float:1.8485638E38)
            com.whatsapp.wds.components.button.WDSButton r1 = X.C36441kJ.A0u(r3, r0)
            r0 = 2131231791(0x7f08042f, float:1.8079673E38)
            r1.setIcon((int) r0)
            r0 = 19
            X.AnonymousClass3YH.A00(r1, r2, r11, r0)
            X.3T1 r0 = r2.getFMessage()
            long r1 = r0.A1O
            r0 = 2131432032(0x7f0b1260, float:1.848581E38)
            android.widget.TextView r10 = X.C36391kE.A0P(r3, r0)
            r0 = 2131432066(0x7f0b1282, float:1.8485879E38)
            android.widget.TextView r7 = X.C36391kE.A0P(r3, r0)
            android.content.Context r6 = r3.getContext()
            java.util.Map r4 = r11.A00
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.Object r8 = r4.get(r0)
            X.2Z2 r8 = (X.AnonymousClass2Z2) r8
            X.0yC r9 = r11.A01
            r0 = 6321(0x18b1, float:8.858E-42)
            boolean r0 = r9.A0E(r0)
            r5 = 8
            r4 = 0
            if (r0 == 0) goto L_0x00c4
            if (r8 == 0) goto L_0x00c4
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r8.A00
            int r0 = r0.ordinal()
            switch(r0) {
                case -1: goto L_0x00c4;
                case 0: goto L_0x00c4;
                case 1: goto L_0x00a4;
                case 2: goto L_0x00a4;
                case 3: goto L_0x00a4;
                case 4: goto L_0x00a4;
                case 5: goto L_0x00b2;
                case 6: goto L_0x00c4;
                default: goto L_0x0079;
            }
        L_0x0079:
            r0 = 6148(0x1804, float:8.615E-42)
            boolean r0 = r9.A0E(r0)
            if (r0 == 0) goto L_0x00ca
            r7.setVisibility(r4)
            r2 = 2131891539(0x7f121553, float:1.94178E38)
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory r0 = r8.A01
            int r0 = X.C55142u8.A00(r0)
            X.C36421kH.A0k(r6, r0, r4, r1)
            X.C36341k9.A0s(r6, r7, r1, r2)
        L_0x0097:
            r0 = 2131428269(0x7f0b03ad, float:1.8478178E38)
            X.C36341k9.A10(r3, r0, r5)
            r0 = 2131433186(0x7f0b16e2, float:1.848815E38)
            X.C36341k9.A10(r3, r0, r5)
            return r3
        L_0x00a4:
            r0 = 2131893930(0x7f121eaa, float:1.942265E38)
            r10.setText(r0)
            r1 = 22
            X.3YM r0 = new X.3YM
            r0.<init>(r6, r11, r8, r1)
            goto L_0x00bd
        L_0x00b2:
            r0 = 2131893677(0x7f121dad, float:1.9422137E38)
            r10.setText(r0)
            X.3YJ r0 = new X.3YJ
            r0.<init>(r6, r11, r1)
        L_0x00bd:
            r10.setOnClickListener(r0)
            r10.setVisibility(r4)
            goto L_0x0079
        L_0x00c4:
            r10.setVisibility(r5)
            if (r8 == 0) goto L_0x00ca
            goto L_0x0079
        L_0x00ca:
            r7.setVisibility(r5)
            goto L_0x0097
        L_0x00ce:
            r3 = r13
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JI.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2JI(Context context, C19730wQ r13, AnonymousClass16D r14, AnonymousClass1RY r15, AnonymousClass3QY r16, C89004Uw r17, C20810yC r18, C28981Uw r19, AnonymousClass1A1 r20, C48812i6 r21, C006302t r22) {
        super(context, r13, r14, r15, r16, r17, r20, r21);
        C28981Uw r1 = r19;
        AnonymousClass00C.A0D(r1, 10);
        this.A01 = r18;
        this.A02 = r1;
        this.A03 = r22;
        LayoutInflater from = LayoutInflater.from(context);
        AnonymousClass00C.A08(from);
        this.A04 = from;
    }
}
