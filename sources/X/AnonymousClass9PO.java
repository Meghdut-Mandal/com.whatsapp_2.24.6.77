package X;

/* renamed from: X.9PO  reason: invalid class name */
public final class AnonymousClass9PO {
    public final C200219gt A00;

    /* JADX WARNING: Removed duplicated region for block: B:127:0x022f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass95B r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof X.AnonymousClass89m
            java.lang.String r3 = "sup:MediaStreamSupEventUtil"
            r4 = 1
            if (r0 == 0) goto L_0x004f
            X.9gt r2 = r13.A00
            boolean r0 = r2.A0P
            if (r0 != 0) goto L_0x000f
            r2.A0P = r4
        L_0x000f:
            boolean r0 = r2.A0O
            if (r0 == 0) goto L_0x002b
            X.9lQ r0 = r2.A02()
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x002b
            X.9gk r1 = X.AnonymousClass9AO.A01
            java.lang.String r0 = "Got Video Codec Frame"
            r1.A01(r3, r0)
            X.9lQ r0 = r2.A02()
            r0.A09(r4)
        L_0x002b:
            X.9lQ r1 = r2.A02()
            X.89m r14 = (X.AnonymousClass89m) r14
            java.nio.ByteBuffer r0 = r14.A00
            r1.A06(r0, 0)
            X.9jP r1 = r2.A0E
            if (r1 == 0) goto L_0x0041
            int r0 = r0.limit()
            r1.A01(r0)
        L_0x0041:
            X.9ib r0 = r2.A0A
            if (r0 == 0) goto L_0x004e
            X.9gk r2 = X.AnonymousClass9AO.A01
            java.lang.String r1 = "sup:FrameRateAdaptiveVideoConfigHandler"
            java.lang.String r0 = "Received codec frame"
            r2.A01(r1, r0)
        L_0x004e:
            return
        L_0x004f:
            boolean r0 = r14 instanceof X.AnonymousClass89o
            if (r0 == 0) goto L_0x00da
            X.9gt r6 = r13.A00
            X.9lQ r2 = r6.A02()
            X.89o r14 = (X.AnonymousClass89o) r14
            java.nio.ByteBuffer r5 = r14.A01
            long r0 = r14.A00
            r2.A06(r5, r0)
            X.B4a r3 = r6.A07
            if (r3 == 0) goto L_0x0076
            r2 = r3
            X.6n9 r2 = (X.AnonymousClass6n9) r2
            int r2 = r2.A00
            if (r2 != 0) goto L_0x0076
            java.lang.String r2 = "first_video_frame_received"
            r3.BPK(r2)
            X.6n9 r3 = (X.AnonymousClass6n9) r3
            r3.A00 = r4
        L_0x0076:
            X.9jP r3 = r6.A0E
            if (r3 == 0) goto L_0x0081
            int r2 = r5.limit()
            r3.A01(r2)
        L_0x0081:
            X.9ib r3 = r6.A0A
            if (r3 == 0) goto L_0x004e
            boolean r2 = r3.A07
            if (r2 == 0) goto L_0x004e
            X.9cv r9 = r3.A04
            long r4 = android.os.SystemClock.uptimeMillis()
            r2 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r2
            long r0 = r0 / r6
            long r4 = r4 - r0
            r9.A00 = r4
            long r1 = r9.A02
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x009d
            r1 = r4
        L_0x009d:
            r9.A02 = r1
            long r4 = r4 - r1
            r9.A01 = r4
            long r1 = r9.A04
            r10 = 1
            r8 = 0
            r6 = 1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00bd
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bd
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A06
            boolean r0 = r0.compareAndSet(r8, r10)
            if (r0 == 0) goto L_0x00bd
            X.00S r0 = r9.A03
            r0.invoke()
        L_0x00bd:
            int r0 = r3.A02
            int r0 = r0 + 1
            r3.A02 = r0
            X.03e r0 = r3.A06
            if (r0 != 0) goto L_0x004e
            X.02l r0 = X.C006702x.A00
            X.041 r2 = X.C009403z.A02(r0)
            r1 = 0
            com.facebook.wearable.mediastream.api.abr.FrameRateAdaptiveVideoConfigHandler$onVideoFrame$1 r0 = new com.facebook.wearable.mediastream.api.abr.FrameRateAdaptiveVideoConfigHandler$onVideoFrame$1
            r0.<init>(r3, r1)
            X.0A6 r0 = X.C36391kE.A12(r0, r2)
            r3.A06 = r0
            return
        L_0x00da:
            boolean r0 = r14 instanceof X.C1694389e
            if (r0 != 0) goto L_0x004e
            boolean r0 = r14 instanceof X.AnonymousClass89n
            if (r0 != 0) goto L_0x004e
            boolean r0 = r14 instanceof X.C1694789i
            if (r0 == 0) goto L_0x012f
            X.9gt r5 = r13.A00
            X.89i r14 = (X.C1694789i) r14
            int r0 = r14.A00
            if (r0 == 0) goto L_0x012c
            if (r0 == r4) goto L_0x0129
            java.lang.Integer r10 = X.C023109s.A00
        L_0x00f2:
            java.lang.Integer r2 = r5.A0G
            if (r2 == r10) goto L_0x004e
            X.9gk r4 = X.AnonymousClass9AO.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Updating max device video settings from "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass95F.A00(r2)
            r1.append(r0)
            java.lang.String r0 = " to "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass95F.A00(r10)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.String r3 = "sup:MediaStreamController"
            r4.A01(r3, r0)
            r5.A0G = r10
            X.88A r8 = r5.A08
            X.9YO r7 = r5.A09
            if (r7 != 0) goto L_0x0321
            r1 = 0
            java.lang.String r0 = "No implementation of IBitrateLadderProvider found!"
            r4.A06(r3, r0, r1)
            return
        L_0x0129:
            java.lang.Integer r10 = X.C023109s.A01
            goto L_0x00f2
        L_0x012c:
            java.lang.Integer r10 = X.C023109s.A0C
            goto L_0x00f2
        L_0x012f:
            boolean r0 = r14 instanceof X.C1694689h
            if (r0 == 0) goto L_0x0141
            X.89h r14 = (X.C1694689h) r14
            java.nio.ByteBuffer r1 = r14.A00
            int r0 = r1.limit()
            byte[] r0 = new byte[r0]
            r1.get(r0)
            return
        L_0x0141:
            boolean r0 = r14 instanceof X.C1694889j
            if (r0 == 0) goto L_0x01de
            X.8Pg r0 = X.C172808Pg.DEFAULT_INSTANCE
            X.8NN r2 = r0.A0p()
            X.89j r14 = (X.C1694889j) r14
            java.nio.ByteBuffer r1 = r14.A00
            int r0 = r1.limit()
            byte[] r0 = new byte[r0]
            r1.get(r0)
            r2.A0P(r0)
            X.8Hz r1 = r2.A0R()
            X.8Pg r1 = (X.C172808Pg) r1
            X.9gt r0 = r13.A00
            X.9DD r7 = r0.A0F
            if (r7 == 0) goto L_0x004e
            int r3 = r1.status_
            int r2 = r1.type_
            long r0 = r1.level_
            X.88F r5 = new X.88F
            r5.<init>(r3, r0, r2)
            int r4 = r5.A01
            r0 = 2
            if (r4 == 0) goto L_0x004e
            r3 = 4
            r2 = 3
            r1 = 1
            if (r4 == r1) goto L_0x01cd
            if (r4 == r0) goto L_0x0196
            if (r4 != r2) goto L_0x004e
            int r0 = r5.A00
            if (r0 == r1) goto L_0x0193
            if (r0 == r2) goto L_0x0190
            if (r0 != r3) goto L_0x004e
            X.8Am r1 = X.C169738Am.A00
        L_0x018a:
            X.9mI r0 = r7.A00
            r0.A06(r1)
            return
        L_0x0190:
            X.8Af r1 = X.C169668Af.A00
            goto L_0x018a
        L_0x0193:
            X.8Ae r1 = X.C169658Ae.A00
            goto L_0x018a
        L_0x0196:
            long r3 = r5.A02
            r8 = 81
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x01aa
            r1 = 101(0x65, double:5.0E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01aa
            X.8An r1 = new X.8An
            r1.<init>(r3)
            goto L_0x018a
        L_0x01aa:
            r5 = 11
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x01ba
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ba
            X.8Ak r1 = new X.8Ak
            r1.<init>(r3)
            goto L_0x018a
        L_0x01ba:
            r1 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x01ca
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ca
            X.8Aa r1 = new X.8Aa
            r1.<init>(r3)
            goto L_0x018a
        L_0x01ca:
            X.8Aj r1 = X.C169708Aj.A00
            goto L_0x018a
        L_0x01cd:
            int r0 = r5.A00
            if (r0 == r1) goto L_0x01db
            if (r0 == r2) goto L_0x01d8
            if (r0 != r3) goto L_0x004e
            X.8Al r1 = X.C169728Al.A00
            goto L_0x018a
        L_0x01d8:
            X.8Ah r1 = X.C169688Ah.A00
            goto L_0x018a
        L_0x01db:
            X.8Ag r1 = X.C169678Ag.A00
            goto L_0x018a
        L_0x01de:
            boolean r0 = r14 instanceof X.C1694989k
            if (r0 == 0) goto L_0x0235
            X.89k r14 = (X.C1694989k) r14
            X.88D r0 = r14.A00
            int r2 = r0.A00
            if (r2 == r4) goto L_0x0227
            r0 = 2
            if (r2 == r0) goto L_0x0224
            r0 = 3
            if (r2 == r0) goto L_0x0224
        L_0x01f0:
            if (r2 != r4) goto L_0x004e
            X.9gt r6 = r13.A00
            java.lang.Long r0 = r6.A0I
            if (r0 == 0) goto L_0x0206
            long r0 = r0.longValue()
            long r3 = X.C36441kJ.A0A(r0)
            r1 = 20000(0x4e20, double:9.8813E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004e
        L_0x0206:
            X.9SO r5 = r6.A01()
            r4 = 3
            r3 = 1
            r0 = 0
            X.88F r2 = new X.88F
            r2.<init>(r4, r0, r3)
            X.84B r1 = r5.A00
            X.8AN r0 = new X.8AN
            r0.<init>(r2)
            r1.A04(r0)
            java.lang.Long r0 = X.C90484aE.A0g()
            r6.A0I = r0
            return
        L_0x0224:
            X.8Al r1 = X.C169728Al.A00
            goto L_0x0229
        L_0x0227:
            X.8Ah r1 = X.C169688Ah.A00
        L_0x0229:
            X.9gt r0 = r13.A00
            X.9DD r0 = r0.A0F
            if (r0 == 0) goto L_0x01f0
            X.9mI r0 = r0.A00
            r0.A06(r1)
            goto L_0x01f0
        L_0x0235:
            boolean r0 = r14 instanceof X.C1695089l
            if (r0 == 0) goto L_0x004e
            X.89l r14 = (X.C1695089l) r14
            java.nio.ByteBuffer r2 = r14.A00
            int r0 = r2.limit()
            byte[] r1 = new byte[r0]
            r2.get(r1)
            X.8SH r0 = X.AnonymousClass8SH.DEFAULT_INSTANCE
            X.8Hz r4 = X.C170918Hz.A08(r0, r1)
            X.8SH r4 = (X.AnonymousClass8SH) r4
            X.9gk r2 = X.AnonymousClass9AO.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "User event received: "
            r1.append(r0)
            X.90y r0 = r4.A0u()
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            r2.A01(r3, r0)
            X.90y r0 = r4.A0u()
            int r0 = r0.ordinal()
            r3 = 1
            if (r0 == r3) goto L_0x02d9
            r2 = 2
            if (r0 == r2) goto L_0x02d6
            int r0 = r4.userEventAction_
            switch(r0) {
                case 0: goto L_0x02d3;
                case 1: goto L_0x02d0;
                case 2: goto L_0x02cd;
                case 3: goto L_0x02ca;
                case 4: goto L_0x02c7;
                case 5: goto L_0x02c4;
                case 6: goto L_0x02c1;
                default: goto L_0x0277;
            }
        L_0x0277:
            X.90x r0 = X.C1888390x.UNRECOGNIZED
        L_0x0279:
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x02be
            if (r1 == r2) goto L_0x02bb
            r0 = 3
            if (r1 == r0) goto L_0x02b8
            r0 = 4
            if (r1 == r0) goto L_0x02b5
            r0 = 5
            if (r1 != r0) goto L_0x004e
            X.8A3 r2 = X.AnonymousClass8A3.A00
        L_0x028c:
            boolean r0 = r2 instanceof X.AnonymousClass8A1
            if (r0 == 0) goto L_0x02dc
            X.9gt r2 = r13.A00
            X.9SO r0 = r2.A01()
            X.84B r1 = r0.A00
            X.8AT r0 = X.AnonymousClass8AT.A00
            r1.A04(r0)
            java.util.Map r0 = r2.A0J
            java.util.Iterator r2 = X.AnonymousClass000.A0y(r0)
        L_0x02a3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r1 = X.C36351kA.A0u(r2)
            X.9YG r1 = (X.AnonymousClass9YG) r1
            X.8A1 r0 = X.AnonymousClass8A1.A00
            r1.A05(r0)
            goto L_0x02a3
        L_0x02b5:
            X.8A2 r2 = X.AnonymousClass8A2.A00
            goto L_0x028c
        L_0x02b8:
            X.8A4 r2 = X.AnonymousClass8A4.A00
            goto L_0x028c
        L_0x02bb:
            X.8A1 r2 = X.AnonymousClass8A1.A00
            goto L_0x028c
        L_0x02be:
            X.89w r2 = X.C1695789w.A00
            goto L_0x028c
        L_0x02c1:
            X.90x r0 = X.C1888390x.USER_EVENT_ACTION_REQUEST_MODEL_RESPONSE
            goto L_0x0279
        L_0x02c4:
            X.90x r0 = X.C1888390x.USER_EVENT_ACTION_REQUEST_TOGGLE_VIDEO_CAPTURE
            goto L_0x0279
        L_0x02c7:
            X.90x r0 = X.C1888390x.USER_EVENT_ACTION_REQUEST_PHOTO_CAPTURE
            goto L_0x0279
        L_0x02ca:
            X.90x r0 = X.C1888390x.USER_EVENT_ACTION_TOGGLE_CAMERA_BACKGROUND
            goto L_0x0279
        L_0x02cd:
            X.90x r0 = X.C1888390x.USER_EVENT_ACTION_SG_MEDIA_STREAM_PAUSED
            goto L_0x0279
        L_0x02d0:
            X.90x r0 = X.C1888390x.USER_EVENT_ACTION_REQUEST_SG_CAMERA_ON
            goto L_0x0279
        L_0x02d3:
            X.90x r0 = X.C1888390x.USER_EVENT_ACTION_NONE
            goto L_0x0279
        L_0x02d6:
            X.89z r2 = X.C1696089z.A00
            goto L_0x028c
        L_0x02d9:
            X.8A0 r2 = X.AnonymousClass8A0.A00
            goto L_0x028c
        L_0x02dc:
            boolean r0 = r2 instanceof X.C1695789w
            if (r0 == 0) goto L_0x0309
            X.9gt r2 = r13.A00
            boolean r0 = r2.A0R
            if (r0 != 0) goto L_0x02fe
            java.util.Map r0 = r2.A0J
            java.util.Iterator r2 = X.AnonymousClass000.A0y(r0)
        L_0x02ec:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r1 = X.C36351kA.A0u(r2)
            X.9YG r1 = (X.AnonymousClass9YG) r1
            X.89w r0 = X.C1695789w.A00
            r1.A05(r0)
            goto L_0x02ec
        L_0x02fe:
            int r1 = r2.A01
            r0 = 4
            if (r1 != r0) goto L_0x004e
            java.lang.Integer r0 = X.C023109s.A0A
            r2.A0A(r0)
            return
        L_0x0309:
            X.9gt r0 = r13.A00
            java.util.Map r0 = r0.A0J
            java.util.Iterator r1 = X.AnonymousClass000.A0y(r0)
        L_0x0311:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = X.C36351kA.A0u(r1)
            X.9YG r0 = (X.AnonymousClass9YG) r0
            r0.A05(r2)
            goto L_0x0311
        L_0x0321:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Checking ladder for rung with max quality: "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass95F.A00(r10)
            r1.append(r0)
            java.lang.String r0 = ", Format: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r8, r0, r1)
            java.lang.String r2 = "sup:BaseBitrateLadderProvider"
            r4.A03(r2, r0)
            X.00T r9 = r7.A00
            java.util.List r0 = X.C90524aI.A0q(r9)
            java.util.Iterator r12 = r0.iterator()
        L_0x0346:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x03a0
            java.lang.Object r6 = r12.next()
            r11 = r6
            X.88B r11 = (X.AnonymousClass88B) r11
            java.lang.Integer r0 = r11.A03
            int r1 = r0.intValue()
            int r0 = r10.intValue()
            if (r1 < r0) goto L_0x0346
            X.0mZ r0 = r11.A04
            int r1 = r0.A00
            int r0 = r8.A00
            if (r1 > r0) goto L_0x0346
        L_0x0367:
            X.88B r6 = (X.AnonymousClass88B) r6
            if (r6 != 0) goto L_0x0375
            java.util.List r0 = X.C90524aI.A0q(r9)
            java.lang.Object r6 = X.C007103b.A0N(r0)
            X.88B r6 = (X.AnonymousClass88B) r6
        L_0x0375:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Using Rung: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r6, r0, r1)
            r4.A03(r2, r0)
            int r2 = r8.A00
            java.lang.Integer r1 = r7.A04()
            X.0mZ r0 = r6.A04
            int r0 = r0.A01
            if (r0 <= r2) goto L_0x038f
            r0 = r2
        L_0x038f:
            X.88A r2 = X.AnonymousClass95E.A00(r6, r1, r0)
            boolean r0 = r5.A0K
            if (r0 != 0) goto L_0x03a2
            r5.A08(r2)
            java.lang.String r0 = "SN not connected - Aborting ABR Update."
            r4.A01(r3, r0)
            return
        L_0x03a0:
            r6 = 0
            goto L_0x0367
        L_0x03a2:
            X.88A r0 = r5.A08
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x03b0
            java.lang.String r0 = "Ladder format equal to current video format.  No update required."
            r4.A03(r3, r0)
            return
        L_0x03b0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Configuring Video To: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)
            r4.A03(r3, r0)
            r5.A08(r2)
            X.9SO r0 = r5.A01()
            X.84B r1 = r0.A00
            X.8AJ r0 = new X.8AJ
            r0.<init>(r2)
            r1.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9PO.A00(X.95B):void");
    }

    public AnonymousClass9PO(C200219gt r1) {
        this.A00 = r1;
    }
}
