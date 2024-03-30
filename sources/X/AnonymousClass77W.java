package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.77W  reason: invalid class name */
public final /* synthetic */ class AnonymousClass77W implements AnonymousClass004 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C118995p4 A02;

    public /* synthetic */ AnonymousClass77W(C118995p4 r1, int i, long j) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = j;
    }

    public final Object get() {
        C118995p4 r2 = this.A02;
        int i = this.A00;
        long j = this.A01;
        AnonymousClass00C.A0D(r2, 0);
        C132066Rz r8 = r2.A01;
        C124605yU r22 = new C124605yU();
        r22.A03 = "<override-ignore>";
        r22.A07 = false;
        C98504rX r12 = new C98504rX(j, j, j, false, false);
        r22.A00 = r12;
        C98484rV r7 = new C98484rV(((long) ((int) 28)) * 86400, false);
        r22.A01 = r7;
        C98494rW r1 = r22.A02;
        boolean z = r22.A08;
        boolean z2 = r22.A09;
        String str = r22.A04;
        List list = r22.A06;
        String str2 = r22.A05;
        if (r1 == null) {
            C124605yU r13 = new C124605yU();
            r13.A03 = "<override-ignore>";
            r13.A04 = str;
            r13.A07 = false;
            r13.A08 = z;
            r13.A09 = z2;
            r13.A02 = null;
            r13.A00 = r12;
            r13.A01 = r7;
            r13.A06 = list;
            r13.A05 = str2;
            r13.A03 = C131716Qg.A01(i);
            r13.A04 = null;
            r13.A02 = C98494rW.A00;
            r13.A00 = r12;
            r13.A01 = r7;
            C124385y6 r72 = new C124385y6(r13);
            String str3 = r72.A03;
            AnonymousClass6MU r6 = new AnonymousClass6MU(str3);
            r6.A00(r72.A02);
            C98504rX r23 = r72.A00;
            if (r23 == null && r72.A01 == null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Config for ");
                A0u.append(str3);
                throw AnonymousClass000.A0c(" didn't specify an eviction config. Is this what you want?", A0u);
            }
            r6.A00(new C98534ra(r23, r72.A01, str3));
            C17560rc r5 = r8.A00;
            C114885hz r4 = new C114885hz();
            String str4 = r72.A04;
            if (str4 != null) {
                Map map = r4.A00;
                if (map == null) {
                    map = AnonymousClass001.A0J();
                    r4.A00 = map;
                }
                map.put("__subdir__", str4);
            }
            File BJG = r5.BJG(new C118645oV(r4), i);
            C157957ey r14 = r8.A01;
            FileStash r3 = new C140876mJ(r14, BJG);
            if (r72.A06) {
                FileStash r24 = new C98434rQ(RealtimeSinceBootClock.A00, r3);
                ((C157937ew) r14).BBh(C023109s.A0C).execute(AnonymousClass74N.A00(r8, r24, 2));
                r3 = r24;
            }
            if (r72.A07) {
                throw AnonymousClass001.A0D();
            }
            List emptyList = Collections.emptyList();
            List list2 = r72.A05;
            if ((list2 != null && !list2.isEmpty()) || !emptyList.isEmpty()) {
                ArrayList A0I = AnonymousClass001.A0I();
                if (list2 != null) {
                    A0I.addAll(list2);
                }
                A0I.addAll(emptyList);
                ArrayList A0I2 = AnonymousClass001.A0I();
                Iterator it = A0I.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0A("getClass");
                }
                r3 = new C98424rP(r3, A0I2);
            }
            C132066Rz.A00(r3, r6);
            r5.BnH(r6, BJG);
            return new C139516jz(r3, new AtomicReference(), j);
        }
        throw AnonymousClass001.A08("Cannot override cache name or UserScopeConfig. Use CacheLike.builderForOverrides().");
    }
}
