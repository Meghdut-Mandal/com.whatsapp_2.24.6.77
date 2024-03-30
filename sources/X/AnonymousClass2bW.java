package X;

import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/* renamed from: X.2bW  reason: invalid class name */
public class AnonymousClass2bW extends AnonymousClass3T1 implements AnonymousClass4RU, AnonymousClass4RV {
    public String A00;
    public List A01;
    public List A02;

    public AnonymousClass2bW(C64933Qa r8, AnonymousClass2bW r9, long j, boolean z) {
        super(r9, r8, j, z);
        this.A02 = 1;
        this.A02 = r9.A02;
        this.A00 = r9.A00;
    }

    public /* bridge */ /* synthetic */ AnonymousClass3T1 B31(C64933Qa r7, long j) {
        return new AnonymousClass2bW(r7, this, j, false);
    }

    public /* bridge */ /* synthetic */ AnonymousClass3T1 B32(C64933Qa r7) {
        return new AnonymousClass2bW(r7, this, this.A0I, true);
    }

    public List A1X() {
        ObjectInputStream objectInputStream;
        List list = this.A02;
        if (list == null) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(A1V());
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    list = C36441kJ.A15((List) objectInputStream.readObject());
                    objectInputStream.close();
                    byteArrayInputStream.close();
                } catch (Throwable th) {
                    byteArrayInputStream.close();
                    throw th;
                }
            } catch (IOException | ClassNotFoundException | NullPointerException e) {
                Log.e("ContactUtil/getContactsFromBytes/error getting contacts from data", e);
                list = AnonymousClass001.A0I();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            this.A02 = list;
        }
        return list;
        throw th;
    }

    public void A1Y(List list) {
        this.A02 = C36441kJ.A15(list);
        this.A01 = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this.A02);
            A1B(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw new AssertionError("ObjectOutputStream backed by ByteArrayOutputStream should not throw IOException");
        }
    }

    public AnonymousClass2bW(C64933Qa r2, long j) {
        super(r2, 14, j);
        this.A02 = 1;
    }
}
