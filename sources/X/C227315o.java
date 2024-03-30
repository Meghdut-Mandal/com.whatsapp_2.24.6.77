package X;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: X.15o  reason: invalid class name and case insensitive filesystem */
public class C227315o extends C227215n {
    public int hashCode;
    public Object[] hashTable;

    private void addDeduping(Object obj) {
        Objects.requireNonNull(this.hashTable);
        int length = this.hashTable.length - 1;
        int hashCode2 = obj.hashCode();
        int smear = C20770y8.smear(hashCode2);
        while (true) {
            int i = smear & length;
            Object[] objArr = this.hashTable;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                objArr[i] = obj;
                this.hashCode += hashCode2;
                super.add(obj);
                return;
            } else if (!obj2.equals(obj)) {
                smear = i + 1;
            } else {
                return;
            }
        }
    }

    public C20760y7 build() {
        C20760y7 access$100;
        int i = this.size;
        if (i == 0) {
            return C20760y7.of();
        }
        if (i != 1) {
            if (this.hashTable == null || C20760y7.chooseTableSize(i) != this.hashTable.length) {
                access$100 = C20760y7.construct(this.size, this.contents);
                this.size = access$100.size();
            } else {
                int i2 = this.size;
                Object[] objArr = this.contents;
                if (C20760y7.shouldTrim(i2, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i2);
                }
                int i3 = this.hashCode;
                Object[] objArr2 = this.hashTable;
                access$100 = new AnonymousClass18W(objArr, i3, objArr2, objArr2.length - 1, this.size);
            }
            this.forceCopy = true;
            this.hashTable = null;
            return access$100;
        }
        Object obj = this.contents[0];
        Objects.requireNonNull(obj);
        return C20760y7.of(obj);
    }

    public C227315o(int i) {
        super(i);
        this.hashTable = new Object[C20760y7.chooseTableSize(i)];
    }

    public C227315o add(Object obj) {
        Objects.requireNonNull(obj);
        if (this.hashTable == null || C20760y7.chooseTableSize(this.size) > this.hashTable.length) {
            this.hashTable = null;
            super.add(obj);
            return this;
        }
        addDeduping(obj);
        return this;
    }

    public C227315o addAll(Iterable iterable) {
        Objects.requireNonNull(iterable);
        if (this.hashTable != null) {
            for (Object add : iterable) {
                add(add);
            }
        } else {
            super.addAll(iterable);
        }
        return this;
    }

    public C227315o() {
        super(4);
    }

    public C227315o add(Object... objArr) {
        if (this.hashTable != null) {
            for (Object add : objArr) {
                add(add);
            }
        } else {
            super.add(objArr);
        }
        return this;
    }
}
