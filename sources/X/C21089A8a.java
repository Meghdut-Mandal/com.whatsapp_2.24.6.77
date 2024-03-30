package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.A8a  reason: case insensitive filesystem */
public final class C21089A8a implements C19710wO {
    public AnonymousClass1IO A00;
    public final AnonymousClass1IL A01;
    public final C20810yC A02;
    public final C19890wg A03;

    public String BIB() {
        return "EntryPointConversionAsyncInit";
    }

    public void BRM() {
    }

    public void BRL() {
        if (this.A02.A0E(6122)) {
            ArrayList A022 = this.A00.A02();
            if (C36411kG.A1a(A022)) {
                Iterator it = A022.iterator();
                while (it.hasNext()) {
                    AnonymousClass9Xu r1 = (AnonymousClass9Xu) it.next();
                    AnonymousClass1IL r0 = this.A01;
                    AnonymousClass00C.A0B(r1);
                    UserJid userJid = r1.A04;
                    AnonymousClass00C.A07(userJid);
                    String str = r1.A06;
                    AnonymousClass00C.A07(str);
                    r0.A07(new C175408aR(userJid, str, r1.A05, r1.A01, r1.A02, r1.A08));
                }
                return;
            }
            return;
        }
        ArrayList A04 = this.A01.A04();
        if (C36411kG.A1a(A04)) {
            Iterator it2 = A04.iterator();
            while (it2.hasNext()) {
                C175408aR r3 = (C175408aR) it2.next();
                AnonymousClass1IO r2 = this.A00;
                AnonymousClass00C.A0B(r3);
                UserJid userJid2 = r3.A00;
                String str2 = r3.A03;
                String str3 = r3.A02;
                long j = r3.A00;
                AnonymousClass9O3 r5 = new AnonymousClass9O3(userJid2, str2, str3, j, j);
                r5.A01 = r3.A01;
                r5.A03 = r3.A04;
                r2.A03(new AnonymousClass9Xu(r5));
            }
        }
    }

    public C21089A8a(AnonymousClass1IL r3, C20810yC r4, C19890wg r5) {
        C36321k7.A11(r4, r5, r3);
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        this.A00 = new AnonymousClass1IO(r5, "entry_point_conversions_for_sending");
    }
}
