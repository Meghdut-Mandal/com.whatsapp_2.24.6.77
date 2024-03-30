package X;

import android.net.Uri;
import android.os.Parcelable;
import com.whatsapp.community.NewCommunityActivity;
import com.whatsapp.jid.GroupJid;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3mm  reason: invalid class name and case insensitive filesystem */
public final class C75163mm implements AnonymousClass4U3 {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ AnonymousClass3OG A01;
    public final /* synthetic */ Set A02;
    public final /* synthetic */ Set A03;

    public void BiP(AnonymousClass39E r18, AnonymousClass147 r19) {
        AnonymousClass146 r4;
        String path;
        AnonymousClass147 r1 = r19;
        AnonymousClass00C.A0D(r1, 0);
        AnonymousClass3OG r0 = this.A01;
        r0.A02 = r1;
        Uri uri = this.A00;
        if (!(uri == null || (path = uri.getPath()) == null)) {
            File file = new File(path);
            if (file.exists()) {
                AnonymousClass1P3.A00(r0.A05.A0D(r1), r0.A0D, file, (byte[]) null, false);
            }
        }
        C587030s r5 = r0.A01;
        if (r5 != null) {
            NewCommunityActivity newCommunityActivity = r5.A00;
            newCommunityActivity.A0P.set(r1);
            AnonymousClass1Sk r8 = newCommunityActivity.A0A;
            String str = r1.user;
            AnonymousClass00C.A0D(str, 0);
            C28421Sp r2 = r8.A02;
            r8.A08(r2.A00, (Long) null, r2.A00(), str, 10, 4);
            boolean A0M = newCommunityActivity.A07.A0M(r1);
            AnonymousClass17Y r82 = newCommunityActivity.A05;
            if (A0M) {
                r82.A0H(new C80263v7(r5, r1, 19));
            } else {
                r82.A0I(new C81093wS((Object) r5, 21), 10000);
            }
        }
        Set set = this.A03;
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A0f = C36391kE.A0f(it);
            AnonymousClass6SZ r22 = GroupJid.Companion;
            GroupJid A002 = AnonymousClass6SZ.A00(A0f.A0H);
            if (A002 != null) {
                A0I.add(A002);
            }
        }
        List A0Y = C007103b.A0Y(A0I);
        boolean A1a = C36401kF.A1a(A0Y);
        Set set2 = this.A02;
        int size = set2.size() + (A1a ? 1 : 0);
        if (size == 0) {
            AnonymousClass3OG.A00(r0, 0);
            return;
        }
        r0.A0F.set(size);
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            AnonymousClass141 A0f2 = C36391kE.A0f(it2);
            Parcelable.Creator creator = AnonymousClass146.CREATOR;
            AnonymousClass11F r42 = A0f2.A0H;
            if (r42 instanceof AnonymousClass146) {
                r4 = (AnonymousClass146) r42;
            } else {
                r4 = null;
            }
            C18740tg.A06(r4);
            AnonymousClass3FK r3 = new AnonymousClass3FK(r4);
            r3.A03 = A0f2.A0J();
            r3.A04 = AnonymousClass001.A0I();
            r3.A00 = A0f2.A02;
            r3.A01 = r1;
            AnonymousClass3B9 A003 = r3.A00();
            Map map = r0.A0E;
            AnonymousClass00C.A07(map);
            map.put(r4, A0f2.A0J());
            C19970wo r11 = r0.A07;
            C20810yC r12 = r0.A08;
            new C76873pa(r0.A03, r0.A04, r11, r12, r0.A09, new C75153ml(r0, A0f2, r4), A003, r0.A0C).A01();
        }
        if (!A0Y.isEmpty()) {
            Iterator it3 = A0Y.iterator();
            while (it3.hasNext()) {
                AnonymousClass11F A0a = C36401kF.A0a(it3);
                AnonymousClass141 A0D = r0.A05.A0D(A0a);
                Map map2 = r0.A0E;
                AnonymousClass00C.A07(map2);
                map2.put(A0a, A0D.A0J());
            }
            r0.A0B.A00(new C54232sc(r0, 1), r1, A0Y);
        }
    }

    public C75163mm(Uri uri, AnonymousClass3OG r2, Set set, Set set2) {
        this.A01 = r2;
        this.A00 = uri;
        this.A03 = set;
        this.A02 = set2;
    }

    public void Bj9() {
        C587030s r0 = this.A01.A01;
        if (r0 != null) {
            NewCommunityActivity newCommunityActivity = r0.A00;
            newCommunityActivity.A0A.A04();
            newCommunityActivity.Bnv();
            NewCommunityActivity.A0G(newCommunityActivity);
        }
    }

    public void onError(int i) {
        C587030s r0 = this.A01.A01;
        if (r0 != null) {
            NewCommunityActivity newCommunityActivity = r0.A00;
            newCommunityActivity.A0A.A04();
            newCommunityActivity.Bnv();
            NewCommunityActivity.A0G(newCommunityActivity);
        }
    }
}
