package X;

/* renamed from: X.Akd  reason: case insensitive filesystem */
public final class C22315Akd extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass8A7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22315Akd(AnonymousClass8A7 r2) {
        super(1);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r6 = r4.A00;
        r4 = r6.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r4 == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r0 = "request_media_stream_start_unknown_failure";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r4.BPE("failure_reason", r0);
        r4.BPF(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        r5 = new X.C1695389s(r1);
        r1 = X.AnonymousClass000.A0u();
        r1.append("Stream Start Failure - Error: ");
        r1.append(r5.A00);
        r0 = X.C90524aI.A0i(X.AnonymousClass000.A0q(" -- DUMP STATE:\n\t", r1));
        r6.A05(r0);
        r2.A06("sup:MediaStreamState", r0.toString(), (java.lang.Throwable) null);
        r6.A04(new X.AnonymousClass8AO(r5));
        r6.A0N.invoke(r5, X.AnonymousClass81Q.A00(r6, r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            X.95A r8 = (X.AnonymousClass95A) r8
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            boolean r0 = r8 instanceof X.C1694289d
            if (r0 == 0) goto L_0x0016
            X.8A7 r0 = r7.this$0
            X.84B r1 = r0.A00
            X.8AX r0 = X.AnonymousClass8AX.A00
            r1.A04(r0)
        L_0x0013:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0016:
            boolean r0 = r8 instanceof X.C1693989a
            if (r0 == 0) goto L_0x00c4
            X.9gk r2 = X.AnonymousClass9AO.A01
            java.lang.String r1 = "sup:IdleStateDelegate"
            X.89a r8 = (X.C1693989a) r8
            java.lang.Throwable r3 = r8.A00
            java.lang.String r0 = "[IDLE]: Start Stream Callback: InternalError"
            r2.A05(r1, r0, r3)
            X.8A7 r4 = r7.this$0
            java.lang.String r1 = "LIVE_STREAM_START_INTERNAL_ERROR"
        L_0x002b:
            int r0 = r1.hashCode()
            java.lang.String r5 = "failure_reason"
            switch(r0) {
                case -646453283: goto L_0x007f;
                case -195374854: goto L_0x0090;
                case 39350972: goto L_0x00a1;
                case 554408463: goto L_0x00b2;
                default: goto L_0x0034;
            }
        L_0x0034:
            X.84B r6 = r4.A00
            X.B4a r4 = r6.A0H
            if (r4 == 0) goto L_0x0043
            java.lang.String r0 = "request_media_stream_start_unknown_failure"
        L_0x003c:
            r4.BPE(r5, r0)
            r0 = 3
            r4.BPF(r0)
        L_0x0043:
            X.89s r5 = new X.89s
            r5.<init>(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Stream Start Failure - Error: "
            r1.append(r0)
            java.lang.String r0 = r5.A00
            r1.append(r0)
            java.lang.String r0 = " -- DUMP STATE:\n\t"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.StringBuilder r0 = X.C90524aI.A0i(r0)
            r6.A05(r0)
            java.lang.String r4 = r0.toString()
            java.lang.String r1 = "sup:MediaStreamState"
            r0 = 0
            r2.A06(r1, r4, r0)
            X.8AO r0 = new X.8AO
            r0.<init>(r5)
            r6.A04(r0)
            X.03v r1 = r6.A0N
            X.88E r0 = X.AnonymousClass81Q.A00(r6, r3)
            r1.invoke(r5, r0)
            goto L_0x0013
        L_0x007f:
            java.lang.String r0 = "LIVE_STREAM_START_DOFF_ERROR"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.84B r6 = r4.A00
            X.B4a r4 = r6.A0H
            if (r4 == 0) goto L_0x0043
            java.lang.String r0 = "request_media_stream_device_doff"
            goto L_0x003c
        L_0x0090:
            java.lang.String r0 = "LIVE_STREAM_START_UNSUPPORTED_PARAM"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.84B r6 = r4.A00
            X.B4a r4 = r6.A0H
            if (r4 == 0) goto L_0x0043
            java.lang.String r0 = "request_media_stream_start_unsupported_parameter_failure"
            goto L_0x003c
        L_0x00a1:
            java.lang.String r0 = "LIVE_STREAM_START_INVALID_PARAM"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.84B r6 = r4.A00
            X.B4a r4 = r6.A0H
            if (r4 == 0) goto L_0x0043
            java.lang.String r0 = "request_media_stream_start_invalid_parameter_failure"
            goto L_0x003c
        L_0x00b2:
            java.lang.String r0 = "LIVE_STREAM_START_INTERNAL_ERROR"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.84B r6 = r4.A00
            X.B4a r4 = r6.A0H
            if (r4 == 0) goto L_0x0043
            java.lang.String r0 = "request_media_stream_start_internal_failure"
            goto L_0x003c
        L_0x00c4:
            boolean r0 = r8 instanceof X.C1694089b
            if (r0 == 0) goto L_0x00db
            X.9gk r2 = X.AnonymousClass9AO.A01
            java.lang.String r1 = "sup:IdleStateDelegate"
            X.89b r8 = (X.C1694089b) r8
            java.lang.Throwable r3 = r8.A00
            java.lang.String r0 = "[IDLE]: Start Stream Callback: InvalidParameterError"
            r2.A05(r1, r0, r3)
            X.8A7 r4 = r7.this$0
            java.lang.String r1 = "LIVE_STREAM_START_INVALID_PARAM"
            goto L_0x002b
        L_0x00db:
            boolean r0 = r8 instanceof X.C1694189c
            if (r0 == 0) goto L_0x00f2
            X.9gk r2 = X.AnonymousClass9AO.A01
            java.lang.String r1 = "sup:IdleStateDelegate"
            X.89c r8 = (X.C1694189c) r8
            java.lang.Throwable r3 = r8.A00
            java.lang.String r0 = "[IDLE]: Start Stream Callback: UnsupportedParameterError"
            r2.A05(r1, r0, r3)
            X.8A7 r4 = r7.this$0
            java.lang.String r1 = "LIVE_STREAM_START_UNSUPPORTED_PARAM"
            goto L_0x002b
        L_0x00f2:
            boolean r0 = r8 instanceof X.AnonymousClass89Z
            if (r0 == 0) goto L_0x0013
            X.9gk r2 = X.AnonymousClass9AO.A01
            java.lang.String r1 = "sup:IdleStateDelegate"
            X.89Z r8 = (X.AnonymousClass89Z) r8
            java.lang.Throwable r3 = r8.A00
            java.lang.String r0 = "[IDLE]: Start Stream Callback: DeviceDoff. Device cannot start stream!"
            r2.A05(r1, r0, r3)
            X.8A7 r4 = r7.this$0
            java.lang.String r1 = "LIVE_STREAM_START_DOFF_ERROR"
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22315Akd.invoke(java.lang.Object):java.lang.Object");
    }
}
