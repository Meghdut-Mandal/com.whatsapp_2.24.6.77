package X;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0ze  reason: invalid class name and case insensitive filesystem */
public class C21690ze implements C21430zE {
    public final C20810yC A00;
    public final C21430zE A01;
    public volatile Boolean A02;

    public static boolean A00(C21690ze r3) {
        if (r3.A02 == null) {
            synchronized (r3) {
                if (r3.A02 == null) {
                    r3.A02 = Boolean.valueOf(C20800yB.A01(C21000yV.A02, r3.A00, 433));
                }
            }
        }
        return r3.A02.booleanValue();
    }

    public void B6V(int i, short s) {
        this.A01.B6V(300000, 113);
    }

    public Collection B8X() {
        return this.A01.B8X();
    }

    public boolean BJs() {
        return this.A01.BJs();
    }

    public boolean BMN(int i) {
        return this.A01.BMN(i);
    }

    public void BPN(int i, String str, String str2, long j, TimeUnit timeUnit) {
        if (!A00(this)) {
            this.A01.BPN(i, "perf_origin", str2, j, timeUnit);
        }
    }

    public void BPP(String str, String str2, int i, int i2, boolean z) {
        if (!A00(this)) {
            this.A01.BPP("perf_origin", str2, i, i2, z);
        }
    }

    public Long BlL() {
        return this.A01.BlL();
    }

    public Integer BlM() {
        return this.A01.BlM();
    }

    public String Bli() {
        return this.A01.Bli();
    }

    public void BpN() {
        this.A01.BpN();
    }

    public void Bxa() {
        this.A01.Bxa();
    }

    public long currentMonotonicTimestampNanos() {
        return this.A01.currentMonotonicTimestampNanos();
    }

    public void endAllInstancesOfMarker(int i, short s) {
        this.A01.endAllInstancesOfMarker(i, s);
    }

    public void endAllMarkers(short s, boolean z) {
        this.A01.endAllMarkers(s, z);
    }

    public boolean isMarkerOn(int i, int i2) {
        return this.A01.isMarkerOn(i, i2);
    }

    public void markerDrop(int i) {
        this.A01.markerDrop(i);
    }

    public C21690ze(C20810yC r1, C21430zE r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BPD(AnonymousClass4TY r2, int i) {
        if (!A00(this)) {
            this.A01.BPD(r2, i);
        }
    }

    public void BPH(int i, int i2, short s, String str) {
        if (!A00(this)) {
            this.A01.BPH(i, i2, s, str);
        }
    }

    public void BPI(String str, int i, short s) {
        if (!A00(this)) {
            this.A01.BPI(str, 1029386189, s);
        }
    }

    public boolean BPJ(int i) {
        return this.A01.BPJ(689639794);
    }

    public void BPM(int i, int i2, boolean z) {
        if (!A00(this)) {
            this.A01.BPM(i, i2, z);
        }
    }

    public void BPO(int i, boolean z) {
        if (!A00(this)) {
            this.A01.BPO(i, z);
        }
    }

    public void BsN(int i, int i2, String str) {
        if (!A00(this)) {
            this.A01.BsN(i, i2, str);
        }
    }

    public void BsO(int i, String str) {
        if (!A00(this)) {
            this.A01.BsO(i, str);
        }
    }

    public void markerEnd(int i, int i2, short s) {
        if (!A00(this)) {
            this.A01.markerEnd(i, i2, s);
        }
    }

    public void markerPoint(int i, int i2, String str) {
        if (!A00(this)) {
            this.A01.markerPoint(i, i2, str);
        }
    }

    public void markerStart(int i, String str, String str2) {
        if (!A00(this)) {
            this.A01.markerStart(i, str, str2);
        }
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        if (!A00(this)) {
            this.A01.markerStartWithCancelPolicy(i, z, i2, j, timeUnit);
        }
    }

    public void markerAnnotate(int i, int i2, String str, double d) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, i2, str, d);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int i3) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, i2, str, i3);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long j) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, i2, str, j);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String str2) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, i2, str, str2);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean z) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, i2, str, z);
        }
    }

    public void markerAnnotate(int i, int i2, String str, double[] dArr) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, i2, str, dArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int[] iArr) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, i2, str, iArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long[] jArr) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, i2, str, jArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String[] strArr) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, i2, str, strArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, i2, str, zArr);
        }
    }

    public void markerAnnotate(int i, String str, double d) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, str, d);
        }
    }

    public void markerAnnotate(int i, String str, int i2) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, str, i2);
        }
    }

    public void markerAnnotate(int i, String str, long j) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, str, j);
        }
    }

    public void markerAnnotate(int i, String str, String str2) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, str, str2);
        }
    }

    public void markerAnnotate(int i, String str, boolean z) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, str, z);
        }
    }

    public void markerAnnotate(int i, String str, double[] dArr) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, str, dArr);
        }
    }

    public void markerAnnotate(int i, String str, int[] iArr) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, str, iArr);
        }
    }

    public void markerAnnotate(int i, String str, long[] jArr) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, str, jArr);
        }
    }

    public void markerAnnotate(int i, String str, String[] strArr) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, str, strArr);
        }
    }

    public void markerAnnotate(int i, String str, boolean[] zArr) {
        if (!A00(this)) {
            this.A01.markerAnnotate(i, str, zArr);
        }
    }

    public void markerDrop(int i, int i2) {
        if (!A00(this)) {
            this.A01.markerDrop(i, i2);
        }
    }

    public void markerEnd(int i, short s) {
        if (!A00(this)) {
            this.A01.markerEnd(i, s);
        }
    }

    public void markerPoint(int i, String str) {
        if (!A00(this)) {
            this.A01.markerPoint(i, str);
        }
    }

    public void markerStart(int i, int i2) {
        if (!A00(this)) {
            this.A01.markerStart(i, i2);
        }
    }

    public void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        if (!A00(this)) {
            this.A01.markerEnd(i, i2, s, j, timeUnit);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        if (!A00(this)) {
            this.A01.markerPoint(i, i2, str, str2, j, timeUnit);
        }
    }

    public void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        if (!A00(this)) {
            this.A01.markerStart(i, i2, str, str2, j, timeUnit);
        }
    }

    public void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        if (!A00(this)) {
            this.A01.markerEnd(i, s, j, timeUnit);
        }
    }

    public void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        if (!A00(this)) {
            this.A01.markerPoint(i, str, j, timeUnit);
        }
    }

    public void markerStart(int i, int i2, String str, String str2) {
        if (!A00(this)) {
            this.A01.markerStart(i, i2, str, str2);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2) {
        if (!A00(this)) {
            this.A01.markerPoint(i, i2, str, str2);
        }
    }

    public void markerStart(int i) {
        if (!A00(this)) {
            this.A01.markerStart(i);
        }
    }

    public void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        if (!A00(this)) {
            this.A01.markerPoint(i, str, str2, j, timeUnit);
        }
    }

    public void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        if (!A00(this)) {
            this.A01.markerPoint(i, i2, str, j, timeUnit);
        }
    }

    public void markerPoint(int i, String str, String str2) {
        if (!A00(this)) {
            this.A01.markerPoint(i, str, str2);
        }
    }
}
