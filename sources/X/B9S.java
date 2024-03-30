package X;

import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public class B9S implements C22954Az6 {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public B9S(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void BfL(UserJid userJid, C135086c7 r8, C135086c7 r9, C135086c7 r10, C202059ky r11, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C167797yq r2;
        C180268lU r1;
        C194139Og r3;
        C167797yq r22;
        C194139Og r12;
        C28201Rs r13;
        C194139Og r32;
        String A012;
        int i = this.A03;
        Object obj = this.A00;
        boolean z6 = z3;
        if (i != 0) {
            C167797yq r23 = (C167797yq) obj;
            C180138lG r14 = (C180138lG) this.A01;
            String str4 = this.A02;
            r14.A01 = 0;
            r14.A02 = 8;
            C001700s r15 = r23.A01;
            r15.A0D(r15.A04());
            if (r11 != null || !z) {
                C165567td.A15(r23.A0c, r11, "viewContactInfo error: ", AnonymousClass000.A0u());
                if (r11 == null || (A012 = r23.A0a.A01(r11.A00)) == null) {
                    r13 = r23.A08;
                    r32 = new C194139Og(6);
                } else {
                    r32 = new C194139Og(8);
                    r32.A0C = A012;
                    r13 = r23.A08;
                }
                r13.A0D(r32);
                return;
            } else if (userJid != null) {
                C24611Dc r4 = r23.A0c;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("viewContactInfo jid: ");
                A0u.append(userJid);
                r4.A06(C36371kC.A0z(" blocked: ", A0u, z6));
                AnonymousClass1NG r16 = r23.A0L;
                UserJid A0b = C36401kF.A0b(userJid);
                C18740tg.A06(A0b);
                if (z6 != r16.A0O(A0b)) {
                    r16.A0K((AnonymousClass3EB) null);
                }
                C194139Og r17 = new C194139Og(4);
                r17.A03 = r23.A0M.A0D(userJid);
                r22 = r23;
                r12 = r17;
            } else {
                C194139Og r18 = new C194139Og(5);
                r18.A0F = str4;
                r18.A0E = str;
                r2 = r23;
                r1 = r18;
                r1.A07 = r8;
                r1.A0B = str3;
                r22 = r2;
                r12 = r1;
            }
        } else {
            C180338lb r24 = (C180338lb) obj;
            C135086c7 r5 = (C135086c7) this.A01;
            String str5 = this.A02;
            C24611Dc r42 = r24.A0c;
            r42.A06("IN- HANDLE_SEND_AGAIN vpa valid check response");
            r24.A0p(false);
            if (!z || r11 != null) {
                if (!z3) {
                    if (r11 != null) {
                        r42.A06("IN- HANDLE_SEND_AGAIN error from server");
                        r3 = new C194139Og(8);
                        C199729fr A032 = r24.A04.A03(r24.A05.A04, r11.A00);
                        String str6 = null;
                        if (A032.A00 != 0) {
                            str6 = A032.A01(r24.A0P.A00);
                        } else {
                            StringBuilder A0u2 = AnonymousClass000.A0u();
                            A0u2.append("Unhandled error code : ");
                            r42.A05(C36381kD.A10(A0u2, r11.A00));
                        }
                        if (TextUtils.isEmpty(str6)) {
                            str6 = r24.A0P.A00.getString(R.string.f12nameremoved);
                        }
                        r3.A0C = str6;
                    } else {
                        r42.A05("Unable to validate the receiver to send payment again");
                        return;
                    }
                }
                r42.A06("IN- HANDLE_SEND_AGAIN server said user blocked");
                r3 = new C194139Og(13);
                r3.A06 = userJid;
                r3.A0F = str5;
            } else {
                if (!z3) {
                    r42.A06("IN- HANDLE_SEND_AGAIN starting payment");
                    C180268lU r19 = new C180268lU(105);
                    r19.A00 = r5;
                    r19.A0E = str;
                    r19.A02 = str2;
                    r2 = r24;
                    r1 = r19;
                    r1.A07 = r8;
                    r1.A0B = str3;
                    r22 = r2;
                    r12 = r1;
                }
                r42.A06("IN- HANDLE_SEND_AGAIN server said user blocked");
                r3 = new C194139Og(13);
                r3.A06 = userJid;
                r3.A0F = str5;
            }
            r24.A08.A0D(r3);
            return;
        }
        r22.A08.A0D(r12);
    }
}
