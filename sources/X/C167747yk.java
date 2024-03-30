package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.7yk  reason: invalid class name and case insensitive filesystem */
public class C167747yk extends AnonymousClass04R {
    public AnonymousClass191 A00;
    public B2Z A01;
    public final C001600r A02;
    public final C001700s A03;
    public final C21060yb A04;
    public final C20810yC A05;
    public final AnonymousClass1EU A06;
    public final AnonymousClass9UZ A07;
    public final C198489de A08 = new C198489de((C121835tn) null, (C05250Oz) null, 1);
    public final AnonymousClass1FR A09;
    public final C64933Qa A0A;
    public final AnonymousClass185 A0B;
    public final C19970wo A0C;
    public final AnonymousClass16J A0D;
    public final UserJid A0E;
    public final AnonymousClass1DR A0F;
    public final C19770wU A0G;
    public final boolean A0H;

    public C167747yk(AnonymousClass185 r4, C21060yb r5, C19970wo r6, AnonymousClass16J r7, C20810yC r8, UserJid userJid, AnonymousClass1DR r10, AnonymousClass1EU r11, AnonymousClass9UZ r12, AnonymousClass1FR r13, C64933Qa r14, C19770wU r15, boolean z, boolean z2) {
        this.A05 = r8;
        this.A0G = r15;
        this.A0D = r7;
        this.A0B = r4;
        this.A0F = r10;
        this.A07 = r12;
        this.A0E = userJid;
        this.A0A = r14;
        this.A0H = z;
        this.A09 = r13;
        this.A06 = r11;
        this.A0C = r6;
        this.A04 = r5;
        C001700s A0S = C36431kI.A0S();
        this.A03 = A0S;
        this.A02 = A0S;
        if (!z2) {
            C164897sY r0 = new C164897sY(this, 1);
            this.A00 = r0;
            r7.registerObserver(r0);
            C203349np r02 = new C203349np(this, 4);
            this.A01 = r02;
            r10.registerObserver(r02);
        }
    }

    public C207199ui A0S(C23043B1o b1o, String str, String str2, int i) {
        AnonymousClass00C.A0D(b1o, 3);
        C207199ui A0T = A0T(b1o, str, str2, i, C165597tg.A0B());
        this.A07.A01(A0T, b1o);
        return A0T;
    }

    public final C207199ui A0T(C23043B1o b1o, String str, String str2, int i, long j) {
        String str3;
        C23043B1o b1o2 = b1o;
        AnonymousClass00C.A0D(b1o2, 3);
        int i2 = i;
        if (i2 == 2) {
            str3 = "payment_instruction";
        } else if (i2 == 3) {
            str3 = "confirm";
        } else if (i2 != 6) {
            C165577te.A1M("PaymentCheckoutOrderViewModel", "sendOrderNFM: invalid payment method was selected");
            str3 = "";
        } else {
            str3 = "pix";
        }
        C207199ui A002 = C207219uk.A00(b1o2);
        C207009uP r4 = A002.A09;
        AnonymousClass00C.A07(r4);
        String str4 = A002.A0F;
        return new C207199ui((AnonymousClass16U) null, (C207119ua) null, r4, A002.A0A, (C206979uM) null, (String) null, str4, (String) null, (String) null, (String) null, (String) null, (String) null, str2, str3, (String) null, str, (List) null, (List) null, (List) null, A002.A0K, (byte[]) null, 0, j, true, false);
    }

    public final void A0X(AnonymousClass11F r13, C207199ui r14, C23043B1o b1o) {
        boolean A1a = C36341k9.A1a(r13, b1o);
        AnonymousClass1X4 r4 = this.A07.A00;
        AnonymousClass3T1 r15 = (AnonymousClass3T1) b1o;
        String str = null;
        try {
            str = C202749ma.A05(r14, false).toString();
        } catch (JSONException unused) {
            Log.e("UserActions/userActionSendOrderUpdateMessage failed to build parameter json for order status message");
        }
        C206659tl r7 = null;
        C207089uX r8 = new C207089uX(Collections.singletonList(new C206569tc(new C206969uL("payment_method", str), false)));
        C206659tl r6 = new C206659tl((String) null, (byte[]) null, (String) null);
        AnonymousClass2bZ r2 = new AnonymousClass2bZ(r4.A11.A02(r13, A1a), 55, C19970wo.A00(r4.A0K));
        if (r6.A02 != null) {
            r7 = r6;
        }
        r2.BqZ(new C207219uk(r7, r8, "", (String) null, ""));
        if (r15 != null) {
            r4.A14.A00(r2, r15);
        }
        r4.A0T(r2);
        r4.A0X.A0h(r2);
    }

    public final void A0Z(boolean z) {
        this.A03.A0C(this.A08.A00((C202319lY) null, this.A0E, (C207059uU) null, (C188008yt) null, (AnonymousClass2bZ) null, Boolean.valueOf(this.A0H), (List) null, 0));
        this.A0G.Bp1(new AnonymousClass75B(this, z));
    }

    public static final void A01(C202319lY r4, C167747yk r5) {
        AnonymousClass2bZ r2;
        String str;
        String str2;
        C207199ui r0;
        String str3 = null;
        C199949gJ r02 = (C199949gJ) r5.A08.A00.A01;
        if (r02 != null && (r2 = r02.A05) != null && (str = r4.A0K) != null) {
            C202319lY r03 = r2.A0M;
            if (r03 != null) {
                str2 = r03.A0K;
            } else {
                str2 = null;
            }
            if (!AnonymousClass00C.A0J(str2, str)) {
                C207219uk r04 = r2.A00;
                if (!(r04 == null || (r0 = r04.A01) == null)) {
                    str3 = r0.A06;
                }
                if (!AnonymousClass00C.A0J(str3, r4.A0K)) {
                    return;
                }
            }
            r5.A0W(r4, r2, 1);
        }
    }

    public void A0R() {
        AnonymousClass191 r1 = this.A00;
        if (r1 != null) {
            this.A0D.unregisterObserver(r1);
        }
        B2Z b2z = this.A01;
        if (b2z != null) {
            this.A0F.unregisterObserver(b2z);
        }
    }

    public final void A0U(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("save_order_detail_state_key");
        if (bundle2 != null) {
            boolean z = bundle2.getBoolean("should_show_shimmer_key");
            Parcelable parcelable = bundle2.getParcelable("merchant_jid_key");
            Serializable serializable = bundle2.getSerializable("merchant_status_key");
            this.A0G.Bp1(new AnonymousClass740(this, parcelable, bundle2.getSerializable("checkout_error_code_key"), bundle2.getParcelable("payment_transaction_key"), serializable, bundle2.getParcelableArrayList("installment_option_key"), 1, z));
        }
    }

    public void A0V(C207119ua r9, Integer num, String str) {
        if (this instanceof C179338jy) {
            A0Y(new C206649tk((C206479tT) null, C188008yt.INACTIVE, (List) null));
            return;
        }
        UserJid userJid = this.A0E;
        if (userJid != null) {
            this.A07.A00(r9, userJid, new C23231BAn(this, 1), num, str, false);
        }
    }

    public final void A0W(C202319lY r23, AnonymousClass2bZ r24, int i) {
        C121835tn A002;
        C198489de r4 = this.A08;
        AnonymousClass2bZ r18 = r24;
        int i2 = i;
        if (r24 == null) {
            A002 = r4.A00((C202319lY) null, (UserJid) null, new C207059uU(C187998ys.ORDER_NOT_FOUND, R.string.f12nameremoved, R.string.f12nameremoved), (C188008yt) null, (AnonymousClass2bZ) null, (Boolean) null, (List) null, i2);
        } else {
            A002 = r4.A00(r23, (UserJid) null, (C207059uU) null, (C188008yt) null, r18, (Boolean) null, (List) null, i2);
        }
        this.A03.A0C(A002);
    }

    public final void A0Y(C206649tk r12) {
        this.A03.A0C(this.A08.A00((C202319lY) null, (UserJid) null, (C207059uU) null, r12.A01, (AnonymousClass2bZ) null, (Boolean) null, r12.A02, 0));
    }

    public final boolean A0a() {
        AnonymousClass185 r1 = this.A0B;
        C222813r r0 = UserJid.Companion;
        AnonymousClass3L0 A012 = r1.A01(C222813r.A00(this.A0E));
        if (A012 == null || !A012.A01()) {
            return false;
        }
        return true;
    }
}
