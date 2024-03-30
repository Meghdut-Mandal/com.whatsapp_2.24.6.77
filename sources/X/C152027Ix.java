package X;

/* renamed from: X.7Ix  reason: invalid class name and case insensitive filesystem */
public final class C152027Ix extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C130356Kt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152027Ix(C130356Kt r2) {
        super(0);
        this.this$0 = r2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x000a A[EDGE_INSN: B:182:0x000a->B:178:0x000a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r17 = this;
            r4 = r17
            X.6Kt r3 = r4.this$0
            java.util.Set r0 = r3.A01
            java.util.Iterator r9 = r0.iterator()
        L_0x000a:
            boolean r0 = r9.hasNext()
            java.lang.String r16 = "visitChildren called on an unattached node"
            r8 = 1024(0x400, float:1.435E-42)
            r10 = 1
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r7 = r9.next()
            X.7nP r7 = (X.C161747nP) r7
            X.6gq r7 = (X.C137856gq) r7
            X.6gq r6 = r7.A03
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x000a
            r5 = 0
        L_0x0024:
            boolean r0 = r6 instanceof X.C94214hq
            if (r0 == 0) goto L_0x009f
            java.util.Set r0 = r3.A02
            r0.add(r6)
        L_0x002d:
            X.6gq r6 = X.AnonymousClass6VZ.A00(r5)
        L_0x0031:
            if (r6 != 0) goto L_0x0024
            X.6gq r7 = r7.A03
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x00cf
            X.76e r6 = X.C1506776e.A01()
            X.6gq r0 = r7.A02
            if (r0 == 0) goto L_0x0051
            r6.A0D(r0)
        L_0x0044:
            int r0 = r6.A00
            if (r0 == 0) goto L_0x000a
            X.6gq r7 = X.C1506776e.A03(r6, r0)
            int r0 = r7.A00
            r0 = r0 & r8
            if (r0 != 0) goto L_0x0057
        L_0x0051:
            X.AnonymousClass6VZ.A04(r6, r7)
            goto L_0x0044
        L_0x0055:
            if (r7 == 0) goto L_0x0044
        L_0x0057:
            int r0 = r7.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x009c
            r5 = 0
        L_0x005d:
            boolean r0 = r7 instanceof X.C94214hq
            if (r0 == 0) goto L_0x006d
            java.util.Set r0 = r3.A02
            r0.add(r7)
        L_0x0066:
            X.6gq r7 = X.AnonymousClass6VZ.A00(r5)
        L_0x006a:
            if (r7 == 0) goto L_0x0044
            goto L_0x005d
        L_0x006d:
            int r0 = r7.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0066
            boolean r0 = r7 instanceof X.C94114hf
            if (r0 == 0) goto L_0x0066
            r0 = r7
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x007c:
            if (r2 == 0) goto L_0x0099
            int r0 = r2.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0088
            int r1 = r1 + 1
            if (r1 != r10) goto L_0x008b
            r7 = r2
        L_0x0088:
            X.6gq r2 = r2.A02
            goto L_0x007c
        L_0x008b:
            X.76e r5 = X.C90464aC.A0G(r5)
            if (r7 == 0) goto L_0x0095
            r5.A0D(r7)
            r7 = 0
        L_0x0095:
            r5.A0D(r2)
            goto L_0x0088
        L_0x0099:
            if (r1 != r10) goto L_0x0066
            goto L_0x006a
        L_0x009c:
            X.6gq r7 = r7.A02
            goto L_0x0055
        L_0x009f:
            int r0 = r6.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x002d
            boolean r0 = r6 instanceof X.C94114hf
            if (r0 == 0) goto L_0x002d
            r0 = r6
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x00ae:
            if (r2 == 0) goto L_0x00cb
            int r0 = r2.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x00ba
            int r1 = r1 + 1
            if (r1 != r10) goto L_0x00bd
            r6 = r2
        L_0x00ba:
            X.6gq r2 = r2.A02
            goto L_0x00ae
        L_0x00bd:
            X.76e r5 = X.C90464aC.A0G(r5)
            if (r6 == 0) goto L_0x00c7
            r5.A0D(r6)
            r6 = 0
        L_0x00c7:
            r5.A0D(r2)
            goto L_0x00ba
        L_0x00cb:
            if (r1 != r10) goto L_0x002d
            goto L_0x0031
        L_0x00cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r16)
            throw r0
        L_0x00d4:
            X.6Kt r0 = r4.this$0
            java.util.Set r0 = r0.A01
            r0.clear()
            java.util.LinkedHashSet r5 = X.C36441kJ.A17()
            X.6Kt r9 = r4.this$0
            java.util.Set r0 = r9.A00
            java.util.Iterator r15 = r0.iterator()
        L_0x00e7:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01e4
            java.lang.Object r8 = r15.next()
            X.7nO r8 = (X.C161737nO) r8
            r7 = r8
            X.6gq r7 = (X.C137856gq) r7
            X.6gq r6 = r7.A03
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x01cf
            r14 = 1024(0x400, float:1.435E-42)
            r13 = 0
            r3 = 0
            r12 = 1
            r11 = 0
        L_0x0102:
            boolean r0 = r6 instanceof X.C94214hq
            if (r0 == 0) goto L_0x0197
            X.4hq r6 = (X.C94214hq) r6
            if (r13 == 0) goto L_0x010b
            r11 = 1
        L_0x010b:
            java.util.Set r0 = r9.A02
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x0117
            r5.add(r6)
            r12 = 0
        L_0x0117:
            r13 = r6
        L_0x0118:
            X.6gq r6 = X.AnonymousClass6VZ.A00(r3)
        L_0x011c:
            if (r6 != 0) goto L_0x0102
            X.6gq r7 = r7.A03
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x01df
            X.76e r6 = X.C1506776e.A01()
            X.6gq r0 = r7.A02
            if (r0 == 0) goto L_0x013c
            r6.A0D(r0)
        L_0x012f:
            int r0 = r6.A00
            if (r0 == 0) goto L_0x01d2
            X.6gq r7 = X.C1506776e.A03(r6, r0)
            int r0 = r7.A00
            r0 = r0 & r14
            if (r0 != 0) goto L_0x0142
        L_0x013c:
            X.AnonymousClass6VZ.A04(r6, r7)
            goto L_0x012f
        L_0x0140:
            if (r7 == 0) goto L_0x012f
        L_0x0142:
            int r0 = r7.A01
            r0 = r0 & r14
            if (r0 == 0) goto L_0x0194
            r3 = 0
        L_0x0148:
            boolean r0 = r7 instanceof X.C94214hq
            if (r0 == 0) goto L_0x0165
            X.4hq r7 = (X.C94214hq) r7
            if (r13 == 0) goto L_0x0151
            r11 = 1
        L_0x0151:
            java.util.Set r0 = r9.A02
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x015d
            r5.add(r7)
            r12 = 0
        L_0x015d:
            r13 = r7
        L_0x015e:
            X.6gq r7 = X.AnonymousClass6VZ.A00(r3)
        L_0x0162:
            if (r7 == 0) goto L_0x012f
            goto L_0x0148
        L_0x0165:
            int r0 = r7.A01
            r0 = r0 & r14
            if (r0 == 0) goto L_0x015e
            boolean r0 = r7 instanceof X.C94114hf
            if (r0 == 0) goto L_0x015e
            r0 = r7
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x0174:
            if (r2 == 0) goto L_0x0191
            int r0 = r2.A01
            r0 = r0 & r14
            if (r0 == 0) goto L_0x0180
            int r1 = r1 + 1
            if (r1 != r10) goto L_0x0183
            r7 = r2
        L_0x0180:
            X.6gq r2 = r2.A02
            goto L_0x0174
        L_0x0183:
            X.76e r3 = X.C90464aC.A0G(r3)
            if (r7 == 0) goto L_0x018d
            r3.A0D(r7)
            r7 = 0
        L_0x018d:
            r3.A0D(r2)
            goto L_0x0180
        L_0x0191:
            if (r1 != r10) goto L_0x015e
            goto L_0x0162
        L_0x0194:
            X.6gq r7 = r7.A02
            goto L_0x0140
        L_0x0197:
            int r0 = r6.A01
            r0 = r0 & r14
            if (r0 == 0) goto L_0x0118
            boolean r0 = r6 instanceof X.C94114hf
            if (r0 == 0) goto L_0x0118
            r0 = r6
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x01a6:
            if (r2 == 0) goto L_0x01c3
            int r0 = r2.A01
            r0 = r0 & r14
            if (r0 == 0) goto L_0x01b2
            int r1 = r1 + 1
            if (r1 != r10) goto L_0x01b5
            r6 = r2
        L_0x01b2:
            X.6gq r2 = r2.A02
            goto L_0x01a6
        L_0x01b5:
            X.76e r3 = X.C90464aC.A0G(r3)
            if (r6 == 0) goto L_0x01bf
            r3.A0D(r6)
            r6 = 0
        L_0x01bf:
            r3.A0D(r2)
            goto L_0x01b2
        L_0x01c3:
            if (r1 != r10) goto L_0x0118
            goto L_0x011c
        L_0x01c7:
            if (r13 == 0) goto L_0x01cf
            X.5U8 r0 = r13.A0G()
            if (r0 != 0) goto L_0x01da
        L_0x01cf:
            X.5U8 r0 = X.AnonymousClass5U8.Inactive
            goto L_0x01da
        L_0x01d2:
            if (r12 == 0) goto L_0x00e7
            if (r11 == 0) goto L_0x01c7
            X.5U8 r0 = X.AnonymousClass6QT.A00(r8)
        L_0x01da:
            r8.BYG(r0)
            goto L_0x00e7
        L_0x01df:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r16)
            throw r0
        L_0x01e4:
            X.6Kt r0 = r4.this$0
            java.util.Set r0 = r0.A00
            r0.clear()
            X.6Kt r0 = r4.this$0
            java.util.Set r0 = r0.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x01f3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x021a
            java.lang.Object r2 = r3.next()
            X.4hq r2 = (X.C94214hq) r2
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x01f3
            X.5U8 r1 = r2.A0G()
            r2.A0H()
            X.5U8 r0 = r2.A0G()
            if (r1 != r0) goto L_0x0216
            boolean r0 = r5.contains(r2)
            if (r0 == 0) goto L_0x01f3
        L_0x0216:
            X.AnonymousClass6QT.A02(r2)
            goto L_0x01f3
        L_0x021a:
            X.6Kt r0 = r4.this$0
            java.util.Set r0 = r0.A02
            r0.clear()
            r5.clear()
            X.6Kt r0 = r4.this$0
            java.util.Set r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0253
            X.6Kt r0 = r4.this$0
            java.util.Set r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x024c
            X.6Kt r0 = r4.this$0
            java.util.Set r0 = r0.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0245
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0245:
            java.lang.String r0 = "Unprocessed FocusTarget nodes"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x024c:
            java.lang.String r0 = "Unprocessed FocusEvent nodes"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0253:
            java.lang.String r0 = "Unprocessed FocusProperties nodes"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152027Ix.invoke():java.lang.Object");
    }
}
