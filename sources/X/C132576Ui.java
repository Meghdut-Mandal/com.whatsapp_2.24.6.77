package X;

import java.util.concurrent.CopyOnWriteArrayList;
import org.whispersystems.curve25519.NativeVOPRFExtension;

/* renamed from: X.6Ui  reason: invalid class name and case insensitive filesystem */
public class C132576Ui {
    public NativeVOPRFExtension A00;
    public final int A01;
    public final AnonymousClass19J A02;
    public final C121195sk A03;
    public final AnonymousClass6W6 A04;
    public final C147776xl A05;
    public final C19970wo A06;
    public final C20810yC A07;
    public final C19930wk A08;
    public final String A09;
    public final CopyOnWriteArrayList A0A;
    public volatile int A0B;
    public volatile long A0C;
    public volatile String A0D;
    public volatile boolean A0E;
    public volatile boolean A0F = false;
    public volatile byte[] A0G;
    public volatile byte[] A0H;

    public static synchronized void A00(C132576Ui r5) {
        synchronized (r5) {
            r5.A0D = null;
            r5.A0G = null;
            r5.A0B = 0;
            r5.A0F = false;
            r5.A0E = false;
            AnonymousClass6W6 r3 = r5.A04;
            AnonymousClass6W6.A03(r3, "original_token_string", (String) null);
            AnonymousClass6W6.A03(r3, "next_original_token_string", (String) null);
            AnonymousClass6W6.A02(r3, "base_timestamp", 0);
            AnonymousClass6W6.A02(r3, "time_to_live_in_seconds", 0);
            AnonymousClass6W6.A03(r3, "blinding_factor_string", (String) null);
            AnonymousClass6W6.A01(r3, "redeem_count", -1);
            AnonymousClass6W6.A03(r3, "shared_secret_string", (String) null);
        }
    }

    public static synchronized void A02(C132576Ui r4, boolean z) {
        synchronized (r4) {
            r4.A0E = false;
            AnonymousClass6W6 r2 = r4.A04;
            AnonymousClass6W6.A03(r2, "blinding_factor_string", (String) null);
            if (r4.A0F) {
                AnonymousClass6W6.A03(r2, "next_original_token_string", (String) null);
            } else {
                AnonymousClass6W6.A03(r2, "original_token_string", (String) null);
            }
            r4.A0F = false;
            r4.A0G = null;
            if (!z) {
                r4.A0D = null;
                r4.A0B = 0;
            }
        }
    }

    public static void A01(C132576Ui r5, int i) {
        int i2 = r5.A0B;
        AnonymousClass6W6 r3 = r5.A04;
        if (i2 < AnonymousClass6W6.A00(r3).getInt("max_sign_retry_count", 0)) {
            r5.A0B++;
            r5.A08.A03(new C1496972k(r5, 25), C36341k9.A0B(AnonymousClass6W6.A00(r3), "sign_retry_interval_sec") * ((long) r5.A0B) * ((long) r5.A0B) * 1000);
            return;
        }
        int i3 = 10;
        if (i == 5) {
            i3 = 9;
        }
        r3.A04(i3);
        A02(r5, false);
    }

    public C132576Ui(AnonymousClass19J r2, C121195sk r3, AnonymousClass6W6 r4, C147776xl r5, C19970wo r6, C20810yC r7, C19770wU r8, String str) {
        this.A06 = r6;
        this.A07 = r7;
        this.A04 = r4;
        this.A09 = str;
        this.A05 = r5;
        r5.A00 = this;
        this.A03 = r3;
        this.A02 = r2;
        this.A0A = new CopyOnWriteArrayList();
        this.A08 = C36411kG.A0r(r8);
        this.A01 = C36371kC.A00(str.equals("WA_BizDirectorySearch") ? 1 : 0);
    }
}
