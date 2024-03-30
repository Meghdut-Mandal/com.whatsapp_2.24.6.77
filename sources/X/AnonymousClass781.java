package X;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

/* renamed from: X.781  reason: invalid class name */
public class AnonymousClass781 implements HttpEntity {
    public final /* synthetic */ AnonymousClass782 A00;
    public final /* synthetic */ HttpEntity A01;

    public AnonymousClass781(AnonymousClass782 r1, HttpEntity httpEntity) {
        this.A00 = r1;
        this.A01 = httpEntity;
    }

    public void consumeContent() {
        this.A01.consumeContent();
    }

    public InputStream getContent() {
        InputStream content = this.A01.getContent();
        C20050ww r2 = this.A00.A01;
        Integer A0n = C36371kC.A0n();
        return new AnonymousClass5RE(r2, content, A0n, A0n);
    }

    public Header getContentEncoding() {
        return this.A01.getContentEncoding();
    }

    public long getContentLength() {
        return this.A01.getContentLength();
    }

    public Header getContentType() {
        return this.A01.getContentType();
    }

    public boolean isChunked() {
        return this.A01.isChunked();
    }

    public boolean isRepeatable() {
        return this.A01.isRepeatable();
    }

    public boolean isStreaming() {
        return this.A01.isStreaming();
    }

    public void writeTo(OutputStream outputStream) {
        HttpEntity httpEntity = this.A01;
        C20050ww r2 = this.A00.A01;
        Integer A0n = C36371kC.A0n();
        httpEntity.writeTo(new AnonymousClass5RL(r2, outputStream, A0n, A0n));
    }
}
