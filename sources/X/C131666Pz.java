package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.6Pz  reason: invalid class name and case insensitive filesystem */
public class C131666Pz {
    public AnonymousClass6NS A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C108515Tu A05;
    public final List A06 = AnonymousClass001.A0I();
    public final Set A07 = C36441kJ.A16();

    public void A02() {
        this.A02 = true;
    }

    public C131586Pq A01() {
        if (this.A00.A00()) {
            return new C131586Pq(this);
        }
        throw AnonymousClass001.A08("none of the syncs protocols enabled");
    }

    public void A04(UserJid userJid) {
        if (userJid != null) {
            this.A07.add(userJid);
        }
    }

    public void A05(byte[] bArr) {
        List<byte[]> list = this.A06;
        for (byte[] equals : list) {
            if (Arrays.equals(equals, bArr)) {
                return;
            }
        }
        list.add(bArr);
    }

    public C131666Pz(C108515Tu r2) {
        this.A05 = r2;
    }

    public static void A00(C131666Pz r2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r2.A05((byte[]) it.next());
        }
    }

    public void A03(AnonymousClass6NS r1) {
        this.A00 = r1;
    }
}
