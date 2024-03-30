package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.7RI  reason: invalid class name */
public final class AnonymousClass7RI extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C94354i4 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7RI(C94354i4 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C161917ng r10 = (C161917ng) obj;
        C94354i4 r2 = this.this$0;
        float f = r2.A02;
        C137396g4 r1 = (C137396g4) r10;
        if (r1.A02 != f) {
            r1.A05 |= 1;
            r1.A02 = f;
        }
        float f2 = r2.A03;
        if (r1.A03 != f2) {
            r1.A05 |= 2;
            r1.A03 = f2;
        }
        float f3 = r2.A00;
        if (r1.A00 != f3) {
            r1.A05 |= 4;
            r1.A00 = f3;
        }
        if (r1.A04 != 0.0f) {
            r1.A05 |= 32;
            r1.A04 = 0.0f;
        }
        float f4 = r2.A01;
        if (r1.A01 != f4) {
            r1.A05 |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            r1.A01 = f4;
        }
        long j = r2.A06;
        long j2 = r1.A08;
        long j3 = C112365dm.A00;
        if (j2 != j) {
            r1.A05 |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            r1.A08 = j;
        }
        r10.BsE(r2.A07);
        C94354i4 r3 = this.this$0;
        boolean z = r3.A09;
        if (r1.A0B != z) {
            r1.A05 |= 16384;
            r1.A0B = z;
        }
        r10.Bq9(r3.A04);
        r10.BsJ(r3.A05);
        return AnonymousClass0AJ.A00;
    }
}
