package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.7zh  reason: invalid class name and case insensitive filesystem */
public class C168097zh extends AnonymousClass0CZ {
    public AnonymousClass147 A00;
    public List A01 = AnonymousClass001.A0I();
    public C006302t A02;
    public C006302t A03;
    public final Context A04;
    public final AnonymousClass171 A05;
    public final C19970wo A06;
    public final C18820ts A07;
    public final C24801Dv A08;
    public final AnonymousClass1RY A09;
    public final C27731Pn A0A;
    public final C21060yb A0B;
    public final C20810yC A0C;
    public final C32681e1 A0D;

    public C168097zh(Context context, C24801Dv r4, AnonymousClass171 r5, C27731Pn r6, C21060yb r7, C19970wo r8, C18820ts r9, C20810yC r10, C32681e1 r11) {
        C36321k7.A19(r10, r8, r4, r11);
        C36321k7.A13(r7, r6, r9);
        AnonymousClass00C.A0D(r5, 9);
        this.A04 = context;
        this.A0C = r10;
        this.A06 = r8;
        this.A08 = r4;
        this.A0D = r11;
        this.A0B = r7;
        this.A0A = r6;
        this.A07 = r9;
        this.A05 = r5;
        this.A09 = r6.A05(context, "group-pending-participants");
        A0B(true);
    }

    public void A0I(RecyclerView recyclerView) {
        AnonymousClass00C.A0D(recyclerView, 0);
        this.A09.A02();
    }

    public void A0L(AnonymousClass141 r5, AnonymousClass808 r6) {
        AnonymousClass00C.A0D(r6, 0);
        TextEmojiLabel textEmojiLabel = r6.A02;
        AnonymousClass171 r1 = this.A05;
        textEmojiLabel.setText(r1.A0C(r5, -1).A01);
        if (!r5.A0B()) {
            String A0N = r1.A0N(r5);
            if (C165607th.A08(A0N) != 0) {
                ((TextView) C36391kE.A0L(r6.A06, 0)).setText(A0N);
                this.A09.A08(r6.A01, r5);
            }
        }
        r6.A06.A03(8);
        this.A09.A08(r6.A01, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0142, code lost:
        if (r2 != r1) goto L_0x0144;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSE(X.AnonymousClass0D3 r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r11, r0)
            java.util.List r0 = r10.A01
            java.lang.Object r7 = r0.get(r12)
            X.0ox r7 = (X.C16310ox) r7
            boolean r0 = r7 instanceof X.ACY
            if (r0 != 0) goto L_0x0093
            X.ACX r0 = X.ACX.A00
            boolean r0 = X.AnonymousClass00C.A0J(r7, r0)
            if (r0 != 0) goto L_0x0093
            boolean r0 = r7 instanceof X.ACW
            if (r0 == 0) goto L_0x00b4
            X.ACW r7 = (X.ACW) r7
            r5 = 0
            r9 = 1
            X.AnonymousClass00C.A0D(r7, r9)
            X.808 r11 = (X.AnonymousClass808) r11
            X.141 r6 = r7.A07
            android.view.View r1 = r11.A00
            X.11F r0 = r6.A0H
            r1.setTag(r0)
            r10.A0L(r6, r11)
            int r4 = r7.A00
            if (r4 <= 0) goto L_0x00ac
            X.1RJ r0 = r11.A05
            android.view.View r3 = X.C36391kE.A0L(r0, r5)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.Context r0 = r10.A04
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131755216(0x7f1000d0, float:1.9141305E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            X.AnonymousClass000.A1L(r0, r4, r5)
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)
            r3.setText(r0)
        L_0x0052:
            X.141 r8 = r7.A06
            if (r8 != 0) goto L_0x0094
            X.1RJ r1 = r11.A04
            r0 = 8
            r1.A03(r0)
        L_0x005d:
            X.8zZ r2 = r7.A03
            X.8zZ r0 = X.C188428zZ.PENDING
            r1 = 8
            if (r2 != r0) goto L_0x00e4
            com.whatsapp.wds.components.button.WDSButton r4 = r11.A07
            r4.setVisibility(r5)
            com.whatsapp.wds.components.button.WDSButton r3 = r11.A08
            r3.setVisibility(r5)
            com.whatsapp.WaTextView r0 = r11.A03
            r0.setVisibility(r1)
            X.171 r1 = r10.A05
            r0 = -1
            X.34G r0 = r1.A0C(r6, r0)
            java.lang.String r2 = r0.A01
            android.content.Context r1 = r10.A04
            r0 = 2131890209(0x7f121021, float:1.9415103E38)
            java.lang.String r0 = X.C36351kA.A0w(r1, r2, r9, r0)
            r4.setContentDescription(r0)
            r0 = 2131890216(0x7f121028, float:1.9415118E38)
            java.lang.String r0 = X.C36351kA.A0w(r1, r2, r9, r0)
            r3.setContentDescription(r0)
        L_0x0093:
            return
        L_0x0094:
            X.1RJ r0 = r11.A04
            android.view.View r4 = X.C36391kE.A0L(r0, r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.content.Context r3 = r10.A04
            r2 = 2131890206(0x7f12101e, float:1.9415097E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            X.171 r0 = r10.A05
            X.C36361kB.A1F(r0, r8, r1, r5)
            X.C36341k9.A0s(r3, r4, r1, r2)
            goto L_0x005d
        L_0x00ac:
            X.1RJ r1 = r11.A05
            r0 = 8
            r1.A03(r0)
            goto L_0x0052
        L_0x00b4:
            boolean r0 = r7 instanceof X.ACT
            if (r0 == 0) goto L_0x00ca
            X.ACT r7 = (X.ACT) r7
            long r1 = r7.A00
            X.7zx r11 = (X.C168257zx) r11
            com.whatsapp.TextEmojiLabel r4 = r11.A00
            X.0ts r0 = r10.A07
            java.lang.String r0 = X.AnonymousClass3UY.A0E(r0, r1)
        L_0x00c6:
            r4.setText(r0)
            return
        L_0x00ca:
            boolean r0 = r7 instanceof X.ACU
            if (r0 == 0) goto L_0x0093
            X.ACU r7 = (X.ACU) r7
            X.7zx r11 = (X.C168257zx) r11
            com.whatsapp.TextEmojiLabel r4 = r11.A00
            android.content.Context r3 = r10.A04
            int r2 = r7.A00
            java.lang.Object[] r1 = r7.A01
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = r3.getString(r2, r0)
            goto L_0x00c6
        L_0x00e4:
            com.whatsapp.wds.components.button.WDSButton r0 = r11.A07
            r0.setVisibility(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r11.A08
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r6 = r11.A03
            r6.setVisibility(r5)
            android.content.Context r5 = r10.A04
            r8 = 2130969749(0x7f040495, float:1.7548189E38)
            r2 = 2131100995(0x7f060543, float:1.7814387E38)
            int r4 = X.C224514j.A00(r5, r8, r2)
            r3 = 2131231717(0x7f0803e5, float:1.8079523E38)
            X.8zZ r0 = r7.A03
            int r1 = r0.ordinal()
            if (r1 == r9) goto L_0x0131
            r0 = 2
            if (r1 == r0) goto L_0x011c
            r0 = 4
            if (r1 == r0) goto L_0x0123
            java.lang.String r0 = ""
        L_0x0112:
            X.C36331k8.A0r(r5, r6, r4)
            X.C36371kC.A13(r5, r6, r3)
            r6.setText(r0)
            return
        L_0x011c:
            r4 = 2131100993(0x7f060541, float:1.7814383E38)
            r0 = 2131890224(0x7f121030, float:1.9415134E38)
            goto L_0x0129
        L_0x0123:
            r4 = 2131100993(0x7f060541, float:1.7814383E38)
            r0 = 2131890223(0x7f12102f, float:1.9415132E38)
        L_0x0129:
            java.lang.String r0 = X.C36361kB.A0m(r5, r0)
            r3 = 2131231716(0x7f0803e4, float:1.807952E38)
            goto L_0x0112
        L_0x0131:
            int r4 = X.C224514j.A00(r5, r8, r2)
            X.8zh r1 = r7.A04
            X.8zh r0 = X.C188508zh.A03
            if (r1 != r0) goto L_0x0144
            X.8zk r2 = r7.A02
            X.8zk r1 = X.C188538zk.A06
            r0 = 2131890248(0x7f121048, float:1.9415182E38)
            if (r2 == r1) goto L_0x0147
        L_0x0144:
            r0 = 2131890217(0x7f121029, float:1.941512E38)
        L_0x0147:
            java.lang.String r0 = X.C36361kB.A0m(r5, r0)
            goto L_0x0112
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168097zh.BSE(X.0D3, int):void");
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new C168227zu(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved, false), this);
                }
                if (i != 4) {
                    List list = AnonymousClass0D3.A0I;
                    return new AnonymousClass808(C36371kC.A0J(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved, false), this.A08, this);
                }
            }
            return new C168257zx(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved, false), this);
        }
        List list2 = AnonymousClass0D3.A0I;
        C24801Dv r3 = this.A08;
        C32681e1 r6 = this.A0D;
        return new C41991y6(C36371kC.A0J(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved, false), r3, this.A0B, this, r6);
    }

    public long A0E(int i) {
        UserJid userJid;
        boolean z = this instanceof C177128dF;
        C16310ox r1 = (C16310ox) this.A01.get(i);
        if (z) {
            if (!(r1 instanceof ACV)) {
                return 0;
            }
            userJid = ((ACV) r1).A00.A03;
        } else if (!(r1 instanceof ACW)) {
            return 0;
        } else {
            userJid = ((ACW) r1).A05.A04;
        }
        return (long) userJid.hashCode();
    }

    public int A0J() {
        return this.A01.size();
    }

    public int getItemViewType(int i) {
        Object obj = this.A01.get(i);
        if (obj instanceof ACX) {
            return 1;
        }
        if (obj instanceof ACY) {
            return 3;
        }
        if (obj instanceof ACT) {
            return 2;
        }
        if (obj instanceof ACU) {
            return 4;
        }
        return 0;
    }
}
