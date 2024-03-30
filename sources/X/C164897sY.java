package X;

import com.whatsapp.polls.PollResultsViewModel;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.7sY  reason: invalid class name and case insensitive filesystem */
public class C164897sY implements AnonymousClass191 {
    public Object A00;
    public final int A01;

    public static void A00(C164897sY r2, AnonymousClass3T1 r3) {
        AnonymousClass00C.A0D(r3, 0);
        if (r3 instanceof AnonymousClass2bZ) {
            C64933Qa r1 = r3.A1J;
            C167747yk r22 = (C167747yk) r2.A00;
            if (AnonymousClass00C.A0J(r1, r22.A0A)) {
                r22.A0W((C202319lY) null, (AnonymousClass2bZ) r3, 1);
            }
        }
    }

    public C164897sY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bas(AnonymousClass3T1 r4, int i) {
        switch (this.A01) {
            case 0:
                if (r4 instanceof AnonymousClass2bI) {
                    C142466ov r2 = (C142466ov) this.A00;
                    if (r2.A0I.equals(r4.A1J.A00)) {
                        int i2 = ((AnonymousClass2bI) r4).A00;
                        if ((i2 == 5 || i2 == 7) && r2.A0x.A0M(r4.A0J())) {
                            r2.A05.finish();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                A00(this, r4);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bau(AnonymousClass3T1 r5, int i) {
        switch (this.A01) {
            case 0:
                return;
            case 1:
                A00(this, r5);
                return;
            default:
                AnonymousClass00C.A0D(r5, 0);
                PollResultsViewModel pollResultsViewModel = (PollResultsViewModel) this.A00;
                AnonymousClass2bS r2 = pollResultsViewModel.A00;
                if (r2 != null && AnonymousClass00C.A0J(r5.A1J.A01, r2.A1J.A01)) {
                    pollResultsViewModel.A0S(r2);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = (com.whatsapp.polls.PollResultsViewModel) r4.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void Baw(X.AnonymousClass3T1 r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            int r0 = 2 - r0
            if (r0 != 0) goto L_0x0021
            java.lang.Object r3 = r4.A00
            com.whatsapp.polls.PollResultsViewModel r3 = (com.whatsapp.polls.PollResultsViewModel) r3
            X.2bS r2 = r3.A00
            if (r2 == 0) goto L_0x0021
            if (r5 == 0) goto L_0x0021
            X.3Qa r0 = r5.A1J
            java.lang.String r1 = r0.A01
            X.3Qa r0 = r2.A1J
            java.lang.String r0 = r0.A01
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0021
            r3.A0S(r2)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164897sY.Baw(X.3T1):void");
    }

    public /* synthetic */ void Bb5(AnonymousClass11F r4) {
        AnonymousClass11F r0;
        AnonymousClass2bS r02;
        C64933Qa r1;
        C64933Qa r03;
        if (2 - this.A01 == 0) {
            AnonymousClass00C.A0D(r4, 0);
            PollResultsViewModel pollResultsViewModel = (PollResultsViewModel) this.A00;
            AnonymousClass2bS r04 = pollResultsViewModel.A00;
            if (r04 == null || (r03 = r04.A1J) == null) {
                r0 = null;
            } else {
                r0 = r03.A00;
            }
            if (r4.equals(r0) && (r02 = pollResultsViewModel.A00) != null && (r1 = r02.A1J) != null && pollResultsViewModel.A04.A03(r1) != null) {
                C36331k8.A13(pollResultsViewModel.A05);
            }
        }
    }

    public /* synthetic */ void Bb6(Collection collection, Map map) {
        if (2 - this.A01 == 0) {
            AnonymousClass00C.A0D(collection, 0);
            PollResultsViewModel pollResultsViewModel = (PollResultsViewModel) this.A00;
            AnonymousClass2bS r4 = pollResultsViewModel.A00;
            if (r4 != null) {
                for (Object next : collection) {
                    if (AnonymousClass00C.A0J(((AnonymousClass3T1) next).A1J, r4.A1J)) {
                        if (next != null) {
                            C36331k8.A13(pollResultsViewModel.A05);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public /* synthetic */ void Bbr() {
    }

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Bax(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bay(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bb4(Collection collection, int i) {
        C54122sR.A00(this, collection, i);
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

    public /* synthetic */ void Bci(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bck(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bb7(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb8(AnonymousClass11F r1, Collection collection, boolean z) {
    }
}
