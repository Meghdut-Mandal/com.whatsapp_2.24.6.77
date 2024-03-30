package X;

/* renamed from: X.3Tc  reason: invalid class name and case insensitive filesystem */
public class C65693Tc implements C236119d {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C65693Tc(C99424tL r2, AnonymousClass4RS r3, AnonymousClass3DN r4, Runnable runnable) {
        this.A04 = 2;
        this.A00 = r4;
        this.A03 = runnable;
        this.A02 = r2;
        this.A01 = r3;
    }

    public void BVN(String str) {
        Object obj;
        int i = this.A04;
        StringBuilder A0u = AnonymousClass000.A0u();
        switch (i) {
            case 0:
                A0u.append("GroupIqResponseUtil/remove-participants/delivery fail; groupId=");
                obj = this.A03;
                break;
            case 1:
                A0u.append("GroupIqResponseUtil/add-admin/delivery fail; groupId=");
                obj = this.A01;
                break;
            default:
                C36321k7.A1Q("GdprXmppMethods/sendDeleteGdprReport/onDeliveryFailure; iq=", str, A0u);
                C36321k7.A0R((C170888Hw) this.A02, "XMPP IQ was not delivered: iq=", str, AnonymousClass000.A0u());
                return;
        }
        C36321k7.A1N(((AnonymousClass23D) obj).A03, A0u);
    }

    public void BWw(C203399nx r4, String str) {
        Object obj;
        switch (this.A04) {
            case 0:
                obj = this.A01;
                break;
            case 1:
                obj = this.A02;
                break;
            default:
                int A002 = AnonymousClass3ME.A00(r4);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("GdprXmppMethods/sendDeleteGdprReport/onError; iq=");
                A0u.append(str);
                C36321k7.A1T(", error=", A0u, A002);
                ((AnonymousClass4RS) this.A01).Bou(A002);
                C36381kD.A1J(this.A02);
                return;
        }
        ((AnonymousClass4RS) obj).Bou(AnonymousClass3ME.A00(r4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0080, code lost:
        ((X.AnonymousClass4RS) r1).Bou(800);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0087, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c5, code lost:
        X.C36411kG.A1O(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r8, java.lang.String r9) {
        /*
            r7 = this;
            int r0 = r7.A04
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x005c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GdprXmppMethods/sendDeleteGdprReport/onSuccess; iq="
            X.C36321k7.A1Q(r0, r9, r1)
            java.lang.Object r0 = r7.A03
            X.C36411kG.A1O(r0)
            java.lang.Object r0 = r7.A02
            X.C36381kD.A1J(r0)
            return
        L_0x0019:
            java.lang.Class<X.147> r1 = X.AnonymousClass147.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r5 = r8.A0X(r1, r0)
            if (r5 != 0) goto L_0x0026
            java.lang.Object r1 = r7.A01
            goto L_0x0080
        L_0x0026:
            java.util.HashMap r4 = X.AnonymousClass001.A0J()
            java.util.HashMap r3 = X.AnonymousClass001.A0J()
            java.lang.Object r1 = r7.A00
            X.0xg r1 = (X.C20510xg) r1
            java.lang.String r0 = "remove"
            X.AnonymousClass3R9.A02(r8, r0, r4, r3)
            X.0xQ r2 = X.C36431kI.A0d(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "groupmgr/onRemoveGroupParticipants/"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C36341k9.A0h(r1, r4, r3)
            X.C36321k7.A1a(r1, r0)
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0059
            r0 = 3002(0xbba, float:4.207E-42)
            r2.A0T(r0, r3)
        L_0x0059:
            java.lang.Object r0 = r7.A02
            goto L_0x00c5
        L_0x005c:
            java.lang.Object r6 = r7.A00
            X.0xg r6 = (X.C20510xg) r6
            X.005 r0 = r6.A09
            java.lang.Object r1 = r0.get()
            X.1EM r1 = (X.AnonymousClass1EM) r1
            java.lang.Object r0 = r7.A01
            X.23D r0 = (X.AnonymousClass23D) r0
            X.147 r0 = r0.A03
            boolean r2 = r1.A06(r0)
            java.lang.Class<X.147> r1 = X.AnonymousClass147.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r5 = r8.A0X(r1, r0)
            X.147 r5 = (X.AnonymousClass147) r5
            if (r5 != 0) goto L_0x0088
            java.lang.Object r1 = r7.A02
        L_0x0080:
            X.4RS r1 = (X.AnonymousClass4RS) r1
            r0 = 800(0x320, float:1.121E-42)
            r1.Bou(r0)
            return
        L_0x0088:
            java.util.HashMap r4 = X.AnonymousClass001.A0J()
            java.util.HashMap r3 = X.AnonymousClass001.A0J()
            if (r2 == 0) goto L_0x00c9
            java.lang.String r0 = "admin"
        L_0x0094:
            X.AnonymousClass3R9.A02(r8, r0, r4, r3)
            X.0xQ r2 = X.C36431kI.A0d(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "groupmgr/onPromoteGroupParticipants/"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C36341k9.A0h(r1, r4, r3)
            X.C36321k7.A1a(r1, r0)
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x00c3
            X.1EM r0 = r2.A11
            boolean r1 = r0.A06(r5)
            r0 = 3003(0xbbb, float:4.208E-42)
            if (r1 == 0) goto L_0x00c0
            r0 = 3019(0xbcb, float:4.23E-42)
        L_0x00c0:
            r2.A0T(r0, r3)
        L_0x00c3:
            java.lang.Object r0 = r7.A03
        L_0x00c5:
            X.C36411kG.A1O(r0)
            return
        L_0x00c9:
            java.lang.String r0 = "promote"
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65693Tc.BiM(X.9nx, java.lang.String):void");
    }

    public C65693Tc(AnonymousClass23D r1, C20510xg r2, AnonymousClass4RS r3, Runnable runnable, int i) {
        this.A04 = i;
        this.A00 = r2;
        if (i != 0) {
            this.A01 = r1;
            this.A02 = r3;
            this.A03 = runnable;
        } else {
            this.A01 = r3;
            this.A02 = runnable;
            this.A03 = r1;
        }
    }
}
