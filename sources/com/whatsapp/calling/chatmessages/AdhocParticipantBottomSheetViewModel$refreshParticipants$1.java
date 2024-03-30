package com.whatsapp.calling.chatmessages;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass05L;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass3JW;
import X.AnonymousClass3UD;
import X.C009003v;
import X.C023509x;
import X.C107255Nf;
import X.C107265Nh;
import X.C19630wG;
import X.C19730wQ;
import X.C222713q;
import X.C36321k7;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C47862ft;
import X.C89834Yb;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel$refreshParticipants$1", f = "AdhocParticipantBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AdhocParticipantBottomSheetViewModel$refreshParticipants$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ AdhocParticipantBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdhocParticipantBottomSheetViewModel$refreshParticipants$1(AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = adhocParticipantBottomSheetViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new AdhocParticipantBottomSheetViewModel$refreshParticipants$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AdhocParticipantBottomSheetViewModel$refreshParticipants$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel = this.this$0;
            C107265Nh A05 = adhocParticipantBottomSheetViewModel.A0A.A05(adhocParticipantBottomSheetViewModel.A0B);
            if (A05 != null) {
                AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel2 = this.this$0;
                adhocParticipantBottomSheetViewModel2.A02 = A05.A0K;
                adhocParticipantBottomSheetViewModel2.A00 = A05;
                AnonymousClass05L r4 = adhocParticipantBottomSheetViewModel2.A0F;
                boolean z = adhocParticipantBottomSheetViewModel2.A0I;
                if (z) {
                    AnonymousClass16D r9 = adhocParticipantBottomSheetViewModel2.A07;
                    AnonymousClass171 r8 = adhocParticipantBottomSheetViewModel2.A08;
                    ArrayList A0C = A05.A0C();
                    ArrayList<C107255Nf> A0I = AnonymousClass001.A0I();
                    Iterator it = A0C.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        C36391kE.A1V(next, A0I, adhocParticipantBottomSheetViewModel2.A04.A0M(((C107255Nf) next).A00) ? 1 : 0);
                    }
                    ArrayList A0J = C36321k7.A0J(A0I);
                    for (C107255Nf r0 : A0I) {
                        A0J.add(r0.A00);
                    }
                    obj2 = AnonymousClass3UD.A04(r9, r8, A0J, 3, false);
                } else {
                    boolean A0N = A05.A0N();
                    int i = R.string.f12nameremoved;
                    if (A0N) {
                        i = R.string.f12nameremoved;
                    }
                    obj2 = new C47862ft(new Object[0], i);
                }
                r4.setValue(obj2);
                if (!z) {
                    int size = A05.A0C().size() - 1;
                    AnonymousClass05L r3 = adhocParticipantBottomSheetViewModel2.A0E;
                    C19630wG r2 = adhocParticipantBottomSheetViewModel2.A09;
                    Object[] A0L = AnonymousClass001.A0L();
                    AnonymousClass000.A1L(A0L, size, 0);
                    r3.setValue(r2.A02(R.string.f12nameremoved, A0L));
                }
                ArrayList A0C2 = A05.A0C();
                AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel3 = this.this$0;
                ArrayList<C107255Nf> A0I2 = AnonymousClass001.A0I();
                Iterator it2 = A0C2.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    C19730wQ r1 = adhocParticipantBottomSheetViewModel3.A04;
                    C222713q r02 = AnonymousClass11F.A00;
                    if (!r1.A0M(C222713q.A00(((C107255Nf) next2).A00))) {
                        A0I2.add(next2);
                    }
                }
                AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel4 = this.this$0;
                ArrayList A0J2 = C36321k7.A0J(A0I2);
                for (C107255Nf r03 : A0I2) {
                    AnonymousClass141 A0D = adhocParticipantBottomSheetViewModel4.A07.A0D(r03.A00);
                    String str = adhocParticipantBottomSheetViewModel4.A08.A0E(A0D, 7, false, true).A01;
                    if (str == null) {
                        str = "";
                    }
                    A0J2.add(new AnonymousClass3JW(A0D, str, true, true));
                }
                AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel5 = this.this$0;
                AnonymousClass05L r82 = adhocParticipantBottomSheetViewModel5.A0H;
                List A00 = C89834Yb.A00(A0J2, 2);
                ArrayList A0J3 = C36321k7.A0J(A00);
                int i2 = 0;
                for (Object next3 : A00) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        throw C36351kA.A0v();
                    }
                    AnonymousClass3JW r42 = (AnonymousClass3JW) next3;
                    int i4 = adhocParticipantBottomSheetViewModel5.A03;
                    boolean z2 = true;
                    r42.A01 = AnonymousClass000.A1T(i2, i4);
                    if (i2 >= i4) {
                        z2 = false;
                    }
                    r42.A00 = z2;
                    A0J3.add(r42);
                    i2 = i3;
                }
                r82.setValue(A0J3);
                AnonymousClass05L r32 = adhocParticipantBottomSheetViewModel5.A0G;
                Iterable<AnonymousClass3JW> iterable = (Iterable) adhocParticipantBottomSheetViewModel5.A0H.getValue();
                int i5 = 0;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (AnonymousClass3JW r04 : iterable) {
                        if (r04.A01 && (i5 = i5 + 1) < 0) {
                            throw C36371kC.A0s();
                        }
                    }
                }
                r32.setValue(new Integer(i5));
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
