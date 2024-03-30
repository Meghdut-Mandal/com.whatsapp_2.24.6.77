package X;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4vP  reason: invalid class name and case insensitive filesystem */
public class C100674vP extends C124125xd {
    public static final AnonymousClass5YN A0A = new AnonymousClass5YN();
    public final C1271967i A00;
    public final C131536Pl A01;
    public final AnonymousClass6IK A02;
    public final C160377ku A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final WeakReference A07;
    public final Map A08;
    public final Set A09;

    public static C100674vP A00(C1271967i r14, C160377ku r15, List list) {
        AnonymousClass65A r0 = r14.A02;
        AnonymousClass7fJ A032 = C133266Xn.A03(r14);
        AnonymousClass6IK B8s = r0.A01.B8s();
        String A002 = C1271967i.A00(r14);
        return new C100674vP((C157187by) null, AnonymousClass6IB.A00, r14, (C1271967i) null, (C131536Pl) null, B8s, r15, A032, C023109s.A01, A002, (String) null, list, (Map) null, (Set) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100674vP(C157187by r11, AnonymousClass6IB r12, C1271967i r13, C1271967i r14, C131536Pl r15, AnonymousClass6IK r16, C160377ku r17, AnonymousClass7fJ r18, Integer num, String str, String str2, List list, Map map, Set set) {
        super(r11, A0A, r12, new AnonymousClass5Z5(), r18, list);
        String str3 = str2;
        this.A00 = r13;
        this.A03 = r17;
        this.A08 = map;
        this.A01 = r15;
        this.A09 = set;
        this.A02 = r16;
        this.A06 = str;
        this.A04 = num;
        this.A07 = AnonymousClass001.A0F(r14);
        this.A05.A00.add(new C142226oX());
        this.A05 = str2 == null ? C36361kB.A0l() : str3;
    }

    public static C100674vP A01(C100674vP r17, List list) {
        C100674vP r3 = r17;
        List list2 = list;
        if (list2 == r3.A06) {
            return r17;
        }
        C1271967i r7 = r3.A00;
        C160377ku r11 = r3.A03;
        Map map = r3.A08;
        C131536Pl r9 = r3.A01;
        Set set = r3.A09;
        AnonymousClass7fJ r12 = r3.A02;
        AnonymousClass6IK r10 = r3.A02;
        String str = r3.A06;
        C100674vP r4 = new C100674vP((C157187by) null, r3.A01, r7, (C1271967i) null, r9, r10, r11, r12, r3.A04, str, r3.A05, list2, map, set);
        C142236oY r2 = r4.A05;
        CopyOnWriteArraySet copyOnWriteArraySet = r3.A05.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            r2.A00.addAll(copyOnWriteArraySet);
        }
        return r4;
    }
}
