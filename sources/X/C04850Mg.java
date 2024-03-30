package X;

import java.util.Iterator;

/* renamed from: X.0Mg  reason: invalid class name and case insensitive filesystem */
public final class C04850Mg extends C04860Mh {
    public static final C04850Mg A05;
    public static final Object[] A06;
    public final transient Object[] A00;
    public final transient Object[] A01;
    public final transient int A02;
    public final transient int A03;
    public final transient int A04;

    static {
        Object[] objArr = new Object[0];
        A06 = objArr;
        A05 = new C04850Mg(objArr, 0, objArr, 0, 0);
    }

    public final int A04() {
        return this.A04;
    }

    public final int A05() {
        return 0;
    }

    public final Object[] A08() {
        return this.A00;
    }

    public final boolean A0B() {
        return true;
    }

    public final int hashCode() {
        return this.A02;
    }

    public final int size() {
        return this.A04;
    }

    public final int A06(Object[] objArr, int i) {
        Object[] objArr2 = this.A00;
        int i2 = this.A04;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    public final AnonymousClass0MZ A09() {
        Object[] objArr = this.A00;
        int i = this.A04;
        C04930Mo r0 = AnonymousClass0MZ.A00;
        if (i == 0) {
            return AnonymousClass0MY.A02;
        }
        return new AnonymousClass0MY(objArr, i);
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.A01;
        if (obj != null && objArr.length != 0) {
            int rotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * -862048943), 15)) * 461845907);
            while (true) {
                int i = rotateLeft & this.A03;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    break;
                } else if (obj2.equals(obj)) {
                    return true;
                } else {
                    rotateLeft = i + 1;
                }
            }
        }
        return false;
    }

    public C04850Mg(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.A00 = objArr;
        this.A02 = i;
        this.A01 = objArr2;
        this.A03 = i2;
        this.A04 = i3;
    }

    public final C12200hf A07() {
        return A0A().listIterator(0);
    }

    public final /* synthetic */ Iterator iterator() {
        return A0A().listIterator(0);
    }
}
