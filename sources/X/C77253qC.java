package X;

import android.os.SystemClock;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.3qC  reason: invalid class name and case insensitive filesystem */
public class C77253qC implements AnonymousClass4RY {
    public long A00;
    public C49712jZ A01;
    public AnonymousClass39R A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass1N4 A06;
    public final C26861Lu A07;
    public final AnonymousClass17Y A08;
    public final C19600wD A09;
    public final AnonymousClass16D A0A;
    public final AnonymousClass185 A0B;
    public final C21159AAt A0C;
    public final C19970wo A0D;
    public final AnonymousClass17Z A0E;
    public final C25851Hx A0F;
    public final AnonymousClass1DX A0G;
    public final C20810yC A0H;
    public final C21010yW A0I;
    public final AnonymousClass19A A0J;
    public final C19770wU A0K;
    public final String A0L;
    public final WeakReference A0M;
    public final boolean A0N;
    public final boolean A0O;

    public void A00(C131626Pu r8, C194169Oj r9) {
        long j;
        if (r9 != null && this.A02 == null) {
            this.A02 = new AnonymousClass39R(r9.A0D, (String) null, (String) null, 3, 0);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        AnonymousClass17Y r4 = this.A08;
        C80313vC A002 = C80313vC.A00(this, r8, 13);
        if (elapsedRealtime < 500) {
            j = 500 - elapsedRealtime;
        } else {
            j = 0;
        }
        r4.A0I(A002, j);
    }

    public void BfB(AnonymousClass39R r24) {
        boolean z;
        int i;
        String str;
        String str2;
        C21700zf r2;
        if (!this.A03) {
            C20810yC r7 = this.A0H;
            String str3 = this.A0L;
            boolean A092 = AnonymousClass1DW.A09(r7, str3);
            if (A092 && (r2 = (C21700zf) this.A0G.A02.get("fetch_biz_info")) != null) {
                r2.A06("datasource");
            }
            AnonymousClass39R r22 = r24;
            this.A02 = r22;
            UserJid userJid = r22.A02;
            int i2 = r22.A01;
            if (i2 == -1 || (i = this.A04) != i2 || userJid == null) {
                z = true;
                A00((C131626Pu) null, (C194169Oj) null);
            } else {
                z = false;
                if (r7.A0E(508)) {
                    if (i == 2) {
                        str = "message_short_link";
                    } else {
                        str = "qr_code";
                    }
                    if (r7.A0E(1669) && i == 2) {
                        if (AnonymousClass1DW.A0A(r7, str3)) {
                            str = "custom_qr_code_link";
                        } else if (AnonymousClass1DW.A09(r7, str3)) {
                            str = "custom_link";
                        }
                    }
                    if (this.A0N) {
                        str2 = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
                    } else {
                        str2 = null;
                    }
                    this.A0F.A02(userJid, str, str2, System.currentTimeMillis(), System.currentTimeMillis());
                }
                C49712jZ r9 = new C49712jZ(this.A07, this.A0A, this.A0C, userJid, this, r22.A04, (String) null);
                this.A01 = r9;
                C36391kE.A1Q(r9, this.A0K);
            }
            if (A092) {
                boolean z2 = !z;
                Map map = this.A0G.A02;
                C21700zf r23 = (C21700zf) map.get("fetch_biz_info");
                if (r23 != null) {
                    short s = 3;
                    if (z2) {
                        s = 2;
                    }
                    r23.A0C(s);
                    map.remove("fetch_biz_info");
                }
            }
        }
    }

    public C77253qC(AnonymousClass1N4 r3, C26861Lu r4, AnonymousClass17Y r5, C19600wD r6, AnonymousClass16D r7, AnonymousClass185 r8, C21159AAt aAt, C19970wo r10, AnonymousClass17Z r11, C25851Hx r12, AnonymousClass1DX r13, C20810yC r14, C21010yW r15, AnonymousClass19A r16, C64783Pk r17, C19770wU r18, String str, int i, int i2, boolean z) {
        this.A0D = r10;
        this.A0H = r14;
        this.A08 = r5;
        this.A0K = r18;
        this.A0I = r15;
        this.A0J = r16;
        this.A0A = r7;
        this.A07 = r4;
        this.A0C = aAt;
        this.A06 = r3;
        this.A0G = r13;
        this.A04 = i;
        this.A0E = r11;
        this.A0F = r12;
        this.A0L = str;
        this.A0N = z;
        this.A0B = r8;
        this.A09 = r6;
        C64783Pk r1 = r17;
        this.A0M = AnonymousClass001.A0F(r1);
        this.A05 = i2;
        this.A0O = r1.A02;
    }
}
