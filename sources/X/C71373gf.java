package X;

import com.whatsapp.group.generalchat.GeneralChatAutoAddDeprecationGroupsProcessor$processGroups$1;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3gf  reason: invalid class name and case insensitive filesystem */
public final class C71373gf implements C159417jK {
    public final C20810yC A00;
    public final AnonymousClass1PS A01;

    public void BV1() {
        if (this.A00.A0E(5021)) {
            AnonymousClass1PS r4 = this.A01;
            C20350xQ r5 = (C20350xQ) r4.A06.get();
            ArrayList A0P = r5.A0C.A05.A0P();
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = A0P.iterator();
            while (it.hasNext()) {
                AnonymousClass141 A0f = C36391kE.A0f(it);
                AnonymousClass147 A012 = C65533Sl.A01(A0f.A0H);
                if (A012 != null && r5.A0U.A0D(A012)) {
                    C220412q r0 = r5.A0M;
                    r0.A0Q(A012);
                    if (r0.A05(A012) == 6) {
                        A0I.add(A0f);
                    }
                }
            }
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator it2 = A0I.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                C36391kE.A1V(next, A0I2, ((AnonymousClass141) next).A0e ? 1 : 0);
            }
            ArrayList A0I3 = AnonymousClass001.A0I();
            Iterator it3 = A0I2.iterator();
            while (it3.hasNext()) {
                AnonymousClass141 A0f2 = C36391kE.A0f(it3);
                C65533Sl r02 = AnonymousClass147.A01;
                AnonymousClass147 A03 = C65533Sl.A03(A0f2.A0H);
                if (A03 != null) {
                    A0I3.add(A03);
                }
            }
            C110515an.A00(r4.A08.BAE().plus(r4.A07), new GeneralChatAutoAddDeprecationGroupsProcessor$processGroups$1(r4, C007103b.A0f(A0I3), (C023509x) null));
            return;
        }
        Log.i("GeneralChatAutoAddDeprecationCronJob Skipped cron job, AB prop is off.");
    }

    public C71373gf(C20810yC r1, AnonymousClass1PS r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
