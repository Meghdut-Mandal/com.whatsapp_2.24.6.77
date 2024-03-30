package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: X.9k5  reason: invalid class name and case insensitive filesystem */
public abstract class C201669k5 {
    public static final Set A08 = Collections.unmodifiableSet(C36421kH.A0g(new String[]{"regular", "regular_low", "regular_high", "critical_block", "critical_unblock_low"}));
    public static final Set A09 = Collections.unmodifiableSet(C36421kH.A0g(new String[]{"critical_block", "critical_unblock_low"}));
    public C201539jo A00;
    public byte[] A01;
    public boolean A02;
    public final int A03;
    public final long A04;
    public final C199769fw A05;
    public final String A06;
    public final String A07;

    public synchronized void A08(boolean z) {
        this.A02 = z;
    }

    public synchronized boolean A09() {
        return this.A02;
    }

    public boolean equals(Object obj) {
        byte[] A0o;
        byte[] A0o2;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C201669k5 r5 = (C201669k5) obj;
            if (!Arrays.equals(A0A(), r5.A0A()) || !this.A05.equals(r5.A05)) {
                return false;
            }
            AnonymousClass8SS A052 = A05();
            if (A052 == null) {
                A0o = null;
            } else {
                A0o = A052.A0o();
            }
            AnonymousClass8SS A053 = r5.A05();
            if (A053 == null) {
                A0o2 = null;
            } else {
                A0o2 = A053.A0o();
            }
            return Arrays.equals(A0o, A0o2);
        }
    }

    public static void A02(C201669k5 r2, StringBuilder sb) {
        sb.append(", timestamp=");
        sb.append(r2.A04);
        sb.append(", areDependenciesMissing=");
        sb.append(r2.A09());
    }

    public static void A03(C201669k5 r1, StringBuilder sb) {
        sb.append(", timestamp=");
        sb.append(r1.A04);
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8LN r4 = (AnonymousClass8LN) AnonymousClass8SS.DEFAULT_INSTANCE.A0p();
        long j = this.A04;
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(r4);
        A0H.bitField0_ |= 1;
        A0H.timestamp_ = j;
        return r4;
    }

    public String A06() {
        if (!(this instanceof C176018bR)) {
            return A00(A0A());
        }
        String str = ((C176018bR) this).A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[\"removeRecentSticker\",\"");
        A0u.append(str);
        return AnonymousClass000.A0q("\"]", A0u);
    }

    public String A07() {
        if (this instanceof C176008bQ) {
            return "userStatusMute";
        }
        if (this instanceof C175998bP) {
            return "setting_unarchiveChats";
        }
        if (this instanceof C175948bK) {
            return "status_privacy";
        }
        if (this instanceof C176128bc) {
            return "star";
        }
        if (this instanceof C176028bS) {
            return "shareOwnPn";
        }
        if (this instanceof C175988bO) {
            return "sentinel";
        }
        if (this instanceof C176018bR) {
            return "removeRecentSticker";
        }
        if (this instanceof C175978bN) {
            return "primary_feature";
        }
        if (this instanceof C176038bT) {
            return "pnForLidChat";
        }
        if (this instanceof C176108ba) {
            return "pin_v1";
        }
        if (this instanceof C176098bZ) {
            return "mute";
        }
        if (this instanceof C176068bW) {
            return "markChatAsRead";
        }
        if (this instanceof C176088bY) {
            return "lock";
        }
        if (this instanceof C176118bb) {
            return "deleteMessageForMe";
        }
        if (this instanceof C176048bU) {
            return "deleteChat";
        }
        if (this instanceof C176058bV) {
            return "clearChat";
        }
        if (this instanceof C176078bX) {
            return "archive";
        }
        if (this instanceof C175968bM) {
            return "android_unsupported_actions";
        }
        return ((C175958bL) this).A00.A0C();
    }

    public String[] A0A() {
        String str;
        String[] strArr;
        C64933Qa r2;
        AnonymousClass11F r0;
        String[] A1S;
        String rawString;
        if (this instanceof C176008bQ) {
            A1S = C36441kJ.A1S();
            A1S[0] = "userStatusMute";
            rawString = ((C176008bQ) this).A00.getRawString();
        } else {
            if (this instanceof C175998bP) {
                str = "setting_unarchiveChats";
            } else if (this instanceof C175948bK) {
                str = "status_privacy";
            } else {
                if (this instanceof C176128bc) {
                    C176128bc r1 = (C176128bc) this;
                    strArr = new String[]{"star"};
                    r2 = r1.A01;
                    r0 = r1.A00;
                } else if (this instanceof C176028bS) {
                    C223313w r12 = ((C176028bS) this).A00;
                    String[] A1S2 = C36441kJ.A1S();
                    C165567td.A14(r12, "shareOwnPn", A1S2);
                    return A1S2;
                } else if (this instanceof C175988bO) {
                    A1S = C36441kJ.A1S();
                    A1S[0] = "sentinel";
                    rawString = this.A06;
                } else if (this instanceof C176018bR) {
                    A1S = C36441kJ.A1S();
                    A1S[0] = "removeRecentSticker";
                    rawString = ((C176018bR) this).A01;
                } else if (this instanceof C175978bN) {
                    str = "primary_feature";
                } else if (this instanceof C176038bT) {
                    C223313w r13 = ((C176038bT) this).A00;
                    String[] A1S3 = C36441kJ.A1S();
                    C165567td.A14(r13, "pnForLidChat", A1S3);
                    return A1S3;
                } else if (this instanceof C176108ba) {
                    AnonymousClass11F r14 = ((C176108ba) this).A00;
                    String[] A1S4 = C36441kJ.A1S();
                    C165567td.A14(r14, "pin_v1", A1S4);
                    return A1S4;
                } else if (this instanceof C176098bZ) {
                    A1S = C36441kJ.A1S();
                    A1S[0] = "mute";
                    rawString = ((C176098bZ) this).A01.getRawString();
                } else if (this instanceof C176068bW) {
                    AnonymousClass11F r15 = ((C176068bW) this).A01;
                    String[] A1S5 = C36441kJ.A1S();
                    C165567td.A14(r15, "markChatAsRead", A1S5);
                    return A1S5;
                } else if (this instanceof C176088bY) {
                    AnonymousClass11F r16 = ((C176088bY) this).A00;
                    String[] A1S6 = C36441kJ.A1S();
                    C165567td.A14(r16, "lock", A1S6);
                    return A1S6;
                } else if (this instanceof C176118bb) {
                    C176118bb r17 = (C176118bb) this;
                    strArr = new String[]{"deleteMessageForMe"};
                    r2 = r17.A02;
                    r0 = r17.A01;
                } else if (this instanceof C176048bU) {
                    C176048bU r02 = (C176048bU) this;
                    AnonymousClass11F r22 = r02.A01;
                    boolean z = r02.A02;
                    String[] strArr2 = new String[3];
                    C165567td.A14(r22, "deleteChat", strArr2);
                    strArr2[2] = C165617ti.A0Y(z ? 1 : 0);
                    return strArr2;
                } else if (this instanceof C176058bV) {
                    C176058bV r03 = (C176058bV) this;
                    AnonymousClass11F r3 = r03.A01;
                    boolean z2 = r03.A03;
                    boolean z3 = r03.A02;
                    String[] strArr3 = new String[4];
                    C165567td.A14(r3, "clearChat", strArr3);
                    strArr3[2] = C165617ti.A0Y(z2 ? 1 : 0);
                    strArr3[3] = C165617ti.A0Y(z3 ? 1 : 0);
                    return strArr3;
                } else if (this instanceof C176078bX) {
                    AnonymousClass11F r18 = ((C176078bX) this).A01;
                    String[] A1S7 = C36441kJ.A1S();
                    C165567td.A14(r18, "archive", A1S7);
                    return A1S7;
                } else if (this instanceof C175968bM) {
                    str = "android_unsupported_actions";
                } else {
                    C175958bL r19 = (C175958bL) this;
                    String[] A1S8 = C36441kJ.A1S();
                    A1S8[0] = r19.A00.A0C();
                    A1S8[1] = r19.A02;
                    return (String[]) AnonymousClass02R.A0C(A1S8).toArray(new String[0]);
                }
                return C201839kV.A01(r0, r2, strArr);
            }
            return new String[]{str};
        }
        A1S[1] = rawString;
        return A1S;
    }

    public C201669k5(C199769fw r1, C201539jo r2, String str, String str2, int i, long j, boolean z) {
        this.A04 = j;
        this.A07 = str;
        this.A03 = i;
        this.A00 = r2;
        this.A05 = r1;
        this.A06 = str2;
        this.A02 = z;
    }

    public static String A00(String[] strArr) {
        JSONArray A0u = C90524aI.A0u();
        for (String put : strArr) {
            A0u.put(put);
        }
        String obj = A0u.toString();
        C18740tg.A06(obj);
        return obj;
    }

    public static void A01(C201669k5 r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A07);
    }

    public AnonymousClass8SS A05() {
        AnonymousClass8LN A042 = A04();
        if (A042 == null) {
            return null;
        }
        return (AnonymousClass8SS) A042.A0R();
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1J(A1Q, Arrays.hashCode(A0A()));
        A1Q[1] = this.A05;
        return C90484aE.A0D(A05(), A1Q);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A01(this, "SyncMutation{rowId='", A0u);
        A0u.append('\'');
        A03(this, A0u);
        A0u.append(", operation=");
        A0u.append(this.A05);
        A0u.append(", collectionName='");
        A0u.append(this.A06);
        A0u.append('\'');
        A0u.append(", version=");
        A0u.append(this.A03);
        A0u.append(", keyId=");
        A0u.append(this.A00);
        A0u.append(", areDependenciesMissing=");
        A0u.append(this.A02);
        return AnonymousClass000.A0s(A0u);
    }
}
