package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9mP  reason: invalid class name and case insensitive filesystem */
public class C202679mP {
    public final long A00;
    public final long A01;
    public final Set A02;
    public final Set A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C202679mP r7 = (C202679mP) obj;
            if (this.A00 != r7.A00 || this.A01 != r7.A01 || !this.A02.equals(r7.A02) || !this.A03.equals(r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        C90474aD.A1S(objArr, this.A00);
        C36421kH.A1P(objArr, this.A01);
        objArr[2] = this.A02;
        return AnonymousClass000.A0M(this.A03, objArr, 3);
    }

    public static C202679mP A01(C202679mP r10, C202679mP r11) {
        long max = Math.max(r10.A00, r11.A00);
        long max2 = Math.max(r10.A01, r11.A01);
        HashSet A0k = C90524aI.A0k(r10.A02);
        A0k.addAll(r11.A02);
        Iterator it = A0k.iterator();
        while (it.hasNext()) {
            if (((C196099Xq) it.next()).A00 < max) {
                it.remove();
            }
        }
        if (A0k.size() > 1000) {
            ArrayList A15 = C36441kJ.A15(A0k);
            Collections.sort(A15, AXb.A00);
            List subList = A15.subList(0, 1000);
            A0k = C90524aI.A0k(subList);
            max = ((C196099Xq) C36401kF.A0n(subList)).A00;
        }
        HashSet A0k2 = C90524aI.A0k(r10.A03);
        A0k2.addAll(r11.A03);
        if (max2 <= max) {
            max2 = 0;
        }
        return new C202679mP(A0k, A0k2, max, max2);
    }

    public static C202679mP A02(AnonymousClass8QJ r17, boolean z) {
        if (z) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            AnonymousClass8QJ r3 = r17;
            long millis = timeUnit.toMillis(r3.lastMessageTimestamp_);
            long millis2 = timeUnit.toMillis(r3.lastSystemMessageTimestamp_);
            int i = r3.bitField0_;
            if ((i & 1) == 0 || (i & 2) == 0 || millis2 > millis) {
                C23122B6c<AnonymousClass8PS> b6c = r3.messages_;
                HashSet A16 = C36441kJ.A16();
                HashSet A162 = C36441kJ.A16();
                for (AnonymousClass8PS r1 : b6c) {
                    if ((r1.bitField0_ & 1) != 0) {
                        AnonymousClass8SW r0 = r1.key_;
                        AnonymousClass8SW r32 = r0;
                        if (r0 == null) {
                            r0 = AnonymousClass8SW.DEFAULT_INSTANCE;
                        }
                        if ((r0.bitField0_ & 2) != 0) {
                            AnonymousClass8SW r02 = r32;
                            if (r32 == null) {
                                r02 = AnonymousClass8SW.DEFAULT_INSTANCE;
                            }
                            if ((r02.bitField0_ & 4) != 0) {
                                AnonymousClass8SW r03 = r32;
                                if (r32 == null) {
                                    r03 = AnonymousClass8SW.DEFAULT_INSTANCE;
                                }
                                if ((r03.bitField0_ & 1) != 0) {
                                    if (r32 == null) {
                                        r32 = AnonymousClass8SW.DEFAULT_INSTANCE;
                                    }
                                    AnonymousClass11F A0N = C36421kH.A0N(r32.remoteJid_);
                                    if (A0N != null) {
                                        UserJid A0l = C36431kI.A0l(r32.participant_);
                                        boolean z2 = r32.fromMe_;
                                        if (!AnonymousClass143.A0G(A0N) || z2 || A0l != null) {
                                            C196099Xq r6 = new C196099Xq(A0N, A0l, r32.id_, TimeUnit.SECONDS.toMillis(r1.timestamp_), z2);
                                            if (r6.A00 == 0) {
                                                A162.add(r6);
                                            } else {
                                                A16.add(r6);
                                            }
                                        } else {
                                            throw new AnonymousClass1AD(11);
                                        }
                                    } else {
                                        throw new AnonymousClass1AD(10);
                                    }
                                } else {
                                    throw new AnonymousClass1AD(7);
                                }
                            } else {
                                throw new AnonymousClass1AD(9);
                            }
                        } else {
                            throw new AnonymousClass1AD(8);
                        }
                    } else {
                        throw new AnonymousClass1AD(6);
                    }
                }
                if (A16.size() <= 1000) {
                    return new C202679mP(A16, A162, millis, millis2);
                }
                throw new AnonymousClass1AD(5);
            }
            throw new AnonymousClass1AD(2);
        }
        throw new AnonymousClass1AD(1);
    }

    public static boolean A03(C202679mP r8, C202679mP r9) {
        for (Object next : r9.A03) {
            if (!r8.A02.contains(next) && !r8.A03.contains(next)) {
                return false;
            }
        }
        for (C196099Xq r5 : r9.A02) {
            if (r5.A00 > r8.A00 && !r8.A02.contains(r5) && !r8.A03.contains(r5)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass8QJ A04() {
        C172198Mx r2 = (C172198Mx) AnonymousClass8QJ.DEFAULT_INSTANCE.A0p();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(this.A00);
        long seconds2 = timeUnit.toSeconds(this.A01);
        if (seconds > 0) {
            AnonymousClass8QJ r1 = (AnonymousClass8QJ) C90524aI.A0H(r2);
            r1.bitField0_ |= 1;
            r1.lastMessageTimestamp_ = seconds;
        }
        if (seconds2 > 0) {
            AnonymousClass8QJ r12 = (AnonymousClass8QJ) C90524aI.A0H(r2);
            r12.bitField0_ |= 2;
            r12.lastSystemMessageTimestamp_ = seconds2;
        }
        for (C196099Xq A002 : this.A02) {
            r2.A0U(A002.A00());
        }
        for (C196099Xq A003 : this.A03) {
            r2.A0U(A003.A00());
        }
        return (AnonymousClass8QJ) r2.A0R();
    }

    public C202679mP(Set set, Set set2, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = set;
        this.A03 = set2;
    }

    public static int A00(C202679mP r1, C202679mP r2) {
        boolean A032 = A03(r1, r2);
        boolean A033 = A03(r2, r1);
        if (A032) {
            return C165587tf.A03(A033 ? 1 : 0);
        }
        if (A033) {
            return 1;
        }
        return 3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SyncdMessageRange{lastMessageTimestamp=");
        A0u.append(this.A00);
        A0u.append(", lastSystemMessageTimestamp=");
        A0u.append(this.A01);
        A0u.append(", messages=");
        A0u.append(this.A02);
        A0u.append(", messagesWithoutTimestamp=");
        return C90464aC.A0X(this.A03, A0u);
    }
}
