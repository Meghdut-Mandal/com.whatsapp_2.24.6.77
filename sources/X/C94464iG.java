package X;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.4iG  reason: invalid class name and case insensitive filesystem */
public final class C94464iG extends C137856gq implements C161937ni, C161897ne, C161867nb {
    public long A00 = 0;
    public C120675rt A01 = C112395dp.A00;
    public C009003v A02;
    public C120675rt A03;
    public C007403e A04;
    public final C1506776e A05 = C1506776e.A02(new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine[16]);
    public final C1506776e A06 = C1506776e.A02(new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine[16]);

    public /* synthetic */ int Bor(float f) {
        return AnonymousClass6QY.A01(this, f);
    }

    public /* synthetic */ float Bvh(long j) {
        return AnonymousClass6GH.A00(this, j);
    }

    public /* synthetic */ float Bvp(long j) {
        return AnonymousClass6QY.A00(this, j);
    }

    public /* synthetic */ long Bvs(long j) {
        return AnonymousClass6QY.A02(this, j);
    }

    private final void A00(C120675rt r8, C107935Rl r9) {
        C1506776e r5;
        AnonymousClass0AP r1;
        AnonymousClass0AP r12;
        C1506776e r13 = this.A05;
        synchronized (r13) {
            r5 = this.A06;
            r5.A0A(r13, r5.A00);
        }
        try {
            int ordinal = r9.ordinal();
            if (ordinal == 0 || ordinal == 2) {
                int i = r5.A00;
                if (i > 0) {
                    int i2 = 0;
                    Object[] objArr = r5.A01;
                    do {
                        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) objArr[i2];
                        if (r9 == suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A00 && (r1 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A01) != null) {
                            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A01 = null;
                            r1.resumeWith(r8);
                        }
                        i2++;
                    } while (i2 < i);
                }
            } else if (ordinal == 1) {
                int i3 = r5.A00;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    Object[] objArr2 = r5.A01;
                    do {
                        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) objArr2[i4];
                        if (r9 == suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2.A00 && (r12 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2.A01) != null) {
                            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2.A01 = null;
                            r12.resumeWith(r8);
                        }
                        i4--;
                    } while (i4 >= 0);
                }
            }
        } finally {
            r5.A06();
        }
    }

    public void BT3() {
        C120675rt r7 = this.A03;
        if (r7 != null) {
            List list = r7.A02;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!(true ^ ((AnonymousClass6E5) list.get(i)).A0B)) {
                    List list2 = r7.A02;
                    ArrayList A0r = C36361kB.A0r(list2);
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        AnonymousClass6E5 r5 = (AnonymousClass6E5) list2.get(i2);
                        long j = r5.A05;
                        long j2 = r5.A06;
                        long j3 = r5.A0A;
                        float f = r5.A03;
                        boolean z = r5.A0B;
                        A0r.add(new AnonymousClass6E5(f, 1, j, j3, j2, j3, j2, C133206Xf.A03, false, z, z));
                    }
                    C120675rt r2 = new C120675rt((AnonymousClass61T) null, A0r);
                    this.A01 = r2;
                    A00(r2, C107935Rl.Initial);
                    A00(r2, C107935Rl.Main);
                    A00(r2, C107935Rl.Final);
                    this.A03 = null;
                    return;
                }
            }
        }
    }

    public void Bcv(C120675rt r7, C107935Rl r8, long j) {
        this.A00 = j;
        if (r8 == C107935Rl.Initial) {
            this.A01 = r7;
        }
        if (this.A04 == null) {
            this.A04 = AnonymousClass0A2.A02(C023109s.A0G, C008903u.A00, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, (C023509x) null), A07());
        }
        A00(r7, r8);
        List list = r7.A02;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                r7 = null;
                break;
            }
            AnonymousClass6E5 r1 = (AnonymousClass6E5) list.get(i);
            if (!r1.A0C || r1.A0B) {
                break;
            }
            i++;
        }
        this.A03 = r7;
    }

    public void BoX() {
        C007403e r1 = this.A04;
        if (r1 != null) {
            r1.B2S(new AnonymousClass79M());
            this.A04 = null;
        }
    }

    public C94464iG(C009003v r3) {
        this.A02 = r3;
    }

    public Object B1e(C023509x r7, C009003v r8) {
        AnonymousClass0AR A022 = AnonymousClass0AA.A02(r7);
        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine(this, A022);
        C1506776e r3 = this.A05;
        synchronized (r3) {
            r3.A0D(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C12600iM.A01;
            new C12600iM(AnonymousClass0AO.COROUTINE_SUSPENDED, AnonymousClass0AA.A01(AnonymousClass0AA.A00(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, r8))).resumeWith(AnonymousClass0AJ.A00);
        }
        A022.BL1(new AnonymousClass7RP(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine));
        return A022.A0G();
    }

    public float BAy() {
        return AnonymousClass6VZ.A02(this).A0B.BAy();
    }

    public float BC0() {
        return AnonymousClass6VZ.A02(this).A0B.BC0();
    }

    public /* synthetic */ boolean BKp() {
        return false;
    }

    public void BVP() {
        BoX();
    }

    public void BkO() {
        BoX();
    }

    public /* synthetic */ boolean Bst() {
        return false;
    }

    public /* synthetic */ float Bvi(float f) {
        return f / BAy();
    }

    public /* synthetic */ float Bvq(float f) {
        return f * BAy();
    }

    public /* synthetic */ long Bvt(float f) {
        return AnonymousClass6GH.A01(this, f / BAy());
    }
}
