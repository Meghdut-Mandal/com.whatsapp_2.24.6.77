package org.apache.xml.security.c14n.implementations;

import X.AnonymousClass001;
import X.C165587tf;
import X.C165607th;
import X.C36441kJ;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.CanonicalizerSpi;
import org.apache.xml.security.c14n.helper.AttrCompare;
import org.apache.xml.security.signature.NodeFilter;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.UnsyncByteArrayOutputStream;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.SAXException;

public abstract class CanonicalizerBase extends CanonicalizerSpi {
    public static final byte[] b = {63, 62};
    public static final byte[] c = {60, 63};
    public static final byte[] d = {45, 45, 62};
    public static final byte[] e = {60, 33, 45, 45};
    public static final byte[] f = {38, 35, 120, 65, 59};
    public static final AttrCompare g = new AttrCompare();
    public static final byte[] h = {61, 34};
    public static final Attr i;
    public static final byte[] o = {38, 35, 120, 57, 59};
    public static final byte[] p = {38, 113, 117, 111, 116, 59};
    public static final byte[] q = {38, 35, 120, 68, 59};
    public static final byte[] r = {38, 103, 116, 59};
    public static final byte[] s = {38, 108, 116, 59};
    public static final byte[] t = {60, 47};
    public static final byte[] u = {38, 97, 109, 112, 59};
    public List j;
    public boolean k;
    public Set l = null;
    public Node m = null;
    public OutputStream n = new UnsyncByteArrayOutputStream();

    static {
        try {
            Attr createAttributeNS = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument().createAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns");
            i = createAttributeNS;
            createAttributeNS.setValue("");
        } catch (Exception e2) {
            throw C165587tf.A0f(e2, "Unable to create nullNode", C165607th.A0x());
        }
    }

    public CanonicalizerBase(boolean z) {
        this.k = z;
    }

    public static final void a(String str, OutputStream outputStream) {
        byte[] bArr;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != 13) {
                if (charAt == '&') {
                    bArr = u;
                } else if (charAt == '<') {
                    bArr = s;
                } else if (charAt == '>') {
                    bArr = r;
                } else if (charAt < 128) {
                    outputStream.write(charAt);
                } else {
                    UtfHelpper.a(charAt, outputStream);
                }
                outputStream.write(bArr);
            } else {
                bArr = q;
                outputStream.write(bArr);
            }
        }
    }

    public static final void a(String str, String str2, OutputStream outputStream, Map map) {
        byte[] bArr;
        outputStream.write(32);
        UtfHelpper.a(str, outputStream, map);
        outputStream.write(h);
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str2.charAt(i2);
            if (charAt != 9) {
                if (charAt == 10) {
                    bArr = f;
                } else if (charAt == 13) {
                    bArr = q;
                } else if (charAt == '\"') {
                    bArr = p;
                } else if (charAt == '&') {
                    bArr = u;
                } else if (charAt == '<') {
                    bArr = s;
                } else if (charAt < 128) {
                    outputStream.write(charAt);
                } else {
                    UtfHelpper.a(charAt, outputStream);
                }
                outputStream.write(bArr);
            } else {
                bArr = o;
                outputStream.write(bArr);
            }
            i2 = i3;
        }
        outputStream.write(34);
    }

    public static final void a(Comment comment, OutputStream outputStream, int i2) {
        if (i2 == 1) {
            outputStream.write(10);
        }
        outputStream.write(e);
        String data = comment.getData();
        int length = data.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = data.charAt(i3);
            if (charAt == 13) {
                outputStream.write(q);
            } else if (charAt < 128) {
                outputStream.write(charAt);
            } else {
                UtfHelpper.a(charAt, outputStream);
            }
        }
        outputStream.write(d);
        if (i2 == -1) {
            outputStream.write(10);
        }
    }

    public static final void a(ProcessingInstruction processingInstruction, OutputStream outputStream, int i2) {
        if (i2 == 1) {
            outputStream.write(10);
        }
        outputStream.write(c);
        String target = processingInstruction.getTarget();
        int length = target.length();
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = target.charAt(i4);
            if (charAt == 13) {
                outputStream.write(q);
            } else if (charAt < 128) {
                outputStream.write(charAt);
            } else {
                UtfHelpper.a(charAt, outputStream);
            }
        }
        String data = processingInstruction.getData();
        int length2 = data.length();
        if (length2 > 0) {
            outputStream.write(32);
            do {
                char charAt2 = data.charAt(i3);
                if (charAt2 == 13) {
                    outputStream.write(q);
                } else {
                    UtfHelpper.a(charAt2, outputStream);
                }
                i3++;
            } while (i3 < length2);
        }
        outputStream.write(b);
        if (i2 == -1) {
            outputStream.write(10);
        }
    }

    public int a(Node node, int i2) {
        List<NodeFilter> list = this.j;
        if (list != null) {
            for (NodeFilter a : list) {
                int a2 = a.a(node, i2);
                if (a2 != 1) {
                    return a2;
                }
            }
        }
        Set set = this.l;
        return (set == null || set.contains(node)) ? 1 : 0;
    }

    public abstract Iterator a(Element element, NameSpaceSymbTable nameSpaceSymbTable);

    public void a(OutputStream outputStream) {
        this.n = outputStream;
    }

    public abstract void a(XMLSignatureInput xMLSignatureInput);

    public byte[] a(Set set) {
        this.l = set;
        return d(XMLUtils.a(set));
    }

    public byte[] a(Node node) {
        return a(node, (Node) null);
    }

    public int b(Node node) {
        List<NodeFilter> list = this.j;
        if (list != null) {
            for (NodeFilter a : list) {
                int a2 = a.a(node);
                if (a2 != 1) {
                    return a2;
                }
            }
        }
        Set set = this.l;
        return (set == null || set.contains(node)) ? 1 : 0;
    }

    public abstract Iterator b(Element element, NameSpaceSymbTable nameSpaceSymbTable);

    public void c(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        if (element.hasAttributes()) {
            NamedNodeMap attributes = element.getAttributes();
            int length = attributes.getLength();
            for (int i2 = 0; i2 < length; i2++) {
                Attr attr = (Attr) attributes.item(i2);
                if ("http://www.w3.org/2000/xmlns/".equals(attr.getNamespaceURI())) {
                    String localName = attr.getLocalName();
                    String nodeValue = attr.getNodeValue();
                    if (!"xml".equals(localName) || !"http://www.w3.org/XML/1998/namespace".equals(nodeValue)) {
                        nameSpaceSymbTable.a(localName, nodeValue, attr);
                    }
                }
            }
        }
    }

    public boolean c(Node node) {
        List<NodeFilter> list = this.j;
        if (list != null) {
            for (NodeFilter a : list) {
                if (a.a(node) != 1) {
                    return false;
                }
            }
        }
        Set set = this.l;
        return set == null || set.contains(node);
    }

    public final void d(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        ArrayList A14 = C36441kJ.A14(10);
        Node parentNode = element.getParentNode();
        if (parentNode != null && 1 == parentNode.getNodeType()) {
            do {
                A14.add(parentNode);
                parentNode = parentNode.getParentNode();
                if (parentNode == null || 1 != parentNode.getNodeType()) {
                    ListIterator listIterator = A14.listIterator(A14.size());
                }
                A14.add(parentNode);
                parentNode = parentNode.getParentNode();
                break;
            } while (1 != parentNode.getNodeType());
            ListIterator listIterator2 = A14.listIterator(A14.size());
            while (listIterator2.hasPrevious()) {
                c((Element) listIterator2.previous(), nameSpaceSymbTable);
            }
            Attr b2 = nameSpaceSymbTable.b("xmlns");
            if (b2 != null && "".equals(b2.getValue())) {
                nameSpaceSymbTable.b("xmlns", "", i);
            }
        }
    }

    public final void b(Node node, Node node2) {
        boolean z;
        String str;
        int i2 = -1;
        if (b(node) != -1) {
            NameSpaceSymbTable nameSpaceSymbTable = new NameSpaceSymbTable();
            if (node != null && 1 == node.getNodeType()) {
                d((Element) node, nameSpaceSymbTable);
            }
            OutputStream outputStream = this.n;
            HashMap A0J = AnonymousClass001.A0J();
            Element element = null;
            Node node3 = null;
            int i3 = -1;
            while (true) {
                switch (node.getNodeType()) {
                    case 1:
                        Element element2 = (Element) node;
                        int a = a(node, nameSpaceSymbTable.c.size());
                        if (a == i2) {
                            node = node.getNextSibling();
                        } else {
                            if (a == 1) {
                                z = true;
                                nameSpaceSymbTable.a();
                                outputStream.write(60);
                                str = element2.getTagName();
                                UtfHelpper.a(str, outputStream, A0J);
                            } else {
                                z = false;
                                nameSpaceSymbTable.c();
                                str = null;
                            }
                            Iterator b2 = b(element2, nameSpaceSymbTable);
                            if (b2 != null) {
                                while (b2.hasNext()) {
                                    Node node4 = (Node) b2.next();
                                    a(node4.getNodeName(), node4.getNodeValue(), outputStream, (Map) A0J);
                                }
                            }
                            if (z) {
                                outputStream.write(62);
                            }
                            Node firstChild = node.getFirstChild();
                            if (firstChild == null) {
                                if (z) {
                                    outputStream.write(t);
                                    UtfHelpper.a(str, outputStream, A0J);
                                    outputStream.write(62);
                                    nameSpaceSymbTable.b();
                                } else {
                                    nameSpaceSymbTable.d();
                                }
                                if (element != null) {
                                    node = node.getNextSibling();
                                } else {
                                    return;
                                }
                            } else {
                                node = firstChild;
                                element = element2;
                            }
                        }
                        i3 = 0;
                        break;
                    case 2:
                    case 6:
                    case 12:
                        throw new CanonicalizationException("empty");
                    case 3:
                    case 4:
                        if (c(node)) {
                            a(node.getNodeValue(), outputStream);
                            while (true) {
                                node = node.getNextSibling();
                                if (node != null && (node.getNodeType() == 3 || node.getNodeType() == 4)) {
                                    a(node.getNodeValue(), outputStream);
                                    node3 = node.getNextSibling();
                                }
                            }
                        }
                        break;
                    case 7:
                        if (c(node)) {
                            a((ProcessingInstruction) node, outputStream, i3);
                            break;
                        }
                        break;
                    case 8:
                        if (this.k && a(node, nameSpaceSymbTable.c.size()) == 1) {
                            a((Comment) node, outputStream, i3);
                            break;
                        }
                    case 9:
                    case 11:
                        nameSpaceSymbTable.a();
                        node = node.getFirstChild();
                        break;
                }
                node = node3;
                while (node == null) {
                    if (element != null) {
                        if (c(element)) {
                            outputStream.write(t);
                            UtfHelpper.a(element.getTagName(), outputStream, A0J);
                            outputStream.write(62);
                            nameSpaceSymbTable.b();
                        } else {
                            nameSpaceSymbTable.d();
                        }
                        if (element != node2) {
                            node = element.getNextSibling();
                            element = element.getParentNode();
                            if (element == null || 1 != element.getNodeType()) {
                                element = null;
                                i3 = 1;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                node3 = node.getNextSibling();
                i2 = -1;
            }
        }
    }

    public final void a(Node node, NameSpaceSymbTable nameSpaceSymbTable, Node node2, int i2) {
        int i3 = i2;
        if (b(node) != -1) {
            OutputStream outputStream = this.n;
            Node node3 = this.m;
            boolean z = this.k;
            HashMap A0J = AnonymousClass001.A0J();
            Element element = null;
            Node node4 = null;
            while (true) {
                switch (node.getNodeType()) {
                    case 1:
                        i3 = 0;
                        if (node != node3) {
                            Element element2 = (Element) node;
                            nameSpaceSymbTable.a();
                            outputStream.write(60);
                            String tagName = element2.getTagName();
                            UtfHelpper.a(tagName, outputStream, A0J);
                            Iterator a = a(element2, nameSpaceSymbTable);
                            if (a != null) {
                                while (a.hasNext()) {
                                    Node node5 = (Node) a.next();
                                    a(node5.getNodeName(), node5.getNodeValue(), outputStream, (Map) A0J);
                                }
                            }
                            outputStream.write(62);
                            Node firstChild = node.getFirstChild();
                            if (firstChild == null) {
                                outputStream.write(t);
                                UtfHelpper.a(tagName, outputStream);
                                outputStream.write(62);
                                nameSpaceSymbTable.b();
                                if (element != null) {
                                    node = node.getNextSibling();
                                    break;
                                } else {
                                    return;
                                }
                            } else {
                                node = firstChild;
                                element = element2;
                                continue;
                            }
                        }
                        break;
                    case 2:
                    case 6:
                    case 12:
                        throw new CanonicalizationException("empty");
                    case 3:
                    case 4:
                        a(node.getNodeValue(), outputStream);
                        break;
                    case 7:
                        a((ProcessingInstruction) node, outputStream, i3);
                        break;
                    case 8:
                        if (z) {
                            a((Comment) node, outputStream, i3);
                            break;
                        }
                        break;
                    case 9:
                    case 11:
                        nameSpaceSymbTable.a();
                        node = node.getFirstChild();
                        break;
                }
                node = node4;
                while (node == null) {
                    if (element != null) {
                        outputStream.write(t);
                        UtfHelpper.a(element.getTagName(), outputStream, A0J);
                        outputStream.write(62);
                        nameSpaceSymbTable.b();
                        if (element != node2) {
                            node = element.getNextSibling();
                            element = element.getParentNode();
                            if (element == null || 1 != element.getNodeType()) {
                                i3 = 1;
                                element = null;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                continue;
                node4 = node.getNextSibling();
            }
        }
    }

    public byte[] a(Node node, Node node2) {
        this.m = node2;
        try {
            NameSpaceSymbTable nameSpaceSymbTable = new NameSpaceSymbTable();
            int i2 = -1;
            if (node != null && 1 == node.getNodeType()) {
                d((Element) node, nameSpaceSymbTable);
                i2 = 0;
            }
            a(node, nameSpaceSymbTable, node, i2);
            this.n.close();
            OutputStream outputStream = this.n;
            if (outputStream instanceof ByteArrayOutputStream) {
                byte[] byteArray = ((ByteArrayOutputStream) outputStream).toByteArray();
                if (!this.a) {
                    return byteArray;
                }
                ((ByteArrayOutputStream) this.n).reset();
                return byteArray;
            } else if (!(outputStream instanceof UnsyncByteArrayOutputStream)) {
                return null;
            } else {
                byte[] a = ((UnsyncByteArrayOutputStream) outputStream).a();
                if (!this.a) {
                    return a;
                }
                ((UnsyncByteArrayOutputStream) this.n).d = 0;
                return a;
            }
        } catch (UnsupportedEncodingException e2) {
            throw new CanonicalizationException("empty", (Exception) e2);
        } catch (IOException e3) {
            throw new CanonicalizationException("empty", (Exception) e3);
        }
    }

    private byte[] d(Node node) {
        try {
            b(node, node);
            this.n.close();
            OutputStream outputStream = this.n;
            if (outputStream instanceof ByteArrayOutputStream) {
                byte[] byteArray = ((ByteArrayOutputStream) outputStream).toByteArray();
                if (!this.a) {
                    return byteArray;
                }
                ((ByteArrayOutputStream) this.n).reset();
                return byteArray;
            } else if (!(outputStream instanceof UnsyncByteArrayOutputStream)) {
                return null;
            } else {
                byte[] a = ((UnsyncByteArrayOutputStream) outputStream).a();
                if (!this.a) {
                    return a;
                }
                ((UnsyncByteArrayOutputStream) this.n).d = 0;
                return a;
            }
        } catch (UnsupportedEncodingException e2) {
            throw new CanonicalizationException("empty", (Exception) e2);
        } catch (IOException e3) {
            throw new CanonicalizationException("empty", (Exception) e3);
        }
    }

    public byte[] b(XMLSignatureInput xMLSignatureInput) {
        try {
            if (xMLSignatureInput.f) {
                this.k = false;
            }
            if (xMLSignatureInput.h()) {
                return a(xMLSignatureInput.e());
            }
            if (xMLSignatureInput.g()) {
                return a(xMLSignatureInput.d, xMLSignatureInput.e);
            }
            if (!xMLSignatureInput.f()) {
                return null;
            }
            this.j = xMLSignatureInput.i;
            a(xMLSignatureInput);
            Node node = xMLSignatureInput.d;
            if (node != null) {
                return d(node);
            }
            return a(xMLSignatureInput.b(false));
        } catch (CanonicalizationException e2) {
            throw new CanonicalizationException("empty", (Exception) e2);
        } catch (ParserConfigurationException e3) {
            throw new CanonicalizationException("empty", (Exception) e3);
        } catch (IOException e4) {
            throw new CanonicalizationException("empty", (Exception) e4);
        } catch (SAXException e5) {
            throw new CanonicalizationException("empty", (Exception) e5);
        }
    }
}
