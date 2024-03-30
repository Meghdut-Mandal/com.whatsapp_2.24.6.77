package X;

import java.util.Comparator;
import java.util.List;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* renamed from: X.7qx  reason: invalid class name and case insensitive filesystem */
public class C163907qx implements Comparator {
    public final int A00;

    public C163907qx(int i) {
        this.A00 = i;
    }

    public static List A00(Iterable iterable, int i) {
        return C007103b.A0c(iterable, new C163907qx(i));
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Integer num;
        int i;
        switch (this.A00) {
            case 0:
                C137846gp r5 = (C137846gp) obj;
                C137846gp r6 = (C137846gp) obj2;
                int A002 = AnonymousClass00C.A00(r5.A00, r6.A00);
                if (A002 == 0) {
                    return AnonymousClass00C.A00(r5.hashCode(), r6.hashCode());
                }
                return A002;
            case 1:
                num = Integer.valueOf(((C128326Bu) obj).A01);
                i = ((C128326Bu) obj2).A01;
                break;
            case 2:
                C139206jP r52 = (C139206jP) obj;
                C139206jP r62 = (C139206jP) obj2;
                int i2 = r52.A03;
                int i3 = r62.A03;
                float f = r52.A02;
                float f2 = r62.A02;
                if (i2 == i3) {
                    if (f != f2) {
                        return (int) Math.signum(f - f2);
                    }
                    i2 = r52.A05;
                    i3 = r62.A05;
                }
                return i2 - i3;
            case 3:
                return ((C120955sM) obj).A00.compareTo(((C120955sM) obj2).A00);
            case 4:
                C120955sM r53 = (C120955sM) obj;
                C120955sM r63 = (C120955sM) obj2;
                Long l = r53.A01;
                Long l2 = r63.A01;
                if (l.equals(l2)) {
                    l2 = r63.A00;
                    l = r53.A00;
                }
                return l2.compareTo(l);
            case 5:
                return 0;
            case 9:
                return C05590Qh.A00(((C144426sA) ((AnonymousClass72U) obj).A03).A0B.A04, ((C144426sA) ((AnonymousClass72U) obj2).A03).A0B.A04);
            case 10:
                return C05590Qh.A00(Float.valueOf(((C144426sA) obj).A06), Float.valueOf(((C144426sA) obj2).A06));
            case 12:
                return C05590Qh.A00(Long.valueOf(((C201669k5) obj).A04), Long.valueOf(((C201669k5) obj2).A04));
            case 13:
                num = Integer.valueOf(((C119575q5) obj).A00);
                i = ((C119575q5) obj2).A00;
                break;
            case 14:
                return C05590Qh.A00(Long.valueOf(((C107265Nh) obj2).A01), Long.valueOf(((C107265Nh) obj).A01));
            case 15:
                return C05590Qh.A00(Long.valueOf(((C65073Qp) obj2).A03()), Long.valueOf(((C65073Qp) obj).A03()));
            case 16:
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(AnonymousClass000.A1W(((AnonymousClass6CR) obj).A00));
                if (((AnonymousClass6CR) obj2).A00 != null) {
                    z = false;
                }
                return C05590Qh.A00(valueOf, Boolean.valueOf(z));
            case 17:
                num = Integer.valueOf(((AnonymousClass3PS) obj2).A00);
                i = ((AnonymousClass3PS) obj).A00;
                break;
            case 18:
                num = Integer.valueOf(((C128646Db) obj).A00);
                i = ((C128646Db) obj2).A00;
                break;
            case 19:
                num = Integer.valueOf(((C1268665y) obj2).A00().A00);
                i = ((C1268665y) obj).A00().A00;
                break;
            case 20:
                num = Integer.valueOf(((AnonymousClass5Ke) obj2).A00.A00);
                i = ((AnonymousClass5Ke) obj).A00.A00;
                break;
            case 21:
                return -CronetEngine.Builder.compareVersions(((CronetProvider) obj).getVersion(), ((CronetProvider) obj2).getVersion());
            default:
                return C05590Qh.A00(((C144426sA) obj).A0B.A04, ((C144426sA) obj2).A0B.A04);
        }
        return C05590Qh.A00(num, Integer.valueOf(i));
    }
}
