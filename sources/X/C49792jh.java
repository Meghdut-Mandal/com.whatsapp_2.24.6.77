package X;

import android.util.Pair;
import android.view.ViewGroup;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.List;
import java.util.Map;

/* renamed from: X.2jh  reason: invalid class name and case insensitive filesystem */
public final class C49792jh extends C132446Tt {
    public int A00;
    public final WfalManager A01;
    public final AnonymousClass1HT A02;
    public final AnonymousClass16F A03;
    public final AnonymousClass16E A04;
    public final C25121Fb A05;
    public final UserJid A06;
    public final C64933Qa A07;
    public final AnonymousClass1A1 A08;
    public final C28781Ua A09;
    public final AnonymousClass005 A0A;
    public final AnonymousClass005 A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C49792jh(WfalManager wfalManager, AnonymousClass1HT r3, AnonymousClass16F r4, AnonymousClass16E r5, C25121Fb r6, UserJid userJid, C64933Qa r8, StatusPlaybackContactFragment statusPlaybackContactFragment, AnonymousClass1A1 r10, C28781Ua r11, AnonymousClass005 r12, AnonymousClass005 r13, boolean z, boolean z2) {
        super(statusPlaybackContactFragment, true);
        this.A04 = r5;
        this.A09 = r11;
        this.A08 = r10;
        this.A01 = wfalManager;
        this.A02 = r3;
        this.A03 = r4;
        this.A0A = r12;
        this.A0B = r13;
        this.A05 = r6;
        this.A07 = r8;
        this.A0C = z;
        this.A06 = userJid;
        this.A0D = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r12) {
        /*
            r11 = this;
            X.16E r0 = r11.A04
            com.whatsapp.jid.UserJid r9 = r11.A06
            X.3Sz r2 = r0.A08(r9)
            X.1HT r0 = r11.A02
            java.util.ArrayList r1 = r0.A03(r9)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableList<@[EnhancedNullability] com.whatsapp.protocol.FMessage>"
            X.AnonymousClass00C.A0E(r1, r0)
            java.util.List r5 = X.C07710Yz.A01(r1)
            X.13z r0 = X.C223613z.A00
            if (r9 != r0) goto L_0x002e
            X.1Ua r0 = r11.A09
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x002e
            X.005 r0 = r11.A0B
            java.lang.Object r0 = r0.get()
            X.1i6 r0 = (X.C35071i6) r0
            X.C35071i6.A00(r0)
        L_0x002e:
            if (r2 == 0) goto L_0x00e6
            X.3Qa r1 = r11.A07
            r8 = 0
            if (r1 != 0) goto L_0x008d
            boolean r0 = r11.A0C
            if (r0 == 0) goto L_0x0048
            int r10 = r11.A00
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L_0x006e
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x006e
        L_0x0045:
            int r10 = r10 + r8
            r11.A00 = r10
        L_0x0048:
            java.util.HashMap r4 = X.AnonymousClass001.A0J()
            boolean r0 = r9 instanceof X.C177638e7
            if (r0 == 0) goto L_0x00c4
            java.util.Iterator r3 = r5.iterator()
        L_0x0054:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c4
            X.3T1 r2 = X.C36391kE.A0l(r3)
            long r0 = r2.A1N
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            X.16F r0 = r11.A03
            X.3SA r0 = r0.A00(r2)
            r4.put(r1, r0)
            goto L_0x0054
        L_0x006e:
            java.util.Iterator r1 = r5.iterator()
        L_0x0072:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0045
            X.3T1 r0 = X.C36391kE.A0l(r1)
            boolean r0 = r2.A0D(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0072
            int r8 = r8 + 1
            if (r8 >= 0) goto L_0x0072
            java.lang.RuntimeException r0 = X.C36371kC.A0s()
            throw r0
        L_0x008d:
            X.1A1 r0 = r11.A08
            X.AnonymousClass00C.A0D(r0, r8)
            X.3T1 r7 = r0.A03(r1)
            if (r7 == 0) goto L_0x00e6
            int r10 = r11.A00
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00a5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00a5
            goto L_0x0045
        L_0x00a5:
            java.util.Iterator r6 = r5.iterator()
        L_0x00a9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0045
            X.3T1 r0 = X.C36391kE.A0l(r6)
            long r3 = r0.A0I
            long r1 = r7.A0I
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a9
            int r8 = r8 + 1
            if (r8 >= 0) goto L_0x00a9
            java.lang.RuntimeException r0 = X.C36371kC.A0s()
            throw r0
        L_0x00c4:
            boolean r0 = r11.A0D
            if (r0 == 0) goto L_0x00e1
            java.util.Iterator r3 = r5.iterator()
        L_0x00cc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e1
            X.3T1 r2 = X.C36391kE.A0l(r3)
            int r1 = r2.A1I
            r0 = 2
            if (r1 != r0) goto L_0x00cc
            X.1Fb r0 = r11.A05
            r0.A02(r2)
            goto L_0x00cc
        L_0x00e1:
            android.util.Pair r0 = X.C36441kJ.A0Q(r5, r4)
            return r0
        L_0x00e6:
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            X.00f r0 = X.C000400e.A0D()
            android.util.Pair r0 = X.C36441kJ.A0Q(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49792jh.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        AnonymousClass00C.A0D(pair, 0);
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) A07(StatusPlaybackContactFragment.class);
        if (statusPlaybackContactFragment != null) {
            Object obj2 = pair.first;
            AnonymousClass00C.A07(obj2);
            List list = (List) obj2;
            Object obj3 = pair.second;
            AnonymousClass00C.A07(obj3);
            Map map = (Map) obj3;
            int i = this.A00;
            C36331k8.A1I(list, map);
            StringBuilder A0u = AnonymousClass000.A0u();
            C36371kC.A1R("playbackFragment/onMessagesLoaded ", A0u, list);
            C36321k7.A1K(statusPlaybackContactFragment, " messages; ", A0u);
            AnonymousClass3BI r4 = statusPlaybackContactFragment.A04;
            statusPlaybackContactFragment.A0n = list;
            statusPlaybackContactFragment.A0o = map;
            StatusPlaybackContactFragment.A0D(statusPlaybackContactFragment);
            if (C36401kF.A1a(list)) {
                if (i < list.size()) {
                    statusPlaybackContactFragment.A00 = i;
                }
                AnonymousClass3LC A032 = StatusPlaybackContactFragment.A03(C36411kG.A0n(list, statusPlaybackContactFragment.A00), statusPlaybackContactFragment);
                if (r4 != null) {
                    ViewGroup viewGroup = r4.A07;
                    viewGroup.removeAllViews();
                    viewGroup.addView(A032.A00);
                    r4.A02.setVisibility(8);
                }
                if (statusPlaybackContactFragment.A00) {
                    if (statusPlaybackContactFragment.A0n != null) {
                        int i2 = statusPlaybackContactFragment.A00;
                        statusPlaybackContactFragment.A00 = -1;
                        if (i2 == -1) {
                            i2 = 0;
                        }
                        StatusPlaybackContactFragment.A0E(statusPlaybackContactFragment, i2);
                    }
                    StatusPlaybackContactFragment.A0F(statusPlaybackContactFragment, StatusPlaybackContactFragment.A05(statusPlaybackContactFragment), 0, statusPlaybackContactFragment.A01);
                    return;
                }
                return;
            }
            C88164Rq r1 = (C88164Rq) statusPlaybackContactFragment.A0h();
            UserJid userJid = statusPlaybackContactFragment.A0R;
            if (userJid != null && r1 != null) {
                StatusPlaybackActivity.A01((StatusPlaybackActivity) r1, userJid.getRawString(), 0, 0);
            }
        }
    }
}
