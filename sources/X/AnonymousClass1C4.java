package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob;
import com.whatsapp.util.Log;

/* renamed from: X.1C4  reason: invalid class name */
public class AnonymousClass1C4 {
    public final AnonymousClass164 A00;
    public final AnonymousClass19J A01;
    public final AnonymousClass19A A02;
    public final AnonymousClass1CM A03;
    public final C19700wN A04;
    public final C20810yC A05;
    public final AnonymousClass1C5 A06;
    public final AnonymousClass19L A07;

    public void A00() {
        this.A02.A0J(C203429o0.A01());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
        if ("played".equals(r4) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C207209uj r12) {
        /*
            r11 = this;
            X.19L r0 = r11.A07
            long r8 = r12.A00
            r0.A03(r8)
            java.lang.String r5 = r12.A05
            java.lang.String r0 = "receipt"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0071
            java.lang.String r4 = r12.A08
            java.lang.String r0 = "read"
            boolean r3 = r0.equals(r4)
            X.1CM r0 = r11.A03
            X.0yC r2 = r0.A00
            r1 = 361(0x169, float:5.06E-43)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = "played"
            boolean r1 = r0.equals(r4)
            r0 = 1
            if (r1 != 0) goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r3 != 0) goto L_0x0035
            if (r0 == 0) goto L_0x0071
        L_0x0035:
            X.0yC r4 = r11.A05
            X.0wN r3 = r11.A04
            X.1C5 r1 = r11.A06
            com.whatsapp.jid.Jid r0 = r12.A02
            X.11F r0 = X.AnonymousClass143.A00(r0)
            boolean r0 = r1.A04(r0)
            r1 = r0 ^ 1
            boolean r10 = r12.A04()
            java.lang.String r6 = r12.A03()
            java.lang.String r7 = r12.A07
            X.C203429o0.A0B(r3, r4, r5, r6, r7, r8, r10)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "stanzaKey"
            r3.putParcelable(r0, r12)
            java.lang.String r0 = "disable"
            r3.putBoolean(r0, r1)
            r2 = 0
            r1 = 0
            r0 = 96
            android.os.Message r0 = android.os.Message.obtain(r2, r1, r0, r1, r3)
            X.19A r2 = r11.A02
        L_0x006d:
            r2.A0J(r0)
            return
        L_0x0071:
            X.19A r2 = r11.A02
            X.0yC r1 = r11.A05
            X.0wN r0 = r11.A04
            android.os.Message r0 = X.C203429o0.A02(r0, r1, r12)
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1C4.A01(X.9uj):void");
    }

    public void A02(AnonymousClass2bU r5) {
        C65013Qj r0;
        byte[] bArr;
        C64933Qa r1 = r5.A1J;
        if (!r1.A02 && !(r1.A00 instanceof C177548dy) && (r0 = r5.A01) != null && (bArr = r0.A0a) != null) {
            AnonymousClass164 r2 = this.A00;
            C18740tg.A06(r0);
            C18740tg.A06(bArr);
            r2.A01(new SendMediaErrorReceiptJob((AnonymousClass11F) null, r5, (String) null, bArr));
        }
    }

    public void A03(String str, Long l) {
        Log.i("sendmethods/sendClearDirty");
        AnonymousClass19A r5 = this.A02;
        Message obtain = Message.obtain((Handler) null, 0, 18, 0);
        obtain.getData().putString("category", str);
        if (l != null) {
            obtain.getData().putLong("timestamp", l.longValue());
        }
        r5.A0J(obtain);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if ((r3 instanceof X.C28981Uw) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(java.util.Set r10, boolean r11) {
        /*
            r9 = this;
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r8 = r10.iterator()
        L_0x0009:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r7 = r8.next()
            X.3T1 r7 = (X.AnonymousClass3T1) r7
            X.3Qa r6 = r7.A1J
            X.11F r3 = r6.A00
            X.11F r2 = r7.A0J()
            boolean r0 = r7 instanceof X.AnonymousClass2bM
            if (r0 != 0) goto L_0x0026
            boolean r1 = r3 instanceof X.C28981Uw
            r0 = 0
            if (r1 == 0) goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            X.3PO r5 = new X.3PO
            r5.<init>(r3, r2, r0)
            boolean r0 = r4.containsKey(r5)
            if (r0 == 0) goto L_0x004c
            java.lang.Object r3 = r4.get(r5)
            java.util.List r3 = (java.util.List) r3
            java.util.Objects.requireNonNull(r3)
            long r0 = r7.A1N
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r6.A01
            X.9U0 r0 = new X.9U0
            r0.<init>(r2, r1)
            r3.add(r0)
            goto L_0x0009
        L_0x004c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            long r0 = r7.A1N
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r6.A01
            X.9U0 r0 = new X.9U0
            r0.<init>(r2, r1)
            r3.add(r0)
            r4.put(r5, r3)
            goto L_0x0009
        L_0x0065:
            java.util.HashSet r0 = X.AnonymousClass1CM.A00(r4)
            java.util.Iterator r3 = r0.iterator()
        L_0x006d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r2 = r3.next()
            X.9Rs r2 = (X.C194909Rs) r2
            X.164 r1 = r9.A00
            com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2 r0 = new com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2
            r0.<init>(r2, r11)
            r1.A01(r0)
            goto L_0x006d
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1C4.A04(java.util.Set, boolean):void");
    }

    public void A05(boolean z) {
        Log.i("sendmethods/sendGetServerProps");
        AnonymousClass19A r4 = this.A02;
        Bundle bundle = new Bundle();
        bundle.putBoolean("forceRefresh", z);
        r4.A0J(Message.obtain((Handler) null, 0, 21, 0, bundle));
    }

    public boolean A06(String str, String str2) {
        return this.A02.A0J(Message.obtain((Handler) null, 0, 36, 0, new C192599Hu(str, str2)));
    }

    public AnonymousClass1C4(C19700wN r1, AnonymousClass164 r2, AnonymousClass19J r3, C20810yC r4, AnonymousClass19A r5, AnonymousClass1CM r6, AnonymousClass1C5 r7, AnonymousClass19L r8) {
        this.A05 = r4;
        this.A04 = r1;
        this.A00 = r2;
        this.A02 = r5;
        this.A06 = r7;
        this.A01 = r3;
        this.A03 = r6;
        this.A07 = r8;
    }
}
