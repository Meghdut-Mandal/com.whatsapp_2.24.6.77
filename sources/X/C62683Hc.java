package X;

import android.app.Activity;
import android.net.Uri;
import java.io.File;
import java.util.List;

/* renamed from: X.3Hc  reason: invalid class name and case insensitive filesystem */
public class C62683Hc {
    public final AnonymousClass3O8 A00;

    public AnonymousClass38r A00(Activity activity, C47002cZ r17, boolean z, boolean z2) {
        AnonymousClass38r r1;
        AnonymousClass3O8 r12 = this.A00;
        C18740tg.A01();
        C47002cZ r3 = r17;
        File A01 = AnonymousClass2bU.A01(r3);
        C18740tg.A06(A01);
        if (z2) {
            r12.A02.A00(r3);
        }
        List list = r12.A07;
        if (list.isEmpty()) {
            List list2 = r12.A08;
            if (list2.size() >= 4) {
                AnonymousClass38r r2 = (AnonymousClass38r) list2.remove(0);
                AnonymousClass4SJ r0 = r2.A01;
                if (r0 != null) {
                    r0.BYI();
                }
                list.add(r2);
                r2.hashCode();
            }
        }
        List list3 = r12.A08;
        list3.size();
        list.size();
        if (!list.isEmpty()) {
            r1 = (AnonymousClass38r) list.remove(0);
            r1.A03.A0T(A01);
            r1.hashCode();
            r1.A02 = r3.A1J.A01;
        } else if (list3.size() >= 4) {
            return null;
        } else {
            AnonymousClass17Y r7 = r12.A01;
            C21060yb r8 = r12.A03;
            C19630wG r9 = r12.A04;
            Uri fromFile = Uri.fromFile(A01);
            int i = 3;
            if (z) {
                i = 4;
            }
            AnonymousClass33I r13 = r12.A05;
            AnonymousClass5NR r5 = new AnonymousClass5NR(activity, r7, r8, r9, (AnonymousClass6KH) r12.A06.get(), (C19770wU) null, (AnonymousClass6FG) null, i, false);
            r5.A04 = fromFile;
            r5.A0Q = true;
            r5.A0C = r13;
            r1 = new AnonymousClass38r(r5, r3.A1J.A01);
            r1.hashCode();
        }
        list3.add(r1);
        return r1;
    }

    public void A01() {
        AnonymousClass3O8 r5 = this.A00;
        C18740tg.A01();
        List<AnonymousClass38r> list = r5.A08;
        list.size();
        List<AnonymousClass38r> list2 = r5.A07;
        list2.size();
        for (AnonymousClass38r r1 : list2) {
            AnonymousClass4SJ r0 = r1.A01;
            if (r0 != null) {
                r0.BYI();
            }
            r1.A03.A0D();
        }
        list2.clear();
        for (AnonymousClass38r r12 : list) {
            AnonymousClass4SJ r02 = r12.A01;
            if (r02 != null) {
                r02.BYI();
            }
            r12.A03.A0D();
        }
        list.clear();
        r5.A00 = 0;
    }

    public void A02(AnonymousClass38r r3) {
        AnonymousClass3O8 r1 = this.A00;
        C18740tg.A01();
        if (r1.A08.remove(r3)) {
            List list = r1.A07;
            list.add(r3);
            r3.hashCode();
            list.size();
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VideoPlayerPoolManager/releaseVideoPlayerInstance/playerNotProvidedByPool videoPlayerId=");
        C36351kA.A1R(A0u, r3.hashCode());
    }

    public C62683Hc(AnonymousClass17Y r7, AnonymousClass2ZM r8, C21060yb r9, C19630wG r10, AnonymousClass005 r11) {
        this.A00 = new AnonymousClass3O8(r7, r8, r9, r10, r11);
    }
}
