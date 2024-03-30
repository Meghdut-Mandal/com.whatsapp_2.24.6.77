package X;

import com.google.common.base.Strings;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.8HU  reason: invalid class name */
public abstract class AnonymousClass8HU<E> extends C21881Ac7<E> implements Serializable {
    public static final long serialVersionUID = 0;
    public transient C203649oT backingMap = newBackingMap(3);
    public transient long size;

    public AnonymousClass8HU(int i) {
    }

    public final Iterator elementIterator() {
        return new B71(this, 0);
    }

    public final Iterator entryIterator() {
        return new B71(this, 1);
    }

    public abstract C203649oT newBackingMap(int i);

    public final int add(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        boolean z = true;
        if (AnonymousClass000.A1R(i)) {
            int indexOf = this.backingMap.indexOf(obj);
            C203649oT r0 = this.backingMap;
            if (indexOf == -1) {
                r0.put(obj, i);
                this.size += (long) i;
                return 0;
            }
            int value = r0.getValue(indexOf);
            long j = (long) i;
            long j2 = ((long) value) + j;
            if (j2 > 2147483647L) {
                z = false;
            }
            if (z) {
                this.backingMap.setValue(indexOf, (int) j2);
                this.size += j;
                return value;
            }
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1M(A0L, 0, j2);
            throw AnonymousClass001.A08(Strings.A00("too many occurrences: %s", A0L));
        }
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, i, 0);
        throw AnonymousClass001.A08(Strings.A00("occurrences cannot be negative: %s", objArr));
    }

    public final void clear() {
        this.backingMap.clear();
        this.size = 0;
    }

    public final int count(Object obj) {
        return this.backingMap.get(obj);
    }

    public final int distinctElements() {
        return this.backingMap.size();
    }

    public final int remove(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        int i2 = 0;
        if (AnonymousClass000.A1R(i)) {
            int indexOf = this.backingMap.indexOf(obj);
            if (indexOf != -1) {
                i2 = this.backingMap.getValue(indexOf);
                if (i2 > i) {
                    this.backingMap.setValue(indexOf, i2 - i);
                } else {
                    this.backingMap.removeEntry(indexOf);
                    i = i2;
                }
                this.size -= (long) i;
            }
            return i2;
        }
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1L(A0L, i, 0);
        throw AnonymousClass001.A08(Strings.A00("occurrences cannot be negative: %s", A0L));
    }

    public final boolean setCount(Object obj, int i, int i2) {
        long j;
        long j2;
        C20080wz.checkNonnegative(i, "oldCount");
        C20080wz.checkNonnegative(i2, "newCount");
        int indexOf = this.backingMap.indexOf(obj);
        if (indexOf == -1) {
            if (i == 0) {
                if (i2 > 0) {
                    this.backingMap.put(obj, i2);
                    j = this.size;
                }
                return true;
            }
            return false;
        }
        if (this.backingMap.getValue(indexOf) == i) {
            C203649oT r0 = this.backingMap;
            if (i2 == 0) {
                r0.removeEntry(indexOf);
                j2 = this.size - ((long) i);
                this.size = j2;
                return true;
            }
            r0.setValue(indexOf, i2);
            j = this.size;
            i2 -= i;
        }
        return false;
        j2 = j + ((long) i2);
        this.size = j2;
        return true;
    }

    public final int size() {
        return C129276Gg.A00(this.size);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readCount = C203019n8.readCount(objectInputStream);
        this.backingMap = newBackingMap(3);
        C203019n8.populateMultiset(this, objectInputStream, readCount);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C203019n8.writeMultiset(this, objectOutputStream);
    }

    public void addTo(B6T b6t) {
        Objects.requireNonNull(b6t);
        C203649oT r0 = this.backingMap;
        int firstIndex = r0.firstIndex();
        while (firstIndex >= 0) {
            b6t.add(r0.getKey(firstIndex), this.backingMap.getValue(firstIndex));
            r0 = this.backingMap;
            firstIndex = r0.nextIndex(firstIndex);
        }
    }

    public final Iterator iterator() {
        return C203199nW.iteratorImpl(this);
    }
}
