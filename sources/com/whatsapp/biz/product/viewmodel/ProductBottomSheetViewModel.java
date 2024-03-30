package com.whatsapp.biz.product.viewmodel;

import X.AnonymousClass04S;
import X.AnonymousClass08X;
import X.AnonymousClass4PE;
import X.AnonymousClass6W7;
import X.AnonymousClass96V;
import X.AnonymousClass9N7;
import X.AnonymousClass9UA;
import X.AnonymousClass9UB;
import X.AnonymousClass9XI;
import X.AnonymousClass9Y1;
import X.BA7;
import X.C001600r;
import X.C001700s;
import X.C004702c;
import X.C023409w;
import X.C109915Zp;
import X.C134546bD;
import X.C134736bW;
import X.C159227j1;
import X.C167497y9;
import X.C178358fo;
import X.C18820ts;
import X.C194289Oy;
import X.C195419Uf;
import X.C19730wQ;
import X.C198909eO;
import X.C199439fJ;
import X.C202279lS;
import X.C207269up;
import X.C22464An3;
import X.C22487AnQ;
import X.C22909AyL;
import X.C29461Ws;
import X.C36431kI;
import X.C61223Ba;
import X.C64183Mz;
import android.app.Application;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ProductBottomSheetViewModel extends AnonymousClass08X {
    public C195419Uf A00;
    public C207269up A01;
    public C207269up A02;
    public UserJid A03;
    public String A04;
    public List A05 = C023409w.A00;
    public AtomicBoolean A06 = C36431kI.A1H();
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = true;
    public C167497y9 A0B;
    public final Application A0C;
    public final C001600r A0D;
    public final C001600r A0E;
    public final C001700s A0F;
    public final C19730wQ A0G;
    public final AnonymousClass9XI A0H;
    public final C29461Ws A0I;
    public final AnonymousClass9Y1 A0J;
    public final C202279lS A0K;
    public final C64183Mz A0L;
    public final C198909eO A0M;
    public final C199439fJ A0N;
    public final AnonymousClass9UB A0O;
    public final C001600r A0P;
    public final C001700s A0Q;
    public final C001700s A0R;
    public final AnonymousClass04S A0S;
    public final AnonymousClass04S A0T = new BA7(this, 21);
    public final C22909AyL A0U;
    public final C194289Oy A0V;
    public final C178358fo A0W;
    public final AnonymousClass9UA A0X;
    public final AnonymousClass4PE A0Y;
    public final C159227j1 A0Z;
    public final AnonymousClass9N7 A0a;
    public final AnonymousClass6W7 A0b;
    public final C18820ts A0c;
    public final C61223Ba A0d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProductBottomSheetViewModel(android.app.Application r17, X.C19730wQ r18, X.C22909AyL r19, X.AnonymousClass9XI r20, X.C178358fo r21, X.AnonymousClass9UA r22, X.AnonymousClass4PE r23, X.C29461Ws r24, X.AnonymousClass9Y1 r25, X.C202279lS r26, X.C64183Mz r27, X.C198909eO r28, X.AnonymousClass9N7 r29, X.AnonymousClass6W7 r30, X.C199439fJ r31, X.AnonymousClass9UB r32, X.C18820ts r33, X.C61223Ba r34) {
        /*
            r16 = this;
            r4 = 1
            r15 = r17
            X.AnonymousClass00C.A0D(r15, r4)
            r2 = r31
            r9 = r24
            r12 = r20
            r14 = r18
            X.C36321k7.A19(r9, r14, r12, r2)
            r5 = r30
            r1 = r33
            r0 = r34
            r8 = r25
            r10 = r23
            X.C36321k7.A1C(r1, r10, r8, r0, r5)
            r3 = 11
            r7 = r26
            X.AnonymousClass00C.A0D(r7, r3)
            r3 = 15
            r11 = r21
            X.AnonymousClass00C.A0D(r11, r3)
            r3 = 16
            r6 = r28
            X.AnonymousClass00C.A0D(r6, r3)
            r3 = 18
            r13 = r19
            X.AnonymousClass00C.A0D(r13, r3)
            r3 = r16
            r3.<init>(r15)
            r3.A0C = r15
            r3.A0I = r9
            r3.A0G = r14
            r3.A0H = r12
            r3.A0N = r2
            r3.A0c = r1
            r3.A0Y = r10
            r3.A0J = r8
            r3.A0d = r0
            r3.A0b = r5
            r3.A0K = r7
            r0 = r32
            r3.A0O = r0
            r0 = r29
            r3.A0a = r0
            r0 = r27
            r3.A0L = r0
            r3.A0W = r11
            r3.A0M = r6
            r0 = r22
            r3.A0X = r0
            r3.A0U = r13
            X.BAO r2 = new X.BAO
            r2.<init>(r3, r4)
            r3.A0Z = r2
            r0 = 3
            X.B76 r1 = new X.B76
            r1.<init>(r3, r0)
            r3.A0V = r1
            java.util.List r0 = r7.A0N
            r0.add(r2)
            r11.registerObserver(r1)
            r1 = 21
            X.BA7 r0 = new X.BA7
            r0.<init>(r3, r1)
            r3.A0T = r0
            X.09w r0 = X.C023409w.A00
            r3.A05 = r0
            r3.A0A = r4
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C36431kI.A1H()
            r3.A06 = r0
            X.00s r0 = X.C36431kI.A0S()
            r3.A0Q = r0
            X.08S r0 = X.AnonymousClass0VV.A01(r0)
            r3.A0E = r0
            X.00s r0 = X.C36431kI.A0S()
            r3.A0F = r0
            r3.A0D = r0
            X.00s r0 = X.C36431kI.A0S()
            r3.A0R = r0
            r3.A0P = r0
            r1 = 20
            X.BA7 r0 = new X.BA7
            r0.<init>(r3, r1)
            r3.A0S = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel.<init>(android.app.Application, X.0wQ, X.AyL, X.9XI, X.8fo, X.9UA, X.4PE, X.1Ws, X.9Y1, X.9lS, X.3Mz, X.9eO, X.9N7, X.6W7, X.9fJ, X.9UB, X.0ts, X.3Ba):void");
    }

    public final void A0T(UserJid userJid, String str) {
        Set A002;
        C134736bW r0;
        C134546bD r02;
        List list;
        this.A09 = false;
        this.A0a.A00 = userJid;
        this.A04 = str;
        this.A03 = userJid;
        C207269up A062 = this.A0I.A06(userJid, str);
        if (this.A02 != null || !this.A0A) {
            this.A0A = false;
        } else {
            this.A01 = A062;
        }
        this.A02 = A062;
        if (this.A0B == null) {
            C167497y9 B3s = this.A0Y.B3s(userJid);
            this.A0B = B3s;
            B3s.A00.A0A(this.A0S);
            C167497y9 r03 = this.A0B;
            if (r03 != null) {
                r03.A0T();
            }
        }
        if (this.A00 == null) {
            C195419Uf B3r = this.A0U.B3r(userJid);
            this.A00 = B3r;
            B3r.A03.A0A(this.A0T);
            C195419Uf r04 = this.A00;
            if (r04 != null) {
                r04.A00();
            }
        }
        C207269up r05 = this.A02;
        if (!(r05 == null || (r0 = r05.A0B) == null || (r02 = r0.A00) == null || (list = r02.A00) == null || list.isEmpty())) {
            C198909eO r1 = this.A0M;
            C198909eO.A00(r1, new C22464An3(r1, true));
        }
        A01(this);
        if (this.A0A || !this.A08) {
            A002 = AnonymousClass96V.A00();
        } else {
            A002 = C004702c.A00;
        }
        this.A0O.A01(userJid, A002, new C22487AnQ(this, userJid, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        if (r0.A09 != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r1.A01() == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel r19) {
        /*
            r0 = r19
            X.9up r1 = r0.A02
            if (r1 == 0) goto L_0x008c
            boolean r2 = r0.A07
            if (r2 == 0) goto L_0x0011
            boolean r2 = r1.A01()
            r13 = 1
            if (r2 != 0) goto L_0x0012
        L_0x0011:
            r13 = 0
        L_0x0012:
            X.7y9 r4 = r0.A0B
            if (r4 == 0) goto L_0x0020
            X.0ts r3 = r0.A0c
            java.util.List r2 = r0.A05
            java.lang.String r7 = r4.A0S(r3, r2)
            if (r7 != 0) goto L_0x0022
        L_0x0020:
            java.lang.String r7 = ""
        L_0x0022:
            X.9up r2 = r0.A02
            if (r2 == 0) goto L_0x0089
            long r8 = r2.A09
        L_0x0028:
            X.7y9 r2 = r0.A0B
            if (r2 == 0) goto L_0x0086
            java.util.List r3 = r0.A05
            java.lang.String r2 = r1.A0F
            long r10 = X.C167497y9.A01(r2, r3)
        L_0x0034:
            X.9UA r3 = r0.A0X
            com.whatsapp.jid.UserJid r2 = r0.A03
            boolean r12 = r3.A01(r2)
            X.00s r2 = r0.A0Q
            java.lang.String r6 = r1.A05
            java.math.BigDecimal r5 = r1.A06
            X.6Tk r4 = r1.A04
            X.6bV r15 = r1.A02
            X.0ts r3 = r0.A0c
            java.util.Date r19 = new java.util.Date
            r19.<init>()
            android.app.Application r14 = r0.A0C
            r17 = r3
            r18 = r5
            r16 = r4
            android.text.SpannableString r4 = X.AnonymousClass6W7.A01(r14, r15, r16, r17, r18, r19)
            X.9up r5 = r0.A02
            int r3 = r1.A00
            boolean r14 = X.AnonymousClass000.A1Q(r3)
            boolean r15 = r0.A0A
            X.6bW r1 = r1.A0B
            if (r1 == 0) goto L_0x0075
            X.6bD r1 = r1.A00
            if (r1 == 0) goto L_0x0075
            java.util.List r1 = r1.A00
            if (r1 == 0) goto L_0x0075
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x007b
        L_0x0075:
            boolean r0 = r0.A09
            r16 = 0
            if (r0 == 0) goto L_0x007d
        L_0x007b:
            r16 = 1
        L_0x007d:
            X.A9O r3 = new X.A9O
            r3.<init>(r4, r5, r6, r7, r8, r10, r12, r13, r14, r15, r16)
            r2.A0C(r3)
            return
        L_0x0086:
            r10 = 0
            goto L_0x0034
        L_0x0089:
            r8 = 99
            goto L_0x0028
        L_0x008c:
            X.00s r2 = r0.A0Q
            boolean r1 = r0.A0A
            X.A9N r0 = new X.A9N
            r0.<init>(r1)
            r2.A0C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel.A01(com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel):void");
    }

    public void A0R() {
        C167497y9 r0 = this.A0B;
        if (r0 != null) {
            r0.A00.A0B(this.A0S);
        }
        C195419Uf r02 = this.A00;
        if (r02 != null) {
            r02.A03.A0B(this.A0T);
        }
    }

    public final void A0S(long j) {
        UserJid userJid;
        C195419Uf r0;
        C207269up A002 = C109915Zp.A00(this.A02, this.A01);
        if (A002 != null && (userJid = this.A03) != null && (r0 = this.A00) != null) {
            r0.A01(A002, userJid, (String) null, (String) null, (String) null, j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r1 != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0U(boolean r6) {
        /*
            r5 = this;
            X.9up r0 = r5.A02
            r2 = 0
            if (r0 == 0) goto L_0x0027
            X.6bW r0 = r0.A0B
            if (r0 == 0) goto L_0x0027
            X.6bD r0 = r0.A00
            if (r0 == 0) goto L_0x0027
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0027
            int r0 = r0.size()
        L_0x0015:
            r4 = 1
            boolean r1 = X.AnonymousClass000.A1R(r0)
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x0021
            r3 = 1
            if (r1 == 0) goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            if (r6 != 0) goto L_0x0029
            if (r3 != 0) goto L_0x0029
            return r2
        L_0x0027:
            r0 = 0
            goto L_0x0015
        L_0x0029:
            X.00s r2 = r5.A0F
            android.app.Application r1 = r5.A0C
            r0 = 2131887631(0x7f12060f, float:1.9409875E38)
            java.lang.String r1 = X.C36361kB.A0m(r1, r0)
            X.9VV r0 = new X.9VV
            r0.<init>(r1, r3)
            r2.A0C(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel.A0U(boolean):boolean");
    }
}
