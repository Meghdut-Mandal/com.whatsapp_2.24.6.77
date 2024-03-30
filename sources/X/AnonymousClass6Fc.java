package X;

import com.whatsapp.util.Log;
import java.io.EOFException;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.6Fc  reason: invalid class name */
public class AnonymousClass6Fc {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public AnonymousClass6QJ A07;
    public File A08;
    public Long A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E;
    public final C121885ts A0F = new C121885ts();
    public final List A0G = new CopyOnWriteArrayList();
    public volatile File A0H;

    public synchronized int A00() {
        return this.A01;
    }

    public synchronized long A01() {
        long j;
        j = this.A04;
        if (j == 0) {
            j = this.A03;
        }
        return j;
    }

    public synchronized File A02() {
        return this.A0H;
    }

    public synchronized void A03() {
        File file = this.A08;
        if (file != null) {
            if (!file.delete()) {
                Log.w("DownloadContext/unable to delete chunkstore file");
            }
            this.A08 = null;
        }
    }

    public synchronized void A04(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            for (C160767lY BW8 : this.A0G) {
                BW8.BW8(i);
            }
        }
    }

    public synchronized void A05(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            for (C160767lY BW9 : this.A0G) {
                BW9.BW9(this);
            }
        }
    }

    public synchronized void A06(long j, long j2) {
        this.A06 = j;
        for (C160767lY BSW : this.A0G) {
            BSW.BSW(this, j2);
        }
    }

    public synchronized void A07(File file) {
        this.A0H = file;
        for (C160767lY BXt : this.A0G) {
            BXt.BXt(this);
        }
    }

    public synchronized boolean A08() {
        return this.A0C;
    }

    public synchronized boolean A09(long j) {
        boolean z;
        if (this.A01 == 3) {
            z = true;
        } else if (this.A07 == null) {
            z = false;
        } else if (j <= A01()) {
            z = this.A07.A09(this.A07.A03(j));
        } else {
            throw new EOFException();
        }
        return z;
    }
}
