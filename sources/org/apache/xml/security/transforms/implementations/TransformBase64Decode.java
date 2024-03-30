package org.apache.xml.security.transforms.implementations;

import X.C165607th;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;
import org.apache.xml.security.transforms.TransformationException;
import org.apache.xml.security.utils.Base64;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class TransformBase64Decode extends TransformSpi {
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        return a(xMLSignatureInput, (OutputStream) null, transform);
    }

    public void a(Element element, StringBuffer stringBuffer) {
        for (Node firstChild = element.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            short nodeType = firstChild.getNodeType();
            if (nodeType == 1) {
                a((Element) firstChild, stringBuffer);
            } else if (nodeType == 3) {
                stringBuffer.append(((CharacterData) firstChild).getData());
            }
        }
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream, Transform transform) {
        XMLSignatureInput xMLSignatureInput2;
        TransformationException transformationException;
        try {
            if (xMLSignatureInput.g()) {
                Node node = xMLSignatureInput.d;
                if (node.getNodeType() == 3) {
                    node = node.getParentNode();
                }
                StringBuffer A0x = C165607th.A0x();
                a((Element) node, A0x);
                if (outputStream == null) {
                    return new XMLSignatureInput(Base64.a(A0x.toString()));
                }
                Base64.a(A0x.toString(), outputStream);
                xMLSignatureInput2 = new XMLSignatureInput((byte[]) null);
            } else if (!xMLSignatureInput.h() && !xMLSignatureInput.f()) {
                try {
                    Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xMLSignatureInput.c()).getDocumentElement();
                    StringBuffer A0x2 = C165607th.A0x();
                    a(documentElement, A0x2);
                    return new XMLSignatureInput(Base64.a(A0x2.toString()));
                } catch (ParserConfigurationException e) {
                    transformationException = new TransformationException("c14n.Canonicalizer.Exception", (Exception) e);
                    throw transformationException;
                } catch (SAXException e2) {
                    transformationException = new TransformationException("SAX exception", (Exception) e2);
                    throw transformationException;
                }
            } else if (outputStream == null) {
                return new XMLSignatureInput(Base64.b(xMLSignatureInput.e(), -1));
            } else {
                if (xMLSignatureInput.j() || xMLSignatureInput.f()) {
                    Base64.a(xMLSignatureInput.e(), outputStream, -1);
                } else {
                    Base64.a((InputStream) new BufferedInputStream(xMLSignatureInput.b), outputStream);
                }
                xMLSignatureInput2 = new XMLSignatureInput((byte[]) null);
            }
            xMLSignatureInput2.k = outputStream;
            return xMLSignatureInput2;
        } catch (Base64DecodingException e3) {
            throw new TransformationException("Base64Decoding", (Exception) e3);
        }
    }
}
