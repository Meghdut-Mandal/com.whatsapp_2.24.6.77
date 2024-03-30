package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.8Hi  reason: invalid class name */
public class AnonymousClass8Hi extends AnonymousClass8HS implements B2P {
    public static final long serialVersionUID = 0;
    public final transient C20760y7 emptySet = emptySet((Comparator) null);

    public AnonymousClass8Hi(C20070wy r2, int i, Comparator comparator) {
        super(r2, i);
    }

    public static AnonymousClass8Hi copyOf(B2P b2p, Comparator comparator) {
        Objects.requireNonNull(b2p);
        if (b2p.isEmpty()) {
            return of();
        }
        if (b2p instanceof AnonymousClass8Hi) {
            return (AnonymousClass8Hi) b2p;
        }
        return fromMapEntries(b2p.asMap().entrySet(), (Comparator) null);
    }

    public static AnonymousClass8Hi fromMapEntries(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        C20090x0 r5 = new C20090x0(collection.size());
        int i = 0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(it);
            Object key = A11.getKey();
            C20760y7 valueSet = valueSet((Comparator) null, (Collection) A11.getValue());
            if (!valueSet.isEmpty()) {
                r5.put(key, valueSet);
                i += valueSet.size();
            }
        }
        return new AnonymousClass8Hi(r5.build(), i, (Comparator) null);
    }

    public static AnonymousClass8Hg builder() {
        return new AnonymousClass8Hg();
    }

    public static C20760y7 emptySet(Comparator comparator) {
        if (comparator == null) {
            return C20760y7.of();
        }
        return AnonymousClass8Hn.emptySet(comparator);
    }

    public static C227315o valuesBuilder(Comparator comparator) {
        if (comparator == null) {
            return new C227315o();
        }
        return new AnonymousClass8Hj(comparator);
    }

    public C20760y7 get(Object obj) {
        Object obj2 = this.map.get(obj);
        C20760y7 r1 = this.emptySet;
        if (obj2 == null) {
            Objects.requireNonNull(r1, "Both parameters are null");
            obj2 = r1;
        }
        return (C20760y7) obj2;
    }

    public Comparator valueComparator() {
        C20760y7 r1 = this.emptySet;
        if (r1 instanceof AnonymousClass8Hn) {
            return ((AnonymousClass8Hn) r1).comparator();
        }
        return null;
    }

    public static AnonymousClass8Hi of() {
        return AnonymousClass8Hh.INSTANCE;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            C20090x0 builder = C20070wy.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    C227315o valuesBuilder = valuesBuilder(comparator);
                    int i3 = 0;
                    do {
                        valuesBuilder.add(objectInputStream.readObject());
                        i3++;
                    } while (i3 < readInt2);
                    C20760y7 build = valuesBuilder.build();
                    if (build.size() == readInt2) {
                        builder.put(readObject, build);
                        i2 += readInt2;
                        i++;
                    } else {
                        String valueOf = String.valueOf(readObject);
                        throw new InvalidObjectException(AnonymousClass000.A0p("Duplicate key-value pairs exist for key ", valueOf, C90524aI.A0h(C90474aD.A05(valueOf) + 40)));
                    }
                } else {
                    throw new InvalidObjectException(AnonymousClass000.A0r("Invalid value count ", C90524aI.A0h(31), readInt2));
                }
            }
            try {
                C190729Ab.MAP_FIELD_SETTER.set((Object) this, (Object) builder.build());
                C190729Ab.SIZE_FIELD_SETTER.set((Object) this, i2);
                AnonymousClass99O.EMPTY_SET_FIELD_SETTER.set((Object) this, (Object) emptySet(comparator));
            } catch (IllegalArgumentException e) {
                throw new InvalidObjectException(e.getMessage()).initCause(e);
            }
        } else {
            throw new InvalidObjectException(AnonymousClass000.A0r("Invalid key count ", C90524aI.A0h(29), readInt));
        }
    }

    public static C20760y7 valueSet(Comparator comparator, Collection collection) {
        return C20760y7.copyOf(collection);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        C203019n8.writeMultimap(this, objectOutputStream);
    }

    public static AnonymousClass8Hi copyOf(B2P b2p) {
        return copyOf(b2p, (Comparator) null);
    }
}
