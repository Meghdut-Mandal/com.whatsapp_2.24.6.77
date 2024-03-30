package X;

import android.graphics.Bitmap;

/* renamed from: X.9WW  reason: invalid class name */
public class AnonymousClass9WW {
    public final int A00;
    public final Bitmap.Config A01;
    public final Bitmap.Config A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AnonymousClass9WW r5 = (AnonymousClass9WW) obj;
                if (!(this.A00 == r5.A00 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((3100 + this.A00) * 31 * 31 * 31 * 31) + (this.A03 ? 1 : 0)) * 31) + this.A02.ordinal()) * 31) + this.A01.ordinal()) * 31 * 31 * 31;
    }

    public AnonymousClass9WW(AnonymousClass9LJ r2) {
        this.A00 = r2.A00;
        this.A03 = r2.A03;
        this.A02 = r2.A02;
        this.A01 = r2.A01;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ImageDecodeOptions{");
        C198779eB r3 = new C198779eB(C90484aE.A0k(this));
        C198779eB.A00(r3, String.valueOf(100), "minDecodeIntervalMs");
        C198779eB.A00(r3, String.valueOf(this.A00), "maxDimensionPx");
        String valueOf = String.valueOf(false);
        C198779eB.A00(r3, valueOf, "decodePreviewFrame");
        C198779eB.A00(r3, valueOf, "useLastFrameForPreview");
        C198779eB.A00(r3, valueOf, "decodeAllFrames");
        C198779eB.A01(r3, "forceStaticImage", this.A03);
        C198779eB.A00(r3, this.A02.name(), "bitmapConfigName");
        C198779eB.A00(r3, this.A01.name(), "animatedBitmapConfigName");
        C198779eB.A00(r3, (Object) null, "customImageDecoder");
        C198779eB.A00(r3, (Object) null, "bitmapTransformation");
        C198779eB.A00(r3, (Object) null, "colorSpace");
        C36351kA.A1K(r3, A0u);
        return AnonymousClass000.A0q("}", A0u);
    }
}
