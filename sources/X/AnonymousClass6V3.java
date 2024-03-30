package X;

import android.os.Trace;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6V3  reason: invalid class name */
public class AnonymousClass6V3 {
    public static final long A0H = ((long) (Math.pow(10.0d, 6.0d) / 30.0d));
    public long A00 = 0;
    public C118705ob A01;
    public C131656Py A02;
    public C131656Py A03;
    public boolean A04;
    public final AnonymousClass7ez A05;
    public final C131456Pc A06;
    public final AnonymousClass6ED A07;
    public final C125085zI A08;
    public final C159107ip A09;
    public final AnonymousClass64W A0A;
    public final Map A0B = AnonymousClass001.A0J();
    public final Map A0C = Collections.synchronizedMap(AnonymousClass001.A0J());
    public final ExecutorService A0D;
    public final AnonymousClass6QD A0E;
    public final C121035sU A0F;
    public volatile boolean A0G;

    /* JADX INFO: finally extract failed */
    public void A02() {
        Trace.beginSection("MultipleTrackCooridnator.demuxAndDecodeMediaPosition");
        try {
            AnonymousClass6ED r2 = this.A07;
            C131736Qi.A02(AnonymousClass000.A1V(r2), "MultiOutputCoordinator cannot be null");
            AnonymousClass6QD r0 = this.A0E;
            AnonymousClass5TE r5 = AnonymousClass5TE.VIDEO;
            AnonymousClass7ez r8 = this.A05;
            long A002 = AnonymousClass6U7.A00(r8, r5, r0);
            C125085zI r7 = this.A08;
            Map map = this.A0B;
            AnonymousClass6QD r4 = r7.A05;
            Objects.requireNonNull(r4);
            HashMap A032 = r4.A03(r5);
            if (A032 == null) {
                throw new C98614ri();
            }
            Iterator A10 = C36371kC.A10(A032);
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                int A0H2 = C90514aH.A0H(A11.getKey());
                long A012 = AnonymousClass6U7.A01(r8, (C128956Eg) A11.getValue());
                SparseArray sparseArray = (SparseArray) map.get(r5);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    map.put(r5, sparseArray);
                }
                sparseArray.put(A0H2, new AnonymousClass6F3(TimeUnit.MICROSECONDS, 0, 0 + A012));
            }
            Object obj = map.get(r5);
            Objects.requireNonNull(obj);
            this.A01 = new C118705ob((SparseArray) obj);
            Objects.requireNonNull(r2);
            C115025iD r14 = new C115025iD(r2);
            Objects.requireNonNull(r2);
            C115015iC r13 = new C115015iC(r2);
            AnonymousClass65W r12 = r7.A07;
            HashMap A0J = AnonymousClass001.A0J();
            SparseArray sparseArray2 = (SparseArray) map.get(r5);
            if (sparseArray2 != null) {
                for (int i = 0; i < sparseArray2.size(); i++) {
                    A0J.put(Integer.toString(sparseArray2.keyAt(i)), sparseArray2.valueAt(i));
                }
            }
            this.A03 = new C162587op(r12, r13, r14, A0J, 1);
            Objects.requireNonNull(r4);
            Objects.requireNonNull(r2);
            C115005iB r6 = new C115005iB(r2);
            Objects.requireNonNull(r2);
            this.A02 = C109705Yp.A00(r4, new C114995iA(r2), r6, r12);
            A03(A002);
            Map map2 = r2.A01;
            ((C160987lu) map2.get(0)).flush();
            C160987lu r22 = (C160987lu) map2.get(0);
            if (r22 != null) {
                r22.BuB();
            }
            this.A00 = 0;
            A01(Collections.EMPTY_LIST);
            Trace.endSection();
        } catch (Throwable th) {
            A01(Collections.EMPTY_LIST);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0155, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018a, code lost:
        if (r21.A01(r0, r17) != false) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x018c, code lost:
        if (r9 != false) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0191, code lost:
        if (r1 == false) goto L_0x0144;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(long r31) {
        /*
            r30 = this;
            java.lang.String r0 = "MultipleTrackCooridnator.demuxAndDecodeMediaPosition"
            android.os.Trace.beginSection(r0)
            X.5TE r14 = X.AnonymousClass5TE.VIDEO
            r7 = r30
            long r1 = r7.A00
            java.util.Map r0 = r7.A0B
            r29 = r0
            X.5zI r0 = r7.A08
            r28 = r0
            r0 = r29
            java.util.ArrayList r20 = A00(r14, r0, r1)
        L_0x0019:
            long r1 = r7.A00
            int r0 = (r1 > r31 ? 1 : (r1 == r31 ? 0 : -1))
            if (r0 >= 0) goto L_0x020d
            boolean r0 = r7.A0G
            if (r0 != 0) goto L_0x020d
            java.lang.String r0 = "MultipleTrackCooridnator.demux"
            android.os.Trace.beginSection(r0)
            long r1 = r7.A00
            X.6Py r0 = r7.A03
            if (r0 == 0) goto L_0x0031
            r0.A00(r1)
        L_0x0031:
            X.6Py r0 = r7.A02
            if (r0 == 0) goto L_0x0038
            r0.A00(r1)
        L_0x0038:
            java.util.Iterator r19 = r20.iterator()
        L_0x003c:
            boolean r0 = r19.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r8 = r19.next()
            java.lang.Number r8 = (java.lang.Number) r8
            java.lang.String r0 = "MultipleTrackCooridnator.createOrGetDemuxDecodeWrapper"
            android.os.Trace.beginSection(r0)
            int r11 = r8.intValue()
            X.6QD r10 = r7.A0E
            java.util.Map r9 = r7.A0C
            java.lang.Object r6 = r9.get(r8)
            X.7lp r6 = (X.C160937lp) r6
            if (r6 != 0) goto L_0x009b
            X.64W r15 = r7.A0A
            java.util.concurrent.ExecutorService r13 = r7.A0D
            X.7ip r12 = r7.A09
            X.6Pc r6 = r7.A06
            r5 = 0
            X.6Eg r4 = r10.A01(r14, r11)
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            r1[r5] = r10
            java.lang.String r0 = "mc: %s"
            if (r4 == 0) goto L_0x01fc
            java.util.List r0 = r4.A01
            java.util.ArrayList r0 = X.C36441kJ.A15(r0)
            java.lang.Object r0 = r0.get(r5)
            X.6F1 r0 = (X.AnonymousClass6F1) r0
            r21 = r15
            r22 = r6
            r23 = r0
            r24 = r28
            r25 = r12
            r26 = r13
            X.7lp r6 = r21.A00(r22, r23, r24, r25, r26)
            r6.B3P(r11)
            r6.start()
            r9.put(r8, r6)
        L_0x009b:
            android.os.Trace.endSection()
            boolean r0 = r6.BLY()
            if (r0 != 0) goto L_0x003c
            X.6Eg r18 = r10.A01(r14, r11)
            if (r18 == 0) goto L_0x01f6
            r0 = r28
            X.6OY r0 = r0.A04
            if (r0 == 0) goto L_0x0144
            int r9 = r20.size()
            long r0 = r7.A00
            long r25 = r6.BAp()
            long r25 = r25 + r2
            X.5sU r5 = r7.A0F
            X.5ob r4 = r7.A01
            r27 = r4
            java.util.Objects.requireNonNull(r27)
            r4 = 1
            if (r9 > r4) goto L_0x018e
            int r4 = (r25 > r0 ? 1 : (r25 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x01a3
            java.util.concurrent.TimeUnit r17 = java.util.concurrent.TimeUnit.MICROSECONDS
            X.6F3 r4 = new X.6F3
            r21 = r4
            r22 = r17
            r23 = r0
            r21.<init>(r22, r23, r25)
        L_0x00d9:
            int r1 = r5.A01
            java.util.List r15 = r5.A02
            int r0 = r15.size()
            if (r1 >= r0) goto L_0x0155
            int r0 = r5.A01
            java.lang.Object r10 = r15.get(r0)
            X.6F3 r10 = (X.AnonymousClass6F3) r10
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r10.A01
            java.util.concurrent.TimeUnit r11 = r10.A02
            long r0 = r9.convert(r0, r11)
            boolean r0 = r4.A01(r0, r9)
            if (r0 != 0) goto L_0x0142
            long r0 = r10.A00
            long r0 = r9.convert(r0, r11)
            boolean r0 = r4.A01(r0, r9)
            if (r0 != 0) goto L_0x0142
            long r0 = r4.A01
            java.util.concurrent.TimeUnit r11 = r4.A02
            long r0 = r9.convert(r0, r11)
            boolean r0 = r10.A01(r0, r9)
            if (r0 != 0) goto L_0x0142
            long r0 = r4.A00
            long r12 = r9.convert(r0, r11)
            boolean r9 = r10.A01(r12, r9)
            if (r9 != 0) goto L_0x0142
            int r9 = r5.A01
            java.lang.Object r12 = r15.get(r9)
            X.6F3 r12 = (X.AnonymousClass6F3) r12
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r9 = r12.A01
            java.util.concurrent.TimeUnit r12 = r12.A02
            long r15 = r13.convert(r9, r12)
            long r9 = r13.convert(r0, r11)
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0155
            int r0 = r5.A01
            int r0 = r0 + 1
            r5.A01 = r0
            goto L_0x00d9
        L_0x0142:
            r9 = 1
            goto L_0x0156
        L_0x0144:
            java.lang.String r0 = "MultipleTrackCooridnator.decodeFrameAndAdvanceNormalClock"
            android.os.Trace.beginSection(r0)
            long r4 = r6.B57()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x019e
            long r2 = r2 + r4
            r7.A00 = r2
            goto L_0x019e
        L_0x0155:
            r9 = 0
        L_0x0156:
            r0 = r27
            java.util.HashMap r1 = r0.A00
            boolean r0 = r1.containsKey(r8)
            if (r0 == 0) goto L_0x018c
            java.lang.Object r0 = r1.get(r8)
            int r5 = X.AnonymousClass000.A0I(r0)
            r0 = r27
            java.util.List r1 = r0.A01
            int r0 = X.C36431kI.A07(r1)
            if (r5 == r0) goto L_0x018c
            int r0 = r5 + 1
            java.lang.Object r0 = r1.get(r0)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            long r0 = X.C36431kI.A09(r0)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x018c
            r5 = r17
            boolean r0 = r4.A01(r0, r5)
            if (r0 != 0) goto L_0x018e
        L_0x018c:
            if (r9 == 0) goto L_0x01a3
        L_0x018e:
            r1 = 1
        L_0x018f:
            r7.A04 = r1
            if (r1 == 0) goto L_0x0144
        L_0x0193:
            java.lang.String r0 = "MultipleTrackCooridnator.decodeFrameAndAdvanceCustomClock"
            android.os.Trace.beginSection(r0)
            long r0 = r7.A00
            long r0 = r0 - r2
            r6.B58(r0)
        L_0x019e:
            android.os.Trace.endSection()
            goto L_0x003c
        L_0x01a3:
            r0 = r18
            java.util.List r0 = r0.A03
            java.util.ArrayList r0 = X.C36441kJ.A15(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x018e
            r1 = 0
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x018f
            r7.A04 = r1
            goto L_0x0193
        L_0x01b9:
            java.lang.String r0 = "MultipleTrackCooridnator.render"
            android.os.Trace.beginSection(r0)
            long r0 = r7.A00
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x01c9
            X.6ED r2 = r7.A07
            r2.A02(r0)
        L_0x01c9:
            long r1 = r7.A00
            long r3 = A0H
            long r1 = r1 + r3
            r7.A00 = r1
            r0 = r29
            java.util.ArrayList r20 = A00(r14, r0, r1)
            r0 = r20
            r7.A01(r0)
            X.6ED r0 = r7.A07
            r1 = 0
            java.util.Map r0 = r0.A01
            java.lang.Object r0 = X.C36371kC.A0r(r0, r1)
            X.7lu r0 = (X.C160987lu) r0
            if (r0 == 0) goto L_0x0205
            boolean r0 = r0.BLQ()
            if (r0 != 0) goto L_0x0205
            android.os.Trace.endSection()
            android.os.Trace.endSection()
            goto L_0x0019
        L_0x01f6:
            X.4ri r1 = new X.4ri
            r1.<init>()
            throw r1
        L_0x01fc:
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r0, (java.lang.Object[]) r1)
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0205:
            java.lang.String r0 = "Muxer stopped even before EOS is enqueued"
            X.5VN r1 = new X.5VN
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x020d:
            android.os.Trace.endSection()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6V3.A03(long):void");
    }

    public AnonymousClass6V3(AnonymousClass7ez r8, C131456Pc r9, AnonymousClass6ED r10, C125085zI r11, C159107ip r12, AnonymousClass64W r13) {
        int i;
        this.A07 = r10;
        this.A08 = r11;
        this.A0A = r13;
        this.A05 = r8;
        this.A06 = r9;
        this.A09 = r12;
        AnonymousClass6QD r6 = r11.A05;
        Objects.requireNonNull(r6);
        this.A0E = r6;
        AnonymousClass65W r5 = r11.A07;
        AnonymousClass5TE r4 = AnonymousClass5TE.VIDEO;
        if (r6 == null || r6.A03(r4) == null) {
            i = 0;
        } else {
            i = r6.A03(r4).size();
        }
        this.A0D = C129246Ga.A00("VIDEO_DEMUX_DECODE", new AnonymousClass75M(), i, false);
        this.A0F = new C121035sU(r4, r6, r5);
    }

    public static ArrayList A00(AnonymousClass5TE r7, Map map, long j) {
        ArrayList A0I = AnonymousClass001.A0I();
        SparseArray sparseArray = (SparseArray) map.get(r7);
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Object valueAt = sparseArray.valueAt(i);
                Objects.requireNonNull(valueAt);
                if (((AnonymousClass6F3) valueAt).A01(j, TimeUnit.MICROSECONDS)) {
                    AnonymousClass000.A1F(A0I, keyAt);
                }
            }
        }
        return A0I;
    }

    private void A01(List list) {
        HashMap A0J = AnonymousClass001.A0J();
        Map map = this.A0C;
        A0J.putAll(map);
        for (Object remove : list) {
            A0J.remove(remove);
        }
        AnonymousClass6MV r3 = new AnonymousClass6MV();
        Iterator A10 = C36371kC.A10(A0J);
        while (A10.hasNext()) {
            AnonymousClass60I.A00(new C162577oo(r3, (C160937lp) C36351kA.A0u(A10)));
        }
        Throwable th = r3.A01;
        if (th == null) {
            map.keySet().removeAll(A0J.keySet());
            return;
        }
        throw th;
    }
}
