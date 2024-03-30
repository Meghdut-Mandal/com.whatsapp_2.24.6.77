package X;

/* renamed from: X.07i  reason: invalid class name and case insensitive filesystem */
public class C017107i implements C017007h {
    public int A00;
    public final Object[] A01;

    public boolean BnO(Object obj) {
        int i = 0;
        while (true) {
            int i2 = this.A00;
            if (i >= i2) {
                Object[] objArr = this.A01;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.A00 = i2 + 1;
                return true;
            } else if (this.A01[i] == obj) {
                throw new IllegalStateException("Already in the pool!");
            } else {
                i++;
            }
        }
    }

    public Object B09() {
        int i = this.A00;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.A01;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.A00 = i2;
        return obj;
    }

    public C017107i(int i) {
        if (i > 0) {
            this.A01 = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
}
