package org.apache.xml.security.transforms;

import X.AnonymousClass001;
import X.C165567td;
import X.C165577te;
import X.C165607th;
import X.C36331k8;
import X.C36411kG;
import java.io.OutputStream;
import java.util.HashMap;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.ClassLoaderUtils;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public final class Transform extends SignatureElementProxy {
    public static Class a;
    public static Log b;
    public static boolean c = false;
    public static HashMap d = null;
    public static HashMap e = AnonymousClass001.A0J();
    public TransformSpi f = null;

    public static Transform a(Document document, String str, NodeList nodeList) {
        return new Transform(document, str, nodeList);
    }

    public static void a() {
        if (!c) {
            d = new HashMap(10);
            c = true;
        }
    }

    public static Class b(String str) {
        return (Class) d.get(str);
    }

    public static TransformSpi d(String str) {
        try {
            Object obj = e.get(str);
            if (obj != null) {
                return (TransformSpi) obj;
            }
            Class cls = (Class) d.get(str);
            if (cls == null) {
                return null;
            }
            TransformSpi transformSpi = (TransformSpi) cls.newInstance();
            e.put(str, transformSpi);
            return transformSpi;
        } catch (InstantiationException e2) {
            throw new InvalidTransformException("signature.Transform.UnknownTransform", new Object[]{str}, e2);
        } catch (IllegalAccessException e3) {
            throw new InvalidTransformException("signature.Transform.UnknownTransform", new Object[]{str}, e3);
        }
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput) {
        try {
            return this.f.a(xMLSignatureInput, this);
        } catch (ParserConfigurationException e2) {
            throw new CanonicalizationException("signature.Transform.ErrorDuringTransform", new Object[]{b(), "ParserConfigurationException"}, e2);
        } catch (SAXException e3) {
            throw new CanonicalizationException("signature.Transform.ErrorDuringTransform", new Object[]{b(), "SAXException"}, e3);
        }
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream) {
        try {
            return this.f.a(xMLSignatureInput, outputStream, this);
        } catch (ParserConfigurationException e2) {
            throw new CanonicalizationException("signature.Transform.ErrorDuringTransform", new Object[]{b(), "ParserConfigurationException"}, e2);
        } catch (SAXException e3) {
            throw new CanonicalizationException("signature.Transform.ErrorDuringTransform", new Object[]{b(), "SAXException"}, e3);
        }
    }

    public String b() {
        return this.k.getAttributeNS((String) null, "Algorithm");
    }

    public String e() {
        return "Transform";
    }

    static {
        Class a2 = a("org.apache.xml.security.transforms.Transform");
        a = a2;
        b = LogFactory.getLog(a2.getName());
    }

    public Transform(Element element, String str) {
        super(element, str);
        String attributeNS = element.getAttributeNS((String) null, "Algorithm");
        if (attributeNS == null || attributeNS.length() == 0) {
            Object[] A1b = C36411kG.A1b("Algorithm");
            A1b[1] = "Transform";
            throw new TransformationException("xml.WrongContent", A1b);
        }
        TransformSpi d2 = d(attributeNS);
        this.f = d2;
        if (d2 == null) {
            throw new InvalidTransformException("signature.Transform.UnknownTransform", new Object[]{attributeNS});
        }
    }

    public static void a(String str, String str2) {
        Class b2 = b(str);
        if (b2 == null) {
            try {
                HashMap hashMap = d;
                Class cls = a;
                if (cls == null) {
                    cls = a("org.apache.xml.security.transforms.Transform");
                    a = cls;
                }
                hashMap.put(str, ClassLoaderUtils.a(str2, cls));
            } catch (ClassNotFoundException e2) {
                throw AnonymousClass001.A0B(e2);
            }
        } else {
            Object[] A0M = AnonymousClass001.A0M();
            C36331k8.A1N(str, b2, A0M);
            throw new AlgorithmAlreadyRegisteredException("algorithm.alreadyRegistered", A0M);
        }
    }

    public Transform(Document document, String str, NodeList nodeList) {
        super(document);
        this.k.setAttributeNS((String) null, "Algorithm", str);
        TransformSpi d2 = d(str);
        this.f = d2;
        if (d2 != null) {
            if (b.isDebugEnabled()) {
                Log log = b;
                StringBuffer A0x = C165607th.A0x();
                A0x.append("Create URI \"");
                A0x.append(str);
                A0x.append("\" class \"");
                A0x.append(this.f.getClass());
                C165567td.A1Q("\"", A0x, log);
                C165577te.A1J(nodeList, "The NodeList is ", C165607th.A0x(), b);
            }
            if (nodeList != null) {
                for (int i = 0; i < nodeList.getLength(); i++) {
                    this.k.appendChild(nodeList.item(i).cloneNode(true));
                }
                return;
            }
            return;
        }
        throw new InvalidTransformException("signature.Transform.UnknownTransform", new Object[]{str});
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw C165577te.A0m(e2);
        }
    }

    public static Transform a(Document document, String str) {
        return new Transform(document, str, (NodeList) null);
    }
}
