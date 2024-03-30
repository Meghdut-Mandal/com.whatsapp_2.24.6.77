package X;

import com.whatsapp.payments.phoenix.webview.fragment.FcsWebViewFragment;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.B7u  reason: case insensitive filesystem */
public class C23160B7u implements C158597hl {
    public Object A00;
    public final int A01;

    public C23160B7u(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BX5(Object obj) {
        AnonymousClass8h2 r1;
        AnonymousClass6F2 r12;
        FcsWebViewFragment fcsWebViewFragment;
        C92624eH r13;
        AnonymousClass8h2 r14;
        Set<C195669Vm> set;
        switch (this.A01) {
            case 0:
                AnonymousClass705 r142 = (AnonymousClass705) obj;
                AF8 A04 = ((AnonymousClass9jA) this.A00).A04.A04("FBPAY");
                C18740tg.A06(A04);
                C23075B3f BBn = A04.BBn();
                if (BBn != null) {
                    C176658cT B4W = BBn.B4W();
                    B4W.A08 = C36361kB.A0i();
                    B4W.A0b = C36431kI.A1A(r142.A01, AnonymousClass9jA.A0E);
                    B4W.A07 = (Integer) AnonymousClass9jA.A0F.get(r142.A00);
                    BBn.BOl(B4W);
                    return;
                }
                return;
            case 1:
                AnonymousClass9S8 r6 = (AnonymousClass9S8) this.A00;
                AT9 at9 = (AT9) obj;
                AnonymousClass00C.A0D(at9, 1);
                String str = at9.A00;
                int i = 0;
                while (true) {
                    Stack stack = r6.A03;
                    if (!AnonymousClass00C.A0J(stack.peek(), str)) {
                        r6.A04.pop();
                        stack.pop();
                        i++;
                    } else {
                        C194409Po r3 = r6.A00;
                        AnonymousClass9F7 r2 = r3.A00.A0H;
                        for (int i2 = 0; i2 < i; i2++) {
                            r2.A00.pop();
                        }
                        Object pollFirst = ((Deque) C165607th.A0n(r6.A04)).pollFirst();
                        C18740tg.A06(pollFirst);
                        String str2 = (String) pollFirst;
                        AnonymousClass00C.A0B(str2);
                        r3.A00(str2, (Map) null, true);
                        return;
                    }
                }
            case 2:
                C203619oP r62 = (C203619oP) this.A00;
                C194679Qr r15 = r62.A05;
                if ((r15 instanceof AnonymousClass8h2) && r15 != null) {
                    String str3 = r15.A01;
                    Map map = r62.A09;
                    if (map != null && (set = (Set) map.get(str3)) != null) {
                        for (C195669Vm r16 : set) {
                            ((AnonymousClass628) r62.A0K.get()).A00(r16.A00, r62.A0M, r16.A01, r62.hashCode());
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((C202129l5) this.A00).A01 = true;
                return;
            case 4:
                C202129l5 r7 = (C202129l5) this.A00;
                AnonymousClass707 r143 = (AnonymousClass707) obj;
                AnonymousClass00C.A0D(r143, 1);
                C203619oP r4 = r7.A02.A00;
                C194679Qr r17 = r4.A05;
                if ((r17 instanceof AnonymousClass8h2) && (r14 = (AnonymousClass8h2) r17) != null) {
                    AnonymousClass66U r22 = r4.A04;
                    if (r22 == null) {
                        throw C36331k8.A0d("fcsLoadingEventManager");
                    }
                    r22.A01((AnonymousClass6PH) null, "onStartLoading", r14.A00(), (Map) null);
                }
                C203619oP.A07(r4, "actionPerformed");
                C203619oP.A08(r4, "action_performed", "cancel");
                C105705Fs r0 = r4.A0G;
                r0.A01.A04(r4.A00, 4);
                C194679Qr r18 = r4.A05;
                if ((r18 instanceof AnonymousClass8h2) && (r1 = (AnonymousClass8h2) r18) != null) {
                    AnonymousClass9RW r02 = (AnonymousClass9RW) r4.A0I.A00.get(r1.A03);
                    if (r02 != null) {
                        r12 = r02.A00();
                    } else {
                        r12 = null;
                    }
                    if ((r12 instanceof AnonymousClass5G5) && (fcsWebViewFragment = ((AnonymousClass5G5) r12).A00) != null && (r13 = fcsWebViewFragment.A00) != null && r13.canGoBack()) {
                        r13.goBack();
                        return;
                    }
                }
                String str4 = r143.A00;
                if (str4 != null) {
                    C187868yf r32 = C187868yf.BACK_BUTTON;
                    AnonymousClass9WF r23 = r7.A03;
                    boolean A012 = r23.A01(str4);
                    if (!r23.A02(str4) && !A012) {
                        r23.A00.remove(r23.A00().A01);
                        LinkedHashMap A013 = C202129l5.A01(r7, str4, r143.A01);
                        r4.A02 = r32;
                        C203619oP.A04(r4, (AnonymousClass6PH) null, (String) C007103b.A0N(C90494aF.A0i(str4, ":")), (Map) null, A013, false);
                        return;
                    }
                }
                if ((!r143.A02 || r7.A00 != AnonymousClass5SL.CLOSE) && r7.A00 != null) {
                    r7.A04(C187868yf.BACK_BUTTON, (AnonymousClass6PH) null, str4, r143.A01, (Map) null);
                    return;
                } else {
                    r7.A03(C187868yf.BACK_BUTTON);
                    return;
                }
            default:
                ((C202129l5) this.A00).A03(C187868yf.BACK_BUTTON);
                return;
        }
    }
}
