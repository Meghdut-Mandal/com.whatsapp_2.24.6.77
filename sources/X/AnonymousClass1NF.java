package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1NF  reason: invalid class name */
public class AnonymousClass1NF {
    public final C20810yC A00;
    public final C21690ze A01;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();

    public static boolean A00(AnonymousClass1NF r5, String str, int i) {
        ConcurrentHashMap concurrentHashMap = r5.A02;
        Number number = (Number) concurrentHashMap.get(str);
        if (!C20800yB.A01(C21000yV.A02, r5.A00, 620)) {
            return false;
        }
        if (number != null && number.intValue() == i) {
            return false;
        }
        r5.A01.markerStart(i, str.hashCode());
        concurrentHashMap.put(str, Integer.valueOf(i));
        return true;
    }

    public void A01(String str) {
        Number number = (Number) this.A02.remove(str);
        if (number != null) {
            this.A01.BPH(number.intValue(), str.hashCode(), 213, "start_foreground_service");
        }
    }

    public void A02(String str, int i, boolean z, boolean z2) {
        Number number = (Number) this.A02.get(str);
        if (number != null) {
            C21690ze r3 = this.A01;
            int intValue = number.intValue();
            int hashCode = str.hashCode();
            r3.markerAnnotate(intValue, hashCode, "is_video_call", z);
            r3.markerAnnotate(intValue, hashCode, "peer_participants_count", i);
            r3.markerAnnotate(intValue, hashCode, "is_rejoin", z2);
        }
    }

    public void A03(String str, String str2) {
        Number number = (Number) this.A02.get(str);
        if (number != null) {
            this.A01.markerPoint(number.intValue(), str.hashCode(), str2);
        }
    }

    public void A04(String str, short s) {
        Number number = (Number) this.A02.remove(str);
        if (number != null) {
            this.A01.markerEnd(number.intValue(), str.hashCode(), s);
        }
    }

    public AnonymousClass1NF(C20810yC r2, C21690ze r3) {
        this.A01 = r3;
        this.A00 = r2;
    }
}
