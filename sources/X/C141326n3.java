package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;

/* renamed from: X.6n3  reason: invalid class name and case insensitive filesystem */
public class C141326n3 implements C160937lp {
    public int A00;
    public long A01 = 0;
    public AU0 A02;
    public AnonymousClass6M6 A03;
    public C160917ln A04;
    public C125085zI A05;
    public C159107ip A06;
    public boolean A07;
    public long A08;

    public AnonymousClass6D7 BDz() {
        return null;
    }

    public boolean BLY() {
        return false;
    }

    public void cancel() {
    }

    /* JADX INFO: finally extract failed */
    private void A00() {
        if (!this.A07) {
            try {
                this.A04.Bwa(this.A00, (Bitmap) this.A02.A01());
                AU0 au0 = this.A02;
                if (au0 != null) {
                    au0.close();
                    this.A02 = null;
                }
                this.A07 = true;
            } catch (Throwable th) {
                AU0 au02 = this.A02;
                if (au02 != null) {
                    au02.close();
                    this.A02 = null;
                }
                throw th;
            }
        }
    }

    public void B3P(int i) {
        this.A00 = i;
        C128956Eg A012 = this.A05.A05.A01(AnonymousClass5TE.VIDEO, i);
        if (A012 != null) {
            List list = A012.A01;
            if (!C36441kJ.A15(list).isEmpty()) {
                C36441kJ.A15(list).get(0);
                C36441kJ.A15(list).get(0);
                this.A08 = C112915ef.A00;
            }
        }
        this.A04 = this.A06.B4S();
    }

    public void release() {
        C160917ln r0 = this.A04;
        if (r0 != null) {
            r0.finish();
        }
        AU0 au0 = this.A02;
        if (au0 != null) {
            au0.close();
        }
    }

    public void start() {
        AU0 A002 = this.A03.A00(Uri.fromFile(((AnonymousClass6F1) C36441kJ.A12(C36441kJ.A15(this.A05.A05.A01(AnonymousClass5TE.VIDEO, this.A00).A01))).A01));
        this.A02 = A002;
        if (A002 == null) {
            throw C90524aI.A0X("Bitmap cannot be loaded");
        }
    }

    public C141326n3(AnonymousClass6M6 r3, C125085zI r4, C159107ip r5) {
        if (!"PhotoDemuxDecodeWrapper".isEmpty()) {
            this.A00 = -1;
            this.A08 = C112915ef.A00;
            this.A03 = r3;
            this.A05 = r4;
            this.A06 = r5;
            return;
        }
        throw AnonymousClass001.A08("callingClassName for the CallerContext cannot be null nor empty.");
    }

    public long B57() {
        A00();
        long j = this.A01;
        this.A01 = this.A08 + j;
        return j;
    }

    public void B58(long j) {
        A00();
        this.A01 = j;
    }

    public long BAp() {
        return this.A01;
    }

    public void BpZ(long j) {
        A00();
        this.A01 = j;
    }
}
