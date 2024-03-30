package X;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0zE  reason: invalid class name and case insensitive filesystem */
public interface C21430zE {
    void B6V(int i, short s);

    Collection B8X();

    boolean BJs();

    boolean BMN(int i);

    void BPD(AnonymousClass4TY r1, int i);

    void BPH(int i, int i2, short s, String str);

    void BPI(String str, int i, short s);

    boolean BPJ(int i);

    void BPM(int i, int i2, boolean z);

    void BPN(int i, String str, String str2, long j, TimeUnit timeUnit);

    void BPO(int i, boolean z);

    void BPP(String str, String str2, int i, int i2, boolean z);

    Long BlL();

    Integer BlM();

    String Bli();

    void BpN();

    void BsN(int i, int i2, String str);

    void BsO(int i, String str);

    void Bxa();

    long currentMonotonicTimestampNanos();

    void endAllInstancesOfMarker(int i, short s);

    void endAllMarkers(short s, boolean z);

    boolean isMarkerOn(int i, int i2);

    void markerAnnotate(int i, int i2, String str, double d);

    void markerAnnotate(int i, int i2, String str, int i3);

    void markerAnnotate(int i, int i2, String str, long j);

    void markerAnnotate(int i, int i2, String str, String str2);

    void markerAnnotate(int i, int i2, String str, boolean z);

    void markerAnnotate(int i, int i2, String str, double[] dArr);

    void markerAnnotate(int i, int i2, String str, int[] iArr);

    void markerAnnotate(int i, int i2, String str, long[] jArr);

    void markerAnnotate(int i, int i2, String str, String[] strArr);

    void markerAnnotate(int i, int i2, String str, boolean[] zArr);

    void markerAnnotate(int i, String str, double d);

    void markerAnnotate(int i, String str, int i2);

    void markerAnnotate(int i, String str, long j);

    void markerAnnotate(int i, String str, String str2);

    void markerAnnotate(int i, String str, boolean z);

    void markerAnnotate(int i, String str, double[] dArr);

    void markerAnnotate(int i, String str, int[] iArr);

    void markerAnnotate(int i, String str, long[] jArr);

    void markerAnnotate(int i, String str, String[] strArr);

    void markerAnnotate(int i, String str, boolean[] zArr);

    void markerDrop(int i);

    void markerDrop(int i, int i2);

    void markerEnd(int i, int i2, short s);

    void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit);

    void markerEnd(int i, short s);

    void markerEnd(int i, short s, long j, TimeUnit timeUnit);

    void markerPoint(int i, int i2, String str);

    void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit);

    void markerPoint(int i, int i2, String str, String str2);

    void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit);

    void markerPoint(int i, String str);

    void markerPoint(int i, String str, long j, TimeUnit timeUnit);

    void markerPoint(int i, String str, String str2);

    void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit);

    void markerStart(int i);

    void markerStart(int i, int i2);

    void markerStart(int i, int i2, String str, String str2);

    void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit);

    void markerStart(int i, String str, String str2);

    void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit);
}
