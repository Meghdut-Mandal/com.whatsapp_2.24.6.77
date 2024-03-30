package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1Fe  reason: invalid class name and case insensitive filesystem */
public class C25151Fe implements AnonymousClass00M {
    public final C19700wN A00;
    public final C19730wQ A01;
    public final AnonymousClass189 A02;
    public final AnonymousClass17X A03;
    public final AnonymousClass1FN A04;
    public final C230717b A05;
    public final C25191Fi A06;
    public final C231417i A07;
    public final C25181Fh A08;
    public final C25171Fg A09;
    public final C25161Ff A0A;

    public static HashSet A01(C25151Fe r4, AnonymousClass11F r5, int i) {
        HashSet A042;
        HashSet hashSet = new HashSet();
        if (i == 58) {
            AnonymousClass17X r3 = r4.A03;
            C222713q r0 = AnonymousClass11F.A00;
            AnonymousClass144 A002 = AnonymousClass6H4.A00(r5);
            C18740tg.A06(A002);
            hashSet.addAll(r3.A07.A0C(A002).A0I(r4.A01, false));
            AnonymousClass6XG.A01(C67623aD.A00, hashSet);
        } else {
            if (i == 69) {
                if (r5 instanceof UserJid) {
                    hashSet.add(DeviceJid.of(r5));
                    return hashSet;
                } else if (AnonymousClass143.A0G(r5) && r4.A0A.A01(r5)) {
                    A042 = A02(r4, r5, (AnonymousClass3T1) null);
                }
            } else if (i == 77 && (r5 instanceof UserJid)) {
                A042 = r4.A04(r5);
            }
            hashSet.addAll(A042);
            return hashSet;
        }
        return hashSet;
    }

    public static HashSet A02(C25151Fe r5, AnonymousClass11F r6, AnonymousClass3T1 r7) {
        Object obj;
        HashSet hashSet = new HashSet();
        if (r6 instanceof UserJid) {
            return r5.A04(r6);
        }
        if (r5.A08.A00(r7)) {
            hashSet = new HashSet();
            C225614x it = C20760y7.copyOf(r5.A03.A07.A0C((AnonymousClass144) r6).A07.values()).iterator();
            while (it.hasNext()) {
                hashSet.addAll(C20760y7.copyOf((Collection) ((AnonymousClass6PM) it.next()).A04.keySet()));
            }
            Iterator it2 = hashSet.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Jid jid = (Jid) it2.next();
                if (!AnonymousClass143.A0I(jid)) {
                    C19700wN r3 = r5.A00;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Adding a non lid device ");
                    sb.append(jid);
                    sb.append(" on lid messaging");
                    r3.A0E("FanOutLidMessagingPnDevice", sb.toString(), false);
                    break;
                }
            }
            C19730wQ r1 = r5.A01;
            r1.A0G();
            hashSet.remove(r1.A02);
            obj = r1.A07();
        } else {
            AnonymousClass17X r2 = r5.A03;
            C222713q r0 = AnonymousClass11F.A00;
            AnonymousClass144 A002 = AnonymousClass6H4.A00(r6);
            C18740tg.A06(A002);
            C225614x it3 = r2.A07.A0C(A002).A07().iterator();
            while (it3.hasNext()) {
                hashSet.addAll(C20760y7.copyOf((Collection) ((AnonymousClass6PM) it3.next()).A04.keySet()));
            }
            Iterator it4 = hashSet.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Jid jid2 = (Jid) it4.next();
                if (AnonymousClass143.A0I(jid2)) {
                    C19700wN r32 = r5.A00;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Adding a lid device ");
                    sb2.append(jid2);
                    sb2.append(" on regular messaging");
                    r32.A0E("FanOutMessagingLidDevice", sb2.toString(), false);
                    break;
                }
            }
            C19730wQ r02 = r5.A01;
            r02.A0G();
            obj = r02.A02;
        }
        hashSet.remove(obj);
        return hashSet;
    }

    public static HashSet A03(C25151Fe r5, AnonymousClass3T1 r6) {
        HashSet A042;
        HashSet A0A2;
        C64933Qa r4 = r6.A1J;
        AnonymousClass11F r1 = r4.A00;
        if (r1 instanceof AnonymousClass144) {
            AnonymousClass1FN r3 = r5.A04;
            AnonymousClass1A1 r0 = r3.A03;
            AnonymousClass3T1 A012 = r0.A01.A01(r6.A1N);
            if (A012 != null) {
                A042 = r3.A01.A04(A012.A1J);
            } else {
                A042 = r3.A00.A04(r4);
            }
            HashSet hashSet = new HashSet(A042);
            for (UserJid A0B : AnonymousClass143.A09(r5.A00, A042)) {
                hashSet.addAll(r5.A07.A0B(A0B));
            }
            boolean A002 = r5.A08.A00(r6);
            C231417i r02 = r5.A07;
            if (A002) {
                A0A2 = r02.A09();
            } else {
                A0A2 = r02.A0A();
            }
            hashSet.addAll(A0A2);
            C19730wQ r12 = r5.A01;
            r12.A0G();
            hashSet.remove(r12.A02);
            hashSet.remove(r12.A07());
            return hashSet;
        } else if (r1 instanceof UserJid) {
            return A02(r5, r1, r6);
        } else {
            return null;
        }
    }

    private HashSet A04(AnonymousClass11F r4) {
        HashSet A0A2;
        HashSet hashSet = new HashSet();
        boolean z = r4 instanceof C223313w;
        C231417i r1 = this.A07;
        if (z) {
            A0A2 = r1.A09();
        } else {
            A0A2 = r1.A0A();
        }
        hashSet.addAll(A0A2);
        if (!this.A01.A0M(r4)) {
            C222813r r0 = UserJid.Companion;
            UserJid A002 = C222813r.A00(r4);
            C18740tg.A06(A002);
            hashSet.addAll(r1.A0B(A002));
        }
        return hashSet;
    }

    public HashSet A05(AnonymousClass3T1 r7) {
        AnonymousClass11F r5 = r7.A1J.A00;
        if ((r7 instanceof AnonymousClass2bI) || !C66013Ui.A0R(this.A01, r7)) {
            return null;
        }
        if ((!(r5 instanceof UserJid) && !(r5 instanceof AnonymousClass144)) || r7.A0G != 0 || r7.A1T != null) {
            return null;
        }
        if (r7 instanceof AnonymousClass0p5) {
            return A01(this, r5, r7.A1I);
        }
        return A02(this, r5, r7);
    }

    public HashSet A06(AnonymousClass3T1 r10) {
        C64933Qa r1 = r10.A1J;
        AnonymousClass11F r6 = r1.A00;
        boolean A002 = C197029b1.A00(r10.A0J());
        C19730wQ r7 = this.A01;
        if (!r1.A02 && !C66013Ui.A0T(r7, r10) && ((r10.A1I != 83 || !r7.A0M(r10.A0N)) && !A002)) {
            return null;
        }
        HashSet A032 = A03(this, r10);
        if (A032 != null && (r6 instanceof AnonymousClass144) && (r10.A0G != 0 || C66013Ui.A0T(r7, r10) || ((r10.A1I == 83 && r7.A0M(r10.A0N)) || A002))) {
            A032.addAll(A02(this, r6, r10));
        }
        return A032;
    }

    public void A07(AnonymousClass3T1 r9, Set set) {
        Integer valueOf;
        Integer valueOf2;
        AnonymousClass11F r3 = r9.A1J.A00;
        C222713q r0 = AnonymousClass11F.A00;
        AnonymousClass144 A002 = AnonymousClass6H4.A00(r3);
        if (A002 != null) {
            int A012 = this.A05.A01(A002);
            C25191Fi r1 = this.A06;
            boolean z = true;
            if (!set.isEmpty()) {
                if (C20800yB.A01(C21000yV.A02, r1.A01, 4162)) {
                    if (A012 == 0 || ((A012 == 1 || A012 == 2) && ((!(r9 instanceof AnonymousClass2bM) || !((AnonymousClass2bM) r9).A1e()) && !r9.A1T(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING)))) {
                        z = false;
                    }
                    int size = set.size();
                    AnonymousClass6XG.A01(new C67603aB(z), set);
                    set.size();
                    if (size != set.size()) {
                        int size2 = set.size();
                        if (z) {
                            valueOf = Integer.valueOf(size2);
                            valueOf2 = Integer.valueOf(size - set.size());
                        } else {
                            valueOf = Integer.valueOf(size - size2);
                            valueOf2 = Integer.valueOf(set.size());
                        }
                        C19700wN r4 = r1.A00;
                        StringBuilder sb = new StringBuilder();
                        sb.append(valueOf.intValue());
                        sb.append(" lid participants & ");
                        sb.append(valueOf2.intValue());
                        sb.append(" pn participants");
                        r4.A0E("GroupLidInfra/outgoing_message", sb.toString(), false);
                    }
                }
            }
        }
        if (r3 != null && !set.isEmpty()) {
            set.size();
            if (AnonymousClass9ZV.A01(r3) || (r9 instanceof C46902br)) {
                AnonymousClass03Y.A0C(set, AnonymousClass4NH.A00);
            }
            set.size();
        }
    }

    public C25151Fe(C19700wN r1, C19730wQ r2, AnonymousClass189 r3, AnonymousClass17X r4, AnonymousClass1FN r5, C231417i r6, C25181Fh r7, C230717b r8, C25171Fg r9, C25191Fi r10, C25161Ff r11) {
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r8;
        this.A0A = r11;
        this.A02 = r3;
        this.A07 = r6;
        this.A09 = r9;
        this.A04 = r5;
        this.A08 = r7;
        this.A03 = r4;
        this.A06 = r10;
    }

    public static ArrayList A00(Set set) {
        ArrayList A052 = C133256Xm.A05(set);
        ArrayList arrayList = new ArrayList();
        int size = A052.size() / 100;
        int size2 = A052.size() % 100;
        int i = 0;
        while (i < size) {
            int i2 = i * 100;
            i++;
            arrayList.add(A052.subList(i2, i * 100));
        }
        if (size2 > 0) {
            arrayList.add(A052.subList(A052.size() - size2, A052.size()));
        }
        return arrayList;
    }
}
