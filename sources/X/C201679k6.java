package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.ConversationListRowHeaderView;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.List;

/* renamed from: X.9k6  reason: invalid class name and case insensitive filesystem */
public abstract class C201679k6 {
    public AnonymousClass6C3 A00;
    public final Context A01;
    public final C19730wQ A02;
    public final AnonymousClass1NG A03;
    public final AnonymousClass16D A04;
    public final AnonymousClass171 A05;
    public final ViewHolder A06;
    public final C19970wo A07;
    public final C19630wG A08;
    public final C18820ts A09;
    public final C220412q A0A;
    public final C20810yC A0B;
    public final C20500xf A0C;
    public final AnonymousClass1EL A0D;
    public final AnonymousClass1EV A0E;
    public final AnonymousClass1EU A0F;
    public final AnonymousClass1FR A0G;
    public final C65783Tl A0H;
    public final AnonymousClass005 A0I;
    public final AnonymousClass1AW A0J;
    public final AnonymousClass1T1 A0K;
    public final C28251Rx A0L;
    public final C21060yb A0M;
    public final AnonymousClass165 A0N;
    public final C28371Sj A0O;
    public final AnonymousClass1EM A0P;

    public static Drawable A0H(Context context, C201679k6 r4, int i) {
        Drawable A022 = AnonymousClass3UF.A02(context, i, R.color.f6nameremoved);
        ImageView imageView = r4.A06.A08;
        imageView.setVisibility(0);
        imageView.setImageDrawable(A022);
        return A022;
    }

    public static void A0M(Context context, View view) {
        int A002 = C224514j.A00(view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        view.setVisibility(0);
        C18740tg.A06(context);
        view.setBackground(new C36821lM(AnonymousClass00F.A00(context, A002)));
    }

    public static AnonymousClass3T1 A0J(C201679k6 r0, AnonymousClass11F r1) {
        return ((AnonymousClass6X4) r0.A0I.get()).A06(r1);
    }

    public static void A0N(View view, ViewHolder viewHolder) {
        view.setVisibility(8);
        viewHolder.A0A.setVisibility(8);
        viewHolder.A0U.A03(8);
        viewHolder.A09.setVisibility(8);
        viewHolder.A08.setVisibility(8);
        viewHolder.A0R.A03(8);
        viewHolder.A0S.A03(8);
        viewHolder.A0T.A03(8);
        viewHolder.A0M.A03(8);
        viewHolder.A0J(false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03dc, code lost:
        if (r5.A03 != 5) goto L_0x03de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0930, code lost:
        if (r0 == false) goto L_0x0932;
     */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0462  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x09c7  */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x0a70  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A0P(X.AnonymousClass3T1 r14) {
        /*
            r13 = this;
            boolean r9 = X.C222013h.A07
            boolean r0 = r14 instanceof X.AnonymousClass2bV
            java.lang.String r8 = ""
            r1 = 5
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x007c
            boolean r0 = r14 instanceof X.AnonymousClass2cX
            if (r0 == 0) goto L_0x003e
            r2 = r14
            X.2cX r2 = (X.AnonymousClass2cX) r2
            android.content.Context r1 = r13.A01
            java.lang.String r8 = A0L(r1, r2)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            android.widget.ImageView r0 = r0.A08
            android.graphics.drawable.Drawable r3 = A0G(r1, r0, r2)
        L_0x0020:
            android.content.Context r5 = r13.A01
            X.1Sj r4 = r13.A0O
            if (r14 == 0) goto L_0x0039
            java.util.List r0 = r14.A0w
            if (r0 == 0) goto L_0x0039
            android.text.SpannableStringBuilder r8 = X.C36441kJ.A0P(r8)
            java.util.List r2 = r14.A0w
            r1 = 0
            X.4a3 r0 = new X.4a3
            r0.<init>(r5, r1)
            r4.A05(r8, r0, r2)
        L_0x0039:
            android.util.Pair r0 = X.C36441kJ.A0Q(r3, r8)
            return r0
        L_0x003e:
            boolean r0 = X.C202359le.A04(r14)
            if (r0 == 0) goto L_0x0070
            java.lang.String r1 = X.C202359le.A01(r14)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x004f
            r8 = r1
        L_0x004f:
            java.lang.String r0 = r14.A0b()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0020
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "*"
            r1.append(r0)
            java.lang.String r0 = r14.A0b()
            r1.append(r0)
            java.lang.String r0 = "*\n\n"
            java.lang.String r8 = X.AnonymousClass000.A0p(r0, r8, r1)
            goto L_0x0020
        L_0x0070:
            X.9lY r5 = r14.A0M
            if (r5 != 0) goto L_0x0505
            r0 = r14
            X.2bV r0 = (X.AnonymousClass2bV) r0
            java.lang.String r8 = r0.A1Y()
            goto L_0x0020
        L_0x007c:
            boolean r0 = r14 instanceof X.AnonymousClass2bI
            r4 = 2
            r5 = 8
            if (r0 == 0) goto L_0x00ce
            r7 = r14
            X.2bI r7 = (X.AnonymousClass2bI) r7
            com.whatsapp.conversationslist.ViewHolder r6 = r13.A06
            X.1RJ r1 = r6.A0U
            int r5 = r7.A00
            r0 = 8
            if (r5 != r4) goto L_0x0091
            r0 = 0
        L_0x0091:
            r1.A03(r0)
            android.content.Context r3 = r13.A01
            X.1T1 r1 = r13.A0K
            r0 = 3
            if (r5 != r0) goto L_0x00c3
            r0 = 2131890097(0x7f120fb1, float:1.9414876E38)
        L_0x009e:
            java.lang.String r8 = r3.getString(r0)
        L_0x00a2:
            r0 = 2131231982(0x7f0804ee, float:1.808006E38)
            android.graphics.drawable.Drawable r3 = X.C165587tf.A0D(r3, r0)
            android.widget.ImageView r1 = r6.A08
            X.005 r0 = X.C56672wh.A00
            r0 = 163(0xa3, float:2.28E-43)
            if (r5 == r0) goto L_0x00bb
            r0 = 162(0xa2, float:2.27E-43)
            if (r5 == r0) goto L_0x00bb
            r0 = 164(0xa4, float:2.3E-43)
            if (r5 == r0) goto L_0x00bb
            r2 = 8
        L_0x00bb:
            r1.setVisibility(r2)
            r1.setImageDrawable(r3)
            goto L_0x0020
        L_0x00c3:
            if (r5 != r4) goto L_0x00c9
            r0 = 2131890098(0x7f120fb2, float:1.9414878E38)
            goto L_0x009e
        L_0x00c9:
            java.lang.String r8 = r1.A0O(r7, r2)
            goto L_0x00a2
        L_0x00ce:
            boolean r0 = r14 instanceof X.C23043B1o
            if (r0 == 0) goto L_0x00f7
            X.1AW r1 = r13.A0J
            r0 = r14
            X.B1o r0 = (X.C23043B1o) r0
            X.9gz r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x0020
            android.content.Context r0 = r13.A01
            java.lang.String r8 = r1.A0D(r0)
            android.graphics.drawable.Drawable r3 = r1.A04(r0)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            android.widget.ImageView r0 = r0.A08
            if (r3 != 0) goto L_0x00ef
            r2 = 8
        L_0x00ef:
            r0.setVisibility(r2)
            r0.setImageDrawable(r3)
            goto L_0x0020
        L_0x00f7:
            boolean r0 = r14 instanceof X.C88854Uh
            if (r0 == 0) goto L_0x0110
            r2 = r14
            X.4Uh r2 = (X.C88854Uh) r2
            int r1 = X.C53932s8.A00(r2)
            if (r1 == 0) goto L_0x010a
            android.content.Context r0 = r13.A01
            android.graphics.drawable.Drawable r3 = A0H(r0, r13, r1)
        L_0x010a:
            java.lang.String r8 = r2.BGC()
            goto L_0x0020
        L_0x0110:
            boolean r0 = r14 instanceof X.C46882bp
            if (r0 == 0) goto L_0x0173
            boolean r0 = r14 instanceof X.C46852bm
            android.content.Context r1 = r13.A01
            if (r0 == 0) goto L_0x015e
            r0 = 2131233264(0x7f0809f0, float:1.808266E38)
            if (r9 == 0) goto L_0x0122
            r0 = 2131233265(0x7f0809f1, float:1.8082663E38)
        L_0x0122:
            android.graphics.drawable.Drawable r3 = A0H(r1, r13, r0)
            r4 = r14
            X.2bm r4 = (X.C46852bm) r4
            java.lang.String r8 = r4.A09
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0155
            java.lang.String r1 = r4.A02
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = " "
            if (r0 != 0) goto L_0x0143
            java.lang.StringBuilder r0 = X.C36381kD.A11(r8)
            java.lang.String r8 = X.AnonymousClass000.A0p(r2, r1, r0)
        L_0x0143:
            java.lang.String r1 = r4.A05
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0020
            java.lang.StringBuilder r0 = X.C36381kD.A11(r8)
            java.lang.String r8 = X.AnonymousClass000.A0p(r2, r1, r0)
            goto L_0x0020
        L_0x0155:
            r0 = 2131886538(0x7f1201ca, float:1.9407658E38)
            java.lang.String r8 = r1.getString(r0)
            goto L_0x0020
        L_0x015e:
            r0 = 2131233240(0x7f0809d8, float:1.8082612E38)
            if (r9 == 0) goto L_0x0166
            r0 = 2131233241(0x7f0809d9, float:1.8082614E38)
        L_0x0166:
            android.graphics.drawable.Drawable r3 = A0H(r1, r13, r0)
            r0 = r14
            X.2bp r0 = (X.C46882bp) r0
            java.lang.String r8 = X.AnonymousClass3T9.A01(r1, r0)
            goto L_0x0020
        L_0x0173:
            boolean r0 = r14 instanceof X.C46972by
            if (r0 == 0) goto L_0x01f6
            r4 = r14
            X.2by r4 = (X.C46972by) r4
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            android.widget.ImageView r5 = r0.A08
            r5.setVisibility(r2)
            boolean r0 = X.C131806Qs.A02(r14)
            if (r0 == 0) goto L_0x019e
            android.content.Context r1 = r13.A01
            r0 = 2131233224(0x7f0809c8, float:1.808258E38)
            if (r9 == 0) goto L_0x0191
            r0 = 2131233225(0x7f0809c9, float:1.8082581E38)
        L_0x0191:
            android.graphics.drawable.Drawable r3 = X.C165587tf.A0D(r1, r0)
            r5.setImageDrawable(r3)
            java.lang.String r8 = X.AnonymousClass3RN.A01(r1, r14)
            goto L_0x0020
        L_0x019e:
            android.content.Context r2 = r13.A01
            r0 = 2131233227(0x7f0809cb, float:1.8082586E38)
            if (r9 == 0) goto L_0x01a8
            r0 = 2131233228(0x7f0809cc, float:1.8082588E38)
        L_0x01a8:
            android.graphics.drawable.Drawable r3 = X.C165587tf.A0D(r2, r0)
            r5.setImageDrawable(r3)
            java.lang.String r8 = X.C202359le.A01(r14)
            java.lang.String r1 = r4.A01
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01be
            r8 = r1
            goto L_0x0020
        L_0x01be:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x01d5
            java.lang.String r0 = r4.A1b()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01f1
            r0 = 2131888476(0x7f12095c, float:1.9411588E38)
            java.lang.String r8 = r2.getString(r0)
        L_0x01d5:
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0020
            java.lang.StringBuilder r1 = X.C36381kD.A11(r8)
            java.lang.String r0 = " ("
            r1.append(r0)
            X.0ts r0 = r13.A09
            java.lang.String r0 = X.C25561Gu.A01(r0, r4)
            r1.append(r0)
            java.lang.String r8 = X.C90474aD.A0f(r1)
            goto L_0x0020
        L_0x01f1:
            java.lang.String r8 = r4.A1b()
            goto L_0x01d5
        L_0x01f6:
            boolean r0 = r14 instanceof X.C46812bi
            r7 = 1
            if (r0 == 0) goto L_0x0255
            r4 = r14
            X.2bi r4 = (X.C46812bi) r4
            boolean r0 = r14 instanceof X.C46802bh
            if (r0 == 0) goto L_0x0215
            r2 = r14
            X.2bh r2 = (X.C46802bh) r2
            android.content.Context r1 = r13.A01
            java.lang.String r8 = A0L(r1, r2)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            android.widget.ImageView r0 = r0.A08
            android.graphics.drawable.Drawable r3 = A0G(r1, r0, r2)
            goto L_0x0020
        L_0x0215:
            int r0 = r4.A09
            if (r0 != r7) goto L_0x0242
            int r0 = r4.A0B
            if (r0 == 0) goto L_0x0238
            X.0ts r3 = r13.A09
            int r0 = r4.A0B
            long r0 = (long) r0
            java.lang.String r8 = X.AnonymousClass3UY.A07(r3, r0)
        L_0x0226:
            android.content.Context r0 = r13.A01
            android.graphics.drawable.Drawable r3 = X.AnonymousClass3R0.A00(r0, r4)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            android.widget.ImageView r0 = r0.A08
            r0.setVisibility(r2)
            r0.setImageDrawable(r3)
            goto L_0x0020
        L_0x0238:
            android.content.Context r1 = r13.A01
            r0 = 2131888493(0x7f12096d, float:1.9411623E38)
            java.lang.String r8 = r1.getString(r0)
            goto L_0x0226
        L_0x0242:
            android.content.Context r2 = r13.A01
            r0 = 2131888471(0x7f120957, float:1.9411578E38)
            java.lang.String r8 = r2.getString(r0)
            r0 = 2131233217(0x7f0809c1, float:1.8082565E38)
            if (r9 == 0) goto L_0x02dc
            r0 = 2131233218(0x7f0809c2, float:1.8082567E38)
            goto L_0x02dc
        L_0x0255:
            boolean r0 = r14 instanceof X.C181798o3
            if (r0 == 0) goto L_0x0270
            r2 = r14
            X.8o3 r2 = (X.C181798o3) r2
            android.content.Context r1 = r13.A01
            r0 = 2131233278(0x7f0809fe, float:1.8082689E38)
            if (r9 == 0) goto L_0x0266
            r0 = 2131233279(0x7f0809ff, float:1.808269E38)
        L_0x0266:
            android.graphics.drawable.Drawable r3 = A0H(r1, r13, r0)
            java.lang.String r8 = X.AnonymousClass3T9.A02(r1, r2)
            goto L_0x0020
        L_0x0270:
            boolean r0 = r14 instanceof X.AnonymousClass2cY
            if (r0 == 0) goto L_0x028b
            android.content.Context r1 = r13.A01
            r0 = 2131233278(0x7f0809fe, float:1.8082689E38)
            if (r9 == 0) goto L_0x027e
            r0 = 2131233279(0x7f0809ff, float:1.808269E38)
        L_0x027e:
            android.graphics.drawable.Drawable r3 = A0H(r1, r13, r0)
            r0 = 2131888487(0x7f120967, float:1.941161E38)
            java.lang.String r8 = X.C36351kA.A0w(r1, r8, r7, r0)
            goto L_0x0020
        L_0x028b:
            boolean r0 = r14 instanceof X.C181788o2
            if (r0 == 0) goto L_0x02b4
            r2 = r14
            X.2bU r2 = (X.AnonymousClass2bU) r2
            android.content.Context r1 = r13.A01
            r0 = 2131233234(0x7f0809d2, float:1.80826E38)
            android.graphics.drawable.Drawable r3 = A0H(r1, r13, r0)
            java.lang.String r0 = r2.A1a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x02ae
            r0 = 2131888477(0x7f12095d, float:1.941159E38)
            java.lang.String r8 = r1.getString(r0)
            goto L_0x0020
        L_0x02ae:
            java.lang.String r8 = r2.A1a()
            goto L_0x0020
        L_0x02b4:
            boolean r0 = r14 instanceof X.AnonymousClass2bX
            if (r0 == 0) goto L_0x02e5
            r1 = r14
            X.2bX r1 = (X.AnonymousClass2bX) r1
            java.lang.String r0 = r1.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x02e2
            android.content.Context r1 = r13.A01
            r0 = 2131888474(0x7f12095a, float:1.9411584E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x02ce:
            java.lang.String r8 = X.AnonymousClass14B.A0C(r0, r2)
        L_0x02d2:
            android.content.Context r2 = r13.A01
            r0 = 2131233224(0x7f0809c8, float:1.808258E38)
            if (r9 == 0) goto L_0x02dc
            r0 = 2131233225(0x7f0809c9, float:1.8082581E38)
        L_0x02dc:
            android.graphics.drawable.Drawable r3 = A0H(r2, r13, r0)
            goto L_0x0020
        L_0x02e2:
            java.lang.String r0 = r1.A00
            goto L_0x02ce
        L_0x02e5:
            boolean r0 = r14 instanceof X.AnonymousClass2bW
            if (r0 == 0) goto L_0x02f3
            X.0wG r1 = r13.A08
            r0 = r14
            X.2bW r0 = (X.AnonymousClass2bW) r0
            java.lang.String r8 = X.C55732v6.A00(r1, r0)
            goto L_0x02d2
        L_0x02f3:
            boolean r0 = r14 instanceof X.C46912bs
            if (r0 == 0) goto L_0x0323
            java.lang.String r8 = X.C202359le.A01(r14)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0315
            r1 = r14
            X.2bs r1 = (X.C46912bs) r1
            java.lang.String r0 = r1.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0320
            android.content.Context r1 = r13.A01
            r0 = 2131888483(0x7f120963, float:1.9411603E38)
            java.lang.String r8 = r1.getString(r0)
        L_0x0315:
            android.content.Context r2 = r13.A01
            r0 = 2131233245(0x7f0809dd, float:1.8082622E38)
            if (r9 == 0) goto L_0x02dc
            r0 = 2131233246(0x7f0809de, float:1.8082624E38)
            goto L_0x02dc
        L_0x0320:
            java.lang.String r8 = r1.A01
            goto L_0x0315
        L_0x0323:
            boolean r0 = r14 instanceof X.C46902br
            if (r0 == 0) goto L_0x0346
            r0 = r14
            X.2br r0 = (X.C46902br) r0
            java.lang.String r8 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x033b
            android.content.Context r1 = r13.A01
            r0 = 2131888482(0x7f120962, float:1.94116E38)
            java.lang.String r8 = r1.getString(r0)
        L_0x033b:
            android.content.Context r2 = r13.A01
            r0 = 2131232411(0x7f08069b, float:1.808093E38)
            if (r9 == 0) goto L_0x02dc
            r0 = 2131232412(0x7f08069c, float:1.8080933E38)
            goto L_0x02dc
        L_0x0346:
            boolean r0 = X.C203359nq.A0C(r14)
            if (r0 == 0) goto L_0x0383
            X.9lY r5 = r14.A0M
            if (r5 != 0) goto L_0x0505
            boolean r0 = r14 instanceof X.AnonymousClass2c1
            if (r0 == 0) goto L_0x0020
            r0 = r14
            X.2c1 r0 = (X.AnonymousClass2c1) r0
            X.2ot r1 = r0.A00
            if (r1 == 0) goto L_0x0520
            X.2ot r0 = X.C52102ot.A02
            if (r1 != r0) goto L_0x0520
            X.0yC r1 = r13.A0B
            r0 = 6673(0x1a11, float:9.351E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0520
            X.0wQ r0 = r13.A02
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x0520
            android.content.Context r1 = r13.A01
            r0 = 2131234278(0x7f080de6, float:1.8084717E38)
            android.graphics.drawable.Drawable r3 = A0H(r1, r13, r0)
            r0 = 2131892000(0x7f121720, float:1.9418736E38)
            java.lang.String r8 = X.C36351kA.A0w(r1, r8, r7, r0)
            goto L_0x0020
        L_0x0383:
            boolean r0 = r14 instanceof X.AnonymousClass5J5
            if (r0 == 0) goto L_0x03d2
            r5 = r14
            X.5J5 r5 = (X.AnonymousClass5J5) r5
            int r1 = r5.A1X()
            if (r1 == 0) goto L_0x03ce
            if (r1 == r7) goto L_0x03ca
            r0 = 2131888480(0x7f120960, float:1.9411597E38)
            if (r1 == r4) goto L_0x039a
            r0 = 2131888479(0x7f12095f, float:1.9411594E38)
        L_0x039a:
            android.content.Context r3 = r13.A01
            java.lang.String r8 = r3.getString(r0)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            android.widget.ImageView r4 = r0.A08
            r4.setVisibility(r2)
            boolean r0 = r5.A1Y()
            if (r0 == 0) goto L_0x03c1
            r1 = 2131233254(0x7f0809e6, float:1.808264E38)
            if (r9 == 0) goto L_0x03b5
            r1 = 2131233255(0x7f0809e7, float:1.8082642E38)
        L_0x03b5:
            r0 = 2131101695(0x7f0607ff, float:1.7815807E38)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass3UF.A02(r3, r1, r0)
            r4.setImageDrawable(r3)
            goto L_0x0020
        L_0x03c1:
            r1 = 2131233251(0x7f0809e3, float:1.8082634E38)
            if (r9 == 0) goto L_0x03b5
            r1 = 2131233252(0x7f0809e4, float:1.8082636E38)
            goto L_0x03b5
        L_0x03ca:
            r0 = 2131888492(0x7f12096c, float:1.941162E38)
            goto L_0x039a
        L_0x03ce:
            r0 = 2131888494(0x7f12096e, float:1.9411625E38)
            goto L_0x039a
        L_0x03d2:
            boolean r0 = r14 instanceof X.AnonymousClass2bK
            if (r0 == 0) goto L_0x0445
            X.9lY r5 = r14.A0M
            if (r5 == 0) goto L_0x0a69
            int r0 = r5.A03
            if (r0 == r1) goto L_0x0a69
        L_0x03de:
            android.content.Context r4 = r13.A01
            java.lang.CharSequence r5 = X.AnonymousClass1FR.A01(r4, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x042c
            X.1EV r0 = r13.A0E
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x043e
            X.1EU r1 = r13.A0F
            X.9lY r0 = r14.A0M
            java.lang.String r0 = r0.A0G
            X.9e3 r1 = r1.A03(r0)
            if (r1 == 0) goto L_0x043e
            X.9lY r0 = r14.A0M
            java.lang.String r0 = r0.A0I
            X.B66 r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x043e
            X.9lY r0 = r14.A0M
            int r1 = r1.BIX(r0)
        L_0x040e:
            android.content.res.Resources r0 = r4.getResources()
            int r4 = r0.getColor(r1)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            X.1RJ r1 = r0.A0S
            android.view.View r0 = X.C36391kE.A0L(r1, r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r4)
            android.view.View r0 = r1.A01()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r5)
        L_0x042c:
            X.1FR r4 = r13.A0G
            X.9lY r2 = r14.A0M
            if (r2 == 0) goto L_0x0020
            int r1 = r2.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x0537
            java.lang.String r8 = X.AnonymousClass1FR.A08(r2, r4)
            goto L_0x0020
        L_0x043e:
            X.9lY r0 = r14.A0M
            int r1 = X.AnonymousClass1FR.A00(r0)
            goto L_0x040e
        L_0x0445:
            boolean r0 = r14 instanceof X.AnonymousClass2c8
            if (r0 == 0) goto L_0x049a
            r0 = r14
            X.2c8 r0 = (X.AnonymousClass2c8) r0
            com.whatsapp.jid.UserJid r1 = r0.A00
            boolean r0 = X.C64933Qa.A04(r14)
            if (r0 == 0) goto L_0x046b
            android.content.Context r2 = r13.A01
            r0 = 2131893743(0x7f121def, float:1.9422271E38)
        L_0x0459:
            java.lang.String r8 = r2.getString(r0)
        L_0x045d:
            r0 = 2131233221(0x7f0809c5, float:1.8082573E38)
            if (r9 == 0) goto L_0x0465
            r0 = 2131233222(0x7f0809c6, float:1.8082575E38)
        L_0x0465:
            android.graphics.drawable.Drawable r3 = A0H(r2, r13, r0)
            goto L_0x0020
        L_0x046b:
            X.0wQ r0 = r13.A02
            boolean r0 = r0.A0M(r1)
            if (r0 == 0) goto L_0x0479
            android.content.Context r2 = r13.A01
            r0 = 2131886452(0x7f120174, float:1.9407483E38)
            goto L_0x0459
        L_0x0479:
            if (r1 != 0) goto L_0x0481
            android.content.Context r2 = r13.A01
            r0 = 2131886450(0x7f120172, float:1.940748E38)
            goto L_0x0459
        L_0x0481:
            X.171 r3 = r13.A05
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r7]
            r0[r2] = r1
            java.util.ArrayList r1 = X.AnonymousClass6XV.newArrayList(r0)
            r0 = -1
            java.lang.String r1 = r3.A0X(r1, r0)
            android.content.Context r2 = r13.A01
            r0 = 2131886451(0x7f120173, float:1.9407481E38)
            java.lang.String r8 = X.C36351kA.A0w(r2, r1, r7, r0)
            goto L_0x045d
        L_0x049a:
            boolean r0 = r14 instanceof X.AnonymousClass2bO
            if (r0 == 0) goto L_0x04db
            X.3Qa r2 = r14.A1J
            X.11F r0 = r2.A00
            boolean r1 = r0 instanceof X.C28981Uw
            boolean r0 = r2.A02
            android.content.Context r2 = r13.A01
            if (r0 == 0) goto L_0x04d2
            r0 = 2131893744(0x7f121df0, float:1.9422273E38)
            if (r1 == 0) goto L_0x04b2
            r0 = 2131893745(0x7f121df1, float:1.9422275E38)
        L_0x04b2:
            java.lang.String r8 = r2.getString(r0)
            X.0ts r0 = r13.A09
            boolean r0 = X.C36401kF.A1X(r0)
            if (r0 == 0) goto L_0x04c8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r8 = X.C90464aC.A0f(r8, r1, r0)
        L_0x04c8:
            r0 = 2131233221(0x7f0809c5, float:1.8082573E38)
            if (r9 == 0) goto L_0x02dc
            r0 = 2131233222(0x7f0809c6, float:1.8082575E38)
            goto L_0x02dc
        L_0x04d2:
            r0 = 2131893742(0x7f121dee, float:1.942227E38)
            if (r1 == 0) goto L_0x04b2
            r0 = 2131893743(0x7f121def, float:1.9422271E38)
            goto L_0x04b2
        L_0x04db:
            boolean r0 = r14 instanceof X.C46982bz
            if (r0 == 0) goto L_0x04ea
            android.content.Context r1 = r13.A01
            r0 = 2131896941(0x7f122a6d, float:1.9428757E38)
            java.lang.String r8 = r1.getString(r0)
            goto L_0x0020
        L_0x04ea:
            boolean r0 = r14 instanceof X.C46962bx
            if (r0 == 0) goto L_0x058a
            X.9lY r5 = r14.A0M
            if (r5 != 0) goto L_0x0505
            android.content.Context r2 = r13.A01
            r0 = 2131888488(0x7f120968, float:1.9411613E38)
            java.lang.String r8 = r2.getString(r0)
            r0 = 2131233272(0x7f0809f8, float:1.8082677E38)
            if (r9 == 0) goto L_0x02dc
            r0 = 2131233273(0x7f0809f9, float:1.8082679E38)
            goto L_0x02dc
        L_0x0505:
            int r0 = r5.A03
            if (r0 != r1) goto L_0x03de
            android.content.Context r1 = r13.A01
            r0 = 2131233275(0x7f0809fb, float:1.8082683E38)
            if (r9 == 0) goto L_0x0513
            r0 = 2131233276(0x7f0809fc, float:1.8082685E38)
        L_0x0513:
            android.graphics.drawable.Drawable r3 = A0H(r1, r13, r0)
            r0 = 2131888497(0x7f120971, float:1.941163E38)
            java.lang.String r8 = r1.getString(r0)
            goto L_0x0020
        L_0x0520:
            android.content.Context r1 = r13.A01
            r0 = 2131233237(0x7f0809d5, float:1.8082606E38)
            if (r9 == 0) goto L_0x052a
            r0 = 2131233238(0x7f0809d6, float:1.8082608E38)
        L_0x052a:
            android.graphics.drawable.Drawable r3 = A0H(r1, r13, r0)
            r0 = 2131888475(0x7f12095b, float:1.9411586E38)
            java.lang.String r8 = r1.getString(r0)
            goto L_0x0020
        L_0x0537:
            java.lang.String r0 = r2.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0553
            X.9lY r1 = r14.A0M
            X.16X r0 = r1.A08
            if (r0 == 0) goto L_0x0553
            X.16U r2 = r1.A03()
            X.0ts r1 = r4.A05
            X.9lY r0 = r14.A0M
            X.16X r0 = r0.A08
            java.lang.String r8 = r2.B7c(r1, r0)
        L_0x0553:
            boolean r0 = r14 instanceof X.C46962bx
            java.lang.String r1 = " • "
            if (r0 == 0) goto L_0x056e
            java.lang.StringBuilder r2 = X.C36331k8.A0k(r8, r1)
            X.0wG r0 = r4.A04
            android.content.Context r1 = r0.A00
            r0 = 2131894569(0x7f122129, float:1.9423946E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r8 = X.AnonymousClass000.A0q(r0, r2)
            goto L_0x0020
        L_0x056e:
            int r0 = r14.A1I
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = r14.A0b()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0020
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r8, r1)
            java.lang.String r0 = r14.A0b()
            java.lang.String r8 = X.AnonymousClass000.A0q(r0, r1)
            goto L_0x0020
        L_0x058a:
            boolean r0 = r14 instanceof X.C180978mj
            if (r0 == 0) goto L_0x05a9
            android.content.Context r2 = r13.A01
            X.3Qa r0 = r14.A1J
            boolean r0 = r0.A02
            r1 = 2131892225(0x7f121801, float:1.9419192E38)
            if (r0 == 0) goto L_0x059c
            r1 = 2131892258(0x7f121822, float:1.941926E38)
        L_0x059c:
            java.lang.String r8 = r2.getString(r1)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            android.widget.ImageView r0 = r0.A09
            r0.setVisibility(r5)
            goto L_0x0020
        L_0x05a9:
            boolean r0 = r14 instanceof X.C180968mi
            if (r0 == 0) goto L_0x05bc
            android.content.Context r2 = r13.A01
            X.3Qa r0 = r14.A1J
            boolean r0 = r0.A02
            r1 = 2131892256(0x7f121820, float:1.9419255E38)
            if (r0 == 0) goto L_0x059c
            r1 = 2131892257(0x7f121821, float:1.9419257E38)
            goto L_0x059c
        L_0x05bc:
            boolean r0 = r14 instanceof X.AnonymousClass2bQ
            if (r0 == 0) goto L_0x05f1
            X.1EM r1 = r13.A0P
            r0 = r14
            X.2bQ r0 = (X.AnonymousClass2bQ) r0
            int r0 = r0.A00
            boolean r1 = r1.A03(r0)
            android.content.Context r4 = r13.A01
            r0 = 2131890182(0x7f121006, float:1.9415049E38)
            if (r1 == 0) goto L_0x05d5
            r0 = 2131892085(0x7f121775, float:1.9418908E38)
        L_0x05d5:
            java.lang.String r8 = r4.getString(r0)
            r0 = 2131233243(0x7f0809db, float:1.8082618E38)
            if (r9 == 0) goto L_0x05e1
            r0 = 2131233244(0x7f0809dc, float:1.808262E38)
        L_0x05e1:
            android.graphics.drawable.Drawable r3 = X.C165587tf.A0D(r4, r0)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            android.widget.ImageView r0 = r0.A08
            r0.setImageDrawable(r3)
            r0.setVisibility(r2)
            goto L_0x0020
        L_0x05f1:
            boolean r0 = r14 instanceof X.C46952bw
            if (r0 == 0) goto L_0x061d
            X.0yC r3 = r13.A0B
            r0 = 4893(0x131d, float:6.857E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x0611
            android.content.Context r4 = r13.A01
            r0 = 2131891944(0x7f1216e8, float:1.9418622E38)
            java.lang.String r8 = r4.getString(r0)
        L_0x0608:
            r0 = 2131233257(0x7f0809e9, float:1.8082646E38)
            if (r9 == 0) goto L_0x05e1
            r0 = 2131233258(0x7f0809ea, float:1.8082648E38)
            goto L_0x05e1
        L_0x0611:
            r1 = r14
            X.2bw r1 = (X.C46952bw) r1
            android.content.Context r4 = r13.A01
            X.0ts r0 = r13.A09
            java.lang.String r8 = X.C20600xp.A04(r4, r0, r3, r1)
            goto L_0x0608
        L_0x061d:
            boolean r0 = r14 instanceof X.AnonymousClass2bH
            if (r0 == 0) goto L_0x0646
            r6 = r14
            X.2bH r6 = (X.AnonymousClass2bH) r6
            X.1T1 r4 = r13.A0K
            X.3Qa r1 = r6.A1J
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0643
            X.0wQ r0 = r13.A02
            com.whatsapp.jid.PhoneUserJid r2 = X.C36441kJ.A0n(r0)
        L_0x0632:
            int r1 = r6.A00
            int r0 = r6.A04
            java.lang.String r8 = r4.A0K(r2, r1, r0, r7)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            android.widget.ImageView r0 = r0.A09
            r0.setVisibility(r5)
            goto L_0x0020
        L_0x0643:
            X.11F r2 = r1.A00
            goto L_0x0632
        L_0x0646:
            boolean r0 = r14 instanceof X.C46892bq
            if (r0 == 0) goto L_0x065d
            r2 = r14
            X.2bq r2 = (X.C46892bq) r2
            android.content.Context r1 = r13.A01
            java.lang.String r8 = A0L(r1, r2)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            android.widget.ImageView r0 = r0.A08
            android.graphics.drawable.Drawable r3 = A0G(r1, r0, r2)
            goto L_0x0020
        L_0x065d:
            boolean r0 = r14 instanceof X.C47012ca
            if (r0 == 0) goto L_0x0674
            r2 = r14
            X.2ca r2 = (X.C47012ca) r2
            android.content.Context r1 = r13.A01
            java.lang.String r8 = A0L(r1, r2)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            android.widget.ImageView r0 = r0.A08
            android.graphics.drawable.Drawable r3 = A0G(r1, r0, r2)
            goto L_0x0020
        L_0x0674:
            boolean r0 = r14 instanceof X.AnonymousClass2bR
            if (r0 == 0) goto L_0x06ec
            X.1FR r5 = r13.A0G
            r6 = r14
            X.2bR r6 = (X.AnonymousClass2bR) r6
            int r1 = r6.A00
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            android.content.Context r2 = r13.A01
            if (r0 == 0) goto L_0x0a6b
            X.3Qa r0 = r14.A1J
            boolean r8 = r0.A02
            X.11F r4 = r0.A00
            X.C18740tg.A06(r4)
            X.171 r1 = r5.A02
            X.16D r0 = r5.A01
            X.141 r0 = r0.A0D(r4)
            java.lang.String r4 = r1.A0M(r0)
            X.1EV r0 = r5.A08
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x06ae
            X.1EU r0 = r5.A09
            X.B66 r0 = r0.A05()
            r0.BFa()
        L_0x06ae:
            r1 = 2131892198(0x7f1217e6, float:1.9419138E38)
            if (r8 == 0) goto L_0x06b6
            r1 = 2131892199(0x7f1217e7, float:1.941914E38)
        L_0x06b6:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r8 = X.C36381kD.A0r(r2, r4, r0, r1)
            int r0 = r6.A00
            android.text.SpannableStringBuilder r4 = r5.A0F(r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0020
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131101946(0x7f0608fa, float:1.7816316E38)
            int r2 = r1.getColor(r0)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            X.1RJ r1 = r0.A0S
            r0 = 0
            android.view.View r0 = X.C36391kE.A0L(r1, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r2)
            android.view.View r0 = r1.A01()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r4)
            goto L_0x0020
        L_0x06ec:
            boolean r0 = r14 instanceof X.AnonymousClass2bS
            if (r0 == 0) goto L_0x071b
            r0 = r14
            X.2bS r0 = (X.AnonymousClass2bS) r0
            java.lang.String r8 = r0.A03
            X.0yC r1 = r13.A0B
            X.AnonymousClass00C.A0D(r1, r2)
            r0 = 3223(0xc97, float:4.516E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0712
            r1 = 2131233261(0x7f0809ed, float:1.8082655E38)
            if (r9 == 0) goto L_0x070a
            r1 = 2131233262(0x7f0809ee, float:1.8082657E38)
        L_0x070a:
            android.content.Context r0 = r13.A01
            android.graphics.drawable.Drawable r3 = A0H(r0, r13, r1)
            goto L_0x0020
        L_0x0712:
            r1 = 2131233260(0x7f0809ec, float:1.8082652E38)
            if (r9 == 0) goto L_0x070a
            r1 = 2131233263(0x7f0809ef, float:1.8082659E38)
            goto L_0x070a
        L_0x071b:
            boolean r0 = r14 instanceof X.AnonymousClass2bE
            if (r0 == 0) goto L_0x0745
            X.0wG r4 = r13.A08
            android.content.Context r3 = r4.A00
            r1 = 2131232590(0x7f08074e, float:1.8081294E38)
            if (r9 == 0) goto L_0x072b
            r1 = 2131232591(0x7f08074f, float:1.8081296E38)
        L_0x072b:
            r0 = 2131100186(0x7f06021a, float:1.7812746E38)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass3UF.A02(r3, r1, r0)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            android.widget.ImageView r0 = r0.A08
            r0.setVisibility(r2)
            r0.setImageDrawable(r3)
            r0 = 2131893115(0x7f121b7b, float:1.9420997E38)
            java.lang.String r8 = r4.A01(r0)
            goto L_0x0020
        L_0x0745:
            boolean r0 = r14 instanceof X.AnonymousClass2bN
            if (r0 == 0) goto L_0x076f
            X.0wG r4 = r13.A08
            android.content.Context r3 = r4.A00
            r1 = 2131232590(0x7f08074e, float:1.8081294E38)
            if (r9 == 0) goto L_0x0755
            r1 = 2131232591(0x7f08074f, float:1.8081296E38)
        L_0x0755:
            r0 = 2131100186(0x7f06021a, float:1.7812746E38)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass3UF.A02(r3, r1, r0)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            android.widget.ImageView r0 = r0.A08
            r0.setVisibility(r2)
            r0.setImageDrawable(r3)
            r0 = 2131893130(0x7f121b8a, float:1.9421028E38)
            java.lang.String r8 = r4.A01(r0)
            goto L_0x0020
        L_0x076f:
            boolean r0 = r14 instanceof X.AnonymousClass2bJ
            if (r0 == 0) goto L_0x0792
            X.0wG r0 = r13.A08
            android.content.Context r4 = r0.A00
            X.16D r5 = r13.A04
            X.171 r6 = r13.A05
            X.0ts r7 = r13.A09
            X.3Qa r1 = r14.A1J
            boolean r12 = r1.A02
            r0 = r14
            X.2bJ r0 = (X.AnonymousClass2bJ) r0
            long r10 = r0.A01
            X.11F r8 = r1.A00
            com.whatsapp.jid.UserJid r9 = r14.A0L()
            java.lang.String r8 = X.AnonymousClass3UL.A02(r4, r5, r6, r7, r8, r9, r10, r12)
            goto L_0x0020
        L_0x0792:
            boolean r0 = r14 instanceof X.C106265Iz
            if (r0 == 0) goto L_0x0a43
            r6 = r14
            X.5Iz r6 = (X.C106265Iz) r6
            X.3Kh r1 = r6.A01
            java.lang.Object r0 = r1.A00
            if (r0 == 0) goto L_0x0020
            X.005 r0 = r13.A0I
            java.lang.Object r5 = r0.get()
            X.6X4 r5 = (X.AnonymousClass6X4) r5
            X.0wG r4 = r13.A08
            X.AnonymousClass00C.A0D(r4, r2)
            boolean r0 = r6.A1Z()
            if (r0 == 0) goto L_0x08e3
            X.0wQ r9 = r5.A00
            java.lang.Object r1 = r1.A00
            X.C18740tg.A06(r1)
            X.5Nh r1 = (X.C107265Nh) r1
            boolean r0 = r6.A1Y()
            if (r0 == 0) goto L_0x0805
            r0 = 2131887372(0x7f12050c, float:1.940935E38)
            java.lang.String r8 = r4.A01(r0)
            X.AnonymousClass00C.A0B(r8)
        L_0x07cb:
            X.0yC r1 = r13.A0B
            boolean r0 = X.C113155f5.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x07fe
            r0 = 6120(0x17e8, float:8.576E-42)
            int r0 = r1.A07(r0)
            if (r0 <= r7) goto L_0x07fe
            int r3 = X.AnonymousClass6X4.A00(r6)
            if (r3 == 0) goto L_0x07fe
            X.6C3 r1 = r13.A00
            if (r1 != 0) goto L_0x07ec
            X.6C3 r1 = new X.6C3
            r1.<init>()
            r13.A00 = r1
        L_0x07ec:
            android.content.Context r0 = r13.A01
            X.0BQ r3 = r1.A00(r0, r3, r7)
        L_0x07f2:
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            android.widget.ImageView r0 = r0.A08
            r0.setVisibility(r2)
            r0.setImageDrawable(r3)
            goto L_0x0020
        L_0x07fe:
            android.content.Context r0 = r4.A00
            android.graphics.drawable.Drawable r3 = r5.A05(r0, r6, r7)
            goto L_0x07f2
        L_0x0805:
            boolean r0 = r6.A1d()
            if (r0 == 0) goto L_0x0837
            boolean r0 = r6.A1e()
            if (r0 == 0) goto L_0x0817
            X.3Qa r0 = r6.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0837
        L_0x0817:
            boolean r0 = r6.A1e()
            if (r0 == 0) goto L_0x0825
            r12 = 2131887391(0x7f12051f, float:1.9409388E38)
            r1 = 2131887377(0x7f120511, float:1.940936E38)
            goto L_0x09f9
        L_0x0825:
            boolean r0 = r1.A0K
            r1 = 2131887397(0x7f120525, float:1.94094E38)
            if (r0 == 0) goto L_0x082f
            r1 = 2131887396(0x7f120524, float:1.9409398E38)
        L_0x082f:
            r0 = 2131887391(0x7f12051f, float:1.9409388E38)
            android.text.SpannableString r8 = X.AnonymousClass6X4.A01(r4, r3, r0, r1)
            goto L_0x07cb
        L_0x0837:
            boolean r0 = r6.A1b()
            if (r0 == 0) goto L_0x0893
            boolean r0 = r6.A1e()
            if (r0 == 0) goto L_0x085f
            r8 = 2131887377(0x7f120511, float:1.940936E38)
        L_0x0846:
            int r0 = r1.A07(r9)
            r9 = 5
            if (r0 != r9) goto L_0x086a
            boolean r1 = r6.A1e()
            r0 = 2131887374(0x7f12050e, float:1.9409353E38)
            if (r1 == 0) goto L_0x0859
            r0 = 2131887379(0x7f120513, float:1.9409363E38)
        L_0x0859:
            android.text.SpannableString r8 = X.AnonymousClass6X4.A01(r4, r3, r0, r8)
            goto L_0x07cb
        L_0x085f:
            boolean r0 = r1.A0K
            r8 = 2131887376(0x7f120510, float:1.9409357E38)
            if (r0 == 0) goto L_0x0846
            r8 = 2131887375(0x7f12050f, float:1.9409355E38)
            goto L_0x0846
        L_0x086a:
            r3 = 2131887378(0x7f120512, float:1.9409361E38)
            java.util.ArrayList r0 = r1.A0C()
            java.util.Iterator r10 = r0.iterator()
            r1 = 0
        L_0x0876:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0889
            java.lang.Object r0 = r10.next()
            X.5Nf r0 = (X.C107255Nf) r0
            int r0 = r0.A01
            if (r0 != r9) goto L_0x0876
            int r1 = r1 + 1
            goto L_0x0876
        L_0x0889:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            android.text.SpannableString r8 = X.AnonymousClass6X4.A01(r4, r0, r3, r8)
            goto L_0x07cb
        L_0x0893:
            X.AnonymousClass00C.A0B(r1)
            boolean r0 = X.AnonymousClass6X4.A03(r5, r1)
            if (r0 == 0) goto L_0x08ad
            X.3Qa r0 = r6.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x08ad
            boolean r0 = r6.A1e()
            if (r0 == 0) goto L_0x09c0
            r3 = 2131887395(0x7f120523, float:1.9409396E38)
            goto L_0x093f
        L_0x08ad:
            boolean r0 = r6.A1a()
            if (r0 == 0) goto L_0x08ce
            X.3Qa r0 = r6.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x08ce
            boolean r0 = r6.A1e()
            if (r0 == 0) goto L_0x08c3
            r3 = 2131887383(0x7f120517, float:1.9409372E38)
            goto L_0x093f
        L_0x08c3:
            boolean r0 = r1.A0K
            r3 = 2131887382(0x7f120516, float:1.940937E38)
            if (r0 == 0) goto L_0x093f
            r3 = 2131887381(0x7f120515, float:1.9409367E38)
            goto L_0x093f
        L_0x08ce:
            boolean r0 = r6.A1e()
            if (r0 == 0) goto L_0x08d8
            r3 = 2131887377(0x7f120511, float:1.940936E38)
            goto L_0x093f
        L_0x08d8:
            boolean r0 = r1.A0K
            r3 = 2131887376(0x7f120510, float:1.9409357E38)
            if (r0 == 0) goto L_0x093f
            r3 = 2131887375(0x7f12050f, float:1.9409355E38)
            goto L_0x093f
        L_0x08e3:
            boolean r0 = r6.A1X()
            if (r0 == 0) goto L_0x0973
            X.0wQ r9 = r5.A00
            java.lang.Object r8 = r1.A00
            X.C18740tg.A06(r8)
            X.5Nh r8 = (X.C107265Nh) r8
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            X.3Qa r1 = r6.A1J
            X.11F r12 = r1.A00
            com.whatsapp.jid.UserJid r11 = X.C222813r.A00(r12)
            if (r11 != 0) goto L_0x0919
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CallingMessageUtil/getAdHocGroupCallLogMessageText: peerjid is null. This is group jid: "
            r10.append(r0)
            boolean r0 = r12 instanceof com.whatsapp.jid.GroupJid
            r10.append(r0)
            java.lang.String r0 = " and callType is "
            r10.append(r0)
            int r0 = r8.A08
            r10.append(r0)
            X.C90504aG.A1G(r10)
        L_0x0919:
            boolean r0 = r6.A1Y()
            if (r0 != 0) goto L_0x09e8
            boolean r0 = r6.A1b()
            if (r0 == 0) goto L_0x0955
            boolean r10 = r1.A02
            if (r10 != 0) goto L_0x0948
            boolean r0 = r6.A1d()
            r12 = 2131887391(0x7f12051f, float:1.9409388E38)
            if (r0 != 0) goto L_0x09f6
        L_0x0932:
            r1 = 100
            if (r11 == 0) goto L_0x09ed
            int r0 = r8.A08(r11)
            if (r0 != r1) goto L_0x09ed
            r3 = 2131887386(0x7f12051a, float:1.9409378E38)
        L_0x093f:
            java.lang.String r8 = r4.A01(r3)
            X.AnonymousClass00C.A0B(r8)
            goto L_0x07cb
        L_0x0948:
            if (r11 == 0) goto L_0x0932
            int r1 = r8.A08(r11)
            r0 = 2
            if (r1 != r0) goto L_0x0932
            r3 = 2131887390(0x7f12051e, float:1.9409386E38)
            goto L_0x093f
        L_0x0955:
            boolean r0 = r6.A1a()
            if (r0 == 0) goto L_0x096f
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x096f
            X.AnonymousClass00C.A0B(r8)
            boolean r0 = X.AnonymousClass6X4.A03(r5, r8)
            r3 = 2131887380(0x7f120514, float:1.9409365E38)
            if (r0 == 0) goto L_0x093f
            r3 = 2131887392(0x7f120520, float:1.940939E38)
            goto L_0x093f
        L_0x096f:
            r3 = 2131887371(0x7f12050b, float:1.9409347E38)
            goto L_0x093f
        L_0x0973:
            java.lang.Object r8 = r1.A00
            X.C18740tg.A06(r8)
            X.5Nh r8 = (X.C107265Nh) r8
            boolean r0 = r6.A1Y()
            if (r0 != 0) goto L_0x09e8
            boolean r0 = r6.A1d()
            if (r0 == 0) goto L_0x0994
            boolean r0 = r8.A0K
            r12 = 2131887391(0x7f12051f, float:1.9409388E38)
        L_0x098b:
            r1 = 2131887397(0x7f120525, float:1.94094E38)
            if (r0 == 0) goto L_0x09f9
            r1 = 2131887396(0x7f120524, float:1.9409398E38)
            goto L_0x09f9
        L_0x0994:
            boolean r0 = r6.A1b()
            if (r0 == 0) goto L_0x09a0
            boolean r0 = r8.A0K
            r12 = 2131887373(0x7f12050d, float:1.9409351E38)
            goto L_0x098b
        L_0x09a0:
            boolean r0 = r6.A1a()
            if (r0 == 0) goto L_0x09cc
            X.3Qa r0 = r6.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x09cc
            X.AnonymousClass00C.A0B(r8)
            boolean r0 = X.AnonymousClass6X4.A03(r5, r8)
            boolean r1 = r8.A0K
            if (r0 != 0) goto L_0x09c2
            r3 = 2131887385(0x7f120519, float:1.9409376E38)
            if (r1 == 0) goto L_0x093f
            r3 = 2131887384(0x7f120518, float:1.9409374E38)
            goto L_0x093f
        L_0x09c0:
            boolean r1 = r1.A0K
        L_0x09c2:
            r3 = 2131887394(0x7f120522, float:1.9409394E38)
            if (r1 == 0) goto L_0x093f
            r3 = 2131887393(0x7f120521, float:1.9409392E38)
            goto L_0x093f
        L_0x09cc:
            java.lang.Object r0 = r1.A00
            X.5Nh r0 = (X.C107265Nh) r0
            if (r0 == 0) goto L_0x09dc
            int r1 = r0.A07
            r0 = 6
            if (r1 != r0) goto L_0x09dc
            r3 = 2131887370(0x7f12050a, float:1.9409345E38)
            goto L_0x093f
        L_0x09dc:
            boolean r0 = r8.A0K
            r3 = 2131887397(0x7f120525, float:1.94094E38)
            if (r0 == 0) goto L_0x093f
            r3 = 2131887396(0x7f120524, float:1.9409398E38)
            goto L_0x093f
        L_0x09e8:
            r3 = 2131887372(0x7f12050c, float:1.940935E38)
            goto L_0x093f
        L_0x09ed:
            int r0 = r8.A07(r9)
            if (r0 != r1) goto L_0x09ff
            r12 = 2131887388(0x7f12051c, float:1.9409382E38)
        L_0x09f6:
            r1 = 2131887371(0x7f12050b, float:1.9409347E38)
        L_0x09f9:
            android.text.SpannableString r8 = X.AnonymousClass6X4.A01(r4, r3, r12, r1)
            goto L_0x07cb
        L_0x09ff:
            int r1 = r8.A07(r9)
            r0 = 5
            if (r1 != r0) goto L_0x0a0a
            r12 = 2131887387(0x7f12051b, float:1.940938E38)
            goto L_0x09f6
        L_0x0a0a:
            if (r10 != 0) goto L_0x0a16
            boolean r0 = r8.A0S(r9)
            if (r0 != 0) goto L_0x0a16
            r12 = 2131887389(0x7f12051d, float:1.9409384E38)
            goto L_0x09f6
        L_0x0a16:
            r0 = 2131887371(0x7f12050b, float:1.9409347E38)
            java.lang.String r9 = X.C36371kC.A0v(r4, r0)
            int r3 = r9.length()
            android.content.Context r1 = r4.A00
            r0 = 2131099972(0x7f060144, float:1.7812312E38)
            int r1 = X.AnonymousClass00F.A00(r1, r0)
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r9)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            r1 = 33
            r8.setSpan(r0, r2, r3, r1)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r7)
            r8.setSpan(r0, r2, r3, r1)
            goto L_0x07cb
        L_0x0a43:
            boolean r0 = r14 instanceof X.AnonymousClass2bT
            if (r0 == 0) goto L_0x0a80
            X.0yC r1 = r13.A0B
            r0 = 5563(0x15bb, float:7.795E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0a69
            r0 = r14
            X.2bT r0 = (X.AnonymousClass2bT) r0
            java.lang.String r2 = r0.A05
            android.content.Context r1 = r13.A01
            r0 = 2131234024(0x7f080ce8, float:1.8084202E38)
            android.graphics.drawable.Drawable r1 = X.C165587tf.A0D(r1, r0)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            com.whatsapp.TextEmojiLabel r0 = r0.A0D
            java.lang.CharSequence r8 = X.C165597tg.A0a(r1, r0, r2)
            goto L_0x0020
        L_0x0a69:
            android.content.Context r2 = r13.A01
        L_0x0a6b:
            r0 = 2131233275(0x7f0809fb, float:1.8082683E38)
            if (r9 == 0) goto L_0x0a73
            r0 = 2131233276(0x7f0809fc, float:1.8082685E38)
        L_0x0a73:
            android.graphics.drawable.Drawable r3 = A0H(r2, r13, r0)
            r0 = 2131888496(0x7f120970, float:1.9411629E38)
            java.lang.String r8 = r2.getString(r0)
            goto L_0x0020
        L_0x0a80:
            boolean r0 = r14 instanceof X.AnonymousClass2bP
            if (r0 == 0) goto L_0x0020
            X.0wG r1 = r13.A08
            r0 = 2131891322(0x7f12147a, float:1.941736E38)
            java.lang.String r8 = r1.A01(r0)
            com.whatsapp.conversationslist.ViewHolder r0 = r13.A06
            android.widget.ImageView r7 = r0.A08
            r7.setVisibility(r2)
            r0 = 2131234209(0x7f080da1, float:1.8084577E38)
            android.content.Context r6 = r13.A01
            android.graphics.drawable.Drawable r0 = X.C165587tf.A0D(r6, r0)
            android.graphics.Bitmap r5 = X.AnonymousClass3UF.A00(r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166177(0x7f0703e1, float:1.7946592E38)
            int r4 = X.C36441kJ.A05(r1, r0)
            android.content.res.Resources r2 = r6.getResources()
            android.content.res.Resources r1 = r6.getResources()
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r5)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A07(r2, r0, r4)
            r7.setImageDrawable(r0)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201679k6.A0P(X.3T1):android.util.Pair");
    }

    public String A0Q(AnonymousClass141 r4, AnonymousClass141 r5, AnonymousClass3T1 r6) {
        int i;
        String A0Q;
        if (r6.A1J.A02) {
            return this.A01.getString(R.string.f12nameremoved);
        }
        if (r5 == null) {
            A0Q = this.A01.getString(R.string.f12nameremoved);
        } else {
            AnonymousClass11F r1 = (AnonymousClass11F) r4.A06(GroupJid.class);
            if (r1 != null) {
                i = this.A05.A09(r1);
            } else {
                i = 1;
            }
            A0Q = this.A05.A0Q(r5, i);
        }
        return C36321k7.A0A(this.A01, A0Q, R.string.f12nameremoved);
    }

    public void A0R() {
        AnonymousClass6C3 r0 = this.A00;
        if (r0 != null) {
            r0.A02();
            this.A00 = null;
        }
    }

    public void A0S(AnonymousClass9XF r7) {
        String string;
        AnonymousClass141 r5 = r7.A04;
        if (r5 == null) {
            string = null;
        } else {
            C19730wQ r4 = r7.A01;
            Context context = r7.A00;
            AnonymousClass171 r2 = r7.A02;
            AnonymousClass141 r1 = r7.A03;
            AnonymousClass11F r0 = r5.A0H;
            if (r0 == null || r4.A0M(r0)) {
                string = context.getString(R.string.f12nameremoved);
            } else {
                string = r2.A0Q(r5, r2.A0A(r1.A0H));
            }
        }
        A0X(string, true);
    }

    public void A0T(AnonymousClass7gQ r15, C34211gd r16, int i, boolean z) {
        View A0I2;
        AnonymousClass5TU r1;
        AnonymousClass11F A012;
        int i2 = i;
        if (this instanceof C175208a1) {
            C175208a1 r4 = (C175208a1) this;
            AnonymousClass16D r5 = r4.A02;
            AnonymousClass3T1 r12 = ((C106445Js) r15).A00;
            AnonymousClass11F r0 = r12.A1J.A00;
            C18740tg.A06(r0);
            AnonymousClass141 A072 = r5.A07(r0);
            AnonymousClass141 r3 = null;
            if (A072 == null || ((A012 = AnonymousClass3TZ.A01(r4.A02, A072, r12)) != null && (r3 = r5.A07(A012)) == null)) {
                C18820ts r9 = r4.A05;
                ViewHolder viewHolder = r4.A06;
                View view = viewHolder.A04;
                Context context = r4.A01;
                AnonymousClass1JZ.A07(view, r9, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, 0, 0);
                viewHolder.A03.setVisibility(8);
                A0N(viewHolder.A0E, viewHolder);
                TextEmojiLabel textEmojiLabel = viewHolder.A0D;
                textEmojiLabel.setVisibility(0);
                C36331k8.A0r(context, textEmojiLabel, R.color.f6nameremoved);
                textEmojiLabel.A0C();
                C36391kE.A1K(textEmojiLabel);
                textEmojiLabel.setPlaceholder(80);
                viewHolder.A0G.A05();
                C175308aB r32 = new C175308aB(r4.A02, r5, r12);
                r4.A00 = r32;
                r4.A03.A00(new C23169B8d(r4, 0), r32);
            } else {
                C175208a1.A00(new AnonymousClass9K1(A072, r3, r12), r4);
            }
        } else {
            C175218a2 r7 = (C175218a2) this;
            AnonymousClass141 r6 = ((C106455Jt) r15).A00;
            AnonymousClass11F A0G2 = C36331k8.A0G(r6);
            ViewHolder viewHolder2 = r7.A06;
            viewHolder2.A04.setPadding(0, 0, 0, 0);
            AnonymousClass1RY r02 = r7.A02;
            ImageView imageView = viewHolder2.A07;
            r02.A08(imageView, r6);
            if (!(A0G2 instanceof AnonymousClass146)) {
                imageView.setEnabled(true);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("com.whatsapp.conversationslist.ConversationsFragment");
                C011004s.A08(imageView, AnonymousClass000.A0q(AnonymousClass143.A03(A0G2), A0u));
                AnonymousClass3YL r11 = new AnonymousClass3YL(r7, i2, 5, A0G2);
                AnonymousClass3YG r13 = new AnonymousClass3YG(r7, A0G2, 3);
                C207399v9 r03 = new C207399v9(r7, A0G2);
                imageView.setOnClickListener(r11);
                A0I2 = A0I(r13, r03, imageView, viewHolder2);
                A0I2.setOnClickListener(r11);
                A0I2.setOnLongClickListener(r03);
                if (imageView instanceof WDSProfilePhoto) {
                    C61953Ed r14 = r7.A00;
                    WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) imageView;
                    boolean A032 = AnonymousClass3TM.A03(r14, false);
                    wDSProfilePhoto.setStatusIndicatorEnabled(A032);
                    if (A032) {
                        if (r14.A01 > 0) {
                            r1 = AnonymousClass5TU.UNSEEN;
                        } else {
                            r1 = AnonymousClass5TU.SEEN;
                        }
                        wDSProfilePhoto.setProfileStatus(new AnonymousClass5QJ(r1));
                    }
                }
            } else {
                AnonymousClass3YG r04 = new AnonymousClass3YG(r7, A0G2, 4);
                imageView.setEnabled(false);
                imageView.setOnClickListener(r04);
                A0I2 = A0I(r04, (View.OnLongClickListener) null, imageView, viewHolder2);
                A0I2.setOnClickListener(r04);
                A0I2.setOnLongClickListener((View.OnLongClickListener) null);
            }
            viewHolder2.A0J(false, false);
            A0I2.setVisibility(0);
            TextEmojiLabel textEmojiLabel2 = viewHolder2.A0D;
            textEmojiLabel2.setVisibility(0);
            viewHolder2.A0E.setVisibility(8);
            viewHolder2.A0R.A03(8);
            AnonymousClass1RJ r17 = viewHolder2.A0T;
            AnonymousClass1CR r05 = r7.A05;
            C18740tg.A06(A0G2);
            r17.A03(C36351kA.A00(r05.A0k(A0G2) ? 1 : 0));
            viewHolder2.A0A.setVisibility(8);
            ImageView imageView2 = viewHolder2.A09;
            imageView2.setVisibility(8);
            ImageView imageView3 = viewHolder2.A08;
            imageView3.setVisibility(8);
            viewHolder2.A0U.A03(8);
            imageView2.setVisibility(8);
            imageView3.setVisibility(8);
            viewHolder2.A0M.A03(8);
            viewHolder2.A0S.A03(8);
            Context context2 = r7.A01;
            C36331k8.A0r(context2, textEmojiLabel2, R.color.f6nameremoved);
            textEmojiLabel2.A0C();
            textEmojiLabel2.setPlaceholder(0);
            C200229gu r42 = viewHolder2.A0G;
            int A002 = AnonymousClass00F.A00(context2, R.color.f6nameremoved);
            ConversationListRowHeaderView conversationListRowHeaderView = r42.A03;
            conversationListRowHeaderView.A01.setTextColor(A002);
            r42.A06(r6, r7.A0H, r7.A03.BFy());
            r42.A04.A0B(r6);
            if (r7.A06) {
                textEmojiLabel2.setVisibility(8);
                conversationListRowHeaderView.A01.setVisibility(8);
            } else {
                String str = r6.A0X;
                if (str == null) {
                    str = "";
                }
                textEmojiLabel2.A0I(str);
                textEmojiLabel2.setVisibility(0);
                conversationListRowHeaderView.A01.setVisibility(0);
                String A022 = AnonymousClass171.A02(context2, r7.A04, r6);
                if (A022 != null) {
                    r42.A09(A022, (CharSequence) null);
                }
            }
        }
        C34211gd r06 = r16;
        if (r16 != null) {
            r06.Bfd(i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0163, code lost:
        if (r1 != false) goto L_0x0165;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(X.AnonymousClass141 r24, X.AnonymousClass141 r25, X.AnonymousClass141 r26, X.AnonymousClass3T1 r27, X.AnonymousClass35M r28, java.util.List r29, int r30) {
        /*
            r23 = this;
            r22 = r26
            r8 = r23
            X.0yC r10 = r8.A0B
            r9 = r27
            boolean r0 = X.AnonymousClass3T9.A03(r10, r9)
            r11 = r25
            if (r0 == 0) goto L_0x0016
            r0 = r22
            r8.A0V(r11, r0, r9)
        L_0x0015:
            return
        L_0x0016:
            com.whatsapp.conversationslist.ViewHolder r7 = r8.A06
            X.1RJ r0 = r7.A0U
            r13 = 8
            r0.A03(r13)
            android.widget.ImageView r6 = r7.A09
            r5 = 0
            r6.setVisibility(r5)
            X.1RJ r14 = r7.A0X
            r14.A03(r13)
            android.widget.ImageView r4 = r7.A08
            r4.setVisibility(r13)
            X.1RJ r0 = r7.A0S
            r0.A03(r13)
            android.content.Context r3 = r8.A01
            X.C18740tg.A06(r3)
            r12 = 0
            r4.setBackground(r12)
            java.lang.String r0 = ""
            r15 = 1
            if (r27 == 0) goto L_0x0077
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r1 = r9.A1T(r1)
            if (r1 == 0) goto L_0x0077
            boolean r1 = X.C36401kF.A1Z(r10)
            if (r1 == 0) goto L_0x0077
            r4.setVisibility(r13)
            r1 = r22
            java.lang.String r2 = r8.A0Q(r11, r1, r9)
            r14 = r0
            r21 = 0
        L_0x005c:
            r20 = r29
            r18 = r22
            r19 = r9
            r16 = r8
            r17 = r11
            r16.A0W(r17, r18, r19, r20, r21)
            r1 = r30 & 1
            if (r1 == 0) goto L_0x01ab
            r1 = 4659(0x1233, float:6.529E-42)
            boolean r1 = r10.A0E(r1)
            if (r1 == 0) goto L_0x01ab
            goto L_0x0192
        L_0x0077:
            boolean r1 = r11.A0G()
            if (r1 == 0) goto L_0x00a7
            X.1EL r1 = r8.A0D
            boolean r1 = r1.A01(r11)
            if (r1 == 0) goto L_0x00a7
            r1 = 3180(0xc6c, float:4.456E-42)
            boolean r1 = r10.A0E(r1)
            if (r1 == 0) goto L_0x00a7
            r1 = 2131894756(0x7f1221e4, float:1.9424326E38)
            java.lang.String r2 = r3.getString(r1)
            r1 = 2131233221(0x7f0809c5, float:1.8082573E38)
            android.graphics.drawable.Drawable r1 = X.C165587tf.A0D(r3, r1)
            r4.setVisibility(r5)
            r4.setImageDrawable(r1)
            r14 = r0
            r21 = 1
            r22 = r12
            goto L_0x005c
        L_0x00a7:
            X.1NG r2 = r8.A03
            X.11F r1 = r11.A0H
            boolean r1 = X.C36351kA.A1X(r2, r1)
            if (r1 == 0) goto L_0x00e4
            X.0xf r2 = r8.A0C
            X.11F r1 = r11.A0H
            boolean r1 = X.AnonymousClass3M3.A01(r2, r1)
            if (r1 == 0) goto L_0x00c9
            r1 = 2131896083(0x7f122713, float:1.9427017E38)
            java.lang.String r2 = X.C44122Lf.A02(r3, r1)
        L_0x00c2:
            r6.setVisibility(r13)
        L_0x00c5:
            r14 = r0
            r21 = 1
            goto L_0x005c
        L_0x00c9:
            boolean r1 = r11.A0E()
            if (r1 == 0) goto L_0x00d7
            r2 = 2131886920(0x7f120348, float:1.9408432E38)
        L_0x00d2:
            java.lang.String r2 = r3.getString(r2)
            goto L_0x00c2
        L_0x00d7:
            boolean r1 = r11.A0C()
            r2 = 2131886925(0x7f12034d, float:1.9408443E38)
            if (r1 == 0) goto L_0x00d2
            r2 = 2131886922(0x7f12034a, float:1.9408437E38)
            goto L_0x00d2
        L_0x00e4:
            if (r27 == 0) goto L_0x0183
            android.util.Pair r0 = r8.A0P(r9)
            java.lang.Object r2 = r0.second
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0 = r28
            boolean r1 = X.AnonymousClass3TK.A03(r9, r0)
            if (r1 == 0) goto L_0x016d
            X.6C3 r1 = r8.A00
            if (r1 == 0) goto L_0x00fd
            r1.A02()
        L_0x00fd:
            X.3T1 r1 = r0.A00
            android.util.Pair r16 = r8.A0P(r1)
            r4.setVisibility(r13)
            r6.setVisibility(r13)
            boolean r2 = r11.A0G()
            X.2bM r1 = r0.A01
            X.3Qa r1 = r1.A1J
            boolean r1 = r1.A02
            if (r2 == 0) goto L_0x0163
            if (r1 != 0) goto L_0x0165
            r2 = r24
            if (r24 == 0) goto L_0x0127
            X.171 r12 = r8.A05
            X.11F r1 = r11.A0H
            int r1 = r12.A09(r1)
            java.lang.String r12 = r12.A0Q(r2, r1)
        L_0x0127:
            X.C18740tg.A06(r0)
            X.0wG r2 = r8.A08
            com.whatsapp.TextEmojiLabel r1 = r7.A0D
            r17 = r1
            r18 = r2
            r19 = r10
            r20 = r0
            r21 = r12
            android.text.SpannableString r2 = X.AnonymousClass3TK.A00(r16, r17, r18, r19, r20, r21)
            boolean r16 = X.AnonymousClass000.A1V(r2)
            r21 = r16 ^ 1
        L_0x0142:
            X.0wo r12 = r8.A07
            X.0ts r13 = r8.A09
            long r0 = r9.A0I
            long r0 = r12.A08(r0)
            java.lang.String r14 = X.AnonymousClass3UY.A0F(r13, r0, r5)
            long r0 = r9.A0I
            long r0 = r12.A08(r0)
            java.lang.String r0 = X.AnonymousClass3UY.A0F(r13, r0, r15)
            if (r16 == 0) goto L_0x0189
            r1 = 8
            r6.setVisibility(r1)
            goto L_0x005c
        L_0x0163:
            if (r1 == 0) goto L_0x0127
        L_0x0165:
            r1 = 2131890321(0x7f121091, float:1.941533E38)
            java.lang.String r12 = r3.getString(r1)
            goto L_0x0127
        L_0x016d:
            X.3T1 r0 = r9.A0S()
            if (r0 == 0) goto L_0x017e
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x017e
            r14.A03(r5)
        L_0x017e:
            r16 = 0
            r21 = 1
            goto L_0x0142
        L_0x0183:
            r6.setVisibility(r13)
            r2 = r0
            goto L_0x00c5
        L_0x0189:
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3T9.A00(r3, r12, r9)
            r6.setImageDrawable(r1)
            goto L_0x005c
        L_0x0192:
            java.lang.CharSequence r2 = X.AnonymousClass6YV.A0A(r2)     // Catch:{ all -> 0x0197 }
            goto L_0x01ab
        L_0x0197:
            r10 = move-exception
            X.1NG r1 = r8.A03
            X.0wN r6 = r1.A01
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "remove rich format "
            java.lang.String r3 = X.C36331k8.A0i(r1, r3, r10)
            java.lang.String r1 = "BaseViewFiller/fillMessage"
            r6.A0E(r1, r3, r15)
        L_0x01ab:
            com.whatsapp.TextEmojiLabel r15 = r7.A0D
            X.1Rx r1 = r8.A0L
            java.util.List r18 = r1.BFy()
            X.3Tl r6 = r8.A0H
            if (r27 == 0) goto L_0x01bd
            int r3 = r9.A0D
            r1 = 6
            if (r3 == r1) goto L_0x01bd
            r5 = 1
        L_0x01bd:
            r19 = 150(0x96, float:2.1E-43)
            r16 = r6
            r17 = r2
            r20 = r5
            r15.A0H(r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = X.C18750th.A03
            X.9gu r1 = r7.A0G
            r1.A09(r14, r0)
            X.6C3 r0 = r8.A00
            if (r0 == 0) goto L_0x0015
            android.graphics.drawable.Drawable r0 = r4.getDrawable()
            boolean r0 = r0 instanceof X.AnonymousClass0BQ
            if (r0 != 0) goto L_0x0015
            X.6C3 r0 = r8.A00
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201679k6.A0U(X.141, X.141, X.141, X.3T1, X.35M, java.util.List, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r10v1, types: [X.8aG] */
    /* JADX WARNING: type inference failed for: r10v2, types: [X.8aI] */
    /* JADX WARNING: type inference failed for: r10v3, types: [X.8aH] */
    /* JADX WARNING: type inference failed for: r10v6, types: [X.8aF] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0V(X.AnonymousClass141 r27, X.AnonymousClass141 r28, X.AnonymousClass3T1 r29) {
        /*
            r26 = this;
            r1 = r26
            X.0wo r14 = r1.A07
            android.content.Context r11 = r1.A01
            X.1Sj r3 = r1.A0O
            X.0wQ r12 = r1.A02
            X.171 r13 = r1.A05
            X.1T1 r4 = r1.A0K
            r0 = 0
            X.AnonymousClass00C.A0D(r14, r0)
            X.C36321k7.A1B(r11, r3, r12, r13, r4)
            r0 = 6
            r2 = r29
            X.AnonymousClass00C.A0D(r2, r0)
            boolean r0 = r2 instanceof X.AnonymousClass2bV
            r15 = r27
            r16 = r28
            if (r0 == 0) goto L_0x0138
            r0 = r2
            X.2bV r0 = (X.AnonymousClass2bV) r0
            X.8aF r10 = new X.8aF
            r18 = r0
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x002f:
            com.whatsapp.conversationslist.ViewHolder r6 = r1.A06
            com.whatsapp.TextEmojiLabel r15 = r6.A0D
            boolean r0 = r10 instanceof X.C175388aJ
            if (r0 == 0) goto L_0x0110
            r5 = r10
            X.8aJ r5 = (X.C175388aJ) r5
            boolean r0 = r5 instanceof X.C175378aI
            if (r0 == 0) goto L_0x00d3
            android.content.Context r3 = r5.A00
            X.3T1 r7 = r5.A05
            r0 = r7
            X.8o3 r0 = (X.C181798o3) r0
            java.lang.String r8 = X.AnonymousClass3T9.A02(r3, r0)
        L_0x0049:
            if (r8 != 0) goto L_0x00ba
            r8 = 0
        L_0x004c:
            X.1Rx r0 = r1.A0L
            java.util.List r18 = r0.BFy()
            X.3Tl r5 = r1.A0H
            r3 = 0
            int r4 = r2.A0D
            r0 = 6
            boolean r20 = X.C36381kD.A1U(r4, r0)
            r19 = 150(0x96, float:2.1E-43)
            r17 = r8
            r16 = r5
            r15.A0H(r16, r17, r18, r19, r20)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass3T9.A00(r11, r14, r2)
            android.widget.ImageView r0 = r6.A09
            r0.setImageDrawable(r2)
            boolean r0 = r10 instanceof X.C175378aI
            if (r0 == 0) goto L_0x0095
            android.content.Context r4 = r10.A00
            boolean r2 = X.C222013h.A07
            r0 = 2131233278(0x7f0809fe, float:1.8082689E38)
            if (r2 == 0) goto L_0x007e
            r0 = 2131233279(0x7f0809ff, float:1.808269E38)
        L_0x007e:
            android.graphics.drawable.Drawable r2 = X.C165587tf.A0D(r4, r0)
        L_0x0082:
            X.AnonymousClass00C.A08(r2)
        L_0x0085:
            android.widget.ImageView r0 = r6.A08
            r0.setImageDrawable(r2)
            if (r2 != 0) goto L_0x008e
            r3 = 8
        L_0x008e:
            r0.setVisibility(r3)
            r1.A0S(r10)
            return
        L_0x0095:
            boolean r0 = r10 instanceof X.C175368aH
            if (r0 == 0) goto L_0x00aa
            android.content.Context r4 = r10.A00
            boolean r2 = X.C222013h.A07
            r0 = 2131233240(0x7f0809d8, float:1.8082612E38)
            if (r2 == 0) goto L_0x00a5
            r0 = 2131233241(0x7f0809d9, float:1.8082614E38)
        L_0x00a5:
            android.graphics.drawable.Drawable r2 = X.C165587tf.A0D(r4, r0)
            goto L_0x0082
        L_0x00aa:
            boolean r0 = r10 instanceof X.C175358aG
            if (r0 == 0) goto L_0x00b8
            android.content.Context r2 = r10.A00
            r0 = 2131233234(0x7f0809d2, float:1.80826E38)
            android.graphics.drawable.Drawable r2 = X.C165587tf.A0D(r2, r0)
            goto L_0x0082
        L_0x00b8:
            r2 = 0
            goto L_0x0085
        L_0x00ba:
            android.content.Context r9 = r5.A00
            X.1Sj r5 = r5.A00
            java.util.List r0 = r7.A0w
            if (r0 == 0) goto L_0x004c
            android.text.SpannableStringBuilder r8 = X.C36441kJ.A0P(r8)
            java.util.List r4 = r7.A0w
            r3 = 0
            X.4a3 r0 = new X.4a3
            r0.<init>(r9, r3)
            r5.A05(r8, r0, r4)
            goto L_0x004c
        L_0x00d3:
            boolean r0 = r5 instanceof X.C175368aH
            if (r0 == 0) goto L_0x00e4
            android.content.Context r3 = r5.A00
            X.3T1 r7 = r5.A05
            r0 = r7
            X.2bp r0 = (X.C46882bp) r0
            java.lang.String r8 = X.AnonymousClass3T9.A01(r3, r0)
            goto L_0x0049
        L_0x00e4:
            boolean r0 = r5 instanceof X.C175358aG
            if (r0 == 0) goto L_0x0108
            android.content.Context r4 = r5.A00
            X.3T1 r7 = r5.A05
            r3 = r7
            X.2bU r3 = (X.AnonymousClass2bU) r3
            java.lang.String r0 = r3.A1a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0102
            r0 = 2131888477(0x7f12095d, float:1.941159E38)
            java.lang.String r8 = r4.getString(r0)
            goto L_0x0049
        L_0x0102:
            java.lang.String r8 = r3.A1a()
            goto L_0x0049
        L_0x0108:
            X.3T1 r7 = r5.A05
            java.lang.String r8 = r7.A0b()
            goto L_0x0049
        L_0x0110:
            r0 = r10
            X.8aE r0 = (X.C175338aE) r0
            android.content.Context r8 = r0.A00
            X.3T1 r7 = r0.A05
            X.2bI r7 = (X.AnonymousClass2bI) r7
            X.1T1 r5 = r0.A00
            int r4 = r7.A00
            r0 = 3
            r3 = 2131890097(0x7f120fb1, float:1.9414876E38)
            if (r4 == r0) goto L_0x0133
            r0 = 2
            r3 = 2131890098(0x7f120fb2, float:1.9414878E38)
            if (r4 == r0) goto L_0x0133
            r0 = 0
            java.lang.String r8 = r5.A0O(r7, r0)
        L_0x012e:
            X.AnonymousClass00C.A08(r8)
            goto L_0x004c
        L_0x0133:
            java.lang.String r8 = r8.getString(r3)
            goto L_0x012e
        L_0x0138:
            boolean r0 = r2 instanceof X.AnonymousClass2bI
            if (r0 == 0) goto L_0x0158
            r0 = r2
            X.2bI r0 = (X.AnonymousClass2bI) r0
            X.8aE r10 = new X.8aE
            r17 = r10
            r18 = r11
            r19 = r12
            r20 = r4
            r21 = r13
            r22 = r14
            r23 = r15
            r24 = r16
            r25 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x002f
        L_0x0158:
            boolean r0 = r2 instanceof X.C46882bp
            if (r0 == 0) goto L_0x016a
            r0 = r2
            X.2bp r0 = (X.C46882bp) r0
            X.8aH r10 = new X.8aH
            r18 = r0
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x002f
        L_0x016a:
            boolean r0 = r2 instanceof X.C181798o3
            if (r0 == 0) goto L_0x017c
            r0 = r2
            X.8o3 r0 = (X.C181798o3) r0
            X.8aI r10 = new X.8aI
            r18 = r0
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x002f
        L_0x017c:
            boolean r0 = r2 instanceof X.C181788o2
            if (r0 == 0) goto L_0x018e
            r0 = r2
            X.8o2 r0 = (X.C181788o2) r0
            X.8aG r10 = new X.8aG
            r18 = r0
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x002f
        L_0x018e:
            r10 = 0
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201679k6.A0V(X.141, X.141, X.3T1):void");
    }

    public void A0W(AnonymousClass141 r5, AnonymousClass141 r6, AnonymousClass3T1 r7, List list, boolean z) {
        String str;
        if (r6 == null || !z) {
            str = null;
        } else {
            C19730wQ r3 = this.A02;
            Context context = this.A01;
            AnonymousClass171 r1 = this.A05;
            AnonymousClass11F r0 = r6.A0H;
            if (r0 == null || r3.A0M(r0)) {
                str = context.getString(R.string.f12nameremoved);
            } else {
                str = r1.A0Q(r6, r1.A0A(r5.A0H));
            }
        }
        A0X(str, true);
    }

    public void A0X(CharSequence charSequence, boolean z) {
        StringBuilder A0u;
        ViewHolder viewHolder = this.A06;
        viewHolder.A0W.A03(8);
        if (TextUtils.isEmpty(charSequence)) {
            viewHolder.A0E.setVisibility(8);
            return;
        }
        if (z) {
            if (C36351kA.A1Y(this.A09) == AnonymousClass1JZ.A0C(charSequence)) {
                A0u = C36381kD.A11(charSequence);
                A0u.append(": ");
            } else {
                A0u = AnonymousClass000.A0u();
                A0u.append(" :");
                A0u.append(charSequence);
            }
            charSequence = A0u.toString();
        }
        TextEmojiLabel textEmojiLabel = viewHolder.A0E;
        textEmojiLabel.A0I(charSequence);
        textEmojiLabel.setVisibility(0);
    }

    public C201679k6(Context context, C19730wQ r3, AnonymousClass1T1 r4, AnonymousClass1NG r5, AnonymousClass16D r6, AnonymousClass171 r7, C28251Rx r8, ViewHolder viewHolder, C21060yb r10, C19970wo r11, C19630wG r12, C18820ts r13, C220412q r14, AnonymousClass165 r15, C20810yC r16, C20500xf r17, AnonymousClass1EL r18, C28371Sj r19, AnonymousClass1EV r20, AnonymousClass1EU r21, AnonymousClass1FR r22, AnonymousClass1AW r23, AnonymousClass1EM r24, C65783Tl r25, AnonymousClass005 r26) {
        this.A06 = viewHolder;
        this.A01 = context;
        this.A07 = r11;
        this.A0B = r16;
        this.A0O = r19;
        this.A02 = r3;
        this.A08 = r12;
        this.A0A = r14;
        this.A0C = r17;
        this.A0G = r22;
        this.A04 = r6;
        this.A0N = r15;
        this.A0M = r10;
        this.A05 = r7;
        this.A09 = r13;
        this.A0P = r24;
        this.A0F = r21;
        this.A0H = r25;
        this.A03 = r5;
        this.A0D = r18;
        this.A0E = r20;
        this.A0K = r4;
        this.A0L = r8;
        this.A0J = r23;
        this.A0I = r26;
    }

    public static Drawable A0G(Context context, ImageView imageView, AnonymousClass4TX r5) {
        Drawable drawable = null;
        if (r5.BJ8() != 1) {
            drawable = C165587tf.A0D(context, R.drawable.msg_status_viewonce_one);
        }
        imageView.setImageDrawable(drawable);
        Drawable A0D2 = C165587tf.A0D(context, R.drawable.msg_status_ephemeral_ring);
        imageView.setBackground(A0D2);
        imageView.setVisibility(0);
        return A0D2;
    }

    public static View A0I(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, View view, ViewHolder viewHolder) {
        view.setOnLongClickListener(onLongClickListener);
        View view2 = viewHolder.A0H;
        view2.setOnClickListener(onClickListener);
        view2.setOnLongClickListener(onLongClickListener);
        return viewHolder.A03;
    }

    public static AnonymousClass5TY A0K(Resources resources, ViewHolder viewHolder, int i, int i2, int i3) {
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        C34081gQ.A05(viewHolder.A03, i2, dimensionPixelSize);
        viewHolder.A0Q.A04(dimensionPixelSize2, dimensionPixelSize2);
        viewHolder.A0T.A04(dimensionPixelSize2, dimensionPixelSize2);
        viewHolder.A0R.A04(dimensionPixelSize2, dimensionPixelSize2);
        AnonymousClass5TY r1 = AnonymousClass5TY.SMALL;
        if (i3 == resources.getDimensionPixelSize(r1.dimension)) {
            return r1;
        }
        return AnonymousClass5TY.MEDIUM;
    }

    public static String A0L(Context context, AnonymousClass4TX r3) {
        int i;
        int BJ8 = r3.BJ8();
        if (BJ8 != 0) {
            if (BJ8 == 1) {
                i = R.string.f12nameremoved;
                return context.getString(i);
            } else if (BJ8 != 2) {
                throw AnonymousClass001.A09("unhandled view once state");
            }
        }
        if (r3 instanceof C46892bq) {
            i = R.string.f12nameremoved;
        } else if (r3 instanceof C47012ca) {
            i = R.string.f12nameremoved;
        } else {
            boolean z = r3 instanceof C46802bh;
            i = R.string.f12nameremoved;
            if (z) {
                i = R.string.f12nameremoved;
            }
        }
        return context.getString(i);
    }

    public static void A0O(ImageView imageView, C18820ts r3, AnonymousClass1RJ r4) {
        imageView.setImageDrawable(new C100744vb(C013105r.A01(r4.A01().getContext(), R.drawable.vec_ic_right_triangle), r3));
    }
}
