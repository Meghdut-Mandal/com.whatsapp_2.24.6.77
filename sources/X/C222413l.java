package X;

import com.whatsapp.Me;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* renamed from: X.13l  reason: invalid class name and case insensitive filesystem */
public class C222413l extends ObjectInputStream {
    public final /* synthetic */ C19730wQ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C222413l(C19730wQ r1, InputStream inputStream) {
        super(inputStream);
        this.A00 = r1;
    }

    public ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
        if (readClassDescriptor.getName().equals("com.whatsapp.App$Me")) {
            return ObjectStreamClass.lookup(Me.class);
        }
        return readClassDescriptor;
    }
}
