package org.apache.xml.security.c14n.implementations;

import X.AnonymousClass001;
import X.C165587tf;
import X.C36441kJ;
import X.C90494aF;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.helper.C14nHelper;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.params.InclusiveNamespaces;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public abstract class Canonicalizer20010315Excl extends CanonicalizerBase {
    public TreeSet b = new TreeSet();
    public final SortedSet c = new TreeSet(CanonicalizerBase.g);

    public Canonicalizer20010315Excl(boolean z) {
        super(z);
    }

    public byte[] a(XMLSignatureInput xMLSignatureInput, String str) {
        this.b = (TreeSet) InclusiveNamespaces.a(str);
        return super.b(xMLSignatureInput);
    }

    public byte[] a(Node node) {
        return a(node, "", (Node) null);
    }

    public byte[] a(Node node, String str) {
        return a(node, str, (Node) null);
    }

    public byte[] a(Node node, String str, Node node2) {
        this.b = (TreeSet) InclusiveNamespaces.a(str);
        return super.a(node, node2);
    }

    public Iterator a(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        NamedNodeMap namedNodeMap;
        int i;
        String prefix;
        SortedSet sortedSet = this.c;
        sortedSet.clear();
        if (element.hasAttributes()) {
            namedNodeMap = element.getAttributes();
            i = namedNodeMap.getLength();
        } else {
            namedNodeMap = null;
            i = 0;
        }
        Set set = (Set) this.b.clone();
        int i2 = 0;
        while (true) {
            String str = "xmlns";
            if (i2 < i) {
                Attr attr = (Attr) namedNodeMap.item(i2);
                if (!"http://www.w3.org/2000/xmlns/".equals(attr.getNamespaceURI())) {
                    String prefix2 = attr.getPrefix();
                    if (prefix2 != null && !prefix2.equals("xml") && !prefix2.equals(str)) {
                        set.add(prefix2);
                    }
                    sortedSet.add(attr);
                } else {
                    String localName = attr.getLocalName();
                    String nodeValue = attr.getNodeValue();
                    if ((!"xml".equals(localName) || !"http://www.w3.org/XML/1998/namespace".equals(nodeValue)) && nameSpaceSymbTable.a(localName, nodeValue, attr) && (!C14nHelper.b(nodeValue))) {
                        Object[] A1Q = C36441kJ.A1Q();
                        C90494aF.A1H(element.getTagName(), localName, A1Q);
                        throw C165587tf.A0r(attr, A1Q);
                    }
                }
                i2++;
            } else {
                if (!(element.getNamespaceURI() == null || (prefix = element.getPrefix()) == null || prefix.length() == 0)) {
                    str = prefix;
                }
                set.add(str);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    Attr a = nameSpaceSymbTable.a(AnonymousClass001.A0C(it));
                    if (a != null) {
                        sortedSet.add(a);
                    }
                }
                return sortedSet.iterator();
            }
        }
    }

    public final Iterator b(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        NamedNodeMap namedNodeMap;
        int i;
        String prefix;
        SortedSet sortedSet = this.c;
        sortedSet.clear();
        Set set = null;
        if (element.hasAttributes()) {
            namedNodeMap = element.getAttributes();
            i = namedNodeMap.getLength();
        } else {
            namedNodeMap = null;
            i = 0;
        }
        boolean z = false;
        if (a((Node) element, nameSpaceSymbTable.c.size()) == 1) {
            z = true;
            set = (Set) this.b.clone();
        }
        for (int i2 = 0; i2 < i; i2++) {
            Attr attr = (Attr) namedNodeMap.item(i2);
            if ("http://www.w3.org/2000/xmlns/".equals(attr.getNamespaceURI())) {
                String localName = attr.getLocalName();
                if (!z || c(attr) || "xmlns".equals(localName)) {
                    String nodeValue = attr.getNodeValue();
                    if (!z && c(attr) && this.b.contains(localName)) {
                        nameSpaceSymbTable.e(localName);
                        Node b2 = nameSpaceSymbTable.b(localName, nodeValue, attr);
                        if (b2 != null) {
                            sortedSet.add(b2);
                            if (C14nHelper.a(attr)) {
                                Object[] objArr = new Object[3];
                                C90494aF.A1H(element.getTagName(), localName, objArr);
                                objArr[2] = attr.getNodeValue();
                                throw new CanonicalizationException("c14n.Canonicalizer.RelativeNamespace", objArr);
                            }
                        }
                    }
                    if (nameSpaceSymbTable.a(localName, nodeValue, attr) && (!C14nHelper.b(nodeValue))) {
                        Object[] objArr2 = new Object[3];
                        C90494aF.A1H(element.getTagName(), localName, objArr2);
                        objArr2[2] = attr.getNodeValue();
                        throw new CanonicalizationException("c14n.Canonicalizer.RelativeNamespace", objArr2);
                    }
                } else {
                    nameSpaceSymbTable.d(localName);
                }
            } else if (c(attr) && z) {
                String prefix2 = attr.getPrefix();
                if (prefix2 != null && !prefix2.equals("xml") && !prefix2.equals("xmlns")) {
                    set.add(prefix2);
                }
                sortedSet.add(attr);
            }
        }
        if (z) {
            Attr attributeNodeNS = element.getAttributeNodeNS("http://www.w3.org/2000/xmlns/", "xmlns");
            if (attributeNodeNS != null && !c(attributeNodeNS)) {
                nameSpaceSymbTable.a("xmlns", "", CanonicalizerBase.i);
            }
            if (element.getNamespaceURI() == null || (prefix = element.getPrefix()) == null || prefix.length() == 0) {
                set.add("xmlns");
            } else {
                set.add(prefix);
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Attr a = nameSpaceSymbTable.a(AnonymousClass001.A0C(it));
                if (a != null) {
                    sortedSet.add(a);
                }
            }
        }
        return sortedSet.iterator();
    }

    public void a(XMLSignatureInput xMLSignatureInput) {
        Document a;
        if (xMLSignatureInput.j && !this.b.isEmpty()) {
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
