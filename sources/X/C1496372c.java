package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.72c  reason: invalid class name and case insensitive filesystem */
public final class C1496372c implements Iterable, AnonymousClass00W {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ArrayList A04 = AnonymousClass001.A0I();
    public HashMap A05;
    public boolean A06;
    public int[] A07 = new int[0];
    public Object[] A08 = new Object[0];

    public final int A00(AnonymousClass606 r3) {
        if (!this.A06) {
            int i = r3.A00;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            throw AnonymousClass001.A08("Anchor refers to a group that was removed");
        }
        throw AnonymousClass6XJ.A01("Use active SlotWriter to determine anchor location instead");
    }

    public final AnonymousClass6QL A01() {
        if (!this.A06) {
            this.A01++;
            return new AnonymousClass6QL(this);
        }
        throw AnonymousClass001.A09("Cannot read while a writer is pending");
    }

    public final AnonymousClass6YK A02() {
        if (!(!this.A06)) {
            throw AnonymousClass6XJ.A01("Cannot start a writer when another writer is pending");
        } else if (this.A01 <= 0) {
            this.A06 = true;
            this.A03++;
            return new AnonymousClass6YK(this);
        } else {
            throw AnonymousClass6XJ.A01("Cannot start a writer when a reader is pending");
        }
    }

    public Iterator iterator() {
        return new AnonymousClass76U(this, 0, this.A00);
    }
}
