package X;

import java.util.List;

/* renamed from: X.500  reason: invalid class name */
public class AnonymousClass500 extends C142266ob {
    public C160807lc A00;

    public AnonymousClass500(C160807lc r8) {
        super("bk.action.qpl.userflow.AnnotateV2", "bk.action.qpl.userflow.EndFlowCancelV2", "bk.action.qpl.userflow.EndFlowFailureV2", "bk.action.qpl.userflow.EndFlowSuccessV2", "bk.action.qpl.userflow.MarkErrorV2", "bk.action.qpl.userflow.MarkPointV2", "bk.action.qpl.userflow.StartFlowV2");
        this.A00 = r8;
    }

    public /* bridge */ /* synthetic */ Object B6u(AnonymousClass6MO r13, C115215iW r14, C124125xd r15) {
        String str = r14.A00;
        short s = -1;
        switch (str.hashCode()) {
            case -1507852311:
                s = C90504aG.A0y("bk.action.qpl.userflow.AnnotateV2", str);
                break;
            case -1330718402:
                s = C90514aH.A1B("bk.action.qpl.userflow.EndFlowFailureV2", str);
                break;
            case -921635786:
                s = C90514aH.A1C("bk.action.qpl.userflow.MarkErrorV2", str);
                break;
            case -782725013:
                if (str.equals("bk.action.qpl.userflow.StartFlowV2")) {
                    s = 3;
                    break;
                }
                break;
            case 136195447:
                if (str.equals("bk.action.qpl.userflow.EndFlowSuccessV2")) {
                    s = 4;
                    break;
                }
                break;
            case 156743102:
                if (str.equals("bk.action.qpl.userflow.MarkPointV2")) {
                    s = 5;
                    break;
                }
                break;
            case 959076350:
                if (str.equals("bk.action.qpl.userflow.EndFlowCancelV2")) {
                    s = 6;
                    break;
                }
                break;
        }
        C124125xd r7 = r15;
        switch (s) {
            case 0:
                C160807lc r4 = this.A00;
                List list = r13.A00;
                r4.B10(r15, C90494aF.A0k(list, 2), C36351kA.A06(list, 0), C36351kA.A06(list, 1));
                return null;
            case 1:
                C160807lc r6 = this.A00;
                List list2 = r13.A00;
                r6.B6Y(r7, C90474aD.A0j(list2), C36401kF.A0s(list2, 3), C36351kA.A06(list2, 0), C36351kA.A06(list2, 1));
                return null;
            case 2:
                C160807lc r62 = this.A00;
                List list3 = r13.A00;
                r62.BP5(r7, C90474aD.A0j(list3), C36401kF.A0s(list3, 3), C36351kA.A06(list3, 0), C36351kA.A06(list3, 1));
                return null;
            case 3:
                List list4 = r13.A00;
                C140456lc A0K = C90504aG.A0K(list4, 2);
                boolean equals = "cancel".equals(C140456lc.A0J(A0K));
                String A0K2 = C140456lc.A0K(A0K);
                if (A0K2 == null) {
                    A0K2 = "WaBloks";
                }
                this.A00.Buw(r7, A0K2, C36351kA.A06(list4, 0), C36351kA.A06(list4, 1), equals);
                return null;
            case 4:
                C160807lc r3 = this.A00;
                List list5 = r13.A00;
                r3.B6b(r15, C36351kA.A06(list5, 0), C36351kA.A06(list5, 1));
                return null;
            case 5:
                C160807lc r63 = this.A00;
                List list6 = r13.A00;
                r63.BP6(r7, C90474aD.A0j(list6), C90494aF.A0k(list6, 3), C36351kA.A06(list6, 0), C36351kA.A06(list6, 1));
                return null;
            case 6:
                C160807lc r42 = this.A00;
                List list7 = r13.A00;
                r42.B6W(r15, C90474aD.A0j(list7), C36351kA.A06(list7, 0), C36351kA.A06(list7, 1));
                return null;
            default:
                return null;
        }
    }
}
