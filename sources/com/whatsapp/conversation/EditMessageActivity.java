package com.whatsapp.conversation;

import X.AnonymousClass00E;
import X.AnonymousClass00F;
import X.AnonymousClass076;
import X.AnonymousClass13J;
import X.AnonymousClass155;
import X.AnonymousClass1H2;
import X.AnonymousClass1XN;
import X.AnonymousClass2xe;
import X.AnonymousClass3AE;
import X.AnonymousClass3HC;
import X.AnonymousClass3J6;
import X.AnonymousClass6O1;
import X.AnonymousClass6YV;
import X.C100744vb;
import X.C1261362r;
import X.C145166tS;
import X.C18800tq;
import X.C18830tt;
import X.C19890wg;
import X.C21060yb;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36401kF;
import X.C36991ld;
import X.C39471sS;
import X.C39681tF;
import X.C57082xf;
import X.C61333Bl;
import X.C88314Sf;
import X.C89324Wc;
import X.C89604Xe;
import X.C90284Zu;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.mentions.MentionableEntry;
import java.util.List;

public final class EditMessageActivity extends AnonymousClass155 {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ScrollView A03;
    public AnonymousClass2xe A04;
    public C57082xf A05;
    public C61333Bl A06;
    public KeyboardPopupLayout A07;
    public WaImageButton A08;
    public C39681tF A09;
    public AnonymousClass3HC A0A;
    public C39471sS A0B;
    public C1261362r A0C;
    public AnonymousClass6O1 A0D;
    public AnonymousClass1XN A0E;
    public AnonymousClass3J6 A0F;
    public EmojiSearchProvider A0G;
    public MentionableEntry A0H;
    public C19890wg A0I;
    public AnonymousClass13J A0J;
    public boolean A0K;
    public AnonymousClass3AE A0L;
    public boolean A0M;
    public final C88314Sf A0N;
    public final Handler A0O;

    public static final void A01(EditMessageActivity editMessageActivity) {
        EditMessageActivity editMessageActivity2 = editMessageActivity;
        MentionableEntry mentionableEntry = editMessageActivity.A0H;
        if (mentionableEntry == null) {
            throw C36331k8.A0d("entry");
        }
        Editable text = mentionableEntry.getText();
        if (text != null) {
            AnonymousClass1H2 r6 = editMessageActivity.A0C;
            C21060yb r5 = editMessageActivity.A08;
            C19890wg r7 = editMessageActivity.A0I;
            if (r7 != null) {
                MentionableEntry mentionableEntry2 = editMessageActivity.A0H;
                if (mentionableEntry2 == null) {
                    throw C36331k8.A0d("entry");
                }
                AnonymousClass6YV.A0F(editMessageActivity2, text, mentionableEntry2.getPaint(), r5, r6, r7, R.color.f6nameremoved, editMessageActivity.A0K);
                return;
            }
            throw C36331k8.A0d("sharedPreferencesFactory");
        }
    }

    public static final void A07(EditMessageActivity editMessageActivity) {
        EditMessageActivity editMessageActivity2 = editMessageActivity;
        C39471sS r7 = editMessageActivity.A0B;
        if (r7 == null) {
            throw C36331k8.A0d("webPagePreviewViewModel");
        }
        C145166tS r0 = r7.A01;
        if (r0 == null || r0.A05 == null) {
            if (editMessageActivity.A0L == null) {
                AnonymousClass3AE r3 = new AnonymousClass3AE(editMessageActivity2, editMessageActivity.A04, new C90284Zu(editMessageActivity, 0), r7, editMessageActivity.A04, false, false);
                editMessageActivity2.A0L = r3;
                ViewGroup viewGroup = editMessageActivity2.A02;
                if (viewGroup == null) {
                    throw C36331k8.A0d("webPagePreviewContainer");
                }
                viewGroup.addView(r3.A05);
            }
            A0G(editMessageActivity2, 0);
            AnonymousClass3AE r1 = editMessageActivity2.A0L;
            if (r1 != null) {
                C39471sS r02 = editMessageActivity2.A0B;
                if (r02 == null) {
                    throw C36331k8.A0d("webPagePreviewViewModel");
                }
                C145166tS r4 = r02.A01;
                if (r4 != null) {
                    r1.A05.A0M(r4, (List) null, false, r1.A00);
                    return;
                }
                return;
            }
            return;
        }
        r7.A0W(r7.A06);
    }

    public static final void A0G(EditMessageActivity editMessageActivity, int i) {
        ViewGroup viewGroup = editMessageActivity.A02;
        if (viewGroup == null) {
            throw C36331k8.A0d("webPagePreviewContainer");
        }
        viewGroup.setVisibility(i);
        A0F(editMessageActivity);
    }

    public static final void A0H(EditMessageActivity editMessageActivity, boolean z) {
        WaImageButton waImageButton = editMessageActivity.A08;
        if (waImageButton == null) {
            throw C36331k8.A0d("sendBtn");
        }
        waImageButton.setEnabled(z);
        WaImageButton waImageButton2 = editMessageActivity.A08;
        if (z) {
            if (waImageButton2 == null) {
                throw C36331k8.A0d("sendBtn");
            }
            waImageButton2.getDrawable().setTintList((ColorStateList) null);
            WaImageButton waImageButton3 = editMessageActivity.A08;
            if (waImageButton3 == null) {
                throw C36331k8.A0d("sendBtn");
            }
            waImageButton3.setBackground((Drawable) null);
        } else if (waImageButton2 == null) {
            throw C36331k8.A0d("sendBtn");
        } else {
            AnonymousClass076.A06(waImageButton2.getDrawable(), AnonymousClass00F.A00(editMessageActivity, R.color.f6nameremoved));
            WaImageButton waImageButton4 = editMessageActivity.A08;
            if (waImageButton4 == null) {
                throw C36331k8.A0d("sendBtn");
            }
            waImageButton4.setBackgroundResource(R.drawable.edit_disabled_btn_background);
        }
    }

    public void A2F() {
        if (!this.A0M) {
            this.A0M = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A04 = (AnonymousClass2xe) A0L2.A0q.get();
            this.A05 = (C57082xf) A0L2.A3Y.get();
            this.A0E = C36351kA.A0d(r2);
            this.A0J = C36351kA.A0q(r2);
            this.A0G = C36351kA.A0f(r1);
            this.A0C = C36371kC.A0b(r1);
            this.A0I = C36351kA.A0m(r2);
            this.A0A = C36401kF.A0X(r1);
            this.A0D = C36351kA.A0c(r1);
            this.A06 = (C61333Bl) A0L2.A16.get();
        }
    }

    public void finish() {
        View view = this.A00;
        if (view == null) {
            throw C36331k8.A0d("footerContainer");
        }
        view.setVisibility(8);
        MentionableEntry mentionableEntry = this.A0H;
        if (mentionableEntry == null) {
            throw C36331k8.A0d("entry");
        }
        mentionableEntry.A0B();
        super.finish();
        overridePendingTransition(0, R.anim.f1nameremoved);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x031c, code lost:
        if (r3 == null) goto L_0x031e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0388  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r40) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            super.onCreate(r1)
            r1 = 2131624862(0x7f0e039e, float:1.8876916E38)
            r0.setContentView((int) r1)
            android.view.View r3 = X.C36361kB.A0C(r0)
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131102848(0x7f060c80, float:1.7818146E38)
            X.C36391kE.A1C(r2, r3, r1)
            androidx.appcompat.widget.Toolbar r4 = X.C36411kG.A0R(r0)
            r1 = 2131889007(0x7f120b6f, float:1.9412665E38)
            r4.setTitle((int) r1)
            r1 = 2131103013(0x7f060d25, float:1.781848E38)
            int r1 = X.AnonymousClass00F.A00(r0, r1)
            r4.setTitleTextColor((int) r1)
            boolean r2 = X.C222013h.A05
            r1 = 2131102811(0x7f060c5b, float:1.781807E38)
            if (r2 != 0) goto L_0x0040
            r2 = 2130970395(0x7f04071b, float:1.7549499E38)
            r1 = 2131102017(0x7f060941, float:1.781646E38)
            int r1 = X.C224514j.A00(r0, r2, r1)
        L_0x0040:
            int r3 = X.AnonymousClass00F.A00(r0, r1)
            r4.setBackgroundColor(r3)
            X.0ts r2 = r0.A00
            r1 = 2131231957(0x7f0804d5, float:1.808001E38)
            X.C36331k8.A0s(r0, r4, r2, r1)
            r1 = 2131896334(0x7f12280e, float:1.9427526E38)
            r4.setNavigationContentDescription((int) r1)
            r2 = 3
            X.3Xy r1 = new X.3Xy
            r1.<init>(r0, r2)
            r4.setNavigationOnClickListener(r1)
            android.view.Window r2 = r0.getWindow()
            X.AnonymousClass00C.A08(r2)
            r1 = 1
            X.AnonymousClass1RB.A00(r2, r3, r1)
            r2 = 2130772017(0x7f010031, float:1.714714E38)
            r1 = 0
            r0.overridePendingTransition(r2, r1)
            X.2xf r4 = r0.A05
            if (r4 == 0) goto L_0x0490
            android.os.Handler r3 = r0.A0O
            r2 = 0
            r1 = 2
            X.04H r2 = X.AnonymousClass4ZD.A00(r0, r3, r4, r2, r1)
            java.lang.Class<X.1sS> r1 = X.C39471sS.class
            X.04R r1 = r2.A00(r1)
            X.1sS r1 = (X.C39471sS) r1
            r0.A0B = r1
            android.content.Intent r1 = r0.getIntent()
            X.3Qa r9 = X.AnonymousClass3UJ.A02(r1)
            if (r9 == 0) goto L_0x048c
            X.2xe r2 = r0.A04
            if (r2 == 0) goto L_0x0485
            X.1sS r5 = r0.A0B
            if (r5 != 0) goto L_0x009f
            java.lang.String r0 = "webPagePreviewViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x009f:
            X.1Mz r1 = r2.A00
            X.0tq r1 = r1.A01
            X.0wo r6 = X.C36351kA.A0V(r1)
            X.1Mz r2 = r2.A00
            X.0tq r1 = r2.A01
            X.0yC r7 = X.C36341k9.A0V(r1)
            X.1DU r8 = X.C36391kE.A0j(r1)
            X.0ww r3 = X.C36381kD.A0U(r1)
            X.1X4 r4 = X.C36361kB.A0T(r1)
            X.1A1 r10 = X.C36351kA.A0n(r1)
            X.1My r1 = r2.A00
            X.004 r1 = r1.A0L
            X.005 r11 = X.C18840tu.A00(r1)
            X.1tF r2 = new X.1tF
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.A09 = r2
            java.lang.String r19 = "editMessageViewModel"
            X.00s r3 = r2.A03
            X.4JY r2 = new X.4JY
            r2.<init>(r0)
            r1 = 13
            X.C88554Td.A00(r0, r3, r2, r1)
            X.1tF r1 = r0.A09
            if (r1 != 0) goto L_0x00e5
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r19)
            throw r0
        L_0x00e5:
            X.00s r3 = r1.A05
            X.4JZ r2 = new X.4JZ
            r2.<init>(r0)
            r1 = 14
            X.C88554Td.A00(r0, r3, r2, r1)
            X.1tF r1 = r0.A09
            if (r1 != 0) goto L_0x00fa
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r19)
            throw r0
        L_0x00fa:
            X.00s r3 = r1.A04
            X.4Ja r2 = new X.4Ja
            r2.<init>(r0)
            r1 = 16
            X.C88554Td.A00(r0, r3, r2, r1)
            r2 = 2131429209(0x7f0b0759, float:1.8480084E38)
            android.view.View r2 = X.C36361kB.A0H(r0, r2)
            com.whatsapp.KeyboardPopupLayout r2 = (com.whatsapp.KeyboardPopupLayout) r2
            r0.A07 = r2
            r2 = 2131429985(0x7f0b0a61, float:1.8481658E38)
            android.view.View r4 = X.C36361kB.A0H(r0, r2)
            com.whatsapp.mentions.MentionableEntry r4 = (com.whatsapp.mentions.MentionableEntry) r4
            r0.A0H = r4
            java.lang.String r18 = "entry"
            if (r4 != 0) goto L_0x0125
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r18)
            throw r0
        L_0x0125:
            int r3 = r4.getImeOptions()
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 | r2
            r4.setImeOptions(r3)
            X.0yC r2 = r0.A0D
            X.AnonymousClass00C.A07(r2)
            boolean r2 = X.C55752v8.A00(r2)
            r0.A0K = r2
            X.1tF r2 = r0.A09
            if (r2 != 0) goto L_0x0143
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r19)
            throw r0
        L_0x0143:
            X.3T1 r6 = r2.A0B
            if (r6 == 0) goto L_0x048c
            r2 = 2131430367(0x7f0b0bdf, float:1.8482433E38)
            android.view.View r3 = X.C36361kB.A0H(r0, r2)
            r0.A00 = r3
            r2 = 0
            r3.setAlpha(r2)
            android.content.res.Configuration r4 = X.AnonymousClass000.A0U(r0)
            com.whatsapp.KeyboardPopupLayout r3 = r0.A07
            if (r3 != 0) goto L_0x0163
            java.lang.String r0 = "keyboardPopupLayout"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0163:
            r13 = 1
            X.4YA r2 = new X.4YA
            r2.<init>(r4, r0, r13)
            r3.addOnLayoutChangeListener(r2)
            r2 = 2131430928(0x7f0b0e10, float:1.848357E38)
            android.view.View r3 = X.C36361kB.A0H(r0, r2)
            r0.A01 = r3
            java.lang.String r17 = "inputLayout"
            r2 = 2131430919(0x7f0b0e07, float:1.8483553E38)
            X.C36381kD.A18(r3, r2)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131168373(0x7f070c75, float:1.7951046E38)
            int r5 = r3.getDimensionPixelOffset(r2)
            android.view.View r2 = r0.A01
            if (r2 != 0) goto L_0x0191
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r17)
            throw r0
        L_0x0191:
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.AnonymousClass00C.A0E(r4, r2)
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            android.view.View r3 = r0.A01
            if (r3 != 0) goto L_0x01a5
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r17)
            throw r0
        L_0x01a5:
            int r2 = r4.leftMargin
            X.AnonymousClass1JZ.A03(r3, r2, r5)
            X.3Bl r4 = r0.A06
            if (r4 == 0) goto L_0x047e
            X.01z r3 = r0.getSupportFragmentManager()
            X.0wU r2 = r0.A04
            X.2kb r2 = X.AnonymousClass2XJ.A01(r2)
            X.3QY r3 = r4.A00(r3, r2)
            X.3fG r2 = new X.3fG
            r2.<init>(r0)
            X.2IR r4 = r3.A03(r0, r2, r6)
            r2 = 0
            r4.setEnabled(r2)
            r2 = 2131431728(0x7f0b1130, float:1.8485193E38)
            android.view.View r3 = X.C36361kB.A0H(r0, r2)
            android.widget.ScrollView r3 = (android.widget.ScrollView) r3
            r0.A03 = r3
            java.lang.String r2 = "messageBubbleContainer"
            if (r3 != 0) goto L_0x01dd
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x01dd:
            r3.addView(r4)
            android.widget.ScrollView r5 = r0.A03
            if (r5 != 0) goto L_0x01e9
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x01e9:
            r2 = 33
            X.3v3 r4 = X.C80223v3.A00(r0, r2)
            r2 = 500(0x1f4, double:2.47E-321)
            r5.postDelayed(r4, r2)
            r2 = 2131429843(0x7f0b09d3, float:1.848137E38)
            android.view.View r12 = r0.findViewById(r2)
            android.widget.ImageButton r12 = (android.widget.ImageButton) r12
            X.0yC r2 = r0.A0D
            r21 = r2
            X.1N2 r2 = r0.A0C
            r20 = r2
            X.0wN r2 = r0.A03
            r23 = r2
            X.1H2 r15 = r0.A0C
            X.1XN r11 = r0.A0E
            if (r11 == 0) goto L_0x0477
            X.0yb r14 = r0.A08
            X.0ts r10 = r0.A00
            X.62r r9 = r0.A0C
            if (r9 == 0) goto L_0x0470
            com.whatsapp.emoji.search.EmojiSearchProvider r8 = r0.A0G
            if (r8 == 0) goto L_0x0469
            X.0v0 r7 = r0.A09
            X.0wg r5 = r0.A0I
            if (r5 == 0) goto L_0x0462
            com.whatsapp.KeyboardPopupLayout r4 = r0.A07
            java.lang.String r16 = "keyboardPopupLayout"
            r2 = 0
            if (r4 != 0) goto L_0x022d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r16)
            throw r0
        L_0x022d:
            com.whatsapp.mentions.MentionableEntry r3 = r0.A0H
            if (r3 != 0) goto L_0x0236
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r18)
            throw r0
        L_0x0236:
            java.lang.Integer r37 = java.lang.Integer.valueOf(r1)
            X.1tF r1 = r0.A09
            if (r1 != 0) goto L_0x0243
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r19)
            throw r0
        L_0x0243:
            X.3T1 r1 = r1.A0B
            if (r1 == 0) goto L_0x024d
            X.3Qa r1 = r1.A1J
            if (r1 == 0) goto L_0x024d
            X.11F r2 = r1.A00
        L_0x024d:
            java.lang.Integer r38 = X.C54212sa.A00(r2)
            X.6O1 r2 = r0.A0D
            if (r2 == 0) goto L_0x045b
            X.22t r1 = new X.22t
            r26 = r14
            r27 = r7
            r28 = r10
            r29 = r9
            r30 = r2
            r31 = r11
            r32 = r15
            r33 = r8
            r34 = r21
            r35 = r5
            r36 = r20
            r20 = r1
            r21 = r0
            r22 = r12
            r24 = r4
            r25 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            X.4Sf r2 = r0.A0N
            r1.A0H(r2)
            com.whatsapp.KeyboardPopupLayout r3 = r0.A07
            if (r3 != 0) goto L_0x0288
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r16)
            throw r0
        L_0x0288:
            r2 = 2131429849(0x7f0b09d9, float:1.8481382E38)
            android.view.View r3 = X.C012005e.A02(r3, r2)
            com.whatsapp.emoji.search.EmojiSearchContainer r3 = (com.whatsapp.emoji.search.EmojiSearchContainer) r3
            X.3J6 r2 = new X.3J6
            r2.<init>(r0, r1, r3)
            r0.A0F = r2
            X.AnonymousClass3J6.A00(r2, r0, r13)
            android.view.Window r2 = r0.getWindow()
            r1 = 5
            r2.setSoftInputMode(r1)
            X.3Sl r1 = X.AnonymousClass147.A01
            X.3Qa r1 = r6.A1J
            X.11F r3 = r1.A00
            X.147 r9 = X.C65533Sl.A03(r3)
            com.whatsapp.mentions.MentionableEntry r1 = r0.A0H
            if (r1 != 0) goto L_0x02b6
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r18)
            throw r0
        L_0x02b6:
            boolean r1 = r1.A0I(r9)
            if (r1 == 0) goto L_0x02fa
            r1 = 2131431569(0x7f0b1091, float:1.848487E38)
            android.view.ViewGroup r8 = X.C36421kH.A0E(r0, r1)
            com.whatsapp.mentions.MentionableEntry r7 = r0.A0H
            if (r7 != 0) goto L_0x02cc
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r18)
            throw r0
        L_0x02cc:
            r2 = 0
            X.4Y0 r1 = new X.4Y0
            r1.<init>(r0, r2)
            r7.A0A = r1
            r11 = 0
            r12 = 1
            r13 = 0
            r10 = 0
            r7.A0G(r8, r9, r10, r11, r12, r13)
            com.whatsapp.mentions.MentionableEntry r2 = r0.A0H
            if (r2 != 0) goto L_0x02e4
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r18)
            throw r0
        L_0x02e4:
            android.view.View r1 = r0.A01
            if (r1 != 0) goto L_0x02ed
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r17)
            throw r0
        L_0x02ed:
            r2.A03 = r1
            com.whatsapp.KeyboardPopupLayout r1 = r0.A07
            if (r1 != 0) goto L_0x02f8
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r16)
            throw r0
        L_0x02f8:
            r2.A02 = r1
        L_0x02fa:
            boolean r4 = r3 instanceof X.C28981Uw
            r1 = 2131896778(0x7f1229ca, float:1.9428427E38)
            if (r4 == 0) goto L_0x0304
            r1 = 2131888195(0x7f120843, float:1.9411018E38)
        L_0x0304:
            com.whatsapp.mentions.MentionableEntry r2 = r0.A0H
            if (r2 != 0) goto L_0x030d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r18)
            throw r0
        L_0x030d:
            java.lang.String r1 = r0.getString(r1)
            r2.setHint(r1)
            boolean r1 = r6 instanceof X.AnonymousClass2bV
            if (r1 == 0) goto L_0x036a
            java.lang.String r3 = r6.A0b()
        L_0x031c:
            if (r3 != 0) goto L_0x033b
        L_0x031e:
            if (r4 != 0) goto L_0x0339
            r0.finish()
        L_0x0323:
            r1 = 2131435343(0x7f0b1f4f, float:1.8492525E38)
            android.view.View r1 = X.C36361kB.A0H(r0, r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.A02 = r1
            X.1sS r1 = r0.A0B
            java.lang.String r5 = "webPagePreviewViewModel"
            if (r1 != 0) goto L_0x0388
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0339:
            java.lang.String r3 = ""
        L_0x033b:
            com.whatsapp.mentions.MentionableEntry r2 = r0.A0H
            if (r2 != 0) goto L_0x0344
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r18)
            throw r0
        L_0x0344:
            java.util.List r1 = r6.A0w
            r2.setMentionableText(r3, r1)
            com.whatsapp.mentions.MentionableEntry r2 = r0.A0H
            if (r2 != 0) goto L_0x0352
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r18)
            throw r0
        L_0x0352:
            int r1 = r2.getSelectionEnd()
            r2.setSelection(r1)
            A01(r0)
            com.whatsapp.mentions.MentionableEntry r2 = r0.A0H
            if (r2 != 0) goto L_0x0365
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r18)
            throw r0
        L_0x0365:
            r1 = 0
            r2.A0C(r1)
            goto L_0x0323
        L_0x036a:
            boolean r1 = r6 instanceof X.C46882bp
            if (r1 != 0) goto L_0x0380
            boolean r1 = r6 instanceof X.C181798o3
            if (r1 != 0) goto L_0x0380
            boolean r1 = r6 instanceof X.C181788o2
            if (r1 != 0) goto L_0x0380
            boolean r1 = r6 instanceof X.C46972by
            if (r1 == 0) goto L_0x031e
            r1 = r6
            X.2by r1 = (X.C46972by) r1
            java.lang.String r3 = r1.A01
            goto L_0x031c
        L_0x0380:
            r1 = r6
            X.2bU r1 = (X.AnonymousClass2bU) r1
            java.lang.String r3 = r1.A1a()
            goto L_0x031c
        L_0x0388:
            X.00r r3 = r1.A0C
            X.4M0 r2 = new X.4M0
            r2.<init>(r0, r6)
            r1 = 15
            X.C88554Td.A00(r0, r3, r2, r1)
            X.1tF r1 = r0.A09
            if (r1 != 0) goto L_0x039d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r19)
            throw r0
        L_0x039d:
            X.6tS r2 = r1.A07
            if (r2 == 0) goto L_0x03d9
            X.1sS r1 = r0.A0B
            if (r1 != 0) goto L_0x03aa
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x03aa:
            java.lang.String r4 = r2.A0Z
            r1.A0V(r4)
            X.1sS r3 = r0.A0B
            if (r3 != 0) goto L_0x03b8
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x03b8:
            r3.A0T(r2)
            X.3L1 r2 = r6.A0a
            if (r2 == 0) goto L_0x03d0
            java.lang.String r1 = r3.A06
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x03d0
            r1 = 4
            r3.A00 = r1
            boolean r1 = r3.A07
            if (r1 == 0) goto L_0x03d0
            r3.A04 = r2
        L_0x03d0:
            boolean r1 = r3.A0Y()
            if (r1 == 0) goto L_0x03d9
            A07(r0)
        L_0x03d9:
            r1 = 2131433826(0x7f0b1962, float:1.8489449E38)
            android.view.View r2 = X.C36361kB.A0H(r0, r1)
            com.whatsapp.WaImageButton r2 = (com.whatsapp.WaImageButton) r2
            r0.A08 = r2
            java.lang.String r4 = "sendBtn"
            if (r2 != 0) goto L_0x03ed
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x03ed:
            r1 = 2131232277(0x7f080615, float:1.8080659E38)
            X.C36391kE.A18(r0, r2, r1)
            boolean r1 = X.C222013h.A07
            if (r1 == 0) goto L_0x041c
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131169064(0x7f070f28, float:1.7952448E38)
            int r3 = r2.getDimensionPixelSize(r1)
            com.whatsapp.WaImageButton r2 = r0.A08
            if (r2 != 0) goto L_0x040b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x040b:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r2.setScaleType(r1)
            com.whatsapp.WaImageButton r1 = r0.A08
            if (r1 != 0) goto L_0x0419
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x0419:
            r1.setPadding(r3, r3, r3, r3)
        L_0x041c:
            com.whatsapp.WaImageButton r2 = r0.A08
            if (r2 != 0) goto L_0x0425
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x0425:
            r1 = 30
            X.C48912iG.A00(r2, r0, r1)
            com.whatsapp.mentions.MentionableEntry r2 = r0.A0H
            if (r2 != 0) goto L_0x0433
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r18)
            throw r0
        L_0x0433:
            r1 = 4
            X.AnonymousClass4WJ.A00(r2, r0, r1)
            boolean r1 = r0.A0K
            if (r1 == 0) goto L_0x048f
            com.whatsapp.mentions.MentionableEntry r3 = r0.A0H
            if (r3 != 0) goto L_0x0444
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r18)
            throw r0
        L_0x0444:
            X.0ts r2 = r0.A00
            X.AnonymousClass00C.A07(r2)
            com.whatsapp.mentions.MentionableEntry r1 = r0.A0H
            if (r1 != 0) goto L_0x0452
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r18)
            throw r0
        L_0x0452:
            X.2g8 r0 = new X.2g8
            r0.<init>(r1, r2)
            r3.addTextChangedListener(r0)
            return
        L_0x045b:
            java.lang.String r0 = "expressionUserJourneyLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0462:
            java.lang.String r0 = "sharedPreferencesFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0469:
            java.lang.String r0 = "emojiSearchProvider"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0470:
            java.lang.String r0 = "emojiTrayLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0477:
            java.lang.String r0 = "recentEmojis"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x047e:
            java.lang.String r0 = "conversationRowInflatorFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0485:
            java.lang.String r0 = "editMessageViewModelFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x048c:
            r0.finish()
        L_0x048f:
            return
        L_0x0490:
            java.lang.String r0 = "webPagePreviewViewModelFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.EditMessageActivity.onCreate(android.os.Bundle):void");
    }

    public EditMessageActivity(int i) {
        this.A0M = false;
        C89324Wc.A00(this, 42);
    }

    public static final void A0F(EditMessageActivity editMessageActivity) {
        int i = R.drawable.ib_new_round;
        MentionableEntry mentionableEntry = editMessageActivity.A0H;
        if (mentionableEntry == null) {
            throw C36331k8.A0d("entry");
        }
        if (mentionableEntry.A0K) {
            i = R.drawable.ib_new_expanded_bottom;
        } else {
            ViewGroup viewGroup = editMessageActivity.A02;
            if (viewGroup == null) {
                throw C36331k8.A0d("webPagePreviewContainer");
            } else if (viewGroup.getVisibility() == 0) {
                i = R.drawable.ib_new_expanded;
            }
        }
        View view = editMessageActivity.A01;
        if (view == null) {
            throw C36331k8.A0d("inputLayout");
        }
        C36991ld.A00(new C100744vb(AnonymousClass00E.A00(editMessageActivity, i), editMessageActivity.A00), view);
    }

    public EditMessageActivity() {
        this(0);
        this.A0O = C36341k9.A0H();
        this.A0N = new C89604Xe(this, 1);
    }
}
