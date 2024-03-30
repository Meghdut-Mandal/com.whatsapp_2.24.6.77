package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: X.6Xw  reason: invalid class name and case insensitive filesystem */
public class C133326Xw {
    public final C132556Ug A00;
    public final AnonymousClass6W8 A01;
    public final C139506jy A02;
    public final AnonymousClass6PQ A03;
    public final Object A04 = C36441kJ.A11();
    public final Executor A05;
    public final Executor A06;
    public final C125295ze A07;
    public final AnonymousClass5ZV A08;
    public final List A09 = AnonymousClass001.A0I();
    public final Executor A0A;

    public static void A08(C133326Xw r7, C135056c3 r8, Integer num, List list, boolean z) {
        A07(r7, r8, (AnonymousClass5VK) null, num, list, -1, z);
    }

    public static C23931Ak A01(C133326Xw r6, AnonymousClass679 r7) {
        C23931Ak copyOf;
        synchronized (r6.A04) {
            AnonymousClass6W8 r2 = r6.A01;
            Collection A0o = C90524aI.A0o(r7, r2.A05);
            if (A0o == null) {
                if (!r2.A00) {
                    r2.A00 = true;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("InternalLoadRequest not present in mInternalToExternalMap: ");
                    r2.A01.A00("InternalStateManager", AnonymousClass000.A0q(r7.A03.A01.A0A, A0u), (Throwable) null, false);
                }
                A0o = AnonymousClass001.A0I();
            }
            copyOf = C23931Ak.copyOf(A0o);
        }
        return copyOf;
    }

    public static String A02(C135056c3 r6) {
        Object[] objArr;
        String str;
        AnonymousClass6VA r62 = r6.A01;
        ARAssetType aRAssetType = r62.A02;
        switch (aRAssetType.ordinal()) {
            case 0:
                return "AREffect";
            case 1:
                VersionedCapability A032 = r62.A03();
                Objects.requireNonNull(A032);
                switch (A032.ordinal()) {
                    case 0:
                        return "FaceTrackerModel";
                    case 1:
                        return "HandTrackerModel";
                    case 2:
                        return "SegmentationModel";
                    case 3:
                        return "TargetRecognitionModel";
                    case 4:
                        return "HairSegmentationModel";
                    case 5:
                        return "XRayModel";
                    case 8:
                        return "MSuggestionsCoreModel";
                    case 15:
                        return "BodyTrackingModel";
                    default:
                        objArr = new Object[]{r62.A03()};
                        str = "Invalid capability: ";
                        break;
                }
            case 2:
                AnonymousClass5TN r1 = r62.A05;
                if (r1 != AnonymousClass5TN.Block && r1 != AnonymousClass5TN.ShareableBlock) {
                    objArr = new Object[]{r1};
                    str = "Invalid async asset type: ";
                    break;
                } else {
                    return "Block";
                }
            case 3:
                return "RemoteAsset";
            case 4:
                return "ScriptingPackage";
            case 5:
                return "SparkVisionNativeMLModel";
            default:
                objArr = new Object[]{aRAssetType.name()};
                str = "Invalid ARAssetType: %s";
                break;
        }
        AnonymousClass6YR.A0H("ARDeliveryLoggerUtil", str, objArr);
        return "UnknownAssetType";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0120, code lost:
        if (r4.A01 > 0) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r5.A01 > 0) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A03(X.C133326Xw r17, java.util.List r18, java.util.List r19, boolean r20) {
        /*
            r7 = r17
            r1 = r18
            r0 = r19
            r10 = r20
            X.00I r1 = A00(r7, r1, r0, r10)
            java.lang.Object r0 = r1.A00
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r8 = r1.A01
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.lang.Object r6 = r7.A04
            monitor-enter(r6)
            java.util.Iterator r20 = X.AnonymousClass000.A0y(r0)     // Catch:{ all -> 0x01c0 }
        L_0x001f:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x0109
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r20)     // Catch:{ all -> 0x01c0 }
            java.lang.Object r5 = r2.getKey()     // Catch:{ all -> 0x01c0 }
            X.679 r5 = (X.AnonymousClass679) r5     // Catch:{ all -> 0x01c0 }
            int r0 = r5.A00     // Catch:{ all -> 0x01c0 }
            if (r0 > 0) goto L_0x0038
            int r1 = r5.A01     // Catch:{ all -> 0x01c0 }
            r0 = 0
            if (r1 <= 0) goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            if (r0 == 0) goto L_0x001f
            java.lang.Object r4 = r2.getValue()     // Catch:{ all -> 0x01c0 }
            X.5oE r4 = (X.AnonymousClass5oE) r4     // Catch:{ all -> 0x01c0 }
            X.1Ak r2 = A01(r7, r5)     // Catch:{ all -> 0x01c0 }
            if (r4 != 0) goto L_0x006c
            if (r10 == 0) goto L_0x004d
            r8.add(r5)     // Catch:{ all -> 0x01c0 }
            goto L_0x001f
        L_0x004d:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x01c0 }
        L_0x0051:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x01c0 }
            X.682 r0 = (X.AnonymousClass682) r0     // Catch:{ all -> 0x01c0 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x01c0 }
            if (r0 != 0) goto L_0x0051
            r0 = 1
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            if (r0 == 0) goto L_0x006c
            r9.add(r5)     // Catch:{ all -> 0x01c0 }
            goto L_0x001f
        L_0x006c:
            java.util.Iterator r19 = r2.iterator()     // Catch:{ all -> 0x01c0 }
        L_0x0070:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r12 = r19.next()     // Catch:{ all -> 0x01c0 }
            X.682 r12 = (X.AnonymousClass682) r12     // Catch:{ all -> 0x01c0 }
            X.6c3 r0 = r5.A03     // Catch:{ all -> 0x01c0 }
            r2 = 1
            X.5zX r11 = r12.A05     // Catch:{ all -> 0x01c0 }
            if (r11 == 0) goto L_0x0070
            X.6VA r0 = r0.A01     // Catch:{ all -> 0x01c0 }
            java.lang.String r13 = r0.A0A     // Catch:{ all -> 0x01c0 }
            double r0 = (double) r2     // Catch:{ all -> 0x01c0 }
            double r0 = r0 / r0
            monitor-enter(r12)     // Catch:{ all -> 0x01c0 }
            java.util.Map r3 = r12.A08     // Catch:{ all -> 0x0105 }
            boolean r2 = r3.containsKey(r13)     // Catch:{ all -> 0x0105 }
            if (r2 == 0) goto L_0x00ac
            java.lang.Object r2 = r3.get(r13)     // Catch:{ all -> 0x0105 }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ all -> 0x0105 }
            double r14 = r2.doubleValue()     // Catch:{ all -> 0x0105 }
        L_0x009d:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0105 }
            r3.put(r13, r2)     // Catch:{ all -> 0x0105 }
            double r2 = r12.A00     // Catch:{ all -> 0x0105 }
            double r2 = r2 + r0
            double r2 = r2 - r14
            r12.A00 = r2     // Catch:{ all -> 0x0105 }
            monitor-exit(r12)     // Catch:{ all -> 0x0105 }
            goto L_0x00af
        L_0x00ac:
            r14 = 0
            goto L_0x009d
        L_0x00af:
            int r0 = r12.A04     // Catch:{ all -> 0x01c0 }
            double r0 = (double) r0     // Catch:{ all -> 0x01c0 }
            double r2 = r2 / r0
            boolean r0 = r11 instanceof X.C97844qM     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x00e7
            X.4qM r11 = (X.C97844qM) r11     // Catch:{ all -> 0x01c0 }
            X.63F r12 = r11.A02     // Catch:{ all -> 0x01c0 }
            if (r12 == 0) goto L_0x0070
            java.util.concurrent.atomic.AtomicReference r14 = r11.A04     // Catch:{ all -> 0x01c0 }
            double r17 = X.C90494aF.A00(r14)     // Catch:{ all -> 0x01c0 }
            java.util.concurrent.atomic.AtomicReference r13 = r11.A03     // Catch:{ all -> 0x01c0 }
            double r0 = X.C90494aF.A00(r13)     // Catch:{ all -> 0x01c0 }
            double r15 = r2 - r0
            int r0 = r11.A01     // Catch:{ all -> 0x01c0 }
            double r0 = (double) r0     // Catch:{ all -> 0x01c0 }
            double r15 = r15 / r0
            double r17 = r17 + r15
            java.lang.Double r0 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x01c0 }
            r14.set(r0)     // Catch:{ all -> 0x01c0 }
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x01c0 }
            r13.set(r0)     // Catch:{ all -> 0x01c0 }
            double r0 = X.C90494aF.A00(r14)     // Catch:{ all -> 0x01c0 }
            r12.A00(r0)     // Catch:{ all -> 0x01c0 }
            goto L_0x0070
        L_0x00e7:
            X.4qL r11 = (X.C97834qL) r11     // Catch:{ all -> 0x01c0 }
            java.util.concurrent.atomic.AtomicReference r13 = r11.A02     // Catch:{ all -> 0x01c0 }
            java.util.concurrent.atomic.AtomicReference r0 = r11.A03     // Catch:{ all -> 0x01c0 }
            double r11 = X.C90494aF.A00(r0)     // Catch:{ all -> 0x01c0 }
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r11
            double r2 = r2 * r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x01c0 }
            r13.set(r0)     // Catch:{ all -> 0x01c0 }
            goto L_0x0070
        L_0x00fe:
            r1 = 0
            r0 = 1
            A06(r7, r5, r4, r1, r0)     // Catch:{ all -> 0x01c0 }
            goto L_0x001f
        L_0x0105:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0105 }
            goto L_0x01bd
        L_0x0109:
            java.util.Iterator r15 = r8.iterator()     // Catch:{ all -> 0x01c0 }
        L_0x010d:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x01be
            java.lang.Object r4 = r15.next()     // Catch:{ all -> 0x01c0 }
            X.679 r4 = (X.AnonymousClass679) r4     // Catch:{ all -> 0x01c0 }
            int r2 = r4.A00     // Catch:{ all -> 0x01c0 }
            if (r2 > 0) goto L_0x0122
            int r1 = r4.A01     // Catch:{ all -> 0x01c0 }
            r0 = 0
            if (r1 <= 0) goto L_0x0123
        L_0x0122:
            r0 = 1
        L_0x0123:
            if (r0 == 0) goto L_0x010d
            X.6c3 r11 = r4.A03     // Catch:{ all -> 0x01c0 }
            X.6Ug r13 = r7.A00     // Catch:{ all -> 0x01c0 }
            boolean r0 = X.AnonymousClass000.A1R(r2)
            r14 = r0 ^ 1
            X.62U r3 = new X.62U     // Catch:{ all -> 0x01c0 }
            r3.<init>(r7, r4, r11)     // Catch:{ all -> 0x01c0 }
            r10 = 0
            X.5kh r0 = r13.A01     // Catch:{ all -> 0x01c0 }
            X.0wD r0 = r0.A00     // Catch:{ all -> 0x01c0 }
            boolean r0 = r0.A09()     // Catch:{ all -> 0x01c0 }
            if (r0 != 0) goto L_0x0150
            X.63o r1 = new X.63o     // Catch:{ all -> 0x01c0 }
            r1.<init>()     // Catch:{ all -> 0x01c0 }
            X.5Ti r0 = X.C108395Ti.DEVICE_OFFLINE     // Catch:{ all -> 0x01c0 }
            r1.A00 = r0     // Catch:{ all -> 0x01c0 }
            X.5VK r0 = r1.A00()     // Catch:{ all -> 0x01c0 }
            r3.A00(r11, r0, r10)     // Catch:{ all -> 0x01c0 }
            goto L_0x010d
        L_0x0150:
            java.lang.String r12 = r11.A08     // Catch:{ all -> 0x01c0 }
            java.lang.Object r5 = r13.A03     // Catch:{ all -> 0x01c0 }
            monitor-enter(r5)     // Catch:{ all -> 0x01c0 }
            r8 = 0
            if (r12 != 0) goto L_0x0162
            X.5ze r2 = r13.A02     // Catch:{ all -> 0x01ad }
            java.lang.String r1 = "SerialAssetDownloadManager"
            java.lang.String r0 = "Uri is null "
            r2.A00(r1, r0, r10, r8)     // Catch:{ all -> 0x01ad }
            goto L_0x017b
        L_0x0162:
            java.util.Map r2 = r13.A06     // Catch:{ all -> 0x01ad }
            boolean r0 = r2.containsKey(r12)     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x017d
            X.5ze r3 = r13.A02     // Catch:{ all -> 0x01ad }
            java.lang.String r2 = "SerialAssetDownloadManager"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = "Already download "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r12, r1)     // Catch:{ all -> 0x01ad }
            r3.A00(r2, r0, r10, r8)     // Catch:{ all -> 0x01ad }
        L_0x017b:
            monitor-exit(r5)     // Catch:{ all -> 0x01ad }
            goto L_0x010d
        L_0x017d:
            X.6NA r1 = new X.6NA     // Catch:{ all -> 0x01ad }
            r1.<init>(r3, r11, r14)     // Catch:{ all -> 0x01ad }
            r2.put(r12, r1)     // Catch:{ all -> 0x01ad }
            java.util.Queue r0 = r13.A07     // Catch:{ all -> 0x01ad }
            r0.offer(r1)     // Catch:{ all -> 0x01ad }
            X.C132556Ug.A01(r13)     // Catch:{ all -> 0x01ad }
            java.util.ArrayList r0 = X.C132556Ug.A00(r13)     // Catch:{ all -> 0x01ad }
            monitor-exit(r5)     // Catch:{ all -> 0x01ad }
            X.C132556Ug.A02(r13, r0)     // Catch:{ all -> 0x01c0 }
            X.6MT r3 = new X.6MT     // Catch:{ all -> 0x01c0 }
            r3.<init>(r1, r13)     // Catch:{ all -> 0x01c0 }
            X.6W8 r0 = r7.A01     // Catch:{ all -> 0x01c0 }
            java.util.Map r1 = r0.A02     // Catch:{ all -> 0x01c0 }
            X.6VA r0 = r11.A01     // Catch:{ all -> 0x01c0 }
            java.lang.String r2 = r0.A0A     // Catch:{ all -> 0x01c0 }
            java.lang.Object r0 = r1.put(r2, r3)     // Catch:{ all -> 0x01c0 }
            if (r0 != 0) goto L_0x01b0
            r0 = 1
            r4.A02 = r0     // Catch:{ all -> 0x01c0 }
            goto L_0x010d
        L_0x01ad:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01ad }
            goto L_0x01bd
        L_0x01b0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01c0 }
            java.lang.String r0 = "InternalLoadRequest already has linked token: "
            r1.append(r0)     // Catch:{ all -> 0x01c0 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r2, r1)     // Catch:{ all -> 0x01c0 }
        L_0x01bd:
            throw r0     // Catch:{ all -> 0x01c0 }
        L_0x01be:
            monitor-exit(r6)     // Catch:{ all -> 0x01c0 }
            return r9
        L_0x01c0:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01c0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133326Xw.A03(X.6Xw, java.util.List, java.util.List, boolean):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r4.A01 > 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A04(X.C133326Xw r3, X.AnonymousClass679 r4) {
        /*
            java.lang.Object r2 = r3.A04
            monitor-enter(r2)
            int r0 = r4.A00     // Catch:{ all -> 0x0019 }
            if (r0 > 0) goto L_0x000c
            int r1 = r4.A01     // Catch:{ all -> 0x0019 }
            r0 = 0
            if (r1 <= 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            if (r0 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            X.1Ak r0 = A01(r3, r4)     // Catch:{ all -> 0x0019 }
            goto L_0x0017
        L_0x0015:
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x0019:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133326Xw.A04(X.6Xw, X.679):java.util.List");
    }

    public static void A05(C133326Xw r7) {
        ArrayList A15;
        C159007ic r4;
        AnonymousClass5VK r3;
        Object obj;
        synchronized (r7.A04) {
            List list = r7.A09;
            A15 = C36441kJ.A15(list);
            list.clear();
        }
        Iterator it = A15.iterator();
        while (it.hasNext()) {
            AnonymousClass682 r5 = (AnonymousClass682) it.next();
            ArrayList A0I = AnonymousClass001.A0I();
            synchronized (r5) {
                boolean z = false;
                AnonymousClass5YI.A00(AnonymousClass000.A1S(r5.A01, r5.A04));
                if (!r5.A03) {
                    z = true;
                }
                AnonymousClass5YI.A00(z);
                r5.A03 = true;
                r4 = r5.A06;
                r3 = r5.A02;
                if (r3 == null) {
                    Iterator A0z = AnonymousClass000.A0z(r5.A09);
                    while (A0z.hasNext()) {
                        AnonymousClass00I r1 = (AnonymousClass00I) A0z.next();
                        if (AnonymousClass000.A1X(r1.A00) && (obj = r1.A01) != null) {
                            A0I.add((AnonymousClass5oE) obj);
                        }
                    }
                }
            }
            if (r3 != null) {
                r4.BXI(r3);
            } else {
                r4.onSuccess(A0I);
            }
        }
    }

    public static void A06(C133326Xw r10, AnonymousClass679 r11, AnonymousClass5oE r12, AnonymousClass5VK r13, boolean z) {
        IllegalStateException th;
        IllegalArgumentException illegalArgumentException;
        boolean z2;
        synchronized (r10.A04) {
            AnonymousClass6W8 r5 = r10.A01;
            Map map = r5.A02;
            String str = r11.A03.A01.A0A;
            if (map.get(str) == null) {
                AnonymousClass6W8.A03(r11, r5);
                for (AnonymousClass682 r3 : AnonymousClass6W8.A00(r11, r5)) {
                    synchronized (r3) {
                        if (z) {
                            if (r13 != null) {
                                illegalArgumentException = new IllegalArgumentException("Got non-null exception for success", r13);
                                throw illegalArgumentException;
                            }
                        } else if (r13 == null) {
                            illegalArgumentException = AnonymousClass001.A08("Got null exception for failure");
                            throw illegalArgumentException;
                        }
                        try {
                            Map map2 = r3.A09;
                            z2 = false;
                            AnonymousClass5YI.A00(AnonymousClass000.A1W(map2.get(str)));
                            int i = r3.A01;
                            int i2 = r3.A04;
                            AnonymousClass5YI.A00(AnonymousClass000.A1T(i, i2));
                            AnonymousClass5YI.A00(AnonymousClass000.A1Q(r3.A03 ? 1 : 0));
                            if (z) {
                                map2.put(str, C36441kJ.A0W(Boolean.TRUE, r12));
                            } else {
                                map2.put(str, C36441kJ.A0W(Boolean.FALSE, (Object) null));
                                if (r3.A02 == null) {
                                    r3.A02 = r13;
                                }
                            }
                            int i3 = r3.A01 + 1;
                            r3.A01 = i3;
                            if (i3 == i2) {
                                z2 = true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    if (z2) {
                        List<AnonymousClass679> A042 = r5.A04(r3);
                        if (!A042.isEmpty()) {
                            ArrayList A0I = AnonymousClass001.A0I();
                            for (AnonymousClass679 r0 : A042) {
                                A0I.add(r0.A03.A01.A0A);
                            }
                            th = AnonymousClass000.A0f(A0I, "Internal loads still pending for finished ExternalLoadRequest: ", AnonymousClass000.A0u());
                        } else {
                            r10.A09.add(r3);
                        }
                    }
                }
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("InternalLoadRequest still has associated download token: ");
                th = AnonymousClass000.A0g(str, A0u);
            }
            throw th;
        }
    }

    public C139376jj A09(C125235zX r10, C159007ic r11, AnonymousClass5YD r12, AnonymousClass6SG r13, List list) {
        AnonymousClass682 r3;
        Executor executor;
        synchronized (this.A04) {
            AnonymousClass6W8 r0 = this.A01;
            r3 = new AnonymousClass682(r10, r11, r12, r13, list);
            r0.A04.put(r3, AnonymousClass001.A0I());
        }
        if (r13.A02) {
            executor = this.A0A;
        } else {
            executor = this.A05;
        }
        C1503374w.A01(this, r3, list, executor, 10);
        return new C139376jj(this, r3);
    }

    public C133326Xw(C132556Ug r2, C139506jy r3, AnonymousClass6PQ r4, C125295ze r5, AnonymousClass5ZV r6, Executor executor, Executor executor2, Executor executor3) {
        this.A05 = executor;
        this.A0A = executor2;
        this.A06 = executor3;
        this.A02 = r3;
        this.A00 = r2;
        this.A03 = r4;
        this.A01 = new AnonymousClass6W8(r5);
        this.A08 = r6;
        this.A07 = r5;
        C113665fu.A00();
    }

    public static AnonymousClass00I A00(C133326Xw r11, List list, List list2, boolean z) {
        AnonymousClass5oE r0;
        HashMap A0J = AnonymousClass001.A0J();
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AnonymousClass679 r4 = (AnonymousClass679) it.next();
            C135056c3 r2 = r4.A03;
            AnonymousClass6VA r7 = r2.A01;
            A08(r11, r2, C023109s.A00, list, true);
            C139506jy r3 = r11.A02;
            boolean BLG = r3.BLG(r7, false);
            A08(r11, r2, C023109s.A01, list, BLG);
            if (BLG) {
                if (z || r7.A03 == ARRequestAsset$CompressionMethod.NONE) {
                    File B99 = r3.B99(r7, new C139526k0(r11, r2, list));
                    if (AnonymousClass6GT.A01(B99)) {
                        r0 = new AnonymousClass5oE(r2, B99);
                    } else {
                        AnonymousClass6YR.A0H("DefaultAssetManager", "Cached file not found? id=%s", r7.A0A);
                        r3.Bnc(r7);
                    }
                } else {
                    r3.Bx4(r7);
                    r0 = null;
                }
                A0J.put(r4, r0);
            }
            A0I.add(r4);
        }
        return C36441kJ.A0W(A0J, A0I);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0187, code lost:
        r3.A02(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018a, code lost:
        if (r15 != false) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018c, code lost:
        if (r10 == null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018e, code lost:
        r1 = r10.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0192, code lost:
        if (r1 != null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0194, code lost:
        r1 = "missing failure reason";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0196, code lost:
        r3.A03(r2, "failure_reason", r1);
        r3.A04(r2, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01df, code lost:
        r2.A02(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.C133326Xw r8, X.C135056c3 r9, X.AnonymousClass5VK r10, java.lang.Integer r11, java.util.List r12, long r13, boolean r15) {
        /*
            java.util.Iterator r7 = r12.iterator()
        L_0x0004:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x029d
            java.lang.Object r5 = r7.next()
            X.6SG r5 = (X.AnonymousClass6SG) r5
            int r0 = r11.intValue()
            switch(r0) {
                case 0: goto L_0x0061;
                case 1: goto L_0x00ae;
                case 2: goto L_0x0209;
                case 3: goto L_0x0017;
                case 4: goto L_0x0017;
                case 5: goto L_0x022d;
                case 6: goto L_0x00d5;
                case 7: goto L_0x00ea;
                case 8: goto L_0x00ff;
                case 9: goto L_0x0114;
                case 10: goto L_0x012e;
                case 11: goto L_0x0143;
                case 12: goto L_0x015d;
                case 13: goto L_0x0171;
                case 14: goto L_0x01a4;
                case 15: goto L_0x01b8;
                case 16: goto L_0x01cc;
                case 17: goto L_0x01e4;
                default: goto L_0x0017;
            }
        L_0x0017:
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r1 = 0
            switch(r0) {
                case 0: goto L_0x002e;
                case 1: goto L_0x0031;
                case 2: goto L_0x0034;
                case 3: goto L_0x0037;
                case 4: goto L_0x003a;
                case 5: goto L_0x003d;
                case 6: goto L_0x0040;
                case 7: goto L_0x0043;
                case 8: goto L_0x0046;
                case 9: goto L_0x0049;
                case 10: goto L_0x004c;
                case 11: goto L_0x004f;
                case 12: goto L_0x0052;
                case 13: goto L_0x0055;
                case 14: goto L_0x0058;
                case 15: goto L_0x005b;
                case 16: goto L_0x005e;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.String r0 = "CACHE_PUT_END"
        L_0x0021:
            r2[r1] = r0
            java.lang.String r0 = "unknown asset loading stage reported : {0}"
            java.lang.String r0 = java.text.MessageFormat.format(r0, r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x002e:
            java.lang.String r0 = "CACHE_CHECK_START"
            goto L_0x0021
        L_0x0031:
            java.lang.String r0 = "CACHE_CHECK_END"
            goto L_0x0021
        L_0x0034:
            java.lang.String r0 = "DOWNLOAD_START"
            goto L_0x0021
        L_0x0037:
            java.lang.String r0 = "DOWNLOAD_PAUSE"
            goto L_0x0021
        L_0x003a:
            java.lang.String r0 = "DOWNLOAD_RESUME"
            goto L_0x0021
        L_0x003d:
            java.lang.String r0 = "DOWNLOAD_END"
            goto L_0x0021
        L_0x0040:
            java.lang.String r0 = "DECRYPT_START"
            goto L_0x0021
        L_0x0043:
            java.lang.String r0 = "DECRYPT_OPERATION_START"
            goto L_0x0021
        L_0x0046:
            java.lang.String r0 = "DECRYPT_OPERATION_FINISH"
            goto L_0x0021
        L_0x0049:
            java.lang.String r0 = "DECRYPT_END"
            goto L_0x0021
        L_0x004c:
            java.lang.String r0 = "EXTRACT_START"
            goto L_0x0021
        L_0x004f:
            java.lang.String r0 = "EXTRACT_END"
            goto L_0x0021
        L_0x0052:
            java.lang.String r0 = "ENCODE_START"
            goto L_0x0021
        L_0x0055:
            java.lang.String r0 = "ENCODE_END"
            goto L_0x0021
        L_0x0058:
            java.lang.String r0 = "ENCODE_OPERATION_START"
            goto L_0x0021
        L_0x005b:
            java.lang.String r0 = "ENCODE_OPERATION_END"
            goto L_0x0021
        L_0x005e:
            java.lang.String r0 = "CACHE_PUT_START"
            goto L_0x0021
        L_0x0061:
            X.6PQ r1 = r8.A03
            r4 = 0
            X.C36331k8.A1I(r9, r5)
            boolean r0 = X.AnonymousClass6PQ.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4xG r3 = r1.A00
            int r2 = X.C101264xG.A00(r9, r5)
            X.0ze r1 = r3.A00
            r0 = 22413316(0x1560004, float:3.9305604E-38)
            r1.BPM(r0, r2, r4)
            X.6VA r0 = r9.A01
            java.lang.Boolean r0 = r0.A07
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ab
            java.lang.String r1 = "1"
        L_0x0087:
            java.lang.String r0 = "is_encrypted"
            r3.A03(r2, r0, r1)
            java.lang.String r0 = "cache_check_start"
            r3.A02(r2, r0)
            java.lang.String r1 = X.AnonymousClass5YC.A00(r9)
            X.AnonymousClass00C.A08(r1)
            java.lang.String r0 = "asset_id"
            r3.A03(r2, r0, r1)
            java.lang.String r1 = A02(r9)
            java.lang.String r0 = "asset_type"
            r3.A03(r2, r0, r1)
            r3.A05(r5, r2)
            goto L_0x0004
        L_0x00ab:
            java.lang.String r1 = "0"
            goto L_0x0087
        L_0x00ae:
            X.6PQ r1 = r8.A03
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            r3 = 2
            X.AnonymousClass00C.A0D(r5, r3)
            boolean r0 = X.AnonymousClass6PQ.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4xG r2 = r1.A00
            int r1 = X.C101264xG.A00(r9, r5)
            if (r15 == 0) goto L_0x00d2
            java.lang.String r0 = "cache_check_hit"
        L_0x00c8:
            r2.A02(r1, r0)
            if (r15 == 0) goto L_0x0004
            r2.A04(r1, r3)
            goto L_0x0004
        L_0x00d2:
            java.lang.String r0 = "cache_check_miss"
            goto L_0x00c8
        L_0x00d5:
            X.6PQ r1 = r8.A03
            X.C36321k7.A0w(r9, r5)
            boolean r0 = X.AnonymousClass6PQ.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4xG r2 = r1.A00
            int r1 = X.C101264xG.A00(r9, r5)
            java.lang.String r0 = "decryption_start"
            goto L_0x01df
        L_0x00ea:
            X.6PQ r1 = r8.A03
            X.C36321k7.A0w(r9, r5)
            boolean r0 = X.AnonymousClass6PQ.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4xG r2 = r1.A00
            int r1 = X.C101264xG.A00(r9, r5)
            java.lang.String r0 = "decryption_operation_start"
            goto L_0x01df
        L_0x00ff:
            X.6PQ r1 = r8.A03
            X.C36321k7.A0w(r9, r5)
            boolean r0 = X.AnonymousClass6PQ.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4xG r2 = r1.A00
            int r1 = X.C101264xG.A00(r9, r5)
            java.lang.String r0 = "decryption_operation_finish"
            goto L_0x01df
        L_0x0114:
            X.6PQ r1 = r8.A03
            r0 = 0
            X.C36321k7.A0v(r9, r0, r5)
            boolean r0 = X.AnonymousClass6PQ.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4xG r3 = r1.A00
            int r2 = X.C101264xG.A00(r9, r5)
            if (r15 == 0) goto L_0x012b
            java.lang.String r0 = "decryption_success"
            goto L_0x0187
        L_0x012b:
            java.lang.String r0 = "decryption_fail"
            goto L_0x0187
        L_0x012e:
            X.6PQ r1 = r8.A03
            X.C36321k7.A0w(r9, r5)
            boolean r0 = X.AnonymousClass6PQ.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4xG r2 = r1.A00
            int r1 = X.C101264xG.A00(r9, r5)
            java.lang.String r0 = "extraction_start"
            goto L_0x01df
        L_0x0143:
            X.6PQ r1 = r8.A03
            r0 = 0
            X.C36321k7.A0v(r9, r0, r5)
            boolean r0 = X.AnonymousClass6PQ.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4xG r3 = r1.A00
            int r2 = X.C101264xG.A00(r9, r5)
            if (r15 == 0) goto L_0x015a
            java.lang.String r0 = "extraction_success"
            goto L_0x0187
        L_0x015a:
            java.lang.String r0 = "extraction_fail"
            goto L_0x0187
        L_0x015d:
            X.6PQ r1 = r8.A03
            X.C36321k7.A0w(r9, r5)
            boolean r0 = X.AnonymousClass6PQ.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4xG r2 = r1.A00
            int r1 = X.C101264xG.A00(r9, r5)
            java.lang.String r0 = "encoding_start"
            goto L_0x01df
        L_0x0171:
            X.6PQ r1 = r8.A03
            r0 = 0
            X.C36321k7.A0v(r9, r0, r5)
            boolean r0 = X.AnonymousClass6PQ.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4xG r3 = r1.A00
            int r2 = X.C101264xG.A00(r9, r5)
            if (r15 == 0) goto L_0x01a1
            java.lang.String r0 = "encoding_success"
        L_0x0187:
            r3.A02(r2, r0)
            if (r15 != 0) goto L_0x0004
            if (r10 == 0) goto L_0x0194
            java.lang.String r1 = r10.A00()
            if (r1 != 0) goto L_0x0196
        L_0x0194:
            java.lang.String r1 = "missing failure reason"
        L_0x0196:
            java.lang.String r0 = "failure_reason"
            r3.A03(r2, r0, r1)
            r0 = 3
            r3.A04(r2, r0)
            goto L_0x0004
        L_0x01a1:
            java.lang.String r0 = "encoding_fail"
            goto L_0x0187
        L_0x01a4:
            X.6PQ r1 = r8.A03
            X.C36321k7.A0w(r9, r5)
            boolean r0 = X.AnonymousClass6PQ.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4xG r2 = r1.A00
            int r1 = X.C101264xG.A00(r9, r5)
            java.lang.String r0 = "encoding_operation_start"
            goto L_0x01df
        L_0x01b8:
            X.6PQ r1 = r8.A03
            X.C36321k7.A0w(r9, r5)
            boolean r0 = X.AnonymousClass6PQ.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4xG r2 = r1.A00
            int r1 = X.C101264xG.A00(r9, r5)
            java.lang.String r0 = "encoding_operation_finish"
            goto L_0x01df
        L_0x01cc:
            X.6PQ r1 = r8.A03
            X.C36321k7.A0w(r9, r5)
            boolean r0 = X.AnonymousClass6PQ.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4xG r2 = r1.A00
            int r1 = X.C101264xG.A00(r9, r5)
            java.lang.String r0 = "put_to_cache_start"
        L_0x01df:
            r2.A02(r1, r0)
            goto L_0x0004
        L_0x01e4:
            X.6PQ r1 = r8.A03
            r0 = 0
            X.C36321k7.A0v(r9, r0, r5)
            boolean r0 = X.AnonymousClass6PQ.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4xG r2 = r1.A00
            int r1 = X.C101264xG.A00(r9, r5)
            if (r15 == 0) goto L_0x0206
            java.lang.String r0 = "put_to_cache_success"
        L_0x01fa:
            r2.A02(r1, r0)
            r0 = 3
            if (r15 == 0) goto L_0x0201
            r0 = 2
        L_0x0201:
            r2.A04(r1, r0)
            goto L_0x0004
        L_0x0206:
            java.lang.String r0 = "put_to_cache_fail"
            goto L_0x01fa
        L_0x0209:
            X.6PQ r1 = r8.A03
            X.C36321k7.A0w(r9, r5)
            boolean r0 = X.AnonymousClass6PQ.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4xG r3 = r1.A00
            int r2 = X.C101264xG.A00(r9, r5)
            java.lang.String r1 = "UNKNOWN"
            java.lang.String r0 = "connection_class"
            r3.A03(r2, r0, r1)
            java.lang.String r0 = "connection_name"
            r3.A03(r2, r0, r1)
            java.lang.String r0 = "download_start"
            r3.A02(r2, r0)
            goto L_0x0004
        L_0x022d:
            X.6PQ r1 = r8.A03
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            r2 = 3
            X.AnonymousClass00C.A0D(r5, r2)
            boolean r0 = X.AnonymousClass6PQ.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4xG r4 = r1.A00
            java.lang.String r6 = r5.A01
            X.AnonymousClass00C.A08(r6)
            int r3 = X.C101264xG.A01(r9, r6)
            if (r15 == 0) goto L_0x0287
            java.lang.String r0 = "download_success"
        L_0x024c:
            r4.A02(r3, r0)
            if (r15 == 0) goto L_0x028a
            r1 = 0
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x027c
            java.lang.String r5 = A02(r9)
            java.lang.String r2 = X.AnonymousClass5YC.A00(r9)
            X.AnonymousClass00C.A08(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AssetQPLogger/logAssetDownloadFinish Successful download with empty result: "
            r1.append(r0)
            r1.append(r6)
            r0 = 32
            r1.append(r0)
            r1.append(r5)
            r1.append(r0)
            X.C36321k7.A1Z(r1, r2)
        L_0x027c:
            java.lang.String r1 = java.lang.String.valueOf(r13)
            java.lang.String r0 = "downloaded_bytes"
            r4.A03(r3, r0, r1)
            goto L_0x0004
        L_0x0287:
            java.lang.String r0 = "download_fail"
            goto L_0x024c
        L_0x028a:
            if (r10 == 0) goto L_0x0298
            java.lang.String r1 = r10.A00()
            X.AnonymousClass00C.A08(r1)
            java.lang.String r0 = "failure_reason"
            r4.A03(r3, r0, r1)
        L_0x0298:
            r4.A04(r3, r2)
            goto L_0x0004
        L_0x029d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133326Xw.A07(X.6Xw, X.6c3, X.5VK, java.lang.Integer, java.util.List, long, boolean):void");
    }
}
