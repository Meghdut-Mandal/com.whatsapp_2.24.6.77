package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.9gO  reason: invalid class name and case insensitive filesystem */
public final class C199999gO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final AnonymousClass3S5 A07;
    public final AnonymousClass147 A08;
    public final PhoneUserJid A09;
    public final PhoneUserJid A0A;
    public final UserJid A0B;
    public final UserJid A0C;
    public final AnonymousClass3QL A0D;
    public final AnonymousClass3G4 A0E;
    public final String A0F;
    public final String A0G;
    public final Map A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final String A0U;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199999gO) {
                C199999gO r8 = (C199999gO) obj;
                if (!(AnonymousClass00C.A0J(this.A0B, r8.A0B) && AnonymousClass00C.A0J(this.A09, r8.A09) && this.A05 == r8.A05 && AnonymousClass00C.A0J(this.A0G, r8.A0G) && AnonymousClass00C.A0J(this.A0C, r8.A0C) && AnonymousClass00C.A0J(this.A0A, r8.A0A) && this.A06 == r8.A06 && AnonymousClass00C.A0J(this.A0U, r8.A0U) && this.A04 == r8.A04 && AnonymousClass00C.A0J(this.A0D, r8.A0D) && this.A0L == r8.A0L && this.A0T == r8.A0T && this.A0J == r8.A0J && this.A0S == r8.A0S && this.A0R == r8.A0R && AnonymousClass00C.A0J(this.A0E, r8.A0E) && this.A01 == r8.A01 && AnonymousClass00C.A0J(this.A07, r8.A07) && this.A02 == r8.A02 && AnonymousClass00C.A0J(this.A08, r8.A08) && AnonymousClass00C.A0J(this.A0H, r8.A0H) && this.A0O == r8.A0O && this.A0P == r8.A0P && this.A00 == r8.A00 && AnonymousClass00C.A0J(this.A0F, r8.A0F) && this.A03 == r8.A03 && this.A0M == r8.A0M && this.A0Q == r8.A0Q && this.A0I == r8.A0I && this.A0N == r8.A0N && this.A0K == r8.A0K)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A05;
        long j2 = this.A06;
        int A002 = C36321k7.A00(this.A04, (C36321k7.A00(j2, (((((C36321k7.A00(j, ((AnonymousClass000.A0H(this.A0B) * 31) + AnonymousClass000.A0H(this.A09)) * 31) + C36341k9.A09(this.A0G)) * 31) + AnonymousClass000.A0H(this.A0C)) * 31) + AnonymousClass000.A0H(this.A0A)) * 31) + C36341k9.A09(this.A0U)) * 31);
        AnonymousClass3S5 r0 = this.A07;
        return C53202qw.A00(C53202qw.A00(C53202qw.A00(C53202qw.A00((C36381kD.A08(this.A0F, (C53202qw.A00(C53202qw.A00((((((C36351kA.A05(r0, (((C53202qw.A00(C53202qw.A00(C53202qw.A00(C53202qw.A00(C53202qw.A00(C36351kA.A05(this.A0D, A002), this.A0L), this.A0T), this.A0J), this.A0S), this.A0R) + AnonymousClass000.A0H(this.A0E)) * 31) + this.A01) * 31) + this.A02) * 31) + AnonymousClass000.A0H(this.A08)) * 31) + C36411kG.A09(this.A0H)) * 31, this.A0O), this.A0P) + this.A00) * 31) + this.A03) * 31, this.A0M), this.A0Q), this.A0I), this.A0N) + C36341k9.A01(this.A0K ? 1 : 0);
    }

    public String toString() {
        int i;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupInfoData {\n      | groupType=");
        A0u.append(this.A02);
        A0u.append("\n      | isSuspended=");
        A0u.append(this.A0R);
        A0u.append("\n      | numberOfParticipants=");
        Map map = this.A0H;
        if (map != null) {
            i = map.size();
        } else {
            i = 0;
        }
        A0u.append(i);
        return AnonymousClass091.A02(AnonymousClass000.A0q("\n      |}\n    ", A0u));
    }

    public C199999gO(AnonymousClass3S5 r3, AnonymousClass147 r4, PhoneUserJid phoneUserJid, PhoneUserJid phoneUserJid2, UserJid userJid, UserJid userJid2, AnonymousClass3QL r9, AnonymousClass3G4 r10, String str, String str2, String str3, Map map, int i, int i2, int i3, int i4, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.A0B = userJid;
        this.A09 = phoneUserJid;
        this.A05 = j;
        this.A0G = str;
        this.A0C = userJid2;
        this.A0A = phoneUserJid2;
        this.A06 = j2;
        this.A0U = str2;
        this.A04 = j3;
        this.A0D = r9;
        this.A0L = z;
        this.A0T = z2;
        this.A0J = z3;
        this.A0S = z4;
        this.A0R = z5;
        this.A0E = r10;
        this.A01 = i;
        this.A07 = r3;
        this.A02 = i2;
        this.A08 = r4;
        this.A0H = map;
        this.A0O = z6;
        this.A0P = z7;
        this.A00 = i3;
        this.A0F = str3;
        this.A03 = i4;
        this.A0M = z8;
        this.A0Q = z9;
        this.A0I = z10;
        this.A0N = z11;
        this.A0K = z12;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C199999gO() {
        /*
            r35 = this;
            r2 = 0
            r17 = 0
            X.3QL r7 = X.AnonymousClass3QL.A05
            X.AnonymousClass00C.A09(r7)
            r13 = 0
            r0 = 3
            X.3S5 r1 = new X.3S5
            r1.<init>(r2, r0)
            java.lang.String r11 = "pn"
            r0 = r35
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r12 = r2
            r14 = r13
            r15 = r13
            r16 = r13
            r19 = r17
            r21 = r17
            r23 = r13
            r24 = r13
            r25 = r13
            r26 = r13
            r27 = r13
            r28 = r13
            r29 = r13
            r30 = r13
            r31 = r13
            r32 = r13
            r33 = r13
            r34 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199999gO.<init>():void");
    }
}
