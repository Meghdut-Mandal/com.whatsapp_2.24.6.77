package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1HX  reason: invalid class name */
public final class AnonymousClass1HX {
    public final C25681Hg A00;
    public final C25691Hh A01;
    public final C25621Ha A02;
    public final C25661He A03;
    public final AnonymousClass005 A04;
    public final C19730wQ A05;
    public final C19630wG A06;
    public final C232617u A07;
    public final C20810yC A08;
    public final C24961El A09;

    public AnonymousClass1HX(C19730wQ r2, C25681Hg r3, C25691Hh r4, C25621Ha r5, C25661He r6, C19630wG r7, C232617u r8, C20810yC r9, C24961El r10, AnonymousClass005 r11) {
        AnonymousClass00C.A0D(r7, 1);
        AnonymousClass00C.A0D(r9, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r2, 4);
        AnonymousClass00C.A0D(r5, 5);
        AnonymousClass00C.A0D(r4, 6);
        AnonymousClass00C.A0D(r10, 7);
        AnonymousClass00C.A0D(r6, 8);
        AnonymousClass00C.A0D(r11, 9);
        AnonymousClass00C.A0D(r8, 10);
        this.A06 = r7;
        this.A08 = r9;
        this.A00 = r3;
        this.A05 = r2;
        this.A02 = r5;
        this.A01 = r4;
        this.A09 = r10;
        this.A03 = r6;
        this.A04 = r11;
        this.A07 = r8;
    }

    public UserJid A01(List list) {
        Object obj;
        AnonymousClass11F r3 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C197029b1.A00(((C80163ux) obj).A00)) {
                    break;
                }
            }
            C80163ux r1 = (C80163ux) obj;
            if (r1 != null) {
                r3 = r1.A00;
            }
        }
        return (UserJid) r3;
    }

    public Integer A02(AnonymousClass3T1 r5) {
        int i;
        AnonymousClass11F r2 = r5.A1J.A00;
        if (r2 == null) {
            return null;
        }
        if (C197029b1.A00(r2)) {
            return 0;
        }
        if (A01(r5.A0w) != null) {
            i = 1;
        } else if (!A00(this, r2)) {
            return null;
        } else {
            i = 2;
        }
        return Integer.valueOf(i);
    }

    public String A03(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        AnonymousClass6E1 A002 = ((AnonymousClass6BB) this.A04.get()).A00(userJid);
        if (A002 != null) {
            return A002.A07;
        }
        Context context = this.A06.A00;
        AnonymousClass00C.A08(context);
        String string = context.getString(R.string.f12nameremoved);
        AnonymousClass00C.A08(string);
        return string;
    }

    public boolean A05(Jid jid, int i) {
        AnonymousClass00C.A0D(jid, 0);
        if (i == 88) {
            C222713q r0 = AnonymousClass11F.A00;
            if (!C197029b1.A00(C222713q.A00(jid))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A06(AnonymousClass3T1 r3) {
        AnonymousClass00C.A0D(r3, 0);
        if (C197029b1.A00(r3.A1J.A00) || ((!r3.A1E() && A01(r3.A0w) == null) || r3.A06 != 0)) {
            return false;
        }
        return true;
    }

    public boolean A07(AnonymousClass3T1 r7) {
        byte[] bArr;
        C20810yC r2 = this.A08;
        C21000yV r1 = C21000yV.A02;
        if (C20800yB.A01(r1, r2, 4274)) {
            if (C20800yB.A01(r1, r2, 4165)) {
                AnonymousClass3T1 A0S = r7.A0S();
                if (C197029b1.A00(r7.A0J()) && A0S != null) {
                    return A0S.A1J.A02;
                }
            } else if (r7 instanceof AnonymousClass2bK) {
                AnonymousClass2bK r72 = (AnonymousClass2bK) r7;
                if (C197029b1.A00(r72.A0J()) && (bArr = r72.A02) != null) {
                    try {
                        AnonymousClass8R0 r3 = ((C172838Pj) C170918Hz.A08(C172838Pj.DEFAULT_INSTANCE, bArr)).botInfo_;
                        if (r3 == null) {
                            r3 = AnonymousClass8R0.DEFAULT_INSTANCE;
                        }
                        if ((r3.bitField0_ & 8) == 0 || !this.A05.A0M(AnonymousClass143.A00(Jid.Companion.A02(r3.targetSenderJid_)))) {
                            return false;
                        }
                        return true;
                    } catch (AnonymousClass186 e) {
                        Log.e("BonsaiUtilImpl/isBotResponseRequesterRevokeEnabled/", e);
                    }
                }
            }
        }
        return false;
    }

    public boolean A08(AnonymousClass3T1 r3) {
        AnonymousClass3KQ A0N;
        AnonymousClass00C.A0D(r3, 0);
        if (!(r3 instanceof AnonymousClass2bV) || !C63903Lw.A00(r3) || r3.A0N() == null || r3.A0M() == null || (A0N = r3.A0N()) == null || A0N.A00 == null) {
            return false;
        }
        return true;
    }

    public static final boolean A00(AnonymousClass1HX r3, AnonymousClass11F r4) {
        AnonymousClass6X6 A092;
        C20760y7 A072;
        if (!(r4 instanceof AnonymousClass144) || (A092 = r3.A07.A09((AnonymousClass144) r4)) == null || (A072 = A092.A07()) == null) {
            return false;
        }
        if ((A072 instanceof Collection) && A072.isEmpty()) {
            return false;
        }
        Iterator it = A072.iterator();
        while (it.hasNext()) {
            if (C197029b1.A00(((AnonymousClass6PM) it.next()).A03)) {
                return true;
            }
        }
        return false;
    }

    public void A04(C52232p6 r4) {
        C25661He r2 = this.A03;
        if (r4 == r2.A01()) {
            return;
        }
        if (r4.ordinal() != 1) {
            r2.A03();
        } else {
            r2.A04();
        }
    }

    public boolean A09(AnonymousClass3T1 r5) {
        AnonymousClass11F r3 = r5.A1J.A00;
        if (r3 instanceof UserJid) {
            if (C20800yB.A01(C21000yV.A02, this.A08, 3142) || C197029b1.A00(r3)) {
                return true;
            }
        }
        if ((r5.A0J() instanceof UserJid) && C197029b1.A00(r5.A0L())) {
            return true;
        }
        if ((r5.A1E() || A01(r5.A0w) != null) && r5.A06 == 0) {
            return true;
        }
        return false;
    }
}
