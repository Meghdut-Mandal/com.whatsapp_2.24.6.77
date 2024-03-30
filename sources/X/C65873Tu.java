package X;

/* renamed from: X.3Tu  reason: invalid class name and case insensitive filesystem */
public class C65873Tu implements AnonymousClass004 {
    public Object A00;
    public final int A01;

    public C65873Tu(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bc, code lost:
        return X.C36381kD.A0H(r1, r0).mutate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        return new X.C196089Xp(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00a9;
                case 2: goto L_0x009d;
                case 3: goto L_0x007c;
                case 4: goto L_0x0013;
                case 5: goto L_0x002b;
                case 6: goto L_0x0022;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A00
            X.3OJ r0 = (X.AnonymousClass3OJ) r0
            X.9So r1 = r0.A09
            X.9R1 r0 = r0.A0I
        L_0x000d:
            X.9Xp r3 = new X.9Xp
            r3.<init>(r1, r0)
            return r3
        L_0x0013:
            java.lang.Object r0 = r5.A00
            X.3fk r0 = (X.C70803fk) r0
            X.9So r1 = r0.A1x
            X.005 r0 = r0.A5l
            java.lang.Object r0 = r0.get()
            X.9R1 r0 = (X.AnonymousClass9R1) r0
            goto L_0x000d
        L_0x0022:
            java.lang.Object r1 = r5.A00
            r0 = 7
            X.2hz r3 = new X.2hz
            r3.<init>(r1, r0)
            return r3
        L_0x002b:
            java.lang.Object r4 = r5.A00
            X.3fk r4 = (X.C70803fk) r4
            X.11F r3 = r4.A45
            X.C18740tg.A06(r3)
            X.4V6 r0 = r4.A2l
            X.3HC r2 = r0.getConversationRowCustomizers()
            X.12q r0 = r4.A3O
            boolean r0 = r0.A0O(r3)
            if (r0 == 0) goto L_0x0045
            X.4Ux r3 = r2.A05
            return r3
        L_0x0045:
            X.0yC r1 = r4.A3n
            boolean r0 = X.AnonymousClass143.A0G(r3)
            if (r0 == 0) goto L_0x0058
            r0 = 1825(0x721, float:2.557E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0058
            X.4Ux r3 = r2.A0A
            return r3
        L_0x0058:
            boolean r0 = X.C70803fk.A1X(r4)
            if (r0 == 0) goto L_0x0061
            X.4Ux r3 = r2.A0D
            return r3
        L_0x0061:
            boolean r0 = X.C70803fk.A1a(r4)
            if (r0 == 0) goto L_0x006c
            X.005 r0 = r4.A5i
            r0.get()
        L_0x006c:
            X.1K3 r0 = X.AnonymousClass3B6.A00(r4)
            boolean r0 = r0.BLB(r3)
            if (r0 == 0) goto L_0x0079
            X.4Ux r3 = r2.A02
            return r3
        L_0x0079:
            X.4Ux r3 = r2.A09
            return r3
        L_0x007c:
            java.lang.Object r0 = r5.A00
            X.3fR r0 = (X.C70613fR) r0
            android.graphics.Paint r3 = X.C36441kJ.A0K()
            X.0wG r0 = r0.A02
            android.content.Context r2 = r0.A00
            X.AnonymousClass00C.A08(r2)
            r1 = 2130969097(0x7f040209, float:1.7546866E38)
            r0 = 2131100182(0x7f060216, float:1.7812738E38)
            int r0 = X.C36351kA.A01(r2, r1, r0)
            X.C36401kF.A0z(r0, r3)
            r0 = 1
            r3.setAntiAlias(r0)
            return r3
        L_0x009d:
            java.lang.Object r0 = r5.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131231660(0x7f0803ac, float:1.8079407E38)
            goto L_0x00b4
        L_0x00a9:
            java.lang.Object r0 = r5.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131231834(0x7f08045a, float:1.807976E38)
        L_0x00b4:
            android.graphics.drawable.Drawable r0 = X.C36381kD.A0H(r1, r0)
            android.graphics.drawable.Drawable r3 = r0.mutate()
            return r3
        L_0x00bd:
            java.lang.Object r1 = r5.A00
            X.27v r1 = (X.AnonymousClass27v) r1
            boolean r0 = r1 instanceof com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity
            if (r0 == 0) goto L_0x00cd
            r0 = 25
        L_0x00c7:
            X.4WB r3 = new X.4WB
            r3.<init>(r1, r0)
            return r3
        L_0x00cd:
            boolean r0 = r1 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 == 0) goto L_0x00d3
            r0 = 5
            goto L_0x00c7
        L_0x00d3:
            r0 = 9
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65873Tu.get():java.lang.Object");
    }
}
