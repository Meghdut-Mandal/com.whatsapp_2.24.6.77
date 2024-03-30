package X;

import com.whatsapp.util.Log;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Xj  reason: invalid class name and case insensitive filesystem */
public class C29631Xj {
    public final C19970wo A00;
    public final C29671Xn A01;
    public final AnonymousClass1D5 A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final C19420v0 A04;
    public final AnonymousClass1A3 A05;
    public final C20810yC A06;
    public final C29641Xk A07;
    public final AnonymousClass1A1 A08;
    public final C19770wU A09;

    public static void A00(C29631Xj r12, LinkedList linkedList, Random random) {
        int size;
        C124935z2 A032;
        StringBuilder sb = new StringBuilder();
        sb.append("ThumbnailAutoDownload/enqueueThumbnailAutodownloadsToRetry num remaining:");
        sb.append(linkedList.size());
        Log.i(sb.toString());
        int i = 0;
        while (!linkedList.isEmpty()) {
            C29641Xk r6 = r12.A07;
            C29651Xl r2 = r6.A0B;
            synchronized (r2) {
                size = r2.A01.size();
            }
            if (i >= 20 || size - i > 5) {
                linkedList.size();
                r12.A09.BpM(new C35631j0(r12, linkedList, random, 33), "ThumbnailAutoDownload/enqueue", (long) (random.nextInt(5000) + 5000));
                return;
            }
            AnonymousClass3T1 A012 = r12.A08.A01.A01(((Number) linkedList.pop()).longValue());
            if (A012 != null && !A012.A1J.A02 && r12.A01(A012)) {
                if (A012 instanceof AnonymousClass2bU) {
                    C65013Qj r0 = ((AnonymousClass2bU) A012).A01;
                    C18740tg.A06(r0);
                    String str = r0.A0L;
                    if (!(str == null || (A032 = r12.A02.A0H.A03(str, 3)) == null)) {
                        long A002 = C19970wo.A00(r12.A00);
                        long j = A032.A06;
                        long j2 = A002 - j;
                        if (j2 < 86400000 && j2 < (j - A032.A0C) * 2) {
                        }
                    }
                }
                r6.A01(A012, 1);
                i++;
            }
        }
        r12.A03.set(false);
    }

    private boolean A01(AnonymousClass3T1 r5) {
        if (r5.A0a == null) {
            return false;
        }
        C20810yC r2 = this.A06;
        if ((!C20800yB.A01(C21000yV.A02, r2, 250) || !(r5 instanceof C46972by)) && !C54752tS.A00(this.A00, this.A04, r2, r5) && !(r5 instanceof AnonymousClass2bV) && !C203369nr.A08(r5)) {
            return false;
        }
        return true;
    }

    public C29631Xj(C19970wo r3, C19420v0 r4, AnonymousClass1A3 r5, C29671Xn r6, C20810yC r7, AnonymousClass1D5 r8, C29641Xk r9, AnonymousClass1A1 r10, C19770wU r11) {
        this.A00 = r3;
        this.A06 = r7;
        this.A09 = r11;
        this.A02 = r8;
        this.A08 = r10;
        this.A05 = r5;
        this.A04 = r4;
        this.A07 = r9;
        this.A01 = r6;
    }

    public void A02(AnonymousClass3T1 r3) {
        if (A01(r3)) {
            this.A07.A01(r3, 1);
        }
    }
}
