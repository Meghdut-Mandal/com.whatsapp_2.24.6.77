package org.apache.xml.security.transforms;

import X.AnonymousClass001;
import java.io.OutputStream;
import org.apache.xml.security.signature.XMLSignatureInput;

public abstract class TransformSpi {
    public Transform a = null;

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream, Transform transform) {
        return a(xMLSignatureInput, transform);
    }

    public abstract XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform);

    public void a(Transform transform) {
        this.a = transform;
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput) {
        throw AnonymousClass001.A0D();
    }
}
