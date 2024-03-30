package com.whatsapp.conversation.conversationrow.message;

import X.AnonymousClass00C;
import X.AnonymousClass01z;
import X.AnonymousClass11F;
import X.AnonymousClass191;
import X.AnonymousClass22g;
import X.AnonymousClass2JG;
import X.AnonymousClass2JH;
import X.AnonymousClass3OP;
import X.AnonymousClass4V4;
import X.C18800tq;
import X.C18830tt;
import X.C19730wQ;
import X.C27111My;
import X.C28071Rf;
import X.C36321k7;
import X.C36351kA;
import X.C36371kC;
import X.C48812i6;
import X.C62383Fy;
import X.C62503Gk;
import X.C70523fI;
import X.C77573qi;
import X.C89014Ux;
import X.C89324Wc;
import X.C90394a5;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import com.whatsapp.WaTextView;
import com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog;

public class KeptMessagesActivity extends AnonymousClass2JG {
    public ProgressBar A00;
    public ScrollView A01;
    public WaTextView A02;
    public C77573qi A03;
    public C28071Rf A04;
    public C62383Fy A05;
    public boolean A06;
    public final AnonymousClass191 A07;

    public /* bridge */ /* synthetic */ AnonymousClass4V4 A3j() {
        C48812i6 r10 = new C48812i6(this, this.A01, 47);
        C19730wQ r3 = this.A02;
        C70523fI r0 = this.A00;
        return new AnonymousClass2JH(this, r3, r0.A0C, r0.A0F, this.A07, r0.A0L, this, r0.A0x, r10);
    }

    public void A2F() {
        if (!this.A06) {
            this.A06 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            AnonymousClass22g.A0H(A0L, r2, r1, new C62503Gk(), this);
            this.A04 = C18800tq.A9D(r2);
            this.A03 = C27111My.A1x(A0L);
            this.A05 = (C62383Fy) r1.ABQ.get();
        }
    }

    public C89014Ux getConversationRowCustomizer() {
        return this.A00.A0P.A08;
    }

    public void onDestroy() {
        this.A00.A0Z.unregisterObserver(this.A07);
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        super.onDestroy();
    }

    public KeptMessagesActivity(int i) {
        this.A06 = false;
        C89324Wc.A00(this, 47);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00fd, code lost:
        if (r0 == false) goto L_0x00ff;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            r0 = 2131890647(0x7f1211d7, float:1.9415992E38)
            r10.setTitle(r0)
            X.3fI r0 = r10.A00
            X.16J r1 = r0.A0Z
            X.191 r0 = r10.A07
            r1.registerObserver(r0)
            X.1Rf r6 = r10.A04
            X.11F r7 = r10.A0F
            X.C18740tg.A06(r7)
            android.content.Intent r3 = r10.getIntent()
            java.lang.String r2 = "keptMessageCount"
            r0 = 0
            long r8 = r3.getLongExtra(r2, r0)
            r2 = 0
            X.AnonymousClass00C.A0D(r7, r2)
            X.2Sm r4 = new X.2Sm
            r4.<init>()
            java.lang.Integer r0 = X.C36371kC.A0n()
            r4.A04 = r0
            r5 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4.A06 = r0
            X.12q r1 = r6.A03
            X.16D r0 = r6.A02
            int r0 = X.AnonymousClass3TD.A00(r0, r1, r7)
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r4.A08 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r4.A0C = r0
            boolean r0 = X.AnonymousClass143.A0G(r7)
            r3 = 0
            if (r0 == 0) goto L_0x0103
            X.17X r2 = r6.A04
            r0 = r7
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r1 = r2.A0C(r0)
            boolean r0 = r2.A0D(r0)
            if (r1 == 0) goto L_0x0068
            if (r0 == 0) goto L_0x0068
            r3 = 1
        L_0x0068:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r4.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
        L_0x0072:
            r4.A01 = r0
            X.17V r1 = r6.A06
            java.lang.String r0 = r7.getRawString()
            java.lang.String r0 = r1.A03(r0)
            r4.A0E = r0
            X.0yW r0 = r6.A05
            r0.Bly(r4)
            r0 = 2131625322(0x7f0e056a, float:1.8877849E38)
            r10.setContentView((int) r0)
            android.widget.ListView r4 = r10.getListView()
            r2 = 0
            r4.setFastScrollEnabled(r2)
            r4.setScrollbarFadingEnabled(r5)
            android.widget.AbsListView$OnScrollListener r0 = r10.A0J
            r4.setOnScrollListener(r0)
            android.view.LayoutInflater r1 = r10.getLayoutInflater()
            r0 = 2131624629(0x7f0e02b5, float:1.8876443E38)
            android.view.View r3 = r1.inflate(r0, r4, r2)
            r0 = 2131429228(0x7f0b076c, float:1.8480123E38)
            android.widget.TextView r2 = X.C36391kE.A0P(r3, r0)
            if (r2 == 0) goto L_0x00c9
            X.11F r1 = r10.A0F
            if (r1 == 0) goto L_0x00c9
            X.3fI r0 = r10.A00
            X.16D r0 = r0.A0C
            X.141 r1 = r0.A08(r1)
            X.11F r0 = r10.A0F
            boolean r0 = X.AnonymousClass143.A0G(r0)
            if (r0 != 0) goto L_0x00f6
            r1 = 2131890655(0x7f1211df, float:1.9416008E38)
        L_0x00c6:
            r2.setText(r1)
        L_0x00c9:
            r4.addHeaderView(r3)
            X.4V4 r0 = r10.A05
            r10.A3i(r0)
            r0 = 2131429902(0x7f0b0a0e, float:1.848149E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r10.A01 = r0
            r0 = 2131433647(0x7f0b18af, float:1.8489086E38)
            android.view.View r0 = r10.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r10.A02 = r0
            r0 = 2131433000(0x7f0b1628, float:1.8487773E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r10.A00 = r0
            r10.A3m()
            return
        L_0x00f6:
            if (r1 == 0) goto L_0x00ff
            boolean r0 = r1.A13
            r1 = 2131890654(0x7f1211de, float:1.9416006E38)
            if (r0 != 0) goto L_0x00c6
        L_0x00ff:
            r1 = 2131890653(0x7f1211dd, float:1.9416004E38)
            goto L_0x00c6
        L_0x0103:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.message.KeptMessagesActivity.onCreate(android.os.Bundle):void");
    }

    public void onResume() {
        super.onResume();
        C62383Fy r5 = this.A05;
        AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
        AnonymousClass11F r3 = this.A0F;
        AnonymousClass00C.A0D(supportFragmentManager, 0);
        if (AnonymousClass3OP.A00(supportFragmentManager, r5.A00)) {
            C36371kC.A1C(r3, supportFragmentManager, 4);
            EphemeralDmKicBottomSheetDialog.A0N = null;
        }
    }

    public KeptMessagesActivity() {
        this(0);
        this.A07 = C90394a5.A00(this, 11);
    }
}
