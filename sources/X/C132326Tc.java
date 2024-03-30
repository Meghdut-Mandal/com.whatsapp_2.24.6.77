package X;

import android.os.ConditionVariable;
import com.whatsapp.bonsai.sync.discovery.DiscoveryBots;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.6Tc  reason: invalid class name and case insensitive filesystem */
public final class C132326Tc {
    public final C001700s A00 = C36441kJ.A0Z((Object) null);
    public final C199099eh A01;
    public final C19970wo A02;
    public final C20810yC A03;
    public final C19770wU A04;
    public final C25691Hh A05;
    public final AnonymousClass16D A06;
    public final AnonymousClass005 A07;
    public volatile AnonymousClass141 A08;

    public final void A02() {
        if (A00(this, false) == null && this.A03.A07(4417) >= 0) {
            this.A01.A01().A0B(new C164977sg(this, 1), new C164217rS(this.A04, 4));
        }
    }

    public final boolean A04(DiscoveryBots discoveryBots) {
        if (discoveryBots != null) {
            if (C19970wo.A00(this.A02) <= C36371kC.A07(this.A03.A07(4417)) + discoveryBots.A00) {
                List<C1277169j> A002 = C110115a9.A00(discoveryBots);
                LinkedHashSet A17 = C36441kJ.A17();
                for (C1277169j r0 : A002) {
                    A17.add(r0.A00);
                }
                if (A01(A17)) {
                    List<AnonymousClass6BC> list = discoveryBots.A02;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        return false;
                    }
                    for (AnonymousClass6BC r02 : list) {
                        if (!r02.A02.isEmpty()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final DiscoveryBots A00(C132326Tc r5, boolean z) {
        C001700s r4 = r5.A00;
        DiscoveryBots discoveryBots = (DiscoveryBots) r4.A04();
        if (discoveryBots == null || !r5.A04(discoveryBots)) {
            discoveryBots = r5.A05.A00();
            if (discoveryBots != null) {
                UserJid userJid = discoveryBots.A01.A00;
                if (r5.A01(C36371kC.A11(userJid))) {
                    r5.A08 = r5.A06.A0D(userJid);
                }
            }
            if (!r5.A04(discoveryBots)) {
                if (z) {
                    r4.A0C((Object) null);
                }
                return null;
            }
        }
        r4.A0C(discoveryBots);
        return discoveryBots;
    }

    private final boolean A01(Collection collection) {
        HashMap A012 = ((AnonymousClass6BB) this.A07.get()).A01(collection);
        if (!A012.isEmpty()) {
            Set keySet = A012.keySet();
            C199099eh r4 = this.A01;
            for (Object next : keySet) {
                AnonymousClass11F r1 = (AnonymousClass11F) next;
                AnonymousClass00C.A0D(r1, 0);
                if (C199099eh.A00(r4, r4.A03.A0D(r1))) {
                    if (next != null) {
                        return false;
                    }
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final void A03(AnonymousClass012 r3, C006302t r4) {
        AnonymousClass141 r0 = this.A08;
        if (r0 != null) {
            r4.invoke(r0);
        } else {
            this.A04.Bp1(new C1502474n(r3, this, r4));
        }
    }

    public C132326Tc(C199099eh r2, C25691Hh r3, AnonymousClass16D r4, C19970wo r5, C20810yC r6, C19770wU r7, AnonymousClass005 r8) {
        C36321k7.A1B(r5, r6, r7, r4, r3);
        C36321k7.A10(r8, r2);
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A06 = r4;
        this.A05 = r3;
        this.A07 = r8;
        this.A01 = r2;
        ConditionVariable conditionVariable = C18740tg.A00;
    }
}
