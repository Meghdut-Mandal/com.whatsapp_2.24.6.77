package X;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: X.AcH  reason: case insensitive filesystem */
public class C21889AcH<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public List A00 = Collections.emptyList();
    public Map A01 = Collections.emptyMap();
    public Map A02 = Collections.emptyMap();
    public boolean A03;
    public final int A04;
    public volatile C21897AcR A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C21889AcH)) {
                return super.equals(obj);
            }
            C21889AcH acH = (C21889AcH) obj;
            int size = size();
            if (size == acH.size()) {
                int size2 = this.A00.size();
                if (size2 != acH.A00.size()) {
                    return entrySet().equals(acH.entrySet());
                }
                int i = 0;
                while (i < size2) {
                    if (((Map.Entry) this.A00.get(i)).equals(acH.A00.get(i))) {
                        i++;
                    }
                }
                if (size2 != size) {
                    return this.A01.equals(acH.A01);
                }
            }
            return false;
        }
        return true;
    }

    private int A00(Comparable comparable) {
        int i;
        int A07 = C36431kI.A07(this.A00);
        if (A07 >= 0) {
            int compareTo = comparable.compareTo(((AYR) this.A00.get(A07)).A01);
            if (compareTo > 0) {
                i = A07 + 2;
                return -i;
            } else if (compareTo == 0) {
                return A07;
            }
        }
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i2 > A07) {
                break;
            }
            int i3 = (i2 + A07) / 2;
            int compareTo2 = comparable.compareTo(((AYR) this.A00.get(i3)).A01);
            if (compareTo2 < 0) {
                A07 = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -i;
    }

    public static void A03(C21889AcH acH) {
        if (acH.A03) {
            throw AnonymousClass001.A0D();
        }
    }

    public void A05() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.A03) {
            if (this.A01.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.A01);
            }
            this.A01 = unmodifiableMap;
            if (this.A02.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.A02);
            }
            this.A02 = unmodifiableMap2;
            this.A03 = true;
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (A00(comparable) >= 0 || this.A01.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public Set entrySet() {
        if (this.A05 == null) {
            this.A05 = new C21897AcR(this);
        }
        return this.A05;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int A002 = A00(comparable);
        if (A002 >= 0) {
            return ((AYR) this.A00.get(A002)).getValue();
        }
        return this.A01.get(comparable);
    }

    public int hashCode() {
        int size = this.A00.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i = C36401kF.A02(this.A00.get(i2), i);
        }
        if (this.A01.size() > 0) {
            return i + this.A01.hashCode();
        }
        return i;
    }

    public int size() {
        return this.A00.size() + this.A01.size();
    }

    public C21889AcH(int i) {
        this.A04 = i;
    }

    public static Object A01(C21889AcH acH, int i) {
        A03(acH);
        Object value = ((AYR) acH.A00.remove(i)).getValue();
        if (!acH.A01.isEmpty()) {
            Iterator it = acH.A02().entrySet().iterator();
            List list = acH.A00;
            Map.Entry A11 = AnonymousClass000.A11(it);
            list.add(new AYR(acH, (Comparable) A11.getKey(), A11.getValue()));
            it.remove();
        }
        return value;
    }

    private SortedMap A02() {
        A03(this);
        if (this.A01.isEmpty() && !(this.A01 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.A01 = treeMap;
            this.A02 = treeMap.descendingMap();
        }
        return (SortedMap) this.A01;
    }

    /* renamed from: A04 */
    public Object put(Comparable comparable, Object obj) {
        A03(this);
        int A002 = A00(comparable);
        if (A002 >= 0) {
            return ((AYR) this.A00.get(A002)).setValue(obj);
        }
        A03(this);
        if (this.A00.isEmpty() && !(this.A00 instanceof ArrayList)) {
            this.A00 = C36441kJ.A14(this.A04);
        }
        int i = -(A002 + 1);
        int i2 = this.A04;
        if (i >= i2) {
            return A02().put(comparable, obj);
        }
        if (this.A00.size() == i2) {
            AYR ayr = (AYR) this.A00.remove(i2 - 1);
            A02().put(ayr.A01, ayr.getValue());
        }
        this.A00.add(i, new AYR(this, comparable, obj));
        return null;
    }

    public void clear() {
        A03(this);
        if (!this.A00.isEmpty()) {
            this.A00.clear();
        }
        if (!this.A01.isEmpty()) {
            this.A01.clear();
        }
    }

    public Object remove(Object obj) {
        A03(this);
        Comparable comparable = (Comparable) obj;
        int A002 = A00(comparable);
        if (A002 >= 0) {
            return A01(this, A002);
        }
        if (this.A01.isEmpty()) {
            return null;
        }
        return this.A01.remove(comparable);
    }
}
