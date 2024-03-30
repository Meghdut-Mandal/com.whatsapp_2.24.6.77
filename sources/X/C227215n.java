package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* renamed from: X.15n  reason: invalid class name and case insensitive filesystem */
public abstract class C227215n extends C20820yD {
    public Object[] contents;
    public boolean forceCopy;
    public int size = 0;

    private void getReadyToExpandTo(int i) {
        Object[] objArr;
        Object[] objArr2 = this.contents;
        int length = objArr2.length;
        if (length < i) {
            objArr = Arrays.copyOf(objArr2, C20820yD.expandedCapacity(length, i));
        } else if (this.forceCopy) {
            objArr = (Object[]) objArr2.clone();
        } else {
            return;
        }
        this.contents = objArr;
        this.forceCopy = false;
    }

    public C20820yD addAll(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            getReadyToExpandTo(this.size + collection.size());
            if (collection instanceof C20750y6) {
                this.size = ((C20750y6) collection).copyIntoArray(this.contents, this.size);
                return this;
            }
        }
        super.addAll(iterable);
        return this;
    }

    public C227215n(int i) {
        C20080wz.checkNonnegative(i, "initialCapacity");
        this.contents = new Object[i];
    }

    public C227215n add(Object obj) {
        Objects.requireNonNull(obj);
        getReadyToExpandTo(this.size + 1);
        Object[] objArr = this.contents;
        int i = this.size;
        this.size = i + 1;
        objArr[i] = obj;
        return this;
    }

    public C20820yD add(Object... objArr) {
        addAll(objArr, objArr.length);
        return this;
    }

    public final void addAll(Object[] objArr, int i) {
        C23921Aj.checkElementsNotNull(objArr, i);
        getReadyToExpandTo(this.size + i);
        System.arraycopy(objArr, 0, this.contents, this.size, i);
        this.size += i;
    }
}
