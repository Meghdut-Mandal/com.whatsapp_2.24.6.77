package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2H1  reason: invalid class name */
public class AnonymousClass2H1 extends AnonymousClass28f {
    public AnonymousClass3KV A00;
    public C107265Nh A01;
    public AnonymousClass5Ng A02;
    public C49202ij A03;
    public C49212ik A04;
    public final C19730wQ A05;
    public final AnonymousClass67L A06;
    public final C27701Pj A07;
    public final AnonymousClass1LV A08;
    public final AnonymousClass1Pp A09;
    public final AnonymousClass16D A0A;
    public final AnonymousClass171 A0B;
    public final C27761Ps A0C;
    public final AnonymousClass1NM A0D;
    public final AnonymousClass17X A0E;
    public final C232317r A0F;
    public final AnonymousClass141 A0G;
    public final C27751Pr A0H;
    public final C20810yC A0I;
    public final AnonymousClass1NN A0J;
    public final AnonymousClass1EL A0K;
    public final AnonymousClass147 A0L;
    public final C31021b9 A0M;
    public final C26371Jx A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final C19460v5 A0Q;
    public final AnonymousClass4PQ A0R = new AnonymousClass4YS(this, 0);
    public final AnonymousClass4PR A0S = new AnonymousClass4YT(this, 0);
    public final AnonymousClass3TV A0T;
    public final AnonymousClass1T4 A0U;
    public final C20230xE A0V;
    public final C19970wo A0W;
    public final AnonymousClass1HJ A0X;
    public final AnonymousClass1HO A0Y;
    public final AnonymousClass1YR A0Z;
    public final AnonymousClass1LU A0a;
    public final C55022tw A0b;
    public final C27361Nx A0c;
    public final C34661hR A0d = new AnonymousClass4YG(this, 0);
    public final C31031bA A0e;
    public final C64263Nh A0f;
    public final AnonymousClass1EM A0g;
    public final AnonymousClass13J A0h;
    public final C32011co A0i = new C90224Zo(this, 0);
    public final AnonymousClass1HP A0j;

    private void A04(MenuItem menuItem, boolean z) {
        View actionView;
        if (!this.A0O || !this.A0F.A0M(this.A0L) || (actionView = menuItem.getActionView()) == null) {
            this.A0B.BmB(this.A00, z, false);
        } else {
            this.A0T.A04(actionView, z ? 1 : 0);
        }
    }

    public static void A05(AnonymousClass2H1 r6, long j) {
        DeviceJid deviceJid;
        AnonymousClass1HJ r2 = r6.A0X;
        C107265Nh A052 = r2.A05(j);
        if (A052 != null) {
            r6.A01 = A052;
            if (A052.A08 == 2) {
                r6.A0J.Boy(new AnonymousClass751(42, C34681hT.A08(A052.A04.A02), r6));
            }
            if (A052.A0F != null && A052.A08 == 2 && r6.A0I.A0E(5249)) {
                HashSet A16 = C36441kJ.A16();
                Iterator it = A052.A0C().iterator();
                while (it.hasNext()) {
                    C107255Nf r22 = (C107255Nf) it.next();
                    if (r22.A01 == 5) {
                        UserJid userJid = r22.A00;
                        C223113u r0 = DeviceJid.Companion;
                        if (userJid != null) {
                            deviceJid = userJid.getPrimaryDevice();
                        } else {
                            deviceJid = null;
                        }
                        A16.add(deviceJid);
                    }
                }
                if (A16.size() > 0) {
                    HashSet A002 = r6.A06.A00(A16, true);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    C36341k9.A1N("groupconversationmenu/maybeprefetchvoicechat prefetch e2ee sessions for group call, ", A0u, A002);
                    C36341k9.A1O(A0u, " session missing");
                }
            }
            r6.A0B.Bwj(A052);
        } else if (r6.A03 == null) {
            C49202ij r1 = new C49202ij(r6.A0R, r2, j);
            r6.A03 = r1;
            C36371kC.A1P(r1, r6.A0J);
        }
    }

    private boolean A06(boolean z) {
        if (this.A0B.BK7()) {
            return false;
        }
        C20810yC r6 = this.A0I;
        AnonymousClass147 r7 = this.A0L;
        AnonymousClass141 r5 = this.A00;
        AnonymousClass1MK r2 = this.A0A;
        AnonymousClass1EM r8 = this.A0g;
        return AnonymousClass3UL.A07(this.A05, this.A08, r2, this.A0A, this.A0E, r5, r6, r7, r8, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0280, code lost:
        if (r6.A0K.A01(r6.A00) != false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02b6, code lost:
        if (r0 == false) goto L_0x02b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BUv(android.view.Menu r23) {
        /*
            r22 = this;
            r8 = r23
            boolean r0 = r8 instanceof X.C016307a
            r7 = 1
            r6 = r22
            if (r0 == 0) goto L_0x0016
            X.0yC r0 = r6.A0I
            boolean r0 = X.C36361kB.A1Y(r0)
            if (r0 == 0) goto L_0x0016
            r0 = r8
            X.07a r0 = (X.C016307a) r0
            r0.A0C = r7
        L_0x0016:
            java.lang.String r0 = "groupconversationmenu/oncreateoptionsmenu"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.12q r5 = r6.A0E
            X.147 r4 = r6.A0L
            int r3 = r5.A05(r4)
            X.1LV r2 = r6.A08
            r1 = 0
            X.AnonymousClass00C.A0D(r4, r1)
            boolean r0 = r2.A0K(r4, r3)
            if (r0 == 0) goto L_0x0091
            r14 = 2131886238(0x7f12009e, float:1.940705E38)
            r11 = 32
            if (r23 != 0) goto L_0x03b3
            r10 = 0
        L_0x0037:
            r0 = 2131626326(0x7f0e0956, float:1.8879885E38)
            android.view.View r13 = X.C36441kJ.A0R(r10, r0)
            if (r13 == 0) goto L_0x0078
            boolean r0 = X.C222013h.A07
            if (r0 == 0) goto L_0x0078
            r0 = 2131430179(0x7f0b0b23, float:1.8482052E38)
            android.widget.ImageView r9 = X.C36391kE.A0N(r13, r0)
            android.content.res.Resources r12 = X.C36341k9.A0F(r9)
            r0 = 2131169061(0x7f070f25, float:1.7952441E38)
            X.C36361kB.A10(r12, r9, r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r9.setScaleType(r0)
            boolean r0 = X.C222013h.A05
            if (r0 == 0) goto L_0x0078
            android.content.Context r0 = r9.getContext()
            X.AnonymousClass00C.A0D(r0, r1)
            int r1 = X.C224314h.A00(r0)
            r0 = 2131230984(0x7f080108, float:1.8078036E38)
            r9.setBackgroundResource(r0)
            int r1 = X.C36381kD.A05(r9, r1)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r9.setColorFilter(r1, r0)
        L_0x0078:
            r12 = 2
            r10.setShowAsAction(r12)
            android.view.View r9 = r10.getActionView()
            if (r9 == 0) goto L_0x008c
            r1 = 2131434119(0x7f0b1a87, float:1.8490043E38)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r9.setTag(r1, r0)
        L_0x008c:
            if (r13 != 0) goto L_0x036a
            r8.removeItem(r11)
        L_0x0091:
            X.141 r0 = r6.A00
            boolean r0 = r0.A0i
            if (r0 != 0) goto L_0x012d
            int r1 = r5.A05(r4)
            r0 = 3
            if (r1 == r0) goto L_0x012d
            X.1HO r9 = r6.A0Y
            boolean r0 = r9.A07(r4)
            if (r0 == 0) goto L_0x035a
            X.5Ng r0 = r9.A02(r4)
            r6.A02 = r0
            if (r0 == 0) goto L_0x00b5
            long r0 = r0.A02()
            A05(r6, r0)
        L_0x00b5:
            X.3KV r0 = r6.A00
            if (r0 != 0) goto L_0x00ce
            X.0yC r0 = r6.A0I
            boolean r0 = X.C34681hT.A0M(r0)
            if (r0 == 0) goto L_0x00ce
            X.1b9 r10 = r6.A0M
            X.11F r9 = r6.A0G
            r1 = 0
            X.4YU r0 = new X.4YU
            r0.<init>(r6, r1)
            r10.A03(r9, r0)
        L_0x00ce:
            X.0yC r12 = r6.A0I
            X.0wQ r11 = r6.A05
            boolean r0 = X.C34681hT.A0B(r11, r12)
            if (r0 == 0) goto L_0x00df
            X.4V7 r1 = r6.A0B
            X.3KV r0 = r6.A00
            r1.Bu7(r0)
        L_0x00df:
            X.5Ng r0 = r6.A02
            if (r0 != 0) goto L_0x0356
            X.3KV r0 = r6.A00
            if (r0 == 0) goto L_0x0284
            X.C18740tg.A06(r0)
            int r1 = r0.A00
            r0 = 2
            boolean r3 = X.AnonymousClass000.A1S(r1, r0)
        L_0x00f1:
            boolean r0 = X.C34681hT.A0B(r11, r12)
            if (r0 != 0) goto L_0x012d
            com.whatsapp.voipcalling.CallInfo r5 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.4V7 r0 = r6.A0B
            boolean r0 = r0.BK7()
            if (r0 != 0) goto L_0x0111
            X.1MK r0 = r6.A0A
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0277
            boolean r0 = X.C34681hT.A0S(r4, r5)
            if (r0 != 0) goto L_0x0277
        L_0x0111:
            r9 = 0
        L_0x0112:
            boolean r13 = X.C34681hT.A0S(r4, r5)
            boolean r0 = X.C34681hT.A0A(r11, r12)
            r10 = 2
            if (r0 == 0) goto L_0x01e5
            if (r5 == 0) goto L_0x0125
            boolean r0 = r5.isAudioChat()
            if (r0 != 0) goto L_0x012d
        L_0x0125:
            X.5Nh r0 = r6.A01
            if (r0 == 0) goto L_0x01e5
            int r0 = r0.A08
            if (r0 != r10) goto L_0x01e5
        L_0x012d:
            r3 = 21
            boolean r0 = r2.A0H(r4)
            r1 = 2131890172(0x7f120ffc, float:1.9415028E38)
            if (r0 == 0) goto L_0x013b
            r1 = 2131886486(0x7f120196, float:1.9407552E38)
        L_0x013b:
            r0 = 2131234154(0x7f080d6a, float:1.8084466E38)
            r6.A0D(r8, r3, r1, r0)
            X.1EL r5 = r6.A0K
            X.11F r0 = r6.A0G
            boolean r0 = r5.A02(r0)
            if (r0 != 0) goto L_0x015e
            r3 = 6
            boolean r0 = r2.A0H(r4)
            r1 = 2131895686(0x7f122586, float:1.9426212E38)
            if (r0 == 0) goto L_0x0158
            r1 = 2131895665(0x7f122571, float:1.942617E38)
        L_0x0158:
            r0 = 2131232734(0x7f0807de, float:1.8081586E38)
            r6.A0D(r8, r3, r1, r0)
        L_0x015e:
            r3 = 7
            r1 = 2131896951(0x7f122a77, float:1.9428778E38)
            r0 = 2131231838(0x7f08045e, float:1.8079768E38)
            r6.A0D(r8, r3, r1, r0)
            r3 = 4
            int r1 = r6.A0C()
            r0 = 2131231814(0x7f080446, float:1.807972E38)
            r6.A0D(r8, r3, r1, r0)
            X.141 r3 = r6.A0G
            boolean r1 = r5.A01(r3)
            X.1NN r0 = r6.A0J
            boolean r0 = r0.A00(r3, r4)
            if (r0 != 0) goto L_0x0189
            X.1Jx r0 = r6.A0N
            boolean r0 = r0.A00(r3, r4)
            if (r0 == 0) goto L_0x0196
        L_0x0189:
            if (r1 != 0) goto L_0x0196
            r3 = 12
            r1 = 2131889232(0x7f120c50, float:1.9413122E38)
            r0 = 2131232346(0x7f08065a, float:1.8080799E38)
            r6.A0D(r8, r3, r1, r0)
        L_0x0196:
            r3 = 5
            r1 = 2131896107(0x7f12272b, float:1.9427066E38)
            r0 = 2131232779(0x7f08080b, float:1.8081677E38)
            r6.A0D(r8, r3, r1, r0)
            r1 = 2131896785(0x7f1229d1, float:1.9428441E38)
            r0 = 0
            android.view.SubMenu r5 = r8.addSubMenu(r0, r7, r0, r1)
            r5.clearHeader()
            r3 = 9
            r1 = 2131893610(0x7f121d6a, float:1.9422001E38)
            r0 = 2131232812(0x7f08082c, float:1.8081744E38)
            r6.A0D(r5, r3, r1, r0)
            X.17X r0 = r6.A0E
            boolean r0 = r0.A0C(r4)
            if (r0 == 0) goto L_0x01d2
            r3 = 23
            boolean r0 = r2.A0H(r4)
            r1 = 2131889452(0x7f120d2c, float:1.9413568E38)
            if (r0 == 0) goto L_0x01cc
            r1 = 2131889441(0x7f120d21, float:1.9413546E38)
        L_0x01cc:
            r0 = 2131232274(0x7f080612, float:1.8080653E38)
            r6.A0D(r5, r3, r1, r0)
        L_0x01d2:
            r6.A0G(r5)
            r6.A0E(r5)
            r6.A0F(r5)
            X.3TV r1 = r6.A0T
            r0 = 0
            r1.A02 = r0
            r1.A03 = r0
            r1.A01 = r0
            return
        L_0x01e5:
            boolean r0 = X.C34681hT.A0B(r11, r12)
            if (r0 == 0) goto L_0x01f7
            X.5Nh r0 = r6.A01
            if (r0 != 0) goto L_0x01f3
            X.3KV r0 = r6.A00
            if (r0 == 0) goto L_0x01f7
        L_0x01f3:
            if (r13 != 0) goto L_0x01f7
            goto L_0x012d
        L_0x01f7:
            r1 = 27
            r11 = 2131897132(0x7f122b2c, float:1.9429145E38)
            r0 = 2131231571(0x7f080353, float:1.8079227E38)
            android.view.MenuItem r5 = r6.A0D(r8, r1, r11, r0)
            r0 = 2131625317(0x7f0e0565, float:1.8877839E38)
            r5.setActionView(r0)
            r5.setShowAsAction(r10)
            android.view.View r10 = r5.getActionView()
            if (r10 == 0) goto L_0x021c
            r1 = 2131434119(0x7f0b1a87, float:1.8490043E38)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r10.setTag(r1, r0)
        L_0x021c:
            android.view.View r10 = r5.getActionView()
            r0 = 2131431088(0x7f0b0eb0, float:1.8483895E38)
            android.view.View r1 = X.C012005e.A02(r10, r0)
            com.whatsapp.text.AutoSizeTextView r1 = (com.whatsapp.text.AutoSizeTextView) r1
            if (r13 == 0) goto L_0x022e
            r11 = 2131896047(0x7f1226ef, float:1.9426944E38)
        L_0x022e:
            r1.setText(r11)
            r0 = 56
            r1.A0D(r0)
            r0 = 2131428508(0x7f0b049c, float:1.8478662E38)
            android.widget.ImageView r1 = X.C36401kF.A0G(r10, r0)
            r0 = 2131231779(0x7f080423, float:1.8079649E38)
            if (r3 == 0) goto L_0x0245
            r0 = 2131231867(0x7f08047b, float:1.8079827E38)
        L_0x0245:
            r1.setImageResource(r0)
            X.01L r1 = r6.A05
            r0 = 2131891814(0x7f121666, float:1.9418359E38)
            if (r3 == 0) goto L_0x0252
            r0 = 2131895656(0x7f122568, float:1.9426151E38)
        L_0x0252:
            java.lang.String r3 = r1.getString(r0)
            r0 = 2131895964(0x7f12269c, float:1.9426776E38)
            if (r13 == 0) goto L_0x025e
            r0 = 2131896047(0x7f1226ef, float:1.9426944E38)
        L_0x025e:
            java.lang.String r1 = r1.getString(r0)
            X.1rZ r0 = new X.1rZ
            r0.<init>(r3, r1)
            X.C012005e.A0V(r10, r0)
            r0 = 2131897132(0x7f122b2c, float:1.9429145E38)
            if (r13 == 0) goto L_0x0272
            r0 = 2131896047(0x7f1226ef, float:1.9426944E38)
        L_0x0272:
            r6.A0I(r5, r0, r9)
            goto L_0x012d
        L_0x0277:
            X.1EL r1 = r6.A0K
            X.141 r0 = r6.A00
            boolean r0 = r1.A01(r0)
            r9 = 1
            if (r0 == 0) goto L_0x0112
            goto L_0x0111
        L_0x0284:
            r9 = 0
            boolean r0 = r2.A0K(r4, r3)
            if (r0 != 0) goto L_0x0326
            X.0yf r10 = r6.A08
            X.17X r1 = r6.A0E
            X.141 r0 = r6.A00
            boolean r0 = X.AnonymousClass3UL.A08(r10, r5, r1, r0, r4)
            if (r0 == 0) goto L_0x0313
            boolean r0 = r2.A0K(r4, r3)
            if (r0 != 0) goto L_0x0313
            boolean r0 = r6.A0P
            if (r0 == 0) goto L_0x02aa
            X.17r r0 = r6.A0F
            boolean r0 = r0.A0M(r4)
            if (r0 == 0) goto L_0x02aa
            r9 = 1
        L_0x02aa:
            boolean r11 = r6.A06(r9)
            r10 = 2
            if (r9 == 0) goto L_0x02b8
            boolean r0 = r6.A0O
            r5 = 2131233963(0x7f080cab, float:1.8084078E38)
            if (r0 != 0) goto L_0x02bb
        L_0x02b8:
            r5 = 2131233878(0x7f080c56, float:1.8083906E38)
        L_0x02bb:
            r1 = 26
            r0 = 2131895636(0x7f122554, float:1.942611E38)
            r3 = 2131895636(0x7f122554, float:1.942611E38)
            android.view.MenuItem r1 = r6.A0D(r8, r1, r0, r5)
            r0 = 2131626446(0x7f0e09ce, float:1.8880128E38)
            r1.setActionView(r0)
            r6.A0I(r1, r3, r11)
            r1.setShowAsAction(r10)
            android.view.View r0 = r1.getActionView()
            X.C18740tg.A04(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageResource(r5)
            X.4V7 r0 = r6.A0B
            r0.BPZ()
            if (r9 == 0) goto L_0x02eb
            r6.A03(r8, r11)
            goto L_0x012d
        L_0x02eb:
            r9 = 2131886548(0x7f1201d4, float:1.9407678E38)
            r0 = 25
            r5 = 2131231779(0x7f080423, float:1.8079649E38)
            android.view.MenuItem r3 = r6.A0D(r8, r0, r9, r5)
            r0 = 2131624137(0x7f0e00c9, float:1.8875445E38)
            android.view.View r1 = X.C36441kJ.A0R(r3, r0)
            X.C18740tg.A04(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setImageResource(r5)
            X.01L r0 = r6.A05
            X.C36331k8.A0q(r0, r1, r9)
            r6.A0I(r3, r9, r11)
            r3.setShowAsAction(r10)
            goto L_0x012d
        L_0x0313:
            boolean r0 = r1.A0C(r4)
            if (r0 == 0) goto L_0x012d
            boolean r0 = r6.A0P
            if (r0 == 0) goto L_0x0326
            boolean r0 = r6.A06(r7)
            r6.A03(r8, r0)
            goto L_0x012d
        L_0x0326:
            boolean r9 = r6.A06(r9)
            X.0yf r3 = r6.A08
            X.17X r1 = r6.A0E
            X.141 r0 = r6.A00
            boolean r0 = X.AnonymousClass3UL.A08(r3, r5, r1, r0, r4)
            if (r0 != 0) goto L_0x033f
            boolean r0 = r6.A0P
            if (r0 == 0) goto L_0x033f
            r6.A03(r8, r9)
            goto L_0x012d
        L_0x033f:
            r1 = 24
            r3 = 2131890064(0x7f120f90, float:1.941481E38)
            r0 = 2131231818(0x7f08044a, float:1.8079728E38)
            android.view.MenuItem r1 = r6.A0D(r8, r1, r3, r0)
            r0 = 2131625084(0x7f0e047c, float:1.8877366E38)
            r1.setActionView(r0)
            X.AnonymousClass28f.A01(r1, r6, r3, r9)
            goto L_0x012d
        L_0x0356:
            boolean r3 = r0.A01
            goto L_0x00f1
        L_0x035a:
            X.4PR r0 = r6.A0S
            X.2ik r1 = new X.2ik
            r1.<init>(r0, r9, r4)
            r6.A04 = r1
            X.0wU r0 = r6.A0J
            X.C36371kC.A1P(r1, r0)
            goto L_0x00b5
        L_0x036a:
            r0 = 2131432323(0x7f0b1383, float:1.84864E38)
            android.view.View r9 = X.C012005e.A02(r13, r0)
            com.whatsapp.WaImageButton r9 = (com.whatsapp.WaImageButton) r9
            android.content.Context r16 = r9.getContext()
            java.lang.Object[] r11 = new java.lang.Object[r7]
            X.171 r15 = r6.A0B
            X.141 r1 = r6.A00
            r0 = 0
            X.C36361kB.A1F(r15, r1, r11, r0)
            r1 = 2131886229(0x7f120095, float:1.940703E38)
            r0 = r16
            X.C36371kC.A14(r0, r13, r11, r1)
            X.C33521fV.A02(r13)
            X.C33521fV.A03(r13, r14)
            r9.setImportantForAccessibility(r12)
            android.content.res.Resources r1 = r16.getResources()
            r0 = 2131165857(0x7f0702a1, float:1.7945943E38)
            int r21 = r1.getDimensionPixelSize(r0)
            X.3aA r15 = new X.3aA
            r20 = r6
            r19 = r9
            r18 = r10
            r17 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21)
            X.0wU r1 = r2.A0C
            r0 = 17
            X.C36371kC.A1Q(r1, r2, r4, r15, r0)
            goto L_0x0091
        L_0x03b3:
            android.view.MenuItem r10 = r8.add(r1, r11, r1, r14)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2H1.BUv(android.view.Menu):void");
    }

    private void A03(Menu menu, boolean z) {
        MenuItem A0D2 = A0D(menu, 31, R.string.f12nameremoved, R.drawable.vec_ic_voicechat);
        View A0R2 = C36441kJ.A0R(A0D2, R.layout.f9nameremoved);
        C18740tg.A04(A0R2);
        ImageView imageView = (ImageView) A0R2;
        imageView.setImageResource(R.drawable.vec_ic_voicechat);
        C36331k8.A0q(this.A05, imageView, R.string.f12nameremoved);
        A0I(A0D2, R.string.f12nameremoved, z);
        C20810yC r3 = this.A0I;
        C19730wQ r2 = this.A05;
        AnonymousClass17X r0 = this.A0E;
        int A0B2 = r0.A07.A0B(this.A0L);
        if (C34681hT.A0D(r2, r3, A0B2) && !C34681hT.A0C(r2, r3, A0B2)) {
            A0D2.getActionView().setAlpha(0.4f);
        }
        A0D2.setShowAsAction(2);
    }

    public boolean Bbx(MenuItem menuItem) {
        View view;
        AnonymousClass3TV r0;
        int itemId = menuItem.getItemId();
        if (itemId != 12) {
            if (itemId != 13) {
                int i = 2;
                switch (itemId) {
                    case 21:
                        AnonymousClass1LV r1 = this.A08;
                        AnonymousClass147 r02 = this.A0L;
                        AnonymousClass147 A022 = r1.A02(r02);
                        if (A022 != null && r1.A0H(r02)) {
                            C20230xE r2 = this.A0V;
                            AnonymousClass01L r12 = this.A05;
                            if (r2.Bkz(r12, r12.findViewById(16908290), A022)) {
                                return true;
                            }
                        }
                        AnonymousClass01L r3 = this.A05;
                        Intent A0q = AnonymousClass190.A0q(r3, this.A00.A0H, true, false, false);
                        Bundle A002 = AnonymousClass3CG.A00(r3, C03570Gk.A0B(r3, R.id.transition_start), this.A09);
                        AnonymousClass3M9.A00(A0q, r3);
                        C05290Pd.A00(r3, A0q, A002);
                        return true;
                    case 22:
                        C19460v5 r13 = this.A01;
                        if (r13.A05()) {
                            r13.A02();
                            this.A02.A02();
                            throw AnonymousClass001.A0A("getLabelGroup");
                        }
                        break;
                    case 23:
                        this.A0c.A06(this.A0G);
                        this.A06.Bu2(0, R.string.f12nameremoved);
                        C19770wU r14 = this.A0J;
                        AnonymousClass01L r5 = this.A05;
                        AnonymousClass1YR r7 = this.A0Z;
                        r14.Box(new C49422j5(new AnonymousClass4ZI(this, 3), r5, this.A08, r7, Collections.singleton(this.A0L)), new Object[0]);
                        return true;
                    case 24:
                        C232317r r03 = this.A0F;
                        AnonymousClass147 r52 = this.A0L;
                        if (r03.A0C(r52).A08.size() > Math.min(64, this.A08.A04(C21100yf.A1g))) {
                            AnonymousClass3UD.A07(this.A05, this.A0A, r52, AnonymousClass3UL.A03(this.A05, this.A0E, r52), (List) null, 24, true);
                            return true;
                        }
                        break;
                    case 25:
                        C64263Nh.A00(this.A0f, 6);
                        A04(menuItem, false);
                        return true;
                    case 26:
                        C64263Nh.A00(this.A0f, 7);
                        A04(menuItem, true);
                        return true;
                    case 27:
                        C107265Nh r15 = this.A01;
                        if (r15 != null) {
                            this.A0B.BNq(r15, 9);
                            return true;
                        }
                        AnonymousClass3KV r16 = this.A00;
                        if (r16 != null) {
                            this.A0B.Buh(r16, 9);
                            return true;
                        }
                        break;
                    case 28:
                        C19460v5 r17 = this.A0Q;
                        if (r17.A05()) {
                            r17.A02();
                            throw AnonymousClass001.A0A("showChatAssignmentPicker");
                        }
                        break;
                    default:
                        switch (itemId) {
                            case 31:
                                this.A0B.BuQ(this.A00);
                                break;
                            case 32:
                                AnonymousClass1LV r32 = this.A08;
                                AnonymousClass147 r22 = this.A0L;
                                int A052 = this.A0E.A05(r22);
                                AnonymousClass00C.A0D(r22, 0);
                                if (r32.A0K(r22, A052)) {
                                    AnonymousClass147 A023 = r32.A02(r22);
                                    if (A023 != null) {
                                        C20230xE r53 = this.A0V;
                                        AnonymousClass01z supportFragmentManager = this.A05.getSupportFragmentManager();
                                        CommunityNewSubgroupSwitcherBottomSheet communityNewSubgroupSwitcherBottomSheet = new CommunityNewSubgroupSwitcherBottomSheet();
                                        Bundle A072 = AnonymousClass001.A07();
                                        A072.putString("community_jid", A023.getRawString());
                                        communityNewSubgroupSwitcherBottomSheet.A17(A072);
                                        r53.Bu8(supportFragmentManager, A023, new C81813xf(communityNewSubgroupSwitcherBottomSheet));
                                        return true;
                                    }
                                    Log.e("GroupConversationsMenu/subgroupBottomSheet/parentGroupJid is null");
                                    return true;
                                }
                                break;
                            case 33:
                                break;
                            case 34:
                                view = menuItem.getActionView();
                                if (view != null) {
                                    r0 = this.A0T;
                                    i = 3;
                                    break;
                                }
                                break;
                            case 35:
                                break;
                            default:
                                return super.Bbx(menuItem);
                        }
                }
                view = menuItem.getActionView();
                if (view != null) {
                    r0 = this.A0T;
                    r0.A04(view, i);
                    return true;
                }
            }
            return true;
        }
        C80223v3.A02(this.A0J, this, 34);
        AnonymousClass01L r33 = this.A05;
        AnonymousClass147 r23 = this.A0L;
        r33.startActivity(AnonymousClass190.A0Y(r33, r23, this.A0A.A0D(r23).A02, 3));
        return true;
    }

    public boolean BdM(Menu menu) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("groupconversationmenu/onprepareoptionsmenu ");
        C36321k7.A1Y(A0u, menu.size());
        if (menu.size() == 0) {
            return false;
        }
        A0H(menu.findItem(4));
        return super.BdM(menu);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        this.A0j.registerObserver(this.A0i);
        this.A0e.registerObserver(this.A0d);
    }

    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        this.A0j.unregisterObserver(this.A0i);
        this.A0e.unregisterObserver(this.A0d);
        C49212ik r0 = this.A04;
        if (r0 != null) {
            r0.A0D(true);
            this.A04 = null;
        }
        C49202ij r02 = this.A03;
        if (r02 != null) {
            r02.A0D(true);
            this.A03 = null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2H1(X.AnonymousClass01L r45, X.C19460v5 r46, X.C19460v5 r47, X.C19460v5 r48, X.C19460v5 r49, X.AnonymousClass3C4 r50, X.AnonymousClass3C5 r51, X.C58012zB r52, X.C225014r r53, X.AnonymousClass17Y r54, X.C19730wQ r55, X.C21100yf r56, X.AnonymousClass1X4 r57, X.AnonymousClass3CG r58, X.AnonymousClass4PT r59, X.AnonymousClass67L r60, X.C27701Pj r61, X.AnonymousClass1MK r62, X.C24361Cd r63, X.AnonymousClass1AO r64, X.AnonymousClass1T4 r65, X.AnonymousClass1LV r66, X.C28431Sq r67, X.AnonymousClass1Pp r68, X.AnonymousClass16D r69, X.AnonymousClass16I r70, X.AnonymousClass171 r71, X.C27761Ps r72, X.AnonymousClass4V7 r73, X.AnonymousClass1NM r74, X.C19970wo r75, X.C19420v0 r76, X.C18820ts r77, X.AnonymousClass1HJ r78, X.C220412q r79, X.AnonymousClass1A5 r80, X.AnonymousClass17X r81, X.AnonymousClass1HO r82, X.C232317r r83, X.AnonymousClass1YR r84, X.AnonymousClass141 r85, X.C236419g r86, X.AnonymousClass1LU r87, X.C27751Pr r88, X.C20810yC r89, X.C20500xf r90, X.AnonymousClass1NN r91, X.C233117z r92, X.AnonymousClass1EL r93, X.AnonymousClass147 r94, X.C32641dx r95, X.C55022tw r96, X.C27361Nx r97, X.C31021b9 r98, X.C31031bA r99, X.AnonymousClass1CR r100, X.C64263Nh r101, X.C26371Jx r102, X.AnonymousClass1EM r103, X.AnonymousClass13J r104, X.C19770wU r105, X.AnonymousClass1HP r106) {
        /*
            r44 = this;
            r10 = r44
            r6 = r102
            r19 = r54
            r18 = r53
            r17 = r52
            r16 = r51
            r15 = r50
            r14 = r49
            r11 = r45
            r23 = r58
            r24 = r62
            r25 = r63
            r13 = r47
            r43 = r105
            r12 = r46
            r3 = r73
            r27 = r70
            r26 = r64
            r4 = r55
            r21 = r56
            r22 = r57
            r7 = r74
            r30 = r76
            r31 = r77
            r32 = r79
            r33 = r80
            r34 = r85
            r35 = r86
            r1 = r89
            r37 = r90
            r38 = r92
            r5 = r94
            r40 = r95
            r41 = r100
            r28 = r3
            r29 = r7
            r36 = r1
            r39 = r5
            r42 = r6
            r20 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r2 = 0
            X.4YS r0 = new X.4YS
            r0.<init>(r10, r2)
            r10.A0R = r0
            X.4YT r0 = new X.4YT
            r0.<init>(r10, r2)
            r10.A0S = r0
            X.4Zo r0 = new X.4Zo
            r0.<init>(r10, r2)
            r10.A0i = r0
            X.4YG r0 = new X.4YG
            r0.<init>(r10, r2)
            r10.A0d = r0
            r0 = r75
            r10.A0W = r0
            r10.A0I = r1
            r10.A05 = r4
            r0 = r68
            r10.A09 = r0
            r8 = r69
            r10.A0A = r8
            r0 = r104
            r10.A0h = r0
            r0 = r71
            r10.A0B = r0
            r0 = r103
            r10.A0g = r0
            r0 = r91
            r10.A0J = r0
            r0 = r97
            r10.A0c = r0
            r0 = r106
            r10.A0j = r0
            r0 = r78
            r10.A0X = r0
            r0 = r60
            r10.A06 = r0
            r0 = r67
            r10.A0V = r0
            r0 = r88
            r10.A0H = r0
            r0 = r84
            r10.A0Z = r0
            r0 = r98
            r10.A0M = r0
            r0 = r87
            r10.A0a = r0
            r0 = r66
            r10.A08 = r0
            r0 = r82
            r10.A0Y = r0
            r0 = r83
            r10.A0F = r0
            r0 = r99
            r10.A0e = r0
            r0 = r65
            r10.A0U = r0
            r9 = r81
            r10.A0E = r9
            r0 = r101
            r10.A0f = r0
            r0 = r72
            r10.A0C = r0
            r10.A0N = r6
            r0 = r48
            r10.A0Q = r0
            r10.A0L = r5
            r10.A0D = r7
            X.141 r0 = r8.A0D(r5)
            r10.A0G = r0
            r0 = r93
            r10.A0K = r0
            r0 = r96
            r10.A0b = r0
            r0 = r61
            r10.A07 = r0
            X.17r r0 = r9.A07
            int r0 = r0.A0B(r5)
            boolean r0 = X.C34681hT.A0D(r4, r1, r0)
            r10.A0P = r0
            boolean r0 = X.C34681hT.A0L(r1)
            r10.A0O = r0
            X.11F r1 = r10.A0G
            X.3e6 r0 = new X.3e6
            r0.<init>(r3, r10)
            r3 = r59
            X.3TV r0 = r3.B47(r11, r0, r1, r2)
            r10.A0T = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2H1.<init>(X.01L, X.0v5, X.0v5, X.0v5, X.0v5, X.3C4, X.3C5, X.2zB, X.14r, X.17Y, X.0wQ, X.0yf, X.1X4, X.3CG, X.4PT, X.67L, X.1Pj, X.1MK, X.1Cd, X.1AO, X.1T4, X.1LV, X.1Sq, X.1Pp, X.16D, X.16I, X.171, X.1Ps, X.4V7, X.1NM, X.0wo, X.0v0, X.0ts, X.1HJ, X.12q, X.1A5, X.17X, X.1HO, X.17r, X.1YR, X.141, X.19g, X.1LU, X.1Pr, X.0yC, X.0xf, X.1NN, X.17z, X.1EL, X.147, X.1dx, X.2tw, X.1Nx, X.1b9, X.1bA, X.1CR, X.3Nh, X.1Jx, X.1EM, X.13J, X.0wU, X.1HP):void");
    }
}
