package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

/* renamed from: X.1OH  reason: invalid class name */
public class AnonymousClass1OH {
    public final C19970wo A00;
    public final C19420v0 A01;
    public final C236419g A02;
    public final C19700wN A03;
    public final AnonymousClass189 A04;
    public final AnonymousClass187 A05;
    public final C19770wU A06;

    public static AnonymousClass34P A00(AnonymousClass1OH r4) {
        AnonymousClass189 r3 = r4.A04;
        if (r3.A0X()) {
            return r3.A00.A04();
        }
        AnonymousClass187 r2 = r4.A05;
        Objects.requireNonNull(r3);
        return (AnonymousClass34P) r2.A00.submit(new AnonymousClass4YJ(r3, 0)).get();
    }

    public long A01() {
        long j = ((SharedPreferences) this.A01.A00.get()).getLong("adv_timestamp_sec", -1);
        C19970wo r2 = this.A00;
        long A062 = r2.A06() / 1000;
        long A042 = r2.A04() / 1000;
        long j2 = 1 + j;
        if (j2 > A062 + 86400) {
            StringBuilder sb = new StringBuilder();
            sb.append("CompanionDeviceAdvUtil/getTimestampSec invalid ts lastTs=");
            sb.append(j);
            sb.append("; ntpTs=");
            sb.append(A062);
            sb.append("; serverTs=");
            sb.append(A042);
            Log.e(sb.toString());
            return -1;
        }
        if (Math.abs(A042 - A062) <= 86400) {
            A062 = A042;
        }
        return Math.max(A062, j2);
    }

    public AnonymousClass8RP A02(C52772q9 r6, int i, int i2, long j) {
        int A032;
        C236419g r1 = this.A02;
        HashSet hashSet = new HashSet();
        if (!r1.A09.A0L()) {
            A032 = 0;
        } else {
            A032 = r1.A0E.A03();
        }
        hashSet.add(Integer.valueOf(A032));
        C225614x it = r1.A0I.A04().values().iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(((AnonymousClass3SB) it.next()).A04));
        }
        if (i == -1) {
            C19700wN r3 = this.A03;
            StringBuilder sb = new StringBuilder();
            sb.append("currentIndex=");
            sb.append(i2);
            sb.append("; timestampSec=");
            sb.append(j);
            r3.A0E("invalid_rawId_key_index_list", sb.toString(), true);
        }
        hashSet.add(Integer.valueOf(i2));
        AnonymousClass8NN A0p = AnonymousClass8RP.DEFAULT_INSTANCE.A0p();
        A0p.A0S();
        AnonymousClass8RP r12 = (AnonymousClass8RP) A0p.A00;
        r12.bitField0_ |= 1;
        r12.rawId_ = i;
        A0p.A0S();
        AnonymousClass8RP r13 = (AnonymousClass8RP) A0p.A00;
        r13.bitField0_ |= 4;
        r13.currentIndex_ = i2;
        A0p.A0S();
        AnonymousClass8RP r14 = (AnonymousClass8RP) A0p.A00;
        r14.bitField0_ |= 2;
        r14.timestamp_ = j;
        A0p.A0S();
        AnonymousClass8RP r2 = (AnonymousClass8RP) A0p.A00;
        B62 b62 = r2.validIndexes_;
        boolean z = ((C21886AcE) b62).A00;
        AnonymousClass8I0 r15 = b62;
        if (!z) {
            AnonymousClass8I0 A09 = C170918Hz.A09(b62);
            r2.validIndexes_ = A09;
            r15 = A09;
        }
        C21071A7i.A0O(hashSet, r15);
        A0p.A0S();
        AnonymousClass8RP r16 = (AnonymousClass8RP) A0p.A00;
        r16.accountType_ = r6.value;
        r16.bitField0_ |= 8;
        return (AnonymousClass8RP) A0p.A0R();
    }

    public void A04() {
        C19420v0.A00(this.A01).putLong("adv_timestamp_sec", -1).apply();
        this.A06.Boy(new C35671j4(this, 22));
    }

    public void A05() {
        int abs = Math.abs(new Random().nextInt());
        if (abs == 0) {
            abs = 1;
        }
        C19420v0 r3 = this.A01;
        C19420v0.A00(r3).putInt("adv_raw_id", abs).apply();
        C19420v0.A00(r3).putInt("adv_current_key_index", 1).apply();
    }

    public void A06(long j) {
        C19420v0 r4 = this.A01;
        C19420v0.A00(r4).remove("adv_key_index_list_update_retry_count").apply();
        C19420v0.A00(r4).remove("adv_key_index_list_last_failure_time").apply();
        C19420v0.A00(r4).putLong("adv_key_index_list_last_update_time", C19970wo.A00(this.A00)).apply();
        C19420v0.A00(r4).remove("adv_key_index_list_require_update").apply();
        if (j > 0) {
            C19420v0.A00(r4).putLong("adv_timestamp_sec", j).apply();
        }
    }

    public AnonymousClass1OH(C19700wN r1, C19970wo r2, C19420v0 r3, AnonymousClass189 r4, AnonymousClass187 r5, C236419g r6, C19770wU r7) {
        this.A00 = r2;
        this.A03 = r1;
        this.A06 = r7;
        this.A05 = r5;
        this.A04 = r4;
        this.A01 = r3;
        this.A02 = r6;
    }

    public C172898Pp A03(AnonymousClass8RP r8) {
        AnonymousClass34P A002 = A00(this);
        C18740tg.A06(A002);
        AnonymousClass66J r5 = A002.A00;
        byte[] A052 = C203239na.A05(C19430v1.A0J, r8.A0o());
        AnonymousClass8NN A0p = C172898Pp.DEFAULT_INSTANCE.A0p();
        C52772q9 A003 = C52772q9.A00(r8.accountType_);
        if (A003 == null) {
            A003 = C52772q9.E2EE;
        }
        if (A003 == C52772q9.HOSTED) {
            byte[] bArr = A002.A01.A00.A01;
            AnonymousClass8I5 A012 = C21674AUx.A01(bArr, 0, bArr.length);
            A0p.A0S();
            C172898Pp r1 = (C172898Pp) A0p.A00;
            r1.bitField0_ |= 4;
            r1.accountSignatureKey_ = A012;
        }
        byte[] A08 = C133256Xm.A08(r5, A052);
        AnonymousClass8I5 A013 = C21674AUx.A01(A08, 0, A08.length);
        A0p.A0S();
        C172898Pp r12 = (C172898Pp) A0p.A00;
        r12.bitField0_ |= 2;
        r12.accountSignature_ = A013;
        AnonymousClass8I5 A0l = r8.A0l();
        A0p.A0S();
        C172898Pp r13 = (C172898Pp) A0p.A00;
        r13.bitField0_ |= 1;
        r13.details_ = A0l;
        return (C172898Pp) A0p.A0R();
    }
}
