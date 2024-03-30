package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.62k  reason: invalid class name and case insensitive filesystem */
public final class C1260662k {
    public final AnonymousClass16D A00;
    public final AnonymousClass171 A01;
    public final C18820ts A02;

    public final C143796r8 A00(AnonymousClass6OZ r14) {
        boolean z;
        int i;
        Object[] objArr;
        int i2;
        C61243Bc A0O;
        String A0T;
        int i3;
        String A0O2;
        UserJid userJid;
        CallState callState = r14.A09;
        AnonymousClass00C.A07(callState);
        CallState callState2 = CallState.RECEIVED_CALL;
        boolean A1a = C36361kB.A1a(callState, callState2);
        boolean z2 = true;
        int i4 = R.color.f6nameremoved;
        if (A1a) {
            i4 = R.color.f6nameremoved;
        }
        if (callState == callState2) {
            z = true;
            i = 0;
        } else {
            z = false;
            boolean z3 = r14.A0N;
            i = R.drawable.ic_action_audio_call_filled;
            if (z3) {
                i = R.drawable.ic_action_video_call_filled;
            }
        }
        boolean z4 = r14.A0J;
        if (z4) {
            z2 = z;
            AnonymousClass147 r1 = r14.A06;
            if (r1 != null) {
                String A0T2 = this.A01.A0T(r1);
                if (A0T2 != null) {
                    A0O = new C47842fr(A0T2);
                }
                objArr = C90524aI.A0w();
                i2 = R.string.f12nameremoved;
                A0O = C90524aI.A0O(objArr, i2);
            } else {
                Collection values = r14.A04.values();
                ArrayList A13 = C36411kG.A13(values);
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    AnonymousClass6EE A0J = C90524aI.A0J(it);
                    if (!A0J.A0J && (userJid = A0J.A08) != null) {
                        A13.add(userJid);
                    }
                }
                A0O = AnonymousClass3UD.A04(this.A00, this.A01, A13, 1, false);
                if (A0O == null) {
                    objArr = new Object[0];
                    i2 = R.string.f12nameremoved;
                    A0O = C90524aI.A0O(objArr, i2);
                }
            }
        } else if (!z4) {
            if (!z && !C131856Qx.A01(callState)) {
                z2 = false;
            }
            UserJid userJid2 = r14.A08;
            String str = null;
            if (!(userJid2 == null || (A0T = this.A01.A0T(userJid2)) == null)) {
                int ordinal = callState.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 3) {
                        i3 = R.string.f12nameremoved;
                    } else if (ordinal == 2) {
                        i3 = R.string.f12nameremoved;
                    } else if (ordinal == 5 || ordinal == 4) {
                        i3 = R.string.f12nameremoved;
                    } else {
                        A0O2 = null;
                    }
                    A0O2 = C90524aI.A0O(new Object[0], i3);
                } else {
                    i3 = R.string.f12nameremoved;
                    A0O2 = C90524aI.A0O(new Object[0], i3);
                }
                long j = r14.A03;
                Long valueOf = Long.valueOf(j);
                if (j > 0 && valueOf != null) {
                    str = AnonymousClass3UY.A07(this.A02, TimeUnit.MILLISECONDS.toSeconds(j));
                }
                if (A0O2 == null) {
                    A0O2 = str;
                    if (str == null) {
                        A0O = new C47842fr(A0T);
                    }
                }
                objArr = C36411kG.A1b(A0T);
                objArr[1] = A0O2;
                i2 = R.string.f12nameremoved;
                A0O = C90524aI.A0O(objArr, i2);
            }
            objArr = C90524aI.A0w();
            i2 = R.string.f12nameremoved;
            A0O = C90524aI.A0O(objArr, i2);
        } else {
            throw C36441kJ.A18();
        }
        return new C143796r8(A0O, i4, i, z2);
    }

    public C1260662k(AnonymousClass16D r1, AnonymousClass171 r2, C18820ts r3) {
        C36321k7.A11(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
