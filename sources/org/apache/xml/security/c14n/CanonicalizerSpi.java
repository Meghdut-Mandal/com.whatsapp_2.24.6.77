package org.apache.xml.security.c14n;

import X.C90524aI;
import java.io.OutputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public abstract class CanonicalizerSpi {
    public boolean a = false;

    public abstract void a(OutputStream outputStream);

    public abstract byte[] a(Node node);

    public abstract byte[] a(Node node, String str);

    public byte[] a(byte[] bArr) {
        InputSource inputSource = new InputSource(C90524aI.A0P(bArr));
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        return a((Node) newInstance.newDocumentBuilder().parse(inputSource));
    }
}
