package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2bS  reason: invalid class name */
public class AnonymousClass2bS extends AnonymousClass3T1 implements AnonymousClass4RU {
    public int A00;
    public int A01;
    public long A02 = 0;
    public String A03 = "";
    public List A04;
    public final List A05 = new CopyOnWriteArrayList();

    public AnonymousClass2bS(C64933Qa r9, AnonymousClass2bS r10, long j) {
        super(r10, r9, j, true);
        this.A03 = r10.A03;
    }

    public void A16(String str) {
        if (str == null) {
            str = "";
        }
        this.A03 = str;
    }

    public void A1X(List list) {
        if (this.A04 == null) {
            this.A04 = list;
            return;
        }
        throw AnonymousClass001.A09("FMessagePoll/setPollVotes re-assigning pollVotes");
    }

    public /* bridge */ /* synthetic */ AnonymousClass3T1 B32(C64933Qa r4) {
        return new AnonymousClass2bS(r4, this, this.A0I);
    }

    public AnonymousClass2bS(C64933Qa r3, long j) {
        super(r3, 66, j);
    }
}
