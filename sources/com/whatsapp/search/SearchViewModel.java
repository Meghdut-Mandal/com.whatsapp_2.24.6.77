package com.whatsapp.search;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00N;
import X.AnonymousClass040;
import X.AnonymousClass04R;
import X.AnonymousClass05R;
import X.AnonymousClass08M;
import X.AnonymousClass08S;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass16D;
import X.AnonymousClass16J;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass191;
import X.AnonymousClass19R;
import X.AnonymousClass1A5;
import X.AnonymousClass1A6;
import X.AnonymousClass1DU;
import X.AnonymousClass1IB;
import X.AnonymousClass1LU;
import X.AnonymousClass1Q5;
import X.AnonymousClass1QW;
import X.AnonymousClass1RY;
import X.AnonymousClass1S0;
import X.AnonymousClass1S2;
import X.AnonymousClass1S5;
import X.AnonymousClass1S6;
import X.AnonymousClass1S8;
import X.AnonymousClass1SA;
import X.AnonymousClass1SB;
import X.AnonymousClass1SD;
import X.AnonymousClass2RY;
import X.AnonymousClass2S2;
import X.AnonymousClass2bU;
import X.AnonymousClass2dO;
import X.AnonymousClass3II;
import X.AnonymousClass67J;
import X.AnonymousClass6DA;
import X.AnonymousClass6E6;
import X.AnonymousClass6TR;
import X.AnonymousClass6YD;
import X.AnonymousClass7gQ;
import X.C001600r;
import X.C001700s;
import X.C005602m;
import X.C023409w;
import X.C106435Jr;
import X.C131436Pa;
import X.C132056Ry;
import X.C134786bb;
import X.C134826bf;
import X.C142626pB;
import X.C146816wD;
import X.C1512578v;
import X.C165137sw;
import X.C177538dx;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C18840tu;
import X.C1901797e;
import X.C19420v0;
import X.C19460v5;
import X.C19620wF;
import X.C19630wG;
import X.C19770wU;
import X.C19930wk;
import X.C19970wo;
import X.C20650xu;
import X.C20800yB;
import X.C20810yC;
import X.C21000yV;
import X.C21010yW;
import X.C21690ze;
import X.C222813r;
import X.C230116v;
import X.C235718z;
import X.C26591Kt;
import X.C27111My;
import X.C27121Mz;
import X.C28051Rb;
import X.C28071Rf;
import X.C28081Rg;
import X.C28091Rh;
import X.C28111Rj;
import X.C28121Rk;
import X.C28131Rl;
import X.C28141Rm;
import X.C28151Rn;
import X.C28161Ro;
import X.C28171Rp;
import X.C28181Rq;
import X.C28191Rr;
import X.C28201Rs;
import X.C28211Rt;
import X.C28221Ru;
import X.C28231Rv;
import X.C28241Rw;
import X.C28261Ry;
import X.C28271Rz;
import X.C35731jA;
import X.C36091jk;
import X.C36181jt;
import X.C36191ju;
import X.C36201jv;
import X.C36211jw;
import X.C88934Up;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.R;
import com.whatsapp.data.repository.MetaAISearchRepository;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class SearchViewModel extends AnonymousClass04R implements C28051Rb, AnonymousClass00N {
    public long A00;
    public SparseIntArray A01;
    public AnonymousClass08S A02;
    public AnonymousClass6YD A03;
    public UserJid A04;
    public C134826bf A05;
    public AnonymousClass1SB A06;
    public C28211Rt A07;
    public C28261Ry A08;
    public C28221Ru A09;
    public AnonymousClass1SD A0A;
    public AnonymousClass2dO A0B;
    public C134786bb A0C;
    public C28201Rs A0D = new C28201Rs();
    public Integer A0E;
    public Runnable A0F;
    public Runnable A0G;
    public String A0H;
    public List A0I;
    public List A0J;
    public List A0K;
    public List A0L;
    public List A0M;
    public List A0N;
    public List A0O;
    public int A0P;
    public C28181Rq A0Q;
    public AISearchTypeAheadSuggestionsProvider A0R;
    public AnonymousClass1S8 A0S;
    public boolean A0T;
    public final Handler A0U;
    public final C001600r A0V;
    public final C001600r A0W;
    public final C001600r A0X;
    public final C001600r A0Y;
    public final C001600r A0Z;
    public final AnonymousClass08S A0a = new AnonymousClass08S();
    public final AnonymousClass08S A0b;
    public final AnonymousClass08S A0c;
    public final AnonymousClass08S A0d;
    public final AnonymousClass08S A0e = new AnonymousClass08S();
    public final AnonymousClass08S A0f;
    public final AnonymousClass08S A0g;
    public final C001700s A0h;
    public final C001700s A0i;
    public final C001700s A0j = new C001700s();
    public final AnonymousClass08M A0k;
    public final C19460v5 A0l;
    public final C19460v5 A0m;
    public final C28141Rm A0n;
    public final AnonymousClass17Y A0o;
    public final C19630wG A0p;
    public final C19420v0 A0q;
    public final C18820ts A0r;
    public final C20650xu A0s;
    public final AnonymousClass191 A0t;
    public final AnonymousClass16J A0u;
    public final C20810yC A0v;
    public final AnonymousClass1DU A0w;
    public final AnonymousClass1S2 A0x;
    public final AnonymousClass1S5 A0y;
    public final AnonymousClass1S6 A0z;
    public final C28111Rj A10;
    public final C28081Rg A11;
    public final C28201Rs A12 = new C28201Rs();
    public final C28201Rs A13 = new C28201Rs();
    public final C28201Rs A14 = new C28201Rs();
    public final C28201Rs A15 = new C28201Rs();
    public final C28201Rs A16 = new C28201Rs();
    public final C28201Rs A17 = new C28201Rs();
    public final C28201Rs A18 = new C28201Rs();
    public final C28201Rs A19 = new C28201Rs();
    public final C28201Rs A1A = new C28201Rs();
    public final C28201Rs A1B = new C28201Rs();
    public final C19770wU A1C;
    public final AnonymousClass005 A1D;
    public final AtomicBoolean A1E;
    public final AtomicBoolean A1F;
    public final C001600r A1G;
    public final C19460v5 A1H;
    public final C28191Rr A1I;
    public final AnonymousClass171 A1J;
    public final AnonymousClass1RY A1K;
    public final AnonymousClass1A6 A1L;
    public final C19970wo A1M;
    public final AnonymousClass1LU A1N;
    public final C28071Rf A1O;
    public final AnonymousClass1QW A1P;
    public final C28241Rw A1Q;
    public final C28091Rh A1R;
    public final C19930wk A1S;
    public final AnonymousClass005 A1T;

    public void A0c() {
        A0h(0);
        A0j((UserJid) null);
        A0n((C134786bb) null);
        A0q(false);
        A0r(false);
        A0o("");
        this.A0k.A03("user_grid_view_choice", (Object) null);
        this.A0D.A0D((Object) null);
        this.A0M = new ArrayList();
        this.A0K = new ArrayList();
        this.A0O = new ArrayList();
        this.A0L = new ArrayList();
        this.A07 = new C28211Rt();
        Runnable runnable = this.A0G;
        if (runnable != null) {
            runnable.run();
        }
        this.A0N = new ArrayList();
        this.A09 = new C28221Ru();
        this.A0z.A04.A0D(new C28211Rt());
        this.A0y.A00.A0D(new ArrayList());
        this.A0x.A01.A0D(new ArrayList());
        AnonymousClass6YD r0 = this.A03;
        if (r0 != null) {
            r0.A06.A0D(C023409w.A00);
        }
        AnonymousClass1SD r02 = this.A0A;
        if (r02 != null) {
            r02.A00.A0D((Object) null);
        }
        A07(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0348, code lost:
        if (r4.A03.size() <= 0) goto L_0x034a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x036d, code lost:
        if (r4.A00.size() <= 0) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0399, code lost:
        if (r8.A09() != false) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03a9, code lost:
        if (r8.A0J.isEmpty() == false) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04f7, code lost:
        if (r16 == false) goto L_0x0497;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x022a, code lost:
        if (r8.A0s() == false) goto L_0x022c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0502  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x023f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C1512578v A01(com.whatsapp.search.SearchViewModel r20) {
        /*
            r8 = r20
            X.0wG r9 = r8.A0p
            X.1DU r1 = r8.A0w
            X.0ts r0 = r8.A0r
            X.78v r7 = new X.78v
            r7.<init>(r9, r0, r1)
            X.08S r6 = r8.A0g
            java.lang.Object r0 = r6.A04()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r5 = 0
            if (r0 == 0) goto L_0x01be
            com.whatsapp.jid.UserJid r0 = r8.A0Y()
            if (r0 != 0) goto L_0x01be
            int r0 = r8.A0U()
            if (r0 != 0) goto L_0x01be
            X.6bb r0 = r8.A0a()
            if (r0 != 0) goto L_0x01be
            X.6bf r0 = r8.A0Z()
            if (r0 != 0) goto L_0x01be
            monitor-enter(r8)
            X.6YD r0 = r8.A03     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x0049
            android.util.SparseIntArray r2 = r8.A01     // Catch:{ all -> 0x01bb }
            r0 = 98
            r1 = -1
            int r0 = r2.get(r0, r1)     // Catch:{ all -> 0x01bb }
            if (r0 == r1) goto L_0x0049
            android.util.SparseIntArray r0 = r8.A01     // Catch:{ all -> 0x01bb }
            r0.clear()     // Catch:{ all -> 0x01bb }
        L_0x0049:
            X.0yC r6 = r8.A0v     // Catch:{ all -> 0x01bb }
            r0 = 1608(0x648, float:2.253E-42)
            X.0yV r10 = X.C21000yV.A02     // Catch:{ all -> 0x01bb }
            boolean r0 = X.C20800yB.A01(r10, r6, r0)     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x005e
            android.util.SparseIntArray r2 = r8.A01     // Catch:{ all -> 0x01bb }
            r1 = 117(0x75, float:1.64E-43)
            r0 = 8
            r2.put(r1, r0)     // Catch:{ all -> 0x01bb }
        L_0x005e:
            r0 = 2662(0xa66, float:3.73E-42)
            boolean r0 = X.C20800yB.A01(r10, r6, r0)     // Catch:{ all -> 0x01bb }
            r3 = 1
            if (r0 == 0) goto L_0x006e
            android.util.SparseIntArray r1 = r8.A01     // Catch:{ all -> 0x01bb }
            r0 = 111(0x6f, float:1.56E-43)
            r1.put(r0, r3)     // Catch:{ all -> 0x01bb }
        L_0x006e:
            android.util.SparseIntArray r2 = r8.A01     // Catch:{ all -> 0x01bb }
            r1 = 105(0x69, float:1.47E-43)
            r0 = 7
            r2.put(r1, r0)     // Catch:{ all -> 0x01bb }
            r1 = 118(0x76, float:1.65E-43)
            r0 = 6
            r2.put(r1, r0)     // Catch:{ all -> 0x01bb }
            r1 = 108(0x6c, float:1.51E-43)
            r0 = 5
            r2.put(r1, r0)     // Catch:{ all -> 0x01bb }
            r1 = 103(0x67, float:1.44E-43)
            r0 = 4
            r2.put(r1, r0)     // Catch:{ all -> 0x01bb }
            r1 = 97
            r0 = 3
            r2.put(r1, r0)     // Catch:{ all -> 0x01bb }
            r1 = 100
            r0 = 2
            r2.put(r1, r0)     // Catch:{ all -> 0x01bb }
            r2.put(r5, r3)     // Catch:{ all -> 0x01bb }
            monitor-exit(r8)     // Catch:{ all -> 0x01bb }
            X.6CJ r3 = new X.6CJ
            r3.<init>()
            X.0yV r4 = X.C21000yV.A01
            r0 = 7413(0x1cf5, float:1.0388E-41)
            boolean r1 = X.C20800yB.A01(r4, r6, r0)
            android.util.SparseIntArray r0 = r8.A01
            if (r1 == 0) goto L_0x00b7
            r3.A00 = r0
        L_0x00ab:
            r0 = 1287(0x507, float:1.803E-42)
            boolean r0 = X.C20800yB.A01(r10, r6, r0)
            if (r0 == 0) goto L_0x00e4
            X.1Rh r1 = r8.A1R
            monitor-enter(r1)
            goto L_0x00c5
        L_0x00b7:
            android.util.SparseIntArray r2 = r0.clone()
            r1 = 4
            X.5Jk r0 = new X.5Jk
            r0.<init>(r2, r1)
            r7.add(r0)
            goto L_0x00ab
        L_0x00c5:
            java.util.List r2 = r1.A00     // Catch:{ all -> 0x00d1 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x00d4
            X.C28091Rh.A00(r1)     // Catch:{ all -> 0x00d1 }
            goto L_0x00d4
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00d4:
            monitor-exit(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            r0 = 7413(0x1cf5, float:1.0388E-41)
            boolean r0 = X.C20800yB.A01(r4, r6, r0)
            if (r0 == 0) goto L_0x01aa
            r3.A03 = r1
        L_0x00e4:
            X.6TR r0 = X.AnonymousClass6YD.A0P
            boolean r0 = r0.A02(r6)
            if (r0 == 0) goto L_0x0102
            r0 = 7413(0x1cf5, float:1.0388E-41)
            boolean r1 = X.C20800yB.A01(r4, r6, r0)
            X.005 r0 = r8.A1T
            java.lang.Object r0 = r0.get()
            X.67J r0 = (X.AnonymousClass67J) r0
            java.util.List r0 = r0.A01()
            if (r1 == 0) goto L_0x0199
            r3.A02 = r0
        L_0x0102:
            X.1QW r2 = r8.A1P
            X.0yC r1 = r2.A03
            r0 = 1206(0x4b6, float:1.69E-42)
            boolean r0 = X.C20800yB.A01(r10, r1, r0)
            if (r0 == 0) goto L_0x0174
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x0174
            r0 = 7413(0x1cf5, float:1.0388E-41)
            boolean r12 = X.C20800yB.A01(r4, r6, r0)
            android.content.Context r11 = r9.A00
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.String r10 = "273819889375819"
            r0 = 2131886737(0x7f120291, float:1.9408061E38)
            java.lang.String r2 = r11.getString(r0)
            int r1 = X.C110175aF.A00(r10)
            X.6bR r0 = new X.6bR
            r0.<init>(r10, r2, r1)
            r9.add(r0)
            java.lang.String r10 = "150108431712141"
            r0 = 2131886736(0x7f120290, float:1.940806E38)
            java.lang.String r2 = r11.getString(r0)
            int r1 = X.C110175aF.A00(r10)
            X.6bR r0 = new X.6bR
            r0.<init>(r10, r2, r1)
            r9.add(r0)
            java.lang.String r10 = "1086422341396773"
            r0 = 2131886734(0x7f12028e, float:1.9408055E38)
            java.lang.String r2 = r11.getString(r0)
            int r1 = X.C110175aF.A00(r10)
            X.6bR r0 = new X.6bR
            r0.<init>(r10, r2, r1)
            r9.add(r0)
            r0 = 2131896785(0x7f1229d1, float:1.9428441E38)
            java.lang.String r2 = r11.getString(r0)
            r1 = 0
            X.6bR r0 = new X.6bR
            r0.<init>(r1, r2, r5)
            r9.add(r0)
            if (r12 == 0) goto L_0x018e
            r3.A01 = r9
        L_0x0174:
            r0 = 7413(0x1cf5, float:1.0388E-41)
            boolean r0 = X.C20800yB.A01(r4, r6, r0)
            if (r0 == 0) goto L_0x0186
            r1 = 46
            X.5Jk r0 = new X.5Jk
            r0.<init>(r3, r1)
            r7.add(r0)
        L_0x0186:
            X.08S r0 = r8.A0c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            goto L_0x05ac
        L_0x018e:
            r1 = 23
            X.5Jk r0 = new X.5Jk
            r0.<init>(r9, r1)
            r7.add(r0)
            goto L_0x0174
        L_0x0199:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            r1 = 100
            X.5Jk r0 = new X.5Jk
            r0.<init>(r2, r1)
            r7.add(r0)
            goto L_0x0102
        L_0x01aa:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r1 = 22
            X.5Jk r0 = new X.5Jk
            r0.<init>(r2, r1)
            r7.add(r0)
            goto L_0x00e4
        L_0x01bb:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01bb }
            throw r0
        L_0x01be:
            X.1Rt r0 = r8.A07
            X.1Rt r4 = r0.A00()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.1S2 r0 = r8.A0x
            X.00s r0 = r0.A03
            java.lang.Object r0 = r0.A04()
            boolean r20 = r1.equals(r0)
            X.1S5 r0 = r8.A0y
            X.00s r0 = r0.A02
            java.lang.Object r0 = r0.A04()
            boolean r19 = r1.equals(r0)
            if (r20 != 0) goto L_0x01f2
            if (r19 != 0) goto L_0x01f2
            X.1SB r0 = r8.A06
            if (r0 == 0) goto L_0x05b0
            X.00s r0 = r0.A07
            java.lang.Object r0 = r0.A04()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05b0
        L_0x01f2:
            r18 = 1
        L_0x01f4:
            r17 = 1
        L_0x01f6:
            boolean r16 = A0C(r8)
            boolean r15 = A0B(r8)
            java.util.List r9 = r4.A02
            int r1 = r9.size()
            r0 = 5
            r14 = 0
            if (r1 <= r0) goto L_0x0209
            r14 = 1
        L_0x0209:
            if (r15 == 0) goto L_0x021b
            int r13 = r8.A0U()
            r12 = 118(0x76, float:1.65E-43)
            r11 = 105(0x69, float:1.47E-43)
            r10 = 103(0x67, float:1.44E-43)
            if (r13 == r10) goto L_0x04fa
            if (r13 == r11) goto L_0x04fa
            if (r13 == r12) goto L_0x04fa
        L_0x021b:
            X.08S r2 = r8.A0c
            java.util.List r0 = r4.A01
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x022c
            boolean r1 = r8.A0s()
            r0 = 1
            if (r1 != 0) goto L_0x022d
        L_0x022c:
            r0 = 0
        L_0x022d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0C(r0)
            X.08S r1 = r8.A0b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r1.A0C(r0)
            if (r20 != 0) goto L_0x05af
            X.2dO r0 = r8.A0B
            if (r0 == 0) goto L_0x0246
            r7.add(r0)
        L_0x0246:
            java.util.List r0 = r8.A0K
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0260
            X.0yC r2 = r8.A0v
            r1 = 6740(0x1a54, float:9.445E-42)
            X.0yV r0 = X.C21000yV.A02
            int r1 = X.C20800yB.A00(r0, r2, r1)
            r0 = 1
            if (r1 != r0) goto L_0x0260
            X.5Jk r0 = X.C1512578v.A00
            r7.add(r0)
        L_0x0260:
            java.util.List r0 = r8.A0K
            r7.addAll(r0)
            if (r19 != 0) goto L_0x05af
            java.util.List r0 = r8.A0M
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0281
            X.0yC r2 = r8.A0v
            r1 = 6740(0x1a54, float:9.445E-42)
            X.0yV r0 = X.C21000yV.A02
            int r1 = X.C20800yB.A00(r0, r2, r1)
            r0 = 1
            if (r1 != r0) goto L_0x0281
            X.5Jk r0 = X.C1512578v.A09
            r7.add(r0)
        L_0x0281:
            java.util.List r0 = r8.A0M
            r7.addAll(r0)
            java.util.List r0 = r8.A0I
            if (r0 == 0) goto L_0x02af
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02af
            r0 = 2131893877(0x7f121e75, float:1.9422543E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 1
            X.5Jk r0 = new X.5Jk
            r0.<init>(r2, r1)
            r7.add(r0)
            java.util.List r2 = r8.A0I
            int r1 = r8.A0P
            int r0 = r2.size()
            int r0 = java.lang.Math.min(r1, r0)
            r7.A04(r2, r5, r0)
        L_0x02af:
            X.1SB r1 = r8.A06
            if (r1 == 0) goto L_0x02c4
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x02c4
            X.17Y r2 = r8.A0o
            r1 = 34
            X.1jA r0 = new X.1jA
            r0.<init>((com.whatsapp.search.SearchViewModel) r8, (int) r1)
            r2.A0H(r0)
            return r7
        L_0x02c4:
            if (r18 != 0) goto L_0x05af
            if (r1 == 0) goto L_0x02da
            java.util.List r0 = r8.A0O
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02da
            X.5Jk r0 = X.C1512578v.A04
            r7.add(r0)
            java.util.List r0 = r8.A0O
            r7.addAll(r0)
        L_0x02da:
            if (r17 != 0) goto L_0x05af
            java.util.List r0 = r8.A0N
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x02ee
            X.5Jk r0 = X.C1512578v.A02
            r7.add(r0)
            java.util.List r0 = r8.A0N
            r7.addAll(r0)
        L_0x02ee:
            X.0xu r0 = r8.A0s
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x0326
            X.0v0 r0 = r8.A0q
            X.005 r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "backup_restore_state"
            int r1 = r1.getInt(r0, r5)
            r0 = 512(0x200, float:7.175E-43)
            if (r1 != r0) goto L_0x0326
            int r0 = r7.size()
            if (r0 == 0) goto L_0x031d
            java.lang.Object r0 = r6.A04()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x031d
            return r7
        L_0x031d:
            X.5Jk r0 = X.C1512578v.A06
            r7.add(r0)
            X.5Jk r0 = X.C1512578v.A01
            goto L_0x03d0
        L_0x0326:
            boolean r0 = r8.A09()
            if (r0 == 0) goto L_0x033b
            android.util.SparseIntArray r0 = r8.A01
            android.util.SparseIntArray r2 = r0.clone()
            r1 = 4
            X.5Jk r0 = new X.5Jk
            r0.<init>(r2, r1)
            r7.add(r0)
        L_0x033b:
            int r0 = r8.A0U()
            if (r0 != 0) goto L_0x034a
            java.util.List r0 = r4.A03
            int r0 = r0.size()
            r6 = 1
            if (r0 > 0) goto L_0x034b
        L_0x034a:
            r6 = 0
        L_0x034b:
            java.util.List r0 = r8.A0K
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0360
            java.util.List r0 = r8.A0M
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0360
            if (r6 != 0) goto L_0x0360
            r8.A09()
        L_0x0360:
            int r0 = r8.A0U()
            if (r0 != 0) goto L_0x036f
            java.util.List r0 = r4.A00
            int r0 = r0.size()
            r2 = 1
            if (r0 > 0) goto L_0x0370
        L_0x036f:
            r2 = 0
        L_0x0370:
            java.util.List r0 = r8.A0K
            int r0 = r0.size()
            if (r0 > 0) goto L_0x039b
            java.util.List r0 = r8.A0M
            int r0 = r0.size()
            if (r0 > 0) goto L_0x039b
            java.util.List r0 = r8.A0O
            int r0 = r0.size()
            if (r0 > 0) goto L_0x039b
            if (r6 != 0) goto L_0x038c
            if (r2 == 0) goto L_0x0394
        L_0x038c:
            java.util.List r0 = r4.A04
            int r0 = r0.size()
            if (r0 > 0) goto L_0x039b
        L_0x0394:
            boolean r0 = r8.A09()
            r10 = 0
            if (r0 == 0) goto L_0x039c
        L_0x039b:
            r10 = 1
        L_0x039c:
            X.6bf r0 = r8.A0Z()
            if (r0 != 0) goto L_0x03ab
            java.util.List r0 = r8.A0J
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x03ac
        L_0x03ab:
            r1 = 0
        L_0x03ac:
            r3 = r10 ^ 1
            r3 = r3 & r14
            if (r10 == 0) goto L_0x03d4
            boolean r0 = r8.A09()
            if (r0 != 0) goto L_0x03d4
            if (r1 == 0) goto L_0x03d4
            int r0 = r9.size()
            if (r0 != 0) goto L_0x03d4
            if (r16 != 0) goto L_0x03d4
            X.00r r0 = r8.A0Z
            java.lang.Object r0 = r0.A04()
            if (r0 != 0) goto L_0x03d4
            X.5Jk r0 = X.C1512578v.A06
            r7.add(r0)
            X.5Jk r0 = X.C1512578v.A07
        L_0x03d0:
            r7.add(r0)
            return r7
        L_0x03d4:
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x045a
            if (r6 == 0) goto L_0x03e8
            X.5Jk r0 = X.C1512578v.A0A
            r7.add(r0)
            X.0yC r1 = r8.A0v
            java.util.List r0 = r4.A03
            r7.A02(r1, r0, r5)
        L_0x03e8:
            if (r2 == 0) goto L_0x042f
            X.1Rf r9 = r8.A1O
            java.lang.Runnable r2 = r9.A01
            if (r2 == 0) goto L_0x0404
            android.os.Handler r1 = r9.A00
            if (r1 != 0) goto L_0x0401
            X.19W r0 = r9.A08
            android.os.Looper r0 = r0.A00()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            r9.A00 = r1
        L_0x0401:
            r1.removeCallbacks(r2)
        L_0x0404:
            r0 = 45
            X.1j6 r6 = new X.1j6
            r6.<init>(r9, r0)
            r9.A01 = r6
            android.os.Handler r2 = r9.A00
            if (r2 != 0) goto L_0x041e
            X.19W r0 = r9.A08
            android.os.Looper r0 = r0.A00()
            android.os.Handler r2 = new android.os.Handler
            r2.<init>(r0)
            r9.A00 = r2
        L_0x041e:
            r0 = 450(0x1c2, double:2.223E-321)
            r2.postDelayed(r6, r0)
            X.5Jk r0 = X.C1512578v.A05
            r7.add(r0)
            X.0yC r1 = r8.A0v
            java.util.List r0 = r4.A00
            r7.A02(r1, r0, r5)
        L_0x042f:
            if (r10 == 0) goto L_0x0436
            X.5Jk r0 = X.C1512578v.A06
            r7.add(r0)
        L_0x0436:
            java.util.List r0 = r8.A0L
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0453
            java.util.List r1 = r8.A0L
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            X.5ms r2 = new X.5ms
            r2.<init>(r0)
            r1 = 6
            X.5Jk r0 = new X.5Jk
            r0.<init>(r2, r1)
            r7.add(r0)
        L_0x0453:
            X.0yC r1 = r8.A0v
            java.util.List r0 = r4.A04
            r7.A02(r1, r0, r3)
        L_0x045a:
            X.6bf r0 = r8.A0Z()
            if (r0 != 0) goto L_0x0462
            if (r16 != 0) goto L_0x0467
        L_0x0462:
            java.util.List r0 = r8.A0J
            r7.addAll(r0)
        L_0x0467:
            X.6YD r0 = r8.A03
            if (r0 == 0) goto L_0x04f7
            X.6bf r0 = r8.A0Z()
            if (r0 != 0) goto L_0x04f7
            if (r16 != 0) goto L_0x04c6
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0497
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.6YD r0 = r8.A03
            X.00s r0 = r0.A08
            java.lang.Object r0 = r0.A04()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0497
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1 = 29
            X.5Jo r0 = new X.5Jo
            r0.<init>(r2, r1)
            r7.add(r0)
        L_0x0497:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x04b0
            int r1 = r7.size()
            r0 = 1
            if (r1 != r0) goto L_0x04c6
            java.lang.Object r0 = r7.get(r5)
            X.6Ry r0 = (X.C132056Ry) r0
            int r1 = r0.A00
            r0 = 39
            if (r1 != r0) goto L_0x04c6
        L_0x04b0:
            X.0yC r2 = r8.A0v
            r1 = 4911(0x132f, float:6.882E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x04f4
            X.5Jk r0 = X.C1512578v.A07
            r7.add(r0)
            X.5Jk r0 = X.C1512578v.A03
        L_0x04c3:
            r7.add(r0)
        L_0x04c6:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x05af
            int r1 = r7.size()
            r0 = 1
            int r1 = r1 - r0
            java.lang.Object r0 = r7.get(r1)
            X.6Ry r0 = (X.C132056Ry) r0
            int r1 = r0.A00
            r0 = 43
            if (r1 != r0) goto L_0x05af
            java.util.List r0 = r8.A0I
            if (r0 == 0) goto L_0x05af
            int r0 = r0.size()
            int r2 = r8.A0P
            if (r0 <= r2) goto L_0x05af
            java.util.List r1 = r8.A0I
            int r0 = r1.size()
            r7.A04(r1, r2, r0)
            return r7
        L_0x04f4:
            X.5Jk r0 = X.C1512578v.A08
            goto L_0x04c3
        L_0x04f7:
            if (r16 != 0) goto L_0x04c6
            goto L_0x0497
        L_0x04fa:
            java.util.List r3 = r4.A01
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x059d
            java.util.List r0 = r8.A0L
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x051f
            java.util.List r1 = r8.A0L
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            X.5ms r2 = new X.5ms
            r2.<init>(r0)
            r1 = 6
            X.5Jk r0 = new X.5Jk
            r0.<init>(r2, r1)
            r7.add(r0)
        L_0x051f:
            if (r13 == r10) goto L_0x0575
            if (r13 == r11) goto L_0x054d
            if (r13 != r12) goto L_0x059d
            r3.size()
            java.util.Iterator r3 = r3.iterator()
        L_0x052c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x059d
            java.lang.Object r2 = r3.next()
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            if (r14 == 0) goto L_0x053e
            r0 = 1
            r7.A03(r2, r0)
        L_0x053e:
            boolean r0 = r2 instanceof X.C181798o3
            if (r0 == 0) goto L_0x052c
            r1 = 10
            X.5Jk r0 = new X.5Jk
            r0.<init>(r2, r1)
            r7.add(r0)
            goto L_0x052c
        L_0x054d:
            r3.size()
            java.util.Iterator r3 = r3.iterator()
        L_0x0554:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x059d
            java.lang.Object r2 = r3.next()
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            boolean r0 = r2 instanceof X.C46882bp
            if (r0 == 0) goto L_0x0554
            if (r14 == 0) goto L_0x056a
            r0 = 1
            r7.A03(r2, r0)
        L_0x056a:
            r1 = 9
            X.5Jk r0 = new X.5Jk
            r0.<init>(r2, r1)
            r7.add(r0)
            goto L_0x0554
        L_0x0575:
            r3.size()
            java.util.Iterator r3 = r3.iterator()
        L_0x057c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x059d
            java.lang.Object r2 = r3.next()
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            boolean r0 = r2 instanceof X.C181788o2
            if (r0 == 0) goto L_0x057c
            if (r14 == 0) goto L_0x0592
            r0 = 1
            r7.A03(r2, r0)
        L_0x0592:
            r1 = 8
            X.5Jk r0 = new X.5Jk
            r0.<init>(r2, r1)
            r7.add(r0)
            goto L_0x057c
        L_0x059d:
            int r0 = r7.size()
            if (r0 == 0) goto L_0x021b
            X.08S r0 = r8.A0c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.A0C(r1)
            X.08S r0 = r8.A0b
        L_0x05ac:
            r0.A0C(r1)
        L_0x05af:
            return r7
        L_0x05b0:
            r18 = 0
            X.1S8 r0 = r8.A0S
            if (r0 == 0) goto L_0x05c4
            X.00s r0 = r0.A03
            java.lang.Object r0 = r0.A04()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05c4
            goto L_0x01f4
        L_0x05c4:
            r17 = 0
            goto L_0x01f6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.SearchViewModel.A01(com.whatsapp.search.SearchViewModel):X.78v");
    }

    public static C1512578v A02(SearchViewModel searchViewModel) {
        AnonymousClass08S r1 = searchViewModel.A02;
        if (r1.A04() == null) {
            return A01(searchViewModel);
        }
        return (C1512578v) r1.A04();
    }

    public static void A03(SparseIntArray sparseIntArray, SearchViewModel searchViewModel) {
        int i;
        if (searchViewModel.A03 != null && !TextUtils.isEmpty(searchViewModel.A0b()) && searchViewModel.A0U() == 0) {
            if (AnonymousClass6YD.A0P.A03(searchViewModel.A0v)) {
                synchronized (searchViewModel) {
                    boolean z = false;
                    if (searchViewModel.A01.get(98, -1) != -1) {
                        z = true;
                    }
                    Boolean bool = Boolean.TRUE;
                    boolean equals = bool.equals(searchViewModel.A03.A08.A04());
                    boolean equals2 = bool.equals(searchViewModel.A0z.A0A.A04());
                    if ((z || equals || !searchViewModel.A0J.isEmpty()) && (equals2 || !searchViewModel.A07.A02.isEmpty())) {
                        int i2 = Integer.MIN_VALUE;
                        if (z) {
                            i = searchViewModel.A01.get(98);
                        } else {
                            i = Integer.MIN_VALUE;
                        }
                        if (!equals) {
                            if (!searchViewModel.A0J.isEmpty()) {
                                i2 = 0;
                            }
                            i = i2;
                        }
                        sparseIntArray.put(98, i);
                    }
                }
            }
        }
    }

    public static void A05(SearchViewModel searchViewModel) {
        C19460v5 r2 = searchViewModel.A0l;
        if (r2.A05()) {
            r2.A02();
            searchViewModel.A0a();
            throw new NullPointerException("logSmartFilterEvent");
        } else if (searchViewModel.A03 != null && AnonymousClass6TR.A01(searchViewModel.A0v)) {
            searchViewModel.A10.A00(5, 4, (String) null, searchViewModel.A0U());
        }
    }

    public static void A06(SearchViewModel searchViewModel) {
        searchViewModel.A1F.set(true);
        if (TextUtils.isEmpty(searchViewModel.A0b()) && searchViewModel.A0U() == 0 && searchViewModel.A0Y() == null && searchViewModel.A0a() == null && searchViewModel.A0Z() == null) {
            searchViewModel.A1E.set(true);
            searchViewModel.A0T = true;
        } else if (searchViewModel.A0T) {
            searchViewModel.A00 = SystemClock.uptimeMillis();
            searchViewModel.A0T = false;
        }
    }

    public static void A07(SearchViewModel searchViewModel) {
        searchViewModel.A0F = new C35731jA(searchViewModel, 36);
        C19930wk r1 = searchViewModel.A1S;
        r1.A02();
        r1.execute(searchViewModel.A0F);
    }

    public static void A08(SearchViewModel searchViewModel, int i) {
        Integer num;
        int i2;
        if (searchViewModel.A03 != null && AnonymousClass6TR.A01(searchViewModel.A0v)) {
            C28111Rj r3 = searchViewModel.A10;
            int A0U2 = searchViewModel.A0U();
            C134786bb r1 = (C134786bb) searchViewModel.A0Z.A04();
            if (i == 4) {
                num = Integer.valueOf(searchViewModel.A0T());
            } else {
                num = null;
            }
            if (AnonymousClass6TR.A01(r3.A04)) {
                C142626pB r5 = (C142626pB) r3.A05.get();
                Long valueOf = Long.valueOf(r3.A01);
                if (AnonymousClass6TR.A01(r5.A01)) {
                    AnonymousClass2S2 r4 = new AnonymousClass2S2();
                    r4.A00 = 54;
                    r4.A02 = Integer.valueOf(i);
                    if (num != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("page_no", num);
                        r4.A06 = new JSONObject(hashMap).toString();
                    }
                    if (valueOf != null) {
                        r4.A04 = valueOf;
                    }
                    AnonymousClass6DA r32 = r5.A00;
                    r4.A08 = r32.A01;
                    r4.A05 = r32.A01();
                    r4.A07 = r32.A00;
                    int i3 = 2;
                    if (A0U2 == 97) {
                        i2 = 17;
                    } else if (A0U2 == 98) {
                        i2 = 20;
                    } else if (A0U2 == 100) {
                        i2 = 16;
                    } else if (A0U2 == 103) {
                        i2 = 13;
                    } else if (A0U2 == 105) {
                        i2 = 12;
                    } else if (A0U2 == 108) {
                        i2 = 14;
                    } else if (A0U2 != 117) {
                        i2 = 15;
                        if (A0U2 != 118) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 2;
                    }
                    if (r1 != null) {
                        int i4 = r1.A01;
                        if (i4 == 0) {
                            i3 = 10;
                        } else if (i4 == 1) {
                            i3 = 11;
                        } else if (i4 != 2) {
                            if (i4 != 3) {
                                i3 = 3;
                                if (i4 != 4) {
                                    i3 = i2;
                                }
                            } else {
                                i3 = 18;
                            }
                        }
                        i2 = i3;
                    }
                    r4.A01 = Integer.valueOf(i2);
                    r5.A02.Bly(r4);
                }
            }
        }
    }

    private boolean A09() {
        if ((!Boolean.TRUE.equals(this.A0z.A0A.A04()) || this.A07.A02.size() > 0) && this.A01.size() > 0) {
            return true;
        }
        return false;
    }

    public static boolean A0B(SearchViewModel searchViewModel) {
        if (searchViewModel.A07.A02.size() == 0) {
            return false;
        }
        Boolean bool = (Boolean) searchViewModel.A0k.A03.get("user_grid_view_choice");
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!searchViewModel.A0s() || !searchViewModel.A0b().isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean A0C(SearchViewModel searchViewModel) {
        AnonymousClass1S8 r0;
        Boolean bool = Boolean.TRUE;
        if (!bool.equals(searchViewModel.A0x.A03.A04()) && !bool.equals(searchViewModel.A0y.A02.A04())) {
            AnonymousClass1S6 r1 = searchViewModel.A0z;
            if (!bool.equals(r1.A07.A04()) && !bool.equals(r1.A0A.A04()) && !bool.equals(r1.A09.A04()) && ((r0 = searchViewModel.A0S) == null || !bool.equals(r0.A03.A04()))) {
                return false;
            }
        }
        if (searchViewModel.A03 == null || 98 != searchViewModel.A0U()) {
            return true;
        }
        return false;
    }

    public int A0S() {
        Number number = (Number) this.A0k.A03.get("last_nav_type");
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }

    public int A0T() {
        AnonymousClass08S r1 = this.A0z.A05;
        if (r1.A04() == null || ((Pair) r1.A04()).second == null) {
            return 0;
        }
        return ((Number) ((Pair) r1.A04()).second).intValue();
    }

    public int A0U() {
        Number number = (Number) this.A0k.A00(0, "search_type").A04();
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public int A0X(AnonymousClass2bU r6) {
        int i = -2;
        if (this.A07.A01.contains(r6)) {
            C1512578v A022 = A02(this);
            for (int i2 = 0; i2 < A022.size(); i2++) {
                int A002 = A022.A00(i2);
                if ((C132056Ry.A00(A002) || A002 == 17 || A002 == 18 || A002 == 16 || A002 == 14) && C1901797e.A00(A022.A01(i2), r6)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    public UserJid A0Y() {
        return (UserJid) this.A0k.A00((Object) null, "search_jid").A04();
    }

    public C134826bf A0Z() {
        return (C134826bf) this.A0k.A00((Object) null, "remote_entity_filter").A04();
    }

    public C134786bb A0a() {
        return (C134786bb) this.A0k.A00((Object) null, "smart_filter").A04();
    }

    public String A0b() {
        String str = (String) this.A0k.A00("", "query_text").A04();
        if (str != null) {
            return str;
        }
        return "";
    }

    public void A0d() {
        AnonymousClass1S2 r0 = this.A0x;
        r0.A02.A0C(r0.A0A);
        AnonymousClass1S5 r02 = this.A0y;
        r02.A01.A0C(r02.A09);
    }

    public void A0e() {
        this.A10.A00(2, (Integer) null, (String) null, 117);
        A0n(new C134786bb(2, R.id.search_unread_filter, R.string.f12nameremoved, R.drawable.smart_filter_unread));
    }

    public void A0i(AnonymousClass11F r8) {
        int A0U2;
        int intValue;
        int intValue2;
        String str;
        this.A0j.A0D(false);
        this.A0z.A01();
        A0f(1);
        if (r8 != null) {
            int A0W2 = A0W(r8);
            AnonymousClass6YD r0 = this.A03;
            if (r0 == null || !r0.A0D(r8)) {
                C19460v5 r1 = this.A0l;
                if (r1.A05()) {
                    r1.A02();
                    A0a();
                    throw new NullPointerException("logSmartFilterEvent");
                }
                C134786bb A0a2 = A0a();
                if (A0a2 == null || 2 != A0a2.A01) {
                    A0U2 = A0U();
                } else {
                    A0U2 = 117;
                }
                this.A10.A00(5, Integer.valueOf(A0W2), (String) null, A0U2);
            } else {
                A0f(5);
                AnonymousClass6YD r12 = this.A03;
                if (r12 != null) {
                    C222813r r02 = UserJid.Companion;
                    UserJid A002 = C222813r.A00(r8);
                    List<C132056Ry> list = (List) r12.A06.A04();
                    if (list != null) {
                        for (C132056Ry r2 : list) {
                            if (r2 instanceof C106435Jr) {
                                String str2 = ((C106435Jr) r2).A02.A07;
                                if (A002 != null) {
                                    str = A002.getRawString();
                                } else {
                                    str = null;
                                }
                                if (AnonymousClass00C.A0J(str2, str)) {
                                }
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    r2 = null;
                    C106435Jr r22 = (C106435Jr) r2;
                    if (r22 != null) {
                        AnonymousClass6E6 r23 = r22.A02;
                        if (r23.A0C) {
                            JSONObject jSONObject = new JSONObject();
                            String str3 = r23.A05;
                            if (str3 != null) {
                                jSONObject.put("biz_creation_date", str3);
                            }
                            Integer num = r23.A02;
                            if (num != null && (intValue2 = num.intValue()) >= 0) {
                                jSONObject.put("fb_follower_count", intValue2);
                            }
                            Integer num2 = r23.A03;
                            if (num2 != null && (intValue = num2.intValue()) >= 0) {
                                jSONObject.put("ig_follower_count", intValue);
                            }
                            if (C20800yB.A01(C21000yV.A02, this.A0v, 7135)) {
                                ((AnonymousClass1IB) this.A1D.get()).A07(new AnonymousClass3II(A002, jSONObject));
                            }
                        }
                    }
                }
            }
            this.A12.A0D(r8);
        }
    }

    public void A0k(C134826bf r4) {
        AnonymousClass6YD r0 = this.A03;
        if (r0 != null) {
            C142626pB r2 = (C142626pB) r0.A0F.get();
            if (AnonymousClass6TR.A01(r2.A01)) {
                AnonymousClass2RY r1 = new AnonymousClass2RY();
                r1.A00 = 0;
                r1.A01 = 1;
                C142626pB.A01(r2, r1);
                r2.A02.Bly(r1);
            }
        }
        A0l(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r2 == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0m(X.AnonymousClass3T1 r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0047
            r1 = 1
            int r0 = r6.A0E()
            if (r1 != r0) goto L_0x0047
            X.1Rf r4 = r5.A1O
            X.3Qa r0 = r6.A1J
            X.11F r2 = r0.A00
            r0 = 5
            X.2Sm r3 = new X.2Sm
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A04 = r0
            if (r2 == 0) goto L_0x0042
            boolean r0 = X.AnonymousClass143.A0G(r2)
            if (r0 == 0) goto L_0x0042
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            X.17X r1 = r4.A04
            boolean r0 = r1.A0C(r2)
            boolean r2 = r1.A0D(r2)
            r1 = 1
            if (r0 == 0) goto L_0x0035
            r0 = 1
            if (r2 != 0) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.A01 = r0
        L_0x0042:
            X.0yW r0 = r4.A05
            r0.Bly(r3)
        L_0x0047:
            r0 = 0
            r5.A0r(r0)
            X.1S6 r0 = r5.A0z
            r0.A01()
            r0 = 2
            r5.A0f(r0)
            A05(r5)
            X.1Rs r0 = r5.A1B
            r0.A0D(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.SearchViewModel.A0m(X.3T1):void");
    }

    public void A0q(boolean z) {
        if (AnonymousClass6YD.A0P.A02(this.A0v)) {
            A0l((C134826bf) null);
            if (z) {
                A0h(0);
                AnonymousClass08S r1 = this.A0g;
                r1.A0D(r1.A04());
            }
        }
    }

    public C88934Up B4m(AnonymousClass2bU r2) {
        return new C146816wD(this);
    }

    public static void A04(C28211Rt r2, SearchViewModel searchViewModel) {
        searchViewModel.A07 = r2.A00();
        Runnable runnable = searchViewModel.A0G;
        if (runnable != null) {
            runnable.run();
        }
        searchViewModel.A0U.removeMessages(0);
        if (searchViewModel.A03 != null) {
            if (AnonymousClass6YD.A0P.A03(searchViewModel.A0v)) {
                if (!Boolean.FALSE.equals(searchViewModel.A0z.A0A.A04()) || !searchViewModel.A07.A02.isEmpty()) {
                    A03(searchViewModel.A01, searchViewModel);
                } else {
                    synchronized (searchViewModel) {
                        if (searchViewModel.A01.get(98, -1) != -1) {
                            searchViewModel.A01.delete(98);
                        }
                    }
                }
            }
        }
        A07(searchViewModel);
    }

    private boolean A0A(long j) {
        long longValue;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Number number = (Number) this.A0k.A03.get("last_nav_time");
        if (number == null) {
            longValue = 0;
        } else {
            longValue = number.longValue();
        }
        if (elapsedRealtime - longValue > j) {
            return true;
        }
        return false;
    }

    public void A0R() {
        A0c();
        this.A1K.A02();
        AnonymousClass6YD r0 = this.A03;
        if (r0 != null) {
            ((C131436Pa) r0.A0G.get()).A03();
        }
        AnonymousClass16J r1 = this.A0u;
        r1.unregisterObserver(this.A0z.A00);
        r1.unregisterObserver(this.A0t);
    }

    public int A0V(AnonymousClass11F r6) {
        C1512578v A022 = A02(this);
        int i = -2;
        for (int i2 = 0; i2 < A022.size(); i2++) {
            if ((((C132056Ry) A022.get(i2)).A00 == 3 || ((C132056Ry) A022.get(i2)).A00 == 2) && C1901797e.A00(((AnonymousClass7gQ) A022.get(i2)).BDC(), r6)) {
                i = i2;
            }
        }
        return i;
    }

    public int A0W(AnonymousClass11F r3) {
        if (AnonymousClass143.A0G(r3)) {
            return 2;
        }
        if (r3 instanceof C177538dx) {
            return 3;
        }
        if (this.A1L.A04().contains(r3)) {
            return 1;
        }
        AnonymousClass6YD r0 = this.A03;
        if (r0 == null || !r0.A0D(r3)) {
            return 0;
        }
        return 5;
    }

    public void A0f(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass08M r2 = this.A0k;
        r2.A03("last_nav_time", Long.valueOf(elapsedRealtime));
        r2.A03("last_nav_type", Integer.valueOf(i));
    }

    public void A0g(int i) {
        Integer valueOf = Integer.valueOf(i);
        if (!C1901797e.A00(valueOf, this.A0V.A04())) {
            this.A0k.A03("current_screen", valueOf);
        }
    }

    public void A0h(int i) {
        String str;
        if (A0a() == null && i != A0U()) {
            C28111Rj r4 = this.A10;
            if (i == 98) {
                str = A0b();
            } else {
                str = null;
            }
            r4.A00(2, (Integer) null, str, i);
            A0n((C134786bb) null);
            if (i == 98 && A0Z() == null) {
                A0l(((AnonymousClass67J) this.A1T.get()).A00());
            } else {
                A0q(false);
            }
            C28221Ru r42 = this.A09;
            Integer valueOf = Integer.valueOf(i);
            r42.A00(new C28231Rv(A0Y(), valueOf, A0b(), 2));
            this.A0k.A03("search_type", valueOf);
        }
    }

    public void A0j(UserJid userJid) {
        if (!C1901797e.A00(userJid, A0Y())) {
            this.A09.A00(new C28231Rv(userJid, Integer.valueOf(A0U()), A0b(), 3));
            this.A0k.A03("search_jid", userJid);
        }
    }

    public void A0l(C134826bf r5) {
        if (!C1901797e.A00(r5, A0Z())) {
            this.A09.A00(new C28231Rv(r5, 98, A0b()));
            AnonymousClass08M r1 = this.A0k;
            r1.A03("remote_entity_filter", r5);
            r1.A03("search_type", 98);
            synchronized (this) {
                this.A01 = new SparseIntArray();
            }
        }
    }

    public void A0n(C134786bb r4) {
        if (A0U() == 0 && !C1901797e.A00(r4, A0a())) {
            this.A09.A00(new C28231Rv(r4, A0b()));
            this.A0k.A03("smart_filter", r4);
        }
    }

    public void A0o(String str) {
        if (!str.equals(A0b())) {
            this.A09.A00(new C28231Rv(A0Y(), Integer.valueOf(A0U()), str, 1));
            this.A0k.A03("query_text", str);
            C20810yC r2 = this.A0v;
            AnonymousClass00C.A0D(r2, 0);
            boolean z = false;
            if (C20800yB.A01(C21000yV.A01, r2, 7413)) {
                z = true;
            }
            this.A0d.A0D(Boolean.valueOf(z));
        }
    }

    public void A0p(boolean z) {
        A0c();
        A0g(1);
        A0f(4);
        this.A0D.A0C(Boolean.valueOf(z));
    }

    public void A0r(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        C001700s r1 = this.A0j;
        if (!valueOf.equals(r1.A04())) {
            r1.A0D(valueOf);
        }
    }

    public boolean A0s() {
        if (A0U() == 103 || A0U() == 105 || A0U() == 118) {
            return true;
        }
        return false;
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_PAUSE)
    public void onPause() {
        A0S();
        if (A0S() != 2 && A0S() != 1 && A0S() != 5 && A0S() != 4) {
            if (A0S() != 0 || A0A(500)) {
                A0f(3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r1 == 5) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (A0A(300000) != false) goto L_0x006c;
     */
    @androidx.lifecycle.OnLifecycleEvent(X.AnonymousClass05R.ON_RESUME)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r6 = this;
            r6.A0S()
            int r1 = r6.A0S()
            r0 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001c
            if (r1 == r0) goto L_0x0039
            r0 = 2
            r4 = 300000(0x493e0, double:1.482197E-318)
            if (r1 == r0) goto L_0x0030
            r0 = 3
            if (r1 == r0) goto L_0x0066
            r0 = 4
            if (r1 == r0) goto L_0x001c
            r0 = 5
            if (r1 == r0) goto L_0x002c
        L_0x001c:
            X.1S6 r2 = r6.A0z
            X.08S r1 = r2.A03
            X.1S3 r0 = r2.A0G
            r1.A0C(r0)
            X.08S r1 = r2.A06
            X.1S3 r0 = r2.A0H
            r1.A0C(r0)
        L_0x002c:
            r6.A0f(r3)
            return
        L_0x0030:
            r0 = 500(0x1f4, double:2.47E-321)
            boolean r0 = r6.A0A(r0)
            if (r0 != 0) goto L_0x0066
            return
        L_0x0039:
            X.0yC r2 = r6.A0v
            r1 = 1608(0x648, float:2.253E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0054
            X.6bb r0 = r6.A0a()
            if (r0 == 0) goto L_0x0054
            r1 = 2
            int r0 = r0.A01
            if (r1 != r0) goto L_0x0054
            r6.A0d()
            goto L_0x001c
        L_0x0054:
            X.6bf r0 = r6.A0Z()
            if (r0 == 0) goto L_0x006c
            X.6YD r0 = r6.A03
            if (r0 == 0) goto L_0x001c
            X.08S r1 = r0.A07
            X.1S3 r0 = r0.A0D
            r1.A0C(r0)
            goto L_0x001c
        L_0x0066:
            boolean r0 = r6.A0A(r4)
            if (r0 == 0) goto L_0x001c
        L_0x006c:
            r6.A0S()
            r6.A0p(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.SearchViewModel.onResume():void");
    }

    public SearchViewModel(AnonymousClass08M r42, C19460v5 r43, C19460v5 r44, C19460v5 r45, C28151Rn r46, C28161Ro r47, C28171Rp r48, C28181Rq r49, C28121Rk r50, AnonymousClass1Q5 r51, C28131Rl r52, C28141Rm r53, AnonymousClass17Y r54, C28191Rr r55, AnonymousClass171 r56, AnonymousClass1RY r57, AnonymousClass1A6 r58, C19970wo r59, C19630wG r60, C19420v0 r61, C18820ts r62, C20650xu r63, AnonymousClass16J r64, AnonymousClass1LU r65, C28071Rf r66, C20810yC r67, C21010yW r68, AnonymousClass1DU r69, AnonymousClass1QW r70, C28111Rj r71, C28091Rh r72, C28081Rg r73, C19770wU r74, AnonymousClass005 r75, AnonymousClass005 r76, AnonymousClass005 r77) {
        AnonymousClass08S r2 = new AnonymousClass08S();
        this.A0g = r2;
        this.A0h = new C001700s();
        C001700s r21 = new C001700s();
        this.A0i = r21;
        this.A1F = new AtomicBoolean();
        this.A1E = new AtomicBoolean();
        this.A0b = new AnonymousClass08S();
        this.A0c = new AnonymousClass08S();
        this.A0d = new AnonymousClass08S();
        this.A0K = new ArrayList();
        this.A0M = new ArrayList();
        this.A0O = new ArrayList();
        this.A0L = new ArrayList();
        this.A0N = new ArrayList();
        this.A0J = new ArrayList();
        this.A0B = null;
        this.A0I = null;
        this.A0P = 0;
        this.A01 = new SparseIntArray();
        this.A07 = new C28211Rt();
        this.A09 = new C28221Ru();
        this.A00 = 0;
        this.A0T = true;
        this.A02 = new AnonymousClass08S();
        AnonymousClass08S r1 = new AnonymousClass08S();
        this.A0f = r1;
        this.A0U = new Handler(Looper.getMainLooper(), new C36091jk(this, 3));
        this.A0t = new C36181jt(this, 2);
        this.A1Q = new C28241Rw(this);
        this.A08 = new C28261Ry(this);
        this.A0p = r60;
        C19970wo r39 = r59;
        this.A1M = r39;
        C20810yC r38 = r67;
        this.A0v = r38;
        this.A0o = r54;
        C19770wU r6 = r74;
        this.A1C = r6;
        this.A0w = r69;
        this.A1J = r56;
        this.A0r = r62;
        this.A0s = r63;
        this.A0u = r64;
        AnonymousClass08M r4 = r42;
        this.A0k = r4;
        this.A0m = r43;
        this.A11 = r73;
        this.A1N = r65;
        this.A1K = r57;
        this.A1P = r70;
        this.A0q = r61;
        this.A1L = r58;
        this.A1D = r76;
        this.A0l = r44;
        this.A1R = r72;
        this.A10 = r71;
        this.A1O = r66;
        this.A1T = r77;
        this.A1H = r45;
        this.A0n = r53;
        C28181Rq r40 = r49;
        this.A0Q = r40;
        this.A1I = r55;
        this.A1S = new C19930wk(r6, true);
        this.A0V = r4.A01("current_screen");
        C001700s A012 = r4.A01("query_text");
        Objects.requireNonNull(r2);
        r2.A0F(A012, new C36201jv(r2, 29));
        C001700s A013 = r4.A01("search_type");
        this.A0Y = A013;
        C001700s A014 = r4.A01("search_jid");
        this.A0X = A014;
        C001700s A015 = r4.A01("smart_filter");
        this.A0Z = A015;
        this.A0W = r4.A01("remote_entity_filter");
        C001700s A016 = r4.A01("user_grid_view_choice");
        this.A1G = A016;
        C27121Mz r5 = r50.A00;
        C18800tq r14 = r5.A01;
        r14.A4g.get();
        r14.A2A.get();
        C18830tt r610 = r14.A00;
        r14.A90.get();
        r14.A4P.get();
        AnonymousClass08S r23 = r2;
        C001700s r24 = A013;
        C001700s r25 = A014;
        C001700s r26 = A015;
        AnonymousClass1S2 r22 = new AnonymousClass1S2(r23, r24, r25, r26, (C235718z) r14.A1Z.get(), (AnonymousClass1A6) r14.A2P.get(), (C19970wo) r14.A8b.get(), (C18820ts) r14.A9X.get(), (AnonymousClass1A5) r14.A2K.get(), (C21010yW) r14.A79.get(), (C21690ze) r14.A31.get(), (AnonymousClass1S0) r5.A00.A2D.get(), (C28091Rh) r610.A3r.get(), (C28271Rz) r610.A2a.get());
        this.A0x = r22;
        C18800tq r611 = r52.A00.A01;
        r611.A02.get();
        C18830tt r510 = r611.A00;
        AnonymousClass1S5 r222 = new AnonymousClass1S5(r23, r24, r25, r26, (C235718z) r611.A1Z.get(), (AnonymousClass171) r611.A90.get(), (AnonymousClass1A6) r611.A2P.get(), (C19970wo) r611.A8b.get(), (C18820ts) r611.A9X.get(), (AnonymousClass1A5) r611.A2K.get(), (C21010yW) r611.A79.get(), (C21690ze) r611.A31.get(), (C28091Rh) r510.A3r.get(), (C230116v) r611.A4P.get(), (C28271Rz) r510.A2a.get());
        this.A0y = r222;
        C18800tq r511 = r47.A00.A01;
        C18830tt r7 = r511.A00;
        AnonymousClass1S6 r223 = new AnonymousClass1S6(r23, r24, r25, r26, (AnonymousClass16D) r511.A2A.get(), (AnonymousClass171) r511.A90.get(), (C19970wo) r511.A8b.get(), (C18820ts) r511.A9X.get(), (C20650xu) r511.A3Z.get(), (C20810yC) r511.A02.get(), (C21010yW) r511.A79.get(), (C21690ze) r511.A31.get(), (C28091Rh) r7.A3r.get(), (C28271Rz) r7.A2a.get());
        this.A0z = r223;
        C21000yV r9 = C21000yV.A02;
        if (C20800yB.A01(r9, r38, 1448)) {
            AnonymousClass08S r12 = r223.A01;
            AnonymousClass08S r11 = r222.A00;
            C27121Mz r13 = r51.A00;
            C18800tq r78 = r13.A01;
            C001700s r232 = A013;
            C001700s r242 = A015;
            AnonymousClass08S r252 = r12;
            AnonymousClass08S r262 = r11;
            C19970wo r27 = r39;
            C20810yC r28 = (C20810yC) r78.A02.get();
            this.A0S = new AnonymousClass1S8(r232, r242, r252, r262, r27, r28, r68, C27111My.A2K(r13.A00), (C21690ze) r78.A31.get(), (C28271Rz) r78.A00.A2a.get());
        }
        if (C20800yB.A00(r9, this.A0v, 6740) == 1) {
            C18800tq r8 = r48.A00.A01;
            C18830tt r79 = r8.A00;
            this.A06 = new AnonymousClass1SB(r2, A013, A014, A015, (AnonymousClass171) r8.A90.get(), (C19970wo) r8.A8b.get(), (C18820ts) r8.A9X.get(), (AnonymousClass1SA) r79.A2z.get(), (C21010yW) r8.A79.get(), (C28271Rz) r79.A2a.get());
        }
        C20810yC r0 = r38;
        AnonymousClass00C.A0D(r0, 0);
        if (C20800yB.A01(C21000yV.A01, r0, 7413)) {
            C005602m r82 = AnonymousClass19R.A01;
            C19620wF.A00(r82);
            AnonymousClass040 r710 = C26591Kt.A00;
            C19620wF.A00(r710);
            this.A0R = new AISearchTypeAheadSuggestionsProvider(r2, (MetaAISearchRepository) r40.A00.A00.A2y.get(), r82, r710);
            this.A0P = 3;
        }
        C36191ju r92 = new C36191ju(this, 2);
        C18800tq r711 = r46.A00.A01;
        this.A0A = new AnonymousClass1SD(r2, A013, A014, A015, (C18820ts) r711.A9X.get(), (C28271Rz) r711.A00.A2a.get(), C18840tu.A00(r711.A1Z), C18840tu.A00(r711.A1a), r92);
        AnonymousClass16J r712 = this.A0u;
        r712.registerObserver(this.A0z.A00);
        r712.registerObserver(this.A0t);
        this.A02.A0F(r22.A01, new C36201jv(this, 27));
        this.A02.A0F(r222.A00, new C36201jv(this, 28));
        AnonymousClass1SB r02 = this.A06;
        if (r02 != null) {
            this.A02.A0F(r02.A05, new C36201jv(this, 30));
        }
        AISearchTypeAheadSuggestionsProvider aISearchTypeAheadSuggestionsProvider = this.A0R;
        if (aISearchTypeAheadSuggestionsProvider != null) {
            this.A02.A0F(aISearchTypeAheadSuggestionsProvider.A00, new C165137sw(this, 1));
        }
        AnonymousClass1SD r03 = this.A0A;
        if (r03 != null) {
            this.A02.A0F(r03.A00, new C36211jw(r75, this, 2));
        }
        this.A02.A0F(r223.A04, new C36201jv(this, 33));
        this.A02.A0F(r223.A01, new C36201jv(this, 32));
        this.A02.A0F(r223.A02, new C36201jv(this, 31));
        this.A02.A0F(A016, new C36201jv(this, 23));
        AnonymousClass1S8 r04 = this.A0S;
        if (r04 != null) {
            this.A02.A0F(r04.A01, new C36201jv(this, 26));
        }
        r1.A0F(r223.A07, new C36201jv(this, 24));
        r1.A0F(r223.A09, new C36201jv(this, 24));
        r1.A0F(r223.A0A, new C36201jv(this, 24));
        r1.A0F(r22.A03, new C36201jv(this, 24));
        r1.A0F(r222.A02, new C36201jv(this, 24));
        r1.A0F(r21, new C36201jv(this, 25));
        r1.A0F(this.A02, new C36201jv(this, 34));
        AnonymousClass1S8 r05 = this.A0S;
        if (r05 != null) {
            r1.A0F(r05.A03, new C36201jv(this, 24));
        }
        r2.A0F(r223.A0B, new C36211jw(r4, this, 1));
    }
}
