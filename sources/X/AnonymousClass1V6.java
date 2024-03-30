package X;

import android.os.PowerManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1V6  reason: invalid class name */
public class AnonymousClass1V6 implements AnonymousClass191, AnonymousClass1V5 {
    public C148826zU A00;
    public C46812bi A01;
    public C46812bi A02;
    public boolean A03;

    public synchronized C148826zU A00() {
        return this.A00;
    }

    public C46812bi A01() {
        C46812bi r0;
        synchronized (this) {
            r0 = this.A02;
        }
        if (r0 != null) {
            return r0;
        }
        C148826zU A002 = A00();
        if (A002 != null) {
            return A002.A0J;
        }
        C46812bi A022 = A02();
        if (A022 == null) {
            return null;
        }
        return A022;
    }

    public synchronized C46812bi A02() {
        return this.A01;
    }

    public synchronized void A07() {
        this.A01 = null;
    }

    public synchronized void A08(C148826zU r2) {
        A09(r2, false);
    }

    public synchronized void A09(C148826zU r2, boolean z) {
        this.A03 = z;
        this.A00 = r2;
        if (r2 != null && r2.A0l) {
            this.A01 = r2.A0J;
        }
    }

    public synchronized void A0A(boolean z) {
        this.A03 = z;
    }

    public synchronized boolean A0C() {
        return this.A03;
    }

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Bas(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void Bau(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void Baw(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bax(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bay(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bb4(Collection collection, int i) {
        C54122sR.A00(this, collection, i);
    }

    public /* synthetic */ void Bb7(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb8(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb9(Collection collection) {
    }

    public /* synthetic */ void Bbc(C28981Uw r1) {
    }

    public /* synthetic */ void Bbd(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bbe(C28981Uw r1, boolean z) {
    }

    public /* synthetic */ void Bbf(C28981Uw r1) {
    }

    public /* synthetic */ void Bbr() {
    }

    public /* synthetic */ void Bci(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bck(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public void A03() {
        C148826zU r2 = this.A00;
        if (r2 != null) {
            boolean z = true;
            r2.A0M = true;
            PowerManager.WakeLock wakeLock = r2.A0b;
            if (wakeLock == null || !wakeLock.isHeld()) {
                z = false;
            }
            r2.A0U = z;
            C148826zU.A06(r2);
        }
    }

    public void A04() {
        C148826zU r1 = this.A00;
        if (r1 != null) {
            r1.A0E(false);
        }
    }

    public void A05() {
        C148826zU r1 = this.A00;
        if (r1 != null) {
            r1.A0M = false;
            if (r1.A0U) {
                C148826zU.A05(r1);
            }
        }
    }

    public void A06() {
        C148826zU r2 = this.A00;
        if (r2 != null) {
            r2.A0H(true, false);
        }
    }

    public boolean A0B() {
        C148826zU r0 = this.A00;
        if (r0 == null || !r0.A0I()) {
            return false;
        }
        return true;
    }

    public boolean A0D(AnonymousClass3T1 r3) {
        C148826zU r0 = this.A00;
        if (r0 == null || !r3.A1J.equals(r0.A0J.A1J)) {
            return false;
        }
        return true;
    }

    public void BYr(boolean z) {
        if (!z) {
            A04();
        }
    }

    public void Bb5(AnonymousClass11F r4) {
        C46812bi r0;
        AnonymousClass11F r02;
        C148826zU r2 = this.A00;
        if (r2 != null && (r0 = r2.A0J) != null && (r02 = r0.A1J.A00) != null && r02.equals(r4)) {
            r2.A0H(true, true);
        }
    }

    public void Bb6(Collection collection, Map map) {
        if (this.A00 != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((AnonymousClass3T1) it.next()).A1J.equals(this.A00.A0J.A1J)) {
                    this.A00.A0H(false, true);
                    return;
                }
            }
        }
    }

    public AnonymousClass1V6(AnonymousClass1V1 r3, C20810yC r4, AnonymousClass1V4 r5) {
        Set set;
        if (C20800yB.A01(C21000yV.A02, r4, 1617)) {
            set = r3.A02;
        } else {
            set = r5.A01;
        }
        set.add(this);
    }
}
