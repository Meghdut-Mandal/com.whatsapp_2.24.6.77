package X;

import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6F3  reason: invalid class name */
public class AnonymousClass6F3 {
    public final long A00;
    public final long A01;
    public final TimeUnit A02;

    public boolean A01(long j, TimeUnit timeUnit) {
        if (j < 0) {
            return false;
        }
        long j2 = this.A01;
        TimeUnit timeUnit2 = this.A02;
        return (j >= timeUnit.convert(j2, timeUnit2) && j <= timeUnit.convert(this.A00, timeUnit2)) || (timeUnit.convert(this.A00, timeUnit2) < 0 && j >= timeUnit.convert(j2, timeUnit2));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass6F3 r10 = (AnonymousClass6F3) obj;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j = this.A01;
            TimeUnit timeUnit2 = this.A02;
            long convert = timeUnit.convert(j, timeUnit2);
            long j2 = r10.A01;
            TimeUnit timeUnit3 = r10.A02;
            if (!(convert == timeUnit.convert(j2, timeUnit3) && timeUnit.convert(this.A00, timeUnit2) == timeUnit.convert(r10.A00, timeUnit3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r5 < r7) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6F3(java.util.concurrent.TimeUnit r4, long r5, long r7) {
        /*
            r3 = this;
            r3.<init>()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0012
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0012
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L_0x0013
        L_0x0012:
            r2 = 1
        L_0x0013:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "startTime: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " endTime: "
            java.lang.String r0 = X.C36381kD.A0z(r0, r1, r7)
            X.AnonymousClass0YM.A03(r2, r0)
            r3.A01 = r5
            r3.A00 = r7
            r3.A02 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6F3.<init>(java.util.concurrent.TimeUnit, long, long):void");
    }

    public JSONObject A00() {
        String str;
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("mStartTime", this.A01);
        A1B.put("mEndTime", this.A00);
        switch (C90524aI.A03(this.A02, C112905ee.A00)) {
            case 1:
                str = "DAYS";
                break;
            case 2:
                str = "HOURS";
                break;
            case 3:
                str = "MINUTES";
                break;
            case 4:
                str = "SECONDS";
                break;
            case 5:
                str = "NANOSECONDS";
                break;
            case 6:
                str = "MICROSECONDS";
                break;
            case 7:
                str = "MILLISECONDS";
                break;
            default:
                str = "";
                break;
        }
        A1B.put("mTimeUnit", str);
        return A1B;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        C90474aD.A1S(A1Q, this.A01);
        C36421kH.A1P(A1Q, this.A00);
        return C90484aE.A0D(this.A02, A1Q);
    }

    public String toString() {
        try {
            return A00().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
