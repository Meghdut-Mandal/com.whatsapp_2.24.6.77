package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.List;

/* renamed from: X.2La  reason: invalid class name and case insensitive filesystem */
public final class C44072La extends C65073Qp {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C23931Ak A08;
    public C52382pL A09;
    public C52452pS A0A;
    public C52392pM A0B;
    public C52272pA A0C;
    public C52162oz A0D;
    public C52282pB A0E;
    public C52182p1 A0F;
    public Long A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final long A0Q;
    public final C65073Qp A0R;
    public final List A0S;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44072La(C23931Ak r3, C65073Qp r4, C52382pL r5, C52452pS r6, C52392pM r7, C52272pA r8, C52162oz r9, C52282pB r10, C52182p1 r11, Long l, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3) {
        super(r4);
        AnonymousClass00C.A0D(r4, 2);
        this.A02 = j;
        this.A0R = r4;
        this.A0K = str;
        this.A04 = j2;
        this.A0H = str2;
        this.A03 = j3;
        this.A0M = str3;
        this.A05 = j4;
        this.A0L = str4;
        this.A06 = j5;
        this.A0Q = j6;
        this.A0I = str5;
        this.A0J = str6;
        this.A07 = j7;
        this.A09 = r5;
        this.A0D = r9;
        this.A0F = r11;
        this.A0C = r8;
        this.A0O = z;
        this.A0S = list;
        this.A0P = z2;
        this.A0E = r10;
        this.A0N = z3;
        this.A0B = r7;
        this.A08 = r3;
        this.A0G = l;
        this.A01 = i;
        this.A0A = r6;
        this.A00 = i2;
        this.A0h = str;
    }

    public final boolean A0Q(AnonymousClass1GQ r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (!C36391kE.A1Z(r4) || !r4.A00.A0E(5161) || this.A0E != C52282pB.GEOSUSPENDED) {
            return false;
        }
        return true;
    }

    public final boolean A0R(AnonymousClass1GQ r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (!C36391kE.A1Z(r4) || !r4.A00.A0E(3149) || this.A0E != C52282pB.SUSPENDED) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44072La) {
                C44072La r8 = (C44072La) obj;
                if (!(this.A02 == r8.A02 && AnonymousClass00C.A0J(this.A0R, r8.A0R) && AnonymousClass00C.A0J(this.A0K, r8.A0K) && this.A04 == r8.A04 && AnonymousClass00C.A0J(this.A0H, r8.A0H) && this.A03 == r8.A03 && AnonymousClass00C.A0J(this.A0M, r8.A0M) && this.A05 == r8.A05 && AnonymousClass00C.A0J(this.A0L, r8.A0L) && this.A06 == r8.A06 && this.A0Q == r8.A0Q && AnonymousClass00C.A0J(this.A0I, r8.A0I) && AnonymousClass00C.A0J(this.A0J, r8.A0J) && this.A07 == r8.A07 && this.A09 == r8.A09 && this.A0D == r8.A0D && this.A0F == r8.A0F && this.A0C == r8.A0C && this.A0O == r8.A0O && AnonymousClass00C.A0J(this.A0S, r8.A0S) && this.A0P == r8.A0P && this.A0E == r8.A0E && this.A0N == r8.A0N && this.A0B == r8.A0B && AnonymousClass00C.A0J(this.A08, r8.A08) && AnonymousClass00C.A0J(this.A0G, r8.A0G) && this.A01 == r8.A01 && this.A0A == r8.A0A && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void A0K(C44072La r3) {
        if (r3 != null) {
            this.A0U = r3.A0U;
            this.A0V = r3.A0V;
            this.A0N = r3.A0N;
            this.A0O = r3.A0O;
            this.A0X = r3.A0X;
            this.A0d = r3.A0d;
            this.A0c = r3.A0c;
            this.A08 = r3.A08;
        }
    }

    public final boolean A0L() {
        if (this.A0N) {
            return false;
        }
        C52382pL r1 = this.A09;
        if (r1 == C52382pL.ADMIN || r1 == C52382pL.OWNER) {
            return true;
        }
        return false;
    }

    public final boolean A0M() {
        return C36361kB.A1a(this.A09, C52382pL.SUBSCRIBED);
    }

    public final boolean A0N() {
        return C36361kB.A1a(this.A09, C52382pL.GUEST);
    }

    public final boolean A0O() {
        if (this.A0N || this.A09 != C52382pL.OWNER) {
            return false;
        }
        return true;
    }

    public final boolean A0P() {
        return C36361kB.A1a(this.A0F, C52182p1.VERIFIED);
    }

    public int hashCode() {
        int A082 = AnonymousClass000.A08(this.A02) * 31;
        long j = this.A04;
        long j2 = this.A03;
        long j3 = this.A05;
        int A002 = C36321k7.A00(this.A06, (C36321k7.A00(j3, (C36321k7.A00(j2, (C36321k7.A00(j, (C36351kA.A05(this.A0R, A082) + C36341k9.A09(this.A0K)) * 31) + C36341k9.A09(this.A0H)) * 31) + C36341k9.A09(this.A0M)) * 31) + C36341k9.A09(this.A0L)) * 31);
        int A052 = C36351kA.A05(this.A0F, C36351kA.A05(this.A0D, C36351kA.A05(this.A09, C36321k7.A00(this.A07, (((C36321k7.A00(this.A0Q, A002) + C36341k9.A09(this.A0I)) * 31) + C36341k9.A09(this.A0J)) * 31))));
        List list = this.A0S;
        C52282pB r0 = this.A0E;
        C52392pM r02 = this.A0B;
        return C36351kA.A05(this.A0A, (((((C36351kA.A05(r02, (C36351kA.A05(r0, (C36351kA.A05(list, (C36351kA.A05(this.A0C, A052) + C36341k9.A01(this.A0O ? 1 : 0)) * 31) + C36341k9.A01(this.A0P ? 1 : 0)) * 31) + C36341k9.A01(this.A0N ? 1 : 0)) * 31) + AnonymousClass000.A0H(this.A08)) * 31) + C36411kG.A09(this.A0G)) * 31) + this.A01) * 31) + this.A00;
    }

    public final C28981Uw A0J() {
        AnonymousClass11F A062 = A06();
        AnonymousClass00C.A0E(A062, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
        return (C28981Uw) A062;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewsletterInfo(chatRowId=");
        A0u.append(this.A02);
        A0u.append(", chatInfo=");
        A0u.append(this.A0R);
        A0u.append(", name=");
        A0u.append(this.A0K);
        A0u.append(", nameId=");
        A0u.append(this.A04);
        A0u.append(", description=");
        A0u.append(this.A0H);
        A0u.append(", descriptionId=");
        A0u.append(this.A03);
        A0u.append(", pictureUrl=");
        A0u.append(this.A0M);
        A0u.append(", pictureId=");
        A0u.append(this.A05);
        A0u.append(", picturePreviewUrl=");
        A0u.append(this.A0L);
        A0u.append(", picturePreviewId=");
        A0u.append(this.A06);
        A0u.append(", createdTimestamp=");
        A0u.append(this.A0Q);
        A0u.append(", handle=");
        A0u.append(this.A0I);
        A0u.append(", inviteCode=");
        A0u.append(this.A0J);
        A0u.append(", subscribersCount=");
        A0u.append(this.A07);
        A0u.append(", membership=");
        A0u.append(this.A09);
        A0u.append(", privacy=");
        A0u.append(this.A0D);
        A0u.append(", verified=");
        A0u.append(this.A0F);
        A0u.append(", verificationSource=");
        A0u.append(this.A0C);
        A0u.append(", muted=");
        A0u.append(this.A0O);
        A0u.append(", accounts=");
        A0u.append(this.A0S);
        A0u.append(", oldestMessageRetrieved=");
        A0u.append(this.A0P);
        A0u.append(", suspended=");
        A0u.append(this.A0E);
        A0u.append(", deleted=");
        A0u.append(this.A0N);
        A0u.append(", reactionsSettings=");
        A0u.append(this.A0B);
        A0u.append(", reactionsSettingsBlocklist=");
        A0u.append(this.A08);
        A0u.append(", reactionsSettingsUpdateTs=");
        A0u.append(this.A0G);
        A0u.append(", showEnforcedUpdateBanner=");
        A0u.append(this.A01);
        A0u.append(", mediaCacheSetting=");
        A0u.append(this.A0A);
        A0u.append(", adminCount=");
        return C36321k7.A0G(A0u, this.A00);
    }

    public static /* synthetic */ C44072La A00(C65073Qp r55, C52382pL r56, C44072La r57, C52452pS r58, C52162oz r59, C52282pB r60, C52182p1 r61, String str, String str2, String str3, String str4, String str5, String str6, int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z) {
        long j7;
        boolean z2;
        boolean z3;
        int i2;
        int i3 = i;
        C52452pS r13 = r58;
        C52282pB r11 = r60;
        boolean z4 = z;
        C52182p1 r10 = r61;
        C52162oz r12 = r59;
        C52382pL r14 = r56;
        long j8 = j;
        C65073Qp r562 = r55;
        String str7 = str;
        long j9 = j4;
        long j10 = j2;
        String str8 = str2;
        long j11 = j3;
        String str9 = str3;
        long j12 = j5;
        String str10 = str4;
        String str11 = str5;
        long j13 = j6;
        String str12 = str6;
        C52392pM r6 = null;
        C52272pA r9 = null;
        C23931Ak r16 = null;
        Long l = null;
        int i4 = 0;
        List list = null;
        C44072La r8 = r57;
        if ((i & 1) != 0) {
            j8 = r8.A02;
        }
        if ((i & 2) != 0) {
            r562 = r8.A0R;
        }
        if ((i & 4) != 0) {
            str7 = r8.A0K;
        }
        if ((i & 8) != 0) {
            j10 = r8.A04;
        }
        if ((i & 16) != 0) {
            str8 = r8.A0H;
        }
        if ((i & 32) != 0) {
            j11 = r8.A03;
        }
        if ((i & 64) != 0) {
            str9 = r8.A0M;
        }
        if ((i3 & 128) != 0) {
            j9 = r8.A05;
        }
        if ((i3 & 256) != 0) {
            str10 = r8.A0L;
        }
        if ((i3 & 512) != 0) {
            j12 = r8.A06;
        }
        if ((i3 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            j7 = r8.A0Q;
        } else {
            j7 = 0;
        }
        if ((i3 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            str11 = r8.A0I;
        }
        if ((i3 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            str12 = r8.A0J;
        }
        if ((i3 & DefaultCrypto.BUFFER_SIZE) != 0) {
            j13 = r8.A07;
        }
        if ((i3 & 16384) != 0) {
            r14 = r8.A09;
        }
        if ((32768 & i) != 0) {
            r12 = r8.A0D;
        }
        if ((i & 65536) != 0) {
            r10 = r8.A0F;
        }
        if ((i & C132986Wc.A0F) != 0) {
            r9 = r8.A0C;
        }
        if ((i & 262144) != 0) {
            z4 = r8.A0O;
        }
        if ((i & 524288) != 0) {
            list = r8.A0S;
        }
        if ((i & 1048576) != 0) {
            z2 = r8.A0P;
        } else {
            z2 = false;
        }
        if ((i & 2097152) != 0) {
            r11 = r8.A0E;
        }
        if ((i & 4194304) != 0) {
            z3 = r8.A0N;
        } else {
            z3 = false;
        }
        if ((i & 8388608) != 0) {
            r6 = r8.A0B;
        }
        if ((i & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 0) {
            r16 = r8.A08;
        }
        if ((i & 33554432) != 0) {
            l = r8.A0G;
        }
        if ((i & 67108864) != 0) {
            i4 = r8.A01;
        }
        if ((i & 134217728) != 0) {
            r13 = r8.A0A;
        }
        if ((i & 268435456) != 0) {
            i2 = r8.A00;
        } else {
            i2 = 0;
        }
        AnonymousClass00C.A0D(r562, 1);
        C36361kB.A1L(r14, r12);
        AnonymousClass00C.A0D(r10, 16);
        AnonymousClass00C.A0D(r9, 17);
        AnonymousClass00C.A0D(list, 19);
        AnonymousClass00C.A0D(r11, 21);
        AnonymousClass00C.A0D(r6, 23);
        AnonymousClass00C.A0D(r13, 27);
        return new C44072La(r16, r562, r14, r13, r6, r9, r12, r11, r10, l, str7, str8, str9, str10, str11, str12, list, i4, i2, j8, j10, j11, j9, j12, j7, j13, z4, z2, z3);
    }
}
