package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.3wA  reason: invalid class name and case insensitive filesystem */
public class C80913wA implements Runnable {
    public AnonymousClass31S A00;
    public final String A01;
    public final Set A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final C220412q A06;
    public final C20310xM A07;
    public final AnonymousClass17U A08;
    public final AnonymousClass11F A09;
    public final AnonymousClass1SL A0A;
    public final AnonymousClass1A1 A0B;
    public final List A0C;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081 A[Catch:{ all -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ef A[Catch:{ all -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010c A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r7 = 0
            r6 = r17
            java.lang.String r0 = "messagesViewModel/more-messages/loading/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0114 }
            X.0xM r8 = r6.A07     // Catch:{ all -> 0x0114 }
            X.11F r5 = r6.A09     // Catch:{ all -> 0x0114 }
            long r0 = r6.A04     // Catch:{ all -> 0x0114 }
            r4 = 100
            long r2 = r6.A03     // Catch:{ all -> 0x0114 }
            X.17T r9 = r8.A0j     // Catch:{ all -> 0x0114 }
            r11 = 100
            r10 = r5
            r12 = r0
            r14 = r2
            long r11 = r9.A05(r10, r11, r12, r14)     // Catch:{ all -> 0x0114 }
            r10 = 100
            r9 = r5
            r13 = r2
            X.36f r8 = r8.A0S(r9, r10, r11, r13)     // Catch:{ all -> 0x0114 }
            android.database.Cursor r3 = r8.A00     // Catch:{ all -> 0x0114 }
            if (r3 == 0) goto L_0x007b
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x007b
            r3.getCount()     // Catch:{ all -> 0x0114 }
            X.17U r2 = r6.A08     // Catch:{ all -> 0x0114 }
            long r0 = r8.A02     // Catch:{ all -> 0x0114 }
            boolean r9 = r2.A07(r5, r0)     // Catch:{ all -> 0x0114 }
            X.1A1 r0 = r6.A0B     // Catch:{ all -> 0x0114 }
            X.3T1 r13 = r0.A01(r3, r5)     // Catch:{ all -> 0x0114 }
            if (r13 == 0) goto L_0x007c
            java.util.List r12 = r6.A0C     // Catch:{ all -> 0x0114 }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x0114 }
            if (r0 != 0) goto L_0x007c
            java.util.ArrayList r11 = X.C36361kB.A0r(r12)     // Catch:{ all -> 0x0114 }
            java.util.Iterator r16 = r12.iterator()     // Catch:{ all -> 0x0114 }
        L_0x0052:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x0070
            X.3T1 r10 = X.C36391kE.A0l(r16)     // Catch:{ all -> 0x0114 }
            long r0 = r10.A1N     // Catch:{ all -> 0x0114 }
            r14 = 0
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x0052
            long r2 = r10.A1O     // Catch:{ all -> 0x0114 }
            long r0 = r13.A1O     // Catch:{ all -> 0x0114 }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 > 0) goto L_0x0052
            r11.add(r10)     // Catch:{ all -> 0x0114 }
            goto L_0x0052
        L_0x0070:
            r12.removeAll(r11)     // Catch:{ all -> 0x0114 }
            int r0 = r11.size()     // Catch:{ all -> 0x0114 }
            r11 = 1
            if (r0 != 0) goto L_0x007d
            goto L_0x007c
        L_0x007b:
            r9 = 0
        L_0x007c:
            r11 = 0
        L_0x007d:
            X.31S r1 = r6.A00     // Catch:{ all -> 0x0114 }
            if (r1 == 0) goto L_0x00eb
            X.12q r0 = r6.A06     // Catch:{ all -> 0x0114 }
            X.3Qp r0 = X.C36351kA.A0Z(r0, r5)     // Catch:{ all -> 0x0114 }
            if (r0 != 0) goto L_0x008b
            r0 = 0
            goto L_0x008d
        L_0x008b:
            int r0 = r0.A03     // Catch:{ all -> 0x0114 }
        L_0x008d:
            X.3GH r10 = new X.3GH     // Catch:{ all -> 0x0114 }
            r10.<init>(r8, r0, r9)     // Catch:{ all -> 0x0114 }
            X.1uh r8 = r1.A00     // Catch:{ all -> 0x0114 }
            boolean r0 = r10.A02     // Catch:{ all -> 0x0114 }
            r8.A0L = r0     // Catch:{ all -> 0x0114 }
            int r0 = r10.A00     // Catch:{ all -> 0x0114 }
            r8.A01 = r0     // Catch:{ all -> 0x0114 }
            X.36f r9 = r10.A01     // Catch:{ all -> 0x0114 }
            android.os.Handler r1 = X.C36341k9.A0H()     // Catch:{ all -> 0x0114 }
            X.3wc r0 = new X.3wc     // Catch:{ all -> 0x0114 }
            r0.<init>(r8, r9, r7)     // Catch:{ all -> 0x0114 }
            r1.post(r0)     // Catch:{ all -> 0x0114 }
            long r2 = r9.A02     // Catch:{ all -> 0x0114 }
            X.C40061uh.A0B(r8, r2)     // Catch:{ all -> 0x0114 }
            long r0 = r9.A01     // Catch:{ all -> 0x0114 }
            r8.A0V(r0)     // Catch:{ all -> 0x0114 }
            r8.A0W(r2)     // Catch:{ all -> 0x0114 }
            X.00s r0 = r8.A0V     // Catch:{ all -> 0x0114 }
            r0.A0C(r10)     // Catch:{ all -> 0x0114 }
            if (r11 == 0) goto L_0x00e0
            X.3Eu r1 = new X.3Eu     // Catch:{ all -> 0x0114 }
            r1.<init>()     // Catch:{ all -> 0x0114 }
            java.util.List r0 = r8.A1E     // Catch:{ all -> 0x0114 }
            X.1Ak r0 = X.C23931Ak.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x0114 }
            r1.A00 = r0     // Catch:{ all -> 0x0114 }
            r0 = 1
            r1.A06 = r0     // Catch:{ all -> 0x0114 }
            X.3Gt r3 = r1.A00()     // Catch:{ all -> 0x0114 }
            android.os.Handler r2 = X.C36341k9.A0H()     // Catch:{ all -> 0x0114 }
            r1 = 49
            X.3v9 r0 = new X.3v9     // Catch:{ all -> 0x0114 }
            r0.<init>(r8, r3, r1)     // Catch:{ all -> 0x0114 }
            r2.post(r0)     // Catch:{ all -> 0x0114 }
        L_0x00e0:
            android.os.Handler r2 = r8.A0Q     // Catch:{ all -> 0x0114 }
            r1 = 1
            X.3wU r0 = new X.3wU     // Catch:{ all -> 0x0114 }
            r0.<init>((java.lang.Object) r8, (int) r1)     // Catch:{ all -> 0x0114 }
            r2.post(r0)     // Catch:{ all -> 0x0114 }
        L_0x00eb:
            boolean r0 = r5 instanceof X.C28981Uw     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x0102
            X.1SL r2 = r6.A0A     // Catch:{ all -> 0x0114 }
            X.1Uw r5 = (X.C28981Uw) r5     // Catch:{ all -> 0x0114 }
            long r0 = r6.A05     // Catch:{ all -> 0x0114 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0114 }
            X.4Zz r0 = new X.4Zz     // Catch:{ all -> 0x0114 }
            r0.<init>(r6, r7)     // Catch:{ all -> 0x0114 }
            r2.A05(r5, r0, r1, r4)     // Catch:{ all -> 0x0114 }
            r7 = 1
        L_0x0102:
            java.lang.String r0 = "messagesViewModel/more-messages/loading/end"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0114 }
            r0 = 0
            r6.A00 = r0     // Catch:{ all -> 0x0114 }
            if (r7 != 0) goto L_0x0113
            java.util.Set r1 = r6.A02
            java.lang.String r0 = r6.A01
            r1.remove(r0)
        L_0x0113:
            return
        L_0x0114:
            r2 = move-exception
            if (r7 != 0) goto L_0x011e
            java.util.Set r1 = r6.A02
            java.lang.String r0 = r6.A01
            r1.remove(r0)
        L_0x011e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80913wA.run():void");
    }

    public C80913wA(AnonymousClass31S r1, C220412q r2, C20310xM r3, AnonymousClass17U r4, AnonymousClass11F r5, AnonymousClass1SL r6, AnonymousClass1A1 r7, String str, List list, Set set, long j, long j2, long j3) {
        this.A03 = j;
        this.A01 = str;
        this.A07 = r3;
        this.A0B = r7;
        this.A09 = r5;
        this.A04 = j2;
        this.A05 = j3;
        this.A06 = r2;
        this.A08 = r4;
        this.A0A = r6;
        this.A02 = set;
        this.A0C = list;
        this.A00 = r1;
    }
}
