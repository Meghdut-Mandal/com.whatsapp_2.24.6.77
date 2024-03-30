package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import com.whatsapp.search.IteratingPlayer;
import com.whatsapp.search.SearchViewModel;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.4ms  reason: invalid class name and case insensitive filesystem */
public class C96154ms extends AnonymousClass0CZ implements C34411h0 {
    public RecyclerView A00;
    public String A01;
    public Map A02;
    public boolean A03;
    public final Activity A04;
    public final AnonymousClass01M A05;
    public final AnonymousClass0UE A06;
    public final C33261ez A07;
    public final C115905jd A08;
    public final AnonymousClass1LI A09;
    public final AnonymousClass1X4 A0A;
    public final AnonymousClass1K3 A0B;
    public final C124155xg A0C;
    public final AnonymousClass1RY A0D;
    public final C65383Rv A0E;
    public final C33301f4 A0F;
    public final C19630wG A0G;
    public final C18820ts A0H;
    public final C20810yC A0I;
    public final AnonymousClass190 A0J;
    public final AnonymousClass1DU A0K;
    public final C33191es A0L;
    public final IteratingPlayer A0M;
    public final C138576iL A0N;
    public final C1512578v A0O;
    public final SearchViewModel A0P;
    public final AnonymousClass2XJ A0Q;
    public final HashSet A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final C24801Dv A0U;
    public final C19700wN A0V;
    public final AnonymousClass17Y A0W;
    public final AnonymousClass1Pp A0X;
    public final C20830yE A0Y;
    public final AnonymousClass1A5 A0Z;
    public final C32731e6 A0a;
    public final AnonymousClass1TA A0b;
    public final AnonymousClass1P5 A0c;
    public final AnonymousClass2XH A0d;
    public final C24681Dj A0e;
    public final AnonymousClass1X7 A0f;
    public final AnonymousClass13J A0g;
    public final C19770wU A0h;

    public static final Chip A00(Context context, C134826bf r5) {
        AnonymousClass00C.A0D(r5, 1);
        String A0m = C36361kB.A0m(context, r5.A04);
        if (r5.A06) {
            A0m = AnonymousClass000.A0q(" [Internal]", AnonymousClass000.A0v(A0m));
        }
        Chip chip = new Chip(context, (AttributeSet) null);
        chip.setText(A0m);
        chip.setClickable(true);
        int i = r5.A02;
        if (i != 0) {
            C106335Jg.A01(context, chip, i, C90484aE.A08(context));
        }
        chip.setChipIconTintResource(R.color.f6nameremoved);
        C36321k7.A0M(context, chip, R.attr.f4nameremoved, R.color.f6nameremoved);
        chip.setChipBackgroundColorResource(C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved));
        return chip;
    }

    public void A0H(RecyclerView recyclerView) {
        AnonymousClass00C.A0D(recyclerView, 0);
        recyclerView.A0v(this.A06);
        recyclerView.A0v(this.A0M.A04);
        this.A00 = recyclerView;
    }

    public void A0I(RecyclerView recyclerView) {
        AnonymousClass00C.A0D(recyclerView, 0);
        recyclerView.A0w(this.A06);
        IteratingPlayer iteratingPlayer = this.A0M;
        recyclerView.A0w(iteratingPlayer.A04);
        IteratingPlayer.A02(iteratingPlayer);
        this.A00 = null;
    }

    public boolean BLw(int i) {
        if (i == -1) {
            return false;
        }
        int A002 = this.A0O.A00(i);
        return A002 == 1 || A002 == 12 || A002 == 31;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x024a, code lost:
        return new X.C1043459g(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02c7, code lost:
        return new X.AnonymousClass59W(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03ce, code lost:
        return new X.AnonymousClass2UQ(X.C36361kB.A0E(X.C36331k8.A09(r0), r0, com.whatsapp.R.layout.f9nameremoved));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ X.AnonymousClass0D3 BUw(android.view.ViewGroup r22, int r23) {
        /*
            r21 = this;
            r2 = -1
            r0 = r22
            r1 = r23
            if (r1 == r2) goto L_0x04b7
            r2 = 1
            if (r1 == r2) goto L_0x04a6
            r2 = 2
            r4 = 99
            r3 = r21
            if (r1 == r2) goto L_0x047b
            r2 = 3
            if (r1 == r2) goto L_0x047b
            r2 = 4
            if (r1 == r2) goto L_0x046a
            if (r1 == r4) goto L_0x047b
            r2 = 100
            if (r1 == r2) goto L_0x0458
            switch(r23) {
                case 6: goto L_0x01a3;
                case 7: goto L_0x0204;
                case 8: goto L_0x021c;
                case 9: goto L_0x022a;
                case 10: goto L_0x0238;
                case 11: goto L_0x024b;
                case 12: goto L_0x01b4;
                case 13: goto L_0x01c5;
                case 14: goto L_0x0263;
                case 15: goto L_0x027b;
                case 16: goto L_0x0293;
                case 17: goto L_0x02a3;
                case 18: goto L_0x02b3;
                case 19: goto L_0x02c8;
                case 20: goto L_0x02e0;
                case 21: goto L_0x02fa;
                case 22: goto L_0x01f3;
                case 23: goto L_0x0316;
                case 24: goto L_0x033c;
                case 25: goto L_0x047b;
                case 26: goto L_0x039f;
                case 27: goto L_0x03be;
                case 28: goto L_0x002f;
                case 29: goto L_0x002f;
                case 30: goto L_0x002f;
                case 31: goto L_0x002f;
                case 32: goto L_0x002f;
                case 33: goto L_0x002f;
                case 34: goto L_0x002f;
                case 35: goto L_0x002f;
                case 36: goto L_0x03cf;
                case 37: goto L_0x002f;
                case 38: goto L_0x03e3;
                case 39: goto L_0x002f;
                case 40: goto L_0x03fe;
                case 41: goto L_0x002f;
                case 42: goto L_0x002f;
                case 43: goto L_0x041a;
                case 44: goto L_0x002f;
                case 45: goto L_0x002f;
                case 46: goto L_0x0446;
                default: goto L_0x0020;
            }
        L_0x0020:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid viewType: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r2, r1)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0E(r0)
            throw r0
        L_0x002f:
            X.5xg r2 = r3.A0C
            X.1RY r11 = r3.A0D
            r3 = 0
            X.C36321k7.A0v(r0, r3, r11)
            X.5kK r4 = r2.A01
            X.0w7 r4 = r4.A00
            X.0tq r6 = r4.A00
            X.0yC r13 = X.C36341k9.A0V(r6)
            X.0wU r17 = X.C36341k9.A0Z(r6)
            X.190 r14 = X.C36351kA.A0h(r6)
            X.1Dv r8 = X.C36351kA.A0J(r6)
            X.0yb r12 = X.C36351kA.A0U(r6)
            X.0tt r5 = r6.A00
            X.004 r4 = r5.A2Z
            java.lang.Object r4 = r4.get()
            X.1e4 r4 = (X.C32711e4) r4
            X.0xT r15 = X.C18830tt.ACx(r5)
            X.16D r10 = X.C36341k9.A0R(r6)
            X.17Y r9 = X.C36351kA.A0M(r6)
            X.652 r7 = new X.652
            r16 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.0v5 r5 = r2.A00
            boolean r4 = r5.A05()
            if (r4 == 0) goto L_0x0080
            r5.A02()
            java.lang.String r0 = "create"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0080:
            switch(r23) {
                case 28: goto L_0x0092;
                case 29: goto L_0x013c;
                case 30: goto L_0x00be;
                case 31: goto L_0x014e;
                case 32: goto L_0x00cf;
                case 33: goto L_0x015f;
                case 34: goto L_0x0170;
                case 35: goto L_0x0181;
                case 36: goto L_0x0083;
                case 37: goto L_0x00e0;
                case 38: goto L_0x0083;
                case 39: goto L_0x0083;
                case 40: goto L_0x0083;
                case 41: goto L_0x00f1;
                case 42: goto L_0x0192;
                case 43: goto L_0x0083;
                case 44: goto L_0x0116;
                case 45: goto L_0x012b;
                default: goto L_0x0083;
            }
        L_0x0083:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid Business search viewType: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r2, r1)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0E(r0)
            throw r0
        L_0x0092:
            java.util.List r1 = X.AnonymousClass0D3.A0I
            X.0yC r6 = r2.A06
            X.0ts r5 = r2.A05
            X.16I r4 = r2.A03
            X.0xY r3 = r2.A04
            X.6Ur r14 = r2.A02
            r1 = 7
            X.AnonymousClass00C.A0D(r14, r1)
            android.view.LayoutInflater r2 = X.C36351kA.A0C(r0)
            r1 = 2131624284(0x7f0e015c, float:1.8875743E38)
            android.view.View r13 = X.C90514aH.A0Q(r2, r0, r1)
            X.51n r12 = new X.51n
            r15 = r7
            r16 = r4
            r17 = r11
            r18 = r3
            r19 = r5
            r20 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            return r12
        L_0x00be:
            android.view.LayoutInflater r2 = X.C36331k8.A09(r0)
            r1 = 2131624278(0x7f0e0156, float:1.8875731E38)
            android.view.View r0 = X.C90514aH.A0Q(r2, r0, r1)
            X.51s r12 = new X.51s
            r12.<init>(r0, r7)
            return r12
        L_0x00cf:
            android.view.LayoutInflater r2 = X.C36331k8.A09(r0)
            r1 = 2131624281(0x7f0e0159, float:1.8875737E38)
            android.view.View r0 = X.C90514aH.A0Q(r2, r0, r1)
            X.51p r12 = new X.51p
            r12.<init>(r0)
            return r12
        L_0x00e0:
            android.view.LayoutInflater r2 = X.C36331k8.A09(r0)
            r1 = 2131624287(0x7f0e015f, float:1.887575E38)
            android.view.View r0 = X.C90514aH.A0Q(r2, r0, r1)
            X.51q r12 = new X.51q
            r12.<init>(r0)
            return r12
        L_0x00f1:
            java.util.List r1 = X.AnonymousClass0D3.A0I
            X.0yC r6 = r2.A06
            X.0ts r5 = r2.A05
            X.16I r4 = r2.A03
            X.0xY r3 = r2.A04
            android.view.LayoutInflater r2 = X.C36351kA.A0C(r0)
            r1 = 2131624286(0x7f0e015e, float:1.8875747E38)
            android.view.View r13 = X.C90514aH.A0Q(r2, r0, r1)
            X.51m r12 = new X.51m
            r14 = r7
            r15 = r4
            r16 = r11
            r17 = r3
            r18 = r5
            r19 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            return r12
        L_0x0116:
            java.util.List r1 = X.AnonymousClass0D3.A0I
            X.16I r3 = r2.A03
            android.view.LayoutInflater r2 = X.C36351kA.A0C(r0)
            r1 = 2131624283(0x7f0e015b, float:1.8875741E38)
            android.view.View r0 = X.C90514aH.A0Q(r2, r0, r1)
            X.51x r12 = new X.51x
            r12.<init>(r0, r7, r3, r11)
            return r12
        L_0x012b:
            android.view.LayoutInflater r2 = X.C36351kA.A0C(r0)
            r1 = 2131624288(0x7f0e0160, float:1.8875751E38)
            android.view.View r0 = r2.inflate(r1, r0, r3)
            X.51u r12 = new X.51u
            r12.<init>(r0)
            return r12
        L_0x013c:
            android.view.LayoutInflater r2 = X.C36351kA.A0C(r0)
            r1 = 2131624279(0x7f0e0157, float:1.8875733E38)
            android.view.View r1 = r2.inflate(r1, r0, r3)
            r0 = 1
            X.7p2 r12 = new X.7p2
            r12.<init>(r1, r0)
            return r12
        L_0x014e:
            android.view.LayoutInflater r2 = X.C36331k8.A09(r0)
            r1 = 2131624280(0x7f0e0158, float:1.8875735E38)
            android.view.View r0 = X.C36371kC.A0J(r2, r0, r1, r3)
            X.51w r12 = new X.51w
            r12.<init>(r0)
            return r12
        L_0x015f:
            android.view.LayoutInflater r2 = X.C36331k8.A09(r0)
            r1 = 2131625069(0x7f0e046d, float:1.8877336E38)
            android.view.View r0 = X.C36371kC.A0J(r2, r0, r1, r3)
            X.51v r12 = new X.51v
            r12.<init>(r0)
            return r12
        L_0x0170:
            android.view.LayoutInflater r2 = X.C36351kA.A0C(r0)
            r1 = 2131625070(0x7f0e046e, float:1.8877338E38)
            android.view.View r0 = r2.inflate(r1, r0, r3)
            X.7p2 r12 = new X.7p2
            r12.<init>(r0, r3)
            return r12
        L_0x0181:
            android.view.LayoutInflater r2 = X.C36331k8.A09(r0)
            r1 = 2131625071(0x7f0e046f, float:1.887734E38)
            android.view.View r0 = X.C36371kC.A0J(r2, r0, r1, r3)
            X.51o r12 = new X.51o
            r12.<init>(r0)
            return r12
        L_0x0192:
            android.view.LayoutInflater r2 = X.C36331k8.A09(r0)
            r1 = 2131626003(0x7f0e0813, float:1.887923E38)
            android.view.View r0 = X.C36371kC.A0J(r2, r0, r1, r3)
            X.51r r12 = new X.51r
            r12.<init>(r0)
            return r12
        L_0x01a3:
            java.util.List r1 = X.AnonymousClass0D3.A0I
            android.content.Context r1 = r0.getContext()
            X.5Jf r0 = new X.5Jf
            r0.<init>(r1)
            X.59N r12 = new X.59N
            r12.<init>(r0)
            return r12
        L_0x01b4:
            java.util.List r1 = X.AnonymousClass0D3.A0I
            android.content.Context r1 = r0.getContext()
            X.4er r0 = new X.4er
            r0.<init>(r1)
            X.59K r12 = new X.59K
            r12.<init>(r0)
            return r12
        L_0x01c5:
            boolean r1 = r3.A0S
            if (r1 == 0) goto L_0x01df
            java.util.List r1 = X.AnonymousClass0D3.A0I
            r3 = 2131893868(0x7f121e6c, float:1.9422525E38)
            android.view.LayoutInflater r2 = X.C36351kA.A0C(r0)
            r1 = 2131626111(0x7f0e087f, float:1.8879449E38)
            android.view.View r0 = X.C36361kB.A0E(r2, r0, r1)
            X.2US r12 = new X.2US
            r12.<init>(r0, r3)
            return r12
        L_0x01df:
            android.view.LayoutInflater r2 = X.C36331k8.A09(r0)
            r1 = 2131626111(0x7f0e087f, float:1.8879449E38)
            android.view.View r1 = X.C36361kB.A0E(r2, r0, r1)
            r0 = 2131893867(0x7f121e6b, float:1.9422523E38)
            X.2US r12 = new X.2US
            r12.<init>(r1, r0)
            return r12
        L_0x01f3:
            java.util.List r1 = X.AnonymousClass0D3.A0I
            android.content.Context r1 = r0.getContext()
            X.5Jc r0 = new X.5Jc
            r0.<init>(r1)
            X.59Q r12 = new X.59Q
            r12.<init>(r0)
            return r12
        L_0x0204:
            android.content.Context r4 = r0.getContext()
            com.whatsapp.search.SearchViewModel r2 = r3.A0P
            X.1f4 r1 = r3.A0F
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.8pK r0 = new X.8pK
            r0.<init>(r4, r1)
            X.C36321k7.A0N(r0)
            X.59Z r12 = new X.59Z
            r12.<init>(r2, r0)
            return r12
        L_0x021c:
            com.whatsapp.search.SearchViewModel r2 = r3.A0P
            java.util.List r1 = X.AnonymousClass0D3.A0I
            android.content.Context r0 = r0.getContext()
            X.5K0 r1 = new X.5K0
            r1.<init>(r0)
            goto L_0x0245
        L_0x022a:
            com.whatsapp.search.SearchViewModel r2 = r3.A0P
            java.util.List r1 = X.AnonymousClass0D3.A0I
            android.content.Context r0 = r0.getContext()
            X.5Jy r1 = new X.5Jy
            r1.<init>(r0)
            goto L_0x0245
        L_0x0238:
            com.whatsapp.search.SearchViewModel r2 = r3.A0P
            java.util.List r1 = X.AnonymousClass0D3.A0I
            android.content.Context r0 = r0.getContext()
            X.5K1 r1 = new X.5K1
            r1.<init>(r0)
        L_0x0245:
            X.59g r12 = new X.59g
            r12.<init>(r2, r1)
            return r12
        L_0x024b:
            com.whatsapp.search.SearchViewModel r4 = r3.A0P
            X.1f4 r2 = r3.A0F
            java.util.List r1 = X.AnonymousClass0D3.A0I
            android.content.Context r1 = r0.getContext()
            X.8pP r0 = new X.8pP
            r0.<init>(r1, r2)
            X.C36321k7.A0N(r0)
            X.2UR r12 = new X.2UR
            r12.<init>(r4, r0)
            return r12
        L_0x0263:
            android.content.Context r4 = r0.getContext()
            com.whatsapp.search.SearchViewModel r2 = r3.A0P
            X.1f4 r1 = r3.A0F
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.8pG r0 = new X.8pG
            r0.<init>(r4, r1)
            X.C36321k7.A0N(r0)
            X.59T r12 = new X.59T
            r12.<init>(r2, r0)
            return r12
        L_0x027b:
            android.content.Context r4 = r0.getContext()
            com.whatsapp.search.SearchViewModel r2 = r3.A0P
            X.1f4 r1 = r3.A0F
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.8pH r0 = new X.8pH
            r0.<init>(r4, r1)
            X.C36321k7.A0N(r0)
            X.59a r12 = new X.59a
            r12.<init>(r2, r0)
            return r12
        L_0x0293:
            android.content.Context r2 = r0.getContext()
            com.whatsapp.search.SearchViewModel r4 = r3.A0P
            X.1f4 r1 = r3.A0F
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.8pQ r0 = new X.8pQ
            r0.<init>(r2, r1)
            goto L_0x02c2
        L_0x02a3:
            android.content.Context r2 = r0.getContext()
            com.whatsapp.search.SearchViewModel r4 = r3.A0P
            X.1f4 r1 = r3.A0F
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.8pR r0 = new X.8pR
            r0.<init>(r2, r1)
            goto L_0x02c2
        L_0x02b3:
            android.content.Context r2 = r0.getContext()
            com.whatsapp.search.SearchViewModel r4 = r3.A0P
            X.1f4 r1 = r3.A0F
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.8pS r0 = new X.8pS
            r0.<init>(r2, r1)
        L_0x02c2:
            X.59W r12 = new X.59W
            r12.<init>(r4, r0)
            return r12
        L_0x02c8:
            android.content.Context r4 = r0.getContext()
            com.whatsapp.search.SearchViewModel r2 = r3.A0P
            X.1f4 r1 = r3.A0F
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.8pT r0 = new X.8pT
            r0.<init>(r4, r1)
            X.C36321k7.A0N(r0)
            X.59U r12 = new X.59U
            r12.<init>(r2, r0)
            return r12
        L_0x02e0:
            android.content.Context r5 = r0.getContext()
            com.whatsapp.search.SearchViewModel r4 = r3.A0P
            X.1RY r2 = r3.A0D
            X.1f4 r1 = r3.A0F
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.8pI r0 = new X.8pI
            r0.<init>(r5, r2, r1)
            X.C36321k7.A0N(r0)
            X.59V r12 = new X.59V
            r12.<init>(r4, r0)
            return r12
        L_0x02fa:
            android.content.Context r6 = r0.getContext()
            X.2XJ r5 = r3.A0Q
            com.whatsapp.search.SearchViewModel r4 = r3.A0P
            X.1RY r2 = r3.A0D
            X.1f4 r1 = r3.A0F
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.8pJ r0 = new X.8pJ
            r0.<init>(r6, r2, r1, r5)
            X.C36321k7.A0N(r0)
            X.59S r12 = new X.59S
            r12.<init>(r4, r0)
            return r12
        L_0x0316:
            X.1es r4 = r3.A0L
            X.5jd r2 = r3.A08
            java.util.List r1 = X.AnonymousClass0D3.A0I
            android.content.Context r3 = r0.getContext()
            X.1ds r0 = r2.A00
            X.1dr r2 = r0.A01
            X.0tq r0 = r0.A02
            X.004 r0 = r0.A16
            java.lang.Object r1 = r0.get()
            X.1T7 r1 = (X.AnonymousClass1T7) r1
            X.4eU r0 = new X.4eU
            r0.<init>(r3, r1)
            X.C32581dr.A1G(r2, r0)
            X.59R r12 = new X.59R
            r12.<init>(r4, r0)
            return r12
        L_0x033c:
            com.whatsapp.search.SearchViewModel r6 = r3.A0P
            java.util.List r1 = X.AnonymousClass0D3.A0I
            android.content.Context r5 = r0.getContext()
            r0 = 2131626090(0x7f0e086a, float:1.8879406E38)
            android.view.View r4 = X.C36421kH.A0D(r5, r0)
            r8 = 2131894133(0x7f121f75, float:1.9423062E38)
            r7 = 2131232189(0x7f0805bd, float:1.808048E38)
            r3 = 2131231705(0x7f0803d9, float:1.8079499E38)
            X.C34081gQ.A02(r4)
            r0 = 2131430745(0x7f0b0d59, float:1.84832E38)
            android.widget.ImageView r2 = X.C36401kF.A0G(r4, r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131103013(0x7f060d25, float:1.781848E38)
            X.AnonymousClass3UF.A0B(r1, r2, r7, r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            r2.setScaleType(r0)
            r2.setBackgroundResource(r3)
            r0 = 2131430748(0x7f0b0d5c, float:1.8483206E38)
            android.widget.TextView r1 = X.C36391kE.A0O(r4, r0)
            r0 = 2131434724(0x7f0b1ce4, float:1.849127E38)
            android.widget.TextView r0 = X.C36391kE.A0O(r4, r0)
            X.C33511fU.A03(r0)
            X.C33511fU.A03(r1)
            r1.setText(r8)
            r1 = 44
            X.3Yq r0 = new X.3Yq
            r0.<init>((java.lang.Object) r6, (int) r1)
            r4.setOnClickListener(r0)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r5)
            r0.addView(r4)
            X.59M r12 = new X.59M
            r12.<init>(r0)
            return r12
        L_0x039f:
            X.0yC r2 = r3.A0I
            r1 = 2662(0xa66, float:3.73E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x03be
            android.content.Context r4 = r0.getContext()
            com.whatsapp.search.SearchViewModel r2 = r3.A0P
            X.1f4 r1 = r3.A0F
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.8pN r0 = new X.8pN
            r0.<init>(r4, r1)
            X.59Y r12 = new X.59Y
            r12.<init>(r2, r0)
            return r12
        L_0x03be:
            android.view.LayoutInflater r2 = X.C36331k8.A09(r0)
            r1 = 2131625039(0x7f0e044f, float:1.8877275E38)
            android.view.View r0 = X.C36361kB.A0E(r2, r0, r1)
            X.2UQ r12 = new X.2UQ
            r12.<init>(r0)
            return r12
        L_0x03cf:
            java.util.List r1 = X.AnonymousClass0D3.A0I
            r3 = 0
            android.view.LayoutInflater r2 = X.C36341k9.A0J(r0, r3)
            r1 = 2131625421(0x7f0e05cd, float:1.887805E38)
            android.view.View r0 = X.C36371kC.A0J(r2, r0, r1, r3)
            X.59f r12 = new X.59f
            r12.<init>(r0)
            return r12
        L_0x03e3:
            java.util.List r1 = X.AnonymousClass0D3.A0I
            boolean r5 = r3.A0T
            X.1LI r4 = r3.A09
            r3 = 0
            X.C36321k7.A0v(r0, r3, r4)
            android.view.LayoutInflater r2 = X.C36351kA.A0C(r0)
            r1 = 2131626099(0x7f0e0873, float:1.8879425E38)
            android.view.View r0 = X.C36371kC.A0J(r2, r0, r1, r3)
            X.59b r12 = new X.59b
            r12.<init>(r0, r4, r5)
            return r12
        L_0x03fe:
            android.content.Context r4 = r0.getContext()
            com.whatsapp.search.SearchViewModel r2 = r3.A0P
            X.1f4 r1 = r3.A0F
            X.C36341k9.A1D(r4)
            X.C36321k7.A0x(r2, r1)
            X.8pF r0 = new X.8pF
            r0.<init>(r4, r1)
            X.C36321k7.A0N(r0)
            X.59X r12 = new X.59X
            r12.<init>(r2, r0)
            return r12
        L_0x041a:
            java.util.List r1 = X.AnonymousClass0D3.A0I
            r3 = 0
            X.AnonymousClass00C.A0D(r0, r3)
            android.content.Context r1 = r0.getContext()
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r1)
            android.content.res.Resources r1 = X.C36341k9.A0F(r0)
            r0 = 2131168372(0x7f070c74, float:1.7951044E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            r2.setPadding(r1, r1, r1, r1)
            r0 = 2131232647(0x7f080787, float:1.808141E38)
            r2.setCompoundDrawablesWithIntrinsicBounds(r0, r3, r3, r3)
            r2.setCompoundDrawablePadding(r1)
            X.59J r12 = new X.59J
            r12.<init>(r2)
            return r12
        L_0x0446:
            X.C36341k9.A1D(r0)
            android.content.Context r1 = X.C36371kC.A0B(r0)
            X.5Jj r0 = new X.5Jj
            r0.<init>(r1)
            X.59O r12 = new X.59O
            r12.<init>(r0)
            return r12
        L_0x0458:
            X.C36341k9.A1D(r0)
            android.content.Context r1 = X.C36371kC.A0B(r0)
            X.4eT r0 = new X.4eT
            r0.<init>(r1)
            X.59I r12 = new X.59I
            r12.<init>(r0)
            return r12
        L_0x046a:
            java.util.List r1 = X.AnonymousClass0D3.A0I
            android.content.Context r1 = r0.getContext()
            X.5Jb r0 = new X.5Jb
            r0.<init>(r1)
            X.59P r12 = new X.59P
            r12.<init>(r0)
            return r12
        L_0x047b:
            X.3Tl r10 = X.C65783Tl.A02
            if (r1 != r4) goto L_0x0481
            X.3Tl r10 = X.C65783Tl.A01
        L_0x0481:
            X.1RY r7 = r3.A0D
            X.1f4 r8 = r3.A0F
            com.whatsapp.search.SearchViewModel r1 = r3.A0P
            X.1Ry r9 = r1.A08
            X.1ez r4 = r3.A07
            java.util.List r1 = X.AnonymousClass0D3.A0I
            android.content.Context r5 = r0.getContext()
            r2 = 2131624742(0x7f0e0326, float:1.8876672E38)
            android.view.LayoutInflater r1 = X.C36351kA.A0C(r0)
            android.view.View r6 = X.C36361kB.A0E(r1, r0, r2)
            com.whatsapp.conversationslist.ViewHolder r12 = r4.A00(r5, r6, r7, r8, r9, r10)
            X.01M r0 = r3.A05
            r0.A04(r12)
            return r12
        L_0x04a6:
            java.util.List r1 = X.AnonymousClass0D3.A0I
            android.content.Context r1 = r0.getContext()
            X.4er r0 = new X.4er
            r0.<init>(r1)
            X.59L r12 = new X.59L
            r12.<init>(r0)
            return r12
        L_0x04b7:
            android.content.Context r1 = r0.getContext()
            java.util.List r0 = X.AnonymousClass0D3.A0I
            android.view.View r0 = new android.view.View
            r0.<init>(r1)
            X.2UP r12 = new X.2UP
            r12.<init>(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96154ms.BUw(android.view.ViewGroup, int):X.0D3");
    }

    public static Object A01(C96154ms r0, int i) {
        return ((C132056Ry) r0.A0O.get(i)).A01;
    }

    public /* bridge */ /* synthetic */ void A0C(AnonymousClass0D3 r2) {
        C97024oH r22 = (C97024oH) r2;
        AnonymousClass00C.A0D(r22, 0);
        r22.A0C();
        this.A0R.remove(r22);
    }

    public /* bridge */ /* synthetic */ void A0F(AnonymousClass0D3 r2) {
        C97024oH r22 = (C97024oH) r2;
        AnonymousClass00C.A0D(r22, 0);
        r22.A0B();
        this.A0R.add(r22);
    }

    public int A0J() {
        return this.A0O.size();
    }

    public /* bridge */ /* synthetic */ void A0K(AnonymousClass0D3 r2) {
        C97024oH r22 = (C97024oH) r2;
        AnonymousClass00C.A0D(r22, 0);
        r22.A0D();
    }

    public int BCN(int i) {
        while (i >= 0) {
            if (BLw(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: X.2bX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: X.59V} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: X.2bL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: X.59U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: X.2bV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: X.59Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: X.59Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: X.8pN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: X.59a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: X.8pH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: X.2bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: X.59T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: X.2by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: X.2UR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: X.59S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: X.8pJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: X.2bW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: X.2bU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: X.59g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v40, resolved type: X.59Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: X.8pN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v41, resolved type: X.59S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v42, resolved type: X.59S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v80, resolved type: X.2bW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: X.8pJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v81, resolved type: X.2bW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: X.8pJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v43, resolved type: X.59S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v82, resolved type: X.2bW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: X.8pJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v44, resolved type: X.59S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v83, resolved type: X.2bW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: X.8pJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v45, resolved type: X.59Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: X.8pN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v46, resolved type: X.8pN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: X.2bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v46, resolved type: X.59Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v47, resolved type: X.8pN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v86, resolved type: X.2bW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v47, resolved type: X.59S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: X.8pJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v87, resolved type: X.2bW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v48, resolved type: X.59S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v49, resolved type: X.8pJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: X.8pJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v88, resolved type: X.2bW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v49, resolved type: X.59S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v51, resolved type: X.8pJ} */
    /* JADX WARNING: type inference failed for: r4v21, types: [X.8pK, X.8pU] */
    /* JADX WARNING: type inference failed for: r0v178, types: [X.5Jh, X.5Jj, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x05a1, code lost:
        if (X.C20800yB.A01(X.C21000yV.A01, r3, 442) != false) goto L_0x05a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x08df, code lost:
        if (r2 == 1) goto L_0x08e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r2 != r1.A00) goto L_0x001c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BSE(X.AnonymousClass0D3 r22, int r23) {
        /*
            r21 = this;
            r13 = r22
            X.4oH r13 = (X.C97024oH) r13
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            r6 = r21
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x001c
            com.whatsapp.search.IteratingPlayer r1 = r6.A0M
            int r2 = r13.A05
            r0 = -1
            if (r2 != r0) goto L_0x0017
            int r2 = r13.A04
        L_0x0017:
            int r1 = r1.A00
            r0 = 1
            if (r2 == r1) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r13.A0E(r0)
            boolean r1 = r6.A03
            boolean r3 = r13 instanceof X.C1043459g
            if (r3 == 0) goto L_0x002e
            r0 = r13
            X.59g r0 = (X.C1043459g) r0
            X.4zZ r0 = r0.A01
            r0.setScrolling(r1)
        L_0x002e:
            com.whatsapp.search.SearchViewModel r5 = r6.A0P
            X.1Ry r0 = r5.A08
            java.util.List r1 = r0.BFy()
            boolean r0 = r13 instanceof X.AnonymousClass59L
            r2 = r23
            if (r0 == 0) goto L_0x0076
            X.59L r13 = (X.AnonymousClass59L) r13
            java.lang.Object r0 = A01(r6, r2)
            int r1 = X.AnonymousClass000.A0I(r0)
            X.4er r5 = r13.A00
            android.content.Context r0 = r5.getContext()
            java.lang.String r1 = r0.getString(r1)
            r2 = 0
            r4 = 5
        L_0x0052:
            android.widget.TextView r0 = r5.A04
            r0.setText(r1)
            android.view.ViewGroup$MarginLayoutParams r3 = r5.A03
            if (r2 == 0) goto L_0x0062
            r2 = 0
        L_0x005c:
            r3.bottomMargin = r2
            r5.setLayoutParams(r3)
        L_0x0061:
            return
        L_0x0062:
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168168(0x7f070ba8, float:1.795063E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.Context r1 = r5.A02
            float r0 = (float) r4
            int r0 = X.C65103Qt.A01(r1, r0)
            int r2 = r2 - r0
            goto L_0x005c
        L_0x0076:
            boolean r0 = r13 instanceof X.AnonymousClass59K
            if (r0 == 0) goto L_0x0090
            X.59K r13 = (X.AnonymousClass59K) r13
            java.lang.Object r0 = A01(r6, r2)
            android.util.Pair r0 = (android.util.Pair) r0
            X.4er r5 = r13.A00
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            boolean r2 = X.AnonymousClass000.A1X(r0)
            r4 = 0
            goto L_0x0052
        L_0x0090:
            boolean r0 = r13 instanceof X.AnonymousClass59N
            if (r0 == 0) goto L_0x00a4
            X.59N r13 = (X.AnonymousClass59N) r13
            java.lang.Object r0 = A01(r6, r2)
            X.5ms r0 = (X.C117815ms) r0
            X.5Jf r1 = r13.A00
            java.util.List r0 = r0.A00
            r1.A03(r5, r0)
            return
        L_0x00a4:
            boolean r0 = r13 instanceof X.AnonymousClass59P
            if (r0 == 0) goto L_0x0101
            X.59P r13 = (X.AnonymousClass59P) r13
            java.lang.Object r8 = A01(r6, r2)
            android.util.SparseIntArray r8 = (android.util.SparseIntArray) r8
            X.5Jb r0 = r13.A00
            com.google.android.material.chip.ChipGroup r6 = r0.A01
            r6.removeAllViews()
            java.lang.String r1 = r5.A0b()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00d9
            X.0yC r2 = r0.A00
            X.6TR r1 = X.AnonymousClass6YD.A0P
            boolean r1 = r1.A03(r2)
            if (r1 == 0) goto L_0x00d9
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131168198(0x7f070bc6, float:1.7950691E38)
            int r1 = r2.getDimensionPixelSize(r1)
            r6.setChipSpacingVertical(r1)
        L_0x00d9:
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            r4 = 0
            r3 = 0
        L_0x00df:
            int r1 = r8.size()
            if (r3 >= r1) goto L_0x0702
            int r1 = r8.keyAt(r3)
            if (r1 == 0) goto L_0x00fe
            int r1 = r8.keyAt(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            int r1 = r8.valueAt(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.C36361kB.A1O(r2, r1, r7)
        L_0x00fe:
            int r3 = r3 + 1
            goto L_0x00df
        L_0x0101:
            boolean r0 = r13 instanceof X.AnonymousClass59O
            if (r0 == 0) goto L_0x02cc
            X.59O r13 = (X.AnonymousClass59O) r13
            java.lang.Object r7 = A01(r6, r2)
            X.6CJ r7 = (X.AnonymousClass6CJ) r7
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            android.util.SparseIntArray r10 = r7.A00
            if (r10 == 0) goto L_0x01e2
            X.5Jj r6 = r13.A00
            r4 = 0
            com.google.android.material.chip.ChipGroup r3 = r6.A01
            r3.removeAllViews()
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            int r8 = r10.size()
            r2 = 0
        L_0x0126:
            if (r2 >= r8) goto L_0x0144
            int r0 = r10.keyAt(r2)
            if (r0 == 0) goto L_0x0141
            int r0 = r10.keyAt(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r10.valueAt(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C36361kB.A1O(r1, r0, r9)
        L_0x0141:
            int r2 = r2 + 1
            goto L_0x0126
        L_0x0144:
            X.7a7 r1 = X.C156527a7.A00
            r0 = 17
            X.C163897qw.A00(r1, r9, r0)
            java.util.Iterator r12 = r9.iterator()
        L_0x014f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01e2
            java.lang.Object r8 = r12.next()
            android.util.Pair r8 = (android.util.Pair) r8
            java.lang.Object r1 = r8.first
            java.lang.Number r1 = (java.lang.Number) r1
            X.0yC r0 = r6.getAbProps()
            android.util.SparseArray r0 = X.AnonymousClass6HJ.A00(r0)
            int r11 = X.C36411kG.A07(r1)
            java.lang.Object r10 = r0.get(r11)
            X.5xO r10 = (X.C123975xO) r10
            if (r10 == 0) goto L_0x014f
            com.google.android.material.chip.Chip r2 = X.C90494aF.A0I(r6)
            int r0 = r10.A05
            r2.setText(r0)
            r0 = 40
            X.AnonymousClass3YH.A00(r2, r1, r5, r0)
            android.content.Context r9 = r6.getContext()
            X.0yC r1 = r6.getAbProps()
            android.content.Context r0 = r6.getContext()
            int r0 = X.C90484aE.A08(r0)
            X.AnonymousClass6HJ.A01(r9, r2, r1, r11, r0)
            r6.setCommonViewAttributes(r2)
            int r0 = r10.A04
            r2.setId(r0)
            X.08S r1 = r5.A0g
            java.lang.Object r0 = r1.A04()
            if (r0 == 0) goto L_0x01dd
            java.lang.Object r0 = r1.A04()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01dd
            X.0yC r1 = r5.A0v
            X.6TR r0 = X.AnonymousClass6YD.A0P
            boolean r0 = r0.A03(r1)
            if (r0 == 0) goto L_0x01dd
            r2.setEnsureMinTouchTargetSize(r4)
            java.lang.Object r0 = r8.second
            java.lang.Number r0 = (java.lang.Number) r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L_0x01cf
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x01cf
            r0 = 4
            r2.setVisibility(r0)
        L_0x01cf:
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131168198(0x7f070bc6, float:1.7950691E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.setChipSpacingVertical(r0)
        L_0x01dd:
            r3.addView(r2)
            goto L_0x014f
        L_0x01e2:
            java.util.List r0 = r7.A03
            if (r0 == 0) goto L_0x0225
            X.5Jj r6 = r13.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x01ec:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0225
            java.lang.Object r1 = r4.next()
            X.6bb r1 = (X.C134786bb) r1
            com.google.android.material.chip.Chip r3 = X.C90494aF.A0I(r6)
            int r0 = r1.A03
            r3.setId(r0)
            int r0 = r1.A02
            r3.setText(r0)
            r0 = 39
            X.AnonymousClass3YH.A00(r3, r5, r1, r0)
            android.content.Context r2 = r6.getContext()
            int r1 = r1.A00
            android.content.Context r0 = r6.getContext()
            int r0 = X.C90484aE.A08(r0)
            X.C106335Jg.A01(r2, r3, r1, r0)
            r6.setCommonViewAttributes(r3)
            com.google.android.material.chip.ChipGroup r0 = r6.A01
            r0.addView(r3)
            goto L_0x01ec
        L_0x0225:
            java.util.List r1 = r7.A02
            if (r1 == 0) goto L_0x0061
            X.5Jj r0 = r13.A00
            X.7TT r4 = new X.7TT
            r4.<init>(r5)
            r5 = 1
            java.util.Iterator r7 = r1.iterator()
        L_0x0235:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0794
            java.lang.Object r6 = r7.next()
            X.6bf r6 = (X.C134826bf) r6
            android.content.Context r1 = X.C36371kC.A0B(r0)
            com.google.android.material.chip.Chip r3 = A00(r1, r6)
            r2 = 25
            X.3YM r1 = new X.3YM
            r1.<init>(r3, r6, r4, r2)
            r3.setOnClickListener(r1)
            X.6bB r6 = r6.A05
            boolean r1 = r6.A02()
            if (r1 == 0) goto L_0x02c5
            android.content.res.Resources r2 = X.C36341k9.A0F(r0)
            r1 = 2131891800(0x7f121658, float:1.941833E38)
            java.lang.String r10 = r2.getString(r1)
            r0.getContext()
            android.graphics.Typeface r9 = X.C33511fU.A00()
            android.content.res.Resources r2 = X.C36341k9.A0F(r0)
            r1 = 2131102882(0x7f060ca2, float:1.7818214E38)
            int r11 = r2.getColor(r1)
            android.content.res.Resources r2 = X.C36341k9.A0F(r0)
            r1 = 2131102997(0x7f060d15, float:1.7818448E38)
            int r12 = r2.getColor(r1)
            android.content.res.Resources r2 = X.C36341k9.A0F(r0)
            r1 = 2131168583(0x7f070d47, float:1.7951472E38)
            int r13 = r2.getDimensionPixelSize(r1)
            android.content.res.Resources r2 = X.C36341k9.A0F(r0)
            r1 = 2131168379(0x7f070c7b, float:1.7951058E38)
            int r14 = r2.getDimensionPixelSize(r1)
            android.content.res.Resources r2 = X.C36341k9.A0F(r0)
            r1 = 2131168386(0x7f070c82, float:1.7951072E38)
            int r15 = r2.getDimensionPixelSize(r1)
            X.1lN r8 = new X.1lN
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r3.setCloseIconVisible((boolean) r5)
            r3.setCloseIcon(r8)
            int r1 = r8.A00
            float r1 = (float) r1
            r3.setCloseIconSize(r1)
            android.content.Context r2 = r0.getContext()
            r1 = 1082130432(0x40800000, float:4.0)
            float r1 = X.C90524aI.A01(r2, r1)
            r3.setCloseIconEndPadding(r1)
            r6.A01()
        L_0x02c5:
            com.google.android.material.chip.ChipGroup r1 = r0.A01
            r1.addView(r3)
            goto L_0x0235
        L_0x02cc:
            boolean r0 = r13 instanceof X.AnonymousClass59Q
            if (r0 == 0) goto L_0x0336
            X.59Q r13 = (X.AnonymousClass59Q) r13
            java.lang.Object r1 = A01(r6, r2)
            java.util.List r1 = (java.util.List) r1
            X.5Jc r0 = r13.A00
            com.google.android.material.chip.ChipGroup r8 = r0.A01
            r8.removeAllViews()
            java.util.Iterator r9 = r1.iterator()
        L_0x02e3:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0794
            java.lang.Object r2 = r9.next()
            X.6bb r2 = (X.C134786bb) r2
            com.google.android.material.chip.Chip r7 = X.C90494aF.A0I(r0)
            int r1 = r2.A03
            r7.setId(r1)
            int r1 = r2.A02
            r7.setText(r1)
            r1 = 1
            r7.setClickable(r1)
            r1 = 41
            X.AnonymousClass3YH.A00(r7, r5, r2, r1)
            android.content.Context r6 = r0.getContext()
            int r2 = r2.A00
            android.content.Context r1 = r0.getContext()
            r4 = 2130970558(0x7f0407be, float:1.754983E38)
            r3 = 2131102150(0x7f0609c6, float:1.781673E38)
            int r1 = X.C224514j.A00(r1, r4, r3)
            X.C106335Jg.A01(r6, r7, r2, r1)
            r1 = 2131102149(0x7f0609c5, float:1.7816728E38)
            r7.setChipIconTintResource(r1)
            android.content.Context r2 = r0.getContext()
            android.content.Context r1 = r0.getContext()
            int r1 = X.C224514j.A00(r1, r4, r3)
            X.C90464aC.A0r(r2, r7, r1)
            r8.addView(r7)
            goto L_0x02e3
        L_0x0336:
            boolean r0 = r13 instanceof X.AnonymousClass59I
            if (r0 == 0) goto L_0x03ef
            X.59I r13 = (X.AnonymousClass59I) r13
            java.lang.Object r1 = A01(r6, r2)
            java.util.List r1 = (java.util.List) r1
            r0 = 6
            X.7sr r4 = new X.7sr
            r4.<init>(r6, r0)
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.4eT r0 = r13.A00
            X.5Jd r0 = r0.A00
            r6 = 1
            com.google.android.material.chip.ChipGroup r5 = r0.A01
            r5.removeAllViews()
            java.util.Iterator r8 = r1.iterator()
        L_0x035a:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0794
            java.lang.Object r7 = r8.next()
            X.6bf r7 = (X.C134826bf) r7
            android.content.Context r1 = X.C36371kC.A0B(r0)
            com.google.android.material.chip.Chip r3 = A00(r1, r7)
            r2 = 14
            X.3Yo r1 = new X.3Yo
            r1.<init>((java.lang.Object) r3, (java.lang.Object) r7, (java.lang.Object) r4, (int) r2)
            r3.setOnClickListener(r1)
            X.6bB r2 = r7.A05
            boolean r1 = r2.A02()
            if (r1 == 0) goto L_0x03ea
            android.content.res.Resources r7 = X.C36341k9.A0F(r0)
            r1 = 2131891800(0x7f121658, float:1.941833E38)
            java.lang.String r11 = r7.getString(r1)
            r0.getContext()
            android.graphics.Typeface r10 = X.C33511fU.A00()
            android.content.res.Resources r7 = X.C36341k9.A0F(r0)
            r1 = 2131102882(0x7f060ca2, float:1.7818214E38)
            int r12 = r7.getColor(r1)
            android.content.res.Resources r7 = X.C36341k9.A0F(r0)
            r1 = 2131102997(0x7f060d15, float:1.7818448E38)
            int r13 = r7.getColor(r1)
            android.content.res.Resources r7 = X.C36341k9.A0F(r0)
            r1 = 2131168583(0x7f070d47, float:1.7951472E38)
            int r14 = r7.getDimensionPixelSize(r1)
            android.content.res.Resources r7 = X.C36341k9.A0F(r0)
            r1 = 2131168379(0x7f070c7b, float:1.7951058E38)
            int r15 = r7.getDimensionPixelSize(r1)
            android.content.res.Resources r7 = X.C36341k9.A0F(r0)
            r1 = 2131168386(0x7f070c82, float:1.7951072E38)
            int r16 = r7.getDimensionPixelSize(r1)
            X.1lN r9 = new X.1lN
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r3.setCloseIconVisible((boolean) r6)
            r3.setCloseIcon(r9)
            int r1 = r9.A00
            float r1 = (float) r1
            r3.setCloseIconSize(r1)
            android.content.Context r7 = r0.getContext()
            r1 = 1082130432(0x40800000, float:4.0)
            float r1 = X.C90524aI.A01(r7, r1)
            r3.setCloseIconEndPadding(r1)
            r2.A01()
        L_0x03ea:
            r5.addView(r3)
            goto L_0x035a
        L_0x03ef:
            boolean r0 = r13 instanceof X.AnonymousClass59R
            if (r0 == 0) goto L_0x0452
            X.59R r13 = (X.AnonymousClass59R) r13
            java.lang.Object r1 = A01(r6, r2)
            java.util.List r1 = (java.util.List) r1
            X.4eU r0 = r13.A01
            X.5Je r6 = r0.A01
            com.google.android.material.chip.ChipGroup r4 = r6.A01
            r4.removeAllViews()
            java.util.Iterator r7 = r1.iterator()
        L_0x0408:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0798
            java.lang.Object r1 = r7.next()
            X.6bR r1 = (X.C134686bR) r1
            com.google.android.material.chip.Chip r3 = X.C90494aF.A0I(r6)
            java.lang.String r0 = r1.A02
            r3.setText(r0)
            r0 = 1
            r3.setClickable(r0)
            r0 = 37
            X.AnonymousClass3YH.A00(r3, r1, r5, r0)
            int r2 = r1.A00
            if (r2 == 0) goto L_0x0439
            android.content.Context r1 = r6.getContext()
            android.content.Context r0 = r6.getContext()
            int r0 = X.C90484aE.A08(r0)
            X.C106335Jg.A01(r1, r3, r2, r0)
        L_0x0439:
            r0 = 2131102149(0x7f0609c5, float:1.7816728E38)
            r3.setChipIconTintResource(r0)
            android.content.Context r1 = r6.getContext()
            android.content.Context r0 = r6.getContext()
            int r0 = X.C90484aE.A08(r0)
            X.C90464aC.A0r(r1, r3, r0)
            r4.addView(r3)
            goto L_0x0408
        L_0x0452:
            if (r3 == 0) goto L_0x046c
            java.lang.Object r2 = A01(r6, r2)
            X.2bU r2 = (X.AnonymousClass2bU) r2
            X.59g r13 = (X.C1043459g) r13
            X.4zZ r4 = r13.A01
            r4.setMessage(r2)
            r0 = 46
        L_0x0463:
            X.3YH r1 = new X.3YH
            r1.<init>(r13, r2, r0)
        L_0x0468:
            r4.setOnClickListener(r1)
            return
        L_0x046c:
            boolean r0 = r13 instanceof X.AnonymousClass2UR
            if (r0 == 0) goto L_0x0482
            X.78v r0 = r6.A0O
            X.3T1 r2 = r0.A01(r2)
            X.2by r2 = (X.C46972by) r2
            X.2UR r13 = (X.AnonymousClass2UR) r13
            X.8pP r4 = r13.A01
            r4.A0A(r2, r1)
            r0 = 45
            goto L_0x0463
        L_0x0482:
            boolean r0 = r13 instanceof X.AnonymousClass59X
            if (r0 == 0) goto L_0x049d
            X.78v r0 = r6.A0O
            X.3T1 r3 = r0.A01(r2)
            X.2bi r3 = (X.C46812bi) r3
            X.59X r13 = (X.AnonymousClass59X) r13
            boolean r2 = X.C36331k8.A1a(r3, r1)
            X.8pF r0 = r13.A01
            r0.A0A(r3, r1)
            X.AnonymousClass3YC.A00(r0, r13, r3, r2)
            return
        L_0x049d:
            boolean r0 = r13 instanceof X.AnonymousClass59T
            if (r0 == 0) goto L_0x04b3
            X.78v r0 = r6.A0O
            X.3T1 r2 = r0.A01(r2)
            X.2bi r2 = (X.C46812bi) r2
            X.59T r13 = (X.AnonymousClass59T) r13
            X.8pG r4 = r13.A01
            r4.A0A(r2, r1)
            r0 = 44
            goto L_0x0463
        L_0x04b3:
            boolean r0 = r13 instanceof X.AnonymousClass59a
            if (r0 == 0) goto L_0x04cd
            X.78v r0 = r6.A0O
            X.3T1 r2 = r0.A01(r2)
            X.2bi r2 = (X.C46812bi) r2
            X.59a r13 = (X.AnonymousClass59a) r13
            X.8pH r4 = r13.A01
            r4.A0A(r2, r1)
            r0 = 4
        L_0x04c7:
            X.3YC r1 = new X.3YC
            r1.<init>(r13, r2, r0)
            goto L_0x0468
        L_0x04cd:
            boolean r0 = r13 instanceof X.AnonymousClass59W
            if (r0 == 0) goto L_0x04ed
            X.78v r0 = r6.A0O
            X.3T1 r3 = r0.A01(r2)
            X.59W r13 = (X.AnonymousClass59W) r13
            X.8pO r2 = r13.A01
            r2.A09(r3, r1)
            r0 = 49
            X.AnonymousClass3YH.A00(r2, r13, r3, r0)
            r1 = 0
            X.3YC r0 = new X.3YC
            r0.<init>(r13, r3, r1)
            r2.setThumbnailOnClickListener(r0)
            return
        L_0x04ed:
            boolean r0 = r13 instanceof X.AnonymousClass59Z
            if (r0 == 0) goto L_0x0500
            X.59Z r13 = (X.AnonymousClass59Z) r13
            X.78v r0 = r6.A0O
            X.3T1 r2 = r0.A01(r2)
            X.8pK r4 = r13.A01
            r4.A09(r2, r1)
            r0 = 3
            goto L_0x04c7
        L_0x0500:
            boolean r0 = r13 instanceof X.AnonymousClass59U
            if (r0 == 0) goto L_0x0517
            X.59U r13 = (X.AnonymousClass59U) r13
            X.78v r0 = r6.A0O
            X.3T1 r2 = r0.A01(r2)
            X.2bV r2 = (X.AnonymousClass2bV) r2
            X.8pT r4 = r13.A01
            r4.A0A(r2, r1)
            r0 = 47
            goto L_0x0463
        L_0x0517:
            boolean r0 = r13 instanceof X.AnonymousClass59V
            if (r0 == 0) goto L_0x052e
            X.59V r13 = (X.AnonymousClass59V) r13
            X.78v r0 = r6.A0O
            X.3T1 r2 = r0.A01(r2)
            X.2bL r2 = (X.AnonymousClass2bL) r2
            X.8pI r4 = r13.A01
            r4.A0A(r2, r1)
            r0 = 48
            goto L_0x0463
        L_0x052e:
            boolean r0 = r13 instanceof X.AnonymousClass59S
            if (r0 == 0) goto L_0x054d
            X.78v r3 = r6.A0O
            X.3T1 r0 = r3.A01(r2)
            boolean r0 = r0 instanceof X.AnonymousClass2bX
            X.59S r13 = (X.AnonymousClass59S) r13
            X.3T1 r2 = r3.A01(r2)
            if (r0 == 0) goto L_0x05e0
            X.2bX r2 = (X.AnonymousClass2bX) r2
            X.8pJ r4 = r13.A01
            r4.A0A(r2, r1)
            r0 = 42
            goto L_0x0463
        L_0x054d:
            boolean r0 = r13 instanceof X.C1043059c
            if (r0 == 0) goto L_0x056b
            X.59c r13 = (X.C1043059c) r13
            X.78v r0 = r6.A0O
            java.lang.Object r4 = r0.get(r2)
            boolean r0 = r13 instanceof X.C1027251r
            if (r0 == 0) goto L_0x063a
            X.51r r13 = (X.C1027251r) r13
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            com.whatsapp.TextEmojiLabel r1 = r13.A00
            r0 = 34
            X.C36411kG.A1C(r1, r13, r4, r0)
            return
        L_0x056b:
            boolean r0 = r13 instanceof com.whatsapp.conversationslist.ViewHolder
            if (r0 == 0) goto L_0x05ba
            android.app.Activity r0 = r6.A04
            if (r0 == 0) goto L_0x0061
            X.78v r0 = r6.A0O
            java.lang.Object r14 = r0.get(r2)
            X.7gQ r14 = (X.AnonymousClass7gQ) r14
            X.11F r1 = r14.BDC()
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x05b8
            java.util.Map r0 = r6.A02
            if (r0 == 0) goto L_0x05b8
            java.lang.Object r4 = r0.get(r1)
            X.3Ed r4 = (X.C61953Ed) r4
        L_0x058d:
            com.whatsapp.conversationslist.ViewHolder r13 = (com.whatsapp.conversationslist.ViewHolder) r13
            X.0yC r3 = r6.A0I
            int r0 = r5.A0T()
            if (r0 > 0) goto L_0x05a3
            X.0yV r1 = X.C21000yV.A01
            r0 = 442(0x1ba, float:6.2E-43)
            boolean r0 = X.C20800yB.A01(r1, r3, r0)
            r19 = 1
            if (r0 == 0) goto L_0x05a5
        L_0x05a3:
            r19 = 0
        L_0x05a5:
            r17 = 0
            r15 = 0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.08S r0 = r5.A0d
            boolean r20 = X.C90494aF.A1U(r0, r1)
            r16 = r4
            r18 = r2
            r13.A0G(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x05b8:
            r4 = 0
            goto L_0x058d
        L_0x05ba:
            boolean r0 = r13 instanceof X.AnonymousClass2US
            if (r0 == 0) goto L_0x05ca
            X.2US r13 = (X.AnonymousClass2US) r13
            java.lang.Object r0 = A01(r6, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r13.A0G(r0)
            return
        L_0x05ca:
            boolean r0 = r13 instanceof X.AnonymousClass59Y
            if (r0 == 0) goto L_0x05eb
            X.59Y r13 = (X.AnonymousClass59Y) r13
            X.78v r0 = r6.A0O
            X.3T1 r2 = r0.A01(r2)
            X.2bS r2 = (X.AnonymousClass2bS) r2
            X.8pN r4 = r13.A01
            r4.A0A(r2, r1)
            r0 = 2
            goto L_0x04c7
        L_0x05e0:
            X.2bW r2 = (X.AnonymousClass2bW) r2
            X.8pJ r4 = r13.A01
            r4.A0B(r2, r1)
            r0 = 43
            goto L_0x0463
        L_0x05eb:
            boolean r0 = r13 instanceof X.C1043359f
            if (r0 == 0) goto L_0x0693
            X.59f r13 = (X.C1043359f) r13
            X.78v r0 = r6.A0O
            java.lang.Object r0 = X.C36441kJ.A12(r0)
            X.2dO r0 = (X.AnonymousClass2dO) r0
            X.00S r3 = r0.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            android.view.View r4 = r13.A01
            r0 = 2131431320(0x7f0b0f98, float:1.8484366E38)
            android.widget.TextView r0 = X.C36391kE.A0O(r4, r0)
            X.C33511fU.A03(r0)
            r0 = 2131431319(0x7f0b0f97, float:1.8484364E38)
            android.view.View r2 = X.C36361kB.A0G(r4, r0)
            com.airbnb.lottie.LottieAnimationView r2 = (com.airbnb.lottie.LottieAnimationView) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            r13.A00 = r2
            boolean r1 = X.C222013h.A07
            r0 = 2132017160(0x7f140008, float:1.967259E38)
            if (r1 == 0) goto L_0x0624
            r0 = 2132017161(0x7f140009, float:1.9672593E38)
        L_0x0624:
            r2.setAnimation((int) r0)
            com.airbnb.lottie.LottieAnimationView r1 = r13.A00
            if (r1 == 0) goto L_0x0924
            r0 = 1060320051(0x3f333333, float:0.7)
            r1.setSpeed(r0)
            r0 = 45
            X.3Yq r1 = new X.3Yq
            r1.<init>((java.lang.Object) r3, (int) r0)
            goto L_0x0468
        L_0x063a:
            boolean r0 = r13 instanceof X.C1026951o
            if (r0 == 0) goto L_0x064a
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            android.view.View r1 = r13.A0H
            r0 = 25
            X.C36361kB.A17(r1, r4, r0)
            return
        L_0x064a:
            boolean r0 = r13 instanceof X.C1027651v
            if (r0 == 0) goto L_0x0663
            X.51v r13 = (X.C1027651v) r13
            android.content.Context r1 = X.C36441kJ.A0F(r13)
            android.widget.FrameLayout r0 = r13.A00
            r0.removeAllViews()
            X.AnonymousClass00C.A0B(r1)
            java.lang.String r0 = "getBusinessFilter"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0663:
            boolean r0 = r13 instanceof X.C1027551u
            if (r0 == 0) goto L_0x0674
            r2 = 0
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            android.view.View r1 = r13.A0H
            r0 = 24
            X.C36361kB.A17(r1, r2, r0)
            return
        L_0x0674:
            boolean r0 = r13 instanceof X.C1027451t
            if (r0 != 0) goto L_0x0061
            boolean r0 = r13 instanceof X.C1027151q
            if (r0 == 0) goto L_0x07a3
            X.51q r13 = (X.C1027151q) r13
            X.6Ry r4 = (X.C132056Ry) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            com.whatsapp.WaTextView r1 = r13.A00
            java.lang.Object r0 = r4.A01
            X.AnonymousClass00C.A08(r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            r1.setText(r0)
            return
        L_0x0693:
            boolean r0 = r13 instanceof X.C1042959b
            if (r0 == 0) goto L_0x06dc
            X.78v r0 = r6.A0O
            java.lang.Object r2 = r0.get(r2)
            X.2dP r2 = (X.AnonymousClass2dP) r2
            X.59b r13 = (X.C1042959b) r13
            r1 = 36
            X.3YH r0 = new X.3YH
            r0.<init>(r6, r2, r1)
            X.141 r4 = r2.A00
            android.view.View r3 = r13.A00
            r3.setOnClickListener(r0)
            X.1LI r1 = r13.A01
            r0 = 2131431865(0x7f0b11b9, float:1.8485471E38)
            X.3SF r2 = X.AnonymousClass3SF.A01(r3, r1, r0)
            com.whatsapp.TextEmojiLabel r1 = r2.A01
            r0 = 2
            X.C011504z.A06(r1, r0)
            X.C33511fU.A03(r1)
            r2.A05(r4)
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x0061
            r0 = 2131431001(0x7f0b0e59, float:1.8483719E38)
            android.view.View r1 = X.C36361kB.A0G(r3, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = (com.whatsapp.wds.components.button.WDSButton) r1
            X.1Qp r0 = X.C27981Qp.OUTLINE
            r1.setVariant(r0)
            X.1gk r0 = X.C34271gk.SMALL
            r1.setSize(r0)
            return
        L_0x06dc:
            boolean r0 = r13 instanceof X.AnonymousClass59J
            if (r0 == 0) goto L_0x0061
            java.lang.Object r1 = A01(r6, r2)
            X.6ba r1 = (X.C134776ba) r1
            X.59J r13 = (X.AnonymousClass59J) r13
            java.lang.String r3 = r1.A00
            r0 = 35
            X.3YH r2 = new X.3YH
            r2.<init>(r6, r1, r0)
            android.view.View r1 = r13.A00
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.AnonymousClass00C.A0E(r1, r0)
            r0 = r1
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r3)
            r1.setOnClickListener(r2)
            return
        L_0x0702:
            X.76F r1 = X.AnonymousClass76F.A00
            java.util.Collections.sort(r7, r1)
            java.util.Iterator r13 = r7.iterator()
        L_0x070b:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0794
            java.lang.Object r7 = r13.next()
            android.util.Pair r7 = (android.util.Pair) r7
            int r12 = X.C36381kD.A04(r7)
            X.0yC r1 = r0.A00
            android.util.SparseArray r1 = X.AnonymousClass6HJ.A00(r1)
            java.lang.Object r10 = r1.get(r12)
            X.5xO r10 = (X.C123975xO) r10
            if (r10 == 0) goto L_0x070b
            com.google.android.material.chip.Chip r3 = X.C90494aF.A0I(r0)
            int r1 = r10.A05
            r3.setText(r1)
            r1 = 1
            r3.setClickable(r1)
            r1 = 22
            X.C67143Yr.A00(r3, r5, r12, r1)
            android.content.Context r11 = r0.getContext()
            X.0yC r2 = r0.A00
            android.content.Context r1 = r0.getContext()
            r9 = 2130970558(0x7f0407be, float:1.754983E38)
            r8 = 2131102150(0x7f0609c6, float:1.781673E38)
            int r1 = X.C224514j.A00(r1, r9, r8)
            X.AnonymousClass6HJ.A01(r11, r3, r2, r12, r1)
            r1 = 2131102149(0x7f0609c5, float:1.7816728E38)
            r3.setChipIconTintResource(r1)
            android.content.Context r2 = r0.getContext()
            android.content.Context r1 = r0.getContext()
            int r1 = X.C224514j.A00(r1, r9, r8)
            X.C90464aC.A0r(r2, r3, r1)
            int r1 = r10.A04
            r3.setId(r1)
            java.lang.String r1 = r5.A0b()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x078f
            X.0yC r2 = r0.A00
            X.6TR r1 = X.AnonymousClass6YD.A0P
            boolean r1 = r1.A03(r2)
            if (r1 == 0) goto L_0x078f
            r3.setEnsureMinTouchTargetSize(r4)
            int r2 = X.C36381kD.A03(r7)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r1) goto L_0x078f
            r1 = 4
            r3.setVisibility(r1)
        L_0x078f:
            r6.addView(r3)
            goto L_0x070b
        L_0x0794:
            X.C90474aD.A0y(r0)
            return
        L_0x0798:
            X.C90474aD.A0y(r6)
            X.1es r2 = r13.A00
            r1 = 3
            r0 = 5
            r2.A00(r1, r0)
            return
        L_0x07a3:
            boolean r0 = r13 instanceof X.C1027851x
            if (r0 == 0) goto L_0x083f
            X.51x r13 = (X.C1027851x) r13
            X.5Jm r4 = (X.C106385Jm) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            android.view.View r0 = r13.A00
            android.content.Context r6 = X.C36371kC.A0B(r0)
            android.view.View r1 = r13.A0H
            r0 = 2131432826(0x7f0b157a, float:1.848742E38)
            android.view.View r8 = X.C36361kB.A0G(r1, r0)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r8.removeAllViews()
            r0 = 2131886854(0x7f120306, float:1.9408299E38)
            java.lang.String r5 = X.C36361kB.A0m(r6, r0)
            java.util.List r9 = r4.A00
            int r7 = r9.size()
            r4 = 0
        L_0x07d1:
            if (r4 >= r7) goto L_0x0837
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r6)
            r0 = 2131624282(0x7f0e015a, float:1.887574E38)
            android.view.View r2 = X.C36361kB.A0E(r1, r8, r0)
            r0 = 2131432686(0x7f0b14ee, float:1.8487136E38)
            android.view.View r3 = X.C36361kB.A0G(r2, r0)
            r0 = 12
            if (r4 <= 0) goto L_0x07f5
            android.view.ViewGroup$MarginLayoutParams r1 = X.C36371kC.A0K(r3)
            int r0 = X.C65723Tf.A00(r3, r0)
            int r0 = -r0
            r1.setMarginStart(r0)
        L_0x07f5:
            int r0 = r4 * 12
            int r0 = 48 - r0
            int r0 = X.C65723Tf.A00(r3, r0)
            float r0 = (float) r0
            r3.setElevation(r0)
            r8.addView(r2)
            X.AnonymousClass00C.A0B(r2)
            r0 = 2131432983(0x7f0b1617, float:1.8487739E38)
            android.view.View r3 = X.C012005e.A02(r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.components.button.ThumbnailButton"
            X.AnonymousClass00C.A0E(r3, r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.Object r2 = r9.get(r4)
            X.141 r2 = (X.AnonymousClass141) r2
            X.652 r0 = r13.A02
            X.C36321k7.A0w(r2, r3)
            X.545 r1 = new X.545
            r1.<init>(r3, r0, r2)
            X.16I r0 = r13.A03
            r0.registerObserver(r1)
            java.util.List r0 = r13.A05
            r0.add(r1)
            X.1RY r0 = r13.A04
            r0.A08(r3, r2)
            int r4 = r4 + 1
            goto L_0x07d1
        L_0x0837:
            X.652 r1 = r13.A02
            com.whatsapp.TextEmojiLabel r0 = r13.A01
            r1.A00(r6, r0, r5)
            return
        L_0x083f:
            boolean r0 = r13 instanceof X.C1027751w
            if (r0 == 0) goto L_0x08c4
            X.51w r13 = (X.C1027751w) r13
            X.5Jq r4 = (X.C106425Jq) r4
            r7 = 0
            X.AnonymousClass00C.A0D(r4, r7)
            X.6QG r0 = r4.A00
            java.lang.String r3 = r0.A07
            r5 = 0
            if (r3 == 0) goto L_0x08bb
            boolean r0 = r0.A04()
            r1 = 2131890841(0x7f121299, float:1.9416385E38)
            if (r0 == 0) goto L_0x085e
            r1 = 2131890839(0x7f121297, float:1.9416381E38)
        L_0x085e:
            android.view.View r9 = r13.A0H
            android.content.Context r0 = r9.getContext()
            r8 = 1
            java.lang.String r2 = X.C36351kA.A0w(r0, r3, r8, r1)
            X.AnonymousClass00C.A08(r2)
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x087a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "[Internal] "
            java.lang.String r2 = X.AnonymousClass000.A0p(r0, r2, r1)
        L_0x087a:
            int r6 = X.AnonymousClass099.A0C(r2, r3, r7, r7)
            r0 = -1
            if (r6 == r0) goto L_0x08aa
            int r3 = r3.length()
            int r3 = r3 + r6
            android.text.SpannableStringBuilder r2 = X.C36441kJ.A0P(r2)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r8)
            r2.setSpan(r0, r6, r3, r7)
            android.content.Context r1 = r9.getContext()
            r0 = 2131102028(0x7f06094c, float:1.7816482E38)
            int r1 = X.AnonymousClass00F.A00(r1, r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            r2.setSpan(r0, r6, r3, r7)
            com.whatsapp.WaTextView r0 = r13.A00
            r0.setText(r2)
        L_0x08aa:
            com.whatsapp.wds.components.button.WDSButton r1 = r13.A01
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x08b2
            r5 = 8
        L_0x08b2:
            r1.setVisibility(r5)
            r0 = 23
            X.C36361kB.A17(r1, r4, r0)
            return
        L_0x08bb:
            com.whatsapp.WaTextView r1 = r13.A00
            r0 = 2131890840(0x7f121298, float:1.9416383E38)
            r1.setText(r0)
            goto L_0x08aa
        L_0x08c4:
            boolean r0 = r13 instanceof X.C1027051p
            if (r0 == 0) goto L_0x08e8
            X.51p r13 = (X.C1027051p) r13
            X.6Ry r4 = (X.C132056Ry) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            com.whatsapp.WaTextView r3 = r13.A00
            java.lang.Object r0 = r4.A01
            int r2 = X.AnonymousClass000.A0I(r0)
            r0 = -1
            if (r2 == r0) goto L_0x08e1
            r1 = 1
            r0 = 2131894457(0x7f1220b9, float:1.942372E38)
            if (r2 != r1) goto L_0x08e4
        L_0x08e1:
            r0 = 2131886858(0x7f12030a, float:1.9408307E38)
        L_0x08e4:
            r3.setText(r0)
            return
        L_0x08e8:
            boolean r0 = r13 instanceof X.C1027351s
            if (r0 == 0) goto L_0x091c
            X.51s r13 = (X.C1027351s) r13
            X.6Ry r4 = (X.C132056Ry) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            android.content.Context r3 = X.C36441kJ.A0F(r13)
            r0 = 2131886854(0x7f120306, float:1.9408299E38)
            java.lang.String r2 = X.C36361kB.A0m(r3, r0)
            java.lang.Object r0 = r4.A01
            X.AnonymousClass00C.A08(r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x0914
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "[Internal] "
            java.lang.String r2 = X.AnonymousClass000.A0p(r0, r2, r1)
        L_0x0914:
            X.652 r1 = r13.A01
            com.whatsapp.TextEmojiLabel r0 = r13.A00
            r1.A00(r3, r0, r2)
            return
        L_0x091c:
            X.51y r13 = (X.C1027951y) r13
            X.5Jr r4 = (X.C106435Jr) r4
            r13.A0G(r4, r1)
            return
        L_0x0924:
            java.lang.String r0 = "animation"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96154ms.BSE(X.0D3, int):void");
    }

    public boolean BtE() {
        SearchViewModel searchViewModel = this.A0P;
        if (C90494aF.A1U(searchViewModel.A0b, Boolean.TRUE) || searchViewModel.A0Z() != null) {
            return true;
        }
        return false;
    }

    public int getItemViewType(int i) {
        return this.A0O.A00(i);
    }

    public C96154ms(Activity activity, AnonymousClass01M r11, C24801Dv r12, C19700wN r13, C33261ez r14, C115905jd r15, AnonymousClass17Y r16, AnonymousClass1LI r17, AnonymousClass1X4 r18, AnonymousClass1K3 r19, C124155xg r20, AnonymousClass1Pp r21, AnonymousClass1RY r22, C65383Rv r23, C19630wG r24, C20830yE r25, C18820ts r26, AnonymousClass1A5 r27, C32731e6 r28, AnonymousClass1TA r29, C20810yC r30, AnonymousClass190 r31, AnonymousClass1DU r32, AnonymousClass1P5 r33, AnonymousClass2XH r34, C33191es r35, C24681Dj r36, IteratingPlayer iteratingPlayer, SearchViewModel searchViewModel, AnonymousClass1X7 r39, AnonymousClass13J r40, C19770wU r41, AnonymousClass2XJ r42) {
        this();
        this.A01 = "";
        C20810yC r4 = r30;
        this.A0I = r4;
        this.A04 = activity;
        this.A05 = r11;
        this.A0f = r39;
        this.A0W = r16;
        this.A0V = r13;
        C19770wU r3 = r41;
        this.A0h = r3;
        C19630wG r7 = r24;
        this.A0G = r7;
        this.A0J = r31;
        this.A0A = r18;
        this.A0B = r19;
        AnonymousClass1DU r6 = r32;
        this.A0K = r6;
        this.A0d = r34;
        this.A0U = r12;
        this.A0X = r21;
        C18820ts r8 = r26;
        this.A0H = r8;
        this.A0a = r28;
        this.A0P = searchViewModel;
        this.A0M = iteratingPlayer;
        this.A0D = r22;
        this.A0Q = r42;
        this.A0b = r29;
        this.A0Y = r25;
        this.A0c = r33;
        this.A0Z = r27;
        C24681Dj r5 = r36;
        this.A0e = r5;
        this.A08 = r15;
        this.A0L = r35;
        this.A0C = r20;
        this.A09 = r17;
        this.A0g = r40;
        this.A0E = r23;
        this.A07 = r14;
        boolean z = true;
        this.A0F = new C33301f4(new C19930wk(r3, true));
        this.A0N = new C138576iL(this, this);
        this.A0O = new C1512578v(r7, r8, r6);
        this.A0T = r4.A07(6739) != 1 ? false : z;
        this.A0S = r5.A05();
    }

    public C96154ms() {
        this.A0R = C36441kJ.A16();
        this.A06 = new C162517oi(this, 11);
    }
}
