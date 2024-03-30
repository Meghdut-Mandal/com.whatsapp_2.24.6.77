package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.community.subgroup.views.CommunityViewGroupsView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1h1  reason: invalid class name and case insensitive filesystem */
public class C34421h1 extends AnonymousClass0CZ implements C34411h0 {
    public C02840Cc A00;
    public final AnonymousClass17Y A01;
    public final int A02;
    public final C34431h2 A03;
    public final C34441h3 A04;
    public final C33261ez A05;
    public final C28431Sq A06;
    public final C28421Sp A07;
    public final AnonymousClass1Sk A08;
    public final AnonymousClass1RY A09;
    public final C33751fs A0A;
    public final C33301f4 A0B;
    public final C28251Rx A0C;
    public final C21060yb A0D;
    public final C18820ts A0E;
    public final C27751Pr A0F;
    public final C20810yC A0G;
    public final AnonymousClass1LX A0H;
    public final C32681e1 A0I;
    public final AnonymousClass13J A0J;

    public boolean BtE() {
        return true;
    }

    public long A0E(int i) {
        Object[] objArr;
        Object obj;
        AnonymousClass3GG r6 = (AnonymousClass3GG) this.A00.A03.get(i);
        if (C20800yB.A01(C21000yV.A02, this.A0G, 7887)) {
            Object obj2 = r6.A02;
            if (obj2 instanceof C132056Ry) {
                objArr = new Object[2];
                objArr[0] = Integer.valueOf(r6.A00);
                C132056Ry r3 = (C132056Ry) obj2;
                obj = Integer.valueOf(Arrays.hashCode(new Object[]{r3.A01, Integer.valueOf(r3.A00)}));
                objArr[1] = obj;
                return (long) Arrays.hashCode(objArr);
            }
        }
        objArr = new Object[2];
        objArr[0] = Integer.valueOf(r6.A00);
        obj = r6.A02;
        objArr[1] = obj;
        return (long) Arrays.hashCode(objArr);
    }

    public int A0J() {
        return this.A00.A03.size();
    }

    public void A0L(AnonymousClass11F r5) {
        ArrayList arrayList = new ArrayList();
        List list = this.A00.A03;
        for (int i = 0; i < list.size(); i++) {
            if (r5.equals(((AnonymousClass3GG) list.get(i)).A01)) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.A01.Bp3(new C35651j2(this, arrayList, 27));
    }

    public void A0M(List list) {
        ArrayList arrayList = new ArrayList();
        List list2 = this.A00.A03;
        for (int i = 0; i < list2.size(); i++) {
            if (list.contains(((AnonymousClass3GG) list2.get(i)).A01)) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.A01.Bp3(new C35651j2(this, arrayList, 27));
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

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0100, code lost:
        if (r1 == false) goto L_0x0102;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSE(X.AnonymousClass0D3 r21, int r22) {
        /*
            r20 = this;
            r12 = r21
            boolean r0 = r12 instanceof X.C42381yj
            if (r0 == 0) goto L_0x0021
            r0 = r12
            X.1yj r0 = (X.C42381yj) r0
            android.view.View r3 = r0.A00
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131166432(0x7f0704e0, float:1.794711E38)
            int r2 = r1.getDimensionPixelSize(r0)
            int r1 = r3.getPaddingTop()
            int r0 = r3.getPaddingBottom()
            r3.setPadding(r2, r1, r2, r0)
        L_0x0021:
            r3 = r20
            X.0Cc r0 = r3.A00
            java.util.List r0 = r0.A03
            r2 = r22
            java.lang.Object r1 = r0.get(r2)
            X.3GG r1 = (X.AnonymousClass3GG) r1
            boolean r0 = r12 instanceof X.C41721xf
            if (r0 == 0) goto L_0x004b
            r4 = r12
            X.1xf r4 = (X.C41721xf) r4
            java.lang.Object r0 = r1.A02
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            r0 = 2
            com.whatsapp.WaTextView r4 = r4.A00
            if (r5 != r0) goto L_0x06b0
            if (r4 == 0) goto L_0x004b
            r0 = 2131894389(0x7f122075, float:1.9423581E38)
        L_0x0048:
            r4.setText(r0)
        L_0x004b:
            boolean r0 = r12 instanceof X.C41711xe
            if (r0 == 0) goto L_0x0066
            r0 = r12
            X.1xe r0 = (X.C41711xe) r0
            java.lang.Object r7 = r1.A02
            com.whatsapp.jid.GroupJid r7 = (com.whatsapp.jid.GroupJid) r7
            X.1oo r6 = r0.A00
            r6.A08 = r7
            X.0wU r5 = r6.A0B
            r4 = 25
            X.3v7 r0 = new X.3v7
            r0.<init>(r6, r7, r4)
            r5.Boy(r0)
        L_0x0066:
            boolean r0 = r12 instanceof X.C42681zD
            if (r0 == 0) goto L_0x0160
            X.1zD r12 = (X.C42681zD) r12
            java.lang.Object r15 = r1.A02
            X.3JY r15 = (X.AnonymousClass3JY) r15
            int r6 = r3.A02
            X.3QK r3 = r15.A00
            com.whatsapp.jid.GroupJid r5 = r3.A02
            android.view.View r4 = r12.A0H
            android.content.Context r14 = r4.getContext()
            X.3SF r1 = r12.A05
            java.lang.String r0 = r3.A04
            com.whatsapp.TextEmojiLabel r2 = r1.A01
            r2.setText(r0)
            r1 = 2130970020(0x7f0405a4, float:1.7548738E38)
            r0 = 2131101134(0x7f0605ce, float:1.781467E38)
            int r0 = X.C224514j.A00(r14, r1, r0)
            int r0 = X.AnonymousClass00F.A00(r14, r0)
            r2.setTextColor(r0)
            r2 = 6
            if (r6 != r2) goto L_0x009e
            com.whatsapp.TextEmojiLabel r0 = r12.A02
            X.C33511fU.A03(r0)
        L_0x009e:
            X.16D r0 = r12.A08
            X.141 r8 = r0.A0D(r5)
            int r1 = r3.A00
            r0 = 3
            r7 = 0
            r3 = 8
            if (r1 != r0) goto L_0x0117
            boolean r0 = X.C222013h.A05
            r10 = 2131231030(0x7f080136, float:1.807813E38)
            if (r0 == 0) goto L_0x00b6
            r10 = 2131231031(0x7f080137, float:1.8078132E38)
        L_0x00b6:
            android.widget.ImageView r9 = r12.A00
            X.1Pr r8 = r12.A0C
            android.content.res.Resources r3 = r9.getResources()
            android.content.Context r0 = r9.getContext()
            android.content.res.Resources$Theme r2 = r0.getTheme()
            X.3bw r1 = X.C68463bw.A00
            X.0yC r0 = r8.A00
            android.graphics.drawable.Drawable r0 = X.C27751Pr.A00(r2, r3, r1, r0, r10)
            r9.setImageDrawable(r0)
            com.whatsapp.TextEmojiLabel r1 = r12.A04
            r1.setVisibility(r7)
            android.widget.ImageView r0 = r12.A01
            r0.setVisibility(r7)
            r0 = 2131888065(0x7f1207c1, float:1.9410755E38)
            r1.setText(r0)
        L_0x00e1:
            com.whatsapp.TextEmojiLabel r1 = r12.A03
            boolean r0 = r15.A03
            if (r0 != 0) goto L_0x00e9
            r7 = 8
        L_0x00e9:
            r1.setVisibility(r7)
            X.C33521fV.A02(r4)
            X.12q r0 = r12.A0A
            boolean r0 = r0.A0M(r5)
            if (r0 == 0) goto L_0x0102
            X.17X r0 = r12.A0B
            boolean r1 = r0.A0C(r5)
            r0 = 2131888369(0x7f1208f1, float:1.9411371E38)
            if (r1 != 0) goto L_0x0105
        L_0x0102:
            r0 = 2131886237(0x7f12009d, float:1.9407047E38)
        L_0x0105:
            X.C33521fV.A03(r4, r0)
            X.2i9 r13 = new X.2i9
            r16 = r12
            r17 = r5
            r18 = r6
            r13.<init>(r14, r15, r16, r17, r18)
            r4.setOnClickListener(r13)
        L_0x0116:
            return
        L_0x0117:
            if (r1 != r2) goto L_0x0150
            boolean r0 = r8.A0f
            if (r0 != 0) goto L_0x0150
            X.0yC r2 = r12.A0D
            r1 = 5021(0x139d, float:7.036E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0150
            android.widget.ImageView r10 = r12.A00
            X.1Pr r11 = r12.A0C
            android.content.res.Resources r9 = r10.getResources()
            android.content.Context r0 = r10.getContext()
            android.content.res.Resources$Theme r8 = r0.getTheme()
            X.3bw r2 = X.C68463bw.A00
            r1 = 2131231044(0x7f080144, float:1.8078158E38)
            X.0yC r0 = r11.A00
            android.graphics.drawable.Drawable r0 = X.C27751Pr.A00(r8, r9, r2, r0, r1)
            r10.setImageDrawable(r0)
            X.C42681zD.A00(r15, r12, r12)
            android.widget.ImageView r0 = r12.A01
            r0.setVisibility(r3)
            goto L_0x00e1
        L_0x0150:
            X.1RY r1 = r12.A09
            android.widget.ImageView r0 = r12.A00
            r1.A08(r0, r8)
            android.widget.ImageView r0 = r12.A01
            r0.setVisibility(r3)
            X.C42681zD.A00(r15, r12, r12)
            goto L_0x00e1
        L_0x0160:
            boolean r0 = r12 instanceof X.C41931y0
            if (r0 == 0) goto L_0x01b1
            X.1y0 r12 = (X.C41931y0) r12
            java.lang.Object r5 = r1.A02
            X.3I1 r5 = (X.AnonymousClass3I1) r5
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            android.widget.ImageView r4 = r12.A00
            android.content.Context r3 = r4.getContext()
            boolean r2 = r5.A01
            r1 = 2131232170(0x7f0805aa, float:1.8080442E38)
            if (r2 == 0) goto L_0x0182
            r1 = 2131232172(0x7f0805ac, float:1.8080446E38)
        L_0x0182:
            r0 = 2131101065(0x7f060589, float:1.781453E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A02(r3, r1, r0)
            r4.setImageDrawable(r0)
            com.whatsapp.TextEmojiLabel r1 = r12.A01
            r0 = 2131894721(0x7f1221c1, float:1.9424255E38)
            if (r2 == 0) goto L_0x0196
            r0 = 2131894699(0x7f1221ab, float:1.942421E38)
        L_0x0196:
            r1.setText(r0)
            X.C33511fU.A03(r1)
            android.view.View r2 = r12.A0H
            r1 = 3
            X.3Xx r0 = new X.3Xx
            r0.<init>(r5, r1)
            r2.setOnClickListener(r0)
            X.C33521fV.A02(r2)
            r0 = 2131886236(0x7f12009c, float:1.9407045E38)
            X.C33521fV.A03(r2, r0)
            return
        L_0x01b1:
            boolean r0 = r12 instanceof X.C41741xh
            if (r0 == 0) goto L_0x01e3
            X.1xh r12 = (X.C41741xh) r12
            java.lang.Object r7 = r1.A02
            X.3I0 r7 = (X.AnonymousClass3I0) r7
            android.widget.TextView r6 = r12.A00
            android.content.res.Resources r5 = r6.getResources()
            r4 = 2131755353(0x7f100159, float:1.9141583E38)
            int r3 = r7.A00
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0 = 0
            r2[r0] = r1
            java.lang.String r0 = r5.getQuantityString(r4, r3, r2)
            r6.setText(r0)
            android.view.View r3 = r12.A0H
            r0 = 6
            X.3Xx r2 = new X.3Xx
            r2.<init>(r7, r0)
        L_0x01df:
            r3.setOnClickListener(r2)
            return
        L_0x01e3:
            boolean r0 = r12 instanceof X.C42651zA
            if (r0 == 0) goto L_0x0201
            X.1zA r12 = (X.C42651zA) r12
            java.lang.Object r0 = r1.A02
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.1nl r2 = r12.A00
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = r0.getString(r1)
            com.whatsapp.WaTextView r0 = r2.A01
            r0.setText(r1)
            return
        L_0x0201:
            boolean r0 = r12 instanceof X.C41641xX
            if (r0 == 0) goto L_0x0211
            java.lang.Object r1 = r1.A02
            android.view.View r3 = r12.A0H
            r0 = 31
            X.2i6 r2 = new X.2i6
            r2.<init>(r1, r12, r0)
            goto L_0x01df
        L_0x0211:
            boolean r0 = r12 instanceof X.C41401x9
            if (r0 != 0) goto L_0x0116
            boolean r0 = r12 instanceof X.C42441yp
            if (r0 == 0) goto L_0x031f
            X.1yp r12 = (X.C42441yp) r12
            java.lang.Object r2 = r1.A02
            X.3K3 r2 = (X.AnonymousClass3K3) r2
            X.0v0 r0 = r12.A09
            X.005 r5 = r0.A00
            java.lang.Object r1 = r5.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "previous_last_seen_community_activity"
            r3 = 0
            long r9 = r1.getLong(r0, r3)
            java.lang.Object r1 = r5.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "last_seen_community_activity"
            long r7 = r1.getLong(r0, r3)
            X.3Qp r4 = r2.A00
            java.lang.String r6 = r4.A08()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0270
            X.0wN r5 = r12.A02
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Missing group subject for jid:"
            r1.append(r0)
            X.11F r0 = r4.A06()
            r1.append(r0)
            java.lang.String r0 = ". type:"
            r1.append(r0)
            int r0 = r4.A02
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            r1 = 1
            java.lang.String r0 = "ParentViewHolder/bind"
            r5.A0E(r0, r3, r1)
        L_0x0270:
            com.whatsapp.TextEmojiLabel r0 = r12.A03
            r0.A0I(r6)
            X.16D r1 = r12.A07
            X.11F r0 = r4.A06()
            X.141 r3 = r1.A08(r0)
            if (r3 == 0) goto L_0x02a4
            boolean r0 = r3.A0G()
            if (r0 == 0) goto L_0x029d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ParentViewHolder/displayContact"
            r1.append(r0)
            X.11F r0 = r3.A0H
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x029d:
            X.1RY r1 = r12.A08
            android.widget.ImageView r0 = r12.A01
            r1.A08(r0, r3)
        L_0x02a4:
            boolean r6 = r2.A05
            android.widget.ImageView r1 = r12.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x02ae
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x02ae:
            r1.setAlpha(r0)
            long r3 = r4.A0I
            r5 = 0
            r1 = 8
            if (r6 == 0) goto L_0x0306
            com.whatsapp.WaTextView r0 = r12.A04
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r0 = r12.A05
            r0.setVisibility(r5)
        L_0x02c2:
            android.view.View r6 = r12.A0H
            r1 = 5
            X.3Xx r0 = new X.3Xx
            r0.<init>(r2, r1)
            r6.setOnClickListener(r0)
            r1 = 2
            X.4XZ r0 = new X.4XZ
            r0.<init>(r2, r1)
            r6.setOnLongClickListener(r0)
            boolean r4 = r2.A04
            boolean r0 = r12.A00
            if (r4 == r0) goto L_0x0116
            r3 = 1
            r12.A00 = r4
            if (r4 == 0) goto L_0x02fb
            android.content.Context r2 = r6.getContext()
            r1 = 2130969781(0x7f0404b5, float:1.7548254E38)
            r0 = 2131101050(0x7f06057a, float:1.7814499E38)
            int r0 = X.C224514j.A00(r2, r1, r0)
            r6.setBackgroundResource(r0)
            com.whatsapp.components.SelectionCheckView r1 = r12.A06
            r1.setVisibility(r5)
        L_0x02f7:
            r1.A04(r4, r3)
            return
        L_0x02fb:
            r6.setBackgroundResource(r5)
            com.whatsapp.components.SelectionCheckView r1 = r12.A06
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x02f7
        L_0x0306:
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0319
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0319
            com.whatsapp.WaTextView r0 = r12.A04
            r0.setVisibility(r5)
        L_0x0313:
            com.whatsapp.WaTextView r0 = r12.A05
            r0.setVisibility(r1)
            goto L_0x02c2
        L_0x0319:
            com.whatsapp.WaTextView r0 = r12.A04
            r0.setVisibility(r1)
            goto L_0x0313
        L_0x031f:
            boolean r0 = r12 instanceof X.C42131yK
            if (r0 == 0) goto L_0x0342
            java.lang.Object r1 = r1.A02
            X.3Qp r1 = (X.C65073Qp) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR
            X.11F r0 = r1.A06()
            X.147 r1 = X.C65533Sl.A03(r0)
            if (r1 == 0) goto L_0x0116
            android.view.View r3 = r12.A0H
            r0 = 22
            X.3YE r2 = new X.3YE
            r2.<init>(r12, r1, r0)
            goto L_0x01df
        L_0x0342:
            boolean r0 = r12 instanceof com.whatsapp.conversationslist.ViewHolder
            if (r0 == 0) goto L_0x035c
            com.whatsapp.conversationslist.ViewHolder r12 = (com.whatsapp.conversationslist.ViewHolder) r12
            java.lang.Object r13 = r1.A02
            X.5Jv r13 = (X.C106475Jv) r13
            int r0 = r3.A02
            r14 = 0
            r18 = 0
            r19 = 0
            r15 = r14
            r17 = r2
            r16 = r0
            r12.A0G(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x035c:
            boolean r0 = r12 instanceof X.C41651xY
            if (r0 == 0) goto L_0x03c4
            X.1xY r12 = (X.C41651xY) r12
            java.lang.Object r6 = r1.A02
            X.147 r6 = (X.AnonymousClass147) r6
            X.1q4 r5 = r12.A00
            r5.A0A = r6
            X.16D r0 = r5.A05
            X.141 r4 = r0.A0D(r6)
            X.1EL r3 = r5.A09
            boolean r7 = r3.A00(r4)
            r2 = 0
            r1 = 8
            android.view.View r0 = r5.A0F
            if (r7 == 0) goto L_0x03b6
            r0.setVisibility(r2)
            android.view.View r0 = r5.A0I
            r0.setVisibility(r1)
            android.view.View r0 = r5.A0G
            r0.setVisibility(r2)
        L_0x038a:
            X.147 r0 = r5.A0A
            if (r0 == 0) goto L_0x039c
            boolean r2 = r3.A00(r4)
            android.view.View r1 = r5.A0H
            r0 = 0
            if (r2 == 0) goto L_0x0399
            r0 = 8
        L_0x0399:
            r1.setVisibility(r0)
        L_0x039c:
            X.17X r0 = r5.A07
            boolean r0 = r0.A0I(r6)
            if (r0 == 0) goto L_0x03b1
            boolean r0 = r3.A00(r4)
            if (r0 != 0) goto L_0x03b1
            android.view.View r1 = r5.A0E
            r0 = 0
        L_0x03ad:
            r1.setVisibility(r0)
            return
        L_0x03b1:
            android.view.View r1 = r5.A0E
            r0 = 8
            goto L_0x03ad
        L_0x03b6:
            r0.setVisibility(r1)
            android.view.View r0 = r5.A0I
            r0.setVisibility(r2)
            android.view.View r0 = r5.A0G
            r0.setVisibility(r1)
            goto L_0x038a
        L_0x03c4:
            boolean r0 = r12 instanceof X.C41661xZ
            if (r0 == 0) goto L_0x04ff
            X.1xZ r12 = (X.C41661xZ) r12
            java.lang.Object r6 = r1.A02
            X.3Hz r6 = (X.C62903Hz) r6
            X.1pU r7 = r12.A00
            X.3T1 r1 = r6.A00
            com.whatsapp.TextEmojiLabel r5 = r7.A04
            X.0wQ r0 = r7.A00
            boolean r0 = X.C66013Ui.A0U(r0, r1)
            if (r0 == 0) goto L_0x04f6
            X.1T1 r2 = r7.A01
            boolean r0 = r1 instanceof X.AnonymousClass2cS
            if (r0 == 0) goto L_0x04af
            X.2cS r1 = (X.AnonymousClass2cS) r1
            int r11 = r1.A00
            java.util.Set r0 = r1.A03
        L_0x03e8:
            r1 = 3
            java.util.ArrayList r9 = X.AnonymousClass1T1.A0F(r0, r1)
            android.util.Pair r3 = X.AnonymousClass1T1.A00(r9, r11)
            java.lang.Object r0 = r3.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r13 = r0.intValue()
            r8 = 0
            r4 = 1
            if (r13 == r4) goto L_0x0495
            r10 = 2
            if (r13 == r10) goto L_0x0476
            if (r13 == r1) goto L_0x0451
            r12 = 4
            X.0wG r0 = r2.A05
            android.content.Context r0 = r0.A00
            if (r13 == r12) goto L_0x042b
            android.content.res.Resources r3 = r0.getResources()
            int[] r0 = X.AnonymousClass1T1.A0T
            r2 = r0[r8]
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1[r8] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r11, r1)
        L_0x041d:
            r5.A0I(r0)
            r1 = 32
            X.2i6 r0 = new X.2i6
            r0.<init>(r6, r7, r1)
            r7.setOnClickListener(r0)
            return
        L_0x042b:
            android.content.res.Resources r12 = r0.getResources()
            int[] r0 = X.AnonymousClass1T1.A0T
            r11 = r0[r1]
            java.lang.Object r3 = r3.second
            r0 = r3
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r9.get(r8)
            r1[r8] = r0
            java.lang.Object r0 = r9.get(r4)
            r1[r4] = r0
            r1[r10] = r3
            java.lang.String r0 = r12.getQuantityString(r11, r2, r1)
            goto L_0x041d
        L_0x0451:
            X.0wG r0 = r2.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r3 = r0.getResources()
            int[] r0 = X.AnonymousClass1T1.A0T
            r2 = r0[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r9.get(r8)
            r1[r8] = r0
            java.lang.Object r0 = r9.get(r4)
            r1[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1[r10] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r4, r1)
            goto L_0x041d
        L_0x0476:
            X.0wG r0 = r2.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r3 = r0.getResources()
            int[] r0 = X.AnonymousClass1T1.A0T
            r2 = r0[r10]
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.Object r0 = r9.get(r8)
            r1[r8] = r0
            java.lang.Object r0 = r9.get(r4)
            r1[r4] = r0
            java.lang.String r0 = r3.getString(r2, r1)
            goto L_0x041d
        L_0x0495:
            X.0wG r0 = r2.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r3 = r0.getResources()
            int[] r0 = X.AnonymousClass1T1.A0T
            r2 = r0[r4]
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Object r0 = r9.get(r8)
            r1[r8] = r0
            java.lang.String r0 = r3.getString(r2, r1)
            goto L_0x041d
        L_0x04af:
            boolean r0 = r1 instanceof X.C181708nu
            if (r0 == 0) goto L_0x04c3
            X.8nu r1 = (X.C181708nu) r1
            java.util.HashSet r0 = r1.A1g()
            int r11 = r0.size()
            java.util.HashSet r0 = r1.A1g()
            goto L_0x03e8
        L_0x04c3:
            boolean r0 = X.C66013Ui.A0o(r1)
            if (r0 == 0) goto L_0x04f3
            java.lang.String r4 = r1.A0b()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x04ea
            X.0wG r0 = r2.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131894719(0x7f1221bf, float:1.942425E38)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r4
            java.lang.String r0 = r3.getString(r2, r1)
            goto L_0x041d
        L_0x04ea:
            X.2bI r1 = (X.AnonymousClass2bI) r1
            r0 = 0
            java.lang.String r0 = r2.A0O(r1, r0)
            goto L_0x041d
        L_0x04f3:
            r0 = 0
            goto L_0x041d
        L_0x04f6:
            java.lang.String r1 = "CommunityActivityView/unexpected community activity"
            r0 = 0
            X.C18740tg.A0D(r0, r1)
            r0 = 0
            goto L_0x041d
        L_0x04ff:
            boolean r0 = r12 instanceof X.C41671xa
            if (r0 == 0) goto L_0x052f
            X.1xa r12 = (X.C41671xa) r12
            java.lang.Object r0 = r1.A02
            X.147 r0 = (X.AnonymousClass147) r0
            r4 = 0
            X.AnonymousClass00C.A0D(r0, r4)
            X.1pi r3 = r12.A00
            r3.A02 = r0
            X.0yC r2 = r3.getAbProps$app_product_community_community_non_modified()
            r1 = 3829(0xef5, float:5.366E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            X.1RJ r2 = r3.A05
            if (r0 == 0) goto L_0x06b7
            r2.A03(r4)
            r1 = 8
            X.3Xx r0 = new X.3Xx
            r0.<init>(r3, r1)
            r2.A05(r0)
            return
        L_0x052f:
            boolean r0 = r12 instanceof X.C41701xd
            if (r0 == 0) goto L_0x0542
            X.1xd r12 = (X.C41701xd) r12
            java.lang.Object r1 = r1.A02
            X.147 r1 = (X.AnonymousClass147) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.community.subgroup.views.CommunityViewGroupsView r0 = r12.A00
            r0.A02 = r1
            return
        L_0x0542:
            boolean r0 = r12 instanceof X.C41681xb
            if (r0 == 0) goto L_0x0556
            X.1xb r12 = (X.C41681xb) r12
            java.lang.Object r1 = r1.A02
            X.147 r1 = (X.AnonymousClass147) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.1q9 r0 = r12.A00
            r0.A00(r1)
            return
        L_0x0556:
            boolean r0 = r12 instanceof X.C41731xg
            if (r0 == 0) goto L_0x05a6
            X.1xg r12 = (X.C41731xg) r12
            java.lang.Object r8 = r1.A02
            X.3JZ r8 = (X.AnonymousClass3JZ) r8
            r7 = 0
            X.AnonymousClass00C.A0D(r8, r7)
            X.1pJ r2 = r12.A00
            r1 = 9
            X.3Xx r0 = new X.3Xx
            r0.<init>(r8, r1)
            r2.setOnClickListener(r0)
            X.2nP r0 = r8.A01
            int r0 = r0.ordinal()
            r6 = 1
            r1 = 2131890957(0x7f12130d, float:1.941662E38)
            r5 = 2131755191(0x7f1000b7, float:1.9141254E38)
            if (r0 == r7) goto L_0x0585
            r1 = 2131890964(0x7f121314, float:1.9416635E38)
            r5 = 2131755193(0x7f1000b9, float:1.9141258E38)
        L_0x0585:
            com.whatsapp.WaTextView r0 = r2.A01
            if (r0 == 0) goto L_0x058c
            r0.setText(r1)
        L_0x058c:
            com.whatsapp.TextEmojiLabel r4 = r2.A00
            if (r4 == 0) goto L_0x0116
            android.content.res.Resources r3 = r2.getResources()
            int r2 = r8.A00
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1[r7] = r0
            java.lang.String r0 = r3.getQuantityString(r5, r2, r1)
            r4.setText(r0)
            return
        L_0x05a6:
            boolean r0 = r12 instanceof X.C41691xc
            if (r0 == 0) goto L_0x0116
            X.1xc r12 = (X.C41691xc) r12
            java.lang.Object r10 = r1.A02
            X.3Ja r10 = (X.C63173Ja) r10
            r3 = 0
            X.AnonymousClass00C.A0D(r10, r3)
            X.1pS r6 = r12.A00
            java.lang.Integer r8 = r10.A02
            if (r8 == 0) goto L_0x063a
            int r5 = r8.intValue()
            if (r5 <= 0) goto L_0x063a
            X.1RJ r2 = r6.A04
            r2.A03(r3)
            android.view.View r1 = r2.A01()
            r0 = 2131231522(0x7f080322, float:1.8079127E38)
            r1.setBackgroundResource(r0)
            android.view.View r1 = r2.A01()
            r0 = 2131428963(0x7f0b0663, float:1.8479585E38)
            android.view.View r9 = X.C012005e.A02(r1, r0)
            X.AnonymousClass00C.A08(r9)
            android.view.View r1 = r2.A01()
            r0 = 2131428961(0x7f0b0661, float:1.8479581E38)
            android.view.View r4 = X.C012005e.A02(r1, r0)
            X.AnonymousClass00C.A08(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.view.View r1 = r2.A01()
            r0 = 2131428964(0x7f0b0664, float:1.8479587E38)
            android.view.View r7 = X.C012005e.A02(r1, r0)
            X.AnonymousClass00C.A08(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            android.view.View r1 = r2.A01()
            r0 = 2131428962(0x7f0b0662, float:1.8479583E38)
            android.view.View r2 = X.C012005e.A02(r1, r0)
            X.AnonymousClass00C.A08(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1 = 35
            X.2i6 r0 = new X.2i6
            r0.<init>(r6, r10, r1)
            r9.setOnClickListener(r0)
            r0 = 2131234025(0x7f080ce9, float:1.8084204E38)
            r2.setImageResource(r0)
            r0 = 2131888127(0x7f1207ff, float:1.941088E38)
            r7.setText(r0)
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131755051(0x7f10002b, float:1.914097E38)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r8
            java.lang.String r0 = r2.getQuantityString(r1, r5, r0)
            r4.setText(r0)
        L_0x063a:
            java.lang.Integer r9 = r10.A01
            if (r9 == 0) goto L_0x0116
            int r7 = r9.intValue()
            if (r7 <= 0) goto L_0x0116
            X.1RJ r5 = r6.A03
            r5.A03(r3)
            android.view.View r1 = r5.A01()
            r0 = 2131231522(0x7f080322, float:1.8079127E38)
            r1.setBackgroundResource(r0)
            android.view.View r1 = r5.A01()
            r0 = 2131428963(0x7f0b0663, float:1.8479585E38)
            android.view.View r2 = X.C012005e.A02(r1, r0)
            X.AnonymousClass00C.A08(r2)
            android.view.View r1 = r5.A01()
            r0 = 2131428961(0x7f0b0661, float:1.8479581E38)
            android.view.View r4 = X.C012005e.A02(r1, r0)
            X.AnonymousClass00C.A08(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1 = 11
            X.2iG r0 = new X.2iG
            r0.<init>(r10, r1)
            r2.setOnClickListener(r0)
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131755191(0x7f1000b7, float:1.9141254E38)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r9
            java.lang.String r0 = r2.getQuantityString(r1, r7, r0)
            r4.setText(r0)
            if (r8 == 0) goto L_0x06bd
            int r0 = r8.intValue()
            if (r0 <= 0) goto L_0x06bd
            r6.getWhatsAppLocale()
            android.view.View r2 = r5.A01()
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131168374(0x7f070c76, float:1.7951048E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.AnonymousClass1JZ.A03(r2, r3, r0)
            return
        L_0x06b0:
            if (r4 == 0) goto L_0x004b
            r0 = 2131889102(0x7f120bce, float:1.9412858E38)
            goto L_0x0048
        L_0x06b7:
            r0 = 8
            r2.A03(r0)
            return
        L_0x06bd:
            r6.getWhatsAppLocale()
            android.view.View r0 = r5.A01()
            X.AnonymousClass1JZ.A03(r0, r3, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34421h1.BSE(X.0D3, int):void");
    }

    public int getItemViewType(int i) {
        List list = this.A00.A03;
        if (i < 0 || i >= list.size()) {
            return -1;
        }
        return ((AnonymousClass3GG) list.get(i)).A00;
    }

    public C34421h1(C34431h2 r5, C34441h3 r6, C33261ez r7, AnonymousClass17Y r8, C28431Sq r9, C28421Sp r10, AnonymousClass1Sk r11, AnonymousClass1RY r12, C33751fs r13, C28251Rx r14, C21060yb r15, C18820ts r16, C27751Pr r17, C20810yC r18, AnonymousClass1LX r19, C32681e1 r20, AnonymousClass13J r21, C19770wU r22, int i) {
        C02830Cb r1;
        this.A06 = r9;
        this.A05 = r7;
        C20810yC r3 = r18;
        this.A0G = r3;
        this.A01 = r8;
        this.A0I = r20;
        this.A0J = r21;
        this.A0D = r15;
        this.A0E = r16;
        this.A0H = r19;
        this.A09 = r12;
        this.A0F = r17;
        this.A08 = r11;
        this.A07 = r10;
        this.A0A = r13;
        this.A03 = r5;
        this.A0C = r14;
        this.A04 = r6;
        this.A0B = new C33301f4(new C19930wk(r22, true));
        this.A02 = i;
        A0B(true);
        if (C20800yB.A01(C21000yV.A02, r3, 7887)) {
            r1 = new C40301vH();
        } else {
            r1 = new C34451h4();
        }
        this.A00 = new C02840Cc(r1, (AnonymousClass0CZ) this);
    }

    public boolean BLw(int i) {
        if (getItemViewType(i) == 2 || getItemViewType(i) == 13) {
            return true;
        }
        return false;
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        switch (i) {
            case 1:
                List list = AnonymousClass0D3.A0I;
                return new C41711xe(new C38421oo(viewGroup.getContext()));
            case 2:
                List list2 = AnonymousClass0D3.A0I;
                return new C42651zA(new C38131nl(viewGroup.getContext()));
            case 3:
                C65783Tl r9 = C65783Tl.A00;
                C33261ez r3 = this.A05;
                Context context = viewGroup.getContext();
                List list3 = AnonymousClass0D3.A0I;
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f9nameremoved, viewGroup, false);
                C28251Rx r8 = this.A0C;
                return r3.A00(context, inflate, this.A09, this.A0B, r8, r9);
            case 4:
                C34441h3 r2 = this.A04;
                View inflate2 = from.inflate(R.layout.f9nameremoved, viewGroup, false);
                AnonymousClass1RY r82 = this.A09;
                List list4 = AnonymousClass0D3.A0I;
                C18800tq r1 = r2.A00.A01;
                C220412q r92 = (C220412q) r1.A1l.get();
                AnonymousClass16D r7 = (AnonymousClass16D) r1.A2A.get();
                C28431Sq r6 = (C28431Sq) r1.A1r.get();
                C27751Pr r11 = (C27751Pr) r1.A64.get();
                AnonymousClass1LV r5 = (AnonymousClass1LV) r1.A1q.get();
                AnonymousClass17X r10 = (AnonymousClass17X) r1.A3v.get();
                return new C42681zD(inflate2, (AnonymousClass1LI) r1.A3Q.get(), r5, r6, r7, r82, r92, r10, r11, (C20810yC) r1.A02.get(), (C19770wU) r1.A9Y.get());
            case 5:
                List list5 = AnonymousClass0D3.A0I;
                return new C41741xh(from.inflate(R.layout.f9nameremoved, viewGroup, false));
            case 6:
                List list6 = AnonymousClass0D3.A0I;
                return new C41401x9(from.inflate(R.layout.f9nameremoved, viewGroup, false), this.A06, this.A0F);
            case 7:
                C34431h2 r22 = this.A03;
                View inflate3 = from.inflate(R.layout.f9nameremoved, viewGroup, false);
                AnonymousClass1RY r62 = this.A09;
                List list7 = AnonymousClass0D3.A0I;
                C18800tq r12 = r22.A00.A01;
                return new C42441yp(inflate3, (C19700wN) r12.A2U.get(), (AnonymousClass16D) r12.A2A.get(), r62, (C19420v0) r12.A9G.get());
            case 8:
                List list8 = AnonymousClass0D3.A0I;
                return new C42131yK(from.inflate(R.layout.f9nameremoved, viewGroup, false), this.A06, this.A0E);
            case 9:
                C32681e1 r93 = this.A0I;
                C21060yb r63 = this.A0D;
                C28431Sq r4 = this.A06;
                C33751fs r52 = this.A0A;
                C18820ts r72 = this.A0E;
                C20810yC r83 = this.A0G;
                List list9 = AnonymousClass0D3.A0I;
                return new C42381yj(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f9nameremoved, viewGroup, false), r4, r52, r63, r72, r83, r93);
            case 10:
                List list10 = AnonymousClass0D3.A0I;
                return new C41651xY(new C38781q4(viewGroup.getContext()));
            case 11:
                C28431Sq r32 = this.A06;
                List list11 = AnonymousClass0D3.A0I;
                return new C41641xX(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f9nameremoved, viewGroup, false), r32);
            case 12:
                List list12 = AnonymousClass0D3.A0I;
                return new C41661xZ(new C38671pU(viewGroup.getContext()));
            case 13:
                return C42651zA.A00(viewGroup);
            case 14:
                List list13 = AnonymousClass0D3.A0I;
                Context context2 = viewGroup.getContext();
                AnonymousClass00C.A08(context2);
                return new C41671xa(new C38751pi(context2));
            case 15:
                List list14 = AnonymousClass0D3.A0I;
                View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f9nameremoved, viewGroup, false);
                AnonymousClass00C.A0E(inflate4, "null cannot be cast to non-null type com.whatsapp.community.subgroup.views.CommunityViewGroupsView");
                return new C41701xd((CommunityViewGroupsView) inflate4);
            case 16:
                List list15 = AnonymousClass0D3.A0I;
                Context context3 = viewGroup.getContext();
                AnonymousClass00C.A08(context3);
                return new C41681xb(new C38821q9(context3));
            case 17:
                List list16 = AnonymousClass0D3.A0I;
                View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f9nameremoved, viewGroup, false);
                AnonymousClass00C.A0B(inflate5);
                return new C41721xf(inflate5);
            case 18:
                List list17 = AnonymousClass0D3.A0I;
                Context context4 = viewGroup.getContext();
                AnonymousClass00C.A08(context4);
                return new C41731xg(new C38561pJ(context4));
            case 19:
                List list18 = AnonymousClass0D3.A0I;
                return new C41931y0(from.inflate(R.layout.f9nameremoved, viewGroup, false));
            case 20:
                List list19 = AnonymousClass0D3.A0I;
                Context context5 = viewGroup.getContext();
                AnonymousClass00C.A08(context5);
                return new C41691xc(new C38651pS(context5));
            case 21:
                List list20 = AnonymousClass0D3.A0I;
                Context context6 = viewGroup.getContext();
                AnonymousClass00C.A08(context6);
                return new C41391x8(new C38321oI(context6));
            default:
                Context context7 = viewGroup.getContext();
                List list21 = AnonymousClass0D3.A0I;
                return new AnonymousClass2UP(new View(context7));
        }
    }
}
