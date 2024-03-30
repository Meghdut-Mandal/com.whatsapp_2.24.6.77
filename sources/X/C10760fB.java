package X;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;

/* renamed from: X.0fB  reason: invalid class name and case insensitive filesystem */
public final class C10760fB implements Externalizable {
    public static final long serialVersionUID = 0;
    public Collection collection;
    public final int tag;

    public void readExternal(ObjectInput objectInput) {
        Collection collection2;
        AnonymousClass00C.A0D(objectInput, 0);
        byte readByte = objectInput.readByte();
        byte b = readByte & 1;
        if ((readByte & -2) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i = 0;
                if (b == 0) {
                    C13540k2 r1 = new C13540k2(readInt);
                    while (i < readInt) {
                        r1.add(objectInput.readObject());
                        i++;
                    }
                    collection2 = AnonymousClass03S.A00(r1);
                } else if (b == 1) {
                    C13560k4 r0 = C13560k4.A00;
                    C13560k4 r12 = new C13560k4(new C12460i5(readInt));
                    while (i < readInt) {
                        r12.add(objectInput.readObject());
                        i++;
                    }
                    collection2 = AnonymousClass02M.A00(r12);
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Unsupported collection type tag: ");
                    A0u.append(b);
                    throw new InvalidObjectException(AnonymousClass000.A0t(A0u, '.'));
                }
                this.collection = collection2;
                return;
            }
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Illegal size value: ");
            A0u2.append(readInt);
            throw new InvalidObjectException(AnonymousClass000.A0t(A0u2, '.'));
        }
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("Unsupported flags value: ");
        A0u3.append(readByte);
        throw new InvalidObjectException(AnonymousClass000.A0t(A0u3, '.'));
    }

    public void writeExternal(ObjectOutput objectOutput) {
        AnonymousClass00C.A0D(objectOutput, 0);
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        for (Object writeObject : this.collection) {
            objectOutput.writeObject(writeObject);
        }
    }

    public C10760fB(Collection collection2, int i) {
        this.collection = collection2;
        this.tag = i;
    }

    private final Object readResolve() {
        return this.collection;
    }

    public C10760fB() {
        this(C023409w.A00, 0);
    }
}
