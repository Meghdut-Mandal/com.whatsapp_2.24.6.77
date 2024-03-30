package X;

import com.whatsapp.util.Log;

/* renamed from: X.3pW  reason: invalid class name and case insensitive filesystem */
public class C76833pW implements C236119d {
    public C608439o A00;
    public C52772q9 A01;
    public AnonymousClass8RP A02;
    public boolean A03 = true;
    public boolean A04;
    public final AnonymousClass3CL A05;
    public final C19970wo A06;
    public final AnonymousClass19A A07;
    public final C19700wN A08;
    public final AnonymousClass17Y A09;

    public void BVN(String str) {
        Log.i("devicePairRequest/onDeliveryFailure");
        this.A09.Bp3(new C81093wS((Object) this, 37));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009c  */
    public void BiM(X.C203399nx r22, java.lang.String r23) {
        /*
            r21 = this;
            java.lang.String r0 = "devicePairRequest/onSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = 0
            r2 = r21
            r5 = r22
            if (r22 == 0) goto L_0x00ae
            java.lang.String r0 = "type"
            java.lang.String r1 = r5.A0i(r0, r7)
            java.lang.String r0 = "result"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = "device"
            X.9nx r3 = r5.A0c(r0)
            if (r3 == 0) goto L_0x00ae
            java.lang.Class<com.whatsapp.jid.DeviceJid> r1 = com.whatsapp.jid.DeviceJid.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r8 = r3.A0X(r1, r0)
            com.whatsapp.jid.DeviceJid r8 = (com.whatsapp.jid.DeviceJid) r8
            if (r8 == 0) goto L_0x00ae
            java.lang.String r0 = "companion-props"
            X.9nx r0 = r5.A0c(r0)
            if (r0 == 0) goto L_0x0048
            byte[] r1 = r0.A01     // Catch:{ 186 -> 0x0043 }
            X.8R8 r0 = X.AnonymousClass8R8.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0043 }
            X.8Hz r1 = X.C170918Hz.A08(r0, r1)     // Catch:{ 186 -> 0x0043 }
            X.8R8 r1 = (X.AnonymousClass8R8) r1     // Catch:{ 186 -> 0x0043 }
            if (r1 == 0) goto L_0x0049
            goto L_0x004c
        L_0x0043:
            java.lang.String r0 = "DevicePairRequestProtocolHelper/parseDeviceInfo/failed to parse companion props"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0048:
            r1 = r7
        L_0x0049:
            X.2qA r9 = X.C52782qA.UNKNOWN
            goto L_0x0056
        L_0x004c:
            int r0 = r1.platformType_
            X.2qA r9 = X.C52782qA.A00(r0)
            if (r9 != 0) goto L_0x0056
            X.2qA r9 = X.C52782qA.UNKNOWN
        L_0x0056:
            X.0wo r0 = r2.A06
            long r14 = X.C19970wo.A00(r0)
            if (r1 == 0) goto L_0x009c
            java.lang.String r10 = r1.os_
        L_0x0060:
            r18 = 0
            X.8RP r0 = r2.A02
            if (r0 == 0) goto L_0x009a
            int r13 = r0.currentIndex_
        L_0x0068:
            if (r1 == 0) goto L_0x0070
            boolean r0 = r1.requireFullSync_
            r20 = 1
            if (r0 != 0) goto L_0x0072
        L_0x0070:
            r20 = 0
        L_0x0072:
            r11 = 0
            if (r1 == 0) goto L_0x0086
            int r0 = r1.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0086
            X.8Rl r0 = r1.historySyncConfig_
            if (r0 != 0) goto L_0x0081
            X.8Rl r0 = X.C173378Rl.DEFAULT_INSTANCE
        L_0x0081:
            X.9eT r7 = new X.9eT
            r7.<init>(r0)
        L_0x0086:
            X.3SB r6 = new X.3SB
            r12 = r11
            r16 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r20)
            X.3CL r0 = r2.A05
            com.whatsapp.jid.DeviceJid r5 = r6.A07
            X.3Sv r0 = r0.A00
            X.19g r4 = r0.A0C
            java.lang.Object r3 = r4.A0N
            monitor-enter(r3)
            goto L_0x009e
        L_0x009a:
            r13 = 0
            goto L_0x0068
        L_0x009c:
            r10 = r7
            goto L_0x0060
        L_0x009e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "companion-device-manager/onDeviceReceived: "
            X.C36321k7.A1K(r5, r0, r1)     // Catch:{ all -> 0x00ab }
            r4.A01 = r5     // Catch:{ all -> 0x00ab }
            monitor-exit(r3)     // Catch:{ all -> 0x00ab }
            goto L_0x00f1
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ab }
            throw r0
        L_0x00ae:
            r6 = r7
            X.39o r0 = r2.A00
            if (r0 == 0) goto L_0x00f1
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x00f1
            r0 = -1
            if (r22 == 0) goto L_0x00f1
            java.lang.String r3 = "type"
            java.lang.String r4 = r5.A0i(r3, r7)
            java.lang.String r3 = "result"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00f1
            java.lang.String r3 = "retry-ts"
            X.9nx r4 = r5.A0c(r3)
            if (r4 == 0) goto L_0x00f1
            java.lang.String r3 = "ts"
            java.lang.String r4 = r4.A0i(r3, r7)
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L_0x00f1
            long r3 = X.AnonymousClass6R8.A01(r4, r0)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x00f1
            X.17Y r5 = r2.A09
            r0 = 7
            X.3vB r1 = new X.3vB
            r1.<init>(r2, r3, r0)
        L_0x00ed:
            r5.Bp3(r1)
            return
        L_0x00f1:
            X.17Y r5 = r2.A09
            r0 = 31
            X.3v7 r1 = new X.3v7
            r1.<init>(r2, r6, r0)
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76833pW.BiM(X.9nx, java.lang.String):void");
    }

    public C76833pW(C19700wN r2, AnonymousClass17Y r3, AnonymousClass3CL r4, C19970wo r5, AnonymousClass19A r6) {
        this.A06 = r5;
        this.A09 = r3;
        this.A08 = r2;
        this.A07 = r6;
        this.A05 = r4;
    }

    public void BWw(C203399nx r5, String str) {
        int A002 = AnonymousClass3ME.A00(r5);
        C36321k7.A1T("devicePairRequest/onError :", AnonymousClass000.A0u(), A002);
        this.A09.Bp3(new C81283wl((Object) this, A002, 21));
    }
}
