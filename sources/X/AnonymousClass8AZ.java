package X;

/* renamed from: X.8AZ  reason: invalid class name */
public final class AnonymousClass8AZ extends AnonymousClass9YG {
    public final /* synthetic */ C203169nR A00;

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011b, code lost:
        if (r5.A06 == null) goto L_0x011d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass95G r10) {
        /*
            r9 = this;
            r6 = 0
            X.89w r0 = X.C1695789w.A00
            boolean r0 = X.AnonymousClass00C.A0J(r10, r0)
            java.lang.String r2 = "sup:SUPDelegate"
            if (r0 == 0) goto L_0x015d
            X.9gk r4 = X.AnonymousClass9AO.A01
            java.lang.String r0 = "MediaStreamStateListener:onUserEvent RequestSGCameraOn"
            r4.A02(r2, r0)
            X.9nR r5 = r9.A00
            X.3FS r2 = r5.A02
            r1 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            X.3FS r0 = r2.A01(r1, r1, r0)
            if (r0 == 0) goto L_0x0023
            r5.A02 = r0
        L_0x0023:
            X.6Jp r1 = r5.A03
            X.B0d r0 = r1.A00
            if (r0 == 0) goto L_0x002e
            X.A1z r0 = (X.C20985A1z) r0
            r0.B5N()
        L_0x002e:
            X.C130076Jp.A00(r1)
            X.9gt r3 = r5.A0B
            android.view.Surface r5 = r5.A01
            java.lang.String r2 = "sup:MediaStreamController"
            java.lang.String r0 = "msc:start"
            r4.A01(r2, r0)
            boolean r0 = r3.A0L
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "msc, connecting, returning"
        L_0x0042:
            r4.A01(r2, r0)
            return
        L_0x0046:
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "msc, not connected, returning"
            goto L_0x0042
        L_0x004d:
            boolean r0 = r3.A0O
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "msc, already streaming, returning"
            goto L_0x0042
        L_0x0054:
            X.B4a r7 = r3.A07
            if (r7 == 0) goto L_0x00f1
            r0 = 1
            r7.markerStart(r0)
            int r1 = r3.A00
            r0 = 4
            r8 = 1
            if (r1 == r0) goto L_0x0063
            r8 = 0
        L_0x0063:
            boolean r0 = r3.A0N
            java.lang.String r1 = java.lang.String.valueOf(r0)
            if (r8 == 0) goto L_0x007d
            java.lang.String r0 = "is_in_call"
            r7.BPE(r0, r1)
            X.9ez r8 = X.C199259ez.A03
            java.lang.String r1 = r8.A00()
            java.lang.String r0 = "app_call_session_id"
        L_0x0078:
            r7.BPE(r0, r1)
            monitor-enter(r8)
            goto L_0x008b
        L_0x007d:
            java.lang.String r0 = "is_live"
            r7.BPE(r0, r1)
            X.9ez r8 = X.C199259ez.A03
            java.lang.String r1 = r8.A00()
            java.lang.String r0 = "app_stream_session_id"
            goto L_0x0078
        L_0x008b:
            java.lang.String r1 = X.C199259ez.A01     // Catch:{ all -> 0x00af }
            monitor-exit(r8)
            if (r1 == 0) goto L_0x0097
            java.lang.String r0 = "app_cold_start_session_id"
            r7.BPE(r0, r1)
        L_0x0095:
            monitor-enter(r8)
            goto L_0x009d
        L_0x0097:
            java.lang.String r0 = "COLD_START_SESSION_ID_NULL"
            X.C1695589u.A00(r3, r0)
            goto L_0x0095
        L_0x009d:
            java.lang.String r1 = X.C90464aC.A0V()     // Catch:{ all -> 0x00af }
            monitor-exit(r8)
            java.lang.String r0 = "app_warm_start_session_id"
            r7.BPE(r0, r1)
            monitor-enter(r8)
            int r1 = X.C199259ez.A00     // Catch:{ all -> 0x00af }
            int r0 = r1 + 1
            X.C199259ez.A00 = r0     // Catch:{ all -> 0x00af }
            goto L_0x00b2
        L_0x00af:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x00b2:
            monitor-exit(r8)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "app_warm_start_sequence_id"
            r7.BPE(r0, r1)
            java.lang.Integer r0 = r3.A0H
            java.lang.String r1 = X.AnonymousClass95C.A00(r0)
            java.lang.String r0 = "streaming_protocol"
            X.C198399dU.A00(r7, r3, r0, r1)
            java.lang.String r1 = X.AnonymousClass931.A01
            if (r1 == 0) goto L_0x0156
            java.lang.String r0 = "device_type"
            r7.BPE(r0, r1)
        L_0x00d0:
            java.lang.String r1 = X.AnonymousClass931.A03
            if (r1 == 0) goto L_0x0150
            java.lang.String r0 = "device_build_type"
            r7.BPE(r0, r1)
        L_0x00d9:
            java.lang.String r1 = X.AnonymousClass931.A02
            if (r1 == 0) goto L_0x014a
            java.lang.String r0 = "soc_version"
            r7.BPE(r0, r1)
        L_0x00e2:
            java.lang.String r1 = X.AnonymousClass931.A00
            if (r1 == 0) goto L_0x0144
            java.lang.String r0 = "build_flavor"
            r7.BPE(r0, r1)
        L_0x00eb:
            X.6n9 r7 = (X.AnonymousClass6n9) r7
            r7.A00 = r6
            monitor-enter(r8)
            monitor-exit(r8)
        L_0x00f1:
            java.lang.String r0 = "Activating video codec"
            r4.A01(r2, r0)
            X.9lQ r1 = r3.A02()
            r1.A05(r5)
            X.7Rs r0 = new X.7Rs
            r0.<init>(r3)
            r1.A08(r0)
            X.AgP r0 = new X.AgP
            r0.<init>(r3)
            r1.A07(r0)
            r1.A04()
            X.9ib r5 = r3.A0A
            if (r5 == 0) goto L_0x0127
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x011d
            X.03e r1 = r5.A06
            r0 = 1
            if (r1 != 0) goto L_0x011e
        L_0x011d:
            r0 = 0
        L_0x011e:
            java.lang.String r1 = "sup:FrameRateAdaptiveVideoConfigHandler"
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = "Handler already running, return"
            r4.A01(r1, r0)
        L_0x0127:
            java.lang.String r0 = "msc, asking client to start stream"
            r4.A01(r2, r0)
            X.9SO r0 = r3.A01()
            X.84B r1 = r0.A00
            X.8AV r0 = X.AnonymousClass8AV.A00
            r1.A04(r0)
            return
        L_0x0138:
            java.lang.String r0 = "Starting throughput monitor"
            r4.A01(r1, r0)
            r0 = 1
            r5.A07 = r0
            X.C200999ib.A01(r5)
            goto L_0x0127
        L_0x0144:
            java.lang.String r0 = "BUILD_FLAVOR_NULL"
            X.C1695589u.A00(r3, r0)
            goto L_0x00eb
        L_0x014a:
            java.lang.String r0 = "SOC_VERSION_NULL"
            X.C1695589u.A00(r3, r0)
            goto L_0x00e2
        L_0x0150:
            java.lang.String r0 = "DEVICE_BUILD_TYPE_NULL"
            X.C1695589u.A00(r3, r0)
            goto L_0x00d9
        L_0x0156:
            java.lang.String r0 = "DEVICE_TYPE_NULL"
            X.C1695589u.A00(r3, r0)
            goto L_0x00d0
        L_0x015d:
            X.89v r0 = X.C1695689v.A00
            boolean r0 = X.AnonymousClass00C.A0J(r10, r0)
            if (r0 == 0) goto L_0x0180
            X.9gk r1 = X.AnonymousClass9AO.A01
            java.lang.String r0 = "MediaStreamStateListener:onUserEvent RequestPhoneCameraOn"
            r1.A02(r2, r0)
            X.9nR r2 = r9.A00
            X.6Jp r1 = r2.A03
            X.B0d r0 = r1.A00
            if (r0 == 0) goto L_0x0179
            X.A1z r0 = (X.C20985A1z) r0
            r0.B5N()
        L_0x0179:
            X.C130076Jp.A00(r1)
            r2.A06()
            return
        L_0x0180:
            X.8A5 r0 = X.AnonymousClass8A5.A00
            X.AnonymousClass00C.A0J(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AZ.A05(X.95G):void");
    }

    public AnonymousClass8AZ(C203169nR r1) {
        this.A00 = r1;
    }
}
