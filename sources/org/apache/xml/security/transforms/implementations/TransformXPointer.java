package org.apache.xml.security.transforms.implementations;

import X.AnonymousClass001;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;
import org.apache.xml.security.transforms.TransformationException;

public class TransformXPointer extends TransformSpi {
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = "http://www.w3.org/TR/2001/WD-xptr-20010108";
        throw new TransformationException("signature.Transform.NotYetImplemented", A0L);
    }
}
