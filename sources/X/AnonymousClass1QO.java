package X;

import android.os.SystemClock;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1QO  reason: invalid class name */
public class AnonymousClass1QO {
    public final C002000v A00 = new C002000v(250);
    public final C19460v5 A01;
    public final AnonymousClass1FN A02;
    public final AnonymousClass1QP A03;
    public final AnonymousClass1A1 A04;
    public final Set A05 = new HashSet();
    public final C19460v5 A06;
    public final C19970wo A07;
    public final AnonymousClass12g A08;
    public final C25151Fe A09;
    public final AnonymousClass12P A0A;

    public void A02(AnonymousClass3T1 r6, Set set) {
        AnonymousClass1FJ r4;
        this.A09.A07(r6, set);
        AnonymousClass1FN r1 = this.A02;
        if (r6 instanceof AnonymousClass2bM) {
            r4 = r1.A00;
        } else {
            r4 = r1.A01;
        }
        set.size();
        r4.A00.A05(Long.valueOf(r6.A1N));
        r4.A05(r6, set, true);
    }

    public AnonymousClass1QO(C19460v5 r3, C19460v5 r4, C19970wo r5, AnonymousClass12g r6, C25151Fe r7, AnonymousClass12P r8, AnonymousClass1FN r9, AnonymousClass1QP r10, AnonymousClass1A1 r11) {
        this.A07 = r5;
        this.A04 = r11;
        this.A03 = r10;
        this.A08 = r6;
        this.A0A = r8;
        this.A01 = r3;
        this.A02 = r9;
        this.A09 = r7;
        this.A06 = r4;
    }

    public AnonymousClass3CY A00(AnonymousClass3T1 r9) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C64933Qa r5 = r9.A1J;
        C002000v r3 = this.A00;
        AnonymousClass3CY r0 = (AnonymousClass3CY) r3.A04(r5);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3CY A002 = this.A03.A00(r9.A1N);
        r3.A08(r5, A002);
        this.A08.A01("ReceiptManager/getMessageReceipts", SystemClock.uptimeMillis() - uptimeMillis);
        return A002;
    }

    public void A01(AnonymousClass3T1 r15) {
        C1495671s B1k;
        long uptimeMillis = SystemClock.uptimeMillis();
        AnonymousClass1M0 A052 = this.A0A.A05();
        try {
            C1495671s B1k2 = A052.B1k();
            try {
                AnonymousClass1QP r9 = this.A03;
                long j = r15.A1N;
                AnonymousClass1M0 A053 = r9.A02.A05();
                try {
                    B1k = A053.B1k();
                    A053.A02.A03("receipt_user", "message_row_id=?", "deleteMessageReceipts/DELETE_RECEIPT_USER", new String[]{String.valueOf(j)});
                    B1k.A00();
                    A053.B5o(new C35191iI(r9, j, 1));
                    B1k.close();
                    A053.close();
                    AnonymousClass1FN r0 = this.A02;
                    long j2 = r15.A1N;
                    AnonymousClass1FK r92 = r0.A01;
                    A053 = r92.A04.A05();
                    B1k = A053.B1k();
                    A053.A02.A03("receipt_device", "message_row_id = ?", "MessageReceiptDeviceStore/deleteMessageReceipts/DELETE_RECEIPT_DEVICE", new String[]{String.valueOf(j2)});
                    B1k.A00();
                    A053.B5o(new C35191iI(r92, j2, 0));
                    B1k.close();
                    A053.close();
                    B1k2.A00();
                    A052.B5o(new C35701j7(this, r15, 23));
                    B1k2.close();
                    A052.close();
                    this.A08.A01("ReceiptManager/deleteMessageReceiptsOnRevoke", SystemClock.uptimeMillis() - uptimeMillis);
                    return;
                } catch (Throwable th) {
                    A053.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                B1k2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A052.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
