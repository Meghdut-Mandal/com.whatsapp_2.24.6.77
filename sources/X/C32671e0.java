package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet;

/* renamed from: X.1e0  reason: invalid class name and case insensitive filesystem */
public class C32671e0 {
    public View A00;
    public final C21060yb A01;
    public final C20810yC A02;
    public final C32791eC A03;
    public final C32681e1 A04;
    public final C19770wU A05;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r3 != 400) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.widget.ListView r11, X.AnonymousClass02E r12, int r13) {
        /*
            r10 = this;
            r1 = 0
            android.view.LayoutInflater r0 = r12.A0c()     // Catch:{ all -> 0x0078 }
            android.view.View r1 = r0.inflate(r13, r11, r1)     // Catch:{ all -> 0x0078 }
            r10.A00 = r1     // Catch:{ all -> 0x0078 }
            r0 = 2131429761(0x7f0b0981, float:1.8481204E38)
            android.view.View r2 = X.C012005e.A02(r1, r0)
            com.whatsapp.TextEmojiLabel r2 = (com.whatsapp.TextEmojiLabel) r2
            boolean r0 = r12 instanceof X.C31921ce
            if (r0 == 0) goto L_0x0033
            r0 = r12
            X.1ce r0 = (X.C31921ce) r0
            int r3 = r0.BIA()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L_0x0033
            r0 = 300(0x12c, float:4.2E-43)
            r1 = 2131894525(0x7f1220fd, float:1.9423857E38)
            if (r3 == r0) goto L_0x0036
            r0 = 400(0x190, float:5.6E-43)
            r1 = 2131892994(0x7f121b02, float:1.9420752E38)
            if (r3 == r0) goto L_0x0036
        L_0x0033:
            r1 = 2131892996(0x7f121b04, float:1.9420756E38)
        L_0x0036:
            java.lang.String r7 = r12.A0n(r1)
            X.1e1 r4 = r10.A04
            android.content.Context r5 = r2.getContext()
            android.content.Context r3 = r2.getContext()
            r1 = 2130968626(0x7f040032, float:1.754591E38)
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            int r9 = X.C224514j.A00(r3, r1, r0)
            r0 = 22
            X.1j5 r6 = new X.1j5
            r6.<init>(r10, r12, r0)
            java.lang.String r8 = "%s"
            android.text.SpannableStringBuilder r0 = r4.A03(r5, r6, r7, r8, r9)
            r2.setText(r0)
            X.0yb r1 = r10.A01
            X.1gJ r0 = new X.1gJ
            r0.<init>(r2, r1)
            r2.setAccessibilityHelper(r0)
            X.0yC r1 = r10.A02
            X.1gK r0 = new X.1gK
            r0.<init>(r1)
            r2.setMovementMethod(r0)
            android.view.View r0 = r10.A00
            r11.addFooterView(r0)
            return
        L_0x0078:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32671e0.A00(android.widget.ListView, X.02E, int):void");
    }

    public void A01(AnonymousClass02E r5) {
        View view = this.A00;
        if (view != null && view.getVisibility() == 0 && r5.A0l) {
            if (C20800yB.A01(C21000yV.A02, this.A02, 1071)) {
                int i = 8;
                if (r5 instanceof C31921ce) {
                    int BIA = ((C31921ce) r5).BIA();
                    if (Integer.valueOf(BIA) != null) {
                        if (BIA == 400) {
                            i = 6;
                        } else if (BIA == 200) {
                            i = 7;
                        }
                    }
                }
                this.A05.Boy(new C35201iJ(this, i, 4));
            }
        }
    }

    public C32671e0(C21060yb r1, C20810yC r2, C32791eC r3, C32681e1 r4, C19770wU r5) {
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = r5;
        this.A01 = r1;
        this.A03 = r3;
    }

    public void A02(AnonymousClass02E r5) {
        AnonymousClass01I A0h = r5.A0h();
        if (A0h instanceof C225314u) {
            C225314u r3 = (C225314u) A0h;
            int i = 7;
            if (r5 instanceof C31921ce) {
                int BIA = ((C31921ce) r5).BIA();
                if (Integer.valueOf(BIA) != null) {
                    if (BIA == 300) {
                        i = 8;
                    } else if (BIA == 400) {
                        i = 6;
                    }
                }
            }
            r3.Btm(E2EEDescriptionBottomSheet.A03(i));
        }
    }

    public void A03(C225314u r10, TextEmojiLabel textEmojiLabel, C21060yb r12) {
        String string = r10.getString(R.string.f12nameremoved);
        textEmojiLabel.setText(this.A04.A03(textEmojiLabel.getContext(), new C35681j5(this, r10, 23), string, "%s", C224514j.A00(textEmojiLabel.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)));
        textEmojiLabel.setAccessibilityHelper(new C34011gJ(textEmojiLabel, r12));
        textEmojiLabel.setMovementMethod(new C34021gK(this.A02));
    }
}
