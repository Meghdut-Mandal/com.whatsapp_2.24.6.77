package X;

import android.app.Application;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;
import java.net.MalformedURLException;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.1sS  reason: invalid class name and case insensitive filesystem */
public class C39471sS extends AnonymousClass08X implements C160447l1 {
    public int A00;
    public C145166tS A01;
    public AnonymousClass389 A02;
    public C87924Qs A03 = null;
    public AnonymousClass3L1 A04;
    public Runnable A05 = null;
    public String A06;
    public boolean A07;
    public boolean A08 = false;
    public boolean A09;
    public boolean A0A;
    public final Handler A0B;
    public final C001600r A0C;
    public final C001700s A0D;
    public final C001700s A0E;
    public final C001700s A0F;
    public final C001700s A0G;
    public final AnonymousClass17Y A0H;
    public final C20050ww A0I;
    public final AnonymousClass19J A0J;
    public final AnonymousClass1KK A0K;
    public final C31751cK A0L;
    public final C29461Ws A0M;
    public final C202279lS A0N;
    public final C89034Uz A0O;
    public final AnonymousClass185 A0P;
    public final AnonymousClass3FY A0Q;
    public final C19420v0 A0R;
    public final C18820ts A0S;
    public final AnonymousClass1DW A0T;
    public final C20810yC A0U;
    public final C21010yW A0V;
    public final AnonymousClass1DU A0W;
    public final AnonymousClass1D0 A0X;
    public final AnonymousClass19A A0Y;
    public final AnonymousClass1GQ A0Z;
    public final C88564Te A0a;
    public final AnonymousClass4UX A0b;
    public final C19770wU A0c;
    public final List A0d;
    public final AnonymousClass164 A0e;
    public final C19970wo A0f;
    public final AnonymousClass353 A0g;

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S(android.text.Editable r13, X.AnonymousClass11F r14, X.AnonymousClass005 r15, boolean r16, boolean r17) {
        /*
            r12 = this;
            r7 = r12
            r0 = r16
            r12.A0A = r0
            r0 = r17
            r12.A09 = r0
            X.6tS r1 = r12.A01
            boolean r0 = r1 instanceof X.AnonymousClass28U
            if (r0 == 0) goto L_0x0015
            X.2pW r0 = X.C52492pW.PAGE_UPDATED
            A02(r1, r12, r0)
        L_0x0014:
            return
        L_0x0015:
            X.0v0 r0 = r12.A0R
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.lang.String r0 = "privacy_linkpreview"
            r5 = 0
            boolean r0 = r1.getBoolean(r0, r5)
            r3 = 0
            if (r0 != 0) goto L_0x010c
            X.1DU r1 = r12.A0W
            java.lang.String r0 = r13.toString()
            java.lang.String r10 = r1.A03(r0)
            if (r10 == 0) goto L_0x0043
            java.lang.String r0 = "/"
            boolean r0 = r10.endsWith(r0)
            if (r0 == 0) goto L_0x0043
            int r0 = r10.length()
            int r0 = r0 + -1
            java.lang.String r10 = r10.substring(r5, r0)
        L_0x0043:
            java.lang.String r4 = r12.A06
            r12.A0V(r10)
            if (r10 == 0) goto L_0x0121
            r12.A0W(r3)
            X.6tS r0 = r12.A01
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r0.A0Z
            boolean r0 = android.text.TextUtils.equals(r0, r10)
            if (r0 != 0) goto L_0x0014
        L_0x0059:
            boolean r0 = r12.A09
            if (r0 == 0) goto L_0x0069
            X.00s r2 = r12.A0G
            X.2pW r1 = X.C52492pW.LOADING
            X.3JB r0 = new X.3JB
            r0.<init>(r3, r1, r3)
            r2.A0D(r0)
        L_0x0069:
            X.1DW r0 = r12.A0T
            boolean r0 = r0.A0G(r10)
            r8 = r14
            r9 = r15
            if (r0 == 0) goto L_0x00bf
            android.net.Uri r0 = android.net.Uri.parse(r10)
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass1DW.A04(r0)
            if (r0 == 0) goto L_0x00ef
            r12.A05(r0, r15, r10)
        L_0x0080:
            X.6tS r0 = r12.A01
            if (r0 != 0) goto L_0x0014
            boolean r0 = r12.A08
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L_0x00a8
            if (r4 == 0) goto L_0x00a8
            boolean r0 = r4.contains(r10)
            if (r0 != 0) goto L_0x009a
            boolean r0 = r10.contains(r4)
            if (r0 == 0) goto L_0x00a8
        L_0x009a:
            X.0yC r1 = r12.A0U
            r0 = 4054(0xfd6, float:5.681E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00a8
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
        L_0x00a8:
            boolean r2 = r2.booleanValue()
            java.lang.Runnable r1 = r12.A05
            if (r1 == 0) goto L_0x00b7
            android.os.Handler r0 = r12.A0B
            r0.removeCallbacks(r1)
            r12.A05 = r3
        L_0x00b7:
            r12.A03 = r3
            if (r2 == 0) goto L_0x010f
            r12.A0U(r14, r15, r10)
            return
        L_0x00bf:
            X.4Uz r6 = r12.A0O
            r2 = r6
            X.3dK r2 = (X.C69313dK) r2
            X.0yC r1 = r2.A07
            r0 = 832(0x340, float:1.166E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x00ef
            r0 = 1062(0x426, float:1.488E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00ef
            X.3Ob r0 = r2.A0A
            boolean r0 = r0.A01(r10)
            if (r0 == 0) goto L_0x00ef
            X.1DU r2 = r12.A0W
            X.0ww r1 = r12.A0I
            X.28T r0 = new X.28T
            r0.<init>(r1, r2, r10)
            r12.A01 = r0
            X.4Te r0 = r12.A0a
            r6.BoO(r0, r10)
            goto L_0x0080
        L_0x00ef:
            boolean r0 = r14 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0107
            X.1GQ r0 = r12.A0Z
            X.0yC r1 = r0.A00
            r0 = 5287(0x14a7, float:7.409E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0107
            r1 = 0
        L_0x0100:
            X.2pW r0 = X.C52492pW.SMALL_THUMBNAIL_LOADED
            A02(r1, r12, r0)
            goto L_0x0080
        L_0x0107:
            X.6tS r1 = X.C64033Mj.A00(r10)
            goto L_0x0100
        L_0x010c:
            r10 = r3
            goto L_0x0043
        L_0x010f:
            r0 = 700(0x2bc, float:9.81E-43)
            r11 = 13
            X.74y r6 = new X.74y
            r6.<init>(r7, r8, r9, r10, r11)
            r12.A05 = r6
            android.os.Handler r2 = r12.A0B
            long r0 = (long) r0
            r2.postDelayed(r6, r0)
            return
        L_0x0121:
            java.lang.Runnable r1 = r12.A05
            if (r1 == 0) goto L_0x012c
            android.os.Handler r0 = r12.A0B
            r0.removeCallbacks(r1)
            r12.A05 = r3
        L_0x012c:
            r12.A03 = r3
            X.00s r0 = r12.A0D
            r0.A0D(r3)
            X.00s r0 = r12.A0G
            r0.A0D(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39471sS.A0S(android.text.Editable, X.11F, X.005, boolean, boolean):void");
    }

    public static void A01(C145166tS r3, C39471sS r4, C52492pW r5) {
        String str;
        if (!r4.A09) {
            r4.A0D.A0C(r3);
        } else if (r3 != null) {
            C001700s r2 = r4.A0G;
            try {
                str = r3.A0C();
            } catch (MalformedURLException unused) {
                str = r3.A0Z;
            }
            r2.A0C(new AnonymousClass3JB(r3, r5, str));
        }
    }

    public static void A02(C145166tS r3, C39471sS r4, C52492pW r5) {
        String str;
        if (!r4.A09) {
            r4.A0D.A0C(r3);
        } else if (r3 != null) {
            C001700s r2 = r4.A0G;
            try {
                str = r3.A0C();
            } catch (MalformedURLException unused) {
                str = r3.A0Z;
            }
            r2.A0D(new AnonymousClass3JB(r3, r5, str));
        }
    }

    public static void A03(C39471sS r11, AnonymousClass11F r12, String str) {
        if (!C36341k9.A0E(r11.A0R).getBoolean("privacy_linkpreview", false)) {
            r11.A03 = new C75483nJ(r11, SystemClock.elapsedRealtime());
            String str2 = str;
            if (!(r12 instanceof C28981Uw) || !r11.A0Z.A00.A0E(5287)) {
                AnonymousClass17Y r2 = r11.A0H;
                C19770wU r8 = r11.A0c;
                C63983Me.A00(r2, new C145166tS(r11.A0I, r11.A0W, str), r11.A0S, r11.A0U, r11.A0V, r11.A03, r8, str2, r11.A0A);
                return;
            }
            AnonymousClass353 r3 = r11.A0g;
            C75913o0 r22 = new C75913o0(r11, str);
            AnonymousClass00C.A0D(str, 0);
            C36421kH.A1G(r3.A01, r3, r22, str, 4);
        }
    }

    public static void A04(C39471sS r2, UserJid userJid) {
        if (r2.A01 != null) {
            AnonymousClass3L0 A022 = r2.A0P.A02(userJid);
            if (A022 != null) {
                C145166tS r1 = r2.A01;
                r1.A0F = A022.A08;
                A01(r1, r2, C52492pW.PAGE_UPDATED);
                return;
            }
            r2.A0e.A01(new GetVNameCertificateJob(userJid));
        }
    }

    private void A05(UserJid userJid, AnonymousClass005 r8, String str) {
        this.A01 = new AnonymousClass28S(this.A0I, userJid, this.A0W, str);
        int dimensionPixelSize = this.A00.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        C206759tv A072 = this.A0M.A07(userJid);
        if (A072 != null) {
            ((C196089Xp) r8.get()).A02((ImageView) null, A072, (C22914AyQ) null, new C69343dN(this, userJid), 2);
            return;
        }
        C202279lS r3 = this.A0N;
        if (r3.A0B(userJid)) {
            int i = 1;
            if (r3.A08.A0M(userJid)) {
                i = 4;
            }
            C202279lS.A01(r3, userJid, dimensionPixelSize, i * 6, false);
            return;
        }
        C81193wc.A01(this.A0c, this, userJid, 4);
    }

    public void A0R() {
        for (Object A1O : this.A0d) {
            C36411kG.A1O(A1O);
        }
        Runnable runnable = this.A05;
        if (runnable != null) {
            this.A0B.removeCallbacks(runnable);
            this.A05 = null;
        }
        this.A03 = null;
    }

    public void A0T(C145166tS r3) {
        String str;
        if (this.A00 == 0 && r3 != null && (str = r3.A0Z) != null && str.equals(this.A06)) {
            this.A00 = 1;
            this.A01 = r3;
            this.A04 = null;
        }
    }

    public void A0U(AnonymousClass11F r5, AnonymousClass005 r6, String str) {
        if (str != null) {
            if (this.A0T.A0G(str)) {
                PhoneUserJid A042 = AnonymousClass1DW.A04(Uri.parse(str));
                if (A042 != null) {
                    A05(A042, r6, str);
                    return;
                }
            } else {
                C89034Uz r3 = this.A0O;
                C69313dK r2 = (C69313dK) r3;
                C20810yC r1 = r2.A07;
                if (!r1.A0E(832) && r1.A0E(1062) && r2.A0A.A01(str)) {
                    this.A01 = new AnonymousClass28T(this.A0I, this.A0W, str);
                    r3.BoO(this.A0a, str);
                    return;
                }
            }
            A03(this, r5, str);
        }
    }

    public void A0V(String str) {
        if (!C1901797e.A00(str, this.A06)) {
            this.A00 = 0;
            this.A06 = str;
            this.A07 = true;
            this.A01 = null;
            this.A04 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (android.text.TextUtils.equals(r0.A02, r4) == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.A06
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 == 0) goto L_0x002d
            r0 = 0
            r3.A07 = r0
            r2 = 0
            r3.A01 = r2
            r3.A04 = r2
            X.389 r0 = r3.A02
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            r1 = 1
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            X.389 r0 = r3.A02
            if (r0 == 0) goto L_0x002b
            if (r1 == 0) goto L_0x002b
            X.00s r1 = r3.A0F
            X.4R0 r0 = r0.A01
            r1.A0C(r0)
        L_0x002b:
            r3.A02 = r2
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39471sS.A0W(java.lang.String):void");
    }

    public void A0X(boolean z) {
        C145166tS r1;
        if (this.A00 == 1 && (r1 = this.A01) != null && r1.A0R != null && this.A07 && !(r1 instanceof AnonymousClass28U)) {
            this.A0c.Boy(new AnonymousClass75B(32, (Object) this, z));
        }
    }

    public boolean A0Y() {
        C145166tS r0 = this.A01;
        if (r0 == null || !TextUtils.equals(this.A06, r0.A0Z) || !this.A01.A0I() || !this.A07) {
            return false;
        }
        return true;
    }

    public void BrE(String str) {
        if (this.A00 != 3 || !this.A07 || !str.equals(this.A06)) {
            AnonymousClass389 r1 = this.A02;
            if (r1 != null && str.equals(r1.A02)) {
                this.A00 = 5;
                AnonymousClass3T1 r0 = r1.A00;
                if (r0 != null) {
                    this.A0E.A0C(Pair.create(r0, (Object) null));
                }
                this.A02 = null;
                return;
            }
            return;
        }
        this.A00 = 5;
        if (this.A09) {
            this.A0G.A0C(new AnonymousClass3JB((C145166tS) null, C52492pW.LARGE_THUMBNAIL_FAILED, (String) null));
        }
        this.A02 = null;
    }

    public void BrF(AnonymousClass3L1 r3, String str) {
        if (this.A00 == 1 && str.equals(this.A06)) {
            this.A00 = 2;
            if (this.A07) {
                this.A04 = r3;
            }
        }
    }

    public void BrG(AnonymousClass3L1 r6, String str) {
        if (this.A00 != 3 || !str.equals(this.A06)) {
            AnonymousClass389 r1 = this.A02;
            if (r1 != null && str.equals(r1.A02)) {
                this.A00 = 4;
                AnonymousClass3T1 r0 = r1.A00;
                if (r0 != null) {
                    this.A0E.A0C(Pair.create(r0, r6));
                }
            } else {
                return;
            }
        } else {
            this.A00 = 4;
            C145166tS r4 = this.A01;
            if (r4 != null && this.A09) {
                this.A0G.A0C(new AnonymousClass3JB(r4, C52492pW.LARGE_THUMBNAIL_LOADED, (String) null));
            }
            if (this.A07) {
                this.A04 = r6;
            }
        }
        this.A02 = null;
    }

    public void BrH(AnonymousClass4R0 r4, String str) {
        if (this.A00 == 2 && str.equals(this.A06)) {
            this.A00 = 3;
            AnonymousClass389 r0 = this.A02;
            if (r0 != null) {
                this.A0F.A0C(r0.A01);
            }
            this.A02 = null;
            this.A02 = new AnonymousClass389(this, r4, str);
        }
    }

    public C39471sS(Application application, Handler handler, AnonymousClass17Y r6, C20050ww r7, AnonymousClass164 r8, AnonymousClass19J r9, AnonymousClass1KK r10, C31751cK r11, C29461Ws r12, C202279lS r13, C89034Uz r14, AnonymousClass185 r15, AnonymousClass3FY r16, C19970wo r17, C19420v0 r18, C18820ts r19, AnonymousClass1DW r20, C20810yC r21, C21010yW r22, AnonymousClass1DU r23, AnonymousClass1D0 r24, AnonymousClass19A r25, AnonymousClass1GQ r26, AnonymousClass353 r27, C19770wU r28) {
        super(application);
        C001700s A0S2 = C36431kI.A0S();
        this.A0D = A0S2;
        this.A0G = C36431kI.A0S();
        this.A0C = AnonymousClass0VV.A00(new AnonymousClass4ZI(this, 6), A0S2);
        this.A0E = C36431kI.A0S();
        this.A0F = C36431kI.A0S();
        this.A0d = new LinkedList();
        this.A0a = new C90324Zy(this, 1);
        this.A0b = new C79153tG(this);
        this.A0f = r17;
        this.A0U = r21;
        this.A0H = r6;
        this.A0L = r11;
        this.A0c = r28;
        this.A0W = r23;
        this.A0V = r22;
        this.A0I = r7;
        this.A0O = r14;
        this.A0e = r8;
        this.A0Y = r25;
        this.A0N = r13;
        this.A0T = r20;
        this.A0S = r19;
        this.A0X = r24;
        this.A0Z = r26;
        this.A0J = r9;
        this.A0M = r12;
        this.A0P = r15;
        this.A0R = r18;
        this.A0K = r10;
        this.A0Q = r16;
        this.A0g = r27;
        this.A0B = handler;
    }
}
