package X;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0fA  reason: invalid class name and case insensitive filesystem */
public final class C10750fA implements Externalizable {
    public static final long serialVersionUID = 0;
    public Map map;

    public void readExternal(ObjectInput objectInput) {
        AnonymousClass00C.A0D(objectInput, 0);
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                C12460i5 r3 = new C12460i5(readInt);
                for (int i = 0; i < readInt; i++) {
                    r3.put(objectInput.readObject(), objectInput.readObject());
                }
                this.map = C000300d.A04(r3);
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Illegal size value: ");
            A0u.append(readInt);
            throw new InvalidObjectException(AnonymousClass000.A0t(A0u, '.'));
        }
        throw new InvalidObjectException(AnonymousClass000.A0r("Unsupported flags value: ", AnonymousClass000.A0u(), readByte));
    }

    public void writeExternal(ObjectOutput objectOutput) {
        AnonymousClass00C.A0D(objectOutput, 0);
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.map.size());
        Iterator A0y = AnonymousClass000.A0y(this.map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            objectOutput.writeObject(A11.getKey());
            objectOutput.writeObject(A11.getValue());
        }
    }

    public C10750fA(Map map2) {
        this.map = map2;
    }

    private final Object readResolve() {
        return this.map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10750fA() {
        /*
            r2 = this;
            X.00f r1 = X.C000500f.A00
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>"
            X.AnonymousClass00C.A0E(r1, r0)
            r2.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10750fA.<init>():void");
    }
}
