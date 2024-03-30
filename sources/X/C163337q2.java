package X;

import android.view.View;

/* renamed from: X.7q2  reason: invalid class name and case insensitive filesystem */
public class C163337q2 implements View.OnLongClickListener {
    public Object A00;
    public final int A01;

    public C163337q2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        if (r2 == 3) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x012f;
                case 1: goto L_0x010a;
                case 2: goto L_0x00d1;
                case 3: goto L_0x0073;
                case 4: goto L_0x0012;
                case 5: goto L_0x0144;
                case 6: goto L_0x0139;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r8.A00
            android.widget.EditText r1 = (android.widget.EditText) r1
            int r0 = X.C36381kD.A06(r1)
            r1.setSelection(r0)
        L_0x0010:
            r0 = 1
            return r0
        L_0x0012:
            java.lang.Object r6 = r8.A00
            X.6Fh r6 = (X.C129126Fh) r6
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            X.5mD r0 = r6.A0H
            com.whatsapp.mediacomposer.MediaComposerActivity r7 = r0.A00
            X.6Fh r0 = r7.A10
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r0.A0I
            boolean r0 = r0.A0X
            if (r0 != 0) goto L_0x0046
            X.1qm r2 = X.AnonymousClass3LW.A00(r7)
            r0 = 2131890944(0x7f121300, float:1.9416594E38)
            r2.A0d(r0)
            r0 = 2131890943(0x7f1212ff, float:1.9416592E38)
            r2.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 0
            r2.A0h(r0, r1)
            X.C36341k9.A11(r2)
        L_0x0040:
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r6.A0I
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView.A00(r0)
            goto L_0x0010
        L_0x0046:
            X.66x r5 = r7.A1O
            r4 = 4
            X.6VT r0 = r7.A0s
            int r3 = r0.A06()
            java.lang.Integer r0 = r7.A1S
            if (r0 == 0) goto L_0x005c
            int r2 = r0.intValue()
            r1 = 3
            r0 = 30
            if (r2 != r1) goto L_0x005e
        L_0x005c:
            r0 = 31
        L_0x005e:
            X.C1270866x.A00(r5, r0, r4, r3)
            java.lang.Integer r0 = r7.A1S
            int r1 = r0.intValue()
            r0 = 3
            if (r0 != r1) goto L_0x006b
            r0 = 0
        L_0x006b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.BaZ(r0)
            goto L_0x0040
        L_0x0073:
            java.lang.Object r3 = r8.A00
            X.6Fh r3 = (X.C129126Fh) r3
            r5 = 0
            X.AnonymousClass00C.A0D(r3, r5)
            X.6wC r0 = r3.A06
            if (r0 == 0) goto L_0x0010
            X.6FL r0 = r3.A05
            if (r0 == 0) goto L_0x0010
            X.66x r2 = r3.A0J
            r4 = 4
            X.6VT r0 = r3.A0G
            int r1 = r0.A06()
            r0 = 57
            X.C1270866x.A00(r2, r0, r4, r1)
            X.6wC r2 = r3.A06
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = r2.A0N
            X.6FV r0 = r1.A0H
            r0.A02()
            X.6V4 r0 = r1.A0E
            r0.A03()
            r0.A04()
            X.64m r0 = r2.A0P
            r0.A02 = r5
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r2.A0K
            r0.A04(r5)
            X.6FL r0 = r2.A0I
            r0.A00()
            X.6Fh r0 = r2.A0V
            r0.A07(r5)
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r3.A0I
            android.widget.ImageView r0 = r0.A09
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = "undoButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00c2:
            r0.setVisibility(r4)
            X.6FL r0 = r3.A05
            r0.A02()
            X.6wC r0 = r3.A06
            X.C146806wC.A03(r0)
            goto L_0x0010
        L_0x00d1:
            java.lang.Object r0 = r8.A00
            X.4aZ r0 = (X.C90694aZ) r0
            X.6OU r3 = r0.A07
            if (r3 != 0) goto L_0x00e0
            java.lang.String r0 = "penDialogController"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00e0:
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0010
            X.5mG r0 = r3.A08
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A00
            r0.invalidate()
            X.622 r2 = r3.A0B
            X.6FV r1 = r2.A01
            X.65v r0 = r1.A03
            java.util.List r0 = r0.A00
            boolean r0 = X.C36401kF.A1a(r0)
            if (r0 == 0) goto L_0x0104
            r1.A02()
            X.6V4 r0 = r2.A00
            r0.A03()
            r0.A04()
        L_0x0104:
            r0 = 1
            X.AnonymousClass6OU.A00(r3, r0)
            goto L_0x0010
        L_0x010a:
            java.lang.Object r1 = r8.A00
            X.6YT r1 = (X.AnonymousClass6YT) r1
            java.util.HashMap r0 = X.AnonymousClass6WU.A0N
            X.5tC r0 = r1.A0h
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0121
            boolean r0 = r1.A0S()
            if (r0 != 0) goto L_0x0121
            X.AnonymousClass6YT.A07(r1)
            goto L_0x0010
        L_0x0121:
            X.66x r3 = r1.A0u
            r2 = 4
            int r1 = X.AnonymousClass6YT.A01(r1)
            r0 = 11
            X.C1270866x.A00(r3, r0, r2, r1)
            goto L_0x0010
        L_0x012f:
            java.lang.Object r1 = r8.A00
            X.5NC r1 = (X.AnonymousClass5NC) r1
            r0 = 1
            X.AnonymousClass5NC.A04(r1, r0)
            goto L_0x0010
        L_0x0139:
            java.lang.Object r1 = r8.A00
            X.4mr r1 = (X.C96144mr) r1
            int r0 = r1.A01
            boolean r0 = X.C96144mr.A03(r1, r0)
            return r0
        L_0x0144:
            java.lang.Object r1 = r8.A00
            X.4o3 r1 = (X.C96884o3) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            android.view.View$OnLongClickListener r0 = r1.A00
            if (r0 == 0) goto L_0x0153
            boolean r0 = r0.onLongClick(r9)
            return r0
        L_0x0153:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163337q2.onLongClick(android.view.View):boolean");
    }
}
