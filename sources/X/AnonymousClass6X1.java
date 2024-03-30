package X;

import android.os.SystemClock;
import android.util.Base64;
import com.whatsapp.fieldstats.privatestats.PrivateStatsWorker;
import com.whatsapp.util.Log;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.whispersystems.curve25519.NativeVOPRFExtension;

/* renamed from: X.6X1  reason: invalid class name */
public class AnonymousClass6X1 {
    public NativeVOPRFExtension A00;
    public final C21100yf A01;
    public final AnonymousClass19J A02;
    public final C19970wo A03;
    public final AnonymousClass1J6 A04;
    public final AnonymousClass6V6 A05;
    public final C147786xm A06;
    public final C19770wU A07;
    public final C21570zS A08;
    public final C20810yC A09;
    public volatile int A0A = 0;
    public volatile long A0B;
    public volatile long A0C;
    public volatile String A0D;
    public volatile boolean A0E;
    public volatile boolean A0F = false;
    public volatile byte[] A0G;

    public static synchronized void A00(AnonymousClass6X1 r6) {
        synchronized (r6) {
            r6.A0D = null;
            r6.A0G = null;
            r6.A0A = 0;
            r6.A0F = false;
            r6.A0E = false;
            AnonymousClass6V6 r4 = r6.A05;
            AnonymousClass6V6.A03(r4, "original_token", (String) null);
            AnonymousClass6V6.A03(r4, "next_original_token", (String) null);
            AnonymousClass6V6.A02(r4, "base_timestamp", 0);
            AnonymousClass6V6.A02(r4, "time_to_live", 0);
            AnonymousClass6V6.A03(r4, "blinding_factor", (String) null);
            AnonymousClass6V6.A00(r4).remove("redeem_count").apply();
            AnonymousClass6V6.A03(r4, "shared_secret", (String) null);
            if (AnonymousClass6V6.A01(r4).getInt("first_token_stage", 0) == 1) {
                C36341k9.A0v(AnonymousClass6V6.A00(r4), "first_token_stage", 0);
            }
        }
    }

    public static synchronized void A02(AnonymousClass6X1 r2, int i) {
        synchronized (r2) {
            if (!r2.A0E) {
                r2.A0E = true;
                C36321k7.A1T("PrivateStatsToken/doCreateFirstToken!!--->about to create 1st token: ", AnonymousClass000.A0u(), i);
                r2.A07(false);
            }
        }
    }

    public static synchronized void A03(AnonymousClass6X1 r10, int i, boolean z) {
        synchronized (r10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            r10.A04.A01(i, elapsedRealtime - r10.A0B, elapsedRealtime - r10.A0C, (long) r10.A0A);
            r10.A0E = false;
            AnonymousClass6V6 r3 = r10.A05;
            AnonymousClass6V6.A03(r3, "blinding_factor", (String) null);
            if (r10.A0F) {
                AnonymousClass6V6.A03(r3, "next_original_token", (String) null);
            } else {
                AnonymousClass6V6.A03(r3, "original_token", (String) null);
            }
            r10.A0F = false;
            r10.A0G = null;
            if (!z) {
                r10.A0D = null;
                r10.A0A = 0;
            }
            if (AnonymousClass6V6.A01(r3).getInt("first_token_stage", 0) == 1) {
                C36341k9.A0v(AnonymousClass6V6.A00(r3), "first_token_stage", 0);
            }
        }
    }

    public synchronized void A06() {
        if (!A04(this) && !this.A0E) {
            AnonymousClass6V6 r9 = this.A05;
            int i = AnonymousClass6V6.A01(r9).getInt("redeem_count", -1);
            long A092 = C36371kC.A09(this.A03) - AnonymousClass6V6.A01(r9).getLong("base_timestamp", 0);
            if (i < 0 || i >= 512 || A092 >= AnonymousClass6V6.A01(r9).getLong("time_to_live", 0)) {
                this.A0E = true;
                A07(false);
            } else {
                C21100yf r3 = this.A01;
                int A042 = r3.A04(C21100yf.A09);
                long A043 = (long) r3.A04(C21100yf.A08);
                if (i >= A042 || A092 > AnonymousClass6V6.A01(r9).getLong("time_to_live", 0) - A043) {
                    this.A0E = true;
                    A07(true);
                }
            }
        }
    }

    public static void A01(AnonymousClass6X1 r7, int i) {
        if (r7.A0A < 2) {
            r7.A0A++;
            r7.A07.BpM(new C80243v5(r7, 22), "PrivateStatstoken/retry", ((long) r7.A0A) * AnonymousClass6X5.A0L * ((long) r7.A0A));
            return;
        }
        AnonymousClass6V6 r2 = r7.A05;
        int i2 = 10;
        if (i == 5) {
            i2 = 9;
        }
        r2.A04(i2);
        A03(r7, i, false);
    }

    public static boolean A04(AnonymousClass6X1 r16) {
        AnonymousClass6X1 r7 = r16;
        AnonymousClass6V6 r9 = r7.A05;
        int A012 = C36371kC.A01(AnonymousClass6V6.A01(r9), "first_token_stage");
        if (A012 != 2) {
            int A072 = r7.A09.A07(8042);
            if (A072 <= 30) {
                C36341k9.A0v(AnonymousClass6V6.A00(r9), "first_token_stage", 2);
            } else {
                long j = AnonymousClass6V6.A01(r9).getLong("first_token_delay_time", 0);
                if (A012 == 1) {
                    if (!r7.A0E) {
                        C19970wo r5 = r7.A03;
                        if (C19970wo.A00(r5) / 1000 > j + AnonymousClass6V6.A01(r9).getLong("first_token_request_timestamp", 0) + 300) {
                            C90514aH.A0V(r7.A08).A0B("name.com.whatsapp.privatestats.firsttoken");
                            Log.i("PrivateStatsToken/delayForFirstTokenIfNeeded cancelled the work");
                            A02(r7, 2);
                        } else {
                            C19970wo.A00(r5);
                            return true;
                        }
                    }
                    return true;
                } else if (A012 == 0) {
                    long nextInt = ((long) new Random().nextInt(A072 - 30)) + 30;
                    C36321k7.A1V("PrivateStatsToken/delayForFirstToken-->delay timesec= ", AnonymousClass000.A0u(), nextInt);
                    AnonymousClass6V6.A02(r9, "first_token_delay_time", nextInt);
                    AnonymousClass6V6.A02(r9, "first_token_request_timestamp", C19970wo.A00(r7.A03) / 1000);
                    C36341k9.A0v(AnonymousClass6V6.A00(r9), "first_token_stage", 1);
                    C97384pE r1 = new C97384pE(PrivateStatsWorker.class);
                    r1.A02(nextInt, TimeUnit.SECONDS);
                    C90514aH.A0V(r7.A08).A07((C97404pG) r1.A00(), C023109s.A00, "name.com.whatsapp.privatestats.firsttoken");
                    return true;
                }
            }
        }
        return false;
    }

    public int A05() {
        AnonymousClass6V6 r4 = this.A05;
        int i = AnonymousClass6V6.A01(r4).getInt("first_token_stage", 0);
        if (i == 1) {
            synchronized (this) {
                if (this.A0E) {
                    return 15;
                }
                return 2;
            }
        } else if (i != 0) {
            return AnonymousClass6V6.A01(r4).getInt("token_not_ready_reason", 0);
        } else {
            return 2;
        }
    }

    public void A07(boolean z) {
        NativeVOPRFExtension nativeVOPRFExtension = this.A00;
        if (nativeVOPRFExtension == null) {
            nativeVOPRFExtension = new NativeVOPRFExtension();
            this.A00 = nativeVOPRFExtension;
        }
        byte[] bArr = new byte[32];
        AnonymousClass603 r3 = nativeVOPRFExtension.A00;
        r3.A00(bArr);
        byte[] bArr2 = null;
        int i = 0;
        while (i < 256) {
            bArr2 = new byte[32];
            r3.A00(bArr2);
            bArr2[31] = (byte) (bArr2[31] & 31);
            if (nativeVOPRFExtension.A00(bArr2)) {
                break;
            }
            i++;
        }
        if (i >= 256) {
            Log.w("PrivateStatsToken/generateCredentialToken cannot generate valid blindingFactor");
            this.A05.A04(5);
        } else {
            SystemClock.elapsedRealtime();
            byte[] A022 = nativeVOPRFExtension.A02(bArr, bArr2, 32);
            SystemClock.elapsedRealtime();
            if (A022 == null) {
                Log.e("PrivateStatsToken/generateCredentialToken failed to blind the token");
                this.A05.A04(7);
            } else {
                synchronized (this) {
                    this.A0F = z;
                    this.A0G = A022;
                    if (z) {
                        AnonymousClass6V6 r2 = this.A05;
                        AnonymousClass6V6.A03(r2, "next_original_token", Base64.encodeToString(bArr, 10));
                        AnonymousClass6V6.A03(r2, "blinding_factor", Base64.encodeToString(bArr2, 10));
                    } else {
                        AnonymousClass6V6 r5 = this.A05;
                        AnonymousClass6V6.A03(r5, "original_token", Base64.encodeToString(bArr, 10));
                        AnonymousClass6V6.A03(r5, "blinding_factor", Base64.encodeToString(bArr2, 10));
                        AnonymousClass6V6.A03(r5, "shared_secret", (String) null);
                        AnonymousClass6V6.A00(r5).remove("redeem_count").apply();
                        AnonymousClass6V6.A02(r5, "base_timestamp", 0);
                        AnonymousClass6V6.A02(r5, "time_to_live", 0);
                    }
                    this.A0A = 0;
                    this.A0B = SystemClock.elapsedRealtime();
                    this.A0C = this.A0B;
                    if (this.A02.A04 == 2) {
                        this.A0D = this.A06.A00(this.A0G);
                    } else {
                        A01(this, 5);
                    }
                }
                return;
            }
        }
        A03(this, 4, true);
    }

    public AnonymousClass6X1(C21100yf r2, AnonymousClass19J r3, C19970wo r4, C20810yC r5, AnonymousClass1J6 r6, AnonymousClass6V6 r7, C147786xm r8, C19770wU r9, C21570zS r10) {
        this.A03 = r4;
        this.A07 = r9;
        this.A0E = false;
        this.A01 = r2;
        this.A09 = r5;
        this.A08 = r10;
        this.A02 = r3;
        this.A05 = r7;
        this.A06 = r8;
        this.A04 = r6;
        r8.A00 = this;
    }
}
