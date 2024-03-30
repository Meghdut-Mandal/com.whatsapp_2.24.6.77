package org.apache.xml.security.transforms;

import X.AnonymousClass001;
import X.C165567td;
import X.C165577te;
import X.C165607th;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Transforms extends SignatureElementProxy {
    public static Log a;
    public static Class c;
    public Element[] b;

    static {
        Class b2 = b("org.apache.xml.security.transforms.Transforms");
        c = b2;
        a = LogFactory.getLog(b2.getName());
    }

    public Transforms() {
    }

    public Transforms(Document document) {
        super(document);
        XMLUtils.b(this.k);
    }

    public String e() {
        return "Transforms";
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream) {
        try {
            int a2 = a() - 1;
            for (int i = 0; i < a2; i++) {
                Transform a3 = a(i);
                if (a.isDebugEnabled()) {
                    Log log = a;
                    StringBuffer A0x = C165607th.A0x();
                    A0x.append("Perform the (");
                    A0x.append(i);
                    A0x.append(")th ");
                    A0x.append(a3.b());
                    C165567td.A1Q(" transform", A0x, log);
                }
                xMLSignatureInput = a3.a(xMLSignatureInput);
            }
            if (a2 >= 0) {
                return a(a2).a(xMLSignatureInput, outputStream);
            }
            return xMLSignatureInput;
        } catch (IOException e) {
            throw new TransformationException("empty", (Exception) e);
        } catch (CanonicalizationException e2) {
            throw new TransformationException("empty", (Exception) e2);
        } catch (InvalidCanonicalizerException e3) {
            throw new TransformationException("empty", (Exception) e3);
        }
    }

    public Transforms(Element element, String str) {
        super(element, str);
        if (a() == 0) {
            Object[] A0M = AnonymousClass001.A0M();
            A0M[0] = "Transform";
            A0M[1] = "Transforms";
            throw new TransformationException("xml.WrongContent", A0M);
        }
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw C165577te.A0m(e);
        }
    }

    public void a(String str) {
        try {
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer A0x = C165607th.A0x();
                A0x.append("Transforms.addTransform(");
                A0x.append(str);
                C165567td.A1Q(")", A0x, log);
            }
            a(Transform.a(this.m, str));
        } catch (InvalidTransformException e) {
            throw new TransformationException("empty", (Exception) e);
        }
    }

    private void a(Transform transform) {
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer A0x = C165607th.A0x();
            A0x.append("Transforms.addTransform(");
            A0x.append(transform.b());
            C165567td.A1Q(")", A0x, log);
        }
        this.k.appendChild(transform.k);
        XMLUtils.b(this.k);
    }

    public Transform a(int i) {
        try {
            Element[] elementArr = this.b;
            if (elementArr == null) {
                Node firstChild = this.k.getFirstChild();
                boolean z = XMLUtils.c;
                elementArr = XMLUtils.a(firstChild, "http://www.w3.org/2000/09/xmldsig#", "Transform");
                this.b = elementArr;
            }
            boolean z2 = Transform.c;
            return new Transform(elementArr[i], this.l);
        } catch (XMLSecurityException e) {
            throw new TransformationException("empty", (Exception) e);
        }
    }

    public int a() {
        Element[] elementArr = this.b;
        if (elementArr == null) {
            elementArr = XMLUtils.a(this.k.getFirstChild(), "http://www.w3.org/2000/09/xmldsig#", "Transform");
            this.b = elementArr;
        }
        return elementArr.length;
    }
}
