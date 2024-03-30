package com.whatsapp.registration.phonenumberentry;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass1NG;
import X.C007103b;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C220412q;
import X.C229216m;
import X.C229516p;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36441kJ;
import X.C89264Vw;
import X.C89364Wg;
import X.C89924Yk;
import X.C90014Yt;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.RadioButton;
import android.widget.ScrollView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.registration.NotifyContactsSelector;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ChangeNumberNotifyContacts extends AnonymousClass155 {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public ScrollView A05;
    public SwitchCompat A06;
    public C19460v5 A07;
    public AnonymousClass1NG A08;
    public C229216m A09;
    public AnonymousClass16D A0A;
    public C220412q A0B;
    public List A0C;
    public RadioButton A0D;
    public RadioButton A0E;
    public RadioButton A0F;
    public TextEmojiLabel A0G;
    public boolean A0H;

    public static void A01(ChangeNumberNotifyContacts changeNumberNotifyContacts) {
        changeNumberNotifyContacts.A01 = 2;
        changeNumberNotifyContacts.A03.setVisibility(0);
        changeNumberNotifyContacts.A0C.clear();
        List list = changeNumberNotifyContacts.A0C;
        ArrayList A0I = AnonymousClass001.A0I();
        HashSet A16 = C36441kJ.A16();
        changeNumberNotifyContacts.A0F(A0I);
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            AnonymousClass11F r1 = (AnonymousClass11F) C36371kC.A0d(it);
            if (r1 != null && changeNumberNotifyContacts.A0B.A0M(r1)) {
                A16.add(r1);
            }
        }
        list.addAll(A16);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 150) {
            if (i2 != -1) {
                Log.i("ChangeNumberNotifyContacts/listmembersselector/permissions denied");
                this.A06.setChecked(false);
                return;
            }
            A01(this);
        } else if (i != 1) {
            super.onActivityResult(i, i2, intent);
            return;
        } else if (i2 == -1) {
            this.A0C = C36401kF.A0u(intent, UserJid.class, "jids");
            this.A01 = 3;
        }
        A07(this);
    }

    public static void A07(ChangeNumberNotifyContacts changeNumberNotifyContacts) {
        RadioButton radioButton;
        int i = changeNumberNotifyContacts.A01;
        boolean z = true;
        SwitchCompat switchCompat = changeNumberNotifyContacts.A06;
        if (i == 0) {
            switchCompat.setChecked(false);
            changeNumberNotifyContacts.A0G.setText(R.string.f12nameremoved);
            changeNumberNotifyContacts.A03.setVisibility(8);
            radioButton = changeNumberNotifyContacts.A0E;
        } else {
            switchCompat.setChecked(true);
            Spanned fromHtml = Html.fromHtml(C36331k8.A0g(changeNumberNotifyContacts.A00, changeNumberNotifyContacts.A0C.size(), 0, R.plurals.f10nameremoved));
            SpannableStringBuilder A0P = C36441kJ.A0P(fromHtml);
            URLSpan[] A1b = C36381kD.A1b(fromHtml);
            if (A1b != null) {
                for (URLSpan uRLSpan : A1b) {
                    if ("contacts-link".equals(uRLSpan.getURL())) {
                        int spanStart = A0P.getSpanStart(uRLSpan);
                        int spanEnd = A0P.getSpanEnd(uRLSpan);
                        int spanFlags = A0P.getSpanFlags(uRLSpan);
                        A0P.removeSpan(uRLSpan);
                        A0P.setSpan(new C89264Vw(changeNumberNotifyContacts, changeNumberNotifyContacts, 3), spanStart, spanEnd, spanFlags);
                    }
                }
            }
            C36331k8.A1A(changeNumberNotifyContacts.A0D, changeNumberNotifyContacts.A0G);
            C36331k8.A16(changeNumberNotifyContacts.A0G, changeNumberNotifyContacts.A08);
            changeNumberNotifyContacts.A0G.setText(A0P);
            changeNumberNotifyContacts.A03.setVisibility(0);
            changeNumberNotifyContacts.A0D.setChecked(AnonymousClass000.A1S(changeNumberNotifyContacts.A01, 1));
            changeNumberNotifyContacts.A0E.setChecked(AnonymousClass000.A1S(changeNumberNotifyContacts.A01, 2));
            radioButton = changeNumberNotifyContacts.A0F;
            if (changeNumberNotifyContacts.A01 != 3) {
                z = false;
            }
        }
        radioButton.setChecked(z);
    }

    private void A0F(ArrayList arrayList) {
        AnonymousClass16D r0 = this.A0A;
        C229516p.A0G(r0.A05, arrayList, 1, false, false, true);
        if (!r0.A0H.A0E(3764)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (AnonymousClass143.A0I(C36341k9.A0W(it))) {
                    it.remove();
                }
            }
        }
        Set A092 = this.A08.A09();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (C007103b.A0j(A092, C36371kC.A0d(it2))) {
                it2.remove();
            }
        }
    }

    public void A2F() {
        if (!this.A0H) {
            this.A0H = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0B = C36351kA.A0a(A0B2);
            this.A07 = C19470v6.A00;
            this.A0A = C36341k9.A0R(A0B2);
            this.A08 = C36381kD.A0V(A0B2);
            this.A09 = C36381kD.A0X(A0B2);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        boolean isChecked = this.A06.isChecked();
        super.onRestoreInstanceState(bundle);
        this.A04.getViewTreeObserver().addOnPreDrawListener(new C90014Yt(0, this, isChecked));
    }

    public ChangeNumberNotifyContacts(int i) {
        this.A0H = false;
        C89364Wg.A00(this, 11);
    }

    public void A3i(List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        A0F(A0I);
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            Jid A0d = C36371kC.A0d(it);
            if (A0d != null) {
                list.add(A0d);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C89924Yk.A00(this.A05.getViewTreeObserver(), this, 9);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            r0 = 2131887691(0x7f12064b, float:1.9409996E38)
            r14.setTitle(r0)
            X.07B r0 = X.C36381kD.A0O(r14)
            r4 = 1
            r0.A0U(r4)
            r0.A0V(r4)
            r0 = 2131624368(0x7f0e01b0, float:1.8875914E38)
            r14.setContentView((int) r0)
            r0 = 2131429024(0x7f0b06a0, float:1.847971E38)
            android.view.View r1 = r14.findViewById(r0)
            r0 = 21
            X.C67133Yq.A00(r1, r14, r0)
            android.content.Intent r5 = r14.getIntent()
            r0 = 2131428716(0x7f0b056c, float:1.8479084E38)
            android.widget.TextView r9 = X.C36391kE.A0Q(r14, r0)
            X.0ts r3 = r14.A00
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "+"
            r2.append(r1)
            java.lang.String r0 = "oldJid"
            java.lang.String r0 = r5.getStringExtra(r0)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
            java.lang.String r2 = r3.A0H(r0)
            X.0ts r3 = r14.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)
            java.lang.String r0 = "newJid"
            java.lang.String r0 = r5.getStringExtra(r0)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.String r11 = r3.A0H(r0)
            r1 = 2131887653(0x7f120625, float:1.940992E38)
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.C36341k9.A1I(r2, r11, r0)
            java.lang.String r0 = r14.getString(r1, r0)
            int r13 = r0.indexOf(r2)
            int r8 = r0.indexOf(r11)
            android.text.SpannableString r7 = X.C36441kJ.A0O(r0)
            r12 = 2130970628(0x7f040804, float:1.7549971E38)
            r10 = 2131102241(0x7f060a21, float:1.7816914E38)
            int r1 = X.C36351kA.A01(r14, r12, r10)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            int r1 = X.C36441kJ.A09(r2, r13)
            r2 = 17
            r7.setSpan(r0, r13, r1, r2)
            java.lang.String r6 = "sans-serif-medium"
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r6)
            r7.setSpan(r0, r13, r1, r2)
            int r1 = X.C36351kA.A01(r14, r12, r10)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            int r1 = X.C36441kJ.A09(r11, r8)
            r7.setSpan(r0, r8, r1, r2)
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r6)
            r7.setSpan(r0, r8, r1, r2)
            r9.setText(r7)
            r0 = 2131433566(0x7f0b185e, float:1.8488921E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r14.A05 = r0
            r0 = 2131432160(0x7f0b12e0, float:1.848607E38)
            android.view.View r0 = r14.findViewById(r0)
            r14.A04 = r0
            r0 = 2131432161(0x7f0b12e1, float:1.8486072E38)
            android.view.View r0 = r14.findViewById(r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r14.A06 = r0
            X.AnonymousClass4XY.A00(r0, r14, r2)
            android.view.View r1 = r14.A04
            r0 = 22
            X.C67133Yq.A00(r1, r14, r0)
            r0 = 2131428737(0x7f0b0581, float:1.8479127E38)
            android.view.View r1 = r14.findViewById(r0)
            r14.A03 = r1
            r0 = 2131428710(0x7f0b0566, float:1.8479072E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r14.A0D = r0
            r0 = 2131428709(0x7f0b0565, float:1.847907E38)
            android.view.View r0 = r14.findViewById(r0)
            r2 = 23
            X.C67133Yq.A00(r0, r14, r2)
            android.view.View r1 = r14.A03
            r0 = 2131428712(0x7f0b0568, float:1.8479076E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r14.A0E = r0
            r0 = 2131428711(0x7f0b0567, float:1.8479074E38)
            android.view.View r0 = r14.findViewById(r0)
            X.C67133Yq.A00(r0, r14, r2)
            android.view.View r1 = r14.A03
            r0 = 2131428714(0x7f0b056a, float:1.847908E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r14.A0F = r0
            r0 = 2131428713(0x7f0b0569, float:1.8479078E38)
            android.view.View r0 = r14.findViewById(r0)
            X.C67133Yq.A00(r0, r14, r2)
            r0 = 2131428726(0x7f0b0576, float:1.8479105E38)
            com.whatsapp.TextEmojiLabel r0 = X.C36421kH.A0I(r14, r0)
            r14.A0G = r0
            r0 = 2131428151(0x7f0b0337, float:1.8477938E38)
            android.view.View r0 = r14.findViewById(r0)
            r14.A02 = r0
            java.lang.String r0 = "mode"
            r2 = 3
            if (r15 == 0) goto L_0x01df
            int r0 = r15.getInt(r0)
            r14.A01 = r0
            if (r0 != r2) goto L_0x0158
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "selectedJids"
            java.util.ArrayList r0 = r15.getStringArrayList(r0)
        L_0x0152:
            java.util.ArrayList r0 = X.AnonymousClass143.A06(r1, r0)
            r14.A0C = r0
        L_0x0158:
            java.util.List r0 = r14.A0C
            if (r0 != 0) goto L_0x0162
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r14.A0C = r0
        L_0x0162:
            X.16m r0 = r14.A09
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x01a0
            r0 = 0
            r14.A01 = r0
            android.view.View r1 = r14.A03
            r0 = 8
            r1.setVisibility(r0)
            java.util.List r0 = r14.A0C
            r0.clear()
        L_0x0179:
            A07(r14)
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131168241(0x7f070bf1, float:1.7950778E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A00 = r0
            android.widget.ScrollView r0 = r14.A05
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 8
            X.C89634Xh.A00(r1, r14, r0)
            android.widget.ScrollView r0 = r14.A05
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 9
            X.C89924Yk.A00(r1, r14, r0)
            return
        L_0x01a0:
            int r0 = r14.A01
            if (r0 != r4) goto L_0x01b1
            r14.A01 = r4
            java.util.List r0 = r14.A0C
            r0.clear()
            java.util.List r0 = r14.A0C
            r14.A3i(r0)
            goto L_0x0179
        L_0x01b1:
            if (r0 != r3) goto L_0x01b7
            A01(r14)
            goto L_0x0179
        L_0x01b7:
            if (r0 != r2) goto L_0x0179
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r14.A3i(r0)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r0)
            java.util.List r0 = r14.A0C
            java.util.Iterator r1 = r0.iterator()
        L_0x01cb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0179
            java.lang.Object r0 = r1.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x01cb
            r1.remove()
            goto L_0x01cb
        L_0x01df:
            int r0 = r5.getIntExtra(r0, r3)
            r14.A01 = r0
            if (r0 != r2) goto L_0x0158
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "preselectedJids"
            java.util.ArrayList r0 = r5.getStringArrayListExtra(r0)
            goto L_0x0152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts.onCreate(android.os.Bundle):void");
    }

    public void onRadioButtonClicked(View view) {
        int id = view.getId();
        if (id == R.id.change_number_all) {
            if (this.A01 != 1) {
                this.A01 = 1;
                this.A0C.clear();
                A3i(this.A0C);
            } else {
                return;
            }
        } else if (id == R.id.change_number_chats) {
            if (this.A01 != 2) {
                A01(this);
            } else {
                return;
            }
        } else if (id == R.id.change_number_custom) {
            startActivityForResult(C36441kJ.A0H(this, NotifyContactsSelector.class), 1);
            return;
        } else {
            return;
        }
        A07(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("selectedJids", AnonymousClass143.A07(this.A0C));
        bundle.putInt("mode", this.A01);
    }

    public ChangeNumberNotifyContacts() {
        this(0);
    }
}
