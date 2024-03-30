package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9iZ  reason: invalid class name and case insensitive filesystem */
public class C200979iZ {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final long A0C;
    public final boolean A0D;

    public C200979iZ(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z) {
        this.A01 = j;
        this.A00 = j2;
        this.A05 = j3;
        this.A04 = j4;
        this.A07 = j5;
        this.A02 = j6;
        this.A03 = j7;
        this.A06 = j8;
        this.A08 = j9;
        this.A0C = j10;
        this.A0A = i;
        this.A0B = i2;
        this.A09 = i3;
        this.A0D = z;
    }

    public static C200979iZ A00(String str) {
        try {
            JSONObject A1C = C36441kJ.A1C(str);
            return new C200979iZ(A1C.optInt("mediaType"), A1C.optInt("transferRadio"), A1C.optInt("mediaTransferOrigin"), A1C.optLong("bytesSent"), A1C.optLong("bytesReceived"), A1C.optLong("countMessageSent"), A1C.optLong("countMessageReceived"), A1C.optLong("countUploaded"), A1C.optLong("countDownloaded"), A1C.optLong("countForward"), A1C.optLong("countShared"), A1C.optLong("countViewed"), A1C.optLong("transferDate"), A1C.optBoolean("isAutoDownload"));
        } catch (JSONException e) {
            e.getMessage();
            return null;
        }
    }

    public C200979iZ(int i, int i2, int i3, long j, boolean z) {
        this.A0C = j;
        this.A0A = i;
        this.A0B = i2;
        this.A09 = i3;
        this.A0D = z;
    }
}
