package X;

import android.content.Context;

/* renamed from: X.8fy  reason: invalid class name and case insensitive filesystem */
public class C178458fy extends AIB {
    public final /* synthetic */ AnonymousClass1XD A00;
    public final /* synthetic */ C29121Vk A01;
    public final /* synthetic */ B66 A02;
    public final /* synthetic */ C119985qm A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C178458fy(Context context, AnonymousClass1XD r2, C29221Vu r3, C29121Vk r4, B66 b66, C119985qm r6, C19640wH r7, String str) {
        super(context, r3, r7);
        this.A01 = r4;
        this.A02 = b66;
        this.A00 = r2;
        this.A04 = str;
        this.A03 = r6;
    }

    public void A05(C202059ky r4) {
        C165567td.A15(this.A01.A0F, r4, "get-methods: on-request-error=", AnonymousClass000.A0u());
        C23075B3f BBn = this.A02.BBn();
        if (BBn != null) {
            BBn.BOb(r4, 12);
        }
        AnonymousClass1XD r0 = this.A00;
        if (r0 != null) {
            r0.Bes(r4);
        }
    }

    public void A06(C202059ky r4) {
        C165567td.A15(this.A01.A0F, r4, "get-methods: on-response-error=", AnonymousClass000.A0u());
        C23075B3f BBn = this.A02.BBn();
        if (BBn != null) {
            BBn.BOb(r4, 12);
        }
        AnonymousClass1XD r0 = this.A00;
        if (r0 != null) {
            r0.Bf0(r4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0132, code lost:
        if (r2 > 1) goto L_0x0134;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C203399nx r21) {
        /*
            r20 = this;
            r11 = r20
            X.1Vk r10 = r11.A01
            X.1Dc r1 = r10.A0F
            java.lang.String r0 = "get-methods: on-response-success"
            r1.A07(r0)
            X.B66 r0 = r11.A02
            r18 = r0
            X.B3f r1 = r18.BBn()
            r12 = 0
            if (r1 == 0) goto L_0x001b
            r0 = 12
            r1.BOb(r12, r0)
        L_0x001b:
            r19 = r21
            X.9nx r13 = X.C203399nx.A03(r19)
            java.util.Objects.requireNonNull(r13)
            java.lang.String r0 = "instance-id"
            java.lang.String r9 = r13.A0i(r0, r12)
            if (r9 == 0) goto L_0x0070
            java.lang.String r0 = r11.A04
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = "wa-support-phone-number"
            java.lang.String r2 = r13.A0i(r0, r12)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x004b
            X.1Db r0 = r10.A0A
            android.content.SharedPreferences$Editor r1 = X.C90494aF.A0E(r0)
            java.lang.String r0 = "payments_support_phone_number"
            X.C36341k9.A0x(r1, r0, r2)
        L_0x004b:
            X.1XD r5 = r11.A00
            if (r5 == 0) goto L_0x006f
            X.8gh r4 = new X.8gh
            r4.<init>()
            X.1EU r0 = r10.A0D
            X.9YB r3 = r0.A01()
            X.3ty r2 = new X.3ty
            r2.<init>()
            X.0wU r1 = r3.A03
            r0 = 19
            X.C81193wc.A01(r1, r3, r2, r0)
            r1 = 3
            X.B9r r0 = new X.B9r
            r0.<init>(r5, r4, r1)
            r2.A0A(r0)
        L_0x006f:
            return
        L_0x0070:
            X.1VY r0 = r10.A0I
            java.util.ArrayList r1 = r0.A05(r13)
            X.AnonymousClass16S.A04(r1)
            X.1EV r0 = r10.A0C
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0098
            if (r1 == 0) goto L_0x011c
            java.util.Iterator r2 = r1.iterator()
        L_0x0087:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x011c
            X.9un r0 = X.C165607th.A0S(r2)
            int r1 = r0.A09()
            r0 = 5
            if (r1 != r0) goto L_0x0087
        L_0x0098:
            java.util.HashSet r8 = X.C36441kJ.A16()
            X.9nx[] r0 = r13.A02
            if (r0 == 0) goto L_0x0129
            int r7 = r0.length
            if (r7 <= 0) goto L_0x0129
            r6 = 0
        L_0x00a4:
            X.9nx r14 = r13.A0b(r6)
            X.C18740tg.A06(r14)
            java.lang.String r1 = r14.A00
            java.lang.String r0 = "alias"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0117
            r5 = 0
            r4 = r12
            r17 = r12
            r3 = r12
            r2 = 0
        L_0x00bb:
            X.1AL[] r1 = r14.A0k()
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0101
            r1 = r1[r2]
            java.lang.String r0 = r1.A02
            r16 = r0
            java.lang.String r1 = r1.A03
            java.lang.String r15 = "alias_value"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00d6
            r5 = r1
        L_0x00d3:
            int r2 = r2 + 1
            goto L_0x00bb
        L_0x00d6:
            java.lang.String r15 = "alias_id"
            r0 = r16
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00e3
            r17 = r1
            goto L_0x00d3
        L_0x00e3:
            java.lang.String r15 = "alias_type"
            r0 = r16
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00f2
            java.lang.String r4 = X.C90514aH.A0y(r1)
            goto L_0x00d3
        L_0x00f2:
            java.lang.String r15 = "alias_status"
            r0 = r16
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r3 = X.C90514aH.A0y(r1)
            goto L_0x00d3
        L_0x0101:
            X.6vT r2 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "upiAlias"
            X.6c7 r2 = X.C165617ti.A0P(r2, r1, r5, r0)
            X.9tr r1 = new X.9tr
            r0 = r17
            r1.<init>(r2, r4, r0, r3)
            r8.add(r1)
        L_0x0117:
            int r6 = r6 + 1
            if (r6 >= r7) goto L_0x0129
            goto L_0x00a4
        L_0x011c:
            X.1EU r1 = r10.A0D
            java.lang.String r0 = "merchant_account_linking_context"
            X.1EY r0 = r1.A02(r0)
            r0.A08()
            goto L_0x0098
        L_0x0129:
            X.9gl r4 = r18.BFJ()
            if (r4 == 0) goto L_0x0135
            monitor-enter(r4)
            goto L_0x0151
        L_0x0131:
            r0 = 1
            if (r2 <= r0) goto L_0x016b
        L_0x0134:
            monitor-exit(r4)
        L_0x0135:
            X.1XD r1 = r11.A00
            if (r1 == 0) goto L_0x013f
            r0 = 0
            X.96A r12 = new X.96A
            r12.<init>(r1, r0)
        L_0x013f:
            r1 = 0
            r0 = r19
            r10.A07(r12, r0, r1)
            X.1Vm r1 = r10.A0G
            X.5qm r0 = r11.A03
            if (r9 != 0) goto L_0x014d
            java.lang.String r9 = ""
        L_0x014d:
            r1.A00(r0, r9)
            return
        L_0x0151:
            int r2 = r8.size()     // Catch:{ all -> 0x019f }
            X.0yC r1 = r4.A01     // Catch:{ all -> 0x019f }
            r0 = 3114(0xc2a, float:4.364E-42)
            int r0 = r1.A07(r0)     // Catch:{ all -> 0x019f }
            int r0 = r0 + 1
            if (r2 > r0) goto L_0x0134
            boolean r0 = r8 instanceof java.util.Collection     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x017b
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x017b
        L_0x016b:
            boolean r0 = X.C200169gl.A00(r4, r8)     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x0134
            java.util.Set r0 = r4.A00     // Catch:{ all -> 0x019f }
            r0.clear()     // Catch:{ all -> 0x019f }
            r0.addAll(r8)     // Catch:{ all -> 0x019f }
            monitor-exit(r4)
            goto L_0x0135
        L_0x017b:
            java.util.Iterator r3 = r8.iterator()     // Catch:{ all -> 0x019f }
            r2 = 0
        L_0x0180:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x0131
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x019f }
            X.9tr r0 = (X.C206719tr) r0     // Catch:{ all -> 0x019f }
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x019f }
            java.lang.String r0 = "mobile_number"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x0180
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x0180
            java.lang.RuntimeException r0 = X.C36371kC.A0s()     // Catch:{ all -> 0x019f }
            throw r0     // Catch:{ all -> 0x019f }
        L_0x019f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178458fy.A07(X.9nx):void");
    }
}
