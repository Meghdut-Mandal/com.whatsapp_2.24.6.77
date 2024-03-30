package X;

import android.os.SystemClock;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6yg  reason: invalid class name and case insensitive filesystem */
public final class C148326yg implements C161077m7, QuickPerformanceLogger {
    public static final Set A06;
    public final C21690ze A00;
    public final AnonymousClass00T A01;
    public final AnonymousClass00T A02;
    public final C19970wo A03;
    public final C21470zI A04;
    public final C21590zU A05;

    static {
        Integer[] numArr = new Integer[5];
        AnonymousClass000.A1J(numArr, 16318558);
        AnonymousClass000.A1K(numArr, 16318559);
        C36331k8.A1V(numArr, 16321564);
        C36341k9.A1T(numArr, 674172413);
        C36341k9.A1U(numArr, 328150699);
        A06 = C90504aG.A0w(numArr);
    }

    public void endAllMarkers(short s, boolean z) {
        if (!A04((Integer) null)) {
            this.A00.endAllMarkers(s, z);
        }
    }

    public EventBuilder markEventBuilder(int i, int i2, String str) {
        int i3 = i;
        String str2 = str;
        if (!A03(this, str, 2, i)) {
            return new C140286lL(this.A04, this, Integer.valueOf(i2), str2, i3);
        }
        C140296lM r0 = C140296lM.A00;
        AnonymousClass00C.A09(r0);
        return r0;
    }

    public void markJoinRequestForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
        C36331k8.A1G(str, 2, timeUnit);
        A01(this, i);
    }

    public void markJoinResponseForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
        C36331k8.A1G(str, 2, timeUnit);
        A01(this, i);
    }

    public void markerAnnotateCrucialForUserFlow(int i, int i2, String str, int i3) {
        AnonymousClass00C.A0D(str, 2);
        markerAnnotate(i, i2, str, i3);
    }

    public void markerEndAtPointForUserFlow(int i, int i2, short s, String str) {
        if (!A03(this, str, 3, i)) {
            this.A00.BPH(i, i2, s, str);
        }
    }

    public void markerEndForUserFlow(int i, int i2, short s) {
        markerEndForUserFlow(i, (String) null, i2, s);
    }

    public void markerGenerate(int i, short s, long j, TimeUnit timeUnit) {
        AnonymousClass00C.A0D(timeUnit, 3);
        A01(this, i);
    }

    public void markerGenerateWithAnnotations(int i, short s, long j, TimeUnit timeUnit, Map map) {
        AnonymousClass00C.A0D(timeUnit, 3);
        A01(this, i);
    }

    public void markerLinkPivot(int i, int i2, String str) {
        AnonymousClass00C.A0D(str, 2);
        A01(this, i);
    }

    public void markerStartForE2E(int i, int i2, String str, boolean z, long j, TimeUnit timeUnit) {
        C36421kH.A1J(str, 2, timeUnit);
        A01(this, i);
    }

    public void markerStartForUserFlow(int i, int i2, long j, TimeUnit timeUnit, boolean z) {
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A03(this, timeUnit, 3, i)) {
            boolean z2 = z;
            this.A00.markerStartWithCancelPolicy(i3, z2, i2, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A03(this, timeUnit, 4, i)) {
            this.A00.markerStartWithCancelPolicy(i3, z, i2, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerTag(int i, int i2, String str) {
        AnonymousClass00C.A0D(str, 2);
        A01(this, i);
    }

    private final long A00(long j, TimeUnit timeUnit) {
        if (j == -1) {
            return timeUnit.convert(currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
        }
        return j;
    }

    private final boolean A04(Integer num) {
        if (C36331k8.A1b(this.A01)) {
            return true;
        }
        if (num == null || A06.contains(num)) {
            return false;
        }
        return true;
    }

    public long currentMonotonicTimestampNanos() {
        return this.A00.currentMonotonicTimestampNanos();
    }

    public boolean isMarkerOn(int i, int i2, boolean z) {
        return this.A00.isMarkerOn(i, i2);
    }

    public C148326yg(C19970wo r3, C20810yC r4, C21690ze r5, C21470zI r6, C21590zU r7) {
        C36321k7.A1B(r4, r3, r6, r7, r5);
        this.A03 = r3;
        this.A04 = r6;
        this.A05 = r7;
        this.A00 = r5;
        C000800j r1 = C000800j.PUBLICATION;
        this.A01 = C001400p.A00(r1, new C152997Mq(r4));
        this.A02 = C001400p.A00(r1, new C153007Mr(this));
    }

    public static void A01(C148326yg r1, int i) {
        r1.A04(Integer.valueOf(i));
    }

    public static boolean A02(C148326yg r1, int i) {
        return r1.A04(Integer.valueOf(i));
    }

    public static boolean A03(C148326yg r1, Object obj, int i, int i2) {
        AnonymousClass00C.A0D(obj, i);
        return r1.A04(Integer.valueOf(i2));
    }

    public void BsN(int i, int i2, String str) {
        if (!A02(this, i)) {
            this.A00.BsN(i, i2, str);
        }
    }

    public void BsO(int i, String str) {
        if (!A02(this, i)) {
            this.A00.BsO(i, str);
        }
    }

    public long currentMonotonicTimestamp() {
        return SystemClock.elapsedRealtime();
    }

    public void endAllInstancesOfMarker(int i, short s) {
        if (!A02(this, i)) {
            this.A00.endAllInstancesOfMarker(i, s);
        }
    }

    public void markerDrop(int i) {
        if (!A02(this, i)) {
            this.A00.markerDrop(i);
        }
    }

    public void markerDropForUserFlow(int i, int i2) {
        if (!A02(this, i)) {
            this.A00.markerDrop(i, i2);
        }
    }

    public void markerEnd(int i, int i2, short s) {
        if (!A02(this, i)) {
            this.A00.markerEnd(i, i2, s);
        }
    }

    public void markerStart(int i, String str, String str2) {
        C36321k7.A0x(str, str2);
        if (!A02(this, i)) {
            this.A00.markerStart(i, str, str2);
        }
    }

    public int sampleRateForMarker(int i) {
        if (A02(this, i)) {
            return Integer.MAX_VALUE;
        }
        return (int) C21540zP.A00(this.A05.A01, i).A01;
    }

    public MarkerEditor withMarker(int i) {
        if (!A02(this, i)) {
            return new C98074qp(this.A04, this, (Integer) null, i);
        }
        C98084qq r0 = C98084qq.A00;
        AnonymousClass00C.A09(r0);
        return r0;
    }

    public void markerStartForUserFlowE2E(int i, int i2, long j, TimeUnit timeUnit, String str, boolean z) {
        A01(this, i);
    }

    public void markerAnnotate(int i, int i2, String str, double d) {
        int i3 = i;
        String str2 = str;
        if (!A03(this, str, 2, i)) {
            this.A00.markerAnnotate(i3, i2, str2, d);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int i3) {
        if (!A03(this, str, 2, i)) {
            this.A00.markerAnnotate(i, i2, str, i3);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long j) {
        int i3 = i;
        String str2 = str;
        if (!A03(this, str, 2, i)) {
            this.A00.markerAnnotate(i3, i2, str2, j);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String str2) {
        C36321k7.A0z(str, str2);
        if (!A02(this, i)) {
            this.A00.markerAnnotate(i, i2, str, str2);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean z) {
        if (!A03(this, str, 2, i)) {
            this.A00.markerAnnotate(i, i2, str, z);
        }
    }

    public void markerAnnotate(int i, int i2, String str, double[] dArr) {
        C36321k7.A0z(str, dArr);
        if (!A02(this, i)) {
            this.A00.markerAnnotate(i, i2, str, dArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int[] iArr) {
        C36321k7.A0z(str, iArr);
        if (!A02(this, i)) {
            this.A00.markerAnnotate(i, i2, str, iArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long[] jArr) {
        C36321k7.A0z(str, jArr);
        if (!A02(this, i)) {
            this.A00.markerAnnotate(i, i2, str, jArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String[] strArr) {
        C36321k7.A0z(str, strArr);
        if (!A02(this, i)) {
            this.A00.markerAnnotate(i, i2, str, strArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        C36321k7.A0z(str, zArr);
        if (!A02(this, i)) {
            this.A00.markerAnnotate(i, i2, str, zArr);
        }
    }

    public void markerAnnotate(int i, String str, double d) {
        if (!A03(this, str, 1, i)) {
            this.A00.markerAnnotate(i, str, d);
        }
    }

    public void markerAnnotate(int i, String str, int i2) {
        if (!A03(this, str, 1, i)) {
            this.A00.markerAnnotate(i, str, i2);
        }
    }

    public void markerAnnotate(int i, String str, long j) {
        if (!A03(this, str, 1, i)) {
            this.A00.markerAnnotate(i, str, j);
        }
    }

    public void markerAnnotate(int i, String str, String str2) {
        C36321k7.A0x(str, str2);
        if (!A02(this, i)) {
            this.A00.markerAnnotate(i, str, str2);
        }
    }

    public void markerAnnotate(int i, String str, boolean z) {
        if (!A03(this, str, 1, i)) {
            this.A00.markerAnnotate(i, str, z);
        }
    }

    public void markerAnnotate(int i, String str, double[] dArr) {
        C36321k7.A0x(str, dArr);
        if (!A02(this, i)) {
            this.A00.markerAnnotate(i, str, dArr);
        }
    }

    public void markerAnnotate(int i, String str, int[] iArr) {
        C36321k7.A0x(str, iArr);
        if (!A02(this, i)) {
            this.A00.markerAnnotate(i, str, iArr);
        }
    }

    public void markerAnnotate(int i, String str, long[] jArr) {
        C36321k7.A0x(str, jArr);
        if (!A02(this, i)) {
            this.A00.markerAnnotate(i, str, jArr);
        }
    }

    public void markerAnnotate(int i, String str, String[] strArr) {
        C36321k7.A0x(str, strArr);
        if (!A02(this, i)) {
            this.A00.markerAnnotate(i, str, strArr);
        }
    }

    public void markerAnnotate(int i, String str, boolean[] zArr) {
        C36321k7.A0x(str, zArr);
        if (!A02(this, i)) {
            this.A00.markerAnnotate(i, str, zArr);
        }
    }

    public void markerPoint(int i, int i2, String str) {
        if (!A03(this, str, 2, i)) {
            this.A00.markerPoint(i, i2, str);
        }
    }

    public void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        String str2 = str;
        TimeUnit timeUnit2 = timeUnit;
        C36331k8.A1G(str, 2, timeUnit);
        int i3 = i;
        if (!A02(this, i)) {
            this.A00.markerPoint(i3, i2, str2, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2) {
        if (!A03(this, str, 2, i)) {
            this.A00.markerPoint(i, i2, str, str2);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        String str3 = str;
        TimeUnit timeUnit2 = timeUnit;
        C36421kH.A1J(str, 2, timeUnit);
        int i3 = i;
        if (!A02(this, i)) {
            this.A00.markerPoint(i3, i2, str3, str2, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit, int i3) {
        C36421kH.A1J(str, 2, timeUnit);
        markerPoint(i, i2, str, str2, j, timeUnit);
    }

    public void markerPoint(int i, String str) {
        if (!A03(this, str, 1, i)) {
            this.A00.markerPoint(i, str);
        }
    }

    public void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        String str2 = str;
        TimeUnit timeUnit2 = timeUnit;
        C36321k7.A0y(str, timeUnit);
        int i2 = i;
        if (!A02(this, i)) {
            this.A00.markerPoint(i2, str2, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerPoint(int i, String str, String str2) {
        if (!A03(this, str, 1, i)) {
            this.A00.markerPoint(i, str, str2);
        }
    }

    public void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        String str3 = str;
        TimeUnit timeUnit2 = timeUnit;
        C36331k8.A1G(str, 1, timeUnit);
        int i2 = i;
        if (!A02(this, i)) {
            this.A00.markerPoint(i2, str3, str2, A00(j, timeUnit), timeUnit2);
        }
    }

    public C148326yg() {
    }

    public boolean isMarkerOn(int i, int i2) {
        return this.A00.isMarkerOn(i, i2);
    }

    public EventBuilder markEventBuilder(int i, String str) {
        int i2 = i;
        String str2 = str;
        if (!A03(this, str, 1, i)) {
            return new C140286lL(this.A04, this, (Integer) null, str2, i2);
        }
        C140296lM r0 = C140296lM.A00;
        AnonymousClass00C.A09(r0);
        return r0;
    }

    public void markerAnnotateCrucialForUserFlow(int i, int i2, String str, String str2) {
        C36321k7.A0z(str, str2);
        markerAnnotate(i, i2, str, str2);
    }

    public void markerDrop(int i, int i2) {
        if (!A02(this, i)) {
            this.A00.markerDrop(i, i2);
        }
    }

    public void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        int i2 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A03(this, timeUnit, 3, i)) {
            this.A00.markerEnd(i2, s, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerEndForUserFlow(int i, String str, int i2, short s) {
        if (str == null) {
            markerEnd(i, i2, s);
        } else {
            markerEndAtPointForUserFlow(i, i2, s, str);
        }
    }

    public void markerStart(int i, int i2, long j, TimeUnit timeUnit) {
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A03(this, timeUnit, 3, i)) {
            this.A00.markerStartWithCancelPolicy(i3, true, i2, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerStartForUserFlow(int i, int i2, boolean z, long j) {
        if (!A02(this, i)) {
            this.A00.BPM(i, i2, z);
        }
    }

    public void markerTag(int i, String str) {
        AnonymousClass00C.A0D(str, 1);
        A01(this, i);
    }

    public MarkerEditor withMarker(int i, int i2) {
        if (!A02(this, i)) {
            return new C98074qp(this.A04, this, Integer.valueOf(i2), i);
        }
        C98084qq r0 = C98084qq.A00;
        AnonymousClass00C.A09(r0);
        return r0;
    }

    public boolean isMarkerOn(int i, boolean z) {
        return this.A00.BMN(i);
    }

    public void markerEnd(int i, short s) {
        if (!A02(this, i)) {
            this.A00.markerEnd(i, s);
        }
    }

    public void markerStart(int i, int i2) {
        if (!A02(this, i)) {
            this.A00.markerStart(i, i2);
        }
    }

    public void markerStartForUserFlow(int i, int i2, String str, boolean z, long j) {
        if (!A02(this, i)) {
            this.A00.BPM(i, i2, z);
        }
    }

    public void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A03(this, timeUnit, 4, i)) {
            this.A00.markerEnd(i3, i2, s, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerStart(int i) {
        if (!A02(this, i)) {
            this.A00.markerStart(i);
        }
    }

    public void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        String str3 = str;
        String str4 = str2;
        C36321k7.A0z(str, str2);
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A03(this, timeUnit, 5, i)) {
            this.A00.markerStart(i3, i2, str3, str4, A00(j, timeUnit), timeUnit2);
        }
    }

    public void markerStart(int i, int i2, long j, TimeUnit timeUnit, int i3) {
        AnonymousClass00C.A0D(timeUnit, 3);
        markerStart(i, i2, j, timeUnit);
    }

    public void markerStart(int i, int i2, String str, String str2) {
        C36321k7.A0z(str, str2);
        if (!A02(this, i)) {
            this.A00.markerStart(i, i2, str, str2);
        }
    }
}
