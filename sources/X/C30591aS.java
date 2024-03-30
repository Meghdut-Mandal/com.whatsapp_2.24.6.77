package X;

import com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker;
import com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1aS  reason: invalid class name and case insensitive filesystem */
public class C30591aS {
    public final C19730wQ A00;
    public final AnonymousClass164 A01;
    public final C25911Id A02;
    public final C30621aV A03 = new C30621aV();
    public final AnonymousClass196 A04;
    public final C19980wp A05;
    public final C19970wo A06;
    public final C19630wG A07;
    public final C220712t A08;
    public final C30601aT A09;
    public final AnonymousClass1DL A0A;
    public final C19770wU A0B;
    public final C21570zS A0C;

    public static JSONObject A00(int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sync_type", i);
            jSONObject.put("chunk_order", i2);
            return jSONObject;
        } catch (JSONException unused) {
            Log.e("ReceiveHistorySyncManager/ Could not update history sync companion state");
            return null;
        }
    }

    public void A01(AnonymousClass5J9 r10) {
        long j;
        if (this.A09.A01() != null) {
            if (r10 != null) {
                j = r10.A1Q;
            } else {
                j = 0;
            }
            Integer num = C023109s.A01;
            C97384pE r6 = new C97384pE(HistorySyncCompanionWorker.class);
            r6.A04(C023109s.A00);
            AnonymousClass6EH r3 = new AnonymousClass6EH();
            r3.A00.put("loggableStanzaId", Long.valueOf(j));
            r6.A00.A0A = r3.A00();
            ((AnonymousClass6VR) this.A0C.get()).A07((C97404pG) r6.A00(), num, "com.whatsapp.sync.historySyncCompanion");
        } else if (r10 != null) {
            this.A0A.A08(r10);
        }
    }

    public void A02(C130576Lp r11, long j, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("ReceiveHistorySyncManager/ failed to process syncType=");
        int i = r11.A01;
        sb.append(i);
        sb.append(" chunkOrder=");
        int i2 = r11.A00;
        sb.append(i2);
        Log.e(sb.toString());
        if (z) {
            String str = r11.A08;
            C19730wQ r0 = this.A00;
            r0.A0G();
            AnonymousClass5J9 r7 = new AnonymousClass5J9(new C64933Qa(r0.A03, str, true), 1);
            if (j > 0) {
                r7.A1Q = j;
            }
            byte[] bArr = r11.A0A;
            if (bArr != null) {
                r7.A0J = bArr;
            }
            byte[] bArr2 = r7.A0J;
            if (bArr2 == null) {
                Log.e("ReceiveHistorySyncManager/ missing media key");
            } else {
                this.A01.A01(new SendMediaErrorReceiptJob((AnonymousClass11F) null, r7, "peer", bArr2));
            }
        } else {
            C19980wp.A00(this.A05).edit().putBoolean("HAS_COMPANION_HISTORY_SYNC_FAILED", true).apply();
            C30621aV r2 = this.A03;
            synchronized (r2) {
                C119495pu r02 = r2.A00;
                if (r02 != null) {
                    r02.A01.A0C(false);
                }
            }
        }
        C25911Id r72 = this.A02;
        long j2 = r11.A02;
        long j3 = r11.A03;
        AnonymousClass2SR r22 = new AnonymousClass2SR();
        r22.A02 = 2;
        r22.A0A = C25911Id.A00(r72);
        r22.A00 = AnonymousClass1AB.A01(i);
        r22.A01 = AnonymousClass1AB.A00(i);
        long A002 = C19970wo.A00(r72.A01);
        r22.A09 = Long.valueOf(A002);
        r22.A06 = Long.valueOf(A002 - j3);
        r22.A05 = Long.valueOf(j2);
        C20060wx r1 = r72.A02;
        long A042 = r1.A04();
        r22.A07 = Long.valueOf(A042);
        r22.A08 = Long.valueOf(A042 - r1.A02());
        r22.A03 = Long.valueOf((long) i2);
        r72.A03.Bly(r22);
        this.A09.A02(r11.A08);
    }

    public C30591aS(C19730wQ r2, AnonymousClass164 r3, C25911Id r4, AnonymousClass196 r5, C19980wp r6, C19970wo r7, C19630wG r8, C220712t r9, C30601aT r10, AnonymousClass1DL r11, C19770wU r12, C21570zS r13) {
        this.A06 = r7;
        this.A00 = r2;
        this.A07 = r8;
        this.A0B = r12;
        this.A08 = r9;
        this.A04 = r5;
        this.A01 = r3;
        this.A0A = r11;
        this.A0C = r13;
        this.A02 = r4;
        this.A09 = r10;
        this.A05 = r6;
    }
}
