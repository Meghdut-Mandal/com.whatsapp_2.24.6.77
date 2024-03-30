package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.CallLogInfo;
import java.util.List;

/* renamed from: X.3Az  reason: invalid class name and case insensitive filesystem */
public class C61213Az {
    public final int A00;
    public final int A01;
    public final GroupJid A02;
    public final CallLogInfo A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C61213Az(GroupJid groupJid, CallLogInfo callLogInfo, String str, String str2, List list, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A01 = i;
        this.A04 = str;
        this.A00 = i2;
        this.A06 = list;
        this.A02 = groupJid;
        this.A08 = z;
        this.A03 = callLogInfo;
        this.A07 = z2;
        this.A05 = str2;
        this.A09 = z3;
    }
}
