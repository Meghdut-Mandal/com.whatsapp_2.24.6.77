package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1i4  reason: invalid class name and case insensitive filesystem */
public final class C35051i4 implements AnonymousClass191, C35041i3 {
    public final C35031i2 A00;
    public final C28781Ua A01;
    public final LinkedHashMap A02 = new LinkedHashMap();

    public C35051i4(C35031i2 r2, C28781Ua r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public void Bas(AnonymousClass3T1 r4, int i) {
        AnonymousClass00C.A0D(r4, 0);
        if (this.A01.A00() && AnonymousClass6Y4.A07(r4)) {
            StringBuilder sb = new StringBuilder();
            sb.append("XFamilyRecentStatusManager/onMessageAdded crosspostable message ");
            sb.append(r4.A1N);
            AnonymousClass1UT.A00(sb.toString());
            LinkedHashMap linkedHashMap = this.A02;
            Collection values = linkedHashMap.values();
            AnonymousClass00C.A08(values);
            if (AnonymousClass6Y4.A08(values)) {
                AnonymousClass1UT.A00("XFamilyRecentStatusManager/onMessageAdded all previous messaged delivered. cache cleared");
                linkedHashMap.clear();
            }
            linkedHashMap.put(Long.valueOf(r4.A1N), r4);
        }
    }

    public void Bau(AnonymousClass3T1 r7, int i) {
        C63023Il r4;
        C63023Il r3;
        AnonymousClass00C.A0D(r7, 0);
        if (this.A01.A00() && i == 24 && r7.A0H > 0 && AnonymousClass6Y4.A07(r7)) {
            StringBuilder sb = new StringBuilder();
            sb.append("XFamilyRecentStatusManager/onMessageChanged crosspostable message ");
            sb.append(r7.A1N);
            AnonymousClass1UT.A00(sb.toString());
            long j = r7.A1N;
            LinkedHashMap linkedHashMap = this.A02;
            Long valueOf = Long.valueOf(j);
            if (linkedHashMap.containsKey(valueOf)) {
                linkedHashMap.put(valueOf, r7);
            }
            Collection values = linkedHashMap.values();
            AnonymousClass00C.A08(values);
            if (AnonymousClass6Y4.A08(values)) {
                C35031i2 r0 = this.A00;
                A00();
                Iterable<C592633g> observers = r0.getObservers();
                AnonymousClass00C.A08(observers);
                for (C592633g r02 : observers) {
                    C63623Kt r2 = r02.A00;
                    ArrayList A002 = r2.A06.A00();
                    if (A002.isEmpty()) {
                        r4 = new C63023Il(false, false);
                    } else {
                        r4 = new C63023Il(r2.A04.A00(2, A002), true);
                    }
                    if (A002.isEmpty()) {
                        r3 = new C63023Il(false, false);
                    } else {
                        r3 = new C63023Il(r2.A04.A00(5, A002), true);
                    }
                    C63023Il r1 = r2.A01;
                    if (r1 == null) {
                        AnonymousClass00C.A0G("currentShareViewState");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                    if (!r1.equals(r4)) {
                        r2.A01 = r4;
                        C88664To r03 = r2.A00;
                        if (r03 != null) {
                            r03.BgY(r4);
                        }
                    }
                    C63023Il r04 = r2.A02;
                    if (r04 == null) {
                        AnonymousClass00C.A0G("currentUpsellViewState");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    } else if (!r04.equals(r3)) {
                        r2.A02 = r3;
                        C88664To r05 = r2.A00;
                        if (r05 != null) {
                            r05.Bjz(r3);
                        }
                    }
                }
            }
        }
    }

    public /* synthetic */ void Baw(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bax(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bay(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bb4(Collection collection, int i) {
        C54122sR.A00(this, collection, i);
    }

    public /* synthetic */ void Bb5(AnonymousClass11F r1) {
    }

    public void Bb6(Collection collection, Map map) {
        AnonymousClass00C.A0D(collection, 0);
        if (this.A01.A00()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass3T1 r3 = (AnonymousClass3T1) it.next();
                if (AnonymousClass6Y4.A07(r3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("XFamilyRecentStatusManager/onMessagesDeleted message ");
                    sb.append(r3.A1N);
                    AnonymousClass1UT.A00(sb.toString());
                    if (this.A02.containsKey(Long.valueOf(r3.A1N))) {
                        A01();
                    }
                }
            }
        }
    }

    public /* synthetic */ void Bb7(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb8(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb9(Collection collection) {
    }

    public /* synthetic */ void Bbc(C28981Uw r1) {
    }

    public /* synthetic */ void Bbd(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bbe(C28981Uw r1, boolean z) {
    }

    public /* synthetic */ void Bbf(C28981Uw r1) {
    }

    public /* synthetic */ void Bbr() {
    }

    public /* synthetic */ void Bci(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bck(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public final ArrayList A00() {
        return new ArrayList(this.A02.values());
    }

    public final void A01() {
        AnonymousClass1UT.A00("XFamilyRecentStatusManager/clearStatusBatch");
        this.A02.clear();
        Iterable<C592633g> observers = this.A00.getObservers();
        AnonymousClass00C.A08(observers);
        for (C592633g r0 : observers) {
            C63623Kt r1 = r0.A00;
            r1.A00();
            r1.A02(false);
        }
    }

    public void BhO(List list) {
        LinkedHashMap linkedHashMap = this.A02;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (linkedHashMap.keySet().contains(Long.valueOf(((Number) it.next()).longValue()))) {
                    A01();
                    return;
                }
            }
        }
    }
}
