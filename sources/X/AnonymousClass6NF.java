package X;

import android.os.CancellationSignal;
import android.os.SystemClock;
import android.util.Base64;
import com.whatsapp.jid.PhoneUserJid;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6NF  reason: invalid class name */
public class AnonymousClass6NF {
    public final C19730wQ A00;
    public final C24331Ca A01;
    public final AnonymousClass1CZ A02;
    public final AnonymousClass1CY A03;
    public final AnonymousClass19J A04;
    public final C19970wo A05;

    public static void A00(CancellationSignal cancellationSignal, CountDownLatch countDownLatch) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + AnonymousClass6X5.A0L;
        while (true) {
            cancellationSignal.throwIfCanceled();
            if (countDownLatch.getCount() != 0 && SystemClock.elapsedRealtime() <= elapsedRealtime) {
                countDownLatch.await(500, TimeUnit.MILLISECONDS);
            } else {
                return;
            }
        }
    }

    public C123895xG A01(CancellationSignal cancellationSignal, String str, String str2, String str3) {
        byte[] bArr;
        C19730wQ r12 = this.A00;
        PhoneUserJid A0n = C36441kJ.A0n(r12);
        if (A0n != null) {
            byte[] decode = Base64.decode(str2, 2);
            byte[] decode2 = Base64.decode(str3, 2);
            CountDownLatch A0u = C90484aE.A0u();
            String str4 = str;
            this.A01.A00(new C1497272n(A0u, 16), str4, decode2, decode);
            try {
                A00(cancellationSignal, A0u);
                if (A0u.getCount() <= 0) {
                    PhoneUserJid A0n2 = C36441kJ.A0n(r12);
                    if (A0n2 == null) {
                        throw new AnonymousClass5R7(301, "User was logged out while waiting for encryption key.");
                    } else if (A0n2.equals(A0n)) {
                        AnonymousClass1CY r0 = this.A03;
                        C1261262q r1 = (C1261262q) r0.A00.A00.get(new AnonymousClass66K(str4, decode2));
                        if (r1 != null && Arrays.equals(r1.A01, decode) && (bArr = r1.A02) != null) {
                            return new C123895xG(A0n2, str4, Base64.encodeToString(decode, 2), Base64.encodeToString(decode2, 2), Base64.encodeToString(bArr, 2), System.currentTimeMillis());
                        }
                        throw new C105015Cy(101, "Key not found.");
                    } else {
                        throw new AnonymousClass5R7(301, "User changed while waiting for encryption key.");
                    }
                } else if (this.A04.A04 == 2) {
                    throw new C105015Cy(103, "Failed to fetch keys, timed out.");
                } else {
                    throw new C105015Cy(102, "Not connected to server, cannot fetch keys.");
                }
            } catch (InterruptedException e) {
                throw new C105015Cy("Failed to fetch keys, interrupted.", (Throwable) e);
            }
        } else {
            throw new AnonymousClass5R7(301, "Cannot fetch encryption key when user is not logged in.");
        }
    }

    public AnonymousClass6NF(C19730wQ r1, AnonymousClass19J r2, C24331Ca r3, C19970wo r4, AnonymousClass1CZ r5, AnonymousClass1CY r6) {
        this.A05 = r4;
        this.A00 = r1;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r2;
        this.A01 = r3;
    }
}
