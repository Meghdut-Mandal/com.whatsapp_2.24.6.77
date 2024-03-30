package X;

import android.widget.TextView;

/* renamed from: X.7pa  reason: invalid class name and case insensitive filesystem */
public class C163057pa implements TextView.OnEditorActionListener {
    public Object A00;
    public final int A01;

    public C163057pa(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        if (X.AnonymousClass00C.A0J(r0, r2) == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.A0D(r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0093, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a8, code lost:
        if ((r1 instanceof X.C1035856a) != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ad, code lost:
        com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.A06(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b0, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onEditorAction(android.widget.TextView r6, int r7, android.view.KeyEvent r8) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x00b1;
                case 1: goto L_0x003d;
                case 2: goto L_0x0029;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r5.A00
            com.whatsapp.search.views.TokenizedSearchInput r2 = (com.whatsapp.search.views.TokenizedSearchInput) r2
            com.whatsapp.search.SearchViewModel r1 = r2.A0G
            r4 = 0
            if (r1 == 0) goto L_0x00bb
            r0 = 3
            if (r7 != r0) goto L_0x00bb
            r1.A0r(r4)
            com.whatsapp.search.SearchViewModel r3 = r2.A0G
            X.0yC r2 = r3.A0v
            X.AnonymousClass00C.A0D(r2, r4)
            X.0yV r1 = X.C21000yV.A01
            r0 = 7413(0x1cf5, float:1.0388E-41)
            X.C20800yB.A01(r1, r2, r0)
            X.08S r0 = r3.A0d
            X.C36341k9.A18(r0, r4)
        L_0x0027:
            r4 = 1
            return r4
        L_0x0029:
            java.lang.Object r2 = r5.A00
            X.5yO r2 = (X.C124555yO) r2
            if (r8 == 0) goto L_0x00bb
            int r1 = r8.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x00bb
            com.whatsapp.mentions.MentionableEntry r0 = r2.A07
            r0.A0B()
            goto L_0x0027
        L_0x003d:
            java.lang.Object r3 = r5.A00
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r3 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r3
            com.whatsapp.WaEditText r0 = r3.A09
            r1 = 0
            if (r0 == 0) goto L_0x0050
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0050
            java.lang.String r1 = r0.toString()
        L_0x0050:
            r0 = 2
            r4 = 1
            if (r7 != r0) goto L_0x00bb
            boolean r0 = com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.A0F(r1)
            if (r0 == 0) goto L_0x00bb
            com.whatsapp.WaEditText r0 = r3.A09
            if (r0 == 0) goto L_0x0061
            r0.A0B()
        L_0x0061:
            com.whatsapp.WaEditText r0 = r3.A09
            if (r0 == 0) goto L_0x00ab
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x00ab
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x00ab
            java.lang.String r2 = X.C36371kC.A0y(r0)
        L_0x0075:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = X.C90484aE.A0X(r3)
            X.00s r0 = r0.A0A
            java.lang.Object r1 = r0.A04()
            X.5bA r1 = (X.C110745bA) r1
            boolean r0 = r1 instanceof X.AnonymousClass56X
            if (r0 == 0) goto L_0x0094
            X.56X r1 = (X.AnonymousClass56X) r1
            java.lang.String r0 = r1.A00
        L_0x0089:
            boolean r0 = X.AnonymousClass00C.A0J(r0, r2)
            if (r0 != 0) goto L_0x00ad
        L_0x008f:
            r0 = 0
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.A0D(r3, r0)
            return r4
        L_0x0094:
            boolean r0 = r1 instanceof X.AnonymousClass56Y
            if (r0 == 0) goto L_0x009d
            X.56Y r1 = (X.AnonymousClass56Y) r1
            java.lang.String r0 = r1.A01
            goto L_0x0089
        L_0x009d:
            boolean r0 = r1 instanceof X.AnonymousClass56Z
            if (r0 == 0) goto L_0x00a6
            X.56Z r1 = (X.AnonymousClass56Z) r1
            java.lang.String r0 = r1.A00
            goto L_0x0089
        L_0x00a6:
            boolean r0 = r1 instanceof X.C1035856a
            if (r0 == 0) goto L_0x00ad
            goto L_0x008f
        L_0x00ab:
            r2 = 0
            goto L_0x0075
        L_0x00ad:
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.A06(r3)
            return r4
        L_0x00b1:
            java.lang.Object r1 = r5.A00
            com.whatsapp.backup.encryptedbackup.PasswordInputFragment r1 = (com.whatsapp.backup.encryptedbackup.PasswordInputFragment) r1
            r0 = 6
            if (r7 != r0) goto L_0x00bb
            r1.A1Z()
        L_0x00bb:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163057pa.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
    }
}
