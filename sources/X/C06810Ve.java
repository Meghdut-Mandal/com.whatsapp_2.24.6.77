package X;

/* renamed from: X.0Ve  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C06810Ve {
    public static final C15400nH A01(C17330r7 r6) {
        return new C15400nH(C023109s.A00, C008903u.A00, r6, -3, false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x009c: MOVE  (r1v4 java.util.concurrent.CancellationException) = (r3v1 java.util.concurrent.CancellationException)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068 A[Catch:{ all -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073 A[Catch:{ all -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    public static final java.lang.Object A00(X.C023509x r8, X.C17330r7 r9, X.AnonymousClass05G r10, boolean r11) {
        /*
            boolean r0 = r8 instanceof X.C13990km
            if (r0 == 0) goto L_0x002f
            r7 = r8
            X.0km r7 = (X.C13990km) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002f
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r6 = r7.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 == r3) goto L_0x003a
            if (r0 != r4) goto L_0x0035
            boolean r11 = r7.Z$0
            java.lang.Object r2 = r7.L$2
            X.0iv r2 = (X.C12950iv) r2
            java.lang.Object r9 = r7.L$1
            X.0r7 r9 = (X.C17330r7) r9
            java.lang.Object r10 = r7.L$0
            X.05G r10 = (X.AnonymousClass05G) r10
            goto L_0x0055
        L_0x002f:
            X.0km r7 = new X.0km
            r7.<init>(r8)
            goto L_0x0012
        L_0x0035:
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0e()
            throw r2
        L_0x003a:
            boolean r11 = r7.Z$0
            java.lang.Object r2 = r7.L$2
            X.0iv r2 = (X.C12950iv) r2
            java.lang.Object r9 = r7.L$1
            X.0r7 r9 = (X.C17330r7) r9
            java.lang.Object r10 = r7.L$0
            X.05G r10 = (X.AnonymousClass05G) r10
            goto L_0x0069
        L_0x0049:
            X.AnonymousClass0AN.A00(r6)
            boolean r0 = r10 instanceof X.C13020j2
            if (r0 != 0) goto L_0x00ae
            X.0iv r2 = r9.BNo()     // Catch:{ all -> 0x0092 }
            goto L_0x0058
        L_0x0055:
            X.AnonymousClass0AN.A00(r6)     // Catch:{ all -> 0x0092 }
        L_0x0058:
            r7.L$0 = r10     // Catch:{ all -> 0x0092 }
            r7.L$1 = r9     // Catch:{ all -> 0x0092 }
            r7.L$2 = r2     // Catch:{ all -> 0x0092 }
            r7.Z$0 = r11     // Catch:{ all -> 0x0092 }
            r7.label = r3     // Catch:{ all -> 0x0092 }
            java.lang.Object r6 = r2.A01(r7)     // Catch:{ all -> 0x0092 }
            if (r6 != r5) goto L_0x006c
            goto L_0x0088
        L_0x0069:
            X.AnonymousClass0AN.A00(r6)     // Catch:{ all -> 0x0092 }
        L_0x006c:
            r1 = 0
            boolean r0 = X.AnonymousClass000.A1X(r6)     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r2.A00()     // Catch:{ all -> 0x0092 }
            r7.L$0 = r10     // Catch:{ all -> 0x0092 }
            r7.L$1 = r9     // Catch:{ all -> 0x0092 }
            r7.L$2 = r2     // Catch:{ all -> 0x0092 }
            r7.Z$0 = r11     // Catch:{ all -> 0x0092 }
            r7.label = r4     // Catch:{ all -> 0x0092 }
            java.lang.Object r0 = r10.B6N(r0, r7)     // Catch:{ all -> 0x0092 }
            if (r0 != r5) goto L_0x0058
            goto L_0x0089
        L_0x0088:
            return r5
        L_0x0089:
            return r5
        L_0x008a:
            if (r11 == 0) goto L_0x008f
            r9.B2S(r1)
        L_0x008f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0092:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r2 = move-exception
            if (r11 == 0) goto L_0x00ad
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x00a0
            r1 = r3
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
            if (r1 != 0) goto L_0x00aa
        L_0x00a0:
            java.lang.String r0 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            r1.<init>(r0)
            r1.initCause(r3)
        L_0x00aa:
            r9.B2S(r1)
        L_0x00ad:
            throw r2
        L_0x00ae:
            X.0j2 r10 = (X.C13020j2) r10
            java.lang.Throwable r0 = r10.A00
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06810Ve.A00(X.09x, X.0r7, X.05G, boolean):java.lang.Object");
    }
}
