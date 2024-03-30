package X;

import android.os.ConditionVariable;
import java.util.Collections;

/* renamed from: X.19J  reason: invalid class name */
public class AnonymousClass19J extends C19590wC {
    public int A00;
    public boolean A01;
    public final ConditionVariable A02;
    public volatile int A03;
    public volatile int A04;
    public volatile boolean A05;
    public volatile boolean A06;

    public void A01(boolean z) {
        this.A04 = 2;
        this.A01 = true;
        this.A05 = z;
        this.A02.open();
        C18740tg.A01();
        for (C20420xX BYl : getObservers()) {
            BYl.BYl();
        }
    }

    public void A00(C20420xX r3) {
        int i = this.A04;
        if (i == 1) {
            r3.BYm();
        } else if (i == 2) {
            r3.BYl();
        } else if (i == 3) {
            r3.BYn();
        } else if (i == 4) {
            r3.BYp();
        }
        registerObserver(r3);
    }

    public boolean A02() {
        if (this.A04 != 2 || !this.A01) {
            return false;
        }
        return true;
    }

    public AnonymousClass19J(AnonymousClass005 r3) {
        super(r3);
        this.A04 = 3;
        this.A02 = new ConditionVariable(false);
        this.A03 = -1;
    }

    public AnonymousClass19J() {
        this(new C18910u1(Collections.emptySet(), (AnonymousClass004) null));
    }
}
