package X;

import java.io.InputStream;

/* renamed from: X.8xp  reason: invalid class name and case insensitive filesystem */
public abstract class C187408xp extends InputStream {
    public int A00;
    public final InputStream A01;

    public C187408xp(InputStream inputStream, int i) {
        this.A01 = inputStream;
        this.A00 = i;
    }

    public void A01() {
        InputStream inputStream = this.A01;
        if (inputStream instanceof C22687Asr) {
            C22687Asr asr = (C22687Asr) inputStream;
            asr.A00 = true;
            C22687Asr.A00(asr);
        }
    }
}
