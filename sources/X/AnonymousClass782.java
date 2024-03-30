package X;

import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;

/* renamed from: X.782  reason: invalid class name */
public class AnonymousClass782 implements HttpRequestInterceptor {
    public int A00;
    public final C20050ww A01;

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        StringBuilder sb;
        this.A00++;
        if (httpRequest instanceof EntityEnclosingRequestWrapper) {
            EntityEnclosingRequestWrapper entityEnclosingRequestWrapper = (EntityEnclosingRequestWrapper) httpRequest;
            HttpEntity entity = entityEnclosingRequestWrapper.getEntity();
            if (entity == null) {
                httpRequest.getRequestLine();
                return;
            }
            long contentLength = entity.getContentLength();
            if (contentLength <= 0) {
                sb = AnonymousClass000.A0u();
                sb.append("gdrive-api/request-interceptor/process/length/");
                sb.append(contentLength);
            } else {
                entityEnclosingRequestWrapper.setEntity(new AnonymousClass781(this, entity));
                return;
            }
        } else if (!(httpRequest instanceof RequestWrapper)) {
            sb = AnonymousClass000.A0u();
            sb.append("gdrive-request-interceptor/process/request-is-not-a-wrapper ");
            sb.append(httpRequest);
        } else {
            return;
        }
        C90504aG.A1G(sb);
    }

    public AnonymousClass782(C20050ww r1) {
        this.A01 = r1;
    }
}
