package com.whatsapp.dmsetting;

import X.AnonymousClass001;
import X.AnonymousClass155;
import X.AnonymousClass17Z;
import X.AnonymousClass19A;
import X.AnonymousClass1AL;
import X.AnonymousClass3FC;
import X.AnonymousClass3GX;
import X.AnonymousClass3TD;
import X.AnonymousClass3UQ;
import X.AnonymousClass3Y0;
import X.C03570Gk;
import X.C18800tq;
import X.C18830tt;
import X.C19430v1;
import X.C203399nx;
import X.C20380xT;
import X.C235518x;
import X.C27111My;
import X.C27371Ny;
import X.C32681e1;
import X.C32931eR;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C76593p8;
import X.C81113wU;
import X.C81283wl;
import X.C89334Wd;
import X.C89654Xj;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.List;

public class ChangeDMSettingActivity extends AnonymousClass155 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public TextEmojiLabel A04;
    public TextEmojiLabel A05;
    public C33751fs A06;
    public AnonymousClass17Z A07;
    public C27371Ny A08;
    public C235518x A09;
    public AnonymousClass3GX A0A;
    public AnonymousClass3FC A0B;
    public C32931eR A0C;
    public C20380xT A0D;
    public C32681e1 A0E;
    public boolean A0F;

    private void A01(int i) {
        int i2 = i;
        if (i2 == -1) {
            this.A0A.A00(3, this.A01);
        } else if (i2 != C36431kI.A05(this.A09)) {
            Intent A0D2 = C36431kI.A0D();
            A0D2.putExtra("duration", i2);
            setResult(-1, A0D2);
            C27371Ny r5 = this.A08;
            int i3 = this.A01;
            if (!r5.A02.A09()) {
                r5.A01.A06(R.string.f12nameremoved, 0);
                r5.A00.A0D(r5.A04.A04());
                return;
            }
            AnonymousClass19A r10 = r5.A06;
            String A092 = r10.A09();
            C203399nx r3 = new C203399nx("disappearing_mode", new AnonymousClass1AL[]{new AnonymousClass1AL("duration", (long) i2)});
            AnonymousClass1AL[] r2 = new AnonymousClass1AL[4];
            C36341k9.A1V(r2, 0);
            C36331k8.A1R(A092, r2, 1);
            C36351kA.A1N(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r2);
            C36361kB.A1Q("xmlns", "disappearing_mode", r2);
            r10.A0K(new C76593p8(r5, i2, i3), C36391kE.A0m(r3, r2), A092, 277, 20000);
        }
    }

    public static void A07(ChangeDMSettingActivity changeDMSettingActivity, int i) {
        changeDMSettingActivity.A04.setVisibility(0);
        int i2 = i;
        if (i == 0) {
            String string = changeDMSettingActivity.getString(R.string.f12nameremoved);
            TextEmojiLabel textEmojiLabel = changeDMSettingActivity.A04;
            textEmojiLabel.setText(changeDMSettingActivity.A0E.A03(textEmojiLabel.getContext(), new C81113wU((Object) changeDMSettingActivity, 40), string, "learn-more", C36341k9.A05(changeDMSettingActivity)));
            C36331k8.A10(changeDMSettingActivity.A04, changeDMSettingActivity.A0D);
            changeDMSettingActivity.A05.setVisibility(8);
            return;
        }
        String A0w = C36351kA.A0w(changeDMSettingActivity, "by-selecting-them", 1, R.string.f12nameremoved);
        TextEmojiLabel textEmojiLabel2 = changeDMSettingActivity.A04;
        textEmojiLabel2.setText(changeDMSettingActivity.A0E.A02(textEmojiLabel2.getContext(), new C81283wl((Object) changeDMSettingActivity, i, 31), A0w, "by-selecting-them"));
        C36331k8.A10(changeDMSettingActivity.A04, changeDMSettingActivity.A0D);
        changeDMSettingActivity.A05.setVisibility(0);
        changeDMSettingActivity.A0A.A01((List) null, 0, i2, 0, changeDMSettingActivity.A00, changeDMSettingActivity.A01);
    }

    public void A2F() {
        if (!this.A0F) {
            this.A0F = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A0E = C36351kA.A0p(r1);
            this.A0D = C36331k8.A0I(r2);
            this.A0A = C27111My.A24(A0L);
            this.A0B = C27111My.A25(A0L);
            this.A08 = (C27371Ny) r2.A2o.get();
            this.A06 = C36361kB.A0X(r1);
            this.A07 = C36411kG.A0c(r2);
            this.A09 = (C235518x) r2.A2p.get();
            this.A0C = C36431kI.A0g(r2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r20, int r21, android.content.Intent r22) {
        /*
            r19 = this;
            r3 = r19
            r6 = r20
            r0 = r21
            r5 = r22
            super.onActivityResult(r6, r0, r5)
            if (r22 == 0) goto L_0x009b
            java.lang.String r2 = "all_contacts_count"
            java.lang.String r1 = "jids"
            r9 = 1
            r4 = -1
            r12 = 0
            if (r6 != r9) goto L_0x009c
            if (r0 != r4) goto L_0x009c
            java.lang.Class<X.11F> r0 = X.AnonymousClass11F.class
            java.util.ArrayList r14 = X.C36401kF.A0u(r5, r0, r1)
            int r0 = r5.getIntExtra(r2, r12)
            r3.A00 = r0
            X.18x r0 = r3.A09
            X.19y r0 = r0.A03
            android.content.SharedPreferences r1 = X.C238119y.A00(r0)
            java.lang.String r0 = "disappearing_mode_duration_for_chat_picker_int"
            int r15 = r1.getInt(r0, r12)
            X.3FC r13 = r3.A0B
            int r2 = r3.A02
            int r1 = r3.A00
            int r0 = r3.A01
            r16 = r2
            r17 = r1
            r18 = r0
            r13.A00(r14, r15, r16, r17, r18)
            int r0 = r14.size()
            if (r0 <= 0) goto L_0x009b
            android.view.View r8 = r3.A00
            if (r8 == 0) goto L_0x009b
            X.0ts r10 = r3.A00
            r7 = 2131755075(0x7f100043, float:1.914102E38)
            int r0 = r14.size()
            long r1 = (long) r0
            java.lang.Object[] r6 = X.AnonymousClass001.A0M()
            java.lang.String r11 = ""
            r0 = 86400(0x15180, float:1.21072E-40)
            r5 = 2131889233(0x7f120c51, float:1.9413124E38)
            if (r15 == r0) goto L_0x0075
            r0 = 604800(0x93a80, float:8.47505E-40)
            r5 = 2131889260(0x7f120c6c, float:1.9413179E38)
            if (r15 == r0) goto L_0x0075
            r0 = 7776000(0x76a700, float:1.0896497E-38)
            if (r15 != r0) goto L_0x0079
            r5 = 2131889236(0x7f120c54, float:1.941313E38)
        L_0x0075:
            java.lang.String r11 = r3.getString(r5)
        L_0x0079:
            r6[r12] = r11
            int r0 = r14.size()
            X.AnonymousClass000.A1L(r6, r0, r9)
            java.lang.String r0 = r10.A0L(r6, r7, r1)
            X.4t3 r2 = X.C99304t3.A01(r8, r0, r4)
            X.0Eq r1 = r2.A0J
            r0 = 2131434156(0x7f0b1aac, float:1.8490118E38)
            android.widget.TextView r0 = X.C36391kE.A0P(r1, r0)
            if (r0 == 0) goto L_0x0098
            r0.setSingleLine(r12)
        L_0x0098:
            r2.A0P()
        L_0x009b:
            return
        L_0x009c:
            java.lang.Class<X.11F> r0 = X.AnonymousClass11F.class
            java.util.ArrayList r9 = X.C36401kF.A0u(r5, r0, r1)
            int r0 = r5.getIntExtra(r2, r12)
            r3.A00 = r0
            int r11 = r3.A03
            if (r11 != r4) goto L_0x00b2
            X.18x r0 = r3.A09
            int r11 = X.C36431kI.A05(r0)
        L_0x00b2:
            X.3GX r8 = r3.A0A
            r10 = 2
            int r13 = r3.A00
            int r14 = r3.A01
            r8.A01(r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dmsetting.ChangeDMSettingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        A01(this.A03);
        super.onBackPressed();
    }

    public ChangeDMSettingActivity(int i) {
        this.A0F = false;
        C89334Wd.A00(this, 14);
    }

    public void onCreate(Bundle bundle) {
        int[] iArr;
        super.onCreate(bundle);
        this.A01 = C36431kI.A0F(this, R.layout.f9nameremoved).getIntExtra("entry_point", 1);
        Toolbar A0N = C36361kB.A0N(this);
        C36331k8.A0s(this, A0N, this.A00, R.drawable.ic_back);
        A0N.setTitle((CharSequence) getString(R.string.f12nameremoved));
        A0N.setBackgroundResource(C36441kJ.A04(this));
        A0N.setNavigationOnClickListener(new AnonymousClass3Y0(this, 17));
        A0N.A0J(this, R.style.f13nameremoved);
        setSupportActionBar(A0N);
        this.A04 = C36441kJ.A0e(this, R.id.dm_description);
        TextEmojiLabel A0e = C36441kJ.A0e(this, R.id.dm_learn_more);
        this.A05 = A0e;
        A0e.setText(this.A0E.A03(A0e.getContext(), new C81113wU((Object) this, 39), getString(R.string.f12nameremoved), "learn-more", C36341k9.A05(this.A05.getContext())));
        C36331k8.A10(this.A05, this.A0D);
        this.A03 = -1;
        RadioGroup radioGroup = (RadioGroup) C03570Gk.A0B(this, R.id.dm_radio_group);
        int A052 = C36431kI.A05(this.A09);
        this.A02 = A052;
        AnonymousClass3TD.A03(radioGroup, this.A0D, A052, true, false);
        A07(this, A052);
        if (this.A0D.A0E(1397)) {
            iArr = C19430v1.A0K;
        } else {
            iArr = C19430v1.A0L;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (int i = 0; i < radioGroup.getChildCount(); i++) {
            View childAt = radioGroup.getChildAt(i);
            if (childAt instanceof RadioButton) {
                A0I.add(childAt);
            }
        }
        C89654Xj r6 = new C89654Xj(this, 0);
        radioGroup.setOnCheckedChangeListener(r6);
        this.A08.A04.A00.A08(this, new AnonymousClass3UQ(A0I, radioGroup, r6, iArr, 0));
        this.A0A.A00(1, this.A01);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A01(this.A03);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public ChangeDMSettingActivity() {
        this(0);
    }
}
