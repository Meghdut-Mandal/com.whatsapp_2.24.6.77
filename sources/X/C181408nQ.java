package X;

import com.whatsapp.jid.GroupJid;

@Deprecated
/* renamed from: X.8nQ  reason: invalid class name and case insensitive filesystem */
public class C181408nQ extends C181758nz {
    public int A00 = 0;
    public GroupJid A01;
    public Integer A02;

    public String A0c() {
        GroupJid groupJid = this.A01;
        if (groupJid == null) {
            return null;
        }
        return groupJid.getRawString();
    }

    public C181408nQ(C64933Qa r2, int i, long j) {
        super(r2, i, j);
    }
}
