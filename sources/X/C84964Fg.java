package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4Fg  reason: invalid class name and case insensitive filesystem */
public final class C84964Fg extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass3ID[] $delegateRepositories;
    public final /* synthetic */ AnonymousClass3ID this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84964Fg(AnonymousClass3ID r2, AnonymousClass3ID[] r3) {
        super(0);
        this.$delegateRepositories = r3;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A1G;
        Integer[] numArr;
        LinkedHashMap A1G2 = C36431kI.A1G();
        AnonymousClass3ID[] r3 = this.$delegateRepositories;
        AnonymousClass3ID r4 = this.this$0;
        for (AnonymousClass3ID r0 : r3) {
            if (r0 != null) {
                A1G2.putAll((Map) r0.A00.getValue());
            }
        }
        boolean z = r4 instanceof C43682Jk;
        if (z) {
            A1G = C36431kI.A1G();
            C36331k8.A1Q(((C43682Jk) r4).A00, A1G, 21);
        } else if (r4 instanceof C43702Jm) {
            C43702Jm r2 = (C43702Jm) r4;
            A1G = C36431kI.A1G();
            C36331k8.A1Q(r2.A03, A1G, 13);
            C36331k8.A1Q(r2.A01, A1G, 21);
            C36331k8.A1Q(r2.A02, A1G, 14);
        } else if (r4 instanceof C43692Jl) {
            C43692Jl r22 = (C43692Jl) r4;
            A1G = C36431kI.A1G();
            C36331k8.A1Q(r22.A00, A1G, 19);
            C36331k8.A1Q(r22.A01, A1G, 20);
        } else if (r4 instanceof AnonymousClass2Jf) {
            AnonymousClass2Jf r23 = (AnonymousClass2Jf) r4;
            A1G = C36431kI.A1G();
            C19460v5 r1 = r23.A00;
            if (r1.A05()) {
                r1.A02();
                throw AnonymousClass001.A0A("provideMessageSelectionAction");
            }
            AnonymousClass2Ja r12 = r23.A03;
            C36331k8.A1Q(r12, A1G, r12.A00.getId());
            AnonymousClass2JY r13 = r23.A01;
            C36331k8.A1Q(r13, A1G, r13.A00.getId());
            C43612Jb r14 = r23.A04;
            C36331k8.A1Q(r14, A1G, r14.A00.getId());
            AnonymousClass2JZ r15 = r23.A02;
            C36331k8.A1Q(r15, A1G, r15.A00.getId());
        } else if (r4 instanceof C43642Jg) {
            C43642Jg r24 = (C43642Jg) r4;
            A1G = C36431kI.A1G();
            C36331k8.A1Q(r24.A03, A1G, 9);
            C36331k8.A1Q(r24.A05, A1G, 1);
            C36331k8.A1Q(r24.A06, A1G, 15);
            C36331k8.A1Q(r24.A02, A1G, 28);
            C36331k8.A1Q(r24.A08, A1G, 26);
            C36331k8.A1Q(r24.A07, A1G, 31);
            C36331k8.A1Q(r24.A04, A1G, 12);
            C36331k8.A1Q(r24.A00, A1G, 34);
            C36331k8.A1Q(r24.A01, A1G, 35);
        } else if (r4 instanceof C43672Jj) {
            A1G = C36431kI.A1G();
        } else if (r4 instanceof C43652Jh) {
            C43652Jh r25 = (C43652Jh) r4;
            A1G = C36431kI.A1G();
            C36331k8.A1Q(r25.A02, A1G, 5);
            C36331k8.A1Q(r25.A0C, A1G, 2);
            C36331k8.A1Q(r25.A0A, A1G, 16);
            C36331k8.A1Q(r25.A0B, A1G, 6);
            C36331k8.A1Q(r25.A03, A1G, 21);
            C36331k8.A1Q(r25.A0F, A1G, 3);
            C36331k8.A1Q(r25.A04, A1G, 4);
            C36331k8.A1Q(r25.A06, A1G, 8);
            C36331k8.A1Q(r25.A09, A1G, 24);
            C36331k8.A1Q(r25.A0E, A1G, 25);
            C36331k8.A1Q(r25.A00, A1G, 10);
            C36331k8.A1Q(r25.A01, A1G, 7);
            C36331k8.A1Q(r25.A07, A1G, 19);
            C36331k8.A1Q(r25.A08, A1G, 11);
            C36331k8.A1Q(r25.A0D, A1G, 20);
            C36331k8.A1Q(r25.A05, A1G, 30);
        } else if (r4 instanceof C43662Ji) {
            A1G = C36431kI.A1G();
        } else {
            C43632Je r26 = (C43632Je) r4;
            A1G = C36431kI.A1G();
            C36331k8.A1Q(r26.A00, A1G, 32);
            C36331k8.A1Q(r26.A01, A1G, 33);
        }
        A1G2.putAll(A1G);
        if (z) {
            numArr = ((C43682Jk) r4).A01;
        } else if (r4 instanceof C43702Jm) {
            numArr = ((C43702Jm) r4).A04;
        } else if (r4 instanceof C43692Jl) {
            numArr = ((C43692Jl) r4).A02;
        } else if (r4 instanceof C43672Jj) {
            numArr = ((C43672Jj) r4).A00;
        } else if (r4 instanceof C43662Ji) {
            numArr = ((C43662Ji) r4).A00;
        } else {
            numArr = r4.A01;
        }
        AnonymousClass3R6.A02(A1G2, numArr);
        return A1G2;
    }
}
