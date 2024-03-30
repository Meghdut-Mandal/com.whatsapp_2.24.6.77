package X;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0xL  reason: invalid class name and case insensitive filesystem */
public class C20300xL extends C19580wB implements AnonymousClass00M {
    public long A00 = 0;
    public boolean A01;
    public boolean A02;
    public C121865tq[] A03;
    public long A04 = 0;
    public final C19460v5 A05;
    public final AnonymousClass17Y A06;
    public final C19730wQ A07;
    public final AnonymousClass1VR A08;
    public final C19420v0 A09;
    public final AnonymousClass189 A0A;
    public final AnonymousClass187 A0B;
    public final AnonymousClass18I A0C;
    public final AnonymousClass19A A0D;
    public final C24111Bd A0E = new C24111Bd(10, 610);
    public final C19770wU A0F;
    public final C19460v5 A0G;
    public final C19460v5 A0H;
    public final AnonymousClass19J A0I;
    public final C19970wo A0J;

    public static synchronized void A00(C20300xL r1) {
        synchronized (r1) {
            if (r1.A02) {
                r1.A02 = false;
                r1.A0E.A02();
            }
        }
    }

    public static synchronized void A01(C20300xL r1, long j) {
        synchronized (r1) {
            r1.A04 = j;
        }
    }

    public synchronized void A05() {
        this.A00 = 0;
    }

    public synchronized void A06() {
        if (this.A0I.A06) {
            long j = this.A00;
            if (j == 0 || SystemClock.uptimeMillis() - j > 60000) {
                this.A0D.A0J(Message.obtain((Handler) null, 0, 88, 0));
                this.A00 = SystemClock.uptimeMillis();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MyPreKeysManager/send-get-pre-key-digest/skip-digest-check last:");
        sb.append(this.A00);
        Log.i(sb.toString());
    }

    public synchronized void A07() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.A0I.A06) {
            long j = this.A04;
            if (j == 0 || uptimeMillis - j > 180000) {
                A01(this, uptimeMillis);
                A02(this, true);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MyPreKeysManager/sendSetPreKey/skip last:");
        sb.append(this.A04);
        Log.i(sb.toString());
    }

    public static void A02(C20300xL r19, boolean z) {
        C593633q r7;
        C20300xL r14 = r19;
        AnonymousClass79X A072 = r14.A0C.A07();
        try {
            AnonymousClass189 r3 = r14.A0A;
            int A032 = r3.A07.A03();
            byte[] A0c = r3.A0c();
            AnonymousClass79X A073 = r3.A0K.A07();
            try {
                ArrayList A012 = r3.A00.A02.A03.A01();
                ArrayList arrayList = new ArrayList();
                Iterator it = A012.iterator();
                while (it.hasNext()) {
                    r7 = (C593633q) it.next();
                    int i = r7.A00;
                    byte[] A002 = new C198539dj(r7.A01).A00().A01.A00();
                    int length = A002.length - 1;
                    byte[] bArr = new byte[length];
                    System.arraycopy(A002, 1, bArr, 0, length);
                    arrayList.add(new C121865tq(C203239na.A03(i), bArr, (byte[]) null));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("axolotl reporting back ");
                sb.append(arrayList.size());
                sb.append(" prekeys for sending to the server");
                Log.i(sb.toString());
                C121865tq[] r1 = (C121865tq[]) arrayList.toArray(new C121865tq[0]);
                if (A073 != null) {
                    A073.close();
                }
                C121865tq A0G2 = r3.A0G();
                r14.A06.A0H(new C35441ih(r14, A0c, C203239na.A02(A032), r1, A0G2, 0, z));
                if (A072 != null) {
                    A072.close();
                }
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("error reading prekey ");
                sb2.append(r7.A00);
                Log.e(sb2.toString(), e);
            } catch (Throwable th) {
                if (A073 != null) {
                    A073.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (A072 != null) {
                try {
                    A072.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
            throw th2;
        }
    }

    public void A03() {
        AnonymousClass79X A072 = this.A0C.A07();
        try {
            this.A0A.A0O();
            A07();
            if (A072 != null) {
                A072.close();
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A04() {
        if (this.A09.A2Q()) {
            AnonymousClass187 r2 = this.A0B;
            r2.A00.submit(new C35641j1((Object) this, 41)).get();
        }
    }

    public C20300xL(C19460v5 r6, C19460v5 r7, C19460v5 r8, AnonymousClass17Y r9, C19730wQ r10, AnonymousClass19J r11, AnonymousClass1VR r12, C19970wo r13, C19420v0 r14, AnonymousClass189 r15, AnonymousClass187 r16, AnonymousClass18I r17, AnonymousClass19A r18, C19770wU r19) {
        this.A0J = r13;
        this.A06 = r9;
        this.A07 = r10;
        this.A0F = r19;
        this.A0C = r17;
        this.A0D = r18;
        this.A0B = r16;
        this.A0I = r11;
        this.A0A = r15;
        this.A09 = r14;
        this.A0G = r6;
        this.A05 = r7;
        this.A08 = r12;
        this.A0H = r8;
    }

    public /* bridge */ /* synthetic */ void A08(C22819AwU awU) {
        super.registerObserver(awU);
    }

    public /* bridge */ /* synthetic */ void A09(C22819AwU awU) {
        super.unregisterObserver(awU);
    }
}
