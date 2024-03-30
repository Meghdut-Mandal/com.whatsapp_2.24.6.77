package com.whatsapp.group.newgroup;

import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass00I;
import X.AnonymousClass00S;
import X.AnonymousClass01P;
import X.AnonymousClass04S;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass146;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass16K;
import X.AnonymousClass171;
import X.AnonymousClass190;
import X.AnonymousClass19A;
import X.AnonymousClass1H2;
import X.AnonymousClass1JZ;
import X.AnonymousClass1LV;
import X.AnonymousClass1LX;
import X.AnonymousClass1N2;
import X.AnonymousClass1N6;
import X.AnonymousClass1O7;
import X.AnonymousClass1P3;
import X.AnonymousClass1RY;
import X.AnonymousClass1XN;
import X.AnonymousClass22V;
import X.AnonymousClass22t;
import X.AnonymousClass2A6;
import X.AnonymousClass2PZ;
import X.AnonymousClass2gA;
import X.AnonymousClass3B9;
import X.AnonymousClass3FK;
import X.AnonymousClass3HU;
import X.AnonymousClass3IS;
import X.AnonymousClass3LW;
import X.AnonymousClass3TD;
import X.AnonymousClass4QY;
import X.AnonymousClass4QZ;
import X.AnonymousClass4YE;
import X.AnonymousClass6O1;
import X.C006302t;
import X.C009504a;
import X.C009904e;
import X.C012005e;
import X.C03570Gk;
import X.C1261362r;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19890wg;
import X.C19970wo;
import X.C20310xM;
import X.C20350xQ;
import X.C20380xT;
import X.C20810yC;
import X.C21010yW;
import X.C21060yb;
import X.C21100yf;
import X.C220412q;
import X.C224514j;
import X.C235518x;
import X.C238019x;
import X.C24381Cf;
import X.C24521Ct;
import X.C27731Pn;
import X.C27761Ps;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C40241vB;
import X.C40611vp;
import X.C40921wK;
import X.C41191wo;
import X.C42741zP;
import X.C44112Le;
import X.C46192Vk;
import X.C62383Fy;
import X.C63253Ji;
import X.C63883Lu;
import X.C65673Ta;
import X.C66763Xf;
import X.C76873pa;
import X.C80253v6;
import X.C88314Sf;
import X.C89334Wd;
import X.C89604Xe;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.collections.AutoFitGridLayoutManager;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.ephemeral.ChangeEphemeralSettingsDialog;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class NewGroup extends AnonymousClass155 implements AnonymousClass4QZ, AnonymousClass4QY {
    public int A00;
    public Bundle A01;
    public Bundle A02;
    public Bundle A03;
    public ImageView A04;
    public TextView A05;
    public AnonymousClass00I A06;
    public RecyclerView A07;
    public WaEditText A08;
    public WaEditText A09;
    public AnonymousClass1LV A0A;
    public AnonymousClass16D A0B;
    public AnonymousClass171 A0C;
    public AnonymousClass16K A0D;
    public AnonymousClass1O7 A0E;
    public AnonymousClass1RY A0F;
    public C27731Pn A0G;
    public C27761Ps A0H;
    public C220412q A0I;
    public C24381Cf A0J;
    public C20310xM A0K;
    public C235518x A0L;
    public AnonymousClass22t A0M;
    public C1261362r A0N;
    public AnonymousClass6O1 A0O;
    public AnonymousClass1XN A0P;
    public EmojiSearchProvider A0Q;
    public C62383Fy A0R;
    public C21010yW A0S;
    public C20350xQ A0T;
    public C40921wK A0U;
    public AnonymousClass190 A0V;
    public AnonymousClass147 A0W;
    public AnonymousClass19A A0X;
    public AnonymousClass1LX A0Y;
    public C19890wg A0Z;
    public AnonymousClass1P3 A0a;
    public C238019x A0b;
    public C20380xT A0c;
    public AnonymousClass1N6 A0d;
    public C32681e1 A0e;
    public Integer A0f;
    public String A0g;
    public List A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public int A0l;
    public KeyboardPopupLayout A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public final C009904e A0q;
    public final C88314Sf A0r;
    public final AnonymousClass141 A0s;
    public final AtomicReference A0t;
    public final AnonymousClass00S A0u;
    public final C006302t A0v;
    public final C24521Ct A0w;

    public boolean A2g() {
        return true;
    }

    private Bundle A01() {
        if (this.A0W == null || !this.A0D.A0E(7180)) {
            Bundle A072 = AnonymousClass001.A07();
            A072.putBoolean("add_other_participants", true);
            A072.putBoolean("send_messages", true);
            A072.putBoolean("edit_group_info", true);
            A072.putBoolean("require_membership_approval", false);
            return A072;
        }
        Bundle A073 = AnonymousClass001.A07();
        if (this.A0D.A0E(7608)) {
            A073.putBoolean("add_other_participants", true);
        } else {
            A073.putBoolean("add_other_participants", false);
        }
        A073.putBoolean("send_messages", true);
        A073.putBoolean("edit_group_info", true);
        A073.putBoolean("require_membership_approval", false);
        return A073;
    }

    public static File A07(NewGroup newGroup) {
        File A002 = newGroup.A0D.A00(newGroup.A0s);
        if (A002 == null || !A002.exists()) {
            return null;
        }
        return A002;
    }

    private void A0F(int i) {
        this.A00 = i;
        AnonymousClass22V r2 = (AnonymousClass22V) C03570Gk.A0B(this, R.id.group_ephemeral_duration_row_view);
        int i2 = R.color.f6nameremoved;
        if (i > 0) {
            i2 = C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved);
        }
        r2.setIconColor(AnonymousClass00F.A00(this, i2));
        r2.setDescription((CharSequence) AnonymousClass3TD.A01(this, i, false, false));
        r2.setVisibility(0);
    }

    private void A0G(WaEditText waEditText, int i, int i2, int i3) {
        AnonymousClass1JZ.A09(waEditText, this.A00);
        int i4 = i2;
        waEditText.setFilters(new InputFilter[]{new C66763Xf(i4)});
        AnonymousClass1H2 r7 = this.A0C;
        C21060yb r4 = this.A08;
        C18820ts r5 = this.A00;
        C19890wg r8 = this.A0Z;
        waEditText.addTextChangedListener(new AnonymousClass2gA(waEditText, C36401kF.A0H(this, i), r4, r5, this.A0B, r7, r8, i4, i3, false, false, false));
    }

    public static void A0H(NewGroup newGroup) {
        C40921wK r7 = newGroup.A0U;
        ArrayList A0I2 = AnonymousClass001.A0I();
        if (newGroup.A0k) {
            A0I2.add(new AnonymousClass3IS(1, new AnonymousClass3HU(newGroup.A0u)));
        }
        Iterator it = newGroup.A0h.iterator();
        while (it.hasNext()) {
            A0I2.add(new AnonymousClass3IS(2, new C63253Ji(newGroup.A0F, C36391kE.A0f(it), newGroup.A0v, newGroup.A0k)));
        }
        ArrayList A0I3 = AnonymousClass001.A0I();
        A0I3.addAll(A0I2);
        List list = r7.A00;
        C36341k9.A1A(new C40241vB(list, A0I3), r7, A0I3, list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0I(com.whatsapp.group.newgroup.NewGroup r6) {
        /*
            java.util.List r0 = r6.A0h
            int r5 = r0.size()
            if (r5 != 0) goto L_0x0021
            X.0yC r1 = r6.A0D
            r0 = 3966(0xf7e, float:5.558E-42)
            boolean r0 = r1.A0E(r0)
            android.widget.TextView r1 = r6.A05
            if (r0 == 0) goto L_0x001b
            r0 = 2131891301(0x7f121465, float:1.9417318E38)
            r1.setText(r0)
            return
        L_0x001b:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0021:
            java.util.concurrent.atomic.AtomicReference r1 = r6.A0t
            java.lang.Object r0 = r1.get()
            r4 = 0
            if (r0 == 0) goto L_0x0062
            X.0xQ r2 = r6.A0T
            java.lang.Object r1 = r1.get()
            X.147 r1 = (X.AnonymousClass147) r1
            X.16D r0 = r2.A0C
            X.141 r0 = r0.A0A(r1)
            if (r0 == 0) goto L_0x0062
            X.17X r0 = r2.A0U
            int r0 = r0.A01(r1)
            int r3 = r0 + -1
        L_0x0042:
            r2 = 1
            if (r3 <= 0) goto L_0x0059
            r1 = 2131891300(0x7f121464, float:1.9417316E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0M()
            X.C36331k8.A1X(r0, r5, r4, r3, r2)
        L_0x004f:
            java.lang.String r1 = r6.getString(r1, r0)
            android.widget.TextView r0 = r6.A05
            r0.setText(r1)
            return
        L_0x0059:
            r1 = 2131891299(0x7f121463, float:1.9417314E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            X.AnonymousClass000.A1L(r0, r5, r4)
            goto L_0x004f
        L_0x0062:
            r3 = 0
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.newgroup.NewGroup.A0I(com.whatsapp.group.newgroup.NewGroup):void");
    }

    private void A0K(String str, List list, boolean z) {
        String stringExtra;
        AnonymousClass147 A062 = AnonymousClass147.A01.A06(str);
        this.A0W = A062;
        if (A062 != null) {
            stringExtra = this.A0I.A0D(A062);
        } else {
            stringExtra = getIntent().getStringExtra("community_name");
        }
        this.A0g = stringExtra;
        ArrayList A063 = AnonymousClass143.A06(UserJid.class, list);
        this.A05 = C36401kF.A0H(this, R.id.selected_header);
        this.A07 = (RecyclerView) C03570Gk.A0B(this, R.id.selected_items);
        this.A0h = C36401kF.A0v(A063);
        if (!A063.isEmpty()) {
            Iterator it = A063.iterator();
            while (it.hasNext()) {
                this.A0h.add(this.A0B.A0D(C36401kF.A0a(it)));
            }
        }
        A0I(this);
        C012005e.A0a(this.A05, true);
        this.A0U = new C40921wK();
        A0H(this);
        this.A07.setItemAnimator(new C42741zP());
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new AutoFitGridLayoutManager(getBaseContext(), getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
        }
        this.A07.A0t(new C41191wo(this));
        this.A07.setAdapter(this.A0U);
        this.A0o = z;
    }

    private boolean A0L() {
        int size = this.A0h.size();
        if (this.A0j || this.A0n || this.A0o || size <= 0 || size > this.A0D.A07(4118)) {
            return false;
        }
        return true;
    }

    public void A2F() {
        if (!this.A0p) {
            this.A0p = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0e = C36351kA.A0p(r1);
            this.A0V = C36351kA.A0h(A0B2);
            this.A0I = C36351kA.A0a(A0B2);
            this.A0S = C36351kA.A0g(A0B2);
            this.A0P = C36351kA.A0d(A0B2);
            this.A0G = C36351kA.A0T(A0B2);
            this.A0X = C36361kB.A0c(A0B2);
            this.A0B = C36341k9.A0R(A0B2);
            this.A0c = C36331k8.A0I(A0B2);
            this.A0C = C36341k9.A0S(A0B2);
            this.A0K = C36371kC.A0Z(A0B2);
            this.A0T = C36361kB.A0a(A0B2);
            this.A0Y = C18800tq.AG6(A0B2);
            this.A0D = (AnonymousClass16K) A0B2.A2C.get();
            this.A0E = (AnonymousClass1O7) A0B2.AEU.get();
            this.A0Q = C36351kA.A0f(r1);
            this.A0N = C36371kC.A0b(r1);
            this.A0a = C36391kE.A0k(A0B2);
            this.A0A = C36361kB.A0U(A0B2);
            this.A0b = (C238019x) A0B2.A8U.get();
            this.A0J = C36371kC.A0Y(A0B2);
            this.A0Z = C36351kA.A0m(A0B2);
            this.A0H = C36361kB.A0W(A0B2);
            this.A0d = C36361kB.A0e(A0B2);
            this.A0O = C36351kA.A0c(r1);
            this.A0L = (C235518x) A0B2.A2p.get();
            this.A0R = (C62383Fy) r1.ABQ.get();
        }
    }

    public void A2X() {
        if (this.A0D.A0E(7492)) {
            this.A0d.A03((AnonymousClass11F) null, 92);
        }
        super.A2X();
    }

    public /* synthetic */ void A3i(AnonymousClass146 r14, String str, List list) {
        int i = this.A00;
        AnonymousClass147 r2 = this.A0W;
        Log.i("newgroup/invokeCreateGroupApi");
        this.A0T.A15.add(r14);
        AnonymousClass3FK r3 = new AnonymousClass3FK(r14);
        r3.A03 = str;
        r3.A04 = list;
        r3.A00 = i;
        r3.A01 = r2;
        if (r2 == null || this.A0D.A0E(7180)) {
            r3.A05 = this.A03.getBoolean("add_other_participants");
            r3.A09 = this.A03.getBoolean("require_membership_approval");
            r3.A06 = this.A03.getBoolean("edit_group_info", true);
            r3.A07 = this.A03.getBoolean("send_messages", true);
        }
        AnonymousClass3B9 A002 = r3.A00();
        C46192Vk r7 = new C46192Vk(this.A07, this.A0J, this.A0K, this.A0T, A002, this, this.A0b);
        C19970wo r4 = this.A07;
        C20810yC r5 = this.A0D;
        new C76873pa(this.A03, this.A02, r4, r5, this.A0T, r7, r7.A00, this.A0X).A01();
        AnonymousClass2PZ r22 = new AnonymousClass2PZ();
        r22.A01 = this.A0f;
        r22.A02 = C36441kJ.A0y(i);
        r22.A00 = Boolean.valueOf(C36421kH.A1a(str));
        this.A0S.Blw(r22);
    }

    public void Bbp() {
        if (this.A06.A02.compareTo(AnonymousClass01P.CREATED) >= 0) {
            ChangeEphemeralSettingsDialog.A03(getSupportFragmentManager(), this.A00, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        com.whatsapp.util.Log.i("newgroup/photopicked");
        r9.A04.setImageBitmap(X.C36401kF.A09(r9, r9.A0H, r3, getResources().getDimensionPixelSize(com.whatsapp.R.dimen.f7nameremoved)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        super.onActivityResult(r10, r11, r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            java.lang.String r2 = "newgroup/photopicked"
            r1 = -1
            r5 = r9
            r4 = r12
            switch(r10) {
                case 12: goto L_0x003d;
                case 13: goto L_0x0026;
                case 14: goto L_0x000c;
                default: goto L_0x0008;
            }
        L_0x0008:
            super.onActivityResult(r10, r11, r12)
        L_0x000b:
            return
        L_0x000c:
            if (r11 != r1) goto L_0x0008
            if (r12 == 0) goto L_0x0008
            java.lang.String r0 = "parent_group_jid_to_link"
            java.lang.String r2 = r12.getStringExtra(r0)
            java.lang.String r0 = "selected"
            java.util.ArrayList r1 = r12.getStringArrayListExtra(r0)
            java.lang.String r0 = "duplicate_ug_exists"
            boolean r0 = X.C36421kH.A1T(r12, r0)
            r9.A0K(r2, r1, r0)
            goto L_0x0008
        L_0x0026:
            X.1P3 r0 = r9.A0a
            X.141 r3 = r9.A0s
            java.io.File r0 = r0.A03(r3)
            r0.delete()
            if (r11 == r1) goto L_0x0085
            if (r11 != 0) goto L_0x000b
            if (r12 == 0) goto L_0x000b
            X.1P3 r0 = r9.A0a
            r0.A04(r12, r9)
            return
        L_0x003d:
            if (r11 != r1) goto L_0x000b
            r1 = 0
            if (r12 == 0) goto L_0x009f
            java.lang.String r0 = "is_reset"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "newgroup/resetphoto"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.16K r0 = r9.A0D
            X.141 r1 = r9.A0s
            java.io.File r0 = r0.A00(r1)
            X.C18740tg.A06(r0)
            r0.delete()
            X.16K r0 = r9.A0D
            java.io.File r0 = r0.A01(r1)
            X.C18740tg.A06(r0)
            r0.delete()
            android.widget.ImageView r1 = r9.A04
            r0 = 2131231888(0x7f080490, float:1.807987E38)
            r1.setImageResource(r0)
            return
        L_0x0072:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x009f
            X.1P3 r0 = r9.A0a
            X.141 r3 = r9.A0s
            java.io.File r0 = r0.A03(r3)
            r0.delete()
        L_0x0085:
            com.whatsapp.util.Log.i((java.lang.String) r2)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168107(0x7f070b6b, float:1.7950506E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.widget.ImageView r1 = r9.A04
            X.1Ps r0 = r9.A0H
            android.graphics.Bitmap r0 = X.C36401kF.A09(r9, r0, r3, r2)
            r1.setImageBitmap(r0)
            return
        L_0x009f:
            java.lang.String r0 = "newgroup/cropphoto"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1P3 r3 = r9.A0a
            X.141 r7 = r9.A0s
            r8 = 13
            r6 = r9
            r3.A06(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.newgroup.NewGroup.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        AnonymousClass22t r0 = this.A0M;
        if (r0 == null || !r0.isShowing()) {
            super.onBackPressed();
        } else {
            this.A0M.dismiss();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r1 != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r37) {
        /*
            r36 = this;
            r7 = r36
            r4 = r37
            super.onCreate(r4)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "messages_to_forward_bundle"
            android.os.Bundle r0 = r1.getBundleExtra(r0)
            r7.A01 = r0
            r13 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0022
            boolean r1 = r0.isEmpty()
            r16 = 1
            r0 = 2131889707(0x7f120e2b, float:1.9414085E38)
            if (r1 == 0) goto L_0x0027
        L_0x0022:
            r16 = 0
            r0 = 2131891291(0x7f12145b, float:1.9417298E38)
        L_0x0027:
            r7.setTitle(r0)
            X.07B r6 = X.C36381kD.A0O(r7)
            r6.A0U(r13)
            r6.A0V(r13)
            r0 = 2131625597(0x7f0e067d, float:1.8878406E38)
            r7.setContentView((int) r0)
            X.1Pn r1 = r7.A0G
            java.lang.String r0 = "new-group-activity"
            X.1RY r0 = r1.A05(r7, r0)
            r7.A0F = r0
            r0 = 2131428743(0x7f0b0587, float:1.847914E38)
            android.widget.ImageView r1 = X.C36411kG.A0Q(r7, r0)
            r7.A04 = r1
            r0 = 42
            X.AnonymousClass3Y2.A00(r1, r7, r0)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "optional_participants"
            boolean r0 = r1.getBooleanExtra(r0, r3)
            r7.A0k = r0
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "create_group_for_community"
            boolean r0 = r1.getBooleanExtra(r0, r3)
            r7.A0i = r0
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "create_group_for_xfamily"
            boolean r0 = r1.getBooleanExtra(r0, r3)
            r7.A0n = r0
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "prefill_group_name"
            java.lang.String r12 = r1.getStringExtra(r0)
            if (r37 != 0) goto L_0x0378
            r7.A0l = r3
            X.16K r0 = r7.A0D
            X.141 r1 = r7.A0s
            java.io.File r0 = r0.A00(r1)
            X.C18740tg.A06(r0)
            r0.delete()
            X.16K r0 = r7.A0D
            java.io.File r0 = r0.A01(r1)
            X.C18740tg.A06(r0)
            r0.delete()
            android.content.Intent r4 = r7.getIntent()
            java.lang.String r0 = "parent_group_jid_to_link"
            java.lang.String r2 = r4.getStringExtra(r0)
            java.lang.String r0 = "selected"
            java.util.ArrayList r1 = r4.getStringArrayListExtra(r0)
            java.lang.String r0 = "duplicate_ug_exists"
            r11 = 0
            boolean r0 = r4.getBooleanExtra(r0, r3)
            r7.A0K(r2, r1, r0)
        L_0x00b8:
            android.os.Bundle r0 = r7.A03
            if (r0 != 0) goto L_0x00c2
            android.os.Bundle r0 = r7.A01()
            r7.A03 = r0
        L_0x00c2:
            r0 = 2131431353(0x7f0b0fb9, float:1.8484433E38)
            android.view.View r0 = r7.findViewById(r0)
            com.whatsapp.KeyboardPopupLayout r0 = (com.whatsapp.KeyboardPopupLayout) r0
            r7.A0m = r0
            r0 = 2131429813(0x7f0b09b5, float:1.848131E38)
            android.view.View r10 = r7.findViewById(r0)
            android.widget.ImageButton r10 = (android.widget.ImageButton) r10
            r0 = 2131430643(0x7f0b0cf3, float:1.8482993E38)
            android.view.View r9 = r7.findViewById(r0)
            com.whatsapp.WaEditText r9 = (com.whatsapp.WaEditText) r9
            r7.A09 = r9
            X.0yC r0 = r7.A0D
            r21 = r0
            X.1N2 r0 = r7.A0C
            r19 = r0
            X.0wN r0 = r7.A03
            r20 = r0
            X.1H2 r0 = r7.A0C
            r18 = r0
            X.1XN r0 = r7.A0P
            r17 = r0
            X.0yb r15 = r7.A08
            X.0ts r14 = r7.A00
            X.62r r8 = r7.A0N
            com.whatsapp.emoji.search.EmojiSearchProvider r5 = r7.A0Q
            X.0v0 r4 = r7.A09
            X.0wg r3 = r7.A0Z
            com.whatsapp.KeyboardPopupLayout r2 = r7.A0m
            r0 = 18
            java.lang.Integer r34 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r35 = X.C36361kB.A0j()
            X.6O1 r1 = r7.A0O
            X.22t r0 = new X.22t
            r23 = r15
            r24 = r4
            r25 = r14
            r26 = r8
            r27 = r1
            r28 = r17
            r29 = r18
            r30 = r5
            r31 = r21
            r32 = r3
            r33 = r19
            r17 = r0
            r18 = r7
            r19 = r10
            r21 = r2
            r22 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r7.A0M = r0
            X.4Sf r1 = r7.A0r
            r0.A0H(r1)
            r0 = 2131429849(0x7f0b09d9, float:1.8481382E38)
            android.view.View r1 = r7.findViewById(r0)
            com.whatsapp.emoji.search.EmojiSearchContainer r1 = (com.whatsapp.emoji.search.EmojiSearchContainer) r1
            X.22t r0 = r7.A0M
            X.3J6 r3 = new X.3J6
            r3.<init>(r7, r0, r1)
            r0 = 5
            X.AnonymousClass3J6.A00(r3, r7, r0)
            X.22t r2 = r7.A0M
            r1 = 15
            X.3v6 r0 = new X.3v6
            r0.<init>(r3, r1)
            r2.A0F = r0
            android.widget.ImageView r1 = r7.A04
            r0 = 2131231888(0x7f080490, float:1.807987E38)
            r1.setImageResource(r0)
            java.io.File r0 = A07(r7)
            if (r0 == 0) goto L_0x0180
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131168107(0x7f070b6b, float:1.7950506E38)
            int r3 = r1.getDimensionPixelSize(r0)
            android.widget.ImageView r2 = r7.A04
            X.1Ps r1 = r7.A0H
            X.141 r0 = r7.A0s
            android.graphics.Bitmap r0 = X.C36401kF.A09(r7, r1, r0, r3)
            r2.setImageBitmap(r0)
        L_0x0180:
            X.0yf r1 = r7.A06
            X.0yh r0 = X.C21100yf.A1v
            int r0 = r1.A04(r0)
            r2 = 0
            int r3 = java.lang.Math.max(r11, r0)
            com.whatsapp.WaEditText r1 = r7.A09
            r0 = 2131434445(0x7f0b1bcd, float:1.8490704E38)
            r7.A0G(r1, r0, r3, r3)
            boolean r0 = r7.A0i
            if (r0 != 0) goto L_0x019e
            X.147 r0 = r7.A0W
            if (r0 != 0) goto L_0x019e
            r13 = 0
        L_0x019e:
            r7.A0j = r13
            boolean r3 = r7.A0L()
            com.whatsapp.WaEditText r1 = r7.A09
            r0 = 2131888654(0x7f120a0e, float:1.941195E38)
            if (r3 == 0) goto L_0x01ae
            r0 = 2131890254(0x7f12104e, float:1.9415195E38)
        L_0x01ae:
            r1.setHint(r0)
            if (r16 == 0) goto L_0x01b9
            r0 = 2131888198(0x7f120846, float:1.9411025E38)
            r6.A0H(r0)
        L_0x01b9:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x01c4
            com.whatsapp.WaEditText r0 = r7.A09
            r0.setText(r12)
        L_0x01c4:
            com.whatsapp.WaEditText r0 = r7.A09
            r0.requestFocus()
            r0 = 2131432196(0x7f0b1304, float:1.8486143E38)
            android.widget.ImageView r4 = X.C36431kI.A0P(r7, r0)
            if (r16 == 0) goto L_0x01da
            X.0ts r1 = r7.A00
            r0 = 2131233044(0x7f080914, float:1.8082214E38)
            X.C36321k7.A0L(r7, r4, r1, r0)
        L_0x01da:
            X.1LV r8 = r7.A0A
            X.147 r5 = r7.A0W
            r3 = 0
            if (r5 == 0) goto L_0x01f2
            X.0yC r1 = r8.A06
            r0 = 4184(0x1058, float:5.863E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01f2
            boolean r0 = r8.A0J(r5)
            if (r0 != 0) goto L_0x01f2
            r3 = 1
        L_0x01f2:
            r5 = 8
            if (r3 == 0) goto L_0x0374
            android.widget.TextView r0 = r7.A05
            r0.setVisibility(r5)
            r1 = 43
        L_0x01fd:
            X.3Y2 r0 = new X.3Y2
            r0.<init>(r7, r1)
            X.AnonymousClass6IP.A00(r0, r4)
            X.1Cf r1 = r7.A0J
            X.1Ct r0 = r7.A0w
            r1.registerObserver(r0)
            android.content.Intent r1 = r7.getIntent()
            r8 = -1
            java.lang.String r0 = "entry_point"
            int r1 = r1.getIntExtra(r0, r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r1 != r8) goto L_0x021e
            r0 = 0
        L_0x021e:
            r7.A0f = r0
            if (r3 == 0) goto L_0x02fe
            r0 = 2131430675(0x7f0b0d13, float:1.8483058E38)
            X.1RJ r0 = X.C36361kB.A0h(r7, r0)
            r0.A03(r11)
            r0 = 2131430676(0x7f0b0d14, float:1.848306E38)
            android.widget.TextView r1 = X.C36401kF.A0H(r7, r0)
            X.1e1 r8 = r7.A0e
            android.content.Context r9 = r1.getContext()
            r0 = 2131890324(0x7f121094, float:1.9415337E38)
            java.lang.String r11 = r7.getString(r0)
            android.content.Context r0 = r1.getContext()
            int r13 = X.C36341k9.A05(r0)
            r0 = 14
            X.3v6 r10 = new X.3v6
            r10.<init>(r7, r0)
            java.lang.String r12 = "learn-more"
            android.text.SpannableStringBuilder r0 = r8.A03(r9, r10, r11, r12, r13)
            r1.setText(r0)
            X.0yC r0 = r7.A0D
            X.C36331k8.A0z(r1, r7, r0)
            r0 = 2131430668(0x7f0b0d0c, float:1.8483043E38)
            android.view.View r1 = X.C03570Gk.A0B(r7, r0)
            r0 = 2131430624(0x7f0b0ce0, float:1.8482954E38)
            X.1RJ r0 = X.C36341k9.A0Y(r1, r0)
            r0.A03(r2)
            r0 = 2131429511(0x7f0b0887, float:1.8480697E38)
            android.widget.TextView r1 = X.C36401kF.A0H(r7, r0)
            r0 = 2131890125(0x7f120fcd, float:1.9414933E38)
            r1.setHint(r0)
            r0 = 46
            X.AnonymousClass3Y2.A00(r1, r7, r0)
            r0 = 2131430620(0x7f0b0cdc, float:1.8482946E38)
            android.view.View r0 = X.C03570Gk.A0B(r7, r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r7.A08 = r0
            X.0yf r1 = r7.A06
            X.0yh r0 = X.C21100yf.A22
            int r0 = r1.A04(r0)
            int r9 = java.lang.Math.max(r2, r0)
            com.whatsapp.WaEditText r8 = r7.A08
            r1 = 2131429509(0x7f0b0885, float:1.8480693E38)
            int r0 = r9 / 10
            r7.A0G(r8, r1, r9, r0)
            android.widget.ImageView r1 = r7.A04
            r0 = 2131231040(0x7f080140, float:1.807815E38)
            r1.setImageResource(r0)
            android.widget.ImageView r1 = r7.A04
            r0 = 45
            X.AnonymousClass3Y2.A00(r1, r7, r0)
        L_0x02b0:
            boolean r0 = r7.A0i
            if (r0 != 0) goto L_0x02b8
            boolean r0 = r7.A0n
            if (r0 == 0) goto L_0x02c6
        L_0x02b8:
            X.0ts r1 = r7.A00
            r0 = 2131232279(0x7f080617, float:1.8080663E38)
            X.C36321k7.A0L(r7, r4, r1, r0)
            r0 = 2131433795(0x7f0b1943, float:1.8489386E38)
            X.C36391kE.A16(r7, r0, r5)
        L_0x02c6:
            X.0yC r0 = r7.A0D
            r1 = 7180(0x1c0c, float:1.0061E-41)
            boolean r0 = r0.A0E(r1)
            if (r0 == 0) goto L_0x02d7
            java.lang.String r0 = r7.A0g
            if (r0 == 0) goto L_0x02d7
            r6.A0P(r0)
        L_0x02d7:
            X.147 r0 = r7.A0W
            if (r0 == 0) goto L_0x02e3
            X.0yC r0 = r7.A0D
            boolean r0 = r0.A0E(r1)
            if (r0 == 0) goto L_0x02fd
        L_0x02e3:
            r0 = 2131430650(0x7f0b0cfa, float:1.8483007E38)
            android.view.View r1 = r7.findViewById(r0)
            com.whatsapp.ListItemWithRightIcon r1 = (com.whatsapp.ListItemWithRightIcon) r1
            r1.setVisibility(r2)
            r1.setDescriptionVisibility(r5)
            android.os.Bundle r0 = r7.A01()
            r7.A03 = r0
            r0 = 9
            X.AnonymousClass3YD.A00(r1, r7, r0, r3)
        L_0x02fd:
            return
        L_0x02fe:
            r0 = 2131430631(0x7f0b0ce7, float:1.8482968E38)
            android.view.View r1 = X.C03570Gk.A0B(r7, r0)
            r1.setVisibility(r11)
            X.18x r0 = r7.A0L
            int r0 = X.C36431kI.A05(r0)
            r7.A00 = r0
            r7.A0F(r0)
            r0 = 12
            X.C48752hz.A00(r1, r7, r0)
            X.C33521fV.A02(r1)
            X.147 r8 = r7.A0W
            X.0yC r1 = r7.A0D
            r0 = 2447(0x98f, float:3.429E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0337
            if (r8 == 0) goto L_0x0368
            X.12q r0 = r7.A0I
            X.3Qp r0 = r0.A09(r8, r11)
            if (r0 == 0) goto L_0x0337
            boolean r0 = r0.A0n
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0368
        L_0x0337:
            java.lang.String r0 = r7.A0g
            if (r0 == 0) goto L_0x02b0
            r0 = 2131891294(0x7f12145e, float:1.9417304E38)
            java.lang.String r1 = r7.getString(r0)
            java.lang.String r0 = " "
            java.lang.String r9 = r1.concat(r0)
            r8 = 2131891293(0x7f12145d, float:1.9417302E38)
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            java.lang.String r0 = r7.A0g
            java.lang.String r0 = X.C36391kE.A0v(r7, r0, r1, r11, r8)
            java.lang.String r1 = r9.concat(r0)
        L_0x0359:
            r0 = 2131431928(0x7f0b11f8, float:1.84856E38)
            android.widget.TextView r0 = X.C36401kF.A0H(r7, r0)
            r0.setVisibility(r11)
            r0.setText(r1)
            goto L_0x02b0
        L_0x0368:
            boolean r0 = r7.A0j
            if (r0 == 0) goto L_0x02b0
            r0 = 2131891294(0x7f12145e, float:1.9417304E38)
            java.lang.String r1 = r7.getString(r0)
            goto L_0x0359
        L_0x0374:
            r1 = 44
            goto L_0x01fd
        L_0x0378:
            java.lang.String r0 = "input_method"
            int r0 = r4.getInt(r0)
            r7.A0l = r0
            java.lang.String r0 = "parent_group_jid_to_link"
            java.lang.String r2 = r4.getString(r0)
            java.lang.String r0 = "selected"
            java.util.ArrayList r1 = r4.getStringArrayList(r0)
            java.lang.String r0 = "duplicate_ug_exists"
            r11 = 0
            boolean r0 = r4.getBoolean(r0, r3)
            r7.A0K(r2, r1, r0)
            java.lang.String r0 = "setting_values"
            android.os.Bundle r0 = r4.getBundle(r0)
            r7.A03 = r0
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.newgroup.NewGroup.onCreate(android.os.Bundle):void");
    }

    public NewGroup(int i) {
        this.A0p = false;
        C89334Wd.A00(this, 41);
    }

    public static void A0J(NewGroup newGroup, AnonymousClass147 r4) {
        Intent A0D2 = C36431kI.A0D();
        A0D2.putExtra("group_jid", r4.getRawString());
        A0D2.putExtra("parent_group_jid_to_link", AnonymousClass143.A03(newGroup.A0W));
        if (newGroup.A02 != null) {
            newGroup.A09.A0B();
            A0D2.putExtra("new_group_result_bundle", newGroup.A02);
        }
        newGroup.setResult(-1, A0D2);
    }

    public static boolean A0M(NewGroup newGroup, String str, boolean z) {
        C39001qm A002;
        String A0B2;
        int i;
        if (str.trim().length() == 0) {
            if (!newGroup.A0L()) {
                A002 = AnonymousClass3LW.A00(newGroup);
                if (z) {
                    i = R.string.f12nameremoved;
                } else {
                    boolean A0E2 = newGroup.A0D.A0E(3088);
                    i = R.string.f12nameremoved;
                    if (A0E2) {
                        i = R.string.f12nameremoved;
                    }
                }
                A0B2 = newGroup.getString(i);
            }
            return true;
        }
        int A003 = C63883Lu.A00(str);
        int A042 = newGroup.A06.A04(C21100yf.A1v);
        if (A003 > A042) {
            A002 = AnonymousClass3LW.A00(newGroup);
            Resources resources = newGroup.getResources();
            boolean A0E3 = newGroup.A0D.A0E(3088);
            int i2 = R.plurals.f10nameremoved;
            if (A0E3) {
                i2 = R.plurals.f10nameremoved;
            }
            A0B2 = C36321k7.A0B(resources, A042, 0, i2);
        }
        return true;
        A002.A0p(A0B2);
        A002.A0m(newGroup, (AnonymousClass04S) null, R.string.f12nameremoved);
        A002.A0b();
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new AutoFitGridLayoutManager(getBaseContext(), getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0J.unregisterObserver(this.A0w);
        AnonymousClass1RY r0 = this.A0F;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        int i;
        super.onSaveInstanceState(bundle);
        if (this.A0M.isShowing()) {
            i = 1;
        } else {
            i = 2;
            if (AnonymousClass1N2.A00(this.A0m)) {
                i = 0;
            }
        }
        this.A0l = i;
        bundle.putInt("input_method", i);
        bundle.putStringArrayList("selected", AnonymousClass143.A07(AnonymousClass141.A00(this.A0h)));
        AnonymousClass147 r0 = this.A0W;
        if (r0 != null) {
            bundle.putString("parent_group_jid_to_link", r0.getRawString());
        }
        bundle.putBoolean("duplicate_ug_exists", this.A0o);
        bundle.putBundle("setting_values", this.A03);
    }

    public void onStart() {
        super.onStart();
        int i = this.A0l;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else if (!this.A0M.isShowing()) {
                this.A0m.post(new C80253v6(this, 13));
            }
            getWindow().setSoftInputMode(2);
            return;
        }
        getWindow().setSoftInputMode(4);
    }

    public void BWX(int i) {
        A0F(i);
    }

    public NewGroup() {
        this(0);
        this.A0t = new AtomicReference();
        this.A0s = new C44112Le();
        this.A0q = BnD(new C65673Ta(this, 7), new C009504a());
        this.A0r = new C89604Xe(this, 8);
        this.A0w = new AnonymousClass4YE(this, 13);
        this.A0u = new AnonymousClass2A6(this, 15);
        this.A0v = new C40611vp(this, 10);
    }
}
