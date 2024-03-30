package X;

import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.9vU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C207609vU implements AnonymousClass08V {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1O1 A01;
    public final /* synthetic */ C108515Tu A02;
    public final /* synthetic */ C1041758o A03;
    public final /* synthetic */ Collection A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C207609vU(AnonymousClass1O1 r1, C108515Tu r2, C1041758o r3, Collection collection, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A04 = collection;
        this.A03 = r3;
        this.A05 = z;
        this.A06 = z2;
    }

    public final Object apply(Object obj) {
        AnonymousClass1O1 r8 = this.A01;
        C108515Tu r10 = this.A02;
        int i = this.A00;
        Collection collection = this.A04;
        C1041758o r6 = this.A03;
        boolean z = this.A05;
        boolean z2 = this.A06;
        String str = (String) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList A0I = AnonymousClass001.A0I();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass141 A0f = C36391kE.A0f(it);
                if (!C202329lb.A04(A0f.A0H)) {
                    boolean A0D = r8.A0G.A0D();
                    AnonymousClass9jB r11 = new AnonymousClass9jB(A0f);
                    r11.A0L = true;
                    r11.A0B = true;
                    r11.A0G = true;
                    r11.A0K = true;
                    r11.A0E = true;
                    r11.A01 = C165607th.A06(A0f, r10);
                    r11.A0I = A0D;
                    AnonymousClass9jB.A03(r8, r11, z, z2);
                    C231417i r0 = r8.A0E;
                    UserJid userJid = r11.A0P;
                    r11.A02 = AnonymousClass9jB.A00(r11, r0, userJid);
                    if (A0D) {
                        AnonymousClass9jB.A01(r8, r11, userJid);
                    }
                    AnonymousClass9jB.A02(r8, r11, userJid, r8.A0K);
                    AnonymousClass9jB.A04(r11, A0I);
                }
            }
        }
        A0I.size();
        if (C165577te.A1Y(r6, A0I)) {
            return C131626Pu.A08;
        }
        if (!AnonymousClass1O1.A04(r8, r6, str, C198869eK.A01(r10, AnonymousClass1O1.A01(r8), "sync_sid_sidelist", A0I, i))) {
            return C131626Pu.A03;
        }
        C192519Hh.A00(r8, r6, A0I, elapsedRealtime);
        return C131626Pu.A06;
    }
}
