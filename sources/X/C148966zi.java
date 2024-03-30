package X;

/* renamed from: X.6zi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C148966zi implements C158597hl {
    public final /* synthetic */ AnonymousClass54F A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C148966zi(AnonymousClass54F r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r0.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010f, code lost:
        r2.A0C(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0112, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BX5(java.lang.Object r10) {
        /*
            r9 = this;
            X.54F r6 = r9.A00
            java.lang.String r1 = r9.A01
            X.70C r10 = (X.AnonymousClass70C) r10
            r0 = 2
            X.AnonymousClass00C.A0D(r10, r0)
            java.lang.String r4 = r10.A00
            java.util.Map r5 = r10.A02
            int r3 = r1.hashCode()
            java.lang.String r0 = "EVENT_PARAM_BLOKS_PARAMS"
            java.lang.String r1 = X.C36431kI.A1A(r0, r5)
            r2 = 0
            if (r1 == 0) goto L_0x0137
            org.json.JSONTokener r0 = new org.json.JSONTokener
            r0.<init>(r1)
            java.lang.Object r0 = r0.nextValue()
            X.AnonymousClass00C.A0B(r0)
            java.lang.Object r8 = X.AnonymousClass6HO.A00(r0)
            boolean r0 = r8 instanceof java.util.Map
            if (r0 == 0) goto L_0x0033
            java.util.Map r8 = (java.util.Map) r8
            if (r8 != 0) goto L_0x0037
        L_0x0033:
            X.00f r8 = X.C000400e.A0D()
        L_0x0037:
            int r0 = r4.hashCode()
            java.lang.String r7 = "screen_id"
            java.lang.String r1 = "bloks_request_end"
            switch(r0) {
                case -1448417750: goto L_0x0043;
                case -330036277: goto L_0x005c;
                case -226946541: goto L_0x0078;
                case -20769540: goto L_0x0094;
                case 427609089: goto L_0x00a2;
                case 499865650: goto L_0x00b8;
                case 553649050: goto L_0x00e7;
                case 1483529842: goto L_0x0113;
                default: goto L_0x0042;
            }
        L_0x0042:
            return
        L_0x0043:
            java.lang.String r0 = "PREFETCH_REQUEST_START"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0042
            if (r8 == 0) goto L_0x0051
            java.lang.Object r2 = r8.get(r7)
        L_0x0051:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x0042
            if (r2 == 0) goto L_0x0042
            X.1KT r0 = r6.A04
            java.util.List r0 = r0.A02
            goto L_0x0074
        L_0x005c:
            java.lang.String r0 = "PREFETCH_REQUEST_SUCCESS"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0042
            if (r8 == 0) goto L_0x006a
            java.lang.Object r2 = r8.get(r7)
        L_0x006a:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x0042
            if (r2 == 0) goto L_0x0042
            X.1KT r0 = r6.A04
            java.util.List r0 = r0.A01
        L_0x0074:
            r0.add(r2)
            return
        L_0x0078:
            java.lang.String r0 = "REQUEST_SUCCESS"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0042
            X.1KT r2 = r6.A04
            X.C90494aF.A0x(r2, r1, r3)
            java.util.List r1 = r2.A02
            java.lang.String r0 = "prefetches_started"
            r2.A0A(r1, r3, r0)
            java.util.List r1 = r2.A01
            java.lang.String r0 = "prefetches_ended"
            r2.A0A(r1, r3, r0)
            return
        L_0x0094:
            java.lang.String r0 = "DROP_QPL_LOGGING_MARKER"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0042
            X.1KT r0 = r6.A04
            X.C90504aG.A1D(r0, r3)
            return
        L_0x00a2:
            java.lang.String r0 = "OPEN_SCREEN"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0042
            X.0yC r1 = r6.A06
            r0 = 4510(0x119e, float:6.32E-42)
            boolean r0 = r1.A0E(r0)
            X.1KT r2 = r6.A04
            if (r0 != 0) goto L_0x013a
            r0 = 2
            goto L_0x010f
        L_0x00b8:
            java.lang.String r0 = "PAYLOAD_SIZE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "EVENT_PARAM_COMPRESSED_SIZE"
            java.lang.String r0 = X.C36431kI.A1A(r0, r5)
            if (r0 == 0) goto L_0x00d3
            X.1KT r4 = r6.A04
            long r1 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = "bloks_compressed_size"
            r4.A02(r3, r0, r1)
        L_0x00d3:
            java.lang.String r0 = "EVENT_PARAM_UNCOMPRESSED_SIZE"
            java.lang.String r0 = X.C36431kI.A1A(r0, r5)
            if (r0 == 0) goto L_0x0042
            X.1KT r4 = r6.A04
            long r1 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = "bloks_uncompressed_size"
            r4.A02(r3, r0, r1)
            return
        L_0x00e7:
            java.lang.String r0 = "REQUEST_FAILURE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0042
            X.1KT r2 = r6.A04
            X.C90494aF.A0x(r2, r1, r3)
            java.lang.String r0 = "EVENT_PARAM_ERROR_CODE"
            java.lang.String r1 = X.C36431kI.A1A(r0, r5)
            if (r1 == 0) goto L_0x0101
            java.lang.String r0 = "bloks_error_code"
            r2.A03(r3, r0, r1)
        L_0x0101:
            java.lang.String r0 = "EVENT_PARAM_ERROR_MESSAGE"
            java.lang.String r1 = X.C36431kI.A1A(r0, r5)
            if (r1 == 0) goto L_0x010e
            java.lang.String r0 = "bloks_error_message"
            r2.A03(r3, r0, r1)
        L_0x010e:
            r0 = 3
        L_0x010f:
            r2.A0C(r3, r0)
            return
        L_0x0113:
            java.lang.String r0 = "REQUEST_START"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0042
            X.1KT r2 = r6.A04
            java.util.List r0 = r2.A02
            r0.clear()
            java.util.List r0 = r2.A01
            r0.clear()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "bloks_request_start"
            r2.A08(r1, r0)
            r1 = 0
            java.lang.String r0 = "bloks_cache_hit"
            r2.A04(r3, r0, r1)
            return
        L_0x0137:
            r8 = r2
            goto L_0x0037
        L_0x013a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "bloks_render_start"
            r2.A08(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148966zi.BX5(java.lang.Object):void");
    }
}
