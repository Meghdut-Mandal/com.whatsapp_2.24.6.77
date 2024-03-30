package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: X.1Ci  reason: invalid class name and case insensitive filesystem */
public class C24411Ci {
    public final C19630wG A00;

    public void A02(byte[] bArr) {
        boolean z = false;
        if (bArr.length == 32) {
            z = true;
        }
        C18740tg.A0B(z);
        C18750th.A0A(new File(this.A00.A00.getFilesDir(), "encrypted_backup.key"), bArr);
    }

    public C121215sm A00() {
        ObjectInputStream objectInputStream;
        byte[] bArr;
        byte[] bArr2;
        Context context = this.A00.A00;
        File file = new File(context.getFilesDir(), "password_data.key");
        if (!file.exists()) {
            byte[] A0J = C18750th.A0J(new File(context.getFilesDir(), "password_hash.key"));
            if (A0J != null) {
                boolean z = false;
                if (A0J.length == 64) {
                    z = true;
                }
                C18740tg.A0B(z);
            } else {
                A0J = null;
            }
            byte[] A0J2 = C18750th.A0J(new File(context.getFilesDir(), "password_hash_salt.key"));
            if (A0J2 != null) {
                boolean z2 = false;
                if (A0J2.length == 64) {
                    z2 = true;
                }
                C18740tg.A0B(z2);
            } else {
                A0J2 = null;
            }
            if (A0J == null || A0J2 == null) {
                return null;
            }
            return new C121215sm(A0J, A0J2, 100000);
        }
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            if (1 == objectInputStream.readInt() && (bArr = (byte[]) objectInputStream.readObject()) != null && 64 == bArr.length && (bArr2 = (byte[]) objectInputStream.readObject()) != null && 64 == bArr2.length) {
                C121215sm r0 = new C121215sm(bArr, bArr2, objectInputStream.readInt());
                objectInputStream.close();
                return r0;
            }
            objectInputStream.close();
            return null;
        } catch (IOException | ClassNotFoundException e) {
            Log.e("encb/EncBackupLocalStorage/failed to load password data", e);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void A01(C121215sm r8) {
        ObjectOutputStream objectOutputStream;
        byte[] bArr = r8.A01;
        boolean z = false;
        boolean z2 = false;
        if (bArr.length == 64) {
            z2 = true;
        }
        C18740tg.A0B(z2);
        byte[] bArr2 = r8.A02;
        if (bArr2.length == 64) {
            z = true;
        }
        C18740tg.A0B(z);
        FileOutputStream fileOutputStream = new FileOutputStream(new File(this.A00.A00.getFilesDir(), "password_data.key"));
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeInt(1);
            objectOutputStream.writeObject(bArr);
            objectOutputStream.writeObject(bArr2);
            objectOutputStream.writeInt(r8.A00);
            objectOutputStream.close();
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public byte[] A03() {
        byte[] A0J = C18750th.A0J(new File(this.A00.A00.getFilesDir(), "encrypted_backup.key"));
        if (A0J == null) {
            return null;
        }
        boolean z = false;
        if (A0J.length == 32) {
            z = true;
        }
        C18740tg.A0B(z);
        return A0J;
    }

    public C24411Ci(C19630wG r1) {
        this.A00 = r1;
    }
}
