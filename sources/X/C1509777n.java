package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.CallParticipantJid;
import java.util.List;

/* renamed from: X.77n  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1509777n implements C006302t {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass6YM A01;
    public final /* synthetic */ GroupJid A02;
    public final /* synthetic */ C107265Nh A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ CallParticipantJid[] A09;

    public /* synthetic */ C1509777n(AnonymousClass6YM r1, GroupJid groupJid, C107265Nh r3, String str, String str2, List list, CallParticipantJid[] callParticipantJidArr, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A02 = groupJid;
        this.A09 = callParticipantJidArr;
        this.A03 = r3;
        this.A04 = str;
        this.A07 = z;
        this.A00 = i;
        this.A05 = str2;
        this.A06 = list;
        this.A08 = z2;
    }

    public final Object invoke(Object obj) {
        AnonymousClass6YM r0 = this.A01;
        GroupJid groupJid = this.A02;
        CallParticipantJid[] callParticipantJidArr = this.A09;
        C107265Nh r2 = this.A03;
        String str = this.A04;
        boolean z = this.A07;
        return r0.A0I(groupJid, r2, (Integer) obj, str, this.A05, this.A06, callParticipantJidArr, this.A00, z, this.A08);
    }
}
