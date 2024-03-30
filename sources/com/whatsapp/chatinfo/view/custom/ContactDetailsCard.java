package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass04H;
import X.AnonymousClass04S;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass141;
import X.AnonymousClass155;
import X.AnonymousClass16W;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass1FR;
import X.AnonymousClass1LI;
import X.AnonymousClass1ND;
import X.AnonymousClass3C6;
import X.AnonymousClass3EV;
import X.C012005e;
import X.C015006m;
import X.C167527yC;
import X.C18820ts;
import X.C19460v5;
import X.C19700wN;
import X.C19730wQ;
import X.C19770wU;
import X.C199029ea;
import X.C202159l8;
import X.C20810yC;
import X.C21010yW;
import X.C223313w;
import X.C229516p;
import X.C235718z;
import X.C24631De;
import X.C24801Dv;
import X.C32681e1;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C36811lL;
import X.C38681pV;
import X.C45702Sj;
import X.C55422ub;
import X.C63383Jv;
import X.C63583Kp;
import X.C64873Pt;
import X.C66933Xw;
import X.C81323wp;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.pnh.RequestPhoneNumberViewModel;
import com.whatsapp.wds.components.actiontile.WDSActionTile;

public class ContactDetailsCard extends C38681pV {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public TextView A0A;
    public C19460v5 A0B;
    public C24801Dv A0C;
    public C19700wN A0D;
    public AnonymousClass3C6 A0E;
    public C19730wQ A0F;
    public TextEmojiLabel A0G;
    public AnonymousClass1LI A0H;
    public AnonymousClass155 A0I;
    public AnonymousClass1ND A0J;
    public C235718z A0K;
    public C229516p A0L;
    public AnonymousClass171 A0M;
    public C18820ts A0N;
    public AnonymousClass141 A0O;
    public C20810yC A0P;
    public C21010yW A0Q;
    public C45702Sj A0R;
    public C24631De A0S;
    public C199029ea A0T;
    public AnonymousClass3EV A0U;
    public AnonymousClass1FR A0V;
    public C63583Kp A0W;
    public RequestPhoneNumberViewModel A0X;
    public C64873Pt A0Y;
    public C32681e1 A0Z;
    public AnonymousClass13J A0a;
    public C19770wU A0b;
    public boolean A0c;
    public boolean A0d;
    public TextSwitcher A0e;
    public TextView A0f;
    public TextView A0g;
    public TextView A0h;
    public boolean A0i = true;
    public boolean A0j = true;
    public boolean A0k = true;
    public final AnonymousClass04S A0l = new C55422ub(this, 22);

    public static boolean A01(ContactDetailsCard contactDetailsCard) {
        AnonymousClass141 r1;
        Jid A0h2;
        AnonymousClass141 A0O2;
        if (contactDetailsCard.A0c || (r1 = contactDetailsCard.A0O) == null || r1.A0G != null || (!contactDetailsCard.A0d ? !(!r1.A0B()) : (A0h2 = C36411kG.A0h(r1)) == null || (A0O2 = contactDetailsCard.A0L.A0O(A0h2)) == null || A0O2.A0B()) || !C36441kJ.A1J(contactDetailsCard.A0F)) {
            return false;
        }
        return true;
    }

    private void setContactStatusHelper(String str) {
        TextSwitcher textSwitcher = this.A0e;
        if (textSwitcher != null) {
            if (textSwitcher.getVisibility() == 8) {
                this.A0e.setVisibility(0);
            }
            this.A0e.setText(str);
        }
    }

    public /* synthetic */ void A03(C63383Jv r7) {
        boolean z = !r7.A03;
        boolean z2 = r7.A04;
        Uri uri = r7.A00;
        int i = 0;
        if (z) {
            this.A09.setVisibility(8);
            this.A06.setVisibility(0);
            this.A06.setEnabled(!z2);
            int i2 = R.string.f12nameremoved;
            if (z2) {
                i2 = R.string.f12nameremoved;
            }
            ((WDSActionTile) this.A06).setText(i2);
            this.A01.setVisibility(8);
            this.A05.setVisibility(0);
            setPhoneHiddenBubbleText(uri);
            return;
        }
        this.A05.setVisibility(8);
        this.A06.setVisibility(8);
        View view = this.A01;
        if (!A01(this)) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void A04(boolean z) {
        AnonymousClass11F r0;
        RequestPhoneNumberViewModel requestPhoneNumberViewModel;
        C63383Jv r1;
        AnonymousClass141 r02 = this.A0O;
        if (r02 != null) {
            r0 = r02.A0H;
        } else {
            r0 = null;
        }
        if (!(r0 instanceof C223313w) || (requestPhoneNumberViewModel = this.A0X) == null || (r1 = (C63383Jv) requestPhoneNumberViewModel.A01.A04()) == null || (r1.A03 && r1.A02)) {
            AnonymousClass141 r3 = this.A0O;
            if (r3 != null) {
                C45702Sj r12 = this.A0R;
                if (r12 != null) {
                    r12.A0C = Boolean.valueOf(z);
                    r12.A0D = C36441kJ.A0x(z);
                }
                this.A0J.Bua(getContext(), r3, 6, z);
                return;
            }
            return;
        }
        int i = 3;
        if (z) {
            i = 4;
        }
        Integer valueOf = Integer.valueOf(i);
        C63583Kp r13 = this.A0W;
        if (r13 != null) {
            r13.A00(valueOf.intValue());
        }
    }

    public void setAddContactButtonListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.C36391kE.A1X(r5.A0P) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setContact(X.AnonymousClass141 r6) {
        /*
            r5 = this;
            r5.A0O = r6
            X.0wQ r0 = r5.A0F
            boolean r0 = X.C36361kB.A1X(r0, r6)
            if (r0 == 0) goto L_0x0013
            X.0yC r0 = r5.A0P
            boolean r1 = X.C36391kE.A1X(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r5.A0d = r0
            X.1LI r2 = r5.A0H
            android.content.Context r1 = r5.getContext()
            com.whatsapp.TextEmojiLabel r0 = r5.A0G
            X.3SF r2 = r2.B3q(r1, r0)
            boolean r0 = r5.A0d
            if (r0 == 0) goto L_0x004f
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.A07(r6, r1, r1, r0)
        L_0x002c:
            X.11F r4 = r6.A0H
            com.whatsapp.pnh.RequestPhoneNumberViewModel r3 = r5.A0X
            if (r3 == 0) goto L_0x004e
            X.155 r0 = r5.A0I
            if (r0 == 0) goto L_0x004e
            boolean r0 = r4 instanceof X.C223313w
            if (r0 == 0) goto L_0x004e
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.00s r2 = r3.A01
            X.0wU r1 = r3.A06
            r0 = 32
            X.C36391kE.A1S(r1, r3, r4, r0)
            X.155 r1 = r5.A0I
            X.04S r0 = r5.A0l
            r2.A08(r1, r0)
        L_0x004e:
            return
        L_0x004f:
            r2.A05(r6)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.view.custom.ContactDetailsCard.setContact(X.141):void");
    }

    public void setContactChatStatus(String str) {
        if (C36431kI.A1X(this.A0P)) {
            setContactStatusHelper(str);
        } else {
            this.A0f.setText(str);
        }
    }

    public void setContactChatStatusVisibility(int i) {
        if (!C36431kI.A1X(this.A0P)) {
            this.A0f.setVisibility(i);
        }
    }

    public void setCurrencyIcon(C202159l8 r7) {
        Context context = this.A04.getContext();
        AnonymousClass00C.A0D(context, 0);
        int A012 = C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved);
        Context context2 = this.A04.getContext();
        C202159l8 A022 = this.A0S.A02();
        if (A022 == null || A022.A02() == null) {
            this.A04.setVisibility(8);
            C19700wN r3 = this.A0D;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Currency icon for country ");
            A0u.append(r7.A03);
            r3.A0E("ContactDetailsCard/PayButton", AnonymousClass000.A0q(" missing", A0u), true);
            return;
        }
        C36811lL r2 = new C36811lL(C015006m.A03(context2, R.font.payment_icons_regular), ((AnonymousClass16W) A022.A02()).BAV(context2, 0), A012, C36361kB.A02(context2, R.dimen.f7nameremoved));
        ((WDSActionTile) this.A04).setText((int) R.string.f12nameremoved);
        ((WDSActionTile) this.A04).setIcon((Drawable) r2);
    }

    public void setSubTitle(String str) {
        this.A0A.setText(str);
        this.A0A.setVisibility(C36381kD.A00(str.isEmpty() ? 1 : 0));
    }

    public void setSubtitleOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A0A.setOnLongClickListener(onLongClickListener);
    }

    public void setTitleOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A0G.setOnLongClickListener(onLongClickListener);
    }

    public void setUsername(String str) {
        TextView textView;
        int i;
        this.A0g.setText(str);
        if (str.isEmpty() || this.A0G.getText().equals(str)) {
            textView = this.A0g;
            i = 8;
        } else {
            textView = this.A0g;
            i = 0;
        }
        textView.setVisibility(i);
    }

    public ContactDetailsCard(Context context) {
        super(context);
    }

    private void setPhoneHiddenBubbleText(Uri uri) {
        C36431kI.A1M(this.A0h, this.A0Z.A00(this.A0h.getContext(), C36411kG.A0w(getResources(), uri.toString(), AnonymousClass001.A0L(), 0, R.string.f12nameremoved)));
        C36331k8.A10(this.A0h, this.A0P);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.A0G = C36401kF.A0O(this, R.id.contact_title);
        if (this.A0k) {
            this.A04 = C012005e.A02(this, R.id.action_pay);
        }
        if (this.A0i) {
            this.A01 = C012005e.A02(this, R.id.action_add_person);
            this.A03 = C012005e.A02(this, R.id.action_call_plus);
            this.A02 = C012005e.A02(this, R.id.action_call);
            this.A08 = C012005e.A02(this, R.id.action_message);
            this.A07 = C012005e.A02(this, R.id.action_search_chat);
            this.A09 = C012005e.A02(this, R.id.action_videocall);
            this.A06 = C012005e.A02(this, R.id.action_request_phone_number);
        }
        this.A0A = C36391kE.A0O(this, R.id.contact_subtitle);
        this.A0g = C36391kE.A0O(this, R.id.contact_username);
        this.A0f = C36391kE.A0O(this, R.id.contact_chat_status);
        if (this.A0j) {
            this.A05 = C012005e.A02(this, R.id.phone_number_hidden_container);
            this.A0h = C36391kE.A0O(this, R.id.phone_number_hidden_text);
        }
        if (getContext() instanceof AnonymousClass155) {
            AnonymousClass155 r0 = (AnonymousClass155) C36391kE.A0E(this);
            this.A0I = r0;
            AnonymousClass04H A0b2 = C36441kJ.A0b(r0);
            if (this.A0k) {
                AnonymousClass3EV r2 = this.A0U;
                Context context = getContext();
                AnonymousClass155 r4 = this.A0I;
                C81323wp r12 = new C81323wp((Object) this, 19);
                AnonymousClass17Y r5 = r2.A00;
                C19730wQ r6 = r2.A01;
                AnonymousClass1EU r9 = r2.A04;
                AnonymousClass1EV r8 = r2.A03;
                this.A0T = new C199029ea(context, r4, r5, r6, r2.A02, r8, r9, (C167527yC) A0b2.A00(C167527yC.class), (Runnable) null, r12, false);
            }
            if (this.A0j) {
                RequestPhoneNumberViewModel requestPhoneNumberViewModel = (RequestPhoneNumberViewModel) A0b2.A00(RequestPhoneNumberViewModel.class);
                this.A0X = requestPhoneNumberViewModel;
                this.A0W = this.A0E.A00(this.A0I, requestPhoneNumberViewModel);
            }
        }
        if (C36431kI.A1X(this.A0P)) {
            C36341k9.A0y(this.A0f);
            TextSwitcher textSwitcher = (TextSwitcher) findViewById(R.id.status_text_switcher);
            this.A0e = textSwitcher;
            if (textSwitcher != null) {
                textSwitcher.setInAnimation(getContext(), R.anim.f1nameremoved);
                this.A0e.setOutAnimation(getContext(), R.anim.f1nameremoved);
            }
        }
        if (!(this instanceof NewsletterDetailsCard)) {
            C66933Xw.A00(this.A08, this, 8);
            C66933Xw.A00(this.A07, this, 9);
            C66933Xw.A00(this.A03, this, 10);
            C66933Xw.A00(this.A04, this, 11);
            C66933Xw.A00(this.A02, this, 12);
            C66933Xw.A00(this.A09, this, 13);
            C66933Xw.A00(this.A06, this, 14);
        }
    }

    public void setContactInfoLoggingEvent(C45702Sj r1) {
        this.A0R = r1;
    }

    public void setContactTextStatus(String str) {
        setContactStatusHelper(str);
    }

    public void setInteropContactInfo(boolean z) {
        this.A0c = z;
    }

    public void setPaymentEligibility(int i) {
        this.A00 = i;
    }

    public void setProfileEntryPoint(Integer num) {
    }

    public ContactDetailsCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ContactDetailsCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
