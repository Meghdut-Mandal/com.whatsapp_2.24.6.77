package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: X.9mI  reason: invalid class name and case insensitive filesystem */
public final class C202609mI {
    public C169768Ap A00;
    public final AnonymousClass9DD A01 = new AnonymousClass9DD(this);
    public final AnonymousClass00S A02;
    public final LinkedHashSet A03 = C36441kJ.A17();
    public final Set A04 = C36411kG.A15(C36401kF.A0h());
    public final AnonymousClass00S A05;
    public final AnonymousClass00S A06;
    public final C006302t A07;

    private final void A01(int i, int i2) {
        Iterator it = this.A03.iterator();
        AnonymousClass00C.A08(it);
        while (it.hasNext()) {
            Object next = it.next();
            AnonymousClass00C.A08(next);
            AnonymousClass9QU r1 = (AnonymousClass9QU) next;
            if (r1.A00 == i2 && A00(r1.A01) > i) {
                it.remove();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r1.contains(X.C169628Ab.A00) == false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C202609mI r6, X.AnonymousClass9QU r7, X.AnonymousClass9QU r8) {
        /*
            java.lang.Integer r4 = r7.A01
            int r0 = r4.intValue()
            r2 = 0
            r5 = 3
            if (r0 == r2) goto L_0x007c
            r1 = 1
            if (r0 == r1) goto L_0x0045
            java.util.LinkedHashSet r2 = r6.A03
            boolean r0 = r2.contains(r7)
            if (r0 != 0) goto L_0x002b
            X.00S r0 = r6.A05
            java.lang.Object r0 = r0.invoke()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 != 0) goto L_0x002c
            java.util.Set r1 = r6.A04
            int r0 = r7.A00
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            if (r0 == 0) goto L_0x002c
        L_0x002b:
            return
        L_0x002c:
            boolean r0 = r7 instanceof X.C169638Ac
            if (r0 == 0) goto L_0x0037
            java.lang.Integer r1 = r8.A01
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 != r0) goto L_0x0037
            return
        L_0x0037:
            X.02t r0 = r6.A07
            r0.invoke(r7)
            r2.add(r7)
            X.00S r0 = r6.A06
            r0.invoke()
            return
        L_0x0045:
            java.lang.Integer r0 = r8.A01
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x0071
            if (r0 == r1) goto L_0x0061
            int r1 = A00(r4)
            int r0 = r7.A00
            r6.A01(r1, r0)
            r6.A03(r7, r8)
        L_0x005b:
            java.util.LinkedHashSet r0 = r6.A03
            r0.add(r7)
            return
        L_0x0061:
            java.util.LinkedHashSet r1 = r6.A03
            boolean r0 = r1.contains(r7)
            if (r0 != 0) goto L_0x005b
            X.8Ab r0 = X.C169628Ab.A00
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x005b
        L_0x0071:
            X.02t r0 = r6.A07
            r0.invoke(r7)
            X.00S r0 = r6.A06
            r0.invoke()
            goto L_0x005b
        L_0x007c:
            java.lang.Integer r1 = r8.A01
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 != r0) goto L_0x008d
            X.02t r1 = r6.A07
            X.8Ap r0 = r6.A00
            if (r0 == 0) goto L_0x0089
            r7 = r0
        L_0x0089:
            r1.invoke(r7)
            return
        L_0x008d:
            int r3 = r7.A00
            r0 = 5
            if (r3 != r0) goto L_0x00b1
            java.util.Set r0 = r6.A04
            java.util.Iterator r2 = r0.iterator()
        L_0x0098:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00aa
            int r1 = X.C36341k9.A0A(r2)
            int r0 = A00(r4)
            r6.A01(r0, r1)
            goto L_0x0098
        L_0x00aa:
            int r0 = A00(r4)
            r6.A01(r0, r5)
        L_0x00b1:
            int r0 = A00(r4)
            r6.A01(r0, r3)
            r6.A03(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202609mI.A02(X.9mI, X.9QU, X.9QU):void");
    }

    private final void A03(AnonymousClass9QU r8, AnonymousClass9QU r9) {
        LinkedHashSet linkedHashSet = this.A03;
        if (!(linkedHashSet instanceof Collection) || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (A00(((AnonymousClass9QU) it.next()).A01) > A00(r8.A01)) {
                    Object obj = null;
                    if (r9.A00 == r8.A00) {
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (it2.hasNext()) {
                                int A002 = A00(((AnonymousClass9QU) next).A01);
                                do {
                                    Object next2 = it2.next();
                                    int A003 = A00(((AnonymousClass9QU) next2).A01);
                                    if (A002 < A003) {
                                        next = next2;
                                        A002 = A003;
                                    }
                                } while (it2.hasNext());
                            }
                            int A004 = A00(((AnonymousClass9QU) next).A01);
                            Iterator it3 = linkedHashSet.iterator();
                            boolean z = false;
                            while (it3.hasNext()) {
                                Object next3 = it3.next();
                                if (A00(((AnonymousClass9QU) next3).A01) == A004) {
                                    obj = next3;
                                    z = true;
                                }
                            }
                            if (z) {
                                this.A07.invoke(obj);
                            } else {
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        } else {
                            throw C165617ti.A0e();
                        }
                    } else {
                        return;
                    }
                }
            }
            this.A06.invoke();
        }
        AnonymousClass9QU r2 = this.A00;
        if (r2 == null || r8.A01 != C023109s.A00) {
            r2 = r8;
        }
        this.A07.invoke(r2);
        if (r8.A00 == 5) {
            return;
        }
        this.A06.invoke();
    }

    public final void A04() {
        AnonymousClass00S r2 = this.A02;
        AnonymousClass9QU r0 = (AnonymousClass9QU) r2.invoke();
        if (r0 == null || r0.A00 != 3) {
            AnonymousClass9QU r02 = (AnonymousClass9QU) r2.invoke();
            if (r02 == null || r02.A00 != 8) {
                AnonymousClass9QU r03 = (AnonymousClass9QU) r2.invoke();
                if (r03 == null || r03.A00 != 9) {
                    AnonymousClass9QU r04 = (AnonymousClass9QU) r2.invoke();
                    if (r04 == null || r04.A00 != 10) {
                        this.A03.clear();
                    }
                }
            }
        }
    }

    public final void A06(AnonymousClass9QU r4) {
        AnonymousClass9QU r0;
        int i = r4.A00;
        if (i == 1 && (r4 instanceof C169768Ap)) {
            this.A00 = (C169768Ap) r4;
        }
        if ((!AnonymousClass000.A1X(this.A05.invoke()) || !this.A03.contains(C169648Ad.A00) || i != 3 || r4.A01 == C023109s.A0C) && (r0 = (AnonymousClass9QU) this.A02.invoke()) != null) {
            A02(this, r4, r0);
        }
    }

    public C202609mI(AnonymousClass00S r2, AnonymousClass00S r3, AnonymousClass00S r4, C006302t r5) {
        this.A02 = r2;
        this.A07 = r5;
        this.A05 = r3;
        this.A06 = r4;
    }

    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return 2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        r0 = X.C169658Ae.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bb, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bd, code lost:
        r0 = X.C169708Aj.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d8, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00da, code lost:
        r0 = X.C169638Ac.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00dc, code lost:
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00df, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C194269Ow r3) {
        /*
            r2 = this;
            java.lang.String r1 = r3.A01()
            int r0 = r1.hashCode()
            switch(r0) {
                case -2142600848: goto L_0x000c;
                case -1907274391: goto L_0x0010;
                case -1827018166: goto L_0x0014;
                case -1748158431: goto L_0x0018;
                case -1659914561: goto L_0x001c;
                case -1639263991: goto L_0x0020;
                case -1622789342: goto L_0x0024;
                case -1447972833: goto L_0x0028;
                case -1393327239: goto L_0x002c;
                case -1371358665: goto L_0x002f;
                case -1258081213: goto L_0x0033;
                case -1085472894: goto L_0x0037;
                case -1076491209: goto L_0x003b;
                case -956481827: goto L_0x003f;
                case -679949903: goto L_0x0043;
                case -646453283: goto L_0x0047;
                case -618496294: goto L_0x0053;
                case -485608986: goto L_0x0056;
                case -473284920: goto L_0x0059;
                case -259501732: goto L_0x005c;
                case -241236408: goto L_0x005f;
                case -195374854: goto L_0x006a;
                case -106498639: goto L_0x006d;
                case 35580499: goto L_0x0070;
                case 39350972: goto L_0x0073;
                case 64254586: goto L_0x0076;
                case 167229966: goto L_0x0079;
                case 223933925: goto L_0x007c;
                case 247259090: goto L_0x007f;
                case 345573223: goto L_0x0082;
                case 345971800: goto L_0x0085;
                case 426664360: goto L_0x0088;
                case 433141802: goto L_0x008b;
                case 496649534: goto L_0x008e;
                case 554408463: goto L_0x0091;
                case 720580000: goto L_0x0094;
                case 743369482: goto L_0x0097;
                case 764460121: goto L_0x009a;
                case 879138356: goto L_0x009d;
                case 933142426: goto L_0x00a0;
                case 937195223: goto L_0x00a3;
                case 1051436370: goto L_0x00a6;
                case 1072999339: goto L_0x00a9;
                case 1112689461: goto L_0x00ac;
                case 1237785799: goto L_0x00af;
                case 1430407976: goto L_0x00b2;
                case 1483329954: goto L_0x00b5;
                case 1483851953: goto L_0x00c0;
                case 1684979281: goto L_0x00c3;
                case 1808400106: goto L_0x00c6;
                case 1935425562: goto L_0x00c9;
                case 2104595036: goto L_0x00cc;
                case 2109336670: goto L_0x00cf;
                case 2124047836: goto L_0x00d2;
                default: goto L_0x000b;
            }
        L_0x000b:
            return
        L_0x000c:
            java.lang.String r0 = "SOCKET_CONNECTION_CONNECT_TO_SOCKET_FAIL"
            goto L_0x00d4
        L_0x0010:
            java.lang.String r0 = "STREAM_STOPPED_REASON_SYSTEM_PREEMPT"
            goto L_0x00d4
        L_0x0014:
            java.lang.String r0 = "BUG_MUST_FIX"
            goto L_0x00d4
        L_0x0018:
            java.lang.String r0 = "SOCKET_CONNECTION_CLOSED"
            goto L_0x00d4
        L_0x001c:
            java.lang.String r0 = "DEVICE_ERROR"
            goto L_0x00d4
        L_0x0020:
            java.lang.String r0 = "MEDIA_STREAM_SERVICE_MSG_SEND_FAIL"
            goto L_0x00d4
        L_0x0024:
            java.lang.String r0 = "SNAM_MAXED_OUT_CONNECTION_ATTEMPTS"
            goto L_0x00d4
        L_0x0028:
            java.lang.String r0 = "SNAPP_STOP_APP_FAILED"
            goto L_0x00d4
        L_0x002c:
            java.lang.String r0 = "STREAM_STOPPED_REASON_THERMAL_THRESHOLD"
            goto L_0x0061
        L_0x002f:
            java.lang.String r0 = "SNAM_SHUTDOWN_ERROR"
            goto L_0x00d4
        L_0x0033:
            java.lang.String r0 = "SNAPP_NOT_ENOUGH_BATTERY"
            goto L_0x00b7
        L_0x0037:
            java.lang.String r0 = "SNAPP_PAYLOAD_CORRUPTED"
            goto L_0x00d4
        L_0x003b:
            java.lang.String r0 = "BACKGROUNDED_DISCONNECT_ERROR"
            goto L_0x00d4
        L_0x003f:
            java.lang.String r0 = "SOCKET_CONNECTION_ERROR_ESTABLISHING_DEVICE_CONNECTION"
            goto L_0x00d4
        L_0x0043:
            java.lang.String r0 = "INVALID_STATE_MESSAGE"
            goto L_0x00d4
        L_0x0047:
            java.lang.String r0 = "LIVE_STREAM_START_DOFF_ERROR"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.8Ad r0 = X.C169648Ad.A00
            goto L_0x00dc
        L_0x0053:
            java.lang.String r0 = "SNAPP_UNKNOWN_ERROR"
            goto L_0x00d4
        L_0x0056:
            java.lang.String r0 = "INTERNAL_ERROR"
            goto L_0x00d4
        L_0x0059:
            java.lang.String r0 = "SNAPP_UNRECOGNIZED"
            goto L_0x00d4
        L_0x005c:
            java.lang.String r0 = "STREAM_STOPPED_REASON_MOBILE_STREAM_ERROR"
            goto L_0x00d4
        L_0x005f:
            java.lang.String r0 = "SNAPP_THERMAL_THROTTLING"
        L_0x0061:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.8Ae r0 = X.C169658Ae.A00
            goto L_0x00dc
        L_0x006a:
            java.lang.String r0 = "LIVE_STREAM_START_UNSUPPORTED_PARAM"
            goto L_0x00d4
        L_0x006d:
            java.lang.String r0 = "SNAPP_START_APP_FAILED"
            goto L_0x00d4
        L_0x0070:
            java.lang.String r0 = "STREAM_STOPPED_REASON_PEAK_POWER_INTERRUPT"
            goto L_0x00d4
        L_0x0073:
            java.lang.String r0 = "LIVE_STREAM_START_INVALID_PARAM"
            goto L_0x00d4
        L_0x0076:
            java.lang.String r0 = "STREAM_STOPPED_REASON_TAMPER_DETECTED"
            goto L_0x00d4
        L_0x0079:
            java.lang.String r0 = "SNAPP_NOT_ENOUGH_PRIORITY"
            goto L_0x00d4
        L_0x007c:
            java.lang.String r0 = "CONNECTION_TIMED_OUT"
            goto L_0x00d4
        L_0x007f:
            java.lang.String r0 = "SNAPP_UNHANDLED_MESSAGE"
            goto L_0x00d4
        L_0x0082:
            java.lang.String r0 = "SNAM_CONNECTION_FAIL"
            goto L_0x00d4
        L_0x0085:
            java.lang.String r0 = "STREAM_STOPPED_REASON_BATTERY_LOW"
            goto L_0x00b7
        L_0x0088:
            java.lang.String r0 = "SNAPP_CHARGING_NOT_CONNECTED"
            goto L_0x00d4
        L_0x008b:
            java.lang.String r0 = "UNKNOWN"
            goto L_0x00d4
        L_0x008e:
            java.lang.String r0 = "SOCKET_CONNECTION_UNKNOWN_ERROR"
            goto L_0x00d4
        L_0x0091:
            java.lang.String r0 = "LIVE_STREAM_START_INTERNAL_ERROR"
            goto L_0x00d4
        L_0x0094:
            java.lang.String r0 = "STREAM_STOPPED_REASON_UNKNOWN"
            goto L_0x00d4
        L_0x0097:
            java.lang.String r0 = "SOCKET_CONNECTION_DEVICE_IO_EXCEPTION"
            goto L_0x00d4
        L_0x009a:
            java.lang.String r0 = "SNAPP_UNKNOWN_MESSAGE"
            goto L_0x00d4
        L_0x009d:
            java.lang.String r0 = "SOCKET_CONNECTION_BT_DISABLED"
            goto L_0x00d4
        L_0x00a0:
            java.lang.String r0 = "SOCKET_CONNECTION_DEVICE_LINKAGE_ERROR"
            goto L_0x00d4
        L_0x00a3:
            java.lang.String r0 = "STREAM_STOPPED_REASON_AUDIO_FAILURE"
            goto L_0x00d4
        L_0x00a6:
            java.lang.String r0 = "MEDIA_STREAM_SERVICE_CHANNEL_NOT_CREATED"
            goto L_0x00d4
        L_0x00a9:
            java.lang.String r0 = "STREAMING_ERROR"
            goto L_0x00d4
        L_0x00ac:
            java.lang.String r0 = "SOCKET_CONNECTION_DEVICE_PROTOCOL_ERROR"
            goto L_0x00d4
        L_0x00af:
            java.lang.String r0 = "BT_PERMISSIONS_NOT_GRANTED"
            goto L_0x00d4
        L_0x00b2:
            java.lang.String r0 = "LINKED_DEVICE_START_ERROR"
            goto L_0x00d4
        L_0x00b5:
            java.lang.String r0 = "SNAPP_DENIED_BY_PEAK_POWER"
        L_0x00b7:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.8Aj r0 = X.C169708Aj.A00
            goto L_0x00dc
        L_0x00c0:
            java.lang.String r0 = "SNAPP_NOT_ENOUGH_STORAGE"
            goto L_0x00d4
        L_0x00c3:
            java.lang.String r0 = "MEDIA_STREAM_SERVICE_CONNECTION_FAIL"
            goto L_0x00d4
        L_0x00c6:
            java.lang.String r0 = "MEDIA_STREAM_SERVICE_DISCONNECT"
            goto L_0x00d4
        L_0x00c9:
            java.lang.String r0 = "STREAM_STOPPED_REASON_CAMERA_FAILURE"
            goto L_0x00d4
        L_0x00cc:
            java.lang.String r0 = "SNAPP_APP_NOT_RUNNING"
            goto L_0x00d4
        L_0x00cf:
            java.lang.String r0 = "SNAPP_UNSUPPORTED_APP"
            goto L_0x00d4
        L_0x00d2:
            java.lang.String r0 = "STREAM_STOPPED_REASON_SYSTEM_SHUTDOWN"
        L_0x00d4:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.8Ac r0 = X.C169638Ac.A00
        L_0x00dc:
            r2.A06(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202609mI.A05(X.9Ow):void");
    }
}
