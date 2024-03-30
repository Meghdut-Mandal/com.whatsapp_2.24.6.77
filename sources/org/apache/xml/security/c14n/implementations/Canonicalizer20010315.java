package org.apache.xml.security.c14n.implementations;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165587tf;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C90494aF;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.helper.C14nHelper;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public abstract class Canonicalizer20010315 extends CanonicalizerBase {
    public boolean b = true;
    public final SortedSet c = new TreeSet(CanonicalizerBase.g);
    public XmlAttrStack d = new XmlAttrStack();

    public class XmlAttrStack {
        public int a = 0;
        public int b = 0;
        public XmlsStackElement c;
        public List d = AnonymousClass001.A0I();

        public class XmlsStackElement {
            public int a;
            public boolean b = false;
            public List c = AnonymousClass001.A0I();
        }

        public void a(Attr attr) {
            if (this.c == null) {
                XmlsStackElement xmlsStackElement = new XmlsStackElement();
                this.c = xmlsStackElement;
                xmlsStackElement.a = this.a;
                this.d.add(xmlsStackElement);
                this.b = this.a;
            }
            this.c.c.add(attr);
        }

        public void a(Collection collection) {
            int size = this.d.size() - 1;
            if (this.c == null) {
                XmlsStackElement xmlsStackElement = new XmlsStackElement();
                this.c = xmlsStackElement;
                int i = this.a;
                xmlsStackElement.a = i;
                this.b = i;
                this.d.add(xmlsStackElement);
            }
            if (size != -1) {
                XmlsStackElement xmlsStackElement2 = (XmlsStackElement) this.d.get(size);
                if (!xmlsStackElement2.b || xmlsStackElement2.a + 1 != this.a) {
                    HashMap A0J = AnonymousClass001.A0J();
                    while (size >= 0) {
                        for (Attr attr : ((XmlsStackElement) this.d.get(size)).c) {
                            if (!A0J.containsKey(attr.getName())) {
                                A0J.put(attr.getName(), attr);
                            }
                        }
                        size--;
                    }
                    this.c.b = true;
                    collection.addAll(A0J.values());
                    return;
                }
            }
            collection.addAll(this.c.c);
            this.c.b = true;
        }

        public void a(int i) {
            this.a = i;
            if (i != -1) {
                this.c = null;
                while (this.b >= this.a) {
                    List list = this.d;
                    list.remove(C36431kI.A07(list));
                    if (this.d.size() == 0) {
                        this.b = 0;
                        return;
                    }
                    this.b = ((XmlsStackElement) C36401kF.A0n(this.d)).a;
                }
            }
        }
    }

    public Canonicalizer20010315(boolean z) {
        super(z);
    }

    public byte[] a(Node node, String str) {
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");
    }

    public Iterator b(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        NamedNodeMap namedNodeMap;
        int i;
        Object b2;
        this.d.a(nameSpaceSymbTable.c.size());
        boolean A1S = AnonymousClass000.A1S(a((Node) element, nameSpaceSymbTable.c.size()), 1);
        if (element.hasAttributes()) {
            namedNodeMap = element.getAttributes();
            i = namedNodeMap.getLength();
        } else {
            namedNodeMap = null;
            i = 0;
        }
        SortedSet sortedSet = this.c;
        sortedSet.clear();
        for (int i2 = 0; i2 < i; i2++) {
            Attr attr = (Attr) namedNodeMap.item(i2);
            String namespaceURI = attr.getNamespaceURI();
            if ("http://www.w3.org/2000/xmlns/".equals(namespaceURI)) {
                String localName = attr.getLocalName();
                String value = attr.getValue();
                if (!"xml".equals(localName) || !"http://www.w3.org/XML/1998/namespace".equals(value)) {
                    if (c(attr)) {
                        if (!A1S) {
                            nameSpaceSymbTable.e(localName);
                        }
                        Node b3 = nameSpaceSymbTable.b(localName, value, attr);
                        if (b3 != null) {
                            sortedSet.add(b3);
                            if (C14nHelper.a(attr)) {
                                Object[] A1Q = C36441kJ.A1Q();
                                A1Q[0] = element.getTagName();
                                A1Q[1] = localName;
                                throw C165587tf.A0r(attr, A1Q);
                            }
                        } else {
                            continue;
                        }
                    } else if (!A1S || "xmlns".equals(localName)) {
                        nameSpaceSymbTable.a(localName, value, attr);
                    } else {
                        nameSpaceSymbTable.c(localName);
                    }
                }
            } else if ("http://www.w3.org/XML/1998/namespace".equals(namespaceURI)) {
                this.d.a(attr);
            } else if (A1S) {
                sortedSet.add(attr);
            }
        }
        if (A1S) {
            Attr attributeNodeNS = element.getAttributeNodeNS("http://www.w3.org/2000/xmlns/", "xmlns");
            if (attributeNodeNS == null) {
                b2 = nameSpaceSymbTable.a("xmlns");
            } else {
                if (!c(attributeNodeNS)) {
                    b2 = nameSpaceSymbTable.b("xmlns", "", CanonicalizerBase.i);
                }
                this.d.a((Collection) sortedSet);
                nameSpaceSymbTable.a((Collection) sortedSet);
            }
            if (b2 != null) {
                sortedSet.add(b2);
            }
            this.d.a((Collection) sortedSet);
            nameSpaceSymbTable.a((Collection) sortedSet);
        }
        return sortedSet.iterator();
    }

    public Iterator a(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        Node b2;
        if (!element.hasAttributes() && !this.b) {
            return null;
        }
        SortedSet sortedSet = this.c;
        sortedSet.clear();
        NamedNodeMap attributes = element.getAttributes();
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            Attr attr = (Attr) attributes.item(i);
            if (!"http://www.w3.org/2000/xmlns/".equals(attr.getNamespaceURI())) {
                sortedSet.add(attr);
            } else {
                String localName = attr.getLocalName();
                String value = attr.getValue();
                if ((!"xml".equals(localName) || !"http://www.w3.org/XML/1998/namespace".equals(value)) && (b2 = nameSpaceSymbTable.b(localName, value, attr)) != null) {
                    sortedSet.add(b2);
                    if (C14nHelper.a(attr)) {
                        Object[] A1Q = C36441kJ.A1Q();
                        C90494aF.A1H(element.getTagName(), localName, A1Q);
                        throw C165587tf.A0r(attr, A1Q);
                    }
                }
            }
        }
        if (this.b) {
            nameSpaceSymbTable.a((Collection) sortedSet);
            this.d.a((Collection) sortedSet);
            this.b = false;
        }
        return sortedSet.iterator();
    }

    public void c(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        if (element.hasAttributes()) {
            this.d.a = -1;
            NamedNodeMap attributes = element.getAttributes();
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                Attr attr = (Attr) attributes.item(i);
                if ("http://www.w3.org/2000/xmlns/".equals(attr.getNamespaceURI())) {
                    String localName = attr.getLocalName();
                    String nodeValue = attr.getNodeValue();
                    if (!"xml".equals(localName) || !"http://www.w3.org/XML/1998/namespace".equals(nodeValue)) {
                        nameSpaceSymbTable.a(localName, nodeValue, attr);
                    }
                } else if ("http://www.w3.org/XML/1998/namespace".equals(attr.getNamespaceURI())) {
                    this.d.a(attr);
                }
            }
        }
    }

    public void a(XMLSignatureInput xMLSignatureInput) {
        Document a;
        if (xMLSignatureInput.j) {
            Node node = xMLSignatureInput.d;
            if (node != null) {
                a = XMLUtils.b(node);
            } else {
                a = XMLUtils.a(xMLSignatureInput.b(false));
            }
            XMLUtils.a(a);
        }
    }
}
