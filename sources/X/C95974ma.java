package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4ma  reason: invalid class name and case insensitive filesystem */
public final class C95974ma extends AnonymousClass0CZ {
    public int A00;
    public final List A01;
    public final C33401fG A02;
    public final C18820ts A03;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C96674ni(C36371kC.A0I(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved), this);
    }

    public int A0J() {
        return this.A01.size();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d3, code lost:
        r3.A02(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(int r9) {
        /*
            r8 = this;
            X.1fG r1 = r8.A02
            java.util.List r0 = r8.A01
            java.lang.Object r5 = r0.get(r9)
            X.5al r5 = (X.C110495al) r5
            com.whatsapp.conversationslist.ConversationsFragment r4 = r1.A00
            com.whatsapp.conversationslist.filter.ConversationFilterViewModel r0 = r4.A1b
            r0.A00 = r5
            boolean r0 = r5 instanceof X.AnonymousClass54J
            if (r0 == 0) goto L_0x0065
            X.54J r5 = (X.AnonymousClass54J) r5
            X.4fA r2 = r4.A1X
            if (r2 == 0) goto L_0x003b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Boolean r0 = r4.A34
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.String r1 = r5.A01
            java.lang.String r0 = "ALL_FILTER"
            boolean r3 = X.C36361kB.A1a(r1, r0)
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r2 = r2.A04
            if (r2 == 0) goto L_0x003b
            X.5Se r1 = r2.A00
            X.5Se r0 = X.C108105Se.LOADED
            if (r1 != r0) goto L_0x003b
            X.1Rs r0 = r2.A0C
            X.C36341k9.A18(r0, r3)
        L_0x003b:
            X.15b r1 = r4.A1c()
            r0 = 0
            r1.A03 = r0
            r1.A04 = r0
            X.15c r0 = X.C226115c.ALL
            r1.A01 = r0
            X.15b r2 = r4.A1c()
            java.util.Random r0 = r4.A3h
            long r0 = r0.nextLong()
            r2.A00 = r0
            java.lang.String r7 = r5.A01
            int r0 = r7.hashCode()
            r6 = 2
            java.lang.String r5 = "UNREAD_FILTER"
            java.lang.String r3 = "GROUP_FILTER"
            java.lang.String r2 = "CONTACTS_FILTER"
            r1 = -1
            switch(r0) {
                case -1730152220: goto L_0x00b8;
                case 72525144: goto L_0x009d;
                case 1827283464: goto L_0x0080;
                default: goto L_0x0065;
            }
        L_0x0065:
            long r0 = java.lang.System.currentTimeMillis()
            r4.A03 = r0
            r4.A1h()
            X.15b r0 = r4.A1c()
            r4.B1H(r0)
            int r0 = r8.A00
            r8.A00 = r9
            r8.A07(r9)
            r8.A07(r0)
            return
        L_0x0080:
            boolean r0 = r7.equals(r5)
            if (r0 == 0) goto L_0x0065
            X.15b r0 = r4.A1c()
            r0.A00(r5)
            int r0 = r4.A01
            if (r0 != r1) goto L_0x0065
            X.1U5 r2 = r4.A1U
            X.15b r0 = r4.A1c()
            long r0 = r0.A00
            r2.A02(r0, r6)
            goto L_0x0065
        L_0x009d:
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L_0x0065
            X.15b r0 = r4.A1c()
            r0.A00(r3)
            int r0 = r4.A01
            if (r0 != r1) goto L_0x0065
            X.1U5 r3 = r4.A1U
            X.15b r0 = r4.A1c()
            long r1 = r0.A00
            r0 = 3
            goto L_0x00d3
        L_0x00b8:
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L_0x0065
            X.15b r0 = r4.A1c()
            r0.A00(r2)
            int r0 = r4.A01
            if (r0 != r1) goto L_0x0065
            X.1U5 r3 = r4.A1U
            X.15b r0 = r4.A1c()
            long r1 = r0.A00
            r0 = 10
        L_0x00d3:
            r3.A02(r1, r0)
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95974ma.A0L(int):void");
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r4, int i) {
        C96674ni r42 = (C96674ni) r4;
        AnonymousClass00C.A0D(r42, 0);
        C110495al r1 = (C110495al) this.A01.get(i);
        if (r1 instanceof AnonymousClass54J) {
            String str = ((AnonymousClass54J) r1).A00;
            TextView textView = r42.A00;
            textView.setText(str);
            textView.setSelected(AnonymousClass000.A1S(i, this.A00));
            C67143Yr.A00(textView, this, i, 14);
            C33511fU.A03(textView);
            textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public C95974ma(C33401fG r1, C18820ts r2, List list) {
        C36321k7.A0y(r2, list);
        this.A03 = r2;
        this.A01 = list;
        this.A02 = r1;
    }
}
