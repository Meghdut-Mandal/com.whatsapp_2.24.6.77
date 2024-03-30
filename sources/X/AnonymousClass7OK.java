package X;

/* renamed from: X.7OK  reason: invalid class name */
public final class AnonymousClass7OK extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass695 $linkedFbUserEntity;
    public final /* synthetic */ AnonymousClass5u5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7OK(AnonymousClass5u5 r2, AnonymousClass695 r3) {
        super(0);
        this.this$0 = r2;
        this.$linkedFbUserEntity = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r13 = this;
            X.5u5 r0 = r13.this$0
            X.005 r0 = r0.A02
            java.lang.Object r3 = r0.get()
            X.6Mx r3 = (X.C130906Mx) r3
            X.695 r0 = r13.$linkedFbUserEntity
            X.6bk r1 = r0.A00
            java.lang.String r0 = "XFAM_CROSSPOSTING_UNLINKING_GRAPH_API"
            java.lang.Object r2 = r1.A00(r0)
            X.C18740tg.A06(r2)
            X.AnonymousClass00C.A08(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = "me/permissions"
            r10 = 0
            X.AnonymousClass00C.A0D(r2, r10)
            r12 = 1
            X.0wD r0 = r3.A00
            boolean r0 = r0.A09()
            r7 = 0
            if (r0 != 0) goto L_0x0035
            r9 = -1
            X.5wH r6 = new X.5wH
            r8 = r7
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0035:
            java.lang.StringBuilder r1 = X.AnonymousClass6JD.A01(r1, r2)
            r0 = 24
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.13E r4 = r3.A01     // Catch:{ IOException -> 0x0075 }
            java.lang.String r6 = r1.toString()     // Catch:{ IOException -> 0x0075 }
            java.util.Map r9 = X.C19430v1.A0E     // Catch:{ IOException -> 0x0075 }
            java.lang.String r8 = "WhatsApp"
            java.lang.Integer r5 = X.C36371kC.A0p()     // Catch:{ IOException -> 0x0075 }
            r11 = 0
            X.6v1 r2 = X.AnonymousClass13E.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x0075 }
            java.net.HttpURLConnection r0 = r2.A01     // Catch:{ all -> 0x006e }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x006e }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0066
            X.5wH r6 = new X.5wH     // Catch:{ all -> 0x006e }
            r9 = 0
            r8 = r7
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x006e }
            r2.close()     // Catch:{ IOException -> 0x0075 }
            return r6
        L_0x0066:
            X.5wH r6 = X.C130906Mx.A00(r3, r2, r7)     // Catch:{ all -> 0x006e }
            r2.close()     // Catch:{ IOException -> 0x0075 }
            return r6
        L_0x006e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException -> 0x0075 }
            throw r0     // Catch:{ IOException -> 0x0075 }
        L_0x0075:
            r1 = move-exception
            X.5wH r6 = new X.5wH
            r3 = 1
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7OK.invoke():java.lang.Object");
    }
}
