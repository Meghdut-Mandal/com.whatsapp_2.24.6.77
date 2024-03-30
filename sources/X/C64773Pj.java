package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.chatinfo.view.custom.ContactDetailsCard;

/* renamed from: X.3Pj  reason: invalid class name and case insensitive filesystem */
public class C64773Pj {
    public Runnable A00;
    public Runnable A01;
    public boolean A02;
    public final Handler A03 = C36341k9.A0H();
    public final AnonymousClass17Y A04;
    public final C19730wQ A05;
    public final ContactDetailsCard A06;
    public final AnonymousClass16D A07;
    public final AnonymousClass171 A08;
    public final C21060yb A09;
    public final C18820ts A0A;
    public final C20810yC A0B;
    public final C32831eG A0C;
    public final C24631De A0D;
    public final AnonymousClass1FR A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final C32621dv A0H;
    public final C19970wo A0I;
    public final C32931eR A0J;
    public final C19770wU A0K;

    public static void A00(C64773Pj r3, AnonymousClass141 r4) {
        C19970wo r1 = r3.A0I;
        ContactDetailsCard contactDetailsCard = r3.A06;
        String A012 = AnonymousClass3SX.A01(contactDetailsCard.getContext(), r1, r4);
        if (!AnonymousClass14B.A0F(A012)) {
            contactDetailsCard.setContactTextStatus(A012);
        }
        r3.A02 = true;
    }

    public void A01(AnonymousClass141 r8) {
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A03.removeCallbacksAndMessages(runnable);
        }
        Runnable runnable2 = this.A00;
        if (runnable2 != null) {
            this.A03.removeCallbacksAndMessages(runnable2);
        }
        String A002 = this.A0H.A00(r8);
        if (!r8.A0B() || TextUtils.isEmpty(A002)) {
            this.A06.setContactChatStatusVisibility(8);
            if (r8.A0B() && C36431kI.A1X(this.A0B)) {
                A00(this, r8);
                return;
            }
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(A002.substring(0, 1).toUpperCase(C36401kF.A0x(this.A0A)));
        String A0q = AnonymousClass000.A0q(A002.substring(1), A0u);
        ContactDetailsCard contactDetailsCard = this.A06;
        contactDetailsCard.setContactChatStatusVisibility(0);
        contactDetailsCard.setContactChatStatus(A0q);
        if (A0q != null && C36431kI.A1X(this.A0B)) {
            Context context = contactDetailsCard.getContext();
            if (!this.A02 || context == null || !A0q.equals(context.getString(R.string.f12nameremoved))) {
                C1501974i r2 = new C1501974i(this, r8, 40);
                this.A01 = r2;
                Handler handler = this.A03;
                handler.postDelayed(r2, 3000);
                if (context != null && A0q.equals(contactDetailsCard.getContext().getString(R.string.f12nameremoved))) {
                    AnonymousClass751 r22 = new AnonymousClass751(33, A0q, this);
                    this.A00 = r22;
                    handler.postDelayed(r22, 6000);
                }
            }
        }
    }

    public void A02(String str) {
        if (str == null || str.isEmpty()) {
            this.A06.setUsername("");
        } else if (str.charAt(0) == '@') {
            this.A06.setUsername(str);
        }
    }

    public C64773Pj(C32621dv r2, AnonymousClass17Y r3, C19730wQ r4, ContactDetailsCard contactDetailsCard, AnonymousClass16D r6, AnonymousClass171 r7, C21060yb r8, C19970wo r9, C18820ts r10, C20810yC r11, C45702Sj r12, C32931eR r13, C32831eG r14, C24631De r15, AnonymousClass1FR r16, C19770wU r17, boolean z, boolean z2) {
        this.A0I = r9;
        this.A04 = r3;
        this.A0G = z;
        this.A0F = z2;
        this.A0B = r11;
        this.A05 = r4;
        this.A0E = r16;
        this.A07 = r6;
        this.A0H = r2;
        this.A09 = r8;
        this.A08 = r7;
        this.A0A = r10;
        this.A06 = contactDetailsCard;
        contactDetailsCard.A0R = r12;
        this.A0D = r15;
        this.A0J = r13;
        this.A0K = r17;
        this.A0C = r14;
    }
}
