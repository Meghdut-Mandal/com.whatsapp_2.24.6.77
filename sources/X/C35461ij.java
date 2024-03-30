package X;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

/* renamed from: X.1ij  reason: invalid class name and case insensitive filesystem */
public class C35461ij implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    public C35461ij(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.A07 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A04 = obj4;
        this.A06 = obj5;
        this.A03 = obj6;
        this.A05 = obj7;
    }

    public void run() {
        RandomAccessFile randomAccessFile;
        Bitmap bitmap;
        if (this.A07 != 0) {
            AnonymousClass1SV r4 = (AnonymousClass1SV) this.A00;
            AnonymousClass68H r3 = (AnonymousClass68H) this.A02;
            Object obj = this.A03;
            Object obj2 = this.A04;
            Object obj3 = this.A05;
            Object obj4 = this.A06;
            byte[] A022 = ((C63683Kz) this.A01).A02();
            if (A022 == null || A022.length <= 0) {
                bitmap = null;
            } else {
                bitmap = r3.A00();
            }
            C35421if r5 = new C35421if(obj, obj2, obj3, bitmap, obj4, 4);
            List list = r4.A05;
            synchronized (list) {
                list.add(r5);
            }
            r4.A01.post(new C35751jC(r4, 10));
            r3.A01();
            return;
        }
        try {
            Log.v("fb-UnpackingSoSource", "starting syncer worker");
            randomAccessFile = new RandomAccessFile((File) this.A02, "rw");
            randomAccessFile.write((byte[]) this.A01);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.close();
            File file = ((AnonymousClass10I) this.A00).A00;
            randomAccessFile = new RandomAccessFile(new File(file, "dso_manifest"), "rw");
            randomAccessFile.writeByte(1);
            C192339Gp[] r6 = ((C191439Cy) this.A04).A00;
            int length = r6.length;
            randomAccessFile.writeInt(length);
            for (int i = 0; i < length; i++) {
                randomAccessFile.writeUTF(r6[i].A01);
                randomAccessFile.writeUTF(r6[i].A00);
            }
            randomAccessFile.close();
            C131706Qe.A01(file);
            AnonymousClass10I.A01((File) this.A06, (byte) 1);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("releasing dso store lock for ");
                sb.append(file);
                sb.append(" (from syncer thread)");
                Log.v("fb-UnpackingSoSource", sb.toString());
                ((AnonymousClass10L) this.A03).close();
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("releasing dso store lock for ");
            sb2.append(((AnonymousClass10G) this.A00).A00);
            sb2.append(" (from syncer thread)");
            Log.v("fb-UnpackingSoSource", sb2.toString());
            ((AnonymousClass10L) this.A03).close();
            throw th;
        }
        throw th;
    }
}
