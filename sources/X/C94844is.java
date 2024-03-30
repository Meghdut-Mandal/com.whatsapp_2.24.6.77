package X;

import android.view.KeyEvent;
import androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1;
import androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2$1;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4is  reason: invalid class name and case insensitive filesystem */
public abstract class C94844is extends C94114hf implements C161847nZ, C161757nQ {
    public C161437mu A00;
    public AnonymousClass68P A01;
    public AnonymousClass00S A02;
    public boolean A03;
    public final C120615rn A04 = new C120615rn();

    /* renamed from: BT3 */
    public void BkO() {
        ((C93354gQ) this).A00.BkO();
    }

    public void Bcv(C120675rt r2, C107935Rl r3, long j) {
        ((C93354gQ) this).A00.Bcv(r2, r3, j);
    }

    public final void A0G() {
        C120615rn r5 = this.A04;
        C136706er r0 = r5.A01;
        if (r0 != null) {
            ((C136726et) this.A00).A00.BwB(new C136696eq(r0));
        }
        Map map = r5.A02;
        Iterator A0z = AnonymousClass000.A0z(map);
        while (A0z.hasNext()) {
            C161437mu r02 = this.A00;
            ((C136726et) r02).A00.BwB(new C136696eq((C136706er) A0z.next()));
        }
        r5.A01 = null;
        map.clear();
    }

    public boolean BZT(KeyEvent keyEvent) {
        int A08;
        if (this.A03) {
            long j = C112155dR.A00;
            if (keyEvent.getAction() == 0 && ((A08 = C90494aF.A08(C109135Wk.A01(keyEvent))) == 23 || A08 == 66 || A08 == 160)) {
                C120615rn r3 = this.A04;
                Map map = r3.A02;
                if (map.containsKey(new C131386Ov(C109135Wk.A01(keyEvent)))) {
                    return false;
                }
                C136706er r32 = new C136706er(r3.A00);
                map.put(new C131386Ov(C109135Wk.A01(keyEvent)), r32);
                C36331k8.A1T(new AbstractClickableNode$onKeyEvent$1(this, r32, (C023509x) null), A07());
                return true;
            }
        }
        if (!this.A03) {
            return false;
        }
        long j2 = C112155dR.A00;
        int action = keyEvent.getAction();
        if (action == 0 || action != 1) {
            return false;
        }
        int A082 = C90494aF.A08(C109135Wk.A01(keyEvent));
        if (A082 != 23 && A082 != 66 && A082 != 160) {
            return false;
        }
        C136706er r2 = (C136706er) this.A04.A02.remove(new C131386Ov(C109135Wk.A01(keyEvent)));
        if (r2 != null) {
            C36331k8.A1T(new AbstractClickableNode$onKeyEvent$2$1(this, r2, (C023509x) null), A07());
        }
        this.A02.invoke();
        return true;
    }

    public C94844is(C161437mu r2, AnonymousClass68P r3, AnonymousClass00S r4, boolean z) {
        this.A00 = r2;
        this.A03 = z;
        this.A01 = r3;
        this.A02 = r4;
    }

    public /* synthetic */ boolean BKp() {
        return false;
    }

    public /* synthetic */ boolean Bst() {
        return false;
    }
}
